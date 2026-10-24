package com.eduaircontrol.msusermanagement.infrastructure.web.dto;

import com.eduaircontrol.msusermanagement.shared.exception.ValidationException;

public final class PageParams {

    private PageParams() {
    }

    public static void validate(int page, int limit) {
        if (page < 1) {
            throw new ValidationException("page must be 1 or greater");
        }
        if (limit < 1 || limit > 100) {
            throw new ValidationException("limit must be between 1 and 100");
        }
    }
}
