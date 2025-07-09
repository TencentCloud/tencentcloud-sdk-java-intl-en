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

public class L4Proxy extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Layer 4 proxy instance ID.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Layer 4 proxy instance name.
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * Acceleration zone of the Layer 4 proxy instance.<li>mainland: Availability zone in the Chinese mainland;</li><li>overseas: Global availability zone (excluding the Chinese mainland);</li><li>global: Global availability zone.</li>	
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Access via CNAME.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * After the fixed IP address is enabled, this value will return the corresponding access IP address; if it is not enabled, this value will be empty.
    */
    @SerializedName("Ips")
    @Expose
    private String [] Ips;

    /**
    * Status of the Layer 4 proxy instance.<li>online: Enabled;</li>
<li>offline: Disabled;</li>
<li>progress: Deploying;</li>	
<li>stopping: Disabling;</li>
<li>banned: Blocked;</li>
<li>fail: Failed to deploy or disable.</li>	
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Specifies whether to enable IPv6 access.<li>on: Enable;</li> <li>off: Disable.</li>
    */
    @SerializedName("Ipv6")
    @Expose
    private String Ipv6;

    /**
    * Specifies whether to enable the fixed IP address.<li>on: Enable;</li> <li>off: Disable.</li>
    */
    @SerializedName("StaticIp")
    @Expose
    private String StaticIp;

    /**
    * Specifies whether to enable network optimization in the Chinese mainland.<li>on: Enable</li> <li>off: Disable</li>
    */
    @SerializedName("AccelerateMainland")
    @Expose
    private String AccelerateMainland;

    /**
    * Security protection configuration.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DDosProtectionConfig")
    @Expose
    private DDosProtectionConfig DDosProtectionConfig;

    /**
    * Number of forwarding rules under the Layer 4 proxy instance.
    */
    @SerializedName("L4ProxyRuleCount")
    @Expose
    private Long L4ProxyRuleCount;

    /**
    * Latest modification time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * Get Layer 4 proxy instance ID. 
     * @return ProxyId Layer 4 proxy instance ID.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Layer 4 proxy instance ID.
     * @param ProxyId Layer 4 proxy instance ID.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Layer 4 proxy instance name. 
     * @return ProxyName Layer 4 proxy instance name.
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set Layer 4 proxy instance name.
     * @param ProxyName Layer 4 proxy instance name.
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get Acceleration zone of the Layer 4 proxy instance.<li>mainland: Availability zone in the Chinese mainland;</li><li>overseas: Global availability zone (excluding the Chinese mainland);</li><li>global: Global availability zone.</li>	 
     * @return Area Acceleration zone of the Layer 4 proxy instance.<li>mainland: Availability zone in the Chinese mainland;</li><li>overseas: Global availability zone (excluding the Chinese mainland);</li><li>global: Global availability zone.</li>	
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration zone of the Layer 4 proxy instance.<li>mainland: Availability zone in the Chinese mainland;</li><li>overseas: Global availability zone (excluding the Chinese mainland);</li><li>global: Global availability zone.</li>	
     * @param Area Acceleration zone of the Layer 4 proxy instance.<li>mainland: Availability zone in the Chinese mainland;</li><li>overseas: Global availability zone (excluding the Chinese mainland);</li><li>global: Global availability zone.</li>	
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Access via CNAME. 
     * @return Cname Access via CNAME.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set Access via CNAME.
     * @param Cname Access via CNAME.
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get After the fixed IP address is enabled, this value will return the corresponding access IP address; if it is not enabled, this value will be empty. 
     * @return Ips After the fixed IP address is enabled, this value will return the corresponding access IP address; if it is not enabled, this value will be empty.
     */
    public String [] getIps() {
        return this.Ips;
    }

    /**
     * Set After the fixed IP address is enabled, this value will return the corresponding access IP address; if it is not enabled, this value will be empty.
     * @param Ips After the fixed IP address is enabled, this value will return the corresponding access IP address; if it is not enabled, this value will be empty.
     */
    public void setIps(String [] Ips) {
        this.Ips = Ips;
    }

    /**
     * Get Status of the Layer 4 proxy instance.<li>online: Enabled;</li>
<li>offline: Disabled;</li>
<li>progress: Deploying;</li>	
<li>stopping: Disabling;</li>
<li>banned: Blocked;</li>
<li>fail: Failed to deploy or disable.</li>	 
     * @return Status Status of the Layer 4 proxy instance.<li>online: Enabled;</li>
<li>offline: Disabled;</li>
<li>progress: Deploying;</li>	
<li>stopping: Disabling;</li>
<li>banned: Blocked;</li>
<li>fail: Failed to deploy or disable.</li>	
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the Layer 4 proxy instance.<li>online: Enabled;</li>
<li>offline: Disabled;</li>
<li>progress: Deploying;</li>	
<li>stopping: Disabling;</li>
<li>banned: Blocked;</li>
<li>fail: Failed to deploy or disable.</li>	
     * @param Status Status of the Layer 4 proxy instance.<li>online: Enabled;</li>
<li>offline: Disabled;</li>
<li>progress: Deploying;</li>	
<li>stopping: Disabling;</li>
<li>banned: Blocked;</li>
<li>fail: Failed to deploy or disable.</li>	
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Specifies whether to enable IPv6 access.<li>on: Enable;</li> <li>off: Disable.</li> 
     * @return Ipv6 Specifies whether to enable IPv6 access.<li>on: Enable;</li> <li>off: Disable.</li>
     */
    public String getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Specifies whether to enable IPv6 access.<li>on: Enable;</li> <li>off: Disable.</li>
     * @param Ipv6 Specifies whether to enable IPv6 access.<li>on: Enable;</li> <li>off: Disable.</li>
     */
    public void setIpv6(String Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get Specifies whether to enable the fixed IP address.<li>on: Enable;</li> <li>off: Disable.</li> 
     * @return StaticIp Specifies whether to enable the fixed IP address.<li>on: Enable;</li> <li>off: Disable.</li>
     */
    public String getStaticIp() {
        return this.StaticIp;
    }

    /**
     * Set Specifies whether to enable the fixed IP address.<li>on: Enable;</li> <li>off: Disable.</li>
     * @param StaticIp Specifies whether to enable the fixed IP address.<li>on: Enable;</li> <li>off: Disable.</li>
     */
    public void setStaticIp(String StaticIp) {
        this.StaticIp = StaticIp;
    }

    /**
     * Get Specifies whether to enable network optimization in the Chinese mainland.<li>on: Enable</li> <li>off: Disable</li> 
     * @return AccelerateMainland Specifies whether to enable network optimization in the Chinese mainland.<li>on: Enable</li> <li>off: Disable</li>
     */
    public String getAccelerateMainland() {
        return this.AccelerateMainland;
    }

    /**
     * Set Specifies whether to enable network optimization in the Chinese mainland.<li>on: Enable</li> <li>off: Disable</li>
     * @param AccelerateMainland Specifies whether to enable network optimization in the Chinese mainland.<li>on: Enable</li> <li>off: Disable</li>
     */
    public void setAccelerateMainland(String AccelerateMainland) {
        this.AccelerateMainland = AccelerateMainland;
    }

    /**
     * Get Security protection configuration.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DDosProtectionConfig Security protection configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public DDosProtectionConfig getDDosProtectionConfig() {
        return this.DDosProtectionConfig;
    }

    /**
     * Set Security protection configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DDosProtectionConfig Security protection configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDDosProtectionConfig(DDosProtectionConfig DDosProtectionConfig) {
        this.DDosProtectionConfig = DDosProtectionConfig;
    }

    /**
     * Get Number of forwarding rules under the Layer 4 proxy instance. 
     * @return L4ProxyRuleCount Number of forwarding rules under the Layer 4 proxy instance.
     */
    public Long getL4ProxyRuleCount() {
        return this.L4ProxyRuleCount;
    }

    /**
     * Set Number of forwarding rules under the Layer 4 proxy instance.
     * @param L4ProxyRuleCount Number of forwarding rules under the Layer 4 proxy instance.
     */
    public void setL4ProxyRuleCount(Long L4ProxyRuleCount) {
        this.L4ProxyRuleCount = L4ProxyRuleCount;
    }

    /**
     * Get Latest modification time. 
     * @return UpdateTime Latest modification time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Latest modification time.
     * @param UpdateTime Latest modification time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public L4Proxy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4Proxy(L4Proxy source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Ips != null) {
            this.Ips = new String[source.Ips.length];
            for (int i = 0; i < source.Ips.length; i++) {
                this.Ips[i] = new String(source.Ips[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new String(source.Ipv6);
        }
        if (source.StaticIp != null) {
            this.StaticIp = new String(source.StaticIp);
        }
        if (source.AccelerateMainland != null) {
            this.AccelerateMainland = new String(source.AccelerateMainland);
        }
        if (source.DDosProtectionConfig != null) {
            this.DDosProtectionConfig = new DDosProtectionConfig(source.DDosProtectionConfig);
        }
        if (source.L4ProxyRuleCount != null) {
            this.L4ProxyRuleCount = new Long(source.L4ProxyRuleCount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamArraySimple(map, prefix + "Ips.", this.Ips);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Ipv6", this.Ipv6);
        this.setParamSimple(map, prefix + "StaticIp", this.StaticIp);
        this.setParamSimple(map, prefix + "AccelerateMainland", this.AccelerateMainland);
        this.setParamObj(map, prefix + "DDosProtectionConfig.", this.DDosProtectionConfig);
        this.setParamSimple(map, prefix + "L4ProxyRuleCount", this.L4ProxyRuleCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

