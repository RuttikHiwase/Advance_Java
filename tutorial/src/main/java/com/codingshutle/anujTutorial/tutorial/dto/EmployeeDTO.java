package com.codingshutle.anujTutorial.tutorial.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Data
@NoArgsConstructor
public class EmployeeDTO {

    @JsonProperty("employee_id") // Renaming 'id' field to 'employee_id' in JSON
    private Long id;

    @JsonProperty("employee_name") // Renaming 'name' field to 'employee_name' in JSON
    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd") // Formatting the date
    private LocalDate dateOfJoining;

    @JsonProperty("isActive") // Keep the 'isActive' field and include it in the JSON response
    private boolean isActive;

    // Constructor
    public EmployeeDTO(Long id, String name, LocalDate dateOfJoining, boolean isActive) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.isActive = isActive;
    }
}
