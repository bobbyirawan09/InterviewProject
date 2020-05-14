package bobby.irawan.projectbukalapak.presentation.model.categories

data class CategoryModelView(
    val children: List<ChildrenModelView>,
    val id: Int,
    val name: String,
    val revamped: Boolean,
    val url: String
)