package bobby.irawan.projectbukalapak.data

import bobby.irawan.projectbukalapak.model.CategoriesModelView
import bobby.irawan.projectbukalapak.model.FlashBannerModelView
import bobby.irawan.projectbukalapak.model.PopularsModelView
import bobby.irawan.projectbukalapak.model.PromoBannersModelView
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Url

/**
 * Created by bobbyirawan09 on 16/05/20.
 */
interface MyService {

    @GET
    suspend fun getFlashBannerData(@Url url: String): FlashBannerModelView

    @GET
    suspend fun getCategoryData(@Url url: String): CategoriesModelView

    @GET
    suspend fun getPromoBannerData(@Url url: String): PromoBannersModelView

    @GET
    suspend fun getPopularData(@Url url: String): PopularsModelView
}