package br.com.cassol.cas_ms_exception.validation;

import java.util.ArrayList;
import java.util.List;

import br.com.cassol.cas_ms_exception.exception.errors.CustomError;
import br.com.cassol.cas_ms_exception.interfaces.ValidationRule;

public class ValidationStep<T> {
	private final List<ValidationRule<T>> rules = new ArrayList<>();

	public void addRule(ValidationRule<T> rule) {
		this.rules.add(rule);
	}

	public void validate(T entity, List<CustomError> errors) {
		for (ValidationRule<T> rule : this.rules) {
			if (!rule.isValid(entity)) {
				errors.add(rule.getError());
			}
		}
	}
}