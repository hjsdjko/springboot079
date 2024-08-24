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


import com.dao.DiscussshiyanshiDao;
import com.entity.DiscussshiyanshiEntity;
import com.service.DiscussshiyanshiService;
import com.entity.vo.DiscussshiyanshiVO;
import com.entity.view.DiscussshiyanshiView;

@Service("discussshiyanshiService")
public class DiscussshiyanshiServiceImpl extends ServiceImpl<DiscussshiyanshiDao, DiscussshiyanshiEntity> implements DiscussshiyanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshiyanshiEntity> page = this.selectPage(
                new Query<DiscussshiyanshiEntity>(params).getPage(),
                new EntityWrapper<DiscussshiyanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshiyanshiEntity> wrapper) {
		  Page<DiscussshiyanshiView> page =new Query<DiscussshiyanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussshiyanshiVO> selectListVO(Wrapper<DiscussshiyanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshiyanshiVO selectVO(Wrapper<DiscussshiyanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshiyanshiView> selectListView(Wrapper<DiscussshiyanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshiyanshiView selectView(Wrapper<DiscussshiyanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
