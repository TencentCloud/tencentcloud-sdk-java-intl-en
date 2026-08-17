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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangeReplicaToMasterRequest extends AbstractModel {

    /**
    * <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Replica node group ID. Use the interface <a href="https://www.tencentcloud.com/document/product/239/50312?from_cn_redirect=1">DescribeInstanceZoneInfo</a> to obtain the id information of the multi-AZ replica node group. For a single AZ, no need to configure this parameter.</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>Emergency mode.</p><p>Enumeration values:</p><ul><li>false: Standard mode (Recommended for security)</li><li>true: Speed mode: (High-risk acceleration) Skip verification, speed up primary node promotion. High-level operation, highly likely to cause a single primary node in abnormal situations.</li></ul><p>Default value: false</p>
    */
    @SerializedName("Emergency")
    @Expose
    private Boolean Emergency;

    /**
     * Get <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p> 
     * @return InstanceId <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     * @param InstanceId <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Replica node group ID. Use the interface <a href="https://www.tencentcloud.com/document/product/239/50312?from_cn_redirect=1">DescribeInstanceZoneInfo</a> to obtain the id information of the multi-AZ replica node group. For a single AZ, no need to configure this parameter.</p> 
     * @return GroupId <p>Replica node group ID. Use the interface <a href="https://www.tencentcloud.com/document/product/239/50312?from_cn_redirect=1">DescribeInstanceZoneInfo</a> to obtain the id information of the multi-AZ replica node group. For a single AZ, no need to configure this parameter.</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>Replica node group ID. Use the interface <a href="https://www.tencentcloud.com/document/product/239/50312?from_cn_redirect=1">DescribeInstanceZoneInfo</a> to obtain the id information of the multi-AZ replica node group. For a single AZ, no need to configure this parameter.</p>
     * @param GroupId <p>Replica node group ID. Use the interface <a href="https://www.tencentcloud.com/document/product/239/50312?from_cn_redirect=1">DescribeInstanceZoneInfo</a> to obtain the id information of the multi-AZ replica node group. For a single AZ, no need to configure this parameter.</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>Emergency mode.</p><p>Enumeration values:</p><ul><li>false: Standard mode (Recommended for security)</li><li>true: Speed mode: (High-risk acceleration) Skip verification, speed up primary node promotion. High-level operation, highly likely to cause a single primary node in abnormal situations.</li></ul><p>Default value: false</p> 
     * @return Emergency <p>Emergency mode.</p><p>Enumeration values:</p><ul><li>false: Standard mode (Recommended for security)</li><li>true: Speed mode: (High-risk acceleration) Skip verification, speed up primary node promotion. High-level operation, highly likely to cause a single primary node in abnormal situations.</li></ul><p>Default value: false</p>
     */
    public Boolean getEmergency() {
        return this.Emergency;
    }

    /**
     * Set <p>Emergency mode.</p><p>Enumeration values:</p><ul><li>false: Standard mode (Recommended for security)</li><li>true: Speed mode: (High-risk acceleration) Skip verification, speed up primary node promotion. High-level operation, highly likely to cause a single primary node in abnormal situations.</li></ul><p>Default value: false</p>
     * @param Emergency <p>Emergency mode.</p><p>Enumeration values:</p><ul><li>false: Standard mode (Recommended for security)</li><li>true: Speed mode: (High-risk acceleration) Skip verification, speed up primary node promotion. High-level operation, highly likely to cause a single primary node in abnormal situations.</li></ul><p>Default value: false</p>
     */
    public void setEmergency(Boolean Emergency) {
        this.Emergency = Emergency;
    }

    public ChangeReplicaToMasterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeReplicaToMasterRequest(ChangeReplicaToMasterRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Emergency != null) {
            this.Emergency = new Boolean(source.Emergency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Emergency", this.Emergency);

    }
}

