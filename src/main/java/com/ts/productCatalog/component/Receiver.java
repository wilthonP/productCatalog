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
	ValorLocalidadComponent valorLocalidadComponent;
	LocalidadComponent localidadComponent;
	FormaPagoEventoComponent formaPagoEventoComponent;

	@Autowired
	public Receiver(EventoComponent eventoComponent, EmpresarioComponent empresarioComponent,
			AutorizacionEventoComponent autorizacionEventoComponent,PrecioLocalidadComponent precioLocalidadComponent,
			SecuencialLocalidadComponent secuencialLocalidadComponent, DisenioTicketLocalidadComponent disenioTicketLocalidadComponent,
			ValorLocalidadComponent valorLocalidadComponent, LocalidadComponent localidadComponent,
			FormaPagoEventoComponent formaPagoEventoComponent) {
		super();
		this.eventoComponent = eventoComponent;
		this.empresarioComponent = empresarioComponent;
		this.autorizacionEventoComponent = autorizacionEventoComponent;
		this.precioLocalidadComponent = precioLocalidadComponent;
		this.secuencialLocalidadComponent = secuencialLocalidadComponent;
		this.disenioTicketLocalidadComponent = disenioTicketLocalidadComponent;
		this.valorLocalidadComponent = valorLocalidadComponent;
		this.localidadComponent = localidadComponent;
		this.formaPagoEventoComponent = formaPagoEventoComponent;
	}
	
	@Bean
	Queue queue() {
		return new Queue("ProductCatalogQ", false);
	}
}
