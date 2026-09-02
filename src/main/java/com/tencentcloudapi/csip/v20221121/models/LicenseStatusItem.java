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

public class LicenseStatusItem extends AbstractModel {

    /**
    * <p>Resource ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>Authorization type (ENTERPRISE_HP=flagship edition/ADVANCED_HP=pro edition/RASP)</p>
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * <p>Authorization name (flagship edition/pro edition/RASP)</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Authorization type. 0: host authorization. 1: RASP authorization.</p>
    */
    @SerializedName("Category")
    @Expose
    private Long Category;

    /**
    * <p>Total.</p>
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * <p>Used</p>
    */
    @SerializedName("UsedNum")
    @Expose
    private Long UsedNum;

    /**
    * <p>Remaining</p>
    */
    @SerializedName("RemainNum")
    @Expose
    private Long RemainNum;

    /**
    * <p>Earliest start time (format: 2006-01-02 15:04:05)</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>Latest expiration time (format: 2006-01-02 15:04:05)</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>Resource ID</p> 
     * @return ResourceId <p>Resource ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>Resource ID</p>
     * @param ResourceId <p>Resource ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>Authorization type (ENTERPRISE_HP=flagship edition/ADVANCED_HP=pro edition/RASP)</p> 
     * @return LicenseType <p>Authorization type (ENTERPRISE_HP=flagship edition/ADVANCED_HP=pro edition/RASP)</p>
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>Authorization type (ENTERPRISE_HP=flagship edition/ADVANCED_HP=pro edition/RASP)</p>
     * @param LicenseType <p>Authorization type (ENTERPRISE_HP=flagship edition/ADVANCED_HP=pro edition/RASP)</p>
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get <p>Authorization name (flagship edition/pro edition/RASP)</p> 
     * @return Name <p>Authorization name (flagship edition/pro edition/RASP)</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Authorization name (flagship edition/pro edition/RASP)</p>
     * @param Name <p>Authorization name (flagship edition/pro edition/RASP)</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Authorization type. 0: host authorization. 1: RASP authorization.</p> 
     * @return Category <p>Authorization type. 0: host authorization. 1: RASP authorization.</p>
     */
    public Long getCategory() {
        return this.Category;
    }

    /**
     * Set <p>Authorization type. 0: host authorization. 1: RASP authorization.</p>
     * @param Category <p>Authorization type. 0: host authorization. 1: RASP authorization.</p>
     */
    public void setCategory(Long Category) {
        this.Category = Category;
    }

    /**
     * Get <p>Total.</p> 
     * @return TotalNum <p>Total.</p>
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set <p>Total.</p>
     * @param TotalNum <p>Total.</p>
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get <p>Used</p> 
     * @return UsedNum <p>Used</p>
     */
    public Long getUsedNum() {
        return this.UsedNum;
    }

    /**
     * Set <p>Used</p>
     * @param UsedNum <p>Used</p>
     */
    public void setUsedNum(Long UsedNum) {
        this.UsedNum = UsedNum;
    }

    /**
     * Get <p>Remaining</p> 
     * @return RemainNum <p>Remaining</p>
     */
    public Long getRemainNum() {
        return this.RemainNum;
    }

    /**
     * Set <p>Remaining</p>
     * @param RemainNum <p>Remaining</p>
     */
    public void setRemainNum(Long RemainNum) {
        this.RemainNum = RemainNum;
    }

    /**
     * Get <p>Earliest start time (format: 2006-01-02 15:04:05)</p> 
     * @return BeginTime <p>Earliest start time (format: 2006-01-02 15:04:05)</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>Earliest start time (format: 2006-01-02 15:04:05)</p>
     * @param BeginTime <p>Earliest start time (format: 2006-01-02 15:04:05)</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>Latest expiration time (format: 2006-01-02 15:04:05)</p> 
     * @return EndTime <p>Latest expiration time (format: 2006-01-02 15:04:05)</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Latest expiration time (format: 2006-01-02 15:04:05)</p>
     * @param EndTime <p>Latest expiration time (format: 2006-01-02 15:04:05)</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public LicenseStatusItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseStatusItem(LicenseStatusItem source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Category != null) {
            this.Category = new Long(source.Category);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.UsedNum != null) {
            this.UsedNum = new Long(source.UsedNum);
        }
        if (source.RemainNum != null) {
            this.RemainNum = new Long(source.RemainNum);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "UsedNum", this.UsedNum);
        this.setParamSimple(map, prefix + "RemainNum", this.RemainNum);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

