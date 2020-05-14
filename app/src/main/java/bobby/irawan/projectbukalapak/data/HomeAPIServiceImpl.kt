package bobby.irawan.projectbukalapak.data

import bobby.irawan.projectbukalapak.presentation.model.categories.CategoriesModelView
import bobby.irawan.projectbukalapak.presentation.model.flashbanner.FlashBannerModelView
import bobby.irawan.projectbukalapak.presentation.model.populars.PopularsModelView
import bobby.irawan.projectbukalapak.presentation.model.promobanner.PromoBannersModelView
import bobby.irawan.projectbukalapak.util.ApiUtils

/**
 * Created by bobbyirawan09 on 14/05/20.
 */
class HomeAPIServiceImpl(): HomeAPIService {

    val homeApi = ApiUtils.getRetrofitInstance().create(HomeAPI::class.java)

    override suspend fun getFlashBanner(): FlashBannerModelView {
        return homeApi.getFlashBanner()
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