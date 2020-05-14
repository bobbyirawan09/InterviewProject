package bobby.irawan.projectbukalapak.data.response.populars

data class PopularsModelView(
    val message: Any,
    val popularModelViews: List<PopularModelView>,
    val status: String
)