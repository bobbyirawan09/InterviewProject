package bobby.irawan.projectbukalapak

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import bobby.irawan.projectbukalapak.model.BannerModelView
import coil.api.load
import kotlinx.android.synthetic.main.row_flash_banner.view.*

/**
 * Created by bobbyirawan09 on 16/05/20.
 */
class FlashBannerAdapter(): RecyclerView.Adapter<FlashBannerAdapter.MyViewHolder>() {

    private var data: List<BannerModelView> = listOf()

    fun setData(data: List<BannerModelView>) {
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_flash_banner, parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(data[position])
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(banner: BannerModelView) {
            itemView.image_view_flash_banner.load(banner.image)
        }
    }
}