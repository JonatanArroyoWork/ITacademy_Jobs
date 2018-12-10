package com.jobs.view;

import java.util.List;

import com.jobs.application.DTOStaffMember;
import com.jobs.application.JobsController;


public class Main {

	private static JobsController controller = new JobsController();

	public static void main(String[] args) throws Exception {

		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666", "NO Cobra");
		controller.createManagerEmployee("Pedro Employee", "Dirección molona 2", "665226666", 80.0);

		controller.payAllEmployeers();

	
		List<DTOStaffMember> allEmployees = controller.getAllEmployees();


		for (DTOStaffMember d: allEmployees) {
			
			
			System.out.println( "Empleado: " + d.getName() + " gets  Total   Paid:   " + d.getTotalPaid());
		}
	}
}
