package project;

public class RemvoingSpecial {

	public static void main(String[] args) {
		String n="hello nnai!@ hdbjheb!@#$ hhedh123";
		n=n.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(n);
		String a[]=n.split(" ");
		String d="";
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>d.length()) {
				d=a[i];
			}
		}
		
		
	}

}
