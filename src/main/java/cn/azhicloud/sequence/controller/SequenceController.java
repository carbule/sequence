package cn.azhicloud.sequence.controller;

import cn.azhicloud.sequence.helper.Sequences;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouzhifeng
 * @version 1.0
 * @since 2022/7/3 20:51
 */
@RestController
@RequestMapping("/sequence")
public class SequenceController {

    @GetMapping("/next")
    public Long nextId() {
        return Sequences.next();
    }
}
