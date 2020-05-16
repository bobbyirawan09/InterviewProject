package bobby.irawan.projectbukalapak.model

/**
 * Created by bobbyirawan09 on 16/05/20.
 */
data class Product(
    var name: String? = "",
    var deal_info: DealInfo? = null,
    var images: List<Any>? = listOf(),
    var rating: Rating? = null,
    var seller_positive_feedback: Int? = 0,
    var seller_negative_feedback: Int? = 0
)

data class DealInfo(
    var original_price: Int? = 0,
    var discount_price: Int? = 0
)

data class Rating(
    var average_rate: String? = "",
    var user_count: String? = ""
)