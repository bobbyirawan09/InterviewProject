package bobby.irawan.projectbukalapak.data.response.populars

data class SellerVoucher(
    val amount: Int,
    val campaign_code: String,
    val fixed_price_setting: Any,
    val label: Any,
    val min_purchase: Int,
    val percentage_setting: Any,
    val premium_voucher_type: String,
    val shipping_setting: ShippingSetting
)