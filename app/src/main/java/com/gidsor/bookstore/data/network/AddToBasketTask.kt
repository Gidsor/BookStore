package com.gidsor.bookstore.data.network

import android.os.AsyncTask
import com.gidsor.bookstore.data.api.HTTPRequestAPI
import org.json.JSONObject

class AddToBasketTask : AsyncTask<String, Void, JSONObject>() {
    override fun doInBackground(vararg params: String): JSONObject {
        return HTTPRequestAPI.addToBasket(params[0], params[1])
    }
}