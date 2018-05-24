package com.gidsor.bookstore.data.network

import android.os.AsyncTask
import org.json.JSONObject

class RegistrationTask : AsyncTask<String, Void, JSONObject>() {
    override fun doInBackground(vararg params: String): JSONObject {
        return HTTPRequestAPI.registration(params[0], params[1])
    }
}