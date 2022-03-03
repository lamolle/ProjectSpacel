package com.SpringBoot.BE;

import java.util.UUID;

import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.update.UpdateExecutionFactory;
import org.apache.jena.update.UpdateFactory;
import org.apache.jena.update.UpdateProcessor;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class Agents extends Agent {
	
   
	
	@Override
	protected void setup()
	{
		addBehaviour(new CyclicBehaviour() {

			@Override
			public void action() {
				ACLMessage msg= receive();
				if (msg!=null)
				{
					

			System.out.println(msg.getContent());
					
				}
				else block();
				
			}
			
			
			
		});
	
	}

	
}
