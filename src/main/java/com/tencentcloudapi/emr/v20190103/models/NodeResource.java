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
    * Configuration ID.
    */
    @SerializedName("ResourceConfigId")
    @Expose
    private Long ResourceConfigId;

    /**
    * Resource
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resource")
    @Expose
    private Resource Resource;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Whether default configuration applies, DEFAULT or BACKUP.
    */
    @SerializedName("IsDefault")
    @Expose
    private String IsDefault;

    /**
    * Remaining of this type.
    */
    @SerializedName("MaxResourceNum")
    @Expose
    private Long MaxResourceNum;

    /**
    * Supported committed use duration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrepaidUnderwritePeriods")
    @Expose
    private Long [] PrepaidUnderwritePeriods;

    /**
     * Get Configuration ID. 
     * @return ResourceConfigId Configuration ID.
     */
    public Long getResourceConfigId() {
        return this.ResourceConfigId;
    }

    /**
     * Set Configuration ID.
     * @param ResourceConfigId Configuration ID.
     */
    public void setResourceConfigId(Long ResourceConfigId) {
        this.ResourceConfigId = ResourceConfigId;
    }

    /**
     * Get Resource
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Resource Resource
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Resource getResource() {
        return this.Resource;
    }

    /**
     * Set Resource
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Resource Resource
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResource(Resource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Whether default configuration applies, DEFAULT or BACKUP. 
     * @return IsDefault Whether default configuration applies, DEFAULT or BACKUP.
     */
    public String getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether default configuration applies, DEFAULT or BACKUP.
     * @param IsDefault Whether default configuration applies, DEFAULT or BACKUP.
     */
    public void setIsDefault(String IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Remaining of this type. 
     * @return MaxResourceNum Remaining of this type.
     */
    public Long getMaxResourceNum() {
        return this.MaxResourceNum;
    }

    /**
     * Set Remaining of this type.
     * @param MaxResourceNum Remaining of this type.
     */
    public void setMaxResourceNum(Long MaxResourceNum) {
        this.MaxResourceNum = MaxResourceNum;
    }

    /**
     * Get Supported committed use duration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrepaidUnderwritePeriods Supported committed use duration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getPrepaidUnderwritePeriods() {
        return this.PrepaidUnderwritePeriods;
    }

    /**
     * Set Supported committed use duration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrepaidUnderwritePeriods Supported committed use duration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrepaidUnderwritePeriods(Long [] PrepaidUnderwritePeriods) {
        this.PrepaidUnderwritePeriods = PrepaidUnderwritePeriods;
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

    }
}

