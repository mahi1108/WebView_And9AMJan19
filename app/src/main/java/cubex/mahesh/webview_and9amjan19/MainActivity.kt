package cubex.mahesh.webview_and9amjan19

import android.app.ProgressDialog
import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pDialog = ProgressDialog(this@MainActivity)
        pDialog.setTitle("Message")
        pDialog.setMessage("Please wait page is loading...")
        wview.webViewClient = object:WebViewClient(){
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                pDialog.show()
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                pDialog.dismiss()
            }
        } // WebView Client
        wview.settings.javaScriptEnabled = true
        wview.settings.builtInZoomControls = true

        search.setOnClickListener {
            wview.loadUrl(et1.text.toString())
        }
        fb.setOnClickListener {
            wview.loadUrl("http://www.facebook.com")
        }
        google.setOnClickListener {

            wview.loadUrl("http://www.google.com")
        }
        you.setOnClickListener {

            wview.loadUrl("http://www.youtube.com")
        }
        html.setOnClickListener {
            wview.addJavascriptInterface(this@MainActivity,
                "and9amjan19")
            wview.loadUrl("file:///android_asset/login.html")

        }

    }  // onCreate

        @JavascriptInterface
        fun login(email:String, pass:String)
        {
            Toast.makeText(this@MainActivity,
                email+"\n"+pass,Toast.LENGTH_LONG).show()
        }


}

