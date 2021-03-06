package bobby.irawan.projectbukalapak.util

import bobby.irawan.projectbukalapak.util.Constant.BASE_API
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by bobbyirawan09 on 14/05/20.
 */

object ApiUtils {

    private var httpClientApi: Retrofit? = null

    fun getRetrofitInstance(): Retrofit {
        if (httpClientApi == null) {
            httpClientApi =
                Retrofit.Builder().baseUrl(BASE_API)
                    .addCallAdapterFactory(CoroutineCallAdapterFactory())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(getHttpClient())
                    .build()
        }
        return httpClientApi as Retrofit
    }

    private fun getHttpClient(): OkHttpClient {
        return OkHttpClient().newBuilder()
            .addInterceptor(HttpLoggingInterceptor())
            .connectTimeout(30, TimeUnit.SECONDS)
            .callTimeout(30, TimeUnit.SECONDS)
            .build()
    }
}