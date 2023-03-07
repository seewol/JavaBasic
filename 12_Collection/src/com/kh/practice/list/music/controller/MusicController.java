package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	ArrayList<Music> list = new ArrayList<Music>();
	
	public boolean addList(Music music) {
		return true;
	}
	
	public int addAtZero(Music music) {
		return 0;
	}
	
	public List printAll(){
		return list;
	}
	
	public Music searchMusic(String title) {
		return ;
	}
	
	public Music removeMusic(String title) {
		return ;
	}
	
	public Music setMusic(String title, Music music) {
		return ;
	}
	
}
