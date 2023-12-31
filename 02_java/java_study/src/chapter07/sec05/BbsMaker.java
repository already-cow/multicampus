package chapter07.sec05;

public class BbsMaker {
	public static void main(String[] args) {
		Bbs b1 = new Bbs(1, "java", "fun java", "park");
		Bbs b2 = new Bbs(2, "jsp", "fun jsp", "lee");
		Bbs b3 = new Bbs(3, "spring", "fun spring", "kim");

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		Bbs[] BbsArr = new Bbs[3];
		for (int i = 0; i < BbsArr.length; i++) {
			BbsArr[i] = new Bbs(0, null, null, null);
		}

		Bbs[] bbsArrs = { new Bbs(1, "java", "fun java", "park"), new Bbs(2, "jsp", "fun jsp", "lee"),
				new Bbs(3, "spring", "fun spring", "kim") };

		System.out.println("게시판");
		System.out.println("------------------------");
		System.out.println("no title content writer");
		System.out.println("------------------------");

		for (Bbs bbs : bbsArrs) {
			System.out.printf("%-3d %-10s %-10s %-10s\n", bbs.getNo(), bbs.getTitle(), bbs.getContent(),
					bbs.getWriter());
		}

	}
}
