package bobby.irawan.projectbukalapak.presentation.model.populars

data class Installment(
    val bank_acquirer: String,
    val bank_issuer: String,
    val bank_name: String,
    val terms: List<Int>,
    val url_logo: String
)