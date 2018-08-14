package tydzien02.zad01;

import java.util.Scanner;

public class task01_ToDo {
    static String [] tasks = new String[100];
    static String [] projects = new String[100];
    static String [] changeLogs = new String[100];

    static int tasksCount = 0;
    static int projectCount = 0;
    static int changeLogCount = 0;

    public static void displayMenu() {
        System.out.println("1 - Create task");
        System.out.println("2 - Remove task");
        System.out.println("3 - Create project");
        System.out.println("4 - Remove project");
        System.out.println("5 - Display all tasks");
        System.out.println("6 - Display all projects");
        System.out.println("7 - Display change log");
        System.out.println("0 - Exit app");
    }

    public static void addTask(String task) {
        boolean hasCapacityForNewTask = tasksCount < tasks.length;
        if (hasCapacityForNewTask) {
            tasks[tasksCount] = task;
            tasksCount++;
            addChangeLog("Dodano nowe zadanie: " + task);
        }
    }

    public static void addProject(String project) {
        boolean hasCapacityForNewProject = projectCount < projects.length;
        if (hasCapacityForNewProject) {
            projects[projectCount] = project;
            projectCount++;
            addChangeLog("Dodano nowy projekt: " + project);
        }
    }

    public static void addChangeLog(String log) {
        boolean hasCapacityForNewLog = changeLogCount < changeLogs.length;
        if (hasCapacityForNewLog) {
            changeLogs[changeLogCount] = log;
            changeLogCount++;
        }
    }

    public static void removeTask(int indexTask) {
        boolean isTaskExist = indexTask < tasksCount;
        if(isTaskExist) {
            addChangeLog("Usunięto zadanie: " + tasks[indexTask]);
            for (int i = indexTask; i < tasksCount-1; i++) {
                tasks[i] = tasks[i+1];
            }
            tasksCount--;
        }
    }

    public static void removeProject(int indexProject) {
        boolean isProjectExist = indexProject < projectCount;
        if (isProjectExist) {
            addChangeLog("Usnięto projekt: " + projects[indexProject]);
            for (int i = indexProject; i < projectCount-1; i++) {
                projects[i] = projects[i+1];
            }
            projectCount--;
        }
    }

    public static void displayTasks() {
        System.out.println("List of tasks: ");
        for (int i = 0; i < tasksCount; i++) {
            System.out.println(i + ". " + tasks[i]);
        }
    }

    public static void displayProjects() {
        System.out.println("List of projects: ");
        for (int i = 0; i < projectCount; i++) {
            System.out.println(i + ". " + projects[i]);
        }
    }

    public static void displayChangeLog() {
        System.out.println("List of change log: ");
        for (int i = 0; i < changeLogCount; i++) {
            System.out.println(i + ". " + changeLogs[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isApplicationRun = true;
        int radix;
        while (isApplicationRun) {
            displayMenu();
            System.out.print("Type number to choose option: ");
            radix = scanner.nextInt();
            switch (radix){
                case 1:
                    System.out.print("Podaj nazwę zadania: ");
                    String task = scanner.next();
                    addTask(task);
                    break;
                case 2:
                    System.out.print("Podaj index zadania do skasowania: ");
                    int idTask = scanner.nextInt();
                    removeTask(idTask);
                    break;
                case 3:
                    System.out.print("Podaj nazwę projektu: ");
                    String project = scanner.next();
                    addProject(project);
                    break;
                case 4:
                    System.out.print("Podaj index projektu do usunięcia: ");
                    int indexProject = scanner.nextInt();
                    removeProject(indexProject);
                    break;
                case 5:
                    displayTasks();
                    break;
                case 6:
                    displayProjects();
                    break;
                case 7:
                    displayChangeLog();
                    break;
                case 0:
                    isApplicationRun = false;
                    break;
                default:
                    System.out.println("There is no option");
            }
        }
    }
}
