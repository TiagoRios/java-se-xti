package javaa;

public class StringOperacoes {

	public static void main(String[] args) {
		//String s1 = "Write once";
		//String s2 = s1 + "Rum AnyWhere";
		//String s3 = new String("Java Virtual Machine");
		//char[] array = {'j','a','v','a'};
		//String s4 = new String(array);
		
		//opera�oes
		//int tamanho = s1.length();
		//char letra = s1.charAt(0);//0 a length -1
		//String texto =  s1.toString();
		
		//LOCALIZA��O
			//int posicao =s3.indexOf("a");
			//int ultima = s3.lastIndexOf('a');
			//boolean vazia = s3.isEmpty();
			//System.out.println(posicao);
			
	//COMPARA��O
	//String xti = "XTI";
	//boolean x = xti.equals("xti");
	//boolean x = xti.equalsIgnoreCase("xti");
	//verificar se a string come�a com um determinado valor
	//boolean x = xti.startsWith("XT");
	//verificar se termina com um determinado valor;
	//boolean x = xti.endsWith("TI");
	//System.out.println(x);
	
	//comparar se uma string e maior que outra
	//amor vem antes que bola pq come�a com a letra "A"
	//int c = "amor".compareTo("bola");// -1
	//System.out.println(c);
	
	//String so = "olhe, olhe!";
	//System.out.println(so.regionMatches(6, "olhe", 0, 4));
	
	//EXTRA�AO
	String l = "O Brasil � Lindo";
	//pegar uma parte dessa string a partir da posi�ao 11
	String sl = l.substring(11);
	//pegar uma da string dizendo onde come�a e onde termina
	sl = l.substring(2, 6);
	
	
	//MODIFICA��O
	sl= l.concat(" que Maravilha");
	sl= l.replace('s','z');
	//sl = l.replaceFirst(" ", "-");
	//sl =l.replaceAll(" ", "x");
	sl = l.toUpperCase();
	sl = l.toLowerCase();
	
	System.out.println("         esp aco".trim());
	System.out.println(sl);
	
	}
}
