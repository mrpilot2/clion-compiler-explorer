package com.mrpilot.compiler_explorer;


import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class Settings implements Configurable {
    @Nls
    @Override
    public String getDisplayName() {
        return "Compiler Explorer";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        JPanel jPanel = new JPanel();

        jPanel.add(new JTextField("Test"));
        return jPanel;
    }

    @Override
    public boolean isModified() {
        return false;
    }

    @Override
    public void apply() throws ConfigurationException {

    }
}
