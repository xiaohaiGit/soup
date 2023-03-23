package com.upchina.soup;

import com.intellij.openapi.components.ApplicationComponent;

public class MyApplicationComponent implements ApplicationComponent {
    @Override
    public void initComponent() {
//        ApplicationComponent.super.initComponent();
        System.out.println("my init");
        TauntDialog tauntDialog = new TauntDialog();
        tauntDialog.show();
    }
}
