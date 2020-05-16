package bobby.irawan.projectbukalapak

import android.graphics.Color
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import bobby.irawan.projectbukalapak.model.PopularModelView
import bobby.irawan.projectbukalapak.model.Product
import coil.api.load
import kotlinx.android.synthetic.main.row_popular.view.*
import kotlinx.android.synthetic.main.row_popular_data.view.*

/**
 * Created by bobbyirawan09 on 16/05/20.
 */
class PopularDataAdapter : RecyclerView.Adapter<PopularDataAdapter.MyViewHolder>() {

    private var data: List<Product> = listOf()

    fun setData(data: List<Product>) {
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.row_popular_data, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(data[position])
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(banner: Product) {
            val image = banner.images?.get(0) as String
            val totalFeedback =banner.rating?.user_count ?: ""
            itemView.image_view_phone.load(image)
            if (banner.deal_info?.discount_price ?: 0 > 0) {
                itemView.text_view_ori_price.visibility = View.VISIBLE
                itemView.text_view_ori_price.text = "Rp"+(banner.deal_info?.original_price ?: 0).toString()
                itemView.text_view_ori_price.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
                itemView.text_view_price.text = "Rp"+banner.deal_info?.discount_price.toString()
                itemView.text_view_price.setTextColor(Color.MAGENTA)
            } else {
                itemView.text_view_price.text = "Rp"+banner.deal_info?.original_price.toString()
            }
            itemView.text_view_desc.text = banner.name
            itemView.text_view_total_feedback.text = "(" + totalFeedback + ")"
            itemView.text_view_star.text = banner.rating?.average_rate
        }
    }
}