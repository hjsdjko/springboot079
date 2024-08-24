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


import com.dao.JieyongguihaiDao;
import com.entity.JieyongguihaiEntity;
import com.service.JieyongguihaiService;
import com.entity.vo.JieyongguihaiVO;
import com.entity.view.JieyongguihaiView;

@Service("jieyongguihaiService")
public class JieyongguihaiServiceImpl extends ServiceImpl<JieyongguihaiDao, JieyongguihaiEntity> implements JieyongguihaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JieyongguihaiEntity> page = this.selectPage(
                new Query<JieyongguihaiEntity>(params).getPage(),
                new EntityWrapper<JieyongguihaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JieyongguihaiEntity> wrapper) {
		  Page<JieyongguihaiView> page =new Query<JieyongguihaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JieyongguihaiVO> selectListVO(Wrapper<JieyongguihaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JieyongguihaiVO selectVO(Wrapper<JieyongguihaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JieyongguihaiView> selectListView(Wrapper<JieyongguihaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JieyongguihaiView selectView(Wrapper<JieyongguihaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
