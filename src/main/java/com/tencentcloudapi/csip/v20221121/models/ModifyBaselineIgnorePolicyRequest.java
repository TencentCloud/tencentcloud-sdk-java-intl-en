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

public class ModifyBaselineIgnorePolicyRequest extends AbstractModel {

    /**
    * <p>Detection item ID, identifying which detection item to set an ignore policy for.</p>
    */
    @SerializedName("ItemID")
    @Expose
    private Long ItemID;

    /**
    * <p>Ignorable range type.</p><p>Enumeration values:</p><ul><li>ALL: all assets</li><li>PICK: specified asset</li></ul>
    */
    @SerializedName("ScopeType")
    @Expose
    private String ScopeType;

    /**
    * <p>Remark information.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Ignore policy record ID. Pass 0 when creating, and pass the corresponding record ID when updating.</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Custom asset ID list. This parameter is valid only when PICK is selected. Import instance-id or cluster ID.</p>
    */
    @SerializedName("ScopeIncludeList")
    @Expose
    private String [] ScopeIncludeList;

    /**
    * <p>Remove asset ID list. This parameter is valid only when set to ALL. Input instance-id or cluster ID.</p>
    */
    @SerializedName("ScopeExcludeList")
    @Expose
    private String [] ScopeExcludeList;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Detection item ID, identifying which detection item to set an ignore policy for.</p> 
     * @return ItemID <p>Detection item ID, identifying which detection item to set an ignore policy for.</p>
     */
    public Long getItemID() {
        return this.ItemID;
    }

    /**
     * Set <p>Detection item ID, identifying which detection item to set an ignore policy for.</p>
     * @param ItemID <p>Detection item ID, identifying which detection item to set an ignore policy for.</p>
     */
    public void setItemID(Long ItemID) {
        this.ItemID = ItemID;
    }

    /**
     * Get <p>Ignorable range type.</p><p>Enumeration values:</p><ul><li>ALL: all assets</li><li>PICK: specified asset</li></ul> 
     * @return ScopeType <p>Ignorable range type.</p><p>Enumeration values:</p><ul><li>ALL: all assets</li><li>PICK: specified asset</li></ul>
     */
    public String getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set <p>Ignorable range type.</p><p>Enumeration values:</p><ul><li>ALL: all assets</li><li>PICK: specified asset</li></ul>
     * @param ScopeType <p>Ignorable range type.</p><p>Enumeration values:</p><ul><li>ALL: all assets</li><li>PICK: specified asset</li></ul>
     */
    public void setScopeType(String ScopeType) {
        this.ScopeType = ScopeType;
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
     * Get <p>Ignore policy record ID. Pass 0 when creating, and pass the corresponding record ID when updating.</p> 
     * @return ID <p>Ignore policy record ID. Pass 0 when creating, and pass the corresponding record ID when updating.</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Ignore policy record ID. Pass 0 when creating, and pass the corresponding record ID when updating.</p>
     * @param ID <p>Ignore policy record ID. Pass 0 when creating, and pass the corresponding record ID when updating.</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Custom asset ID list. This parameter is valid only when PICK is selected. Import instance-id or cluster ID.</p> 
     * @return ScopeIncludeList <p>Custom asset ID list. This parameter is valid only when PICK is selected. Import instance-id or cluster ID.</p>
     */
    public String [] getScopeIncludeList() {
        return this.ScopeIncludeList;
    }

    /**
     * Set <p>Custom asset ID list. This parameter is valid only when PICK is selected. Import instance-id or cluster ID.</p>
     * @param ScopeIncludeList <p>Custom asset ID list. This parameter is valid only when PICK is selected. Import instance-id or cluster ID.</p>
     */
    public void setScopeIncludeList(String [] ScopeIncludeList) {
        this.ScopeIncludeList = ScopeIncludeList;
    }

    /**
     * Get <p>Remove asset ID list. This parameter is valid only when set to ALL. Input instance-id or cluster ID.</p> 
     * @return ScopeExcludeList <p>Remove asset ID list. This parameter is valid only when set to ALL. Input instance-id or cluster ID.</p>
     */
    public String [] getScopeExcludeList() {
        return this.ScopeExcludeList;
    }

    /**
     * Set <p>Remove asset ID list. This parameter is valid only when set to ALL. Input instance-id or cluster ID.</p>
     * @param ScopeExcludeList <p>Remove asset ID list. This parameter is valid only when set to ALL. Input instance-id or cluster ID.</p>
     */
    public void setScopeExcludeList(String [] ScopeExcludeList) {
        this.ScopeExcludeList = ScopeExcludeList;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public ModifyBaselineIgnorePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBaselineIgnorePolicyRequest(ModifyBaselineIgnorePolicyRequest source) {
        if (source.ItemID != null) {
            this.ItemID = new Long(source.ItemID);
        }
        if (source.ScopeType != null) {
            this.ScopeType = new String(source.ScopeType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
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
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemID", this.ItemID);
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamArraySimple(map, prefix + "ScopeIncludeList.", this.ScopeIncludeList);
        this.setParamArraySimple(map, prefix + "ScopeExcludeList.", this.ScopeExcludeList);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

