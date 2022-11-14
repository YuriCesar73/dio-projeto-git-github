public class Usuario{
	
	public static void main (String[] args) {
		
		SmartTv smartTv = new SmartTv();
		System.out.println("OI cacete");
		//Status inicial da smart tv
		System.out.println("TV Ligada ? " + smartTv.ligada);
		System.out.println("Canal atual : " + smartTv.canal);
		System.out.println("Volume atual : " + smartTv.volume);

		//Liga a tv
		smartTv.ligar();
		System.out.println("TV Ligada ? Novo Status -> " + smartTv.ligada);

		//Diminui e aumenta o volume
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		System.out.println("Volume atual: " + smartTv.volume);

		//Muda o canal para o desejado
		smartTv.mudarCanal(13);
		System.out.println("Canal atual : " + smartTv.canal);

		//Aumenta o canal de 1 em 1
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		System.out.println("Canal atual : " + smartTv.canal);

		//Diminui canal em 1
		smartTv.diminuirCanal();
		System.out.println("Canal atual : " + smartTv.canal);
	}
}