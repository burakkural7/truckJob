package truckJob;



import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Driver> drivers= new ArrayList<>();
		drivers.add(new Driver("İsmail", "Oğuz", "05374789854"));
		drivers.add(new Driver("Burak", "Kural", "0532 548 78 65"));
		drivers.add(new Driver("Nur", "Saad", "0534 548 65 65"));
		ArrayList<Truck> trucks= new ArrayList<>();
		trucks.add(new Truck("14 BM 526", "Scania", "2011"));
		trucks.get(0).setDriver(drivers.get(2));
		trucks.add(new Truck("34 GS 22", "Dodge", "1960", drivers.get(1)));
		trucks.add(new Truck());
		trucks.get(2).setPlateNumber("35 GS 60");
		trucks.get(2).setBrand("Mercedes");
		trucks.get(2).setModel("1.001.905");
		trucks.get(2).setDriver(drivers.get(0));
		ArrayList<Company> companies=new ArrayList<>();
		companies.add(new Company("Lares Lojistik", "030928942","Madrid / İspanya"));
		companies.add(new Company("CR7 Lojistik", "0543677826", "Manchester / İngiltere"));
		companies.add(new Company("Burak Lojistik", "056467476", "Bolu / Türkiye"));
		ArrayList<Dispacher> dispachers= new ArrayList<>();
		dispachers.add(new Dispacher("Burak", "Kural", "0539489239", "kuralburak08@gmail.com"));	
		dispachers.add(new Dispacher("Emir", "Şahin", "0536492865", "emirsahin14@gmail.com"));
		dispachers.add(new Dispacher("Ecrin", "Demirkol", "053865767", "ecrindemirkol15@gmail.com"));	
		
		
		ArrayList<Job> jobs=new ArrayList<>();
		jobs.add(new Job("Ostim Organize Sanayi/Ankara", "İkitelli Organize Sanayi/İstanbul",  12845.35, 24348.93, 423, companies.get(1), trucks.get(2), dispachers.get(0)));
		jobs.add(new Job("İzmir", "Samsun", 34578.03, 28123.47, 2147, companies.get(2), trucks.get(0), dispachers.get(1)));
		jobs.add(new Job("Bolu", "Çanakkale", 25953, 36800, 587, companies.get(0), trucks.get(1), dispachers.get(2)));
		
		
		for(Job job:jobs) {
		    System.out.println("<-----"+ job.getJobFrom()+" - "+job.getJobDestaniation()+"----->");
		    System.out.println("---İş Bilgileri---");
		    System.out.println("Nereden: "+job.getJobFrom());
		    System.out.println("Nereye :"+job.getJobDestaniation());
		    System.out.println("Tutar :"+job.getCost()+" TL");
		    System.out.println("Ağırlık :"+job.getWeight()+" KG");
		    System.out.println("Mesafe :"+job.getDestinationRange()+" KM");
		    System.out.println("---Müşteri Bilgileri---");
		    System.out.println("Şirket Adı :"+job.getCompany().getName());
		    System.out.println("Şirket Telefon:"+job.getCompany().getPhoneNumber());
		    System.out.println("Şirket Adresi:"+job.getCompany().getAddress());
		    System.out.println("--Araç Bilgileri---");
		    System.out.println("Plaka :"+job.getTruck().getPlateNumber());
		    System.out.println("Marka :"+job.getTruck().getBrand());
		    System.out.println("Model :"+job.getTruck().getModel());
		    System.out.println("---Sürücü Bilgileri---");
		    System.out.println("İsim : "+job.getTruck().getDriver().getName()+" "+job.getTruck().getDriver());
		    System.out.println("---Aracı Bilgileri---");
		    System.out.println("İsim : "+job.getDispacher().getPhone());
		    System.out.println("Telefon : "+job.getDispacher().getPhone());
		    System.out.println("E-Posta : "+job.getDispacher().getMail());
		}
	}
}
