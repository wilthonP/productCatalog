package com.ts.productCatalog.component;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	
	EventoComponent eventoComponent;
	EmpresarioComponent empresarioComponent;
	AutorizacionEventoComponent autorizacionEventoComponent;
	PrecioLocalidadComponent precioLocalidadComponent;
	SecuencialLocalidadComponent secuencialLocalidadComponent;
	DisenioTicketLocalidadComponent disenioTicketLocalidadComponent;

	@Autowired
	public Receiver(EventoComponent eventoComponent, EmpresarioComponent empresarioComponent,
			AutorizacionEventoComponent autorizacionEventoComponent,PrecioLocalidadComponent precioLocalidadComponent,
			SecuencialLocalidadComponent secuencialLocalidadComponent, DisenioTicketLocalidadComponent disenioTicketLocalidadComponent) {
		super();
		this.eventoComponent = eventoComponent;
		this.empresarioComponent = empresarioComponent;
		this.autorizacionEventoComponent = autorizacionEventoComponent;
		this.precioLocalidadComponent = precioLocalidadComponent;
		this.secuencialLocalidadComponent = secuencialLocalidadComponent;
		this.disenioTicketLocalidadComponent = disenioTicketLocalidadComponent;
	}
	
	@Bean
	Queue queue() {
		return new Queue("ProductCatalogQ", false);
	}
}
