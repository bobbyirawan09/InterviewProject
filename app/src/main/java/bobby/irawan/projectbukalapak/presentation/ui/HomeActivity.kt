package bobby.irawan.projectbukalapak.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bobby.irawan.projectbukalapak.R
import bobby.irawan.projectbukalapak.presentation.viewmodel.CategoryViewModel
import bobby.irawan.projectbukalapak.presentation.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeActivity : AppCompatActivity() {

    private val viewModel: HomeViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}
