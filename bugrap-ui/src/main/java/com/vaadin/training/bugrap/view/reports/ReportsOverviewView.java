package com.vaadin.training.bugrap.view.reports;

import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.training.bugrap.view.reports.components.FiltersLayout;
import com.vaadin.training.bugrap.view.reports.components.HeaderLayout;
import com.vaadin.training.bugrap.view.reports.components.ManageButtonsLayout;
import com.vaadin.training.bugrap.view.reports.components.StatusReportLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

import java.util.Date;

public class ReportsOverviewView extends VerticalLayout {
    public ReportsOverviewView() {
        addComponent(new HeaderLayout());
        addComponent(new ManageButtonsLayout());

        VerticalLayout statusAndFiltersLayout = new VerticalLayout();
        statusAndFiltersLayout.addComponent(new Label("<hr/>", ContentMode.HTML));
        statusAndFiltersLayout.addComponent(new StatusReportLayout());
        statusAndFiltersLayout.addComponent(new FiltersLayout());
        statusAndFiltersLayout.setSpacing(true);
        addComponent(statusAndFiltersLayout);

        Table bugsTable = new Table();
        bugsTable.addContainerProperty("Priority", Integer.class, null);
        bugsTable.addContainerProperty("Type", String.class, null);
        bugsTable.addContainerProperty("Summary", String.class, null);
        bugsTable.addContainerProperty("Assigned to", String.class, null);
        bugsTable.addContainerProperty("Last modified", String.class, null);
        bugsTable.addContainerProperty("Reported", String.class, null);
        bugsTable.setSizeFull();
        bugsTable.addItem(new Object[]{5, "Bug", "Panel child component hierarchy is invalid", "Marc Manager", "", "15 mins ago"}, 1);
        bugsTable.addItem(new Object[]{3, "Bug", "Menubar \"bottleneck\" usability problem", "Marc Manager", "30 mins ago", "2 hours ago"}, 2);
        bugsTable.addItem(new Object[]{2, "Feature", "Improve layout support", "Marc Manager", "", "6 days ago"}, 3);
        bugsTable.addItem(new Object[]{2, "Bug", "Fix chrome theme identifier", "Marc Manager", "2 weeks ago", "1 month ago"}, 4);
        addComponent(bugsTable);

        setSpacing(true);
    }
}