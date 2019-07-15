package com.example.xpush;

import android.util.Log;

import com.example.component_base.interface_custom.IComponentCManager;

/**
 * Created by weijianqiang
 * On 2019/7/15
 * Description:
 */
public class Component_C_mamager implements IComponentCManager {

    private static final String TAG = "Component_C_mamager";
    private static Component_C_mamager component_c_mamager;
    private Component_C_mamager(){}
    
    public static Component_C_mamager getInstance(){
        if (component_c_mamager == null){
            synchronized (Component_C_mamager.class){
                if (component_c_mamager == null){
                    component_c_mamager = new Component_C_mamager();
                }
            }
        }
        return component_c_mamager;
    }
    
    @Override
    public IComponentCManager init() {
        return getInstance();
    }

    @Override
    public void setContent(String content) {
        Log.d(TAG, "setContent: ");
    }

    @Override
    public void show() {
        Log.d(TAG, "show: ");
    }

    @Override
    public void hide() {

    }
}
