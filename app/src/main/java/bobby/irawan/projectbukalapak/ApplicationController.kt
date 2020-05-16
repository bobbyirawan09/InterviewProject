package bobby.irawan.projectbukalapak

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * Created by bobbyirawan09 on 16/05/20.
 */
class ApplicationController: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@ApplicationController)
            modules(
                listOf(
                    serviceModule,
                    uiModule
                )
            )
        }
    }

}