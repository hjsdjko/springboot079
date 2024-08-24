package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XueshengguihaiDao;
import com.entity.XueshengguihaiEntity;
import com.service.XueshengguihaiService;
import com.entity.vo.XueshengguihaiVO;
import com.entity.view.XueshengguihaiView;

@Service("xueshengguihaiService")
public class XueshengguihaiServiceImpl extends ServiceImpl<XueshengguihaiDao, XueshengguihaiEntity> implements XueshengguihaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengguihaiEntity> page = this.selectPage(
                new Query<XueshengguihaiEntity>(params).getPage(),
                new EntityWrapper<XueshengguihaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengguihaiEntity> wrapper) {
		  Page<XueshengguihaiView> page =new Query<XueshengguihaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<XueshengguihaiVO> selectListVO(Wrapper<XueshengguihaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengguihaiVO selectVO(Wrapper<XueshengguihaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengguihaiView> selectListView(Wrapper<XueshengguihaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengguihaiView selectView(Wrapper<XueshengguihaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
