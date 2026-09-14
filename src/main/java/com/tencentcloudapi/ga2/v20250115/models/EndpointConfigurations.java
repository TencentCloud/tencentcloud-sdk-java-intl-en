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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndpointConfigurations extends AbstractModel {

    /**
    * <p>Domain type. Available values: 'Domain', 'PublicIp'.</p>
    */
    @SerializedName("EndpointType")
    @Expose
    private String EndpointType;

    /**
    * <p>Domain name.</p>
    */
    @SerializedName("EndpointService")
    @Expose
    private String EndpointService;

    /**
    * <p>Weight.</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>Health check status; HEALTH: healthy; UNHEALTH: unhealthy.</p>
    */
    @SerializedName("HealthCheckStatus")
    @Expose
    private String HealthCheckStatus;

    /**
     * Get <p>Domain type. Available values: 'Domain', 'PublicIp'.</p> 
     * @return EndpointType <p>Domain type. Available values: 'Domain', 'PublicIp'.</p>
     */
    public String getEndpointType() {
        return this.EndpointType;
    }

    /**
     * Set <p>Domain type. Available values: 'Domain', 'PublicIp'.</p>
     * @param EndpointType <p>Domain type. Available values: 'Domain', 'PublicIp'.</p>
     */
    public void setEndpointType(String EndpointType) {
        this.EndpointType = EndpointType;
    }

    /**
     * Get <p>Domain name.</p> 
     * @return EndpointService <p>Domain name.</p>
     */
    public String getEndpointService() {
        return this.EndpointService;
    }

    /**
     * Set <p>Domain name.</p>
     * @param EndpointService <p>Domain name.</p>
     */
    public void setEndpointService(String EndpointService) {
        this.EndpointService = EndpointService;
    }

    /**
     * Get <p>Weight.</p> 
     * @return Weight <p>Weight.</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>Weight.</p>
     * @param Weight <p>Weight.</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>Health check status; HEALTH: healthy; UNHEALTH: unhealthy.</p> 
     * @return HealthCheckStatus <p>Health check status; HEALTH: healthy; UNHEALTH: unhealthy.</p>
     */
    public String getHealthCheckStatus() {
        return this.HealthCheckStatus;
    }

    /**
     * Set <p>Health check status; HEALTH: healthy; UNHEALTH: unhealthy.</p>
     * @param HealthCheckStatus <p>Health check status; HEALTH: healthy; UNHEALTH: unhealthy.</p>
     */
    public void setHealthCheckStatus(String HealthCheckStatus) {
        this.HealthCheckStatus = HealthCheckStatus;
    }

    public EndpointConfigurations() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndpointConfigurations(EndpointConfigurations source) {
        if (source.EndpointType != null) {
            this.EndpointType = new String(source.EndpointType);
        }
        if (source.EndpointService != null) {
            this.EndpointService = new String(source.EndpointService);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.HealthCheckStatus != null) {
            this.HealthCheckStatus = new String(source.HealthCheckStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointType", this.EndpointType);
        this.setParamSimple(map, prefix + "EndpointService", this.EndpointService);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "HealthCheckStatus", this.HealthCheckStatus);

    }
}

