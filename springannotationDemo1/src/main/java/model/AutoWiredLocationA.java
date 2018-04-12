package model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 15:01
 */
@Data
@Accessors(chain = true)
public class AutoWiredLocationA {

    private  AutoWiredLocationB autoWiredLocationB;



}
