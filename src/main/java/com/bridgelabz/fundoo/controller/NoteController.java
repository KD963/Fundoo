package com.bridgelabz.fundoo.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bridgelabz.fundoo.Dto.NoteDTO;
import com.bridgelabz.fundoo.response.Response;
import com.bridgelabz.fundoo.service.NoteService;

@RestController
@RequestMapping("/notes")
public class NoteController {

	@Autowired
	private NoteService noteService;

	@PostMapping("/create")
	public ResponseEntity<Response> createNote(@RequestBody @Valid NoteDTO noteDTO, @RequestParam String token) {
		String message = noteService.createNote(noteDTO, token);
		Response response = new Response(200, message, token);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<Response> deleteNote(@RequestParam String noteId, @RequestParam String token) {
		String message = noteService.deleteNote(noteId, token);
		Response response = new Response(200, message, null);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@PostMapping("/trashUntrash")
	public ResponseEntity<Response> trashUntrash(@RequestParam String noteId, @RequestParam String token) {
		String message = noteService.trashUntrash(noteId, token);
		Response response = new Response(200, message, null);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@PostMapping("/pinUnpin")
	public ResponseEntity<Response> pinUnpin(@RequestParam String noteId, @RequestParam String token) {
		String message = noteService.pinUnpin(noteId, token);
		Response response = new Response(200, message, null);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@PutMapping("/updateNote")
	public ResponseEntity<Response> updateNote(@RequestBody NoteDTO noteDTO, @RequestParam String noteId,
			@RequestParam String token) {
		String message = noteService.updateNote(noteDTO, noteId, token);
		Response response = new Response(200, message, null);
		return new ResponseEntity<Response>(response, HttpStatus.OK);

	}

}
