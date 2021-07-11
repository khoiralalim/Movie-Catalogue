package com.alimmanurung.moviecatalogues1.ui.tvshow

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.alimmanurung.moviecatalogues1.R
import com.alimmanurung.moviecatalogues1.data.TvShowEntity
import com.alimmanurung.moviecatalogues1.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.fragment_t_v_shows.*

class TvShowFragment : Fragment(), TvShowFragmentCallback {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_t_v_shows, container, false)
    }

    @SuppressLint("FragmentLiveDataObserve")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity != null) {

            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[TvShowViewModel::class.java]

//            val tvshows = viewModel.getTvShows()

            val adapter = TvShowAdapter(this)
            progress_bar.visibility = View.VISIBLE
            viewModel.getTvShows().observe(this, Observer{ tvshows ->
                progress_bar.visibility = View.GONE
                adapter.setTvShows(tvshows)
                adapter.notifyDataSetChanged()
            })

            with(rv_tvshow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = adapter
            }
        }
    }

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onShareClick(tvshow: TvShowEntity) {
        if (activity != null) {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(activity!!)
                .setType(mimeType)
                .setChooserTitle("Bagikan Film ini sekarang.")
                .setText(resources.getString(R.string.share_text, tvshow.title))
                .startChooser()
        }
    }
}