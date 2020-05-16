package bobby.irawan.projectbukalapak.model

/**
 * Created by bobbyirawan09 on 16/05/20.
 */
data class CategoriesModelView (
    var status: String? = "",
    var categories: List<CategoryModelView>? = listOf(),
    var message: String? = ""
)