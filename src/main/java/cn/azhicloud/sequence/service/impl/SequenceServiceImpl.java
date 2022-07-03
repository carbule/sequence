package cn.azhicloud.sequence.service.impl;

import cn.azhicloud.sequence.repository.SequenceRepository;
import cn.azhicloud.sequence.repository.mapper.SequenceMapper;
import cn.azhicloud.sequence.service.SequenceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zfzhou
 * @version 1.0
 * @since 2021/11/23 14:45
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class SequenceServiceImpl implements SequenceService {

    private final SequenceMapper sequenceMapper;

    private final SequenceRepository sequenceRepository;

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public Long next() {
        sequenceMapper.update();
        return sequenceMapper.select();
    }
}
