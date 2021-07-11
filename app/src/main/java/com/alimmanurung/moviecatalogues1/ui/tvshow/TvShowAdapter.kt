package com.alimmanurung.moviecatalogues1.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alimmanurung.moviecatalogues1.R
import com.alimmanurung.moviecatalogues1.data.TvShowEntity
import com.alimmanurung.moviecatalogues1.ui.detail.DetailTvShowActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.items_tv_show.view.*

class TvShowAdapter(private val callback: TvShowFragmentCallback) : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {

    private val listTvShow = ArrayList<TvShowEntity>()

    fun setTvShows(tvshows: List<TvShowEntity>?) {
        if (tvshows == null) return
        this.listTvShow.clear()
        this.listTvShow.addAll(tvshows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_tv_show, parent, false)
        return TvShowViewHolder(view)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvshow = listTvShow[position]
        holder.bind(tvshow)
    }

    override fun getItemCount(): Int = listTvShow.size

    inner class TvShowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(tvshow: TvShowEntity){
            with(itemView){
                tv_item_title.text = tvshow.title
                tv_item_overview.text = tvshow.overview
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailTvShowActivity::class.java)
                    intent.putExtra(DetailTvShowActivity.EXTRA_TVSHOW, tvshow.tvshowId)
                    itemView.context.startActivity(intent)
                }
                img_share.setOnClickListener { callback.onShareClick(tvshow) }
                Glide.with(itemView.context)
                    .load(tvshow.imagePath)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .into(img_poster)
            }
        }
    }
}
