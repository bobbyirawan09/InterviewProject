package bobby.irawan.projectbukalapak.repository

import bobby.irawan.projectbukalapak.presentation.model.categories.CategoriesModelView
import bobby.irawan.projectbukalapak.presentation.model.flashbanner.FlashBannerModelView
import bobby.irawan.projectbukalapak.presentation.model.populars.PopularsModelView
import bobby.irawan.projectbukalapak.presentation.model.promobanner.PromoBannersModelView

/**
 * Created by bobbyirawan09 on 14/05/20.
 */
interface RepositoryContract {

    suspend fun getFlashBanner(): FlashBannerModelView

    suspend fun getCategories(): CategoriesModelView

    suspend fun getPromoBanners(): PromoBannersModelView

    suspend fun getPopulars(): PopularsModelView

}