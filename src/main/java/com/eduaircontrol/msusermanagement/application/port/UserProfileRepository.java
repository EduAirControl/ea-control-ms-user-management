package com.eduaircontrol.msusermanagement.application.port;

import com.eduaircontrol.msusermanagement.application.page.PageResult;
import com.eduaircontrol.msusermanagement.domain.model.RecordStatus;
import com.eduaircontrol.msusermanagement.domain.model.UserProfile;
import java.util.Optional;
import java.util.UUID;

public interface UserProfileRepository {

    UserProfile save(UserProfile profile);

    Optional<UserProfile> findById(UUID id);

    Optional<UserProfile> findByUserId(UUID userId);

    boolean existsByUserId(UUID userId);

    PageResult<UserProfile> search(String query, RecordStatus status, int page, int limit);
}
