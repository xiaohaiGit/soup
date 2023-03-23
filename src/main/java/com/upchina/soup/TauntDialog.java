package com.upchina.soup;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.nio.charset.StandardCharsets;

public class TauntDialog extends DialogWrapper {

    private JLabel label;

    protected TauntDialog() {
        super(true);
        setTitle(new String("每日一汤".getBytes(), StandardCharsets.UTF_8));
        init();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        JPanel panel = new JPanel();
        label = new JLabel(Utils.getSoup());
        panel.add(label);
        return panel;
    }

    @Override
    protected JComponent createSouthPanel() {
        JPanel panel = new JPanel();
        JButton button = new JButton("come on");
        button.addActionListener(e -> {
            String soup = Utils.getSoup();
            label.setText(soup);
        });
        panel.add(button);
        return panel;
    }
}
