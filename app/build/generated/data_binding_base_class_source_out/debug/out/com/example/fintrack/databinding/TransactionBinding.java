// Generated by data binding compiler. Do not edit!
package com.example.fintrack.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.fintrack.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TransactionBinding extends ViewDataBinding {
  @NonNull
  public final ImageView Back;

  @NonNull
  public final TextView Transcation;

  @NonNull
  public final EditText amount;

  @NonNull
  public final Button btSubmit;

  @NonNull
  public final EditText calender;

  @NonNull
  public final EditText category;

  @NonNull
  public final EditText edtName;

  @NonNull
  public final RelativeLayout header;

  @NonNull
  public final ImageView imgIcon;

  protected TransactionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView Back, TextView Transcation, EditText amount, Button btSubmit, EditText calender,
      EditText category, EditText edtName, RelativeLayout header, ImageView imgIcon) {
    super(_bindingComponent, _root, _localFieldCount);
    this.Back = Back;
    this.Transcation = Transcation;
    this.amount = amount;
    this.btSubmit = btSubmit;
    this.calender = calender;
    this.category = category;
    this.edtName = edtName;
    this.header = header;
    this.imgIcon = imgIcon;
  }

  @NonNull
  public static TransactionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.transaction, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TransactionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TransactionBinding>inflateInternal(inflater, R.layout.transaction, root, attachToRoot, component);
  }

  @NonNull
  public static TransactionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.transaction, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TransactionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TransactionBinding>inflateInternal(inflater, R.layout.transaction, null, false, component);
  }

  public static TransactionBinding bind(@NonNull View view) {
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
  public static TransactionBinding bind(@NonNull View view, @Nullable Object component) {
    return (TransactionBinding)bind(component, view, R.layout.transaction);
  }
}
