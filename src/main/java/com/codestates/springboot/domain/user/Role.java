package com.codestates.springboot.domain.user;

import jdk.internal.jmod.JmodFile;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 사용자");

    public static JmodFile.Entry User;
    private final String key;
    private final String title;
}
