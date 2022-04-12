
package gr.codelearn.java.path.jakarta.cdi.domain;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Video {
    private String name;
    private BigDecimal sizeGB;
    private Integer views =0;
    private Integer year;
}
