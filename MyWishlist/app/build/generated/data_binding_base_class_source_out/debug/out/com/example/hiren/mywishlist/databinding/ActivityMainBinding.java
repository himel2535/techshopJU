// Generated by view binder compiler. Do not edit!
package com.example.hiren.mywishlist.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.viewbinding.ViewBindings;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.example.hiren.mywishlist.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RecyclerView rec;

  @NonNull
  public final Button wishBtn;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull RecyclerView rec,
      @NonNull Button wishBtn) {
    this.rootView = rootView;
    this.rec = rec;
    this.wishBtn = wishBtn;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rec;
      RecyclerView rec = ViewBindings.findChildViewById(rootView, id);
      if (rec == null) {
        break missingId;
      }

      id = R.id.wish_btn;
      Button wishBtn = ViewBindings.findChildViewById(rootView, id);
      if (wishBtn == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, rec, wishBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
