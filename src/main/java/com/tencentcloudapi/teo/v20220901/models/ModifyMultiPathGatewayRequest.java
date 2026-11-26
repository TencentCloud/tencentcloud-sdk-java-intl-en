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
    * Gateway ID.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Gateway name, up to 16 characters. Usable characters: a-z, A-Z, 0-9, -, _.
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * Gateway address. When GatewayType is private, you can fill in and modify this address. Before using this address, please ensure it has been entered into the Tencent Cloud multi-channel security acceleration gateway system. If not, enter the gateway IP address into the Tencent Cloud multi-channel security acceleration gateway system in advance through a ticket or by contacting the architect before calling this API.
    */
    @SerializedName("GatewayIP")
    @Expose
    private String GatewayIP;

    /**
    * Gateway port. Value range: 1–65535 (excluding 8888). Modification is supported only for private gateways with a GatewayType value of private.
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
     * Get Gateway ID. 
     * @return GatewayId Gateway ID.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway ID.
     * @param GatewayId Gateway ID.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Gateway name, up to 16 characters. Usable characters: a-z, A-Z, 0-9, -, _. 
     * @return GatewayName Gateway name, up to 16 characters. Usable characters: a-z, A-Z, 0-9, -, _.
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set Gateway name, up to 16 characters. Usable characters: a-z, A-Z, 0-9, -, _.
     * @param GatewayName Gateway name, up to 16 characters. Usable characters: a-z, A-Z, 0-9, -, _.
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get Gateway address. When GatewayType is private, you can fill in and modify this address. Before using this address, please ensure it has been entered into the Tencent Cloud multi-channel security acceleration gateway system. If not, enter the gateway IP address into the Tencent Cloud multi-channel security acceleration gateway system in advance through a ticket or by contacting the architect before calling this API. 
     * @return GatewayIP Gateway address. When GatewayType is private, you can fill in and modify this address. Before using this address, please ensure it has been entered into the Tencent Cloud multi-channel security acceleration gateway system. If not, enter the gateway IP address into the Tencent Cloud multi-channel security acceleration gateway system in advance through a ticket or by contacting the architect before calling this API.
     */
    public String getGatewayIP() {
        return this.GatewayIP;
    }

    /**
     * Set Gateway address. When GatewayType is private, you can fill in and modify this address. Before using this address, please ensure it has been entered into the Tencent Cloud multi-channel security acceleration gateway system. If not, enter the gateway IP address into the Tencent Cloud multi-channel security acceleration gateway system in advance through a ticket or by contacting the architect before calling this API.
     * @param GatewayIP Gateway address. When GatewayType is private, you can fill in and modify this address. Before using this address, please ensure it has been entered into the Tencent Cloud multi-channel security acceleration gateway system. If not, enter the gateway IP address into the Tencent Cloud multi-channel security acceleration gateway system in advance through a ticket or by contacting the architect before calling this API.
     */
    public void setGatewayIP(String GatewayIP) {
        this.GatewayIP = GatewayIP;
    }

    /**
     * Get Gateway port. Value range: 1–65535 (excluding 8888). Modification is supported only for private gateways with a GatewayType value of private. 
     * @return GatewayPort Gateway port. Value range: 1–65535 (excluding 8888). Modification is supported only for private gateways with a GatewayType value of private.
     */
    public Long getGatewayPort() {
        return this.GatewayPort;
    }

    /**
     * Set Gateway port. Value range: 1–65535 (excluding 8888). Modification is supported only for private gateways with a GatewayType value of private.
     * @param GatewayPort Gateway port. Value range: 1–65535 (excluding 8888). Modification is supported only for private gateways with a GatewayType value of private.
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

