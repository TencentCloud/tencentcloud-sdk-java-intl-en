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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeResource extends AbstractModel {

    /**
    * <p>Configuration ID.</p>
    */
    @SerializedName("ResourceConfigId")
    @Expose
    private Long ResourceConfigId;

    /**
    * <p>Resource</p>
    */
    @SerializedName("Resource")
    @Expose
    private Resource Resource;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Whether the default configuration applies. Valid values: DEFAULT and BACKUP.</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private String IsDefault;

    /**
    * <p>Remaining of this type.</p>
    */
    @SerializedName("MaxResourceNum")
    @Expose
    private Long MaxResourceNum;

    /**
    * <p>Supported committed use duration.</p>
    */
    @SerializedName("PrepaidUnderwritePeriods")
    @Expose
    private Long [] PrepaidUnderwritePeriods;

    /**
    * <p>Number of quotas.</p>
    */
    @SerializedName("QuotaNum")
    @Expose
    private Long QuotaNum;

    /**
    * <p>Quota unit.</p>
    */
    @SerializedName("QuotaUnit")
    @Expose
    private String QuotaUnit;

    /**
     * Get <p>Configuration ID.</p> 
     * @return ResourceConfigId <p>Configuration ID.</p>
     */
    public Long getResourceConfigId() {
        return this.ResourceConfigId;
    }

    /**
     * Set <p>Configuration ID.</p>
     * @param ResourceConfigId <p>Configuration ID.</p>
     */
    public void setResourceConfigId(Long ResourceConfigId) {
        this.ResourceConfigId = ResourceConfigId;
    }

    /**
     * Get <p>Resource</p> 
     * @return Resource <p>Resource</p>
     */
    public Resource getResource() {
        return this.Resource;
    }

    /**
     * Set <p>Resource</p>
     * @param Resource <p>Resource</p>
     */
    public void setResource(Resource Resource) {
        this.Resource = Resource;
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
     * Get <p>Whether the default configuration applies. Valid values: DEFAULT and BACKUP.</p> 
     * @return IsDefault <p>Whether the default configuration applies. Valid values: DEFAULT and BACKUP.</p>
     */
    public String getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>Whether the default configuration applies. Valid values: DEFAULT and BACKUP.</p>
     * @param IsDefault <p>Whether the default configuration applies. Valid values: DEFAULT and BACKUP.</p>
     */
    public void setIsDefault(String IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>Remaining of this type.</p> 
     * @return MaxResourceNum <p>Remaining of this type.</p>
     */
    public Long getMaxResourceNum() {
        return this.MaxResourceNum;
    }

    /**
     * Set <p>Remaining of this type.</p>
     * @param MaxResourceNum <p>Remaining of this type.</p>
     */
    public void setMaxResourceNum(Long MaxResourceNum) {
        this.MaxResourceNum = MaxResourceNum;
    }

    /**
     * Get <p>Supported committed use duration.</p> 
     * @return PrepaidUnderwritePeriods <p>Supported committed use duration.</p>
     */
    public Long [] getPrepaidUnderwritePeriods() {
        return this.PrepaidUnderwritePeriods;
    }

    /**
     * Set <p>Supported committed use duration.</p>
     * @param PrepaidUnderwritePeriods <p>Supported committed use duration.</p>
     */
    public void setPrepaidUnderwritePeriods(Long [] PrepaidUnderwritePeriods) {
        this.PrepaidUnderwritePeriods = PrepaidUnderwritePeriods;
    }

    /**
     * Get <p>Number of quotas.</p> 
     * @return QuotaNum <p>Number of quotas.</p>
     */
    public Long getQuotaNum() {
        return this.QuotaNum;
    }

    /**
     * Set <p>Number of quotas.</p>
     * @param QuotaNum <p>Number of quotas.</p>
     */
    public void setQuotaNum(Long QuotaNum) {
        this.QuotaNum = QuotaNum;
    }

    /**
     * Get <p>Quota unit.</p> 
     * @return QuotaUnit <p>Quota unit.</p>
     */
    public String getQuotaUnit() {
        return this.QuotaUnit;
    }

    /**
     * Set <p>Quota unit.</p>
     * @param QuotaUnit <p>Quota unit.</p>
     */
    public void setQuotaUnit(String QuotaUnit) {
        this.QuotaUnit = QuotaUnit;
    }

    public NodeResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeResource(NodeResource source) {
        if (source.ResourceConfigId != null) {
            this.ResourceConfigId = new Long(source.ResourceConfigId);
        }
        if (source.Resource != null) {
            this.Resource = new Resource(source.Resource);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new String(source.IsDefault);
        }
        if (source.MaxResourceNum != null) {
            this.MaxResourceNum = new Long(source.MaxResourceNum);
        }
        if (source.PrepaidUnderwritePeriods != null) {
            this.PrepaidUnderwritePeriods = new Long[source.PrepaidUnderwritePeriods.length];
            for (int i = 0; i < source.PrepaidUnderwritePeriods.length; i++) {
                this.PrepaidUnderwritePeriods[i] = new Long(source.PrepaidUnderwritePeriods[i]);
            }
        }
        if (source.QuotaNum != null) {
            this.QuotaNum = new Long(source.QuotaNum);
        }
        if (source.QuotaUnit != null) {
            this.QuotaUnit = new String(source.QuotaUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceConfigId", this.ResourceConfigId);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "MaxResourceNum", this.MaxResourceNum);
        this.setParamArraySimple(map, prefix + "PrepaidUnderwritePeriods.", this.PrepaidUnderwritePeriods);
        this.setParamSimple(map, prefix + "QuotaNum", this.QuotaNum);
        this.setParamSimple(map, prefix + "QuotaUnit", this.QuotaUnit);

    }
}

