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


import com.dao.FankuipingjiaDao;
import com.entity.FankuipingjiaEntity;
import com.service.FankuipingjiaService;
import com.entity.vo.FankuipingjiaVO;
import com.entity.view.FankuipingjiaView;

@Service("fankuipingjiaService")
public class FankuipingjiaServiceImpl extends ServiceImpl<FankuipingjiaDao, FankuipingjiaEntity> implements FankuipingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FankuipingjiaEntity> page = this.selectPage(
                new Query<FankuipingjiaEntity>(params).getPage(),
                new EntityWrapper<FankuipingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FankuipingjiaEntity> wrapper) {
		  Page<FankuipingjiaView> page =new Query<FankuipingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<FankuipingjiaVO> selectListVO(Wrapper<FankuipingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FankuipingjiaVO selectVO(Wrapper<FankuipingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FankuipingjiaView> selectListView(Wrapper<FankuipingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FankuipingjiaView selectView(Wrapper<FankuipingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
