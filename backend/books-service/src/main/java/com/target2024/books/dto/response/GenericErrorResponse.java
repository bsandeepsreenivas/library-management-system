package com.target2024.books.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericErrorResponse {

    private String message;
    private String error;
    private LocalDateTime localDateTime;

}
