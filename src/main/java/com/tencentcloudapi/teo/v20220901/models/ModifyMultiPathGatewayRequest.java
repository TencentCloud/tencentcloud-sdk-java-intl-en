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

public class ModifyMultiPathGatewayRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Specifies the gateway ID.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Gateway name, up to 16 characters, allowed characters (a-z, A-Z, 0-9, -, _).
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * Gateway address, if GatewayType value is private (private gateway), you can fill in and modify it. When using this address, please ensure it has been entered into the Tencent cloud multi-channel security acceleration gateway system. if not entered, you need to submit a ticket or contact the architect to enter the gateway IP address into the Tencent cloud multi-channel security acceleration gateway system in advance before making API calls.
    */
    @SerializedName("GatewayIP")
    @Expose
    private String GatewayIP;

    /**
    * Gateway port, range 1-65535 (excluding 8888), supports modifying GatewayType with a value of private gateway.
    */
    @SerializedName("GatewayPort")
    @Expose
    private Long GatewayPort;

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
     * Get Specifies the gateway ID. 
     * @return GatewayId Specifies the gateway ID.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Specifies the gateway ID.
     * @param GatewayId Specifies the gateway ID.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Gateway name, up to 16 characters, allowed characters (a-z, A-Z, 0-9, -, _). 
     * @return GatewayName Gateway name, up to 16 characters, allowed characters (a-z, A-Z, 0-9, -, _).
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set Gateway name, up to 16 characters, allowed characters (a-z, A-Z, 0-9, -, _).
     * @param GatewayName Gateway name, up to 16 characters, allowed characters (a-z, A-Z, 0-9, -, _).
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get Gateway address, if GatewayType value is private (private gateway), you can fill in and modify it. When using this address, please ensure it has been entered into the Tencent cloud multi-channel security acceleration gateway system. if not entered, you need to submit a ticket or contact the architect to enter the gateway IP address into the Tencent cloud multi-channel security acceleration gateway system in advance before making API calls. 
     * @return GatewayIP Gateway address, if GatewayType value is private (private gateway), you can fill in and modify it. When using this address, please ensure it has been entered into the Tencent cloud multi-channel security acceleration gateway system. if not entered, you need to submit a ticket or contact the architect to enter the gateway IP address into the Tencent cloud multi-channel security acceleration gateway system in advance before making API calls.
     */
    public String getGatewayIP() {
        return this.GatewayIP;
    }

    /**
     * Set Gateway address, if GatewayType value is private (private gateway), you can fill in and modify it. When using this address, please ensure it has been entered into the Tencent cloud multi-channel security acceleration gateway system. if not entered, you need to submit a ticket or contact the architect to enter the gateway IP address into the Tencent cloud multi-channel security acceleration gateway system in advance before making API calls.
     * @param GatewayIP Gateway address, if GatewayType value is private (private gateway), you can fill in and modify it. When using this address, please ensure it has been entered into the Tencent cloud multi-channel security acceleration gateway system. if not entered, you need to submit a ticket or contact the architect to enter the gateway IP address into the Tencent cloud multi-channel security acceleration gateway system in advance before making API calls.
     */
    public void setGatewayIP(String GatewayIP) {
        this.GatewayIP = GatewayIP;
    }

    /**
     * Get Gateway port, range 1-65535 (excluding 8888), supports modifying GatewayType with a value of private gateway. 
     * @return GatewayPort Gateway port, range 1-65535 (excluding 8888), supports modifying GatewayType with a value of private gateway.
     */
    public Long getGatewayPort() {
        return this.GatewayPort;
    }

    /**
     * Set Gateway port, range 1-65535 (excluding 8888), supports modifying GatewayType with a value of private gateway.
     * @param GatewayPort Gateway port, range 1-65535 (excluding 8888), supports modifying GatewayType with a value of private gateway.
     */
    public void setGatewayPort(Long GatewayPort) {
        this.GatewayPort = GatewayPort;
    }

    public ModifyMultiPathGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMultiPathGatewayRequest(ModifyMultiPathGatewayRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.GatewayIP != null) {
            this.GatewayIP = new String(source.GatewayIP);
        }
        if (source.GatewayPort != null) {
            this.GatewayPort = new Long(source.GatewayPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamSimple(map, prefix + "GatewayIP", this.GatewayIP);
        this.setParamSimple(map, prefix + "GatewayPort", this.GatewayPort);

    }
}

