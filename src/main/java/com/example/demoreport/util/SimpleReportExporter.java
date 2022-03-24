package com.example.demoreport.util;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRPrintPage;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import net.sf.jasperreports.export.SimplePdfReportConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.util.List;

@Component
public class SimpleReportExporter {

    private final Logger log = LoggerFactory.getLogger(SimpleReportExporter.class);

    private JasperPrint jasperPrint;

    public SimpleReportExporter() {
    }

    public SimpleReportExporter(JasperPrint jasperPrint) {
        this.jasperPrint = jasperPrint;
    }

    public JasperPrint getJasperPrint() {
        return jasperPrint;
    }

    public void setJasperPrint(JasperPrint jasperPrint, boolean removeBlankPages) {
        if(removeBlankPages) {
            removeBlankPage(jasperPrint.getPages());
        }
        this.jasperPrint = jasperPrint;
    }

    private void removeBlankPage(List<JRPrintPage> pages) {
        if (pages.get(pages.size() - 1).getElements().size() <= 14) {
            pages.remove(pages.size() - 1);
        }
    }

    public ByteArrayOutputStream exportToPdf(String author) {

        // print report to file
        JRPdfExporter exporter = new JRPdfExporter();
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(byteArray));

        SimplePdfReportConfiguration reportConfig = new SimplePdfReportConfiguration();
        reportConfig.setSizePageToContent(true);
        reportConfig.setForceLineBreakPolicy(false);

        SimplePdfExporterConfiguration exportConfig = new SimplePdfExporterConfiguration();
        exportConfig.setMetadataAuthor(author);
        exportConfig.setEncrypted(true);
        exportConfig.setAllowedPermissionsHint("PRINTING");

        exporter.setConfiguration(reportConfig);
        exporter.setConfiguration(exportConfig);
        try {
            exporter.exportReport();
        } catch (JRException ex) {
            log.error("[exportToPdf]", ex);
        }
        return byteArray;
    }
}
