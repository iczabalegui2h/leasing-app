package com.leasing.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leasing.app.solicitud.SolicitudService;

@RestController
@RequestMapping("/solicitud")
public class SolicitudController {

    @Autowired
	protected SolicitudService solicitudService;

    @RequestMapping(value = "/obtenerCotizacion", method = RequestMethod.POST)
	public String obtenerCotizacion() {
		return solicitudService.obtenerCotizacion();
	}

}