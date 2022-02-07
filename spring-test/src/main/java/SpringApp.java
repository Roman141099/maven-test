import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.spring.learn.FirstComponent;

public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.spring.learn");
        FirstComponent bean = context.getBean(FirstComponent.class);
        System.out.println();
    }
}
