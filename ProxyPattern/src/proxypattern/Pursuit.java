package proxypattern;
	 
	/**
	 * 追求者类
	 */
	public class Pursuit implements GiveGift {
		private SchoolGirl girl;
		
		public Pursuit(SchoolGirl mm) {
			this.girl = mm;
		}
	 
		@Override
		public void giveDolls() {
			System.out.println("送你洋娃娃"+girl.getName());
		}
	 
		@Override
		public void giveFlowers() {
			System.out.println("送你鲜花"+girl.getName());
		}
	 
		@Override
		public void giveCHocolate() {
			System.out.println("送你巧克力"+girl.getName());
		}
	 
	}
	 
	/**
	 * 女孩
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
		