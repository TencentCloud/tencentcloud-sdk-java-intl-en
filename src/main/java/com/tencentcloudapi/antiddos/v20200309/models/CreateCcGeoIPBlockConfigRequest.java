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

public class CreateCcGeoIPBlockConfigRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * IP address
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Protocol type
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * CC regional blocking configuration
    */
    @SerializedName("CcGeoIPBlockConfig")
    @Expose
    private CcGeoIPBlockConfig CcGeoIPBlockConfig;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get IP address 
     * @return IP IP address
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP address
     * @param IP IP address
     */
    public void setIP(String IP) {
        this.IP = IP;
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
     * Get Protocol type 
     * @return Protocol Protocol type
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol type
     * @param Protocol Protocol type
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get CC regional blocking configuration 
     * @return CcGeoIPBlockConfig CC regional blocking configuration
     */
    public CcGeoIPBlockConfig getCcGeoIPBlockConfig() {
        return this.CcGeoIPBlockConfig;
    }

    /**
     * Set CC regional blocking configuration
     * @param CcGeoIPBlockConfig CC regional blocking configuration
     */
    public void setCcGeoIPBlockConfig(CcGeoIPBlockConfig CcGeoIPBlockConfig) {
        this.CcGeoIPBlockConfig = CcGeoIPBlockConfig;
    }

    public CreateCcGeoIPBlockConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCcGeoIPBlockConfigRequest(CreateCcGeoIPBlockConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.CcGeoIPBlockConfig != null) {
            this.CcGeoIPBlockConfig = new CcGeoIPBlockConfig(source.CcGeoIPBlockConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "CcGeoIPBlockConfig.", this.CcGeoIPBlockConfig);

    }
}

