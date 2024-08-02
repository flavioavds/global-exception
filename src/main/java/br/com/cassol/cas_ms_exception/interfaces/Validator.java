package br.com.cassol.cas_ms_exception.interfaces;

import java.util.List;

import br.com.cassol.cas_ms_exception.exception.errors.CustomError;

public interface Validator<T> {
	Validator<T> linkWith(Validator<T> next);

	void validate(T request, List<CustomError> errors);
}
