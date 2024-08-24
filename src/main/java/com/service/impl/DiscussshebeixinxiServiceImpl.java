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


import com.dao.DiscussshebeixinxiDao;
import com.entity.DiscussshebeixinxiEntity;
import com.service.DiscussshebeixinxiService;
import com.entity.vo.DiscussshebeixinxiVO;
import com.entity.view.DiscussshebeixinxiView;

@Service("discussshebeixinxiService")
public class DiscussshebeixinxiServiceImpl extends ServiceImpl<DiscussshebeixinxiDao, DiscussshebeixinxiEntity> implements DiscussshebeixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshebeixinxiEntity> page = this.selectPage(
                new Query<DiscussshebeixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussshebeixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshebeixinxiEntity> wrapper) {
		  Page<DiscussshebeixinxiView> page =new Query<DiscussshebeixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussshebeixinxiVO> selectListVO(Wrapper<DiscussshebeixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshebeixinxiVO selectVO(Wrapper<DiscussshebeixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshebeixinxiView> selectListView(Wrapper<DiscussshebeixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshebeixinxiView selectView(Wrapper<DiscussshebeixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
