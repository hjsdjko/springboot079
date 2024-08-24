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


import com.dao.JieyonglingquDao;
import com.entity.JieyonglingquEntity;
import com.service.JieyonglingquService;
import com.entity.vo.JieyonglingquVO;
import com.entity.view.JieyonglingquView;

@Service("jieyonglingquService")
public class JieyonglingquServiceImpl extends ServiceImpl<JieyonglingquDao, JieyonglingquEntity> implements JieyonglingquService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JieyonglingquEntity> page = this.selectPage(
                new Query<JieyonglingquEntity>(params).getPage(),
                new EntityWrapper<JieyonglingquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JieyonglingquEntity> wrapper) {
		  Page<JieyonglingquView> page =new Query<JieyonglingquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JieyonglingquVO> selectListVO(Wrapper<JieyonglingquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JieyonglingquVO selectVO(Wrapper<JieyonglingquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JieyonglingquView> selectListView(Wrapper<JieyonglingquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JieyonglingquView selectView(Wrapper<JieyonglingquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
