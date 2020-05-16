package bobby.irawan.projectbukalapak.model

/**
 * Created by bobbyirawan09 on 16/05/20.
 */
data class Product(
    var name: String? = "",
    var price: String? = "",
    var images: List<Any>? = listOf(),
    var rating: Rating? = null,
    var seller_positive_feedback: Int? = 0,
    var seller_negative_feedback: Int? = 0
)

data class Rating(
    var average_rate: String? = "",
    var user_count: String? = ""
)