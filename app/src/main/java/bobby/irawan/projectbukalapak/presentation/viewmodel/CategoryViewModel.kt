package bobby.irawan.projectbukalapak.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import bobby.irawan.projectbukalapak.data.HomeAPIService
import bobby.irawan.projectbukalapak.presentation.model.categories.CategoriesModelView

class CategoryViewModel(private val apiService: HomeAPIService) : ViewModel() {

    private val _categoriesLiveData = MutableLiveData<CategoriesModelView>()
    val categoriesLiveData: LiveData<CategoriesModelView>
        get() = _categoriesLiveData
}
