package pro.uriel.practica1;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LoginActivity extends BaseActivity {

    private static final String TAG = LoginActivity.class.getName() ;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_login;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "Entro al onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Entro al onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "Entro al onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "Entro al onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "Entro al onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "Entro al onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "Entro al onDestroy");
    }
}
