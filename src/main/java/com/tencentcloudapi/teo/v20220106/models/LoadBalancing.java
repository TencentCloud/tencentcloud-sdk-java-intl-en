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

public class LoadBalancing extends AbstractModel {

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancingId")
    @Expose
    private String LoadBalancingId;

    /**
    * Site ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Subdomain name. You can use @ to represent the root domain.
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
    * Indicates DNS TTL time when `Type=dns_only`
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * ID of the origin group used
    */
    @SerializedName("OriginId")
    @Expose
    private String [] OriginId;

    /**
    * Information of the origin server used
    */
    @SerializedName("Origin")
    @Expose
    private OriginGroup [] Origin;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Schedules domain names
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
     * Get CLB instance ID 
     * @return LoadBalancingId CLB instance ID
     */
    public String getLoadBalancingId() {
        return this.LoadBalancingId;
    }

    /**
     * Set CLB instance ID
     * @param LoadBalancingId CLB instance ID
     */
    public void setLoadBalancingId(String LoadBalancingId) {
        this.LoadBalancingId = LoadBalancingId;
    }

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
     * Get Subdomain name. You can use @ to represent the root domain. 
     * @return Host Subdomain name. You can use @ to represent the root domain.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Subdomain name. You can use @ to represent the root domain.
     * @param Host Subdomain name. You can use @ to represent the root domain.
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
     * Get Information of the origin server used 
     * @return Origin Information of the origin server used
     */
    public OriginGroup [] getOrigin() {
        return this.Origin;
    }

    /**
     * Set Information of the origin server used
     * @param Origin Information of the origin server used
     */
    public void setOrigin(OriginGroup [] Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Schedules domain names
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Cname Schedules domain names
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set Schedules domain names
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Cname Schedules domain names
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public LoadBalancing() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancing(LoadBalancing source) {
        if (source.LoadBalancingId != null) {
            this.LoadBalancingId = new String(source.LoadBalancingId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.OriginId != null) {
            this.OriginId = new String[source.OriginId.length];
            for (int i = 0; i < source.OriginId.length; i++) {
                this.OriginId[i] = new String(source.OriginId[i]);
            }
        }
        if (source.Origin != null) {
            this.Origin = new OriginGroup[source.Origin.length];
            for (int i = 0; i < source.Origin.length; i++) {
                this.Origin[i] = new OriginGroup(source.Origin[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancingId", this.LoadBalancingId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamArraySimple(map, prefix + "OriginId.", this.OriginId);
        this.setParamArrayObj(map, prefix + "Origin.", this.Origin);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cname", this.Cname);

    }
}

