package cubex.mahesh.webview_and9amjan19

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wview.webViewClient = WebViewClient()

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
        html.setOnClickListener {  }

    }
}
