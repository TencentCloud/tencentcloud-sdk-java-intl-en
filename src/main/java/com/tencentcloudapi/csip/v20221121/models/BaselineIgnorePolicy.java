/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineIgnorePolicy extends AbstractModel {

    /**
    * <p>Ignore policy record ID.</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Detection item name.</p>
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * <p>Category name of the detection item.</p>
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * <p>User AppID.</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Ignorable range type</p><p>Enumeration values:</p><ul><li>ALL: all assets</li><li>PICK: specified asset</li></ul>
    */
    @SerializedName("ScopeType")
    @Expose
    private String ScopeType;

    /**
    * <p>Custom asset ID list. This parameter is valid only when PICK is selected. Store instance-id or cluster ID.</p>
    */
    @SerializedName("ScopeIncludeList")
    @Expose
    private String [] ScopeIncludeList;

    /**
    * <p>Remove asset ID list. This parameter is valid only when set to ALL. Store instance-id or cluster ID.</p>
    */
    @SerializedName("ScopeExcludeList")
    @Expose
    private String [] ScopeExcludeList;

    /**
    * <p>Remark information.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last modification time.</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>Corresponding asset type</p><p>Enumeration values:</p><ul><li>HOST: host</li><li>CLUSTER: cluster-related assets</li></ul>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Check item ID</p>
    */
    @SerializedName("ItemID")
    @Expose
    private Long ItemID;

    /**
     * Get <p>Ignore policy record ID.</p> 
     * @return ID <p>Ignore policy record ID.</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Ignore policy record ID.</p>
     * @param ID <p>Ignore policy record ID.</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Detection item name.</p> 
     * @return ItemName <p>Detection item name.</p>
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set <p>Detection item name.</p>
     * @param ItemName <p>Detection item name.</p>
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get <p>Category name of the detection item.</p> 
     * @return CategoryName <p>Category name of the detection item.</p>
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set <p>Category name of the detection item.</p>
     * @param CategoryName <p>Category name of the detection item.</p>
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get <p>User AppID.</p> 
     * @return AppID <p>User AppID.</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>User AppID.</p>
     * @param AppID <p>User AppID.</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Ignorable range type</p><p>Enumeration values:</p><ul><li>ALL: all assets</li><li>PICK: specified asset</li></ul> 
     * @return ScopeType <p>Ignorable range type</p><p>Enumeration values:</p><ul><li>ALL: all assets</li><li>PICK: specified asset</li></ul>
     */
    public String getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set <p>Ignorable range type</p><p>Enumeration values:</p><ul><li>ALL: all assets</li><li>PICK: specified asset</li></ul>
     * @param ScopeType <p>Ignorable range type</p><p>Enumeration values:</p><ul><li>ALL: all assets</li><li>PICK: specified asset</li></ul>
     */
    public void setScopeType(String ScopeType) {
        this.ScopeType = ScopeType;
    }

    /**
     * Get <p>Custom asset ID list. This parameter is valid only when PICK is selected. Store instance-id or cluster ID.</p> 
     * @return ScopeIncludeList <p>Custom asset ID list. This parameter is valid only when PICK is selected. Store instance-id or cluster ID.</p>
     */
    public String [] getScopeIncludeList() {
        return this.ScopeIncludeList;
    }

    /**
     * Set <p>Custom asset ID list. This parameter is valid only when PICK is selected. Store instance-id or cluster ID.</p>
     * @param ScopeIncludeList <p>Custom asset ID list. This parameter is valid only when PICK is selected. Store instance-id or cluster ID.</p>
     */
    public void setScopeIncludeList(String [] ScopeIncludeList) {
        this.ScopeIncludeList = ScopeIncludeList;
    }

    /**
     * Get <p>Remove asset ID list. This parameter is valid only when set to ALL. Store instance-id or cluster ID.</p> 
     * @return ScopeExcludeList <p>Remove asset ID list. This parameter is valid only when set to ALL. Store instance-id or cluster ID.</p>
     */
    public String [] getScopeExcludeList() {
        return this.ScopeExcludeList;
    }

    /**
     * Set <p>Remove asset ID list. This parameter is valid only when set to ALL. Store instance-id or cluster ID.</p>
     * @param ScopeExcludeList <p>Remove asset ID list. This parameter is valid only when set to ALL. Store instance-id or cluster ID.</p>
     */
    public void setScopeExcludeList(String [] ScopeExcludeList) {
        this.ScopeExcludeList = ScopeExcludeList;
    }

    /**
     * Get <p>Remark information.</p> 
     * @return Remark <p>Remark information.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remark information.</p>
     * @param Remark <p>Remark information.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last modification time.</p> 
     * @return ModifyTime <p>Last modification time.</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>Last modification time.</p>
     * @param ModifyTime <p>Last modification time.</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>Corresponding asset type</p><p>Enumeration values:</p><ul><li>HOST: host</li><li>CLUSTER: cluster-related assets</li></ul> 
     * @return AssetType <p>Corresponding asset type</p><p>Enumeration values:</p><ul><li>HOST: host</li><li>CLUSTER: cluster-related assets</li></ul>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>Corresponding asset type</p><p>Enumeration values:</p><ul><li>HOST: host</li><li>CLUSTER: cluster-related assets</li></ul>
     * @param AssetType <p>Corresponding asset type</p><p>Enumeration values:</p><ul><li>HOST: host</li><li>CLUSTER: cluster-related assets</li></ul>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>Check item ID</p> 
     * @return ItemID <p>Check item ID</p>
     */
    public Long getItemID() {
        return this.ItemID;
    }

    /**
     * Set <p>Check item ID</p>
     * @param ItemID <p>Check item ID</p>
     */
    public void setItemID(Long ItemID) {
        this.ItemID = ItemID;
    }

    public BaselineIgnorePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineIgnorePolicy(BaselineIgnorePolicy source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.ScopeType != null) {
            this.ScopeType = new String(source.ScopeType);
        }
        if (source.ScopeIncludeList != null) {
            this.ScopeIncludeList = new String[source.ScopeIncludeList.length];
            for (int i = 0; i < source.ScopeIncludeList.length; i++) {
                this.ScopeIncludeList[i] = new String(source.ScopeIncludeList[i]);
            }
        }
        if (source.ScopeExcludeList != null) {
            this.ScopeExcludeList = new String[source.ScopeExcludeList.length];
            for (int i = 0; i < source.ScopeExcludeList.length; i++) {
                this.ScopeExcludeList[i] = new String(source.ScopeExcludeList[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.ItemID != null) {
            this.ItemID = new Long(source.ItemID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);
        this.setParamArraySimple(map, prefix + "ScopeIncludeList.", this.ScopeIncludeList);
        this.setParamArraySimple(map, prefix + "ScopeExcludeList.", this.ScopeExcludeList);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "ItemID", this.ItemID);

    }
}

