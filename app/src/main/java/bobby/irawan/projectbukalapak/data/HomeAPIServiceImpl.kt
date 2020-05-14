package bobby.irawan.projectbukalapak.data

import bobby.irawan.projectbukalapak.presentation.model.categories.CategoriesModelView
import bobby.irawan.projectbukalapak.presentation.model.flashbanner.FlashBannerModelView
import bobby.irawan.projectbukalapak.presentation.model.populars.PopularsModelView
import bobby.irawan.projectbukalapak.presentation.model.promobanner.PromoBannersModelView
import bobby.irawan.projectbukalapak.util.ApiUtils
import bobby.irawan.projectbukalapak.util.Constant.BASE_API
import kotlinx.coroutines.*
import java.lang.Exception

/**
 * Created by bobbyirawan09 on 14/05/20.
 */
class HomeAPIServiceImpl() : HomeAPIService {

    val homeApi = ApiUtils.getRetrofitInstance().create(HomeAPI::class.java)

    override fun getFlashBanner(): FlashBannerModelView {
        return runBlocking (Dispatchers.IO) {
            var result = FlashBannerModelView(listOf(), "", "")
            try {
                result = homeApi.getFlashBanner(BASE_API + "flash_banners.json").execute().body()!!
            } catch (e: Exception) {
                //Do nothing
            }
            result
        }
    }

    override suspend fun getCategories(): CategoriesModelView {
        return homeApi.getCategories()
    }

    override suspend fun getPromoBanners(): PromoBannersModelView {
        return homeApi.getPromoBanners()
    }

    override suspend fun getPopulars(): PopularsModelView {
        return homeApi.getPopulars()
    }
}