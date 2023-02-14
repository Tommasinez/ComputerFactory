package it.betacom.factory;

import it.betacom.model.Computer;
import it.betacom.model.Desktop;
import it.betacom.model.Notebook;
import it.betacom.model.Server;

public class ComputerFactory {

	public static Computer getComputer(String computerType, Double cpu, Integer memory, Integer storage) {

		switch (computerType.toUpperCase()) {
		case "DESKTOP":
			System.out.println("Desktop built!");
			return new Desktop(cpu, memory, storage);
		case "NOTEBOOK":
			System.out.println("Notebook built!");
			return new Notebook(cpu, memory, storage);
		case "SERVER":
			if (memory < 32) {
				System.out.println("Server built! However, the RAM capacity was set to the minumum required of 32GB.");
				return new Server(cpu, 32, storage);
			} else {
				System.out.println("Server built!");
				return new Server(cpu, memory, storage);
			}
		default:
			return null;
		}
	}
}
