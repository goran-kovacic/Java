package printApp;

import java.util.ArrayList;
import java.util.List;

import printApp.model.Project;

public class ProjectsController {
	
	private List<Project> projects;
	
	public ProjectsController() {

		projects = new ArrayList<>();
		
		if(Helper.dev) {
			testData();
		}
		
	}

	private void testData() {
		
		projects.add(new Project(1, "test project 1", null, null, false, null, 0, 0, null, null, null));
		projects.add(new Project(2, "test project 2", null, null, false, null, 0, 0, null, null, null));
		projects.add(new Project(3, "test project 3", null, null, false, null, 0, 0, null, null, null));
		
		
	}

	public void showMenu() {
		System.out.println("*** Projects ***");
		System.out.println("1. Show existing Projects");
		System.out.println("2. Add new Project");
		System.out.println("3. Edit an existing Project");
		System.out.println("4. Delete Project");
		System.out.println("5. Return to previous menu");
		inputMenuItem();
	}

	private void inputMenuItem() {
		
		switch(Helper.inputNumberRange("Choose a number: ", "\n *** Must be in range 1 - 5 ***\n", 1, 5)){
			
		case 1:
			showProjects();
			showMenu();
			break;
		
		case 2:
			addProject();
			showMenu();
			break;
			
		case 3:
			editProject();
			showMenu();
			break;
			
		case 4:
			deleteProject();
			showMenu();
			break;
			
		
		case 5:
				break;
			
			
			
		}
		
	}

	private void deleteProject() {
		showProjects();
		int number = Helper.inputNumberRange("Select project number to delete: ", "Error", 1, projects.size());
		
		boolean answer = Helper.yesOrNo("Are you sure you want to delete? y/n", "Answer must be \"y\" or \"n\"");
		
		if (answer) {
			projects.remove(number-1);
			System.out.println("Project " + number + ". deleted");
		}
		
	}

	private void editProject() {
		showProjects();
		
		int number = Helper.inputNumberRange("Select project number: ", "Error", 1, projects.size());
		Project p = projects.get(number-1);
		p.setId(Helper.inputNumberRange("Input project ID (" + p.getId() + "): ", "Error",
				1, Integer.MAX_VALUE));
		p.setProjectName(Helper.inputString("Input project name (" + p.getProjectName() + "): ","Error"));
	}

	private void showProjects() {
		System.out.println("---- List of existing projects: ---- ");
		int n=1;
		for(Project p : projects) {
			System.out.println(n++ + ". " + p.getProjectName());
		}
		System.out.println("-------------------------------------");
	}

	private void addProject() {
		Project p = new Project();
		p.setId(Helper.inputNumberRange("Input project ID: ", "Must be positive number",
				1, Integer.MAX_VALUE));
		p.setProjectName(Helper.inputString("Input project name: ","Name required"));
		
		
		
		projects.add(p);
		
	}
	
}
