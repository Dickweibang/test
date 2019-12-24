package test;

public class Printer {
	private Ink ink = null;
	private Paper paper = null;

	public Ink getInk() {
		return ink;
	}

	public void setInk(Ink ink) {
		this.ink = ink;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public void print(String str) {
		System.out.println("使用"+ink.getColor(255, 200, 0)+"颜色打印：\n");
		for (int i = 0; i < str.length(); ++i) {
			paper.putInChar(str.charAt(i));
		}
		System.out.println(paper.getContent());
	}
}
