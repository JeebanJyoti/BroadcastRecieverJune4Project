package com.example.iteradmin.broadcastrecieverjune4project

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcastreciever:BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        val s:String?=p1?.action
        when(s){
            Intent.ACTION_POWER_CONNECTED->{
                Toast.makeText(p0, "charging ON", Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_POWER_DISCONNECTED->{
                Toast.makeText(p0,"charging OFF",Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_AIRPLANE_MODE_CHANGED->{
                Toast.makeText(p0,"plane mode changed",Toast.LENGTH_LONG).show()
            }
        }
    }

}