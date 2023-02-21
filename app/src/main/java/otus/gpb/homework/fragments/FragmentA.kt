package otus.gpb.homework.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.OnBackPressedCallback

class FragmentA : Fragment() {

    private lateinit var viewModel: ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var views = inflater.inflate(R.layout.fragment_, container, false)

        return views
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    if (parentFragmentManager.backStackEntryCount > 1) {
                        parentFragmentManager.popBackStack()
                    } else {
                        requireActivity().finish()
                    }
                }
            }
        )

        var bu : Button = view.findViewById(R.id.buttonToFragmentAA)
        bu.setOnClickListener{
            val fragmentA = FragmentAA(ColorGenerator.generateColor())
            parentFragmentManager.beginTransaction()
                .replace(R.id.frameLayout,fragmentA)
                .addToBackStack("fragmentA")
                .commit()
        }
    }


}