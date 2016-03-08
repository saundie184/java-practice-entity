public class Rottweiler extends Dog{
  public String size = "x-large";

  public Rottweiler(String size, boolean dead, boolean sleep, int weight){
    super(size, dead, sleep, weight);
  }

  // - Only eats the following:
  //   - Small cats.
  //   - Small fish.
  @Override
  public void eat(Entity ent){
    if(isSleeping == false){
      if(ent.getClass().getName() == "Cat" && ent.size == "small"){
        System.out.println("We can eat the cat!!");
        double addedWeight = Math.ceil(ent.weight / 10);
        this.weight += addedWeight;
        ent.isDead = true;
      } else if (ent.getClass().getName() == "Fish" && ent.size == "small"){
        System.out.println("We can eat this fish!!");
        double addedWeight = Math.ceil(ent.weight / 10);
        this.weight += addedWeight;
        ent.isDead = true;
      } else {
        System.out.println("We CANNOT we this animal!");
      }
    }
  };
}
