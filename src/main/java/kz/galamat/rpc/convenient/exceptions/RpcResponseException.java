package kz.galamat.rpc.convenient.exceptions;

import lombok.Getter;

/**
 * Created by Yersin Mukay on 20.10.2022
 */
public class RpcResponseException extends RuntimeException {

    /**
    * as HttpStatus
    */
    @Getter
    private final int status;

    @Getter
    private final String reason;

    public RpcResponseException(String errorMessage, int status, String reason) {
        super(errorMessage);
        this.status = status;
        this.reason = reason;
    }

    public RpcResponseException(Throwable cause, int status, String reason) {
        super(cause);
        this.status = status;
        this.reason = reason;
    }

    public RpcResponseException(int status, String reason) {
        this.status = status;
        this.reason = reason;
    }
}
