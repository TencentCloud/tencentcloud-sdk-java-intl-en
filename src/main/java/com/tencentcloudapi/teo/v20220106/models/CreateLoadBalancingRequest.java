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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancingRequest extends AbstractModel {

    /**
    * Site ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Subdomain name
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Proxy mode. Valid values:
`dns_only`: Only DNS
`proxied`: Enable proxy
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * ID of the origin group used
    */
    @SerializedName("OriginId")
    @Expose
    private String [] OriginId;

    /**
    * Indicates DNS TTL time when `Type=dns_only` 
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
     * Get Site ID 
     * @return ZoneId Site ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID
     * @param ZoneId Site ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Subdomain name 
     * @return Host Subdomain name
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Subdomain name
     * @param Host Subdomain name
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Proxy mode. Valid values:
`dns_only`: Only DNS
`proxied`: Enable proxy 
     * @return Type Proxy mode. Valid values:
`dns_only`: Only DNS
`proxied`: Enable proxy
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Proxy mode. Valid values:
`dns_only`: Only DNS
`proxied`: Enable proxy
     * @param Type Proxy mode. Valid values:
`dns_only`: Only DNS
`proxied`: Enable proxy
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get ID of the origin group used 
     * @return OriginId ID of the origin group used
     */
    public String [] getOriginId() {
        return this.OriginId;
    }

    /**
     * Set ID of the origin group used
     * @param OriginId ID of the origin group used
     */
    public void setOriginId(String [] OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get Indicates DNS TTL time when `Type=dns_only`  
     * @return TTL Indicates DNS TTL time when `Type=dns_only` 
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set Indicates DNS TTL time when `Type=dns_only` 
     * @param TTL Indicates DNS TTL time when `Type=dns_only` 
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    public CreateLoadBalancingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLoadBalancingRequest(CreateLoadBalancingRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.OriginId != null) {
            this.OriginId = new String[source.OriginId.length];
            for (int i = 0; i < source.OriginId.length; i++) {
                this.OriginId[i] = new String(source.OriginId[i]);
            }
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "OriginId.", this.OriginId);
        this.setParamSimple(map, prefix + "TTL", this.TTL);

    }
}

