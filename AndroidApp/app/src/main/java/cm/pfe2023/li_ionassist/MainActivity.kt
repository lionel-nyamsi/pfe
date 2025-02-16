package cm.pfe2023.li_ionassist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {

    private lateinit var timer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timer = object : CountDownTimer(2000, 1000) {
            override fun onTick(p0: Long) {
            }

            override fun onFinish() {
                nextPage()
            }
        }

    }

    override fun onStart() {
        super.onStart()
        timer.start()
    }

    override fun onStop() {
        super.onStop()
    }

    private fun nextPage() {
        timer.cancel()
        val intent = Intent(this, ConnectionActivity()::class.java)
        startActivity(intent)
    }

}