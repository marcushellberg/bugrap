package com.vaadin.training.bugrap.view.reports.components;

import com.vaadin.event.ShortcutAction;
import com.vaadin.training.bugrap.domain.entity.Project;
import com.vaadin.training.bugrap.domain.entity.Report;
import com.vaadin.training.bugrap.view.reports.ReportsPresenter;
import com.vaadin.ui.Window;
import com.vaadin.ui.themes.Reindeer;

public class ReportPopupWindow extends Window {

    private ReportsPresenter presenter;

    public void setPresenter(ReportsPresenter presenter) {
        this.presenter = presenter;

        reportEditLayout.setPresenter(presenter);
    }

    private final ReportEditLayout reportEditLayout;

    public ReportPopupWindow() {
        setWidth("90%");
        setHeight("90%");
        center();

        addStyleName(Reindeer.WINDOW_LIGHT);
        setModal(true);

        reportEditLayout = new ReportEditLayout();

        setContent(reportEditLayout);

        setCloseShortcut(ShortcutAction.KeyCode.ESCAPE);
    }

    public void showReport(Report report) {
        if (report.isPersistent()) {
            setCaption("Edit a report");
        } else {
            setCaption("Create a report");
        }

        reportEditLayout.showReport(report);
        reportEditLayout.hideNewWindowButton();
        reportEditLayout.enableEditableSummary();
    }

    public void showNewReport(Report report, Project project) {
        showReport(report);

        reportEditLayout.populateDataFromProject(project);
    }
}
