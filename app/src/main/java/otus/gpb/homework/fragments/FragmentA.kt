package otus.gpb.homework.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentA : Fragment() {

    private lateinit var viewModel: ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var views = inflater.inflate(R.layout.fragment_, container, false)

        var bu : Button = views.findViewById(R.id.buttonToFragmentAA)
        bu.setOnClickListener{
            val fragmentA = FragmentAA(ColorGenerator.generateColor())
            parentFragmentManager.beginTransaction()
                .replace(R.id.frameLayout,fragmentA)
                .addToBackStack("fragmentA")
                .commit()
        }
        return views
    }


}