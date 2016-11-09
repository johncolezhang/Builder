
public class Client {
	public static void main(String args[]){
		ActorBuilder ab;//抽象建造类
		ab = (ActorBuilder)XMLUtil.getBean();//实例建造类
		ActorController ac = new ActorController();//实例控制类
		Actor actor = ac.construct(ab);//使用控制类来实例actor
		
		System.out.println("type: "+actor.getType());
		System.out.println("sex: "+actor.getSex());
		System.out.println("face: "+actor.getFace());
		System.out.println("costume: "+actor.getCostume());
		System.out.println("hairstyle: "+actor.getHairstyle());
	}
}
