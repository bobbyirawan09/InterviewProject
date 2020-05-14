package bobby.irawan.projectbukalapak.presentation.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import bobby.irawan.projectbukalapak.R
import bobby.irawan.projectbukalapak.presentation.model.flashbanner.FlashBannerModelView

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
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return data.bannerModelViews.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}