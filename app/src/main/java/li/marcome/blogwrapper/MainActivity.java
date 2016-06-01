package li.marcome.blogwrapper;

import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    public WebView mwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = "http://html5test.com/";

        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent cti = builder.build();
        cti.launchUrl(this, Uri.parse(url));

//        mwebView = (WebView) findViewById(R.id.webView);

//        mwebView.loadUrl("http://html5test.com/");
    }
}