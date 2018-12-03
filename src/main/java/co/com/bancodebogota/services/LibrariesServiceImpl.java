package co.com.bancodebogota.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;



@Service
public class LibrariesServiceImpl implements LibrariesService{
	
	private ArrayList<String> libraries;
	
	
	
	public LibrariesServiceImpl() {
		loadLibraries();
	}

	private void loadLibraries(){
		libraries = new ArrayList<>();
		this.libraries.add("aes.js");
		this.libraries.add("crypto-js.min.js");
		this.libraries.add("hmac-sha256.min.js");
		this.libraries.add("enc-base64.min.js");
		this.libraries.add("uuid.min.js");
		this.libraries.add("jwtCode.js");
	}

	@Override
	public ArrayList<String> getLibraries() {
		return this.libraries;
	}

	
	
	
	
	

}
