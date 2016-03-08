public abstract class Entity {
  protected String size;
  protected boolean isDead = false;
  protected boolean isSleeping = false;
  protected int weight;

  //Constructor
  public Entity(){};

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
  public void act(){
    if(isSleeping == true){
      boolean random = (Math.random() < 0.5);
      // this.isSleeping = random;
      // System.out.println("this is random: " + random);
      if(random == true){
        this.isSleeping = false;
        // this.poop();
      } else {
        System.out.println("Asleep!");
      }
    }
  }

  public static void main(String [] args){
    Dog rover = new Dog("large", false, false, 100);
    Cat kitty = new Cat("small", false, false, 50);
    Cat stray = new Cat("large", false, false, 50);
    Fish denny = new Fish("small", false, false, 20);
    Rottweiler rot = new Rottweiler("large", false, true, 200);

    System.out.println("Current weight: " + rot.weight);
    System.out.println("Current isSleeping status: " + rot.isSleeping);
    rot.act();
    System.out.println("isSleeping status after ACT method: " + rot.isSleeping);
    rot.eat(kitty);
    System.out.println("After EAT method: " + rot.weight);
  }

}
