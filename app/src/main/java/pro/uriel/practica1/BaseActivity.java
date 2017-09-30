package pro.uriel.practica1;

import android.os.Bundle;
import android.support.annotation.LayoutRes;

import android.support.v7.app.AppCompatActivity;


import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResID());
        bindButterKnife();
        initView();
    }

    @LayoutRes
    protected abstract int getLayoutResID();

    /**
     * La vista fue creada
     */
    protected void initView(){
    }

    private void bindButterKnife(){
        ButterKnife.bind(this);
    }


}
