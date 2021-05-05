package com.miage.OnlineBooking.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 *
 * @author bhakti
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidInputException extends RuntimeException {

	private static final long serialVersionUID = 1L;

}
