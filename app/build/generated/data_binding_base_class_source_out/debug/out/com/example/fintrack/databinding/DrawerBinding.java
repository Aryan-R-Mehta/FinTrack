// Generated by view binder compiler. Do not edit!
package com.example.fintrack.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fintrack.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DrawerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView Aboutus;

  @NonNull
  public final TextView ChangePass;

  @NonNull
  public final TextView Contactus;

  @NonNull
  public final LinearLayout drawer;

  @NonNull
  public final LinearLayout lnProfile;

  @NonNull
  public final TextView logout;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final TextView txtName;

  @NonNull
  public final TextView txthome;

  private DrawerBinding(@NonNull LinearLayout rootView, @NonNull TextView Aboutus,
      @NonNull TextView ChangePass, @NonNull TextView Contactus, @NonNull LinearLayout drawer,
      @NonNull LinearLayout lnProfile, @NonNull TextView logout,
      @NonNull CircleImageView profileImage, @NonNull TextView txtName, @NonNull TextView txthome) {
    this.rootView = rootView;
    this.Aboutus = Aboutus;
    this.ChangePass = ChangePass;
    this.Contactus = Contactus;
    this.drawer = drawer;
    this.lnProfile = lnProfile;
    this.logout = logout;
    this.profileImage = profileImage;
    this.txtName = txtName;
    this.txthome = txthome;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DrawerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DrawerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.drawer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DrawerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Aboutus;
      TextView Aboutus = ViewBindings.findChildViewById(rootView, id);
      if (Aboutus == null) {
        break missingId;
      }

      id = R.id.ChangePass;
      TextView ChangePass = ViewBindings.findChildViewById(rootView, id);
      if (ChangePass == null) {
        break missingId;
      }

      id = R.id.Contactus;
      TextView Contactus = ViewBindings.findChildViewById(rootView, id);
      if (Contactus == null) {
        break missingId;
      }

      LinearLayout drawer = (LinearLayout) rootView;

      id = R.id.lnProfile;
      LinearLayout lnProfile = ViewBindings.findChildViewById(rootView, id);
      if (lnProfile == null) {
        break missingId;
      }

      id = R.id.logout;
      TextView logout = ViewBindings.findChildViewById(rootView, id);
      if (logout == null) {
        break missingId;
      }

      id = R.id.profile_image;
      CircleImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.txtName;
      TextView txtName = ViewBindings.findChildViewById(rootView, id);
      if (txtName == null) {
        break missingId;
      }

      id = R.id.txthome;
      TextView txthome = ViewBindings.findChildViewById(rootView, id);
      if (txthome == null) {
        break missingId;
      }

      return new DrawerBinding((LinearLayout) rootView, Aboutus, ChangePass, Contactus, drawer,
          lnProfile, logout, profileImage, txtName, txthome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
