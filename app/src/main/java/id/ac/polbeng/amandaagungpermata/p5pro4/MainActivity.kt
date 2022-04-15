package id.ac.polbeng.amandaagungpermata.p5pro4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val mData = editText.text.toString()
            val mIntent = Intent(this@MainActivity, SecondActivity::class.java)
            mIntent.putExtra("main_activity_data", mData)
            startActivity(mIntent)
        }
    }
}