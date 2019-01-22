package com.example.mypro.service.index.impl;

import com.example.mypro.domain.User;
import com.example.mypro.service.index.IndexService;
import com.example.mypro.service.base.impl.BaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("indexService")
@Slf4j
public class IndexServiceImpl extends BaseServiceImpl<User> implements IndexService {
}
