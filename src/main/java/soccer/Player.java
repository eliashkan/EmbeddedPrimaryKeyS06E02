package soccer;

import javax.persistence.*;

@Entity
public class Player {
   private String name;
   
   @EmbeddedId
   private PlayerPK pk = new PlayerPK();

   public PlayerPK getPk() {
      return pk;
   }
   
   public void setPk(PlayerPK pk) {
      this.pk = pk;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
}
