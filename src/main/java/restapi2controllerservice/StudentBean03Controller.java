package restapi2controllerservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentBean03Controller {
    
    
    @Autowired
    private StudentBean03Service student;
    
//    @Autowired
//    public StudentBean03Controller() {
//		super();
//	}
	@GetMapping(path = "/getStudentById/{id}")
    
    public StudentBean03 getStudentById(@PathVariable Long id) {
    
        return student.getStudentById(id);
    }
    @GetMapping(path = "/getAllStudents")
    public List<StudentBean03> getAllStudents(){
    	return student.listOfStudent;
    }
    
}
