package bobby.irawan.projectbukalapak.model

/**
 * Created by bobbyirawan09 on 16/05/20.
 */
data class PopularModelView (
    var title: String? = "",
    var icon_url: String? = "",
    var products: List<Product> = listOf()
)