package com.example.xpush;

import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.CCResult;
import com.billy.cc.core.component.IComponent;
import com.example.component_base.ComponentConst;

/**
 * Created by weijianqiang
 * On 2019/7/15
 * Description:
 */
public class Component_C implements IComponent {
    @Override
    public String getName() {
        return ComponentConst.Component_C.NAME;
    }

    @Override
    public boolean onCall(CC cc) {
        String action = cc.getActionName();
        switch (action) {
            case ComponentConst.Component_C.Action.CONTENT:
                CC.sendCCResult(cc.getCallId(),CCResult.successWithNoKey(Component_C_mamager.getInstance()));
                break;
            case ComponentConst.Component_C.Action.ShOW:
                break;
            case ComponentConst.Component_C.Action.HIDE:
                break;
            default:
                break;
        }
        return true;
    }
}
