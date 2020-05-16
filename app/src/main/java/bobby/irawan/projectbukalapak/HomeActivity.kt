package bobby.irawan.projectbukalapak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import bobby.irawan.projectbukalapak.data.MyServiceContract
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.coroutines.*
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.android.inject

class HomeActivity() : AppCompatActivity() {

    val service: MyServiceContract by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        CoroutineScope(Dispatchers.IO).launch {
            val result = service?.getFlashBannerData()
            val result2 = service?.getCategoyData()
            val result3 = service?.getPromoBannerData()
            val result4 = service.getPopularData()
            withContext(Dispatchers.Main) {
                val adapter = FlashBannerAdapter()
                adapter.setData(result.banners ?: listOf())
                recycler_view_flash_banner.setHasFixedSize(true)
                recycler_view_flash_banner.layoutManager = LinearLayoutManager(this@HomeActivity, LinearLayoutManager.HORIZONTAL, false)
                recycler_view_flash_banner.adapter = adapter
                indicator.attachTo(recycler_view_flash_banner,true)
                indicator.numberOfIndicators = result.banners?.size ?: 0

                val adapter2 = CategoriesAdapter()
                adapter2.setData(result2.categories ?: listOf())
                recycler_view_categories.setHasFixedSize(true)
                recycler_view_categories.layoutManager = GridLayoutManager(this@HomeActivity, 2, RecyclerView.HORIZONTAL, false)
                recycler_view_categories.adapter = adapter2

                val adapter3 = PromoBannersAdapter()
                adapter3.setData(result3.promo_banners ?: listOf())
                recycler_view_promo_banner.setHasFixedSize(true)
                recycler_view_promo_banner.layoutManager = LinearLayoutManager(this@HomeActivity, LinearLayoutManager.HORIZONTAL, false)
                recycler_view_promo_banner.adapter = adapter3

                val adapter4 = PopularAdapter()
                adapter4.setData(result4.populars ?: listOf())
                recycler_view_popular.setHasFixedSize(true)
                recycler_view_popular.layoutManager = LinearLayoutManager(this@HomeActivity, LinearLayoutManager.VERTICAL, false)
                recycler_view_popular.adapter = adapter4
            }
        }
    }
}
