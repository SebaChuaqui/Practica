package com.example.indicadores.local

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "indicadores_table")
data class IndicadoresEntity(@PrimaryKey @NonNull val id: Int,
                             val bitcoincodigo: String,
                             val bitcoinfecha: String,
                             val bitcoinnombre: String,
                             val unidaddemedida: String,
                             val bitcoinvalor: String

) 