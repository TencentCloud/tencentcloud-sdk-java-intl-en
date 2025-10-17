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

public class DescribeInstanceSupportFeatureRequest extends AbstractModel {

    /**
    * Specifies the instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), and copy it from the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The features that support queries are as follows.
- read-local-node-only: nearby access.
- multi-account: multi-account management.
- auto-failback: fault recovery scenario, such as whether automatic failback is enabled for the primary node.
    */
    @SerializedName("FeatureName")
    @Expose
    private String FeatureName;

    /**
     * Get Specifies the instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), and copy it from the instance list. 
     * @return InstanceId Specifies the instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), and copy it from the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Specifies the instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), and copy it from the instance list.
     * @param InstanceId Specifies the instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), and copy it from the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The features that support queries are as follows.
- read-local-node-only: nearby access.
- multi-account: multi-account management.
- auto-failback: fault recovery scenario, such as whether automatic failback is enabled for the primary node. 
     * @return FeatureName The features that support queries are as follows.
- read-local-node-only: nearby access.
- multi-account: multi-account management.
- auto-failback: fault recovery scenario, such as whether automatic failback is enabled for the primary node.
     */
    public String getFeatureName() {
        return this.FeatureName;
    }

    /**
     * Set The features that support queries are as follows.
- read-local-node-only: nearby access.
- multi-account: multi-account management.
- auto-failback: fault recovery scenario, such as whether automatic failback is enabled for the primary node.
     * @param FeatureName The features that support queries are as follows.
- read-local-node-only: nearby access.
- multi-account: multi-account management.
- auto-failback: fault recovery scenario, such as whether automatic failback is enabled for the primary node.
     */
    public void setFeatureName(String FeatureName) {
        this.FeatureName = FeatureName;
    }

    public DescribeInstanceSupportFeatureRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceSupportFeatureRequest(DescribeInstanceSupportFeatureRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FeatureName != null) {
            this.FeatureName = new String(source.FeatureName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "FeatureName", this.FeatureName);

    }
}

