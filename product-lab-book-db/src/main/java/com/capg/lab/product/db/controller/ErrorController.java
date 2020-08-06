package com.capg.lab.product.db.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.lab.product.db.errors.ProductAlerdyExistsException;
import com.capg.lab.product.db.errors.ProductNotFoundException;
import com.capg.lab.product.db.model.ErrorResponce;

@RestControllerAdvice
public class ErrorController {
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = {ProductAlerdyExistsException.class})
	public ErrorResponce handleProductAlreadyExistsException(Exception ex,HttpServletRequest req) {
		return new ErrorResponce(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST.value(), req.getRequestURI());
	}
	
	
	
	@ResponseStatus(code = HttpStatus.REQUEST_TIMEOUT)
	@ExceptionHandler(value =  {ProductNotFoundException.class})
	public ErrorResponce handleProductNotFoundException(Exception ex,HttpServletRequest req) {
		return new ErrorResponce(new Date(), ex.getMessage(), HttpStatus.REQUEST_TIMEOUT.getReasonPhrase(), HttpStatus.REQUEST_TIMEOUT.value(), req.getRequestURI());
	}

	


}
