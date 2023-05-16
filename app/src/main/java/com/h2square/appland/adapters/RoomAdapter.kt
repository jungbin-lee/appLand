package com.h2square.appland.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.h2square.appland.R
import com.h2square.appland.datas.Room
import java.util.ArrayList

class RoomAdapter(val mContext: Context,
                  val resId:Int,
                  val mList:ArrayList<Room>) :ArrayAdapter<Room>(mContext,resId,mList) {

    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow =convertView
        if (tempRow==null){
            tempRow =inflater.inflate(R.layout.room_list,null)
        }
        val row = tempRow!!

        val roomData = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressTxt =row.findViewById<TextView>(R.id.addressTxt)
        val descriptionTxt =row.findViewById<TextView>(R.id.descriptionTxt)

        descriptionTxt.text= roomData.discription
        addressTxt.text = roomData.address

        return row
    }
}