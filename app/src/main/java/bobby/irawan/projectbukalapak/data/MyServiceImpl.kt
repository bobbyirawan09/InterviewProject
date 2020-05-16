package bobby.irawan.projectbukalapak.data


import bobby.irawan.projectbukalapak.model.CategoriesModelView
import bobby.irawan.projectbukalapak.model.FlashBannerModelView
import bobby.irawan.projectbukalapak.model.PopularsModelView
import bobby.irawan.projectbukalapak.model.PromoBannersModelView
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Url

/**
 * Created by bobbyirawan09 on 16/05/20.
 */

const val BASE_URL = "https://api.bukalapak.com/v2/"

private var httpClientApi: Retrofit? = null

fun getRetrofitInstance(): Retrofit {
    if (httpClientApi == null) {
        httpClientApi =
            Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
    return httpClientApi as Retrofit
}

class MyServiceImpl() : MyServiceContract {

    val api = getRetrofitInstance().create(MyService::class.java)

    override suspend fun getFlashBannerData(): FlashBannerModelView {
        var result = FlashBannerModelView()
        try {
            result = api.getFlashBannerData(BASE_URL + "flash_banners.json")
        } catch (e: Exception) {

        }
        return result
    }

    override suspend fun getCategoyData(): CategoriesModelView {
        var result = CategoriesModelView()
        try {
            result = api.getCategoryData(BASE_URL + "categories.json")
        } catch (e: Exception) {

        }
        return result
    }

    override suspend fun getPromoBannerData(): PromoBannersModelView {
        var result = PromoBannersModelView()
        try {
            result = api.getPromoBannerData(BASE_URL + "products/promo_banners.json?version=2")
        } catch (e: Exception) {

        }
        return result
    }

    override suspend fun getPopularData(): PopularsModelView {
        var result = PopularsModelView()
        try {
            result = api.getPopularData(BASE_URL + "products/populars_v2.json")
        } catch (e: Exception) {

        }
        return result
    }
}