package com.example.mypro.service.system.impl;

import com.example.mypro.dao.entity.Menu;
import com.example.mypro.service.base.impl.BaseServiceImpl;
import com.example.mypro.service.system.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("menuService")
@Slf4j
public class MenuServiceImpl extends BaseServiceImpl<Menu> implements MenuService {
}
