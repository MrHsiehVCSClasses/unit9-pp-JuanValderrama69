package u9pp.MonsterFighter;
public class HealingMonster extends Monster{
  private int healing;
  public HealingMonster(String name, int maxHealth, int attack, int expGiven, int heal){
    super(name, maxHealth, attack, expGiven);
    this.healing = heal;
    }
  public int getHealingPerTurn(){
    return healing;
  }
  @Override
  public String takeTurn(Combatant target){
    target.getAttacked(this.getAttackPower());
    this.heal(this.getHealingPerTurn());
    String attack = this.getName() + " attacks " + target.getName() + " with " + this.getAttackPower() + " attack power.";
    return attack;
  }
}

