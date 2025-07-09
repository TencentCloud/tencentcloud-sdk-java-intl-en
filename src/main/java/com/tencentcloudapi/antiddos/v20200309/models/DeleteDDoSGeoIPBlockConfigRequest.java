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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDDoSGeoIPBlockConfigRequest extends AbstractModel {

    /**
    * Anti-DDoS instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Region blocking configuration. The configuration ID cannot be empty when you set this parameter.
    */
    @SerializedName("DDoSGeoIPBlockConfig")
    @Expose
    private DDoSGeoIPBlockConfig DDoSGeoIPBlockConfig;

    /**
     * Get Anti-DDoS instance ID 
     * @return InstanceId Anti-DDoS instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Anti-DDoS instance ID
     * @param InstanceId Anti-DDoS instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Region blocking configuration. The configuration ID cannot be empty when you set this parameter. 
     * @return DDoSGeoIPBlockConfig Region blocking configuration. The configuration ID cannot be empty when you set this parameter.
     */
    public DDoSGeoIPBlockConfig getDDoSGeoIPBlockConfig() {
        return this.DDoSGeoIPBlockConfig;
    }

    /**
     * Set Region blocking configuration. The configuration ID cannot be empty when you set this parameter.
     * @param DDoSGeoIPBlockConfig Region blocking configuration. The configuration ID cannot be empty when you set this parameter.
     */
    public void setDDoSGeoIPBlockConfig(DDoSGeoIPBlockConfig DDoSGeoIPBlockConfig) {
        this.DDoSGeoIPBlockConfig = DDoSGeoIPBlockConfig;
    }

    public DeleteDDoSGeoIPBlockConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDDoSGeoIPBlockConfigRequest(DeleteDDoSGeoIPBlockConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DDoSGeoIPBlockConfig != null) {
            this.DDoSGeoIPBlockConfig = new DDoSGeoIPBlockConfig(source.DDoSGeoIPBlockConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "DDoSGeoIPBlockConfig.", this.DDoSGeoIPBlockConfig);

    }
}

