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

public class CreateCloudNativeAPIGatewayServiceRequest extends AbstractModel {

    /**
    * gateway ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Service name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Request protocol:
- https
- http
- tcp
- udp
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Timeout interval. Unit: ms
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Number of retries.
    */
    @SerializedName("Retries")
    @Expose
    private Long Retries;

    /**
    * Service type 
- Kubernetes 
- Registry
- IPList
- HostIP
- Scf	
    */
    @SerializedName("UpstreamType")
    @Expose
    private String UpstreamType;

    /**
    * Service configuration information
    */
    @SerializedName("UpstreamInfo")
    @Expose
    private KongUpstreamInfo UpstreamInfo;

    /**
    * Request path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

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
     * Get Service name 
     * @return Name Service name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Service name
     * @param Name Service name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Request protocol:
- https
- http
- tcp
- udp 
     * @return Protocol Request protocol:
- https
- http
- tcp
- udp
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Request protocol:
- https
- http
- tcp
- udp
     * @param Protocol Request protocol:
- https
- http
- tcp
- udp
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Timeout interval. Unit: ms 
     * @return Timeout Timeout interval. Unit: ms
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout interval. Unit: ms
     * @param Timeout Timeout interval. Unit: ms
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Number of retries. 
     * @return Retries Number of retries.
     */
    public Long getRetries() {
        return this.Retries;
    }

    /**
     * Set Number of retries.
     * @param Retries Number of retries.
     */
    public void setRetries(Long Retries) {
        this.Retries = Retries;
    }

    /**
     * Get Service type 
- Kubernetes 
- Registry
- IPList
- HostIP
- Scf	 
     * @return UpstreamType Service type 
- Kubernetes 
- Registry
- IPList
- HostIP
- Scf	
     */
    public String getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set Service type 
- Kubernetes 
- Registry
- IPList
- HostIP
- Scf	
     * @param UpstreamType Service type 
- Kubernetes 
- Registry
- IPList
- HostIP
- Scf	
     */
    public void setUpstreamType(String UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get Service configuration information 
     * @return UpstreamInfo Service configuration information
     */
    public KongUpstreamInfo getUpstreamInfo() {
        return this.UpstreamInfo;
    }

    /**
     * Set Service configuration information
     * @param UpstreamInfo Service configuration information
     */
    public void setUpstreamInfo(KongUpstreamInfo UpstreamInfo) {
        this.UpstreamInfo = UpstreamInfo;
    }

    /**
     * Get Request path 
     * @return Path Request path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Request path
     * @param Path Request path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public CreateCloudNativeAPIGatewayServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayServiceRequest(CreateCloudNativeAPIGatewayServiceRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Retries != null) {
            this.Retries = new Long(source.Retries);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new String(source.UpstreamType);
        }
        if (source.UpstreamInfo != null) {
            this.UpstreamInfo = new KongUpstreamInfo(source.UpstreamInfo);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Retries", this.Retries);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamObj(map, prefix + "UpstreamInfo.", this.UpstreamInfo);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

