package bobby.irawan.projectbukalapak.di

import bobby.irawan.projectbukalapak.data.HomeAPIService
import bobby.irawan.projectbukalapak.data.HomeAPIServiceImpl
import org.koin.dsl.koinApplication
import org.koin.dsl.module

/**
 * Created by bobbyirawan09 on 14/05/20.
 */

val serviceModule = module {

    single<HomeAPIService> {
        HomeAPIServiceImpl()
    }

}