package by.step.aqa.q1822.spring.project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseClass {

    @Autowired
    FirstClass varOfFirstClass;

    @Autowired
    SecondClass varOfSecondClass;


}
