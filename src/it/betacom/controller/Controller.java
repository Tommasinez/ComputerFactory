package it.betacom.controller;

import java.util.ArrayList;

import it.betacom.factory.ComputerFactory;
import it.betacom.model.Computer;

public class Controller {

	public static void main(String[] args) {

		Computer desktop = ComputerFactory.getComputer("Desktop", 4.3, 32, 2048);
		Computer notebook = ComputerFactory.getComputer("Notebook", 3.7, 16, 1024);
		Computer undersizedServer = ComputerFactory.getComputer("Server", 4.7, 16, 2048);
		Computer server = ComputerFactory.getComputer("Server", 5.2, 64, 8096);

		ArrayList<Computer> computerList = new ArrayList<Computer>();
		computerList.add(desktop);
		computerList.add(notebook);
		computerList.add(undersizedServer);
		computerList.add(server);

		for (Computer computer : computerList) {
			computer.getSpecifications();
		}
	}
}
