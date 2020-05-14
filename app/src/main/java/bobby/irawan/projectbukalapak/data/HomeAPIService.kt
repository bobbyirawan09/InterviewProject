package bobby.irawan.projectbukalapak.data

/**
 * Created by bobbyirawan09 on 14/05/20.
 */
interface HomeAPIService {

    suspend fun getFlashBanner()

    suspend fun getCategories()

    suspend fun getPromoBanners()

    suspend fun getPopulars()

}