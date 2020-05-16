package bobby.irawan.projectbukalapak.model

/**
 * Created by bobbyirawan09 on 16/05/20.
 */
data class FlashBannerModelView (
    var status: String? = "",
    var banners: List<BannerModelView>? = listOf(),
    var message: String? = ""
)