package otus.gpb.homework.fragments

import android.content.res.Configuration
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentManager

class FragmentBB : Fragment() {


    private lateinit var viewModel: FragmentBBViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val views = inflater.inflate(R.layout.fragment_fragment_b_b, container, false)
        views.setBackgroundColor(ColorGenerator.generateColor())
        val sendcolor: Button = views.findViewById(R.id.sendcolor)
        sendcolor.setOnClickListener {
            val result = Bundle()
            result.putInt("ColorSend",ColorGenerator.generateColor())
            parentFragmentManager.setFragmentResult("BB_result", result)

        }
        return views
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentBBViewModel::class.java)
        // TODO: Use the ViewModel
    }

}