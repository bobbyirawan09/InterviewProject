package bobby.irawan.projectbukalapak.data.response.categories

data class CategoriesModelView(
    val categoryModelViews: List<CategoryModelView>,
    val message: Any,
    val status: String
)