package bobby.irawan.projectbukalapak.presentation.model.flashbanner

data class FlashBannerModelView(
    val bannerModelViews: List<BannerModelView>,
    val message: Any,
    val status: String
)