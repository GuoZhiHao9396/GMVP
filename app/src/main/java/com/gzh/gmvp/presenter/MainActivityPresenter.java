package com.gzh.gmvp.presenter;

import android.text.TextUtils;

import com.gzh.gmvp.view.IMainActivity;

/**
 * @ClassName: MainActivityPresenter
 * @Description: 描述类的作用
 * @author: GZH
 * @date: 2017/2/16 15:41
 */
public class MainActivityPresenter {
    IMainActivity mIMainActivity;

    public MainActivityPresenter(IMainActivity IMainActivity) {
        mIMainActivity = IMainActivity;
    }

    public void Login() {
        String account = mIMainActivity.getAccount();
        String password = mIMainActivity.getPassword();
        if (TextUtils.isEmpty(account)) {
            mIMainActivity.loginErrorResult("账号不能为空");
        }else if(TextUtils.isEmpty(password)){
                mIMainActivity.loginErrorResult("密码不能为空");
        }else if(password.length()<6){
            mIMainActivity.loginErrorResult("密码长度需要大于6位");
        }else if("admin".equals(account)&&"123456".equals(password)){
            mIMainActivity.loginSuccessResult();
        }else{
            mIMainActivity.loginErrorResult("账号或密码不正确");
        }
    }
}
