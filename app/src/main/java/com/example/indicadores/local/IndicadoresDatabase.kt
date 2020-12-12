package com.example.indicadores.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [IndicadoresEntity::class], version = 1)
@TypeConverters(HeightTypeConverter::class)
abstract class IndicadoresDatabase: RoomDatabase() {

    abstract fun indicadoresDao(): IndicadoresDao

    companion object{
        @Volatile
        private var INSTANCE : IndicadoresDatabase? = null

        fun getDatabase(context: Context): IndicadoresDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(context,
                IndicadoresDatabase::class.java,
                "indicadoresDb")
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }

}