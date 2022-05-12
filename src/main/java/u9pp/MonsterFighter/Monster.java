package u9pp.MonsterFighter;

public class Monster extends Combatant{
  private int expGiven;
  public Monster(String name, int maxHealth, int attack,int expGiven) {
        super(name, maxHealth, attack);
        this.expGiven = expGiven;
    }
  public int getExpGiven(){
    return expGiven;
  }
  public String takeTurn(Combatant target){
    target.getAttacked(this.getAttackPower());
    String attack = this.getName() + " attacks " + target.getName() + " with " + this.getAttackPower() + " attack power.";
    return attack;
  }
}
