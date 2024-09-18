package com.naufal.recycleview.Model

import android.speech.ModelDownloadListener
import com.naufal.recycleview.R

class modelbuah {
    data class ModelBuah(
        val image: Int, val deskripsi: String
    )

    object Mocklist {
        fun getModel(): List<ModelBuah> {
            val itemModel1 = ModelBuah(
                R.drawable.apple,
                "apple",
            )
            val itemModel2 = ModelBuah(
                R.drawable.grapes,
                "Anggur",
            )
            val itemModel3 = ModelBuah(
                R.drawable.orange,
                "Jeruk",
            )
            val itemModel4 = ModelBuah(
                R.drawable.pear,
                "Pir",
            )
            val itemModel5 = ModelBuah(
                R.drawable.strawberry,
                "Strobery",
            )

            val itemList: ArrayList<ModelBuah> = ArrayList()
            itemList.add(itemModel1)
            itemList.add(itemModel2)
            itemList.add(itemModel3)
            itemList.add(itemModel4)
            itemList.add(itemModel5)

            return itemList
        }
    }
}
