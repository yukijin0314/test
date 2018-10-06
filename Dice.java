package sample18_04;
public class Dice {
	private	int		val;	// 目数
	private	String	color;	// サイコロの色
	public	Dice(int val, String color){
		this.val = val;
		this.color = color;
	}
	public	Dice(String color){
		this(1, color);
	}
	public	Dice(){
		this(1, "白");
	}
	public void	play(){
		val = (int)(Math.random()*6) + 1;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val){
		this.val = val;
	}
	public String getColor() {
		return color;
	}
	public	static void main(String[] args){
		Dice dice = new Dice();
		dice.play();
		System.out.println("目数＝"+dice.getVal() + "/ 色＝" + dice.getColor());
	}
}