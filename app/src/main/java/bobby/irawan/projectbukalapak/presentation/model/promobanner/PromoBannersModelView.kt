package bobby.irawan.projectbukalapak.presentation.model.promobanner

data class PromoBannersModelView(
    val message: Any,
    val promo_bannerModelViews: List<PromoBannerModelView>,
    val status: String
)