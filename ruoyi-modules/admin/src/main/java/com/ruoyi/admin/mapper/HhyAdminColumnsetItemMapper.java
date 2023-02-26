package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.HhyAdminColumnsetItem;

/**
 * hhy_admin_columnset_itemMapper接口
 * 
 * @author admin
 * @date 2022-01-24
 */
public interface HhyAdminColumnsetItemMapper 
{
    /**
     * 查询hhy_admin_columnset_item
     * 
     * @param colItemId hhy_admin_columnset_itemID
     * @return hhy_admin_columnset_item
     */
    public HhyAdminColumnsetItem selectHhyAdminColumnsetItemById(Long colItemId);

    /**
     * 查询hhy_admin_columnset_item列表
     * 
     * @param hhyAdminColumnsetItem hhy_admin_columnset_item
     * @return hhy_admin_columnset_item集合
     */
    public List<HhyAdminColumnsetItem> selectHhyAdminColumnsetItemList(HhyAdminColumnsetItem hhyAdminColumnsetItem);

    /**
     * 新增hhy_admin_columnset_item
     * 
     * @param hhyAdminColumnsetItem hhy_admin_columnset_item
     * @return 结果
     */
    public int insertHhyAdminColumnsetItem(HhyAdminColumnsetItem hhyAdminColumnsetItem);

    /**
     * 修改hhy_admin_columnset_item
     * 
     * @param hhyAdminColumnsetItem hhy_admin_columnset_item
     * @return 结果
     */
    public int updateHhyAdminColumnsetItem(HhyAdminColumnsetItem hhyAdminColumnsetItem);

    /**
     * 删除hhy_admin_columnset_item
     * 
     * @param colItemId hhy_admin_columnset_itemID
     * @return 结果
     */
    public int deleteHhyAdminColumnsetItemById(Long colItemId);

    /**
     * 批量删除hhy_admin_columnset_item
     * 
     * @param colItemIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHhyAdminColumnsetItemByIds(Long[] colItemIds);
}
