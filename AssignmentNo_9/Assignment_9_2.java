import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Project{
	private int id;
	private String title;
	private int teamSize;
	private double projectCost;
	private String technology;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int id, String title, int teamSize, double projectCost, String technology) {
		super();
		this.id = id;
		this.title = title;
		this.teamSize = teamSize;
		this.projectCost = projectCost;
		this.technology = technology;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public double getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	
	
	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", teamSize=" + teamSize + ", projectCost=" + projectCost
				+ ", technology=" + technology + "]";
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Project))
			return false;
		Project other = (Project) obj;
		if(this.id==other.id)
		{
			return true;
		}else {
			return false;
		}
	}
	
	
	
}

class costComparator implements Comparator<Project>
{

	@Override
	public int compare(Project o1, Project o2) {
		return (int)(o1.getProjectCost()-o2.getProjectCost());
	}
	
}


public class Assignment_9_2 {
	
	
	public static Scanner sc=new Scanner(System.in);
	
	public static Set<Project>set=new HashSet<>();
	public static List<Project> list;
	
	
	public static int menuList()
	{
		int choice;
		System.out.println("0. Exit");
		System.out.println("1. Add Dummy Data to the set");
		System.out.println("2. Input a project from user to the set");
		System.out.println("3. Display all Projects ");
		System.out.println("4. Delete a project by projectId");
		System.out.println("5. Copy all projects from set to ArrayList");
		System.out.println("6. Display all projects from List");
		System.out.println("7. Sort all projects in list by cost");
		System.out.println("8. Find project with max team size");
		System.out.println("Enter your choice ");
		choice=sc.nextInt();
		return choice;		
	}
	
	public static void addDummy()
	{
		Collections.addAll(set,
				new Project(1, "Train Reservation System", 4,5000000, "Java"),
				new Project(2, "Airline Reservation System",3, 6000000, ".NET"),
				new Project(4, "Online Grocery Shop", 6, 3000000, "Java"),
				new Project(5, "Online Book Shop", 2, 3000000, ".NET"),
				new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"),
				new Project(2, "Bus Reservation System", 3, 3500000, "JS"));
	}
	
	public static void addData()
	{
		Project p=new Project();
		System.out.println("Enter id");
		int id=sc.nextInt();
		p.setId(id);
		sc.nextLine();
		System.out.println("Enter title");
		String title=sc.nextLine();
		p.setTitle(title);
		System.out.println("Enter Team Size");
	    int teamSize=sc.nextInt();
	    p.setTeamSize(teamSize);
		System.out.println("Enter Project Cost");
		double projectCost=sc.nextDouble();
		p.setProjectCost(projectCost);
		sc.nextLine();
		System.out.println("Enter Technology");
		String technology=sc.nextLine();
		p.setTechnology(technology);
		set.add(p);
		
	}
	
	public static void DisplayProject()
	{
		for(Project p:set)
		{
			System.out.println(p);
		}
	}
	
	public static void acceptRecord(int []arr)
	{
		System.out.println("Enter the id ");
		arr[0]=sc.nextInt();
		
	}
	
	public static boolean DeleteProject(int id)
	{
		Project p=new Project();
		p.setId(id);
		if(set.contains(p))
		{
			System.out.println("Project Removed is :"+p.toString());
			set.remove(p);
			
			return true;
		}else {
			return false;
		}
	}
	
	public static void displayAllProjects()
	{
		for(Project e:list)
		{
			System.out.println(e.toString());
		}
	}
	
	public static Project maxSize()
	{
		int max=-1;
		Project temp=new Project();
		for(Project p:list)
		{
			if(p.getTeamSize()>max)
			{
				temp=p;
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int choice;
		int empId[]=new int[1];
		
		while((choice=menuList())!=0)
		{
			switch(choice)
			{
				case 1:
					addDummy();
					break;
					
				case 2:
					addData();
					break;
				
				case 3:
					DisplayProject();
					break;
					
				case 4:
					System.out.println("Enter the Project ID to be removed ");
					acceptRecord(empId);
					boolean status=DeleteProject(empId[0]);
					System.out.println(status?"Employee Deleted ":"Employee Not Found");
					break;
					
				case 5:
					list=new ArrayList<>(set);
					System.out.println("Projects copied from set to ArrayList");
					break;
				case 6:
					displayAllProjects();
					break;
				case 7:
					list.sort(new costComparator());
					DisplayProject();
					break ;
				case 8:
					Project p=maxSize();
					System.out.println(p.toString());
					break;
				default:
					System.out.println("Invalid choice ");		
			}
		}
	}
}





































