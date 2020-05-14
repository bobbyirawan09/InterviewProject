package bobby.irawan.projectbukalapak.data.response.flashbanner

data class BannerModelView(
    val description: String,
    val image: String,
    val infoModelView: InfoModelView,
    val open_new_window: Boolean,
    val order: Int
)