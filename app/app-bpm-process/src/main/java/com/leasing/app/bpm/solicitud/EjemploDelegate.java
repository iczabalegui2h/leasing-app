package com.leasing.app.bpm.soliciud;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class EjemploDelegate implements JavaDelegate {

    @Override
	public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Inicio : EjemploDelegate");

        System.out.println("Fin : EjemploDelegate");
    }

}