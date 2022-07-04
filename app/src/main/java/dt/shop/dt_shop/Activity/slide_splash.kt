package dt.shop.dt_shop.Activity

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ramotion.paperonboarding.PaperOnboardingFragment
import com.ramotion.paperonboarding.PaperOnboardingPage
import dt.shop.dt_shop.R

class slide_splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide_splash)

        val paperOnboardingFragment =
            PaperOnboardingFragment.newInstance(getPaperOnboardingPageData())

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.splash_slide, paperOnboardingFragment)
        fragmentTransaction.commit()

        paperOnboardingFragment.setOnRightOutListener {
            startActivity(
                Intent(
                    this@slide_splash,
                    Login_acitivity::class.java
                )
            )
        }

    }

    private fun getPaperOnboardingPageData(): ArrayList<PaperOnboardingPage>? {
        val scr1 = PaperOnboardingPage(
            "KeyBroad",
            "Chuyên bàn phím cơ giá rẻ",
            Color.parseColor("#FFFFFF"), R.drawable.keybroad, R.drawable.keybroad
        )
        val scr2 = PaperOnboardingPage(
            "KeyCap",
            "Keycap đẹp giá rẻ",
            Color.parseColor("#FFFFFF"), R.drawable.keycap, R.drawable.ic_keycap
        )
        val scr3 = PaperOnboardingPage(
            "More ....",
            "Cùng những phụ kiện không thể nào rẻ hơn",
            Color.parseColor("#FFFFFF"), R.drawable.more, R.drawable.ic_next
        )
        val elements = ArrayList<PaperOnboardingPage>()
        elements.add(scr1)
        elements.add(scr2)
        elements.add(scr3)
        return elements
    }
}