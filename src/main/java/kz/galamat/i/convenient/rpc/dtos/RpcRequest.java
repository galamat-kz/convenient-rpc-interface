package kz.galamat.i.convenient.rpc.dtos;

import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RpcRequest implements Serializable {

    @NonNull
    private String path;
    @NonNull
    private String method;
    private Map<String, List<String>> headers;
    private Map<String, List<String>> queryParams;
    private Object body;

}
