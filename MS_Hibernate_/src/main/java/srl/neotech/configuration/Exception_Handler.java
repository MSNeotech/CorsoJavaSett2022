package srl.neotech.configuration;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.requestresponse.ResponseBase;


@ControllerAdvice
@RestController
public class Exception_Handler {

	/**
     * Constraint violation exception handler   
     * 
     * @param ex ConstraintViolationException
     * @return List<ValidationError> - list of ValidationError built
     * from set of ConstraintViolation
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseBase handleConstraintViolation(ConstraintViolationException ex) {
    	ResponseBase resp=new ResponseBase();
    	resp.setCode("KO");
    	String mess="";
    	for(ConstraintViolation<?> err:ex.getConstraintViolations()) {
    		mess+=err.getPropertyPath().toString()+":"+err.getMessage()+";";
    	}
    	resp.setDescr(mess); 
    	return resp;
    }
    
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseBase handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
    	ResponseBase resp=new ResponseBase();
    	resp.setCode("KO");
    	String mess="";
    	for(FieldError err:ex.getFieldErrors()) {
    		mess+=err.getField()+":"+err.getDefaultMessage()+";";
    	}
    	resp.setDescr(mess); 
    	return resp;
    }
    
   
}
