package kz.galamat.rpc.convenient;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RpcErrorResponse implements Serializable {

    private String instanceId;
    @Builder.Default
    private Integer status = 500;
    @NonNull
    private String error;
    private String message;

}
