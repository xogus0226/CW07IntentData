package kr.ac.kumoh.s20180074.cw07intentdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import kr.ac.kumoh.s20180074.cw07intentdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    companion object{
        const val KEY_NAME = "dog"
        const val DOG1 = "dog1"
        const val DOG2 = "dog2"
    }
    private lateinit var _main:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_main.root)

        _main.btnDog1.setOnClickListener(this)

        _main.btnDog2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, ImageActivity::class.java)
        val value = when(v?.id){
            _main.btnDog1.id -> DOG1
            _main.btnDog2.id -> DOG2
            else -> return
        }
        intent.putExtra(KEY_NAME, value)
        startActivity(intent)
    }


}