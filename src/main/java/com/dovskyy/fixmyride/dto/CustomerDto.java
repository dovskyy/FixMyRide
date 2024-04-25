package com.dovskyy.fixmyride.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * DTO for {@link com.dovskyy.fixmyride.model.Customer}
 */
@Getter
@Setter
public class CustomerDto implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}