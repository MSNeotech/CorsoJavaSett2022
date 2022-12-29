package srl.neotech.services;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

	
	public String getImmagine() {
		String urlImmagine="";
		Random rnd=new Random();
		int valore=rnd.nextInt(3);
		if(valore==0) urlImmagine="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTBKeqWaX_bChAQnti_8Tk6p6CmB2WgWLJs5vMM1I0VVGWD4ibMj8Zk7bVwswleJs-YtJ8&usqp=CAU";
		if(valore==1) urlImmagine="https://www.motorionline.com/wp-content/uploads/2017/05/06-showroom-bugatti-uae-dubai-1024x768.jpg";
		if(valore==2) urlImmagine="https://dealers.porscheitalia.com/storage/uploads/2/202102261545-milanoheader1.jpg";
	return urlImmagine;	
	}
	
	
}
