package test;

interface Painter {
	void paint();
}

public class InnerAno {

	static void paintTheBuilding(Painter p) {
		p.paint();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paintTheBuilding(new Painter() {

			public void paint() {
				System.out.println("Painter of building");
			}
		});
	}

}
