package com.example.demoreport.service;

import com.example.demoreport.service.dto.AnexoDTO;
import com.example.demoreport.service.dto.VariableDTO;
import com.example.demoreport.util.SimpleReportExporter;
import com.example.demoreport.util.SimpleReportFiller;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Service Implementation for managing Report.
 */
@Service
public class ReportService {

    private final MessageSource messageSource;

    private final SimpleReportExporter simpleReportExporter;

    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

    private Environment env;

    public ReportService(MessageSource messageSource, SimpleReportExporter simpleReportExporter, Environment env) {
        this.messageSource = messageSource;
        this.simpleReportExporter = simpleReportExporter;
        this.env = env;
    }

    public ByteArrayOutputStream generateReport() throws IOException {
        fontConfigReport();
        String reportName = "Report";
        SimpleReportFiller simpleReportFiller = new SimpleReportFiller();
        simpleReportFiller.compileReport(reportName);
        simpleReportFiller.setParameters(getParams());
        simpleReportFiller.fillReport();
        simpleReportExporter.setJasperPrint(simpleReportFiller.getJasperPrint(), true);
        return simpleReportExporter.exportToPdf("SOAINT");
    }

    private Map<String, Object> getParams() {
        Map<String, Object> parameters = new HashMap<>();
        Locale locale = Locale.forLanguageTag("es");
        parameters.put("title", "Reporte maestro");
        parameters.put("date", simpleDateFormat.format(new Date()));
        parameters.put("evaluator", "El evaluador");
        parameters.put("profesionalData", "Otros datos");
        parameters.put("showContent", true);

        parameters.put("introduction", "Intro: Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba ");
        parameters.put("objectives", "Obj: Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba ");
        parameters.put("methodology", "Intro: Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba ");
        parameters.put("principalConclusions", "Obj: Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba Texto de prueba ");


        parameters.put("showMethodMethodology", true);
        parameters.put("methodMethodology", "Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo ");
        parameters.put("showActivitiesMethodology", true);
        parameters.put("activitiesMethodology", null);

        parameters.put("showAdditionalImg", true);

        Formatter formatter = new Formatter();
        parameters.put("number", formatter.format("%04d", 1).toString());
        parameters.put("evauationDate", simpleDateFormat.format(new Date()));
        parameters.put("company", "SOAINT");
        parameters.put("task", "Tarea 1");
        parameters.put("workstation", "Puesto 1");
        parameters.put("workarea", "Area 1");
        parameters.put("employee", "Pepe Perez");
        parameters.put("evaluator", "El Jefe");
        parameters.put("riskValue", "10");
        parameters.put("riskLevel", "Alto");
        parameters.put("riskColor", "red");
        parameters.put("action", "Accion de ejemplo");
        parameters.put("method", "ROSA");
        parameters.put("subreport", "subreport");
        parameters.put("variables", getVariables());

        parameters.put("companyImg", null);
        List<AnexoDTO> anexos = new ArrayList<>();
        AnexoDTO a = new AnexoDTO();
        a.setBase64(env.getProperty("img1"));
        a.setDescripcion("Tradición 1");
        a.setImagen("Imagen " + (anexos.size() + 1));
        anexos.add(a);

        AnexoDTO a1 = new AnexoDTO();
        a1.setBase64(env.getProperty("img2"));
        a1.setDescripcion("Tradición 2");
        a1.setImagen("Imagen " + (anexos.size() + 1));
        anexos.add(a1);

        AnexoDTO a2 = new AnexoDTO();
        a2.setBase64(env.getProperty("img3"));
        a2.setDescripcion("Tradición 3");
        a2.setImagen("Imagen " + (anexos.size() + 1));
        anexos.add(a2);

        AnexoDTO a3 = new AnexoDTO();
        a3.setBase64(env.getProperty("img4"));
        a3.setDescripcion("Tradición 4");
        a3.setImagen("Imagen " + (anexos.size() + 1));
        anexos.add(a3);
        parameters.put("anexos", anexos);
        return parameters;
    }

    private List<VariableDTO> getVariables() {
        List<VariableDTO> variables = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            VariableDTO variableDTO = new VariableDTO();
            variableDTO.setName("Name " + i);
            variableDTO.setTextValue("Value " + i);
            variableDTO.setValue(String.valueOf(i));
            variables.add(variableDTO);
        }
        return variables;
    }

    public ByteArrayOutputStream getReportDetail(Long id) throws IOException {
        fontConfigReport();
        SimpleReportFiller simpleReportFiller = new SimpleReportFiller();
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("isFullReport", true);
        parameters.put("title", "Reporte de la evaluación");
        parameters.put("date", simpleDateFormat.format(new Date()));
        parameters.put("company", "SOAINT");
        parameters.put("task", "Tarea 1");
        parameters.put("workstation", "Puesto 1");
        parameters.put("workarea", "Area 1");
        Formatter formatter = new Formatter();
        parameters.put("number", formatter.format("%04d", 1).toString());
        parameters.put("evauationDate", simpleDateFormat.format(new Date()));
        parameters.put("employee", "Pepe Perez");
        parameters.put("evaluator", "El Jefe");
        parameters.put("riskValue", "10");
        parameters.put("riskLevel", "Alto");
        parameters.put("riskColor", "red");
        parameters.put("action", "Accion de ejemplo");
        parameters.put("method", "ROSA");

        simpleReportFiller.compileReport("subreport");
        parameters.put("variables", getVariables());
        simpleReportFiller.setParameters(parameters);
        simpleReportFiller.fillReport();
        simpleReportExporter.setJasperPrint(simpleReportFiller.getJasperPrint(), false);
        return simpleReportExporter.exportToPdf("SOAINT");
    }

    private void fontConfigReport() {
        String fontConfig = System.getProperty("java.home")
                + File.separator + "lib"
                + File.separator + "fontconfig.Prodimage.properties";
        if (new File(fontConfig).exists())
            System.setProperty("sun.awt.fontconfig", fontConfig);
    }


}
