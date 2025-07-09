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

public class ModifyApplicationProxyRequest extends AbstractModel {

    /**
    * Site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Proxy ID.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Domain name or subdomain name when `ProxyType=hostname`; 
Instance name when `ProxyType=instance`.
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * The session persistence duration. Value range: 30-3600 (in seconds).
The original configuration will apply if this field is not specified.
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * L4 proxy mode. Valid values: 
<li>instance: Instance mode. </li>If it is not specified, instance is used by default.
    */
    @SerializedName("ProxyType")
    @Expose
    private String ProxyType;

    /**
    * IPv6 access configuration. The original configuration will apply if it is not specified.
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * Cross-MLC-border acceleration. The original configuration will apply if it is not specified.
    */
    @SerializedName("AccelerateMainland")
    @Expose
    private AccelerateMainland AccelerateMainland;

    /**
     * Get Site ID. 
     * @return ZoneId Site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID.
     * @param ZoneId Site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Proxy ID. 
     * @return ProxyId Proxy ID.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Proxy ID.
     * @param ProxyId Proxy ID.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Domain name or subdomain name when `ProxyType=hostname`; 
Instance name when `ProxyType=instance`. 
     * @return ProxyName Domain name or subdomain name when `ProxyType=hostname`; 
Instance name when `ProxyType=instance`.
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set Domain name or subdomain name when `ProxyType=hostname`; 
Instance name when `ProxyType=instance`.
     * @param ProxyName Domain name or subdomain name when `ProxyType=hostname`; 
Instance name when `ProxyType=instance`.
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get The session persistence duration. Value range: 30-3600 (in seconds).
The original configuration will apply if this field is not specified. 
     * @return SessionPersistTime The session persistence duration. Value range: 30-3600 (in seconds).
The original configuration will apply if this field is not specified.
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set The session persistence duration. Value range: 30-3600 (in seconds).
The original configuration will apply if this field is not specified.
     * @param SessionPersistTime The session persistence duration. Value range: 30-3600 (in seconds).
The original configuration will apply if this field is not specified.
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get L4 proxy mode. Valid values: 
<li>instance: Instance mode. </li>If it is not specified, instance is used by default. 
     * @return ProxyType L4 proxy mode. Valid values: 
<li>instance: Instance mode. </li>If it is not specified, instance is used by default.
     */
    public String getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set L4 proxy mode. Valid values: 
<li>instance: Instance mode. </li>If it is not specified, instance is used by default.
     * @param ProxyType L4 proxy mode. Valid values: 
<li>instance: Instance mode. </li>If it is not specified, instance is used by default.
     */
    public void setProxyType(String ProxyType) {
        this.ProxyType = ProxyType;
    }

    /**
     * Get IPv6 access configuration. The original configuration will apply if it is not specified. 
     * @return Ipv6 IPv6 access configuration. The original configuration will apply if it is not specified.
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set IPv6 access configuration. The original configuration will apply if it is not specified.
     * @param Ipv6 IPv6 access configuration. The original configuration will apply if it is not specified.
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get Cross-MLC-border acceleration. The original configuration will apply if it is not specified. 
     * @return AccelerateMainland Cross-MLC-border acceleration. The original configuration will apply if it is not specified.
     */
    public AccelerateMainland getAccelerateMainland() {
        return this.AccelerateMainland;
    }

    /**
     * Set Cross-MLC-border acceleration. The original configuration will apply if it is not specified.
     * @param AccelerateMainland Cross-MLC-border acceleration. The original configuration will apply if it is not specified.
     */
    public void setAccelerateMainland(AccelerateMainland AccelerateMainland) {
        this.AccelerateMainland = AccelerateMainland;
    }

    public ModifyApplicationProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationProxyRequest(ModifyApplicationProxyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.SessionPersistTime != null) {
            this.SessionPersistTime = new Long(source.SessionPersistTime);
        }
        if (source.ProxyType != null) {
            this.ProxyType = new String(source.ProxyType);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new Ipv6(source.Ipv6);
        }
        if (source.AccelerateMainland != null) {
            this.AccelerateMainland = new AccelerateMainland(source.AccelerateMainland);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamObj(map, prefix + "AccelerateMainland.", this.AccelerateMainland);

    }
}

