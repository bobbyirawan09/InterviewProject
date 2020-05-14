package bobby.irawan.projectbukalapak.data.response.populars

data class ShippingSetting(
    val allowed_courier: List<String>,
    val discount_amount: Int
)