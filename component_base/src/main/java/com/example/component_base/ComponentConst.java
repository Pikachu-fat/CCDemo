package com.example.component_base;

/**
 * Created by weijianqiang
 * On 2019/7/10
 * Description:
 */
public class ComponentConst {

    public interface Component_A{
        String NAME = "Component_A";

        public interface Action{
            String SHOW = "Component_A_show";
            String HIDE = "Component_A_hide";
        }

    }

    public interface Component_B{
        String NAME = "Component_B";

        public interface Action{
            String SHOW = "Component_B_show";
            String HIDE = "Component_B_hide";
        }

    }

    public interface Component_C{
        String NAME = "Component_C";

        public interface Action{
            String ShOW = "Component_C_show";
            String HIDE = "Component_CChide";
            String CONTENT = "setContent";
        }
    }


}
