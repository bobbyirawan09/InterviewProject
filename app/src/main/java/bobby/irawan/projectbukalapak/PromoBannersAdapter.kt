package bobby.irawan.projectbukalapak

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import bobby.irawan.projectbukalapak.model.PromoBannerModelView
import coil.api.load
import kotlinx.android.synthetic.main.row_promo_banner.view.*

/**
 * Created by bobbyirawan09 on 16/05/20.
 */
class PromoBannersAdapter: RecyclerView.Adapter<PromoBannersAdapter.MyViewHolder>() {

    private var data: List<PromoBannerModelView> = listOf()

    fun setData(data: List<PromoBannerModelView>) {
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_promo_banner, parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(data[position])
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(banner: PromoBannerModelView) {
            itemView.image_view_promo_banner.load(banner.image)
            itemView.text_view_name_promo.text = banner.description
        }
    }
}