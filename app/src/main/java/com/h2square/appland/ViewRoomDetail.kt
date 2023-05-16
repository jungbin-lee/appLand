package com.h2square.appland

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.h2square.appland.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData =intent.getSerializableExtra("room")as Room
        priceTxt.text= roomData.getFormattedPrice()
        descriptionTxt.text =roomData.discription
        addressTxt.text= roomData.address
        floorTxt.text = roomData.getFormattedFloor()


    }
}