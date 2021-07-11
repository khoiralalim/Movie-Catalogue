package com.alimmanurung.moviecatalogues1.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.alimmanurung.moviecatalogues1.R
import com.alimmanurung.moviecatalogues1.data.TvShowEntity
import com.alimmanurung.moviecatalogues1.viewmodel.ViewModelFactory
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.content_detail_tvshow.*

class DetailTvShowActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TVSHOW = "extra_tvshow"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tv_show)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[DetailTvShowViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val tvshowId = extras.getString(DetailTvShowActivity.EXTRA_TVSHOW)
            if (tvshowId != null) {
                viewModel.setSelectedTvShow(tvshowId)

                progress_bar.visibility = View.VISIBLE

                viewModel.getTvShow().observe(this, Observer { tvshow ->
                    progress_bar.visibility = View.GONE
                    populateTvShow(tvshow) })
            }
        }
    }

    private fun populateTvShow(tvshowEntity: TvShowEntity) {
        text_title.text = tvshowEntity.title
        text_desc.text = tvshowEntity.overview
        text_production.text = resources.getString(R.string.production_date, tvshowEntity.production)

        Glide.with(this)
            .load(tvshowEntity.imagePath)
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error)
            )
            .into(image_poster)
    }
}