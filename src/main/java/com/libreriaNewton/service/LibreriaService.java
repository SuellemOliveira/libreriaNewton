package com.libreriaNewton.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreriaNewton.entity.Libreria;
import com.libreriaNewton.repository.BookRepository;

@Service
public class LibreriaService {
	
	@Autowired

	private BookRepository bRepo;
	public void save(Libreria b) {
		bRepo.save(b);
		
	}
	
 public List<Libreria> getAllBook() {
		
		return bRepo.findAll();
	}

 public void deleteById(int id) {
	bRepo.deleteById(id);
}
 public Libreria getBookById(int id) {
	 
	 return bRepo.findById(id).get();
 }


}
