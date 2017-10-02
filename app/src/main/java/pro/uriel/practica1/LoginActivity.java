package pro.uriel.practica1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LoginActivity extends BaseActivity {

    private static final String TAG = LoginActivity.class.getName() ;
    private Toolbar toolbar;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        super.initView();
    }

    private void initConfigToolbar(){
        toolbar = getToolbar();
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_keyboard_arrow_left_white_24dp));
    }
}
