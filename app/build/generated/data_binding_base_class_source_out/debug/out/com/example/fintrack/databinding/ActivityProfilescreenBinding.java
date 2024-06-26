// Generated by data binding compiler. Do not edit!
package com.example.fintrack.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.fintrack.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityProfilescreenBinding extends ViewDataBinding {
  @NonNull
  public final TextView Profile;

  @NonNull
  public final ImageView btBack;

  @NonNull
  public final Button btnUpdate;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final EditText txtEmail;

  @NonNull
  public final EditText txtMobile;

  @NonNull
  public final EditText txtfName;

  @NonNull
  public final EditText txtlName;

  protected ActivityProfilescreenBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView Profile, ImageView btBack, Button btnUpdate, CircleImageView profileImage,
      EditText txtEmail, EditText txtMobile, EditText txtfName, EditText txtlName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.Profile = Profile;
    this.btBack = btBack;
    this.btnUpdate = btnUpdate;
    this.profileImage = profileImage;
    this.txtEmail = txtEmail;
    this.txtMobile = txtMobile;
    this.txtfName = txtfName;
    this.txtlName = txtlName;
  }

  @NonNull
  public static ActivityProfilescreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_profilescreen, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityProfilescreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityProfilescreenBinding>inflateInternal(inflater, R.layout.activity_profilescreen, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityProfilescreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_profilescreen, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityProfilescreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityProfilescreenBinding>inflateInternal(inflater, R.layout.activity_profilescreen, null, false, component);
  }

  public static ActivityProfilescreenBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityProfilescreenBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityProfilescreenBinding)bind(component, view, R.layout.activity_profilescreen);
  }
}
