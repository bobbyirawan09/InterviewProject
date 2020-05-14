package bobby.irawan.projectbukalapak.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import bobby.irawan.projectbukalapak.presentation.model.promobanner.PromoBannersModelView
import bobby.irawan.projectbukalapak.repository.RepositoryContract

class PromoViewModel(private val repository: RepositoryContract) : ViewModel() {

    private val _promosLiveData = MutableLiveData<PromoBannersModelView>()
    val newsLiveData: LiveData<PromoBannersModelView>
        get() = _promosLiveData
}
