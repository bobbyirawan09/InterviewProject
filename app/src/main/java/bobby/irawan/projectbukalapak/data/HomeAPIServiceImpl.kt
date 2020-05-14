package bobby.irawan.projectbukalapak.data

import bobby.irawan.projectbukalapak.util.ApiUtils

/**
 * Created by bobbyirawan09 on 14/05/20.
 */
class HomeAPIServiceImpl(): HomeAPIService {

    val homeApi = ApiUtils.getRetrofitInstance().create(HomeAPI::class.java)

    override suspend fun getFlashBanner() {
        return homeApi.getFlashBanners()
    }

    override suspend fun getCategories() {
        return homeApi.getCategories()
    }

    override suspend fun getPromoBanners() {
        return homeApi.getPromoBanners()
    }

    override suspend fun getPopulars() {
        return homeApi.getPopulars()
    }
}