public abstract class Entity {
  protected String size;
  protected boolean isDead = false;
  protected boolean isSleeping = false;
  protected int weight;

  //Constructor
  public Entity(){

  }

  public void eat(Entity ent){
    double addedWeight = Math.ceil(ent.weight / 10);
    this.weight += addedWeight;
    ent.isDead = true;
  };

  public void sleep(){
    this.isSleeping = true;
  };

  public void poop(){
    double lostWeight = Math.ceil(this.weight / 10);
    this.weight -= lostWeight;
    if(this.weight == 0) {
      this.isDead = true;
    };
  };

  public void die(){
    this.isDead = true;
  }

  // - Takes in Entity (pass in null if no Entity or override);
  public void act(Entity ent){
    if(isDead == false && isSleeping == false){
      // - Does nothing if isDead.
      // - Does nothing if isSleeping.
    } else if(isSleeping == true){
      // - If isSleeping it has of 50% chance of setting isSleeping to false.
      // - Logic can decide whether to eat(Entity), sleep() or poop();
    }

  }

  public static void main(String [] args){
    Dog rover = new Dog("large", false, false, 100);
    Cat kitty = new Cat("small", false, false, 50);
    Fish denny = new Fish("small", false, false, 20);
    Rottweiler rot = new Rottweiler("large", false, false, 200);

    System.out.println(rot.size);
  }

}
