package restapi3_controller_sevice_repository_formbase_authentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.google.common.base.Optional;
@Repository
public interface StudentBean04Repository extends JpaRepository<StudentBean04, Long>{
    
    Optional<StudentBean04> findStudentBean04ByEmail(String email);
        
}





