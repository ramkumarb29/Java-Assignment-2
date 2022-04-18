/*Follow the given instructions and create an application using Java.
(i) Create an entity class named Project with member variables as projectId, 
projectName, projectHead, noOfResources.
(ii) Create an object for the Project class and through setters assign the values 
for all the member variables.
(iii) Print the corresponding object.*/

package javaexercises;

public class Project {
	int ProjectId;
    String ProjectName;
    String ProjectHead;
    int NoOfResources;
    public Project(int ProjId,String ProjName,String ProjHead,int NoOfRes)
    {
    	ProjectId=ProjId;
        ProjectName=ProjName;
        ProjectHead=ProjHead;
        NoOfResources=NoOfRes;
    }
    	public void setProjectId(int ProjId)
    	{
        	ProjectId=ProjId;
    	}
    	public void setProjectName(String ProjName)
    	{
        	ProjectName=ProjName;
    	}
    	public void setProjectHead(String ProjHead)
    	{
        	ProjectHead=ProjHead;
    	}
    	public void setNoOfResources(int NoOfRes)
    	{
        	NoOfResources=NoOfRes;
    	}
    	public int getProjectId()
    	{
    		return ProjectId;
    	}
    	public String getProjectName()
    	{
    		return ProjectName;
    	}
    	public String getProjectHead()
    	{
    		return ProjectHead;
    	}
    	public int getNoOfResources()
    	{
    		return NoOfResources;
    	}
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Project P=new Project(123,"Java","Raji",3);
    System.out.println("Project:"+"\n"+"ProjectId:"+P.getProjectId()+"\n"+"ProjectName:"+P.getProjectName()
    +"\n"+"ProjectHead:"+P.getProjectHead()+"\n"+"NoOfResources:"+P.getNoOfResources());
	}

}
