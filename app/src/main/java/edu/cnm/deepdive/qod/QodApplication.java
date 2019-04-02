package edu.cnm.deepdive.qod;

import android.app.Application;

public class QodApplication extends Application {

  private static QodApplication instance = null;

  @Override
  public void onCreate() {
    super.onCreate();
    instance = this;
  }

  public static QodApplication getInstance() {
    return instance;
  }

}
