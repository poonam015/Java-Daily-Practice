class Theater
{
		public static void main(String args[])
	{

		Movie ps=new Movie();
		ps.setMovie("Avtar","James Cameron",450);
		Movie ps2=new Movie();
		ps2.setMovie("Pathan","Siddharth Anand",450);
		ps.getMovie();
		ps2.getMovie();
	}
}

class Movie
{
	private int pTicket;
	private String pName, pDirector;

	//adding one Movie to theater
	public void setMovie(String movieName,String movieDirector,int movieTicket){
		pName=movieName;
		pDirector=movieDirector;
		pTicket=movieTicket;
		
	}
	//print Movie details
	public void getMovie(){
		System.out.println(pName+" which is Directed by "+pDirector+" and it's Show Ticket is "+pTicket+"rs");
	}


}