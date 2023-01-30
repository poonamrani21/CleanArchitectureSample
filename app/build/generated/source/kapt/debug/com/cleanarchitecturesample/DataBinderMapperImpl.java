package com.cleanarchitecturesample;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.cleanarchitecturesample.databinding.ActivityDashboardBindingImpl;
import com.cleanarchitecturesample.databinding.ActivityLoginBindingImpl;
import com.cleanarchitecturesample.databinding.ActivityRegisterBindingImpl;
import com.cleanarchitecturesample.databinding.ItemRowLayoutBindingImpl;
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
  private static final int LAYOUT_ACTIVITYDASHBOARD = 1;

  private static final int LAYOUT_ACTIVITYLOGIN = 2;

  private static final int LAYOUT_ACTIVITYREGISTER = 3;

  private static final int LAYOUT_ITEMROWLAYOUT = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cleanarchitecturesample.R.layout.activity_dashboard, LAYOUT_ACTIVITYDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cleanarchitecturesample.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cleanarchitecturesample.R.layout.activity_register, LAYOUT_ACTIVITYREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cleanarchitecturesample.R.layout.item_row_layout, LAYOUT_ITEMROWLAYOUT);
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
        case  LAYOUT_ACTIVITYDASHBOARD: {
          if ("layout/activity_dashboard_0".equals(tag)) {
            return new ActivityDashboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_dashboard is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREGISTER: {
          if ("layout/activity_register_0".equals(tag)) {
            return new ActivityRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_register is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMROWLAYOUT: {
          if ("layout/item_row_layout_0".equals(tag)) {
            return new ItemRowLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_row_layout is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "loginViewModel");
      sKeys.put(2, "registrationViewModel");
      sKeys.put(3, "restaurant");
      sKeys.put(4, "user");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_dashboard_0", com.cleanarchitecturesample.R.layout.activity_dashboard);
      sKeys.put("layout/activity_login_0", com.cleanarchitecturesample.R.layout.activity_login);
      sKeys.put("layout/activity_register_0", com.cleanarchitecturesample.R.layout.activity_register);
      sKeys.put("layout/item_row_layout_0", com.cleanarchitecturesample.R.layout.item_row_layout);
    }
  }
}
