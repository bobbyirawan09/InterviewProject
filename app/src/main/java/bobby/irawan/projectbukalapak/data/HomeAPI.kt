package bobby.irawan.projectbukalapak.data

import bobby.irawan.projectbukalapak.presentation.model.categories.CategoriesModelView
import bobby.irawan.projectbukalapak.presentation.model.flashbanner.FlashBannerModelView
import bobby.irawan.projectbukalapak.presentation.model.populars.PopularsModelView
import bobby.irawan.projectbukalapak.presentation.model.promobanner.PromoBannersModelView
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

/**
 * Created by bobbyirawan09 on 14/05/20.
 */
interface HomeAPI {

    @GET
    fun getFlashBanner(@Url url: String): Call<FlashBannerModelView>

    @GET
    fun getCategories(@Url url: String): Call<CategoriesModelView>

    @GET
    fun getPromoBanners(@Url url: String): Call<PromoBannersModelView>

    @GET
    fun getPopulars(@Url url: String): Call<PopularsModelView>

}