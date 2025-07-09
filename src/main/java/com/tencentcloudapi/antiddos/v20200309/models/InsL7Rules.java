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

public class InsL7Rules extends AbstractModel {

    /**
    * Rules can only be modified when the status is `0`, `2`, or `8`.
Rule status. Values: `0` (Normal), `1` (Being configured), `2` (Configuration failed), `3` (Being deleted), `5` (Failed to be deleted), `6` (Pending add), `7` (Pending delete), `8` (Pending certificate upload), `9` (Associated resource not exist), `10` (Pending modify), `11` (Being modified).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Protocol
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Instance ID
    */
    @SerializedName("InsId")
    @Expose
    private String InsId;

    /**
    * User App ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * High-defense port
    */
    @SerializedName("VirtualPort")
    @Expose
    private String VirtualPort;

    /**
    * Certificate ID
    */
    @SerializedName("SSLId")
    @Expose
    private String SSLId;

    /**
     * Get Rules can only be modified when the status is `0`, `2`, or `8`.
Rule status. Values: `0` (Normal), `1` (Being configured), `2` (Configuration failed), `3` (Being deleted), `5` (Failed to be deleted), `6` (Pending add), `7` (Pending delete), `8` (Pending certificate upload), `9` (Associated resource not exist), `10` (Pending modify), `11` (Being modified). 
     * @return Status Rules can only be modified when the status is `0`, `2`, or `8`.
Rule status. Values: `0` (Normal), `1` (Being configured), `2` (Configuration failed), `3` (Being deleted), `5` (Failed to be deleted), `6` (Pending add), `7` (Pending delete), `8` (Pending certificate upload), `9` (Associated resource not exist), `10` (Pending modify), `11` (Being modified).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Rules can only be modified when the status is `0`, `2`, or `8`.
Rule status. Values: `0` (Normal), `1` (Being configured), `2` (Configuration failed), `3` (Being deleted), `5` (Failed to be deleted), `6` (Pending add), `7` (Pending delete), `8` (Pending certificate upload), `9` (Associated resource not exist), `10` (Pending modify), `11` (Being modified).
     * @param Status Rules can only be modified when the status is `0`, `2`, or `8`.
Rule status. Values: `0` (Normal), `1` (Being configured), `2` (Configuration failed), `3` (Being deleted), `5` (Failed to be deleted), `6` (Pending add), `7` (Pending delete), `8` (Pending certificate upload), `9` (Associated resource not exist), `10` (Pending modify), `11` (Being modified).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Protocol 
     * @return Protocol Protocol
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol
     * @param Protocol Protocol
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Instance ID 
     * @return InsId Instance ID
     */
    public String getInsId() {
        return this.InsId;
    }

    /**
     * Set Instance ID
     * @param InsId Instance ID
     */
    public void setInsId(String InsId) {
        this.InsId = InsId;
    }

    /**
     * Get User App ID 
     * @return AppId User App ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User App ID
     * @param AppId User App ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get High-defense port 
     * @return VirtualPort High-defense port
     */
    public String getVirtualPort() {
        return this.VirtualPort;
    }

    /**
     * Set High-defense port
     * @param VirtualPort High-defense port
     */
    public void setVirtualPort(String VirtualPort) {
        this.VirtualPort = VirtualPort;
    }

    /**
     * Get Certificate ID 
     * @return SSLId Certificate ID
     */
    public String getSSLId() {
        return this.SSLId;
    }

    /**
     * Set Certificate ID
     * @param SSLId Certificate ID
     */
    public void setSSLId(String SSLId) {
        this.SSLId = SSLId;
    }

    public InsL7Rules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InsL7Rules(InsL7Rules source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.InsId != null) {
            this.InsId = new String(source.InsId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.VirtualPort != null) {
            this.VirtualPort = new String(source.VirtualPort);
        }
        if (source.SSLId != null) {
            this.SSLId = new String(source.SSLId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "InsId", this.InsId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "VirtualPort", this.VirtualPort);
        this.setParamSimple(map, prefix + "SSLId", this.SSLId);

    }
}

