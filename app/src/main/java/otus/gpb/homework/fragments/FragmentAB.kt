package otus.gpb.homework.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class FragmentAB(var color: Int) : Fragment() {

    private lateinit var viewModel: FragmentABViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var views = inflater.inflate(R.layout.fragment_fragment_a_b, container, false)

        var textView : View = views.findViewById(R.id.trrtg)
        textView.setBackgroundColor(color)
        return views
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentABViewModel::class.java)
        // TODO: Use the ViewModel
    }

}