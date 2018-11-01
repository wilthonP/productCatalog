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
	ItemServicioValorComponent itemServicioValorComponent;
	ImpuestoValorComponent impuestoValorComponent;

	@Autowired
	public Receiver(EventoComponent eventoComponent, EmpresarioComponent empresarioComponent,
			AutorizacionEventoComponent autorizacionEventoComponent,PrecioLocalidadComponent precioLocalidadComponent,
			SecuencialLocalidadComponent secuencialLocalidadComponent, DisenioTicketLocalidadComponent disenioTicketLocalidadComponent,
			ItemServicioValorComponent itemServicioValorComponent, ImpuestoValorComponent impuestoValorComponent,
			ValorLocalidadComponent valorLocalidadComponent) {
		super();
		this.eventoComponent = eventoComponent;
		this.empresarioComponent = empresarioComponent;
		this.autorizacionEventoComponent = autorizacionEventoComponent;
		this.precioLocalidadComponent = precioLocalidadComponent;
		this.secuencialLocalidadComponent = secuencialLocalidadComponent;
		this.disenioTicketLocalidadComponent = disenioTicketLocalidadComponent;
		this.itemServicioValorComponent = itemServicioValorComponent;
		this.impuestoValorComponent = impuestoValorComponent;
		this.valorLocalidadComponent = valorLocalidadComponent;
	}
	
	@Bean
	Queue queue() {
		return new Queue("ProductCatalogQ", false);
	}
}
