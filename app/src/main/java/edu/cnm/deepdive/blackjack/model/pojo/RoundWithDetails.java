package edu.cnm.deepdive.blackjack.model.pojo;

import androidx.room.Relation;
import edu.cnm.deepdive.blackjack.model.entity.Hand;
import edu.cnm.deepdive.blackjack.model.entity.Round;
import java.util.List;

public class RoundWithDetails extends Round {  //automatically gets the fields that are in round

  @Relation(entity = Hand.class, entityColumn = "round_id", parentColumn = "round_id") //Round is the parent object
  private List<HandWithCards> hands;

  public List<HandWithCards> getHands() {
    return hands;
  }

  public void setHands(List<HandWithCards> hands) {
    this.hands = hands;
  }
}
