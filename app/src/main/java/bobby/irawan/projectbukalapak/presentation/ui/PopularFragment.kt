package bobby.irawan.projectbukalapak.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import bobby.irawan.projectbukalapak.R
import bobby.irawan.projectbukalapak.presentation.viewmodel.PopularViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class PopularFragment : Fragment() {

    companion object {
        fun newInstance() = PopularFragment()
    }

    private val viewModel: PopularViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.popular_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}
