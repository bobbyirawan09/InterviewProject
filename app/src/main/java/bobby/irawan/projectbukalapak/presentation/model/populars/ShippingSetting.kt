package bobby.irawan.projectbukalapak.presentation.model.populars

data class ShippingSetting(
    val allowed_courier: List<String>,
    val discount_amount: Int
)