package bobby.irawan.projectbukalapak.data

import bobby.irawan.projectbukalapak.presentation.model.categories.CategoriesModelView
import bobby.irawan.projectbukalapak.presentation.model.flashbanner.FlashBannerModelView
import bobby.irawan.projectbukalapak.presentation.model.populars.PopularsModelView
import bobby.irawan.projectbukalapak.presentation.model.promobanner.PromoBannerModelView
import bobby.irawan.projectbukalapak.presentation.model.promobanner.PromoBannersModelView
import bobby.irawan.projectbukalapak.presentation.viewmodel.CategoryViewModel

/**
 * Created by bobbyirawan09 on 14/05/20.
 */
interface HomeAPIService {

    suspend fun getFlashBanner(): FlashBannerModelView

    suspend fun getCategories(): CategoriesModelView

    suspend fun getPromoBanners(): PromoBannersModelView

    suspend fun getPopulars(): PopularsModelView

}