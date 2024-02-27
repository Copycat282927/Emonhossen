
import java.util.*;
public class Main

{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner (System.in);
		Institute i = new Institute();
		
		
		boolean repeat=true;
		while(repeat)
		   {
			    System.out.println("********************************************");
				System.out.println(" !!! WELCOME TO INSTITUTE\n");
				System.out.println("********************************************");
				System.out.println("1. School");
		        System.out.println("2. College");
		        System.out.println("3. University\n");
		        System.out.print("\nPlese Enter your choice : ");
		        int choiceI=sc.nextInt();
				switch(choiceI)
				{
                    case 1:
					{
						System.out.println("********************************************");
						System.out.println("\nYou Select School \n");
						System.out.println("********************************************");
						System.out.println("1. Insert School");
		                System.out.println("2. Search School");
						System.out.print("Plese Enter your choice : ");
				        int choiceC =sc.nextInt();
						switch(choiceC)
						{
							case 1: 
							{
								System.out.println("********************************************");
								System.out.println("\nYou Select Insert School \n");
								System.out.println("********************************************");
								System.out.print("Input Name of the School : ");
				                String schoolName=sc.next();
				                System.out.print("Input School Location : ");
				                String schoolLocation=sc.next();
				                System.out.print("Input School Passing Rate : ");
				                double schoolpassingRate=sc.nextDouble();
				                School cr=new School();
								cr.setSchoolName(schoolName);
								cr.setSchoolLocation(schoolLocation);
								cr.setSchoolPassingRate(schoolpassingRate);
								if(i.insertSchool(cr))
								{
									System.out.println("\nInserted successfully!!\n");
				                    System.out.println("Name of the School is                   : "+cr.getSchoolName());
				                    System.out.println("School Location    is                   : "+cr.getSchoolLocation());
				                    System.out.println("School Passing Rate is                  : "+cr.getSchoolpassingRate());
								}
								else
								{
									System.out.println("SORRY!!!YOU CAN'T INSERT SCHOOL.");
								}
								break;
							}
							case 2 :
							{
								System.out.println("********************************************");
								System.out.println("\nYou Select Search School \n");
								System.out.println("********************************************");
								System.out.print("Input The Name of School : ");
						        String ri4 = sc.next();

						        School s1 = i.searchSchool(ri4);

						        if(s1!= null)
								{
									System.out.println("We Find The School.");
							        System.out.println("---------------------------------------------");
							        System.out.println("Name Of The School is         : "+s1.getSchoolName());
				                    System.out.println("Location of School is         : "+s1.getSchoolLocation());
				                    System.out.println("Passing Rate of School is     : "+s1.getSchoolpassingRate());
									System.out.println("---------------------------------------------");
								}
								else
								{
									System.out.println("Sorry!!We Can't Find The School.");
								}
								break;
							}
						}
						break;
						
					}					

                   case 2:
				   {
					    System.out.println("********************************************");
						System.out.println("\nYou Select College  \n");
						System.out.println("********************************************");
						System.out.println("1. Insert College");
		                System.out.println("2. Search College");
						System.out.print("Plese Enter your choice : ");
				        int choiceC =sc.nextInt();
					    switch(choiceC)
						{
							case 1:
                            {
							    System.out.println("********************************************");
								System.out.println("\nYou Select Insert College \n");
								System.out.println("********************************************");
								System.out.print("Input Name of the College : ");
				                String collegName=sc.next();
				                System.out.print("Input College Location : ");
				                String collegeLocation=sc.next();
				                System.out.print("Input College University Getting Rate : ");
				                double universityChanceRate=sc.nextDouble();
				                College cl=new College();
								cl.setCollegName(collegName);
								cl.setCollegeLocation(collegeLocation);
								cl.setUniversityChanceRate(universityChanceRate);
								if(i.insertCollege(cl))	
								{
									System.out.println("\nInserted successfully!!\n");
				                    System.out.println("Name of the College is                   : "+cl.getCollegName());
				                    System.out.println("College Location    is                   : "+cl.getCollegeLocation());
				                    System.out.println("University Chance Rate is                : "+cl.getUniversityChanceRate());
									
									
								}
								else
								{
									System.out.println("SORRY!!!YOU CAN'T INSERT College.");
								}
								break;
								
							}
							case 2 :
							{
								System.out.println("********************************************");
								System.out.println("\nYou Select Search College \n");
								System.out.println("********************************************");
								System.out.print("Input The Name of College : ");
						        String col = sc.next();
								
						        College cl = i. searchCollege(col);
								
								if(cl!= null)
								{
									System.out.println("We Find The College.");
							        System.out.println("---------------------------------------------");
							        System.out.println("Name Of The College is                 : "+cl.getCollegName());
				                    System.out.println("Lacation of College is                 : "+cl.getCollegeLocation());
				                    System.out.println("University Chance Rate is              : "+cl.getUniversityChanceRate());
									System.out.println("---------------------------------------------");
								}
								else
								{
									System.out.println("Sorry!!We Can't Find The College.");
								}
								break;
						    }
							
							
						}
					   
					   break;
					   
					   
				   }
				   
				   case 3 :
				   {
					    System.out.println("********************************************");
						System.out.println("\nYou Select University  \n");
						System.out.println("********************************************");
						System.out.println("1. Insert University");
		                System.out.println("2. Search University");
						System.out.print("Plese Enter your choice : ");
				        int choiceU =sc.nextInt();
						switch(choiceU)
						{
							case 1 :
							{
								System.out.println("********************************************");
								System.out.println("\nYou Select Insert University \n");
								System.out.println("********************************************");
								System.out.print("Input Name of the University : ");
				                String universityName=sc.next();
				                System.out.print("Input University Location : ");
				                String universityLocation=sc.next();
				                System.out.print("Input University Getting Job Rate : ");
				                double getingJobRate=sc.nextDouble();
				                University ul=new University();
								ul.setUniversityName(universityName);
								ul.setUniversityLocation(universityLocation);
								ul.setGetingJobRate(getingJobRate);
								if(i.insertUniversity(ul))
                                {
									System.out.println("\nInserted successfully!!\n");
				                    System.out.println("Name of the University is                   : "+ul.getUniversityName());
				                    System.out.println("University Location    is                   : "+ul.getUniversityLocation());
				                    System.out.println("University Getting Job Rate is              : "+ul.getGetingJobRate());
								}
                                else
								{
									System.out.println("SORRY!!!YOU CAN'T INSERT UNIVERSITY.");
								}
								break;								
								
							}
							case 2 :
							{
							    System.out.println("********************************************");
								System.out.println("\nYou Select Search University \n");
								System.out.println("********************************************");
								System.out.print("Input The Name of University : ");
						        String un = sc.next();
								
						       University ul = i. searchUniversity(un);
								
							    
								if( ul!= null)
								{
									System.out.println("We Find The University.");
							        System.out.println("---------------------------------------------");
							        System.out.println("Name of the University is                   : "+ul.getUniversityName());
				                    System.out.println("University Location    is                   : "+ul.getUniversityLocation());
				                    System.out.println("University Getting Job Rate is              : "+ul.getGetingJobRate());
									System.out.println("---------------------------------------------");
								}
                                else
								{
									System.out.println("Sorry!!We Can't Find The University.");
								}
								break;								
								
							}
							
							
						}
						break;
					  
				   }
				   
				}   
				   
				
		   }
		
	}
	  

}