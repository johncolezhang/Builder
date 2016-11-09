//������ģʽ
public class Builder {}

class Actor{
	private String type;
	private String sex;
	private String face;
	private String costume;
	private String hairstyle;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	public String getCostume() {
		return costume;
	}
	public void setCostume(String costume) {
		this.costume = costume;
	}
	public String getHairstyle() {
		return hairstyle;
	}
	public void setHairstyle(String hairstyle) {
		this.hairstyle = hairstyle;
	}
}

abstract class ActorBuilder{
	protected Actor actor = new Actor();//��actorֻ����������Լ��������汻��������󷵻س�ȥ
	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildCostume();
	public abstract void buildHairstyle();
	public Actor createActor(){
		return actor;
	}
}//��������

class HeroBuilder extends ActorBuilder{
	@Override
	public void buildType() {
		// TODO Auto-generated method stub
		actor.setType("hero");
	}

	@Override
	public void buildSex() {
		// TODO Auto-generated method stub
		actor.setSex("male");
	}

	@Override
	public void buildFace() {
		// TODO Auto-generated method stub
		actor.setFace("handsome");
	}

	@Override
	public void buildCostume() {
		// TODO Auto-generated method stub
		actor.setCostume("helmet");
	}

	@Override
	public void buildHairstyle() {
		// TODO Auto-generated method stub
		actor.setHairstyle("longstick");
	}
}//���彨����

class AngelBuilder extends ActorBuilder{
	@Override
	public void buildType() {
		// TODO Auto-generated method stub
		actor.setType("angel");
	}

	@Override
	public void buildSex() {
		// TODO Auto-generated method stub
		actor.setSex("female");
	}

	@Override
	public void buildFace() {
		// TODO Auto-generated method stub
		actor.setFace("beauty");
	}

	@Override
	public void buildCostume() {
		// TODO Auto-generated method stub
		actor.setCostume("drouser");
	}

	@Override
	public void buildHairstyle() {
		// TODO Auto-generated method stub
		actor.setHairstyle("longstick");
	}
}//���彨����

class DevilBuilder extends ActorBuilder{
	@Override
	public void buildType() {
		// TODO Auto-generated method stub
		actor.setType("devil");
	}

	@Override
	public void buildSex() {
		// TODO Auto-generated method stub
		actor.setSex("male");
	}

	@Override
	public void buildFace() {
		// TODO Auto-generated method stub
		actor.setFace("ugly");
	}

	@Override
	public void buildCostume() {
		// TODO Auto-generated method stub
		actor.setCostume("black jacket");
	}

	@Override
	public void buildHairstyle() {
		// TODO Auto-generated method stub
		actor.setHairstyle("bald");
	}
}//���彨����

class ActorController{
	public Actor construct(ActorBuilder ab){
		Actor actor;
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		ab.buildHairstyle();
		actor = ab.createActor();
		return actor;
	}
}//������
