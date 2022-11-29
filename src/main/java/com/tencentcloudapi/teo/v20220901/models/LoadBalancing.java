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

public class LoadBalancing extends AbstractModel{

    /**
    * The load balancer ID.
    */
    @SerializedName("LoadBalancingId")
    @Expose
    private String LoadBalancingId;

    /**
    * The site ID.
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
    * The proxy mode. Values:
<li>`dns_only`: Only DNS</li>
<li>`proxied`: Proxied</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The cache time of DNS records when `Type=dns_only`.
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * The load balancer status. Values:
<li>`online`: Deployed</li>
<li>`process`: Deployment in progress</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Schedules domain names.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * The ID of the primary origin group.
    */
    @SerializedName("OriginGroupId")
    @Expose
    private String OriginGroupId;

    /**
    * The ID of the secondary origin group. If not specified, it indicates that secondary origins are not used.
    */
    @SerializedName("BackupOriginGroupId")
    @Expose
    private String BackupOriginGroupId;

    /**
    * The update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * The origin-pull type. Values:
<li>`normal`: Primary/Secondary origin-pull</li>
<li>`advanced`: Advanced origin-pull</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Advanced origin-pull configuration. This field is valid when `OriginType=advanced`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AdvancedOriginGroups")
    @Expose
    private AdvancedOriginGroup [] AdvancedOriginGroups;

    /**
     * Get The load balancer ID. 
     * @return LoadBalancingId The load balancer ID.
     */
    public String getLoadBalancingId() {
        return this.LoadBalancingId;
    }

    /**
     * Set The load balancer ID.
     * @param LoadBalancingId The load balancer ID.
     */
    public void setLoadBalancingId(String LoadBalancingId) {
        this.LoadBalancingId = LoadBalancingId;
    }

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
     * Get The cache time of DNS records when `Type=dns_only`. 
     * @return TTL The cache time of DNS records when `Type=dns_only`.
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set The cache time of DNS records when `Type=dns_only`.
     * @param TTL The cache time of DNS records when `Type=dns_only`.
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get The load balancer status. Values:
<li>`online`: Deployed</li>
<li>`process`: Deployment in progress</li> 
     * @return Status The load balancer status. Values:
<li>`online`: Deployed</li>
<li>`process`: Deployment in progress</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The load balancer status. Values:
<li>`online`: Deployed</li>
<li>`process`: Deployment in progress</li>
     * @param Status The load balancer status. Values:
<li>`online`: Deployed</li>
<li>`process`: Deployment in progress</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Schedules domain names. 
     * @return Cname Schedules domain names.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set Schedules domain names.
     * @param Cname Schedules domain names.
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
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
     * Get The ID of the secondary origin group. If not specified, it indicates that secondary origins are not used. 
     * @return BackupOriginGroupId The ID of the secondary origin group. If not specified, it indicates that secondary origins are not used.
     */
    public String getBackupOriginGroupId() {
        return this.BackupOriginGroupId;
    }

    /**
     * Set The ID of the secondary origin group. If not specified, it indicates that secondary origins are not used.
     * @param BackupOriginGroupId The ID of the secondary origin group. If not specified, it indicates that secondary origins are not used.
     */
    public void setBackupOriginGroupId(String BackupOriginGroupId) {
        this.BackupOriginGroupId = BackupOriginGroupId;
    }

    /**
     * Get The update time. 
     * @return UpdateTime The update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The update time.
     * @param UpdateTime The update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The origin-pull type. Values:
<li>`normal`: Primary/Secondary origin-pull</li>
<li>`advanced`: Advanced origin-pull</li> 
     * @return OriginType The origin-pull type. Values:
<li>`normal`: Primary/Secondary origin-pull</li>
<li>`advanced`: Advanced origin-pull</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set The origin-pull type. Values:
<li>`normal`: Primary/Secondary origin-pull</li>
<li>`advanced`: Advanced origin-pull</li>
     * @param OriginType The origin-pull type. Values:
<li>`normal`: Primary/Secondary origin-pull</li>
<li>`advanced`: Advanced origin-pull</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Advanced origin-pull configuration. This field is valid when `OriginType=advanced`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AdvancedOriginGroups Advanced origin-pull configuration. This field is valid when `OriginType=advanced`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AdvancedOriginGroup [] getAdvancedOriginGroups() {
        return this.AdvancedOriginGroups;
    }

    /**
     * Set Advanced origin-pull configuration. This field is valid when `OriginType=advanced`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AdvancedOriginGroups Advanced origin-pull configuration. This field is valid when `OriginType=advanced`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAdvancedOriginGroups(AdvancedOriginGroup [] AdvancedOriginGroups) {
        this.AdvancedOriginGroups = AdvancedOriginGroups;
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.OriginGroupId != null) {
            this.OriginGroupId = new String(source.OriginGroupId);
        }
        if (source.BackupOriginGroupId != null) {
            this.BackupOriginGroupId = new String(source.BackupOriginGroupId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
        this.setParamSimple(map, prefix + "LoadBalancingId", this.LoadBalancingId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "OriginGroupId", this.OriginGroupId);
        this.setParamSimple(map, prefix + "BackupOriginGroupId", this.BackupOriginGroupId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamArrayObj(map, prefix + "AdvancedOriginGroups.", this.AdvancedOriginGroups);

    }
}

