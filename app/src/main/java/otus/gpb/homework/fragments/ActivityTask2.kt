package otus.gpb.homework.fragments

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityTask2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task2)
        if (resources.configuration.orientation== Configuration.ORIENTATION_LANDSCAPE){
            val fragmentBAL = FragmentBA()
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayoutTask2L1,fragmentBAL)
                .addToBackStack("fragmentBAL")
                .commit()

            val fragmentBB = FragmentBB()
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayoutTask2L2,fragmentBB)
                .addToBackStack("fragmentBB")
                .commit()
        }
        else{

            val fragmentBA = FragmentBA()
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayoutTask2,fragmentBA)
                .addToBackStack("fragmentBA")
                .commit()

        }
    }
}