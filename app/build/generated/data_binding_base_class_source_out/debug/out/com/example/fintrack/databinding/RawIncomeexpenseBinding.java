// Generated by view binder compiler. Do not edit!
package com.example.fintrack.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fintrack.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RawIncomeexpenseBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgIcon;

  @NonNull
  public final TextView txtName;

  private RawIncomeexpenseBinding(@NonNull LinearLayout rootView, @NonNull ImageView imgIcon,
      @NonNull TextView txtName) {
    this.rootView = rootView;
    this.imgIcon = imgIcon;
    this.txtName = txtName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RawIncomeexpenseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RawIncomeexpenseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.raw_incomeexpense, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RawIncomeexpenseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgIcon;
      ImageView imgIcon = ViewBindings.findChildViewById(rootView, id);
      if (imgIcon == null) {
        break missingId;
      }

      id = R.id.txtName;
      TextView txtName = ViewBindings.findChildViewById(rootView, id);
      if (txtName == null) {
        break missingId;
      }

      return new RawIncomeexpenseBinding((LinearLayout) rootView, imgIcon, txtName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
