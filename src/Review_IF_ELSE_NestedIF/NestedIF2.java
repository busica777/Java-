package Review_IF_ELSE_NestedIF;

public class NestedIF2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean studyHard = true;

        if (studyHard)
        {
            System.out.println(" we'll get the job in first few weeks");
            boolean goodCommunicationSkills = true;

            if (goodCommunicationSkills)
            {
                System.out.println(" might get a job in Apple Amazon, etc. ");
            } 
            else
            {
                System.out.println(" we need to work on our communication skills");
            }

        } else 
        {

            System.out.println("it might take a little longer to get the job");
        }

    }

}
