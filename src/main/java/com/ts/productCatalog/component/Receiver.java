package com.ts.productCatalog.component;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	
	EventoComponent eventoComponent;
	EmpresarioComponent empresarioComponent;

	@Autowired
	public Receiver(EventoComponent eventoComponent, EmpresarioComponent empresarioComponent) {
		super();
		this.eventoComponent = eventoComponent;
		this.empresarioComponent = empresarioComponent;
	}
	
	@Bean
	Queue queue() {
		return new Queue("ProductCatalogQ", false);
	}
}
