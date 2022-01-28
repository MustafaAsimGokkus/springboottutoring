package restapi2controllerservice;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
@Service
public class StudentBean03Service {
    
    List<StudentBean03> listOfStudent = List.of(
            
                                new StudentBean03(101L, "Ali Can", "ac@gmail.com", LocalDate.of(2008, 8, 8)),
                                new StudentBean03(102L, "Veli Han", "vh@gmail.com", LocalDate.of(1996, 6, 6)),
                                new StudentBean03(103L, "Ayse Kan", "ak@gmail.com", LocalDate.of(2000, 1, 1)),
                                new StudentBean03(104L, "Mary Star", "ms@gmail.com", LocalDate.of(1995, 5, 5))
                                
            
                                                );
    
    
    public StudentBean03 getStudentById(Long id) {
        if (listOfStudent.stream().filter(t->t.getId()==id).collect(Collectors.toList()).isEmpty()){
        	return new StudentBean03();
        }else
        return listOfStudent.stream().filter(t->t.getId()==id).findFirst().get();
    }
    
    public List<StudentBean03>getAllStudents(){
    	return listOfStudent;
    }
    
}