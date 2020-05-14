package bobby.irawan.projectbukalapak.presentation.model.flashbanner

data class FlashBannerModelView(
    val banners: List<BannerModelView>,
    val message: Any,
    val status: String
)