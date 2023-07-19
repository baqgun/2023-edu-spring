package kr.re.kitri.springpost.exception;

import lombok.Data;

@Data
public class ErrorResponse {
    private String errorMassage;
    private String errorCode;

    public ErrorResponse(String s, String number) {
        errorMassage = s;
        errorCode = number;
    }
}
