package com.employee.api.service.common;

import com.employee.api.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;

import java.util.function.Supplier;

public class CommonService {
    public static Supplier<ResourceNotFoundException> getNotFoundExceptionSupplier(String msg,
                                                                                    Long entityId) {
        return () -> new ResourceNotFoundException(
                msg + entityId, HttpStatus.NOT_FOUND);
    }
}
