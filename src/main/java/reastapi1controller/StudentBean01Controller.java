package reastapi1controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentBean01Controller {
    
//  @RequestMapping(method = RequestMethod.GET,path = "/getRequest")
//  @ResponseBody
//  public String getMethod() {
//      
//      return "getmethod is working here ....";
//  }
//  
    
    @GetMapping(path = "/getRequest")
    public String getMethod() {
        
        return "getmethod is working here ....";
    }
    
    //this is tigthly coupling
    @GetMapping(path = "/getStudent1")
    public StudentBean01 getStudent1() {
        
        return new StudentBean01("Orhan Tugra", 11, "OT202211");
    }
    
    //this is loosely coupling
//    @Autowired
//    StudentBean01 std;
    
    
//    @GetMapping(path = "/getStudent2")
//    public StudentBean01 getStudent2() {
//        
//        std.setName("Orhan Tugra");
//        std.setAge(14);
//        std.setId("OT202214");
//        
//        return std;
//    }
    
    //Parameterized with loosely coupling
//    @GetMapping(path = "/getStudentParameterized1/{school}")
//    public StudentBean01 getStudent3(@PathVariable String school) {
//        std.setName(String.format("Betul %s Sare",school));
//        std.setAge(6);
//        std.setId(String.format( "BS2022%s06",  school ));
//        return std;
//    }
    //Parameterized with tightly coupling
//    @GetMapping(path = "/getStudentParameterized2/{school}")
//    public StudentBean01 getStudent4(@PathVariable String school) {
//        return new StudentBean01("Betul Sare", 16 , String.format("BS2022%s16", school));
//    }
//    
//    @GetMapping(path = "/getList")
//    public List<StudentBean01> getList(){
//        
//        return List.of(
//                new StudentBean01("Ahmet Turan", 25, "AT202225"),
//                new StudentBean01("Mumtaz Kemal", 43, "MK202243"),
//                new StudentBean01("Sami Goren", 13, "SG202213")
//                
//                );
//    }
//    
//    @GetMapping
//    
//    public String getMethod1() {
//    	return "Get request without page and it will show in home page";
//    }
    
//    @GetMapping(path="/getStudy1")
//    public String getMethod2() {
//    	return std.study();
//    }
//    
//    @Autowired
//    StudentBean02 std2;
//    
//    @GetMapping(path="/getStudy2")
//    public String getMethod3() {
//    	return std2.study();
//    }
    
   @Autowired
   @Qualifier(value="studentBean01")
   StudentInterface std;
   
    
    @GetMapping(path="/getStudy")

    public String getMethod3() {
  	return std.study();
    } 
    
    
    
}
