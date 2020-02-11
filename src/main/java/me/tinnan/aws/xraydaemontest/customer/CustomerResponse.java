package me.tinnan.aws.xraydaemontest.customer;

import lombok.Data;

@Data
public class CustomerResponse {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
