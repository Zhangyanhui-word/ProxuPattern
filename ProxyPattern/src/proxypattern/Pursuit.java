package proxypattern;
	 
	/**
	 * ׷������
	 */
	public class Pursuit implements GiveGift {
		private SchoolGirl girl;
		
		public Pursuit(SchoolGirl mm) {
			this.girl = mm;
		}
	 
		@Override
		public void giveDolls() {
			System.out.println("����������"+girl.getName());
		}
	 
		@Override
		public void giveFlowers() {
			System.out.println("�����ʻ�"+girl.getName());
		}
	 
		@Override
		public void giveCHocolate() {
			System.out.println("�����ɿ���"+girl.getName());
		}
	 
	}
	 
	/**
	 * Ů��
	 */
	class SchoolGirl {
		private String name;
	 
		public String getName() {
			return name;
		}
	 
		public void setName(String name) {
			this.name = name;
		}
	}
		