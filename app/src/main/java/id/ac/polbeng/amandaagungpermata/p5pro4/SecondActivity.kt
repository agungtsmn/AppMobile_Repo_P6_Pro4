package id.ac.polbeng.amandaagungpermata.p5pro4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val mData = intent.getStringExtra("main_activity_data")
        textView.text = mData
    }
}