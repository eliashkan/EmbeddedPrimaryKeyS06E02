package persons;

import javax.persistence.*;

public class GetPerson {
   public static void main(String[] args) {
      EntityManagerFactory emf = null;
      EntityManager em = null;
      try {
         emf = Persistence.createEntityManagerFactory("course");
         em = emf.createEntityManager();
         EntityTransaction tx = em.getTransaction();
         tx.begin();
         Person person = em.find(Person.class, 1L);
         System.out.println(person.getFirstName());
         System.out.println(person.getLastName());
         System.out.printf("%td/%<tm/%<tY%n",
               person.getBirthDay());
         System.out.println(person.getGender());
         System.out.println(person.getComment());
         System.out.println(person.getAddress().getStreet());
         System.out.println(person.getAddress().getNumber());
         System.out.println(person.getAddress().getZipCode());
         System.out.println(person.getAddress().getCity());
         System.out.println(person.getAddress().getCountry());

         tx.commit();
      } finally {
         if (em != null)
            em.close();
         if (emf != null)
            emf.close();
      }
   }
}
