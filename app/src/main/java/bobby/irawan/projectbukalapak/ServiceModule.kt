package bobby.irawan.projectbukalapak

import bobby.irawan.projectbukalapak.data.MyServiceContract
import bobby.irawan.projectbukalapak.data.MyServiceImpl
import org.koin.dsl.module

/**
 * Created by bobbyirawan09 on 16/05/20.
 */

val serviceModule = module {
    single<MyServiceContract> {
        MyServiceImpl()
    }
}

val uiModule = module {
    single {
        SomethingClass(get())
    }
}