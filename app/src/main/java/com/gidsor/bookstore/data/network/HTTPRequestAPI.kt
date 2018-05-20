package com.gidsor.bookstore.data.network

import android.util.Log
import com.gidsor.bookstore.data.model.User
import com.github.kittinunf.fuel.android.extension.responseJson
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result
import org.apache.commons.lang.StringEscapeUtils
import org.json.JSONArray
import org.json.JSONObject

class HTTPRequestAPI {
    companion object {
        fun status(): JSONObject {
            val url = "http://212.47.240.244/api/status"
            var data = JSONObject()
            val (request, response, result) = url.httpGet().responseString()
            when (result) {
                is Result.Failure -> {
                    Log.i("HTTPRequestAPI", result.getException().toString())
                }
                is Result.Success -> {
                    data = JSONObject(result.get())
                    Log.i("HTTPRequestAPI", data.toString())
                }
            }
            return data
        }

        fun login(email: String, password: String): JSONObject {
            val url = "http://212.47.240.244/api/login?login=$email&password=$password"
            var data = JSONObject()
            val (request, response, result) = url.httpGet().responseString()
            when (result) {
                is Result.Failure -> {
                    Log.i("HTTPRequestAPI", result.getException().toString())
                }
                is Result.Success -> {
                    data = JSONObject(result.get())
                    Log.i("HTTPRequestAPI", data.toString())
                }
            }
            return data
        }
    }
}