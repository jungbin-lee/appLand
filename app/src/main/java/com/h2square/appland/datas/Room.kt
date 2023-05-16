package com.h2square.appland.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

class Room(
    val price :Int,
    val address:String,
    val floor:Int,
    val discription:String
) : Serializable {
//직렬화
    fun getFormattedPrice():String{
        if (this.price>=10000){
            val uk = this.price/10000
            val rest = this.price%10000
            return "${uk}억${NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}"
        }else{
            val  rest = this.price%10000
            return "${NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)}"
        }

    }

    fun getFormattedFloor(): String{
        if (this.floor>=1 ){
            return "${this.floor}층"
        }
        else if (this.floor==0){
            return "반지하"
        }else{
            return "지하${-this.floor}층"
        }
    }
}