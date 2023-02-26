package com.ruoyi.admin.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.HhyAdminColumnsetItemMapper;
import com.ruoyi.admin.domain.HhyAdminColumnsetItem;
import com.ruoyi.admin.service.IHhyAdminColumnsetItemService;

/**
 * hhy_admin_columnset_itemService业务层处理
 * 
 * @author admin
 * @date 2022-01-24
 */
@Service
public class HhyAdminColumnsetItemServiceImpl implements IHhyAdminColumnsetItemService 
{
    @Autowired
    private HhyAdminColumnsetItemMapper hhyAdminColumnsetItemMapper;

    /**
     * 查询hhy_admin_columnset_item
     * 
     * @param colItemId hhy_admin_columnset_itemID
     * @return hhy_admin_columnset_item
     */
    @Override
    public HhyAdminColumnsetItem selectHhyAdminColumnsetItemById(Long colItemId)
    {
        return hhyAdminColumnsetItemMapper.selectHhyAdminColumnsetItemById(colItemId);
    }

    /**
     * 查询hhy_admin_columnset_item列表
     * 
     * @param hhyAdminColumnsetItem hhy_admin_columnset_item
     * @return hhy_admin_columnset_item
     */
    @Override
    public List<HhyAdminColumnsetItem> selectHhyAdminColumnsetItemList(HhyAdminColumnsetItem hhyAdminColumnsetItem)
    {
        return hhyAdminColumnsetItemMapper.selectHhyAdminColumnsetItemList(hhyAdminColumnsetItem);
    }

    /**
     * 新增hhy_admin_columnset_item
     * 
     * @param hhyAdminColumnsetItem hhy_admin_columnset_item
     * @return 结果
     */
    @Override
    public int insertHhyAdminColumnsetItem(HhyAdminColumnsetItem hhyAdminColumnsetItem)
    {
        hhyAdminColumnsetItem.setCreateTime(DateUtils.getNowDate());
        return hhyAdminColumnsetItemMapper.insertHhyAdminColumnsetItem(hhyAdminColumnsetItem);
    }

    /**
     * 修改hhy_admin_columnset_item
     * 
     * @param hhyAdminColumnsetItem hhy_admin_columnset_item
     * @return 结果
     */
    @Override
    public int updateHhyAdminColumnsetItem(HhyAdminColumnsetItem hhyAdminColumnsetItem)
    {
        hhyAdminColumnsetItem.setUpdateTime(DateUtils.getNowDate());
        return hhyAdminColumnsetItemMapper.updateHhyAdminColumnsetItem(hhyAdminColumnsetItem);
    }

    /**
     * 批量删除hhy_admin_columnset_item
     * 
     * @param colItemIds 需要删除的hhy_admin_columnset_itemID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminColumnsetItemByIds(Long[] colItemIds)
    {
        return hhyAdminColumnsetItemMapper.deleteHhyAdminColumnsetItemByIds(colItemIds);
    }

    /**
     * 删除hhy_admin_columnset_item信息
     * 
     * @param colItemId hhy_admin_columnset_itemID
     * @return 结果
     */
    @Override
    public int deleteHhyAdminColumnsetItemById(Long colItemId)
    {
        return hhyAdminColumnsetItemMapper.deleteHhyAdminColumnsetItemById(colItemId);
    }
}
