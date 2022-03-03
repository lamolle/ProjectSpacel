package com.SpringBoot.BE;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;


public class AgentUser  extends Agent{
	

	
	@Override
	protected void setup()
	{
	addBehaviour(new OneShotBehaviour() {

		@Override
		public void action() {
			ACLMessage msg= new ACLMessage(ACLMessage.INFORM);
			msg.setContent("this is the start of the greatest platforme in this era ");
			msg.addReceiver(new AID("agent1",AID.ISLOCALNAME));
			send(msg);
			
		}
	});

	}
	}
