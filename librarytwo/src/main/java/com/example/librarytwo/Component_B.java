package com.example.librarytwo;

import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.CCResult;
import com.billy.cc.core.component.IComponent;
import com.example.component_base.ComponentConst;

/**
 * Created by weijianqiang
 * On 2019/7/10
 * Description:
 */
public class Component_B implements IComponent {
    @Override
    public String getName() {
        return ComponentConst.Component_B.NAME;
    }

    @Override
    public boolean onCall(CC cc) {
        String action = cc.getActionName();
        switch (action){
            case ComponentConst.Component_B.Action.SHOW:
                ComponentBManager componentBManager = ComponentBManager.getInstance();
                CC.sendCCResult(cc.getCallId(),CCResult.successWithNoKey(componentBManager));
                break;
            case ComponentConst.Component_B.Action.HIDE:
                break;
        }
        return true;
    }
}
