package dt.shop.dt_shop.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import dt.shop.dt_shop.R

class Login_acitivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_acitivity)

        val tv_dangki = findViewById<TextView>(R.id.tv_dangki);
        tv_dangki.setOnClickListener{
            startActivity(Intent(this@Login_acitivity, register_activity::class.java));
        }
    }
}