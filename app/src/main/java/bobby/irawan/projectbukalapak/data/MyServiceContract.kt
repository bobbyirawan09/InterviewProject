package bobby.irawan.projectbukalapak.data

import bobby.irawan.projectbukalapak.model.CategoriesModelView
import bobby.irawan.projectbukalapak.model.FlashBannerModelView
import bobby.irawan.projectbukalapak.model.PopularsModelView
import bobby.irawan.projectbukalapak.model.PromoBannersModelView


/**
 * Created by bobbyirawan09 on 16/05/20.
 */
interface MyServiceContract {

    suspend fun getFlashBannerData(): FlashBannerModelView

    suspend fun getCategoyData(): CategoriesModelView

    suspend fun getPromoBannerData(): PromoBannersModelView

    suspend fun getPopularData(): PopularsModelView

}