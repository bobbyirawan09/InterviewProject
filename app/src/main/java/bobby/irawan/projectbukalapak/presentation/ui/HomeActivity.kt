package bobby.irawan.projectbukalapak.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import bobby.irawan.projectbukalapak.R
import bobby.irawan.projectbukalapak.presentation.adapter.FlashBannerAdapter
import bobby.irawan.projectbukalapak.presentation.model.flashbanner.FlashBannerModelView
import bobby.irawan.projectbukalapak.presentation.viewmodel.CategoryViewModel
import bobby.irawan.projectbukalapak.presentation.viewmodel.HomeViewModel
import kotlinx.android.synthetic.main.activity_home.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeActivity : AppCompatActivity() {

    private val viewModel: HomeViewModel by viewModel()
    private val adapter= FlashBannerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        viewModel.getFlashBannerData()

        observe()
    }

    private fun observe() {
        viewModel.flashBannerLiveData.observe(
            this,
            Observer { data -> setFlashBanner(data) }
        )
    }

    private fun setFlashBanner(data: FlashBannerModelView) {
        adapter.setData(data)
        recycler_view_flash_banner.setHasFixedSize(true)
        recycler_view_flash_banner.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recycler_view_flash_banner.adapter = adapter
    }
}
