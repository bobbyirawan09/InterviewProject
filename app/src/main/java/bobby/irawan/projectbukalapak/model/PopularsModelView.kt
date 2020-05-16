package bobby.irawan.projectbukalapak.model

/**
 * Created by bobbyirawan09 on 16/05/20.
 */
data class PopularsModelView(
    var status: String? = "",
    var populars: List<PopularModelView>? = listOf(),
    var message: String? = ""
)