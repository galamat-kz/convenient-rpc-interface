package kz.galamat.rpc.convenient.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RpcResponse implements Serializable {

    @NonNull
    private String path;
    @NonNull
    private String method;
    private Map<String, String> queryParams;
    private Object body;

}
