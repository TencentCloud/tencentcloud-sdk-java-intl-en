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

public class ModifyUpstreamNodeStatusRequest extends AbstractModel {

    /**
    * Gateway instance ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Service name
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Access IP address or domain name
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Access Port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * HEALTHY or UNHEALTHY
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Gateway instance ID 
     * @return GatewayId Gateway instance ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway instance ID
     * @param GatewayId Gateway instance ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Service name 
     * @return ServiceName Service name
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name
     * @param ServiceName Service name
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Access IP address or domain name 
     * @return Host Access IP address or domain name
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Access IP address or domain name
     * @param Host Access IP address or domain name
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Access Port 
     * @return Port Access Port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Access Port
     * @param Port Access Port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get HEALTHY or UNHEALTHY 
     * @return Status HEALTHY or UNHEALTHY
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set HEALTHY or UNHEALTHY
     * @param Status HEALTHY or UNHEALTHY
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyUpstreamNodeStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUpstreamNodeStatusRequest(ModifyUpstreamNodeStatusRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

