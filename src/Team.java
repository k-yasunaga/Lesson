class player{
	private String player;

	public player(String player) {
		this.player = player;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}
	
}
public class Team {
	private String name;
	private int win;
	private int lose;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	
	public Team() {
		
	}
	public Team(String name, int win, int lose) {
		this.name = name;
		this.win = win;
		this.lose = lose;
	}
	
}
