
import com.google.gson.annotations.SerializedName

data class LibraCobre(
    @SerializedName("codigo")
    val codigo: String,
    @SerializedName("fecha")
    val fecha: String,
    @SerializedName("nombre")
    val nombre: String,
    @SerializedName("unidad_medida")
    val unidadMedida: String,
    @SerializedName("valor")
    val valor: Double
)