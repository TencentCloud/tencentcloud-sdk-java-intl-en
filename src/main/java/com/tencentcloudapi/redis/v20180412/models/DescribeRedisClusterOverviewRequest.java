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

public class DescribeRedisClusterOverviewRequest extends AbstractModel {

    /**
    * CDC ID. Log in to the [CDC console](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1)
and obtain the cluster ID in the instance list.
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
     * Get CDC ID. Log in to the [CDC console](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1)
and obtain the cluster ID in the instance list. 
     * @return DedicatedClusterId CDC ID. Log in to the [CDC console](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1)
and obtain the cluster ID in the instance list.
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set CDC ID. Log in to the [CDC console](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1)
and obtain the cluster ID in the instance list.
     * @param DedicatedClusterId CDC ID. Log in to the [CDC console](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1)
and obtain the cluster ID in the instance list.
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    public DescribeRedisClusterOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRedisClusterOverviewRequest(DescribeRedisClusterOverviewRequest source) {
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);

    }
}

