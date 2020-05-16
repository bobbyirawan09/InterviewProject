package bobby.irawan.projectbukalapak.model

/**
 * Created by bobbyirawan09 on 16/05/20.
 */
data class PromoBannersModelView(
    var status: String? = "",
    var promo_banners: List<PromoBannerModelView>? = listOf(),
    var message: String? = ""
)