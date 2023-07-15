package danekerscode.quizbackend.payload;

import lombok.Data;

@Data
public class ErrorResponse {
    private String error;
    private long timestamp;
    public ErrorResponse(String error){
        this.error = error;
        this.timestamp = System.currentTimeMillis();
    }
}
