package youtubemp3downloader.amaarquadri.gmail.com.youtubemp3downloader;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class YouTubeMP3Downloader {
    public static void download(Context context, String youTubeURL, String downloadDirectory) {
        RequestQueue queue = Volley.newRequestQueue(context);
        StringRequest request = new StringRequest(Request.Method.GET, "http://convert2mp3.net/en/", response -> {

        }, volleyError -> {

        });
        queue.add(request);
    }
}
