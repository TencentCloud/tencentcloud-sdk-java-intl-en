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

public class CreateNativeGatewayServiceSourceRequest extends AbstractModel {

    /**
    * Gateway instance ID
    */
    @SerializedName("GatewayID")
    @Expose
    private String GatewayID;

    /**
    * Service source type. Reference value:
- TSE-Nacos 
- TSE-Consul 
- TSE-PolarisMesh
- Customer-Nacos
- Customer-Consul
- Customer-PolarisMesh
- TSF
- TKE
- EKS
- PrivateDNS
- Customer-DNS
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * Instance ID of the service source. Required when SourceType is not PrivateDNS or Customer-DNS.
    */
    @SerializedName("SourceID")
    @Expose
    private String SourceID;

    /**
    * Source instance name of the service. Required when SourceType is not PrivateDNS.
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * Service source instance additional information
    */
    @SerializedName("SourceInfo")
    @Expose
    private SourceInfo SourceInfo;

    /**
     * Get Gateway instance ID 
     * @return GatewayID Gateway instance ID
     */
    public String getGatewayID() {
        return this.GatewayID;
    }

    /**
     * Set Gateway instance ID
     * @param GatewayID Gateway instance ID
     */
    public void setGatewayID(String GatewayID) {
        this.GatewayID = GatewayID;
    }

    /**
     * Get Service source type. Reference value:
- TSE-Nacos 
- TSE-Consul 
- TSE-PolarisMesh
- Customer-Nacos
- Customer-Consul
- Customer-PolarisMesh
- TSF
- TKE
- EKS
- PrivateDNS
- Customer-DNS 
     * @return SourceType Service source type. Reference value:
- TSE-Nacos 
- TSE-Consul 
- TSE-PolarisMesh
- Customer-Nacos
- Customer-Consul
- Customer-PolarisMesh
- TSF
- TKE
- EKS
- PrivateDNS
- Customer-DNS
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Service source type. Reference value:
- TSE-Nacos 
- TSE-Consul 
- TSE-PolarisMesh
- Customer-Nacos
- Customer-Consul
- Customer-PolarisMesh
- TSF
- TKE
- EKS
- PrivateDNS
- Customer-DNS
     * @param SourceType Service source type. Reference value:
- TSE-Nacos 
- TSE-Consul 
- TSE-PolarisMesh
- Customer-Nacos
- Customer-Consul
- Customer-PolarisMesh
- TSF
- TKE
- EKS
- PrivateDNS
- Customer-DNS
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Instance ID of the service source. Required when SourceType is not PrivateDNS or Customer-DNS. 
     * @return SourceID Instance ID of the service source. Required when SourceType is not PrivateDNS or Customer-DNS.
     */
    public String getSourceID() {
        return this.SourceID;
    }

    /**
     * Set Instance ID of the service source. Required when SourceType is not PrivateDNS or Customer-DNS.
     * @param SourceID Instance ID of the service source. Required when SourceType is not PrivateDNS or Customer-DNS.
     */
    public void setSourceID(String SourceID) {
        this.SourceID = SourceID;
    }

    /**
     * Get Source instance name of the service. Required when SourceType is not PrivateDNS. 
     * @return SourceName Source instance name of the service. Required when SourceType is not PrivateDNS.
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set Source instance name of the service. Required when SourceType is not PrivateDNS.
     * @param SourceName Source instance name of the service. Required when SourceType is not PrivateDNS.
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get Service source instance additional information 
     * @return SourceInfo Service source instance additional information
     */
    public SourceInfo getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set Service source instance additional information
     * @param SourceInfo Service source instance additional information
     */
    public void setSourceInfo(SourceInfo SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    public CreateNativeGatewayServiceSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNativeGatewayServiceSourceRequest(CreateNativeGatewayServiceSourceRequest source) {
        if (source.GatewayID != null) {
            this.GatewayID = new String(source.GatewayID);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceID != null) {
            this.SourceID = new String(source.SourceID);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new SourceInfo(source.SourceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayID", this.GatewayID);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceID", this.SourceID);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);

    }
}

