package prictise.com.mvvm.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.android.databinding.library.baseAdapters.BR;
import com.bumptech.glide.Glide;

public class User extends BaseObservable {
    private String name;
    private String password;
    private String img;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(prictise.com.mvvm.BR.name);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(prictise.com.mvvm.BR.password);
    }

    @BindingAdapter("bind:img")//img 是当前类的属性
    public static void getImage(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).into(view);
    }

    @Bindable
    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
        notifyPropertyChanged(prictise.com.mvvm.BR.img);
    }
}
