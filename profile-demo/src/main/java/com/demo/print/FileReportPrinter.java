package com.demo.print;

import com.demo.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component @Profile("file")
public class FileReportPrinter implements ReportPrinter{
    @Override
    public Report print(Report report) {
        System.out.println("FileReportPrinter::print.invoke()");
        return report;
    }
}
