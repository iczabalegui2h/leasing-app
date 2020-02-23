package com.leasing.app.solicitud;

import java.util.*;
import java.lang.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.camunda.bpm.engine.ProcessEngineException;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;

@Service
public class SolicitudServiceImpl implements SolicitudService {

    @Autowired(required=false)
    private RuntimeService runtimeService;

    @Override
    public String obtenerCotizacion(){
        Map<String, Object> parametros = new HashMap<String, Object>();
        ProcessInstance pii = runtimeService.startProcessInstanceByKey("proceso_solicitud_cotizaciones", parametros);
        runtimeService.setVariable(pii.getId(), null, null);
    
        return "hola desde el servicio";
    }
}