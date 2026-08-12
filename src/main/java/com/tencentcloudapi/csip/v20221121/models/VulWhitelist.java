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

public class VulWhitelist extends AbstractModel {

    /**
    * <p>id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Vulnerability name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Account</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Asset list</p>
    */
    @SerializedName("AssetList")
    @Expose
    private String [] AssetList;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Policy switch (0-off, 1-on)</p>
    */
    @SerializedName("Switch")
    @Expose
    private Long Switch;

    /**
    * <p>Asset scope</p><p>Enumeration value:</p><ul><li>0: All assets</li><li>1: Self-selected Assets</li><li>2: Select all excluded asset</li></ul>
    */
    @SerializedName("AssetRange")
    @Expose
    private Long AssetRange;

    /**
    * <p>Patch KB id</p>
    */
    @SerializedName("KBId")
    @Expose
    private Long KBId;

    /**
    * <p>Vulnerability Id</p>
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
     * Get <p>id</p> 
     * @return Id <p>id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>id</p>
     * @param Id <p>id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Vulnerability name</p> 
     * @return Name <p>Vulnerability name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Vulnerability name</p>
     * @param Name <p>Vulnerability name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Remarks.</p> 
     * @return Remark <p>Remarks.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remarks.</p>
     * @param Remark <p>Remarks.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Account</p> 
     * @return AppId <p>Account</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Account</p>
     * @param AppId <p>Account</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Asset list</p> 
     * @return AssetList <p>Asset list</p>
     */
    public String [] getAssetList() {
        return this.AssetList;
    }

    /**
     * Set <p>Asset list</p>
     * @param AssetList <p>Asset list</p>
     */
    public void setAssetList(String [] AssetList) {
        this.AssetList = AssetList;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Policy switch (0-off, 1-on)</p> 
     * @return Switch <p>Policy switch (0-off, 1-on)</p>
     */
    public Long getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Policy switch (0-off, 1-on)</p>
     * @param Switch <p>Policy switch (0-off, 1-on)</p>
     */
    public void setSwitch(Long Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>Asset scope</p><p>Enumeration value:</p><ul><li>0: All assets</li><li>1: Self-selected Assets</li><li>2: Select all excluded asset</li></ul> 
     * @return AssetRange <p>Asset scope</p><p>Enumeration value:</p><ul><li>0: All assets</li><li>1: Self-selected Assets</li><li>2: Select all excluded asset</li></ul>
     */
    public Long getAssetRange() {
        return this.AssetRange;
    }

    /**
     * Set <p>Asset scope</p><p>Enumeration value:</p><ul><li>0: All assets</li><li>1: Self-selected Assets</li><li>2: Select all excluded asset</li></ul>
     * @param AssetRange <p>Asset scope</p><p>Enumeration value:</p><ul><li>0: All assets</li><li>1: Self-selected Assets</li><li>2: Select all excluded asset</li></ul>
     */
    public void setAssetRange(Long AssetRange) {
        this.AssetRange = AssetRange;
    }

    /**
     * Get <p>Patch KB id</p> 
     * @return KBId <p>Patch KB id</p>
     */
    public Long getKBId() {
        return this.KBId;
    }

    /**
     * Set <p>Patch KB id</p>
     * @param KBId <p>Patch KB id</p>
     */
    public void setKBId(Long KBId) {
        this.KBId = KBId;
    }

    /**
     * Get <p>Vulnerability Id</p> 
     * @return VulId <p>Vulnerability Id</p>
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>Vulnerability Id</p>
     * @param VulId <p>Vulnerability Id</p>
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    public VulWhitelist() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulWhitelist(VulWhitelist source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AssetList != null) {
            this.AssetList = new String[source.AssetList.length];
            for (int i = 0; i < source.AssetList.length; i++) {
                this.AssetList[i] = new String(source.AssetList[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Switch != null) {
            this.Switch = new Long(source.Switch);
        }
        if (source.AssetRange != null) {
            this.AssetRange = new Long(source.AssetRange);
        }
        if (source.KBId != null) {
            this.KBId = new Long(source.KBId);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArraySimple(map, prefix + "AssetList.", this.AssetList);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "AssetRange", this.AssetRange);
        this.setParamSimple(map, prefix + "KBId", this.KBId);
        this.setParamSimple(map, prefix + "VulId", this.VulId);

    }
}

