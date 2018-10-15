
package com.fetchsky.RNOneAudience;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import com.oneaudience.sdk.OneAudience;

public class RNOneAudienceModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNOneAudienceModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @ReactMethod
    public void init(String apiKey, Promise promise) {
        try {
          OneAudience.init(this.getCurrentActivity(), apiKey, true);
          promise.resolve(true);
        } catch (Exception e) {
            e.printStackTrace();
            promise.reject(e);
        }
    }

    @ReactMethod
    public void setEmailAddress(String emailAddress) {
        try {
            OneAudience.setEmailAddress(emailAddress);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ReactMethod
    public void setAge(int age) {
        try {
            OneAudience.setAge(age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @ReactMethod
    public void setGender(int gender) {
        try {
            OneAudience.setGender(gender);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ReactMethod
    public void optOut() {
        try {
            OneAudience.optOut();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getName() {
      return "RNOneAudience";
    }
}