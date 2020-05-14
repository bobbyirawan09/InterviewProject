package bobby.irawan.projectbukalapak.repository

import bobby.irawan.projectbukalapak.data.HomeAPIService
import bobby.irawan.projectbukalapak.presentation.model.categories.CategoriesModelView
import bobby.irawan.projectbukalapak.presentation.model.flashbanner.FlashBannerModelView
import bobby.irawan.projectbukalapak.presentation.model.populars.PopularsModelView
import bobby.irawan.projectbukalapak.presentation.model.promobanner.PromoBannersModelView

/**
 * Created by bobbyirawan09 on 14/05/20.
 */
class Repository(private val api: HomeAPIService): RepositoryContract {
    override suspend fun getFlashBanner(): FlashBannerModelView {
        return api.getFlashBanner()
    }

    override suspend fun getCategories(): CategoriesModelView {
        TODO("Not yet implemented")
    }

    override suspend fun getPromoBanners(): PromoBannersModelView {
        TODO("Not yet implemented")
    }

    override suspend fun getPopulars(): PopularsModelView {
        TODO("Not yet implemented")
    }
}