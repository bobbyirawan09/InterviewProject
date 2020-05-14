package bobby.irawan.projectbukalapak.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import bobby.irawan.projectbukalapak.presentation.model.categories.CategoriesModelView
import bobby.irawan.projectbukalapak.repository.RepositoryContract

class CategoryViewModel(private val repository: RepositoryContract) : ViewModel() {

    private val _categoriesLiveData = MutableLiveData<CategoriesModelView>()
    val categoriesLiveData: LiveData<CategoriesModelView>
        get() = _categoriesLiveData
}
