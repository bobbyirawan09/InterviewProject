package bobby.irawan.projectbukalapak.data.response.categories

data class CategoryModelView(
    val children: List<ChildrenModelView>,
    val id: Int,
    val name: String,
    val revamped: Boolean,
    val url: String
)