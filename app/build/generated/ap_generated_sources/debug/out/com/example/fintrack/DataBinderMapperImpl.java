package com.example.fintrack;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.fintrack.databinding.ActivityForgotscrenBindingImpl;
import com.example.fintrack.databinding.ActivityProfilescreenBindingImpl;
import com.example.fintrack.databinding.HomescreenBindingImpl;
import com.example.fintrack.databinding.IncomeBindingImpl;
import com.example.fintrack.databinding.SignupBindingImpl;
import com.example.fintrack.databinding.TransactionBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYFORGOTSCREN = 1;

  private static final int LAYOUT_ACTIVITYPROFILESCREEN = 2;

  private static final int LAYOUT_HOMESCREEN = 3;

  private static final int LAYOUT_INCOME = 4;

  private static final int LAYOUT_SIGNUP = 5;

  private static final int LAYOUT_TRANSACTION = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fintrack.R.layout.activity_forgotscren, LAYOUT_ACTIVITYFORGOTSCREN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fintrack.R.layout.activity_profilescreen, LAYOUT_ACTIVITYPROFILESCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fintrack.R.layout.homescreen, LAYOUT_HOMESCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fintrack.R.layout.income, LAYOUT_INCOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fintrack.R.layout.signup, LAYOUT_SIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fintrack.R.layout.transaction, LAYOUT_TRANSACTION);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYFORGOTSCREN: {
          if ("layout/activity_forgotscren_0".equals(tag)) {
            return new ActivityForgotscrenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_forgotscren is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPROFILESCREEN: {
          if ("layout/activity_profilescreen_0".equals(tag)) {
            return new ActivityProfilescreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_profilescreen is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMESCREEN: {
          if ("layout/homescreen_0".equals(tag)) {
            return new HomescreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for homescreen is invalid. Received: " + tag);
        }
        case  LAYOUT_INCOME: {
          if ("layout/income_0".equals(tag)) {
            return new IncomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for income is invalid. Received: " + tag);
        }
        case  LAYOUT_SIGNUP: {
          if ("layout/signup_0".equals(tag)) {
            return new SignupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for signup is invalid. Received: " + tag);
        }
        case  LAYOUT_TRANSACTION: {
          if ("layout/transaction_0".equals(tag)) {
            return new TransactionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for transaction is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_forgotscren_0", com.example.fintrack.R.layout.activity_forgotscren);
      sKeys.put("layout/activity_profilescreen_0", com.example.fintrack.R.layout.activity_profilescreen);
      sKeys.put("layout/homescreen_0", com.example.fintrack.R.layout.homescreen);
      sKeys.put("layout/income_0", com.example.fintrack.R.layout.income);
      sKeys.put("layout/signup_0", com.example.fintrack.R.layout.signup);
      sKeys.put("layout/transaction_0", com.example.fintrack.R.layout.transaction);
    }
  }
}
