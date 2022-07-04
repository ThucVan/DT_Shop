package dt.shop.dt_shop.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import dt.shop.dt_shop.R

class register_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val tv_dangnhap = findViewById<TextView>(R.id.tv_dangnhap);
        tv_dangnhap.setOnClickListener{
            startActivity(Intent(this@register_activity, Login_acitivity::class.java));
        }
    }
}