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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMultiPathGatewayRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Gateway type. valid values:
<Li> Cloud: cloud gateway, a gateway created and managed by Tencent cloud;</li>
<Li>Private: private gateway, a user-deployed private gateway.</li>
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * Gateway name: up to 16 characters, allowed characters (a-z, A-Z, 0-9, -, _).
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * Gateway port: value range: 1-65535 (excluding 8888).
    */
    @SerializedName("GatewayPort")
    @Expose
    private Long GatewayPort;

    /**
    * Gateway region: GatewayType value is cloud (cloud gateway). required. RegionId list can be obtained from the DescribeMultiPathGatewayRegions API.
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Gateway address (required when GatewayType=private):
Before using this address, ensure it has been registered in the Tencent Cloud Multi-Path Security Acceleration Gateway system. 
If not registered, submit a support ticket or contact your architect to pre-register the gateway IP address in the system before API invocation.
    */
    @SerializedName("GatewayIP")
    @Expose
    private String GatewayIP;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Gateway type. valid values:
<Li> Cloud: cloud gateway, a gateway created and managed by Tencent cloud;</li>
<Li>Private: private gateway, a user-deployed private gateway.</li> 
     * @return GatewayType Gateway type. valid values:
<Li> Cloud: cloud gateway, a gateway created and managed by Tencent cloud;</li>
<Li>Private: private gateway, a user-deployed private gateway.</li>
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set Gateway type. valid values:
<Li> Cloud: cloud gateway, a gateway created and managed by Tencent cloud;</li>
<Li>Private: private gateway, a user-deployed private gateway.</li>
     * @param GatewayType Gateway type. valid values:
<Li> Cloud: cloud gateway, a gateway created and managed by Tencent cloud;</li>
<Li>Private: private gateway, a user-deployed private gateway.</li>
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get Gateway name: up to 16 characters, allowed characters (a-z, A-Z, 0-9, -, _). 
     * @return GatewayName Gateway name: up to 16 characters, allowed characters (a-z, A-Z, 0-9, -, _).
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set Gateway name: up to 16 characters, allowed characters (a-z, A-Z, 0-9, -, _).
     * @param GatewayName Gateway name: up to 16 characters, allowed characters (a-z, A-Z, 0-9, -, _).
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get Gateway port: value range: 1-65535 (excluding 8888). 
     * @return GatewayPort Gateway port: value range: 1-65535 (excluding 8888).
     */
    public Long getGatewayPort() {
        return this.GatewayPort;
    }

    /**
     * Set Gateway port: value range: 1-65535 (excluding 8888).
     * @param GatewayPort Gateway port: value range: 1-65535 (excluding 8888).
     */
    public void setGatewayPort(Long GatewayPort) {
        this.GatewayPort = GatewayPort;
    }

    /**
     * Get Gateway region: GatewayType value is cloud (cloud gateway). required. RegionId list can be obtained from the DescribeMultiPathGatewayRegions API. 
     * @return RegionId Gateway region: GatewayType value is cloud (cloud gateway). required. RegionId list can be obtained from the DescribeMultiPathGatewayRegions API.
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Gateway region: GatewayType value is cloud (cloud gateway). required. RegionId list can be obtained from the DescribeMultiPathGatewayRegions API.
     * @param RegionId Gateway region: GatewayType value is cloud (cloud gateway). required. RegionId list can be obtained from the DescribeMultiPathGatewayRegions API.
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Gateway address (required when GatewayType=private):
Before using this address, ensure it has been registered in the Tencent Cloud Multi-Path Security Acceleration Gateway system. 
If not registered, submit a support ticket or contact your architect to pre-register the gateway IP address in the system before API invocation. 
     * @return GatewayIP Gateway address (required when GatewayType=private):
Before using this address, ensure it has been registered in the Tencent Cloud Multi-Path Security Acceleration Gateway system. 
If not registered, submit a support ticket or contact your architect to pre-register the gateway IP address in the system before API invocation.
     */
    public String getGatewayIP() {
        return this.GatewayIP;
    }

    /**
     * Set Gateway address (required when GatewayType=private):
Before using this address, ensure it has been registered in the Tencent Cloud Multi-Path Security Acceleration Gateway system. 
If not registered, submit a support ticket or contact your architect to pre-register the gateway IP address in the system before API invocation.
     * @param GatewayIP Gateway address (required when GatewayType=private):
Before using this address, ensure it has been registered in the Tencent Cloud Multi-Path Security Acceleration Gateway system. 
If not registered, submit a support ticket or contact your architect to pre-register the gateway IP address in the system before API invocation.
     */
    public void setGatewayIP(String GatewayIP) {
        this.GatewayIP = GatewayIP;
    }

    public CreateMultiPathGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMultiPathGatewayRequest(CreateMultiPathGatewayRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.GatewayPort != null) {
            this.GatewayPort = new Long(source.GatewayPort);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.GatewayIP != null) {
            this.GatewayIP = new String(source.GatewayIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamSimple(map, prefix + "GatewayPort", this.GatewayPort);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "GatewayIP", this.GatewayIP);

    }
}

