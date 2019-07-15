package com.example.libraryone;

import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.CCResult;
import com.billy.cc.core.component.IComponent;
import com.example.component_base.ComponentConst;

/**
 * Created by weijianqiang
 * On 2019/7/10
 * Description:
 */
public class Component_A implements IComponent {
    @Override
    public String getName() {
        return ComponentConst.Component_A.NAME;
    }

    @Override
    public boolean onCall(CC cc) {
        String action = cc.getActionName();
        switch (action) {
            case ComponentConst.Component_A.Action.SHOW:
                ComponentAManager componentAManager = ComponentAManager.getInstance();
                CC.sendCCResult(cc.getCallId(),CCResult.successWithNoKey(componentAManager));
                break;
            case ComponentConst.Component_A.Action.HIDE:
                break;
        }

        return true;
    }
}
