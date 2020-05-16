package bobby.irawan.projectbukalapak.model

/**
 * Created by bobbyirawan09 on 16/05/20.
 */
data class BannerModelView (
    var description: String? = "",
    var image: String? = "",
    var order: Int? = 0,
    var info: InfoBannerModelView? = null
)