package com.example.weijianqiang.ccdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.CCResult;
import com.example.component_base.ComponentConst;
import com.example.component_base.UserBean;
import com.example.component_base.interface_custom.IComponentAManager;
import com.example.component_base.interface_custom.IComponentBManager;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv1);
        findViewById(R.id.testA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CCResult ccResult = CC.obtainBuilder(ComponentConst.Component_A.NAME)
                        .setActionName(ComponentConst.Component_A.Action.SHOW)
                        .build()
                        .call();

                if (ccResult.isSuccess()){
                    IComponentAManager componentAManager = ccResult.getDataItemWithNoKey();
                    UserBean userBean = componentAManager.show();
                    if (userBean != null){
                        tv.setText("");
                        tv.setText("name:"+userBean.name+"\n"
                        +"age:"+userBean.age+"\n"
                        +"height:"+userBean.getHeight());
                    }

                }
            }
        });

        findViewById(R.id.testB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CCResult ccResult = CC.obtainBuilder(ComponentConst.Component_B.NAME)
                        .setActionName(ComponentConst.Component_B.Action.SHOW)
                        .build()
                        .call();

                if (ccResult.isSuccess()){
                    IComponentBManager componentBManager = ccResult.getDataItemWithNoKey();
                    UserBean userBean = componentBManager.show();
                    if (userBean != null){
                        tv.setText("");
                        tv.setText("name:"+userBean.name+"\n"
                                +"age:"+userBean.age+"\n"
                                +"height:"+userBean.getHeight());
                    }

                }
            }
        });
    }
}
