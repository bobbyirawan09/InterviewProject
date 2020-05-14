package bobby.irawan.projectbukalapak.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import bobby.irawan.projectbukalapak.data.HomeAPIService
import bobby.irawan.projectbukalapak.presentation.model.flashbanner.FlashBannerModelView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * Created by bobbyirawan09 on 14/05/20.
 */
class HomeViewModel(private val apiService: HomeAPIService) : ViewModel() {

    private lateinit var flashBanner: FlashBannerModelView

    private val _flashBannerLiveData = MutableLiveData<FlashBannerModelView>()
    val flashBannerLiveData: LiveData<FlashBannerModelView>
        get() = _flashBannerLiveData

    fun getFlashBannerData() {
        viewModelScope.launch(Dispatchers.IO) {
            flashBanner = apiService.getFlashBanner()
            withContext(Dispatchers.Main) {
                _flashBannerLiveData.value = flashBanner
            }
        }
    }
}