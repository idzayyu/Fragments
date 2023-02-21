package otus.gpb.homework.fragments

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.OnBackPressedDispatcher
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bu :Button  = findViewById(R.id.button)
        bu.setOnClickListener{
            val fragmentA = FragmentA()
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout,fragmentA)
                .addToBackStack("fragmentA")
                .commit()
        }

        val goToTask :Button  = findViewById(R.id.goToTask)
        goToTask.setOnClickListener{
            val myIntent = Intent(this, ActivityTask2::class.java)
            this.startActivity(myIntent)
        }

        OnBackPressedDispatcher()
    }



}