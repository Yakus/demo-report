package com.example.demoreport.service.dto;

import java.io.Serializable;

/**
 * A DTO for the Anexo entity.
 */
public class AnexoDTO implements Serializable {

    private String imagen;

    private String base64;

    private String descripcion;

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }
}
