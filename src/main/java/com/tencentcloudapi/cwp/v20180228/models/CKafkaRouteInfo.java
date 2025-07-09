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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CKafkaRouteInfo extends AbstractModel {

    /**
    * Routing ID
    */
    @SerializedName("RouteID")
    @Expose
    private Long RouteID;

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain Port
    */
    @SerializedName("DomainPort")
    @Expose
    private Long DomainPort;

    /**
    * Virtual IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Virtual IP Type
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * Access type
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
     * Get Routing ID 
     * @return RouteID Routing ID
     */
    public Long getRouteID() {
        return this.RouteID;
    }

    /**
     * Set Routing ID
     * @param RouteID Routing ID
     */
    public void setRouteID(Long RouteID) {
        this.RouteID = RouteID;
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
     * Get Domain Port 
     * @return DomainPort Domain Port
     */
    public Long getDomainPort() {
        return this.DomainPort;
    }

    /**
     * Set Domain Port
     * @param DomainPort Domain Port
     */
    public void setDomainPort(Long DomainPort) {
        this.DomainPort = DomainPort;
    }

    /**
     * Get Virtual IP 
     * @return Vip Virtual IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Virtual IP
     * @param Vip Virtual IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Virtual IP Type 
     * @return VipType Virtual IP Type
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set Virtual IP Type
     * @param VipType Virtual IP Type
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get Access type 
     * @return AccessType Access type
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Access type
     * @param AccessType Access type
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    public CKafkaRouteInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CKafkaRouteInfo(CKafkaRouteInfo source) {
        if (source.RouteID != null) {
            this.RouteID = new Long(source.RouteID);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainPort != null) {
            this.DomainPort = new Long(source.DomainPort);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteID", this.RouteID);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainPort", this.DomainPort);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);

    }
}

