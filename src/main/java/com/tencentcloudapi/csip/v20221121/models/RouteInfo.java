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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteInfo extends AbstractModel {

    /**
    * Access IP.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Access Port
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Access domain name port.
    */
    @SerializedName("DomainPort")
    @Expose
    private String DomainPort;

    /**
     * Get Access IP. 
     * @return Vip Access IP.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Access IP.
     * @param Vip Access IP.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Access Port 
     * @return Vport Access Port
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set Access Port
     * @param Vport Access Port
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
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
     * Get Access domain name port. 
     * @return DomainPort Access domain name port.
     */
    public String getDomainPort() {
        return this.DomainPort;
    }

    /**
     * Set Access domain name port.
     * @param DomainPort Access domain name port.
     */
    public void setDomainPort(String DomainPort) {
        this.DomainPort = DomainPort;
    }

    public RouteInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteInfo(RouteInfo source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainPort != null) {
            this.DomainPort = new String(source.DomainPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainPort", this.DomainPort);

    }
}

