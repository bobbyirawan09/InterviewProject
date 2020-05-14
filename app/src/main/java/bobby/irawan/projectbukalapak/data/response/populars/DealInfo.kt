package bobby.irawan.projectbukalapak.data.response.populars

data class DealInfo(
    val discount_date: String,
    val discount_expired_date: String,
    val discount_percentage: Int,
    val discount_price: Int,
    val original_price: Int,
    val state: String
)