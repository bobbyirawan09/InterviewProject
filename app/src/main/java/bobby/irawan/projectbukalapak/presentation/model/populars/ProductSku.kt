package bobby.irawan.projectbukalapak.presentation.model.populars

data class ProductSku(
    val deal_info: DealInfo,
    val deal_request_state: String,
    val id: Long,
    val image_ids: List<Int>,
    val images: List<String>,
    val is_default: Int,
    val new_address: NewAddress,
    val new_image_ids: List<Long>,
    val price: Int,
    val sku_name: String,
    val small_images: List<String>,
    val state: String,
    val stock: Int,
    val variant: List<Variant>,
    val variant_name: String
)