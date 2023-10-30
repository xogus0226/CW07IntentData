package kr.ac.kumoh.s20180074.cw07intentdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20180074.cw07intentdata.databinding.ActivityImageBinding

class ImageActivity : AppCompatActivity() {
    private lateinit var _main: ActivityImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _main = ActivityImageBinding.inflate(layoutInflater)
        setContentView(_main.root)

        val res = when(intent.getStringExtra(MainActivity.KEY_NAME)){
            MainActivity.DOG1 -> R.drawable.dog1
            MainActivity.DOG2 -> R.drawable.dog2
            else -> R.drawable.ic_launcher_foreground
        }
        _main.image.setImageResource(res)
    }
}