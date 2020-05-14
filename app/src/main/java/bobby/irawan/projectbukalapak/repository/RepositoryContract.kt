package bobby.irawan.projectbukalapak.repository

/**
 * Created by bobbyirawan09 on 14/05/20.
 */
interface RepositoryContract {

    suspend fun getFlashBanner()

    suspend fun getCategories()

    suspend fun getPromoBanners()

    suspend fun getPopulars()

}