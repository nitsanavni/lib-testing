package com.meirco.amodule;

import android.os.Build;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class,
        sdk = Build.VERSION_CODES.KITKAT)
public class ModuleActivityTest {

    @Test
    public void shouldShowText() {
        ModuleActivity activity = Robolectric.setupActivity(ModuleActivity.class);
        TextView v = (TextView) activity.findViewById(R.id.text);
        assertThat(v.getText().toString()).isEqualTo("module activity");
    }

}
