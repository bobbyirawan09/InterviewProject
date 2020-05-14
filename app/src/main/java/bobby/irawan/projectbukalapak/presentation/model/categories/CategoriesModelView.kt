package bobby.irawan.projectbukalapak.presentation.model.categories

data class CategoriesModelView(
    val categoryModelViews: List<CategoryModelView>,
    val message: Any,
    val status: String
)