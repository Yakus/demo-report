package com.example.demoreport.web.rest;

import com.example.demoreport.service.ReportService;
import com.example.demoreport.service.dto.ReportDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 * REST controller for managing Report.
 */
@RestController
@RequestMapping("/api")
public class ReportResource {

    private final Logger log = LoggerFactory.getLogger(ReportResource.class);
    private final ReportService reportService;
    private static final String CONTENT_DISPOSITION = "Content-Disposition";

    public ReportResource(ReportService reportService) {
        this.reportService = reportService;
    }

    private String getNameGenerated(String id) {
        Date date = new Date();
        return "Reporte_" + id + "_" + date.getTime();
    }

    @GetMapping("/reports/download/{id}")
    public ResponseEntity<byte[]> downloadReport(@PathVariable Long id) throws IOException {
        log.debug("REST request to get Report : {}", id);
        ByteArrayOutputStream reportTo = reportService.generateReport();
        String nameGenerated = getNameGenerated("Informe");
        String headerValue = "attachment; filename=\"" + nameGenerated + ".pdf\"";
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_PDF)
                .header(CONTENT_DISPOSITION, headerValue).body(reportTo.toByteArray());
    }

    /**
     * GET  /reports/detail/:id : get the "id" report.
     *
     * @param id the id of the report detail to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the reportDTO, or with status 404 (Not Found)
     */
    @GetMapping("/reports/download/detail/{id}")
    public ResponseEntity<byte[]> getReportDetail(@PathVariable Long id) throws IOException {
        log.debug("REST request to get Report : {}", id);
        ByteArrayOutputStream reportTo = reportService.getReportDetail(id);
        String nameGenerated = getNameGenerated("Ficha");
        String headerValue = "attachment; filename=\"" + nameGenerated + ".pdf\"";
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_PDF)
                .header(CONTENT_DISPOSITION, headerValue).body(reportTo.toByteArray());
    }
}
