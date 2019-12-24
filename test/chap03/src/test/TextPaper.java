package test;

public class TextPaper implements Paper {
	// 每行字符数
	private int charPerLine = 16;
	// 每页行数
	private int linePerPage = 5;
	// 纸张中内容
	private String content = "";
	// 当前横向位置，从0到charPerLine-1
	private int posX = 0;
	// 当前行数，从0到linePerPage-1
	private int posY = 0;
	// 每行页数
	private int posP = 1;

	public int getCharPerLine() {
		return charPerLine;
	}

	public void setCharPerLine(int charPerLine) {
		this.charPerLine = charPerLine;
	}

	public int getLinePerPage() {
		return linePerPage;
	}

	public void setLinePerPage(int linePerPage) {
		this.linePerPage = linePerPage;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getPosP() {
		return posP;
	}

	public void setPosP(int posP) {
		this.posP = posP;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public void putInChar(char c) {
		this.content += c;
		++posX;
		// 判断是否换行
		if (posX == charPerLine) {
			this.content += Paper.newline;
			posX = 0;
			++posY;
		}
		// 判断是否翻页
		if (posY == linePerPage) {
			this.content += "== 第" + posP + "页 ==";
			this.content += Paper.newline + Paper.newline;
			posY = 0;
			++posP;	
		}
	}

	public String getContent() {
		String ret = this.content;
		// 补齐本页空行，并显示页码
		if (!(posX == 0 && posY == 0)) {
			int count = linePerPage - posY;
			for (int i = 0; i < count; ++i) {
				ret += Paper.newline;
			}
			ret += "== 第" + posP + "页 ==";
		}
		return ret;
	}

}
