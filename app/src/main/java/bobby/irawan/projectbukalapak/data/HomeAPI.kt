package bobby.irawan.projectbukalapak.data

import retrofit2.http.GET

/**
 * Created by bobbyirawan09 on 14/05/20.
 */
interface HomeAPI {

    @GET("flash_banners.json")
    suspend fun getFlashBanners()

    @GET("categories.json")
    suspend fun getCategories()

    @GET("products/promo_banners.json?version=2")
    suspend fun getPromoBanners()

    @GET("populars_v2.json")
    suspend fun getPopulars()

}