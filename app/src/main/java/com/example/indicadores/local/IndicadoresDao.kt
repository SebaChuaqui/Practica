package com.example.indicadores.local

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface IndicadoresDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAllIndicadores(mList: List<IndicadoresEntity>)

    @Query("SELECT *FROM indicadores_table")
    fun showAllIndicadores(): LiveData<List<IndicadoresEntity>>

    @Query("SELECT * FROM indicadores_table WHERE id =:mId" )
    fun showOnIndicadoresById(mId: Int): LiveData<IndicadoresEntity>

}