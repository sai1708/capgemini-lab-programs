package com.capg.demo.springjpa.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.demo.springjpa.errors.InvalidDOBException;
import com.capg.demo.springjpa.errors.StudentAlreadyExistsException;
import com.capg.demo.springjpa.errors.StudentNotFoundException;
import com.capg.demo.springjpa.model.ErrorResponse;


@RestControllerAdvice
public class ErrorController {
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = {StudentAlreadyExistsException.class,InvalidDOBException.class})
	public ErrorResponse handleStudentAlreadyExistsException(Exception ex,HttpServletRequest req) {
		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST.value(), req.getRequestURI());
	}
	
	public ErrorResponse handleInvalidDOBException(Exception ex,HttpServletRequest req) {
		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST.value(), req.getRequestURI());
	}
	
	@ResponseStatus(code = HttpStatus.REQUEST_TIMEOUT)
	@ExceptionHandler(value = StudentNotFoundException.class)
	public ErrorResponse handleStudentNotFoundException(Exception ex,HttpServletRequest req) {
		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.REQUEST_TIMEOUT.getReasonPhrase(), HttpStatus.REQUEST_TIMEOUT.value(), req.getRequestURI());
	}

	
	
		
	}



