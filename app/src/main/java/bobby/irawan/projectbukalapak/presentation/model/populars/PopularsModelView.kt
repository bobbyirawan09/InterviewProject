package bobby.irawan.projectbukalapak.presentation.model.populars

data class PopularsModelView(
    val message: Any,
    val popularModelViews: List<PopularModelView>,
    val status: String
)