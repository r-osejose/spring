package com.UST.Kafka;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Emp {
    
	private int empid;
    private String empname;
    private String empmailid;
    private String empphno;
}