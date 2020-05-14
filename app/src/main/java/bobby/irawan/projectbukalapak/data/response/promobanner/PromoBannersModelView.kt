package bobby.irawan.projectbukalapak.data.response.promobanner

data class PromoBannersModelView(
    val message: Any,
    val promo_bannerModelViews: List<PromoBannerModelView>,
    val status: String
)