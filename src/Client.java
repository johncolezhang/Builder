
public class Client {
	public static void main(String args[]){
		ActorBuilder ab;//��������
		ab = (ActorBuilder)XMLUtil.getBean();//ʵ��������
		ActorController ac = new ActorController();//ʵ��������
		Actor actor = ac.construct(ab);//ʹ�ÿ�������ʵ��actor
		
		System.out.println("type: "+actor.getType());
		System.out.println("sex: "+actor.getSex());
		System.out.println("face: "+actor.getFace());
		System.out.println("costume: "+actor.getCostume());
		System.out.println("hairstyle: "+actor.getHairstyle());
	}
}
