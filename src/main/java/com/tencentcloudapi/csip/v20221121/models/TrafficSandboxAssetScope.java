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

public class TrafficSandboxAssetScope extends AbstractModel {

    /**
    * Instance ID. Only for host assets.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Container ID. This parameter is required only when the asset type is container.
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
     * Get Instance ID. Only for host assets. 
     * @return InstanceId Instance ID. Only for host assets.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Only for host assets.
     * @param InstanceId Instance ID. Only for host assets.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Container ID. This parameter is required only when the asset type is container. 
     * @return ContainerId Container ID. This parameter is required only when the asset type is container.
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set Container ID. This parameter is required only when the asset type is container.
     * @param ContainerId Container ID. This parameter is required only when the asset type is container.
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    public TrafficSandboxAssetScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxAssetScope(TrafficSandboxAssetScope source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);

    }
}

