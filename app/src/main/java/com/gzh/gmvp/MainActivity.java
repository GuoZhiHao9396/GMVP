package com.gzh.gmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.gzh.gmvp.presenter.MainActivityPresenter;
import com.gzh.gmvp.view.IMainActivity;

public class MainActivity extends AppCompatActivity implements IMainActivity {
    Button mButton;
    EditText mEd_account;
    EditText mEd_password;
    MainActivityPresenter mMainActivityPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.btn);
        mEd_account = (EditText) findViewById(R.id.ed_account);
        mEd_password = (EditText) findViewById(R.id.ed_password);
        mMainActivityPresenter = new MainActivityPresenter(this);
        //登录
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainActivityPresenter.Login();
            }
        });
    }

    @Override
    public String getAccount() {
        return mEd_account.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return mEd_password.getText().toString().trim();
    }

    @Override
    public void loginSuccessResult() {
        Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginErrorResult(String result) {
        Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
    }
}
