package taskcom.android.manish.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import taskcom.android.manish.databindingdemo.databinding.ActivityMainBinding;

/**
 * Created by Manish Kumar on 10/14/2018
 */
public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(activityMainBinding.etName.getText().toString().trim())) {
                    Toast.makeText(MainActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(activityMainBinding.etAge.getText().toString().trim())) {
                    Toast.makeText(MainActivity.this, "Please enter your age", Toast.LENGTH_SHORT).show();
                } else {
                    String name = activityMainBinding.etName.getText().toString().trim();
                    String age = activityMainBinding.etAge.getText().toString().trim();
                    Toast.makeText(MainActivity.this, "" + name + " -- " + age, Toast.LENGTH_SHORT).show();

                    activityMainBinding.etName.setText("");
                    activityMainBinding.etAge.setText("");
                }
            }
        });
    }
}
