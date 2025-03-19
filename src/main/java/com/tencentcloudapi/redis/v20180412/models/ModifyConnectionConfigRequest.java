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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyConnectionConfigRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Additional bandwidth in MB, which should be greater than 0.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Total number of connections per shard.
- When read-only replicas are not enabled, the lower limit is 10,000 and the upper limit is 40,000.
- When read-only replicas are enabled, the lower limit is 10,000, and the upper limit is calculated as follows: 10,000 x (Number of read-only replicas + 3).
    */
    @SerializedName("ClientLimit")
    @Expose
    private Long ClientLimit;

    /**
     * Get Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list. 
     * @return InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     * @param InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Additional bandwidth in MB, which should be greater than 0. 
     * @return Bandwidth Additional bandwidth in MB, which should be greater than 0.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Additional bandwidth in MB, which should be greater than 0.
     * @param Bandwidth Additional bandwidth in MB, which should be greater than 0.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Total number of connections per shard.
- When read-only replicas are not enabled, the lower limit is 10,000 and the upper limit is 40,000.
- When read-only replicas are enabled, the lower limit is 10,000, and the upper limit is calculated as follows: 10,000 x (Number of read-only replicas + 3). 
     * @return ClientLimit Total number of connections per shard.
- When read-only replicas are not enabled, the lower limit is 10,000 and the upper limit is 40,000.
- When read-only replicas are enabled, the lower limit is 10,000, and the upper limit is calculated as follows: 10,000 x (Number of read-only replicas + 3).
     */
    public Long getClientLimit() {
        return this.ClientLimit;
    }

    /**
     * Set Total number of connections per shard.
- When read-only replicas are not enabled, the lower limit is 10,000 and the upper limit is 40,000.
- When read-only replicas are enabled, the lower limit is 10,000, and the upper limit is calculated as follows: 10,000 x (Number of read-only replicas + 3).
     * @param ClientLimit Total number of connections per shard.
- When read-only replicas are not enabled, the lower limit is 10,000 and the upper limit is 40,000.
- When read-only replicas are enabled, the lower limit is 10,000, and the upper limit is calculated as follows: 10,000 x (Number of read-only replicas + 3).
     */
    public void setClientLimit(Long ClientLimit) {
        this.ClientLimit = ClientLimit;
    }

    public ModifyConnectionConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConnectionConfigRequest(ModifyConnectionConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.ClientLimit != null) {
            this.ClientLimit = new Long(source.ClientLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "ClientLimit", this.ClientLimit);

    }
}

