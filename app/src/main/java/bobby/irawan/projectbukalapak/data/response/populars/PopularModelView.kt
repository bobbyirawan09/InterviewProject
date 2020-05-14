package bobby.irawan.projectbukalapak.data.response.populars

data class PopularModelView(
    val campaign_id: Int,
    val icon_url: String,
    val products: List<Product>,
    val title: String
)