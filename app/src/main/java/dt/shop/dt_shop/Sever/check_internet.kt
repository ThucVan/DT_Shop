package dt.shop.dt_shop.Sever

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import dt.shop.dt_shop.Activity.slide_splash
import dt.shop.dt_shop.R
import kotlin.system.exitProcess

class check_internet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_internet)

        if (CheckConnetion.haveNetworkConnection(applicationContext)) //neu co mang
        {
            startActivity(Intent(this@check_internet, slide_splash::class.java))
        } else {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Lỗi Mạng !!!")
                .setMessage("Vui lòng kiểm tra lại kết nối mạng của bạn !!!")
                .setPositiveButton("OK") { _: DialogInterface?, _: Int ->
                    finish()
                    finishAffinity()
                    exitProcess(0)
                }
                .setCancelable(true)
            val alertDialog = builder.create()
            alertDialog.show()
        }
    }

    object CheckConnetion {
        fun haveNetworkConnection(context: Context): Boolean {
            var wifi = false
            val mobile = false
            val cm = context.getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkInfos = cm.allNetworkInfo
            for (info in networkInfos) {
                if (info.typeName == "WIFI") if (info.isConnected) wifi = true
                if (info.typeName == "MOBILE") if (info.isConnected) wifi = true
            }
            return wifi || mobile
        }
    }
}