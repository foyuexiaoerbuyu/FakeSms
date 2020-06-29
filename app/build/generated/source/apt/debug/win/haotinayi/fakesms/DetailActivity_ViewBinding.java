// Generated code from Butter Knife. Do not modify!
package win.haotinayi.fakesms;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import win.haotinayi.fakesms.view.CircleImageView;

public class DetailActivity_ViewBinding<T extends DetailActivity> implements Unbinder {
  protected T target;

  @UiThread
  public DetailActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.mActivityDetail = Utils.findRequiredViewAsType(source, R.id.activity_detail, "field 'mActivityDetail'", FrameLayout.class);
    target.mCvDesc = Utils.findRequiredViewAsType(source, R.id.cv_desc, "field 'mCvDesc'", CardView.class);
    target.mIvCircle = Utils.findRequiredViewAsType(source, R.id.iv_circle, "field 'mIvCircle'", CircleImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mActivityDetail = null;
    target.mCvDesc = null;
    target.mIvCircle = null;

    this.target = null;
  }
}
