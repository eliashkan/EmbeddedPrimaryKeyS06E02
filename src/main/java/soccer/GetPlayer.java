package soccer;

import javax.persistence.*;

public class GetPlayer {
   public static void main(String[] args) {
      EntityManagerFactory emf = null;
      EntityManager em = null;
      try {
         emf = Persistence.createEntityManagerFactory("course");
         em = emf.createEntityManager();
         EntityTransaction tx = em.getTransaction();
         tx.begin();
         PlayerPK pk = new PlayerPK();
         pk.setClub("LA Galaxy");
         pk.setNumber(1);
         Player player = em.find(Player.class, pk);
         System.out.println(player.getName());
         tx.commit();
      } finally {
         if (em != null)
            em.close();
         if (emf != null)
            emf.close();
      }
   }
}
