package me.tinnan.aws.xraydaemontest02.customer;

import lombok.Data;

@Data
public class CustomerResponse {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
