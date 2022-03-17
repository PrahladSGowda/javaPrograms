package logicChar;

public class ReverseWithoutLength {
	public static void main(String[] args) {
String s="testing";
char [] ch=s.toCharArray(); //-->string to char
int count=0;//initial
for (char c : ch) {//to get the count
	count++;// to get count of string 
}
System.out.println(count);
for (int i = count-1; i>=0; i--) {
	System.out.print(ch[i]);
}

}
}
