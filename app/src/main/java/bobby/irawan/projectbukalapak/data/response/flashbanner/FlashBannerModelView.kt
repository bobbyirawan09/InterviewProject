package bobby.irawan.projectbukalapak.data.response.flashbanner

data class FlashBannerModelView(
    val bannerModelViews: List<BannerModelView>,
    val message: Any,
    val status: String
)