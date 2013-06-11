package com.vaadin.training.bugrap.view.reports.components;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

public class ManageButtonsLayout extends HorizontalLayout {
    public ManageButtonsLayout() {
        setWidth("100%");

        Button reportBugButton = new Button("Report a bug");
        addComponent(reportBugButton);
        setComponentAlignment(reportBugButton, Alignment.BOTTOM_CENTER);

        Button requestFeatureButton = new Button("Request a feature");
        addComponent(requestFeatureButton);
        setComponentAlignment(requestFeatureButton, Alignment.BOTTOM_CENTER);

        Button manageProjectButton = new Button("Manage project");
        addComponent(manageProjectButton);
        setComponentAlignment(manageProjectButton, Alignment.BOTTOM_CENTER);

        TextField searchReportsField = new TextField("");
        searchReportsField.setValue("Search reports...");
        searchReportsField.setWidth("200px");
        addComponent(searchReportsField);
        setComponentAlignment(searchReportsField, Alignment.BOTTOM_RIGHT);
        setExpandRatio(searchReportsField, 1.0f);

        setSpacing(true);
    }
}