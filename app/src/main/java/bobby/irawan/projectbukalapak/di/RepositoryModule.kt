package bobby.irawan.projectbukalapak.di

import bobby.irawan.projectbukalapak.repository.Repository
import bobby.irawan.projectbukalapak.repository.RepositoryContract
import org.koin.dsl.module

/**
 * Created by bobbyirawan09 on 14/05/20.
 */

val repositoryModule = module {

    single<RepositoryContract> {
        Repository(get())
    }

}