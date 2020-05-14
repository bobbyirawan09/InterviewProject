package bobby.irawan.projectbukalapak.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import bobby.irawan.projectbukalapak.R
import bobby.irawan.projectbukalapak.presentation.model.flashbanner.BannerModelView
import bobby.irawan.projectbukalapak.presentation.model.flashbanner.FlashBannerModelView
import coil.api.load


/**
 * Created by bobbyirawan09 on 14/05/20.
 */
class FlashBannerAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var data: FlashBannerModelView

    fun setData(dataBanner: FlashBannerModelView) {
        data = dataBanner
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_flash_banner, parent, false);
        return ViewHolder(view);
    }

    override fun getItemCount(): Int {
        return data.bannerModelViews.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).setImage(data.bannerModelViews[position])
    }

    internal class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageViewBanner: ImageView

        init {
            imageViewBanner = itemView.findViewById(R.id.image_view_flash_banner)
        }

        fun setImage(url: BannerModelView) {
            imageViewBanner.load(url.image)
        }
    }
}