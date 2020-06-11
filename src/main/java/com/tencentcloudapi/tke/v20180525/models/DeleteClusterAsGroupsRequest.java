/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteClusterAsGroupsRequest extends AbstractModel{

    /**
    * The cluster ID, obtained through the [DescribeClusters](https://cloud.tencent.com/document/api/457/31862) API.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster scaling group ID list
    */
    @SerializedName("AutoScalingGroupIds")
    @Expose
    private String [] AutoScalingGroupIds;

    /**
    * Whether to keep nodes in the scaling group. Default to **false** (not keep)
    */
    @SerializedName("KeepInstance")
    @Expose
    private Boolean KeepInstance;

    /**
     * Get The cluster ID, obtained through the [DescribeClusters](https://cloud.tencent.com/document/api/457/31862) API. 
     * @return ClusterId The cluster ID, obtained through the [DescribeClusters](https://cloud.tencent.com/document/api/457/31862) API.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The cluster ID, obtained through the [DescribeClusters](https://cloud.tencent.com/document/api/457/31862) API.
     * @param ClusterId The cluster ID, obtained through the [DescribeClusters](https://cloud.tencent.com/document/api/457/31862) API.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster scaling group ID list 
     * @return AutoScalingGroupIds Cluster scaling group ID list
     */
    public String [] getAutoScalingGroupIds() {
        return this.AutoScalingGroupIds;
    }

    /**
     * Set Cluster scaling group ID list
     * @param AutoScalingGroupIds Cluster scaling group ID list
     */
    public void setAutoScalingGroupIds(String [] AutoScalingGroupIds) {
        this.AutoScalingGroupIds = AutoScalingGroupIds;
    }

    /**
     * Get Whether to keep nodes in the scaling group. Default to **false** (not keep) 
     * @return KeepInstance Whether to keep nodes in the scaling group. Default to **false** (not keep)
     */
    public Boolean getKeepInstance() {
        return this.KeepInstance;
    }

    /**
     * Set Whether to keep nodes in the scaling group. Default to **false** (not keep)
     * @param KeepInstance Whether to keep nodes in the scaling group. Default to **false** (not keep)
     */
    public void setKeepInstance(Boolean KeepInstance) {
        this.KeepInstance = KeepInstance;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "AutoScalingGroupIds.", this.AutoScalingGroupIds);
        this.setParamSimple(map, prefix + "KeepInstance", this.KeepInstance);

    }
}

