package com.dovskyy.fixmyride.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.dovskyy.fixmyride.model.Customer}
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CustomerDto implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}