package com.gidsor.bookstore.data.network

import android.os.AsyncTask
import org.json.JSONObject

class BookTask : AsyncTask<String, Void, JSONObject>() {
    override fun doInBackground(vararg params: String): JSONObject {
        return HTTPRequestAPI.book(params[0], params[1])
    }
}