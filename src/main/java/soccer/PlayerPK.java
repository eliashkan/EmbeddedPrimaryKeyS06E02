package soccer;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class PlayerPK implements Serializable {
   private String club;
   private int number;
   
   public PlayerPK() {      
   }
   
   public String getClub() {
      return club;
   }
   public void setClub(String club) {
      this.club = club;
   }
   public int getNumber() {
      return number;
   }
   public void setNumber(int number) {
      this.number = number;
   }
   
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((club == null) ? 0 : club.hashCode());
      result = prime * result + number;
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      PlayerPK other = (PlayerPK) obj;
      if (club == null) {
         if (other.club != null)
            return false;
      } else if (!club.equals(other.club))
         return false;
      if (number != other.number)
         return false;
      return true;
   }
}
