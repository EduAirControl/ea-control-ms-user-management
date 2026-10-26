package com.eduaircontrol.msusermanagement.infrastructure.web;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserProfileSecurity {

    public boolean isOwner(Authentication authentication, UUID profileId) {
        if (authentication == null) {
            return false;
        }

        return authentication.getAuthorities().stream()
                .anyMatch(a -> "ROLE_ADMIN".equals(a.getAuthority())
                        || "ROLE_SUPER_ADMIN".equals(a.getAuthority()));
    }
}