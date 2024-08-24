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


import com.dao.XueshenglingquDao;
import com.entity.XueshenglingquEntity;
import com.service.XueshenglingquService;
import com.entity.vo.XueshenglingquVO;
import com.entity.view.XueshenglingquView;

@Service("xueshenglingquService")
public class XueshenglingquServiceImpl extends ServiceImpl<XueshenglingquDao, XueshenglingquEntity> implements XueshenglingquService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshenglingquEntity> page = this.selectPage(
                new Query<XueshenglingquEntity>(params).getPage(),
                new EntityWrapper<XueshenglingquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshenglingquEntity> wrapper) {
		  Page<XueshenglingquView> page =new Query<XueshenglingquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<XueshenglingquVO> selectListVO(Wrapper<XueshenglingquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshenglingquVO selectVO(Wrapper<XueshenglingquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshenglingquView> selectListView(Wrapper<XueshenglingquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshenglingquView selectView(Wrapper<XueshenglingquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
