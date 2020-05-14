package bobby.irawan.projectbukalapak.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import bobby.irawan.projectbukalapak.data.HomeAPIService
import bobby.irawan.projectbukalapak.presentation.model.promobanner.PromoBannersModelView

class PromoViewModel(private val apiService: HomeAPIService) : ViewModel() {

    private val _promosLiveData = MutableLiveData<PromoBannersModelView>()
    val newsLiveData: LiveData<PromoBannersModelView>
        get() = _promosLiveData
}
