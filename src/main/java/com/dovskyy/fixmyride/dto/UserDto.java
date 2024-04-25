package com.dovskyy.fixmyride.dto;

import com.dovskyy.fixmyride.model.User;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * DTO for {@link User}
 */
@Getter
@Setter
public class UserDto implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
}