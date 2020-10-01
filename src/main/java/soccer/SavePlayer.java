package soccer;

import javax.persistence.*;

public class SavePlayer {
   public static void main(String[] args) {
      EntityManagerFactory emf = null;
      EntityManager em = null;
      try {
         emf = Persistence.createEntityManagerFactory("course");
         em = emf.createEntityManager();
         EntityTransaction tx = em.getTransaction();
         tx.begin();
         Player player = new Player();
         player.getPk().setNumber(1);
         player.getPk().setClub("LA Galaxy");
         player.setName("Marske");
         em.persist(player);
         tx.commit();
         System.out.println("Player saved");
      } finally {
         if (em != null)
            em.close();
         if (emf != null)
            emf.close();
      }
   }
}
