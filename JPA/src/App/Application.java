package App;
 
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpa.NewEntity;
import jpa.NewEntityJpaController;
 
public class Application {
public static void main (String args[]) {
EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("JPAPU");
EntityManager manager = objFactory.createEntityManager();
NewEntity record = new NewEntity();
NewEntityJpaController jpa = new NewEntityJpaController(objFactory);
List<NewEntity> list = jpa.findNewEntityEntities();
 
record.setName("Test");
 
jpa.create(record);
 
for (NewEntity l : list) {
System.out.println("Cod.: "+l.getId()+"\nName.: "+l.getName());
 }
}
}