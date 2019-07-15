package com.example.librarytwo;

import com.example.component_base.UserBean;
import com.example.component_base.interface_custom.IComponentBManager;

/**
 * Created by weijianqiang
 * On 2019/7/10
 * Description:
 */
public class ComponentBManager implements IComponentBManager {
    private static final String TAG = "ComponentBManager";
    private static ComponentBManager componentBManager;
    private ComponentBManager(){}

    public static ComponentBManager getInstance(){
        if (componentBManager == null){
            synchronized (ComponentBManager.class){
                if (componentBManager == null){
                    componentBManager = new ComponentBManager();
                }
            }
        }
        return componentBManager;
    }

    private UserBean getUserBeanFromComponentB(){
        UserBean userBean = new UserBean("ComponentB",28,190f);
        return userBean;
    }

    @Override
    public UserBean show() {
        return getUserBeanFromComponentB();
    }

    @Override
    public void set(UserBean userBean) {

    }
}
