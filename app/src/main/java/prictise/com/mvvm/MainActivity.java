package prictise.com.mvvm;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;

import prictise.com.mvvm.model.User;
import prictise.com.mvvm.model.UserBind;

public class MainActivity extends Activity {
    Handler mHandler = new Handler();
    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserBind userBind = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mUser = new User("张三", "123456");
        userBind.setUser(mUser);
        mUser.setImg("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1495418798,3923098729&fm=200&gp=0.jpg");

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mUser.setName("李四");
                mUser.setPassword("1234");
            }
        }, 2000);
    }
}
