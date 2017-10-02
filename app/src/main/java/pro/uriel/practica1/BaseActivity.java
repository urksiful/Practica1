package pro.uriel.practica1;

import android.os.Bundle;
import android.support.annotation.LayoutRes;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.ButterKnife;


//import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {
    private Toolbar  toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResID());
        bindButterKnife();

        onPrepareToolBar();
        initView();
    }

    @LayoutRes
    protected abstract int getLayoutResID();
    // Aquí se configura el toolbar si es que existe en el layout
    private void onPrepareToolBar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");

        if(toolbar!=null){
            setSupportActionBar(toolbar);
        }
    }

    /**
     * La vista fue creada
     */
    protected void initView(){
    }

    private void bindButterKnife(){
        ButterKnife.bind(this);
    }

    public Toolbar getToolbar() {
        return toolbar;
    }
}
