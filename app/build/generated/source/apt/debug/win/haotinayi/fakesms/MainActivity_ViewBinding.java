// Generated code from Butter Knife. Do not modify!
package win.haotinayi.fakesms;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  @UiThread
  public MainActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.mEtPhone = Utils.findRequiredViewAsType(source, R.id.et_phone, "field 'mEtPhone'", TextInputEditText.class);
    target.mEtTime = Utils.findRequiredViewAsType(source, R.id.et_time, "field 'mEtTime'", TextInputEditText.class);
    target.mEtContext = Utils.findRequiredViewAsType(source, R.id.et_context, "field 'mEtContext'", TextInputEditText.class);
    target.mInsertSms = Utils.findRequiredViewAsType(source, R.id.insert_sms, "field 'mInsertSms'", Button.class);
    target.mTilTime = Utils.findRequiredViewAsType(source, R.id.til_time, "field 'mTilTime'", TextInputLayout.class);
    target.mTilContent = Utils.findRequiredViewAsType(source, R.id.til_content, "field 'mTilContent'", TextInputLayout.class);
    target.mBtn = Utils.findRequiredViewAsType(source, R.id.btn, "field 'mBtn'", Button.class);
    target.mTvHint = Utils.findRequiredViewAsType(source, R.id.tv_hint, "field 'mTvHint'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mEtPhone = null;
    target.mEtTime = null;
    target.mEtContext = null;
    target.mInsertSms = null;
    target.mTilTime = null;
    target.mTilContent = null;
    target.mBtn = null;
    target.mTvHint = null;

    this.target = null;
  }
}
