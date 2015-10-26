package com.meirco.libtesting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.meirco.amodule.ModuleActivity;

public class AppActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_activity);
        findViewById(R.id.button).setOnClickListener(new ButtonClickListener());
        compile err
    }

    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            launchModuleActivity();
        }
    }

    private void launchModuleActivity() {
        Intent intent = new Intent(this, ModuleActivity.class);
        startActivity(intent);
    }

}
