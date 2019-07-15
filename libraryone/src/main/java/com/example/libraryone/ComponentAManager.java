package com.example.libraryone;

import android.util.Log;

import com.example.component_base.UserBean;
import com.example.component_base.interface_custom.IComponentAManager;

/**
 * Created by weijianqiang
 * On 2019/7/10
 * Description:
 */
public class ComponentAManager implements IComponentAManager {

    private static final String TAG = "ComponentAManager";
    private static ComponentAManager componentAManager;
    private ComponentAManager(){}
    public static ComponentAManager getInstance(){
        if (componentAManager == null){
            synchronized (ComponentAManager.class){
                if (componentAManager == null){
                    componentAManager = new ComponentAManager();
                }
            }
        }
        return componentAManager;
    }
    
    private UserBean getUserBeanFromComponentA(){
        Log.d(TAG, "getUserBeanFromComponentA: ");
        UserBean userBean = new UserBean("ComponentA",18,180.7f);
        return userBean;
    }

    @Override
    public UserBean show() {
        Log.d(TAG, "show: ");
        return getUserBeanFromComponentA();
    }

    @Override
    public void set(UserBean userBean) {

    }
}
