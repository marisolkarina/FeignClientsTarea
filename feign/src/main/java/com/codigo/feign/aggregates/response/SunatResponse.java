package com.codigo.feign.aggregates.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SunatResponse {
    private String razonSocial;
    private String numeroDocumento;
    private String estado;
    private String direccion;
    private String distrito;
    private String provincia;
    private String departamento;
}
