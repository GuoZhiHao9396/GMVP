package com.gzh.gmvp.view;

/**
 * @ClassName: IMainActivity
 * @Description: 描述类的作用
 * @author: GZH
 * @date: 2017/2/16 15:36
 */
public interface IMainActivity {
    String getAccount();

    String getPassword();

    void loginSuccessResult();

    void loginErrorResult(String result);
}
