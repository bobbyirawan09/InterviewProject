package bobby.irawan.projectbukalapak.data

import bobby.irawan.projectbukalapak.presentation.model.categories.CategoriesModelView
import bobby.irawan.projectbukalapak.presentation.model.flashbanner.FlashBannerModelView
import bobby.irawan.projectbukalapak.presentation.model.populars.PopularsModelView
import bobby.irawan.projectbukalapak.presentation.model.promobanner.PromoBannersModelView
import retrofit2.http.GET
import retrofit2.http.Url

/**
 * Created by bobbyirawan09 on 14/05/20.
 */
interface HomeAPI {

    @GET
    suspend fun getFlashBanner(@Url url: String): FlashBannerModelView

    @GET("categories.json")
    suspend fun getCategories(): CategoriesModelView

    @GET("products/promo_banners.json?version=2")
    suspend fun getPromoBanners(): PromoBannersModelView

    @GET("populars_v2.json")
    suspend fun getPopulars(): PopularsModelView

}