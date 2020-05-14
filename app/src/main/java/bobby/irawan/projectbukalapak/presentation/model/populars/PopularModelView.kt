package bobby.irawan.projectbukalapak.presentation.model.populars

data class PopularModelView(
    val campaign_id: Int,
    val icon_url: String,
    val products: List<Product>,
    val title: String
)