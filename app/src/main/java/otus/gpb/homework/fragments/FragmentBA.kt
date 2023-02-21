package otus.gpb.homework.fragments

import android.content.res.Configuration
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentBA : Fragment() {


    private lateinit var viewModel: FragmentBViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val views = inflater.inflate(R.layout.fragment_fragment_b, container, false)

        return views
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            val buttonOpenFragmentbb: Button = view.findViewById(R.id.button4open_fragmentbb)
            buttonOpenFragmentbb.setOnClickListener {
                val fragmentBB = FragmentBB()
                parentFragmentManager.beginTransaction()
                    .replace(R.id.frameLayoutTask2, fragmentBB)
                    .addToBackStack("fragmentBB")
                    .commit()

            }
        }
            parentFragmentManager.setFragmentResultListener(
                "BB_result",
                this
            ) { _, result ->
                view.setBackgroundColor(result.getInt("ColorSend"))

            }

    }
}

