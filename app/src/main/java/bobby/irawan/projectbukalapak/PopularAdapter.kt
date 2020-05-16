package bobby.irawan.projectbukalapak

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import bobby.irawan.projectbukalapak.model.PopularModelView
import kotlinx.android.synthetic.main.row_popular.view.*

/**
 * Created by bobbyirawan09 on 16/05/20.
 */
class PopularAdapter: RecyclerView.Adapter<PopularAdapter.MyViewHolder>() {

    private var data: List<PopularModelView> = listOf()
    private lateinit var context: Context

    fun setData(data: List<PopularModelView>) {
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.row_popular, parent, false)
        context = parent.context
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(data[position], context)
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(banner: PopularModelView, context: Context) {
            itemView.text_view_label_header.text = banner.title
            val adapter = PopularDataAdapter()
            adapter.setData(banner.products)
            itemView.recycler_view_popular_data.setHasFixedSize(true)
            itemView.recycler_view_popular_data.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
            itemView.recycler_view_popular_data.adapter = adapter
        }
    }
}