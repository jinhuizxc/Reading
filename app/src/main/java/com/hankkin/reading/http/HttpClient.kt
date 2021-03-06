package com.hankkin.reading.http

import com.hankkin.reading.common.Constant
import com.hankkin.reading.http.api.OsChinaApi
import com.hankkin.reading.http.api.ToolsApi
import com.hankkin.reading.http.api.WanAndroidApi

interface HttpClient {

    object Builder {
        fun getCommonHttp(): WanAndroidApi {
            return ApiFactory.instance.create(WanAndroidApi::class.java, Constant.WanAndroidUrl.BASE_URL)
        }

        fun getOsChinaHttp(): OsChinaApi {
            return ApiFactory.instance.create(OsChinaApi::class.java, Constant.OSChinaUrl.BASE_URL)
        }

        fun getToolsHttp(): ToolsApi {
            return ApiFactory.instance.create(ToolsApi::class.java, Constant.ToolsUrl.WEATHER_URL)
        }
    }
}