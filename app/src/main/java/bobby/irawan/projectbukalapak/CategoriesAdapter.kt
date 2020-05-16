package bobby.irawan.projectbukalapak

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import bobby.irawan.projectbukalapak.model.CategoryModelView
import kotlinx.android.synthetic.main.row_category.view.*

/**
 * Created by bobbyirawan09 on 16/05/20.
 */
class CategoriesAdapter: RecyclerView.Adapter<CategoriesAdapter.MyViewHolder>() {

    private var data: List<CategoryModelView> = listOf()

    fun setData(data: List<CategoryModelView>) {
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_category, parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(data[position])
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(banner: CategoryModelView) {
            itemView.text_view_name_category.text = banner.name
        }
    }
}