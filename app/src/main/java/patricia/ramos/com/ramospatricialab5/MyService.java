package patricia.ramos.com.ramospatricialab5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyService extends IntentService {
    public MyService(){
        super("patricia.ramos.com.ramospatricialab5.MyService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4ITF", "service is running...");
    }
}
