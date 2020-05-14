package bobby.irawan.projectbukalapak.data

import bobby.irawan.projectbukalapak.presentation.model.categories.CategoriesModelView
import bobby.irawan.projectbukalapak.presentation.model.flashbanner.FlashBannerModelView
import bobby.irawan.projectbukalapak.presentation.model.populars.PopularsModelView
import bobby.irawan.projectbukalapak.presentation.model.promobanner.PromoBannersModelView
import bobby.irawan.projectbukalapak.util.ApiUtils
import bobby.irawan.projectbukalapak.util.Constant.BASE_API

/**
 * Created by bobbyirawan09 on 14/05/20.
 */
class HomeAPIServiceImpl() : HomeAPIService {

    val homeApi = ApiUtils.getRetrofitInstance().create(HomeAPI::class.java)

    override suspend fun getFlashBanner(): FlashBannerModelView {
        var result = FlashBannerModelView(listOf(), "", "")
        try {
            result = homeApi.getFlashBanner(BASE_API + "flash_banners.json").execute().body()!!
        } catch (e: Exception) {
            //Do nothing
        }
        return result
    }

    override suspend fun getCategories(): CategoriesModelView {
        var result = CategoriesModelView(listOf(), "", "")
        try {
            result = homeApi.getCategories(BASE_API + "categories.json").execute().body()!!
        } catch (e: Exception) {
            //Do nothing
        }
        return result
    }

    override suspend fun getPromoBanners(): PromoBannersModelView {
        var result = PromoBannersModelView("", listOf(), "")
        try {
            result = homeApi.getPromoBanners(BASE_API + "products/promo_banners.json?version=2")
                .execute().body()!!
        } catch (e: Exception) {
            //Do nothing
        }
        return result
    }

    override suspend fun getPopulars(): PopularsModelView {
        var result = PopularsModelView("", listOf(), "")
        try {
            result = homeApi.getPopulars(BASE_API + "populars_v2.json").execute().body()!!
        } catch (e: Exception) {
            //Do nothing
        }
        return result
    }
}