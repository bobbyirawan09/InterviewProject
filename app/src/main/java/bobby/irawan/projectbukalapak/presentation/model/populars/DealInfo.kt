package bobby.irawan.projectbukalapak.presentation.model.populars

data class DealInfo(
    val discount_date: String,
    val discount_expired_date: String,
    val discount_percentage: Int,
    val discount_price: Int,
    val original_price: Int,
    val state: String
)