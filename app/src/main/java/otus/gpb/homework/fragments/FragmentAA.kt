package otus.gpb.homework.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentAA(color: Int) : Fragment() {

    private lateinit var viewModel: FragmentAViewModel
    private val a = color

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var views = inflater.inflate(R.layout.fragment_fragment_a, container, false)
        var bu : Button = views.findViewById(R.id.toFragmentab)
        bu.setOnClickListener{
            val fragmentAB = FragmentAB(ColorGenerator.generateColor())
            parentFragmentManager.beginTransaction()
                .replace(R.id.frameLayout,fragmentAB)
                .addToBackStack("fragmentAB")
                .commit()
        }
        var fragmentAA : View = views.findViewById(R.id.fragmentAA)
        fragmentAA.setBackgroundColor(a)
        return views
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentAViewModel::class.java)
        // TODO: Use the ViewModel
    }

}