/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancingRequest extends AbstractModel{

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The load balancing hostname.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * The proxy mode. Values:
<li>`dns_only`: Only DNS</li>
<li>`proxied`: Proxied</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The ID of the primary origin group.
    */
    @SerializedName("OriginGroupId")
    @Expose
    private String OriginGroupId;

    /**
    * The ID of the secondary origin group (only available when `Type=proxied`). If not specified, it indicates that secondary origins are not used.
    */
    @SerializedName("BackupOriginGroupId")
    @Expose
    private String BackupOriginGroupId;

    /**
    * When `Type=dns_only`, it indicates the amount of time that DNS records remain in the cache of a DNS server.
Value range: 60-86400 (in seconds). If it’s not specified, the default value 600 will be used.
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * 
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * 
    */
    @SerializedName("AdvancedOriginGroups")
    @Expose
    private AdvancedOriginGroup [] AdvancedOriginGroups;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The load balancing hostname. 
     * @return Host The load balancing hostname.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set The load balancing hostname.
     * @param Host The load balancing hostname.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get The proxy mode. Values:
<li>`dns_only`: Only DNS</li>
<li>`proxied`: Proxied</li> 
     * @return Type The proxy mode. Values:
<li>`dns_only`: Only DNS</li>
<li>`proxied`: Proxied</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The proxy mode. Values:
<li>`dns_only`: Only DNS</li>
<li>`proxied`: Proxied</li>
     * @param Type The proxy mode. Values:
<li>`dns_only`: Only DNS</li>
<li>`proxied`: Proxied</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The ID of the primary origin group. 
     * @return OriginGroupId The ID of the primary origin group.
     */
    public String getOriginGroupId() {
        return this.OriginGroupId;
    }

    /**
     * Set The ID of the primary origin group.
     * @param OriginGroupId The ID of the primary origin group.
     */
    public void setOriginGroupId(String OriginGroupId) {
        this.OriginGroupId = OriginGroupId;
    }

    /**
     * Get The ID of the secondary origin group (only available when `Type=proxied`). If not specified, it indicates that secondary origins are not used. 
     * @return BackupOriginGroupId The ID of the secondary origin group (only available when `Type=proxied`). If not specified, it indicates that secondary origins are not used.
     */
    public String getBackupOriginGroupId() {
        return this.BackupOriginGroupId;
    }

    /**
     * Set The ID of the secondary origin group (only available when `Type=proxied`). If not specified, it indicates that secondary origins are not used.
     * @param BackupOriginGroupId The ID of the secondary origin group (only available when `Type=proxied`). If not specified, it indicates that secondary origins are not used.
     */
    public void setBackupOriginGroupId(String BackupOriginGroupId) {
        this.BackupOriginGroupId = BackupOriginGroupId;
    }

    /**
     * Get When `Type=dns_only`, it indicates the amount of time that DNS records remain in the cache of a DNS server.
Value range: 60-86400 (in seconds). If it’s not specified, the default value 600 will be used. 
     * @return TTL When `Type=dns_only`, it indicates the amount of time that DNS records remain in the cache of a DNS server.
Value range: 60-86400 (in seconds). If it’s not specified, the default value 600 will be used.
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set When `Type=dns_only`, it indicates the amount of time that DNS records remain in the cache of a DNS server.
Value range: 60-86400 (in seconds). If it’s not specified, the default value 600 will be used.
     * @param TTL When `Type=dns_only`, it indicates the amount of time that DNS records remain in the cache of a DNS server.
Value range: 60-86400 (in seconds). If it’s not specified, the default value 600 will be used.
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get  
     * @return OriginType 
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 
     * @param OriginType 
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get  
     * @return AdvancedOriginGroups 
     */
    public AdvancedOriginGroup [] getAdvancedOriginGroups() {
        return this.AdvancedOriginGroups;
    }

    /**
     * Set 
     * @param AdvancedOriginGroups 
     */
    public void setAdvancedOriginGroups(AdvancedOriginGroup [] AdvancedOriginGroups) {
        this.AdvancedOriginGroups = AdvancedOriginGroups;
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
        if (source.OriginGroupId != null) {
            this.OriginGroupId = new String(source.OriginGroupId);
        }
        if (source.BackupOriginGroupId != null) {
            this.BackupOriginGroupId = new String(source.BackupOriginGroupId);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.AdvancedOriginGroups != null) {
            this.AdvancedOriginGroups = new AdvancedOriginGroup[source.AdvancedOriginGroups.length];
            for (int i = 0; i < source.AdvancedOriginGroups.length; i++) {
                this.AdvancedOriginGroups[i] = new AdvancedOriginGroup(source.AdvancedOriginGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "OriginGroupId", this.OriginGroupId);
        this.setParamSimple(map, prefix + "BackupOriginGroupId", this.BackupOriginGroupId);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamArrayObj(map, prefix + "AdvancedOriginGroups.", this.AdvancedOriginGroups);

    }
}

