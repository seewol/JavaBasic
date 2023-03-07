package com.kh.example.chap03_assist.run;

import com.kh.example.chap03_assist.part01_buffer.model.dao.BufferDAO;
import com.kh.example.chap03_assist.part02_object.model.dao.ObjectDAO;

public class Run {
	public static void main(String[] args) {
		BufferDAO bd = new BufferDAO();
//		bd.inputByte();
//		bd.outputByte();
//		bd.outputChar();
//		bd.inputChar();
//		bd.inputIO();
		
		ObjectDAO od = new ObjectDAO();
//		od.fileSave();
		od.fileOpen();
//		od.appendFile();
	}
}
