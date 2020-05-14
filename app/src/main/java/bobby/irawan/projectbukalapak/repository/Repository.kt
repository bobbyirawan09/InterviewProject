package bobby.irawan.projectbukalapak.repository

import bobby.irawan.projectbukalapak.data.HomeAPIService

/**
 * Created by bobbyirawan09 on 14/05/20.
 */
class Repository(private val api: HomeAPIService): RepositoryContract {
    override suspend fun getFlashBanner() {
        TODO("Not yet implemented")
    }

    override suspend fun getCategories() {
        TODO("Not yet implemented")
    }

    override suspend fun getPromoBanners() {
        TODO("Not yet implemented")
    }

    override suspend fun getPopulars() {
        TODO("Not yet implemented")
    }
}