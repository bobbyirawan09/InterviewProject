package bobby.irawan.projectbukalapak.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import bobby.irawan.projectbukalapak.presentation.model.flashbanner.FlashBannerModelView
import bobby.irawan.projectbukalapak.repository.RepositoryContract
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * Created by bobbyirawan09 on 14/05/20.
 */
class HomeViewModel(private val repository: RepositoryContract) : ViewModel() {

    private lateinit var flashBanner: FlashBannerModelView

    private val _flashBannerLiveData = MutableLiveData<FlashBannerModelView>()
    val newsLiveData: LiveData<FlashBannerModelView>
        get() = _flashBannerLiveData

    fun getFlashBannerData() {
        viewModelScope.launch(Dispatchers.IO) {
            flashBanner = repository.getFlashBanner()
            withContext(Dispatchers.Main) {
                _flashBannerLiveData.value = flashBanner
            }
        }
    }
}