/*Create an Entity class 'Trainee', with traineeId, traineeName, contactNo, email, gender,
age as fields.
Create a class 'Batch', with batchCode, startdate, enddate and Trainee[] as fields.
Create the following overloaded methods in the 'Batch' class
public Trainee getTrainee(int traineeId) throws TraineeNotFoundException
public Trainee[] getTrainees(String gender)*/

package javaexercises;


public class Main {

	class Trainee
	{
	int traineeId;
    String traineeName;
    String contactNo;
    String email;
    String gender;
    int age;

    Trainee()
    {
        traineeId=1;
    	traineeName="ram";
    	contactNo="76543";
    	email="hftfdtf";
    	gender="male";
    	age=21;
    }
	}
    class Batch extends Trainee
    {
    	
		int batchcode;
    	int startdate;
    	int enddate;
    	Trainee trainee[]=new Trainee[5];
    	public Batch()
    	{
    		trainee[0]=new Trainee();
    		trainee[1]=new Trainee();
    		trainee[2]=new Trainee();
    		trainee[3]=new Trainee();
    		trainee[4]=new Trainee();

    	}
		
    	
    	public Trainee getTrainee(int traineeId) throws TraineeNotFoundException
    	{
    		Trainee t= new Trainee();
    		t=null;
    		for (int i = 0; i < 5; i++) {
				if(trainee[i].traineeId==traineeId)
				{
					t=trainee[i];
				}
			}
    		if(t==null)
    		{
    			throw new TraineeNotFoundException("Trainee not found.");
    		}
    		return t;
    		
    	}
    	
    	
    	public Trainee[] getTrainee(String gender) 
    	{
    	return trainee;
    	}

    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
	    Batch b= m.new Batch();
	    Trainee t=m.new Trainee();
	    t=null;
	    try
	    {
		t=b.getTrainee(4);
		
		System.out.println(t.traineeId);
	    }
	    catch (TraineeNotFoundException g)
	    {
	    	System.out.println(g);
	    }
		
	}
}

		