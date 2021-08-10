package com.cg.aps.advice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.aps.exception.VisitorNotFoundException;


@ControllerAdvice
public class ApplicationErrorHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	ResponseEntity<Object> handleInvalidData(MethodArgumentNotValidException ex) {

		List<String> errorList= 
				ex.getBindingResult()
					.getFieldErrors()
					.stream()
					.map(fe->fe.getDefaultMessage())
					.collect(Collectors.toList());
		
		Map<String, Object> errorBody = new LinkedHashMap<>();
		errorBody.put("DataError", "Problems in Data received");
		errorBody.put("timestamp", LocalDateTime.now());
		errorBody.put("errors", errorList);
		
		return new ResponseEntity<>(errorBody, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(VisitorNotFoundException.class)
	public ResponseEntity<?> handleVisitorEntity(VisitorNotFoundException vfe) {

		Map<String, Object> errorBody = new LinkedHashMap<>();
		errorBody.put("error", "Creation Failed");
		errorBody.put("timestamp", LocalDateTime.now());
		errorBody.put("details", vfe.getMessage());

		return new ResponseEntity<>(errorBody, HttpStatus.BAD_REQUEST);
	}


}
