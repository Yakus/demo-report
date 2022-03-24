package com.example.demoreport.util;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SimpleReportFiller {

    private final Logger log = LoggerFactory.getLogger(SimpleReportFiller.class);

    private JasperReport jasperReport;

    private JRDataSource jrDataSource;

    private JasperPrint jasperPrint;

    private Map<String, Object> parameters;

    public SimpleReportFiller() {

        parameters = new HashMap<>();
    }

    public void prepareReport(String templateSrc) throws IOException {
        compileReport(templateSrc);
        fillReport();
    }

    public File loadReport(String template) throws FileNotFoundException {
        return ResourceUtils.getFile("classpath:templates/report/" + template + ".jasper");
    }


    public void compileReport(String template) throws IOException {
        try {
            jasperReport = (JasperReport) JRLoader.loadObject(loadReport(template));
        } catch (JRException ex) {
            log.error("[compileReport]", ex);
        }
    }

    public void fillReport() {
        try {
            if (jrDataSource == null)
                jrDataSource = new JREmptyDataSource();
            jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, jrDataSource);
        } catch (JRException ex) {
            log.error("[fillReport]", ex);
        }
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public JasperPrint getJasperPrint() {
        return jasperPrint;
    }

    public void setJasperPrint(JasperPrint jasperPrint) {
        this.jasperPrint = jasperPrint;
    }

    public JRDataSource getJrDataSource() {
        return jrDataSource;
    }

    public void setJrDataSource(JRDataSource jrDataSource) {
        this.jrDataSource = jrDataSource;
    }
}
