package bobby.irawan.projectbukalapak.di

import bobby.irawan.projectbukalapak.presentation.viewmodel.PopularViewModel
import bobby.irawan.projectbukalapak.presentation.viewmodel.PromoViewModel
import bobby.irawan.projectbukalapak.presentation.viewmodel.CategoryViewModel
import bobby.irawan.projectbukalapak.presentation.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by bobbyirawan09 on 14/05/20.
 */

val viewModelModule = module {

    viewModel {
        CategoryViewModel(get())
    }

    viewModel {
        PopularViewModel(get())
    }

    viewModel {
        PromoViewModel(get())
    }

    viewModel {
        HomeViewModel(get())
    }

}