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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateUpstreamHealthCheckConfigRequest extends AbstractModel {

    /**
    * gateway ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Gateway service name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Health check configuration
    */
    @SerializedName("HealthCheckConfig")
    @Expose
    private UpstreamHealthCheckConfig HealthCheckConfig;

    /**
     * Get gateway ID 
     * @return GatewayId gateway ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set gateway ID
     * @param GatewayId gateway ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Gateway service name. 
     * @return Name Gateway service name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Gateway service name.
     * @param Name Gateway service name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Health check configuration 
     * @return HealthCheckConfig Health check configuration
     */
    public UpstreamHealthCheckConfig getHealthCheckConfig() {
        return this.HealthCheckConfig;
    }

    /**
     * Set Health check configuration
     * @param HealthCheckConfig Health check configuration
     */
    public void setHealthCheckConfig(UpstreamHealthCheckConfig HealthCheckConfig) {
        this.HealthCheckConfig = HealthCheckConfig;
    }

    public UpdateUpstreamHealthCheckConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUpstreamHealthCheckConfigRequest(UpdateUpstreamHealthCheckConfigRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.HealthCheckConfig != null) {
            this.HealthCheckConfig = new UpstreamHealthCheckConfig(source.HealthCheckConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "HealthCheckConfig.", this.HealthCheckConfig);

    }
}

