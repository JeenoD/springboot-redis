package jeenod.example.demo.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * @author: Jeeno
 * @mail: jeenocruise@gmail.com
 * @date: 2019/7/9 20:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private Integer age;

}