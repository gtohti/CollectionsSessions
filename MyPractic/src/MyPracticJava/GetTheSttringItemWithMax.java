package MyPracticJava;

public class GetTheSttringItemWithMax {
	public static void main(String[] args) {
		String[] courses = {
				"Welcome Kit",
				"Online-Java Programming",
		    	"Online-Software Development Lifecycle",
		    	"Online-Software QA Testing",
		    	"Online-Team Activity",
		    	"Online-Mentoring", 
		    	"Online-Selenium",
		    	"Online-SQL",
		    	"Online-API Testing"
				} ;
	int[] courseId = {143,166,168,170,163,203,169,171,164} ; 
		
    for(int i=0;i<courses.length;i++) {
        
        System.out.println("The course id for <"+courses[i]+"> is <"+courseId[i]+">"); 
//        
//
//        for(int i=0; i<courses.length;i++) {
//          
//          String eachCourse = courses[i] ; 
//          //System.out.println(eachCourse);
//          if(eachCourse.equals("Online-Java Programming")) {
//            System.out.println("INDEX IS " +  courseId[i]  );
//            break; 
	
//	 for (int i = 0 ; i <courseId.length ; i++) {
//         if (courseId[i]==203) {
//
//             System.out.println("203 Course name is " + courses[i]);
//          }
//        }
//	 int count = 0;
//	 
//	 for (int i = 0; i < courses.length; i++) {
//		 if (courses[i].contains("software")) {
//			 count++;
//		 }
//		
//	}
//	 System.out.println("Course that contains Sortware : " + count);
    }
	
	}
}

