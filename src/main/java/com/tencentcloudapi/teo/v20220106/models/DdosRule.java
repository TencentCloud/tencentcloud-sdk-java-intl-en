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

public class DdosRule extends AbstractModel {

    /**
    * DDoS mitigation level
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DdosStatusInfo")
    @Expose
    private DDoSStatusInfo DdosStatusInfo;

    /**
    * DDoS regional blocking
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DdosGeoIp")
    @Expose
    private DDoSGeoIp DdosGeoIp;

    /**
    * DDoS blocklist/allowlist
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DdosAllowBlock")
    @Expose
    private DdosAllowBlock DdosAllowBlock;

    /**
    * Protocol blocking and null session protection
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DdosAntiPly")
    @Expose
    private DDoSAntiPly DdosAntiPly;

    /**
    * DDoS feature filtering
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DdosPacketFilter")
    @Expose
    private DdosPacketFilter DdosPacketFilter;

    /**
    * DDoS port filtering
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DdosAcl")
    @Expose
    private DdosAcls DdosAcl;

    /**
    * DDoS mitigation switch. `on`: Enable; `off`: Disable.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Whether to enable UDP fragmentation. `on`: Enable; `off`: Disable.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UdpShardOpen")
    @Expose
    private String UdpShardOpen;

    /**
     * Get DDoS mitigation level
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DdosStatusInfo DDoS mitigation level
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public DDoSStatusInfo getDdosStatusInfo() {
        return this.DdosStatusInfo;
    }

    /**
     * Set DDoS mitigation level
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DdosStatusInfo DDoS mitigation level
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDdosStatusInfo(DDoSStatusInfo DdosStatusInfo) {
        this.DdosStatusInfo = DdosStatusInfo;
    }

    /**
     * Get DDoS regional blocking
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DdosGeoIp DDoS regional blocking
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public DDoSGeoIp getDdosGeoIp() {
        return this.DdosGeoIp;
    }

    /**
     * Set DDoS regional blocking
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DdosGeoIp DDoS regional blocking
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDdosGeoIp(DDoSGeoIp DdosGeoIp) {
        this.DdosGeoIp = DdosGeoIp;
    }

    /**
     * Get DDoS blocklist/allowlist
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DdosAllowBlock DDoS blocklist/allowlist
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public DdosAllowBlock getDdosAllowBlock() {
        return this.DdosAllowBlock;
    }

    /**
     * Set DDoS blocklist/allowlist
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DdosAllowBlock DDoS blocklist/allowlist
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDdosAllowBlock(DdosAllowBlock DdosAllowBlock) {
        this.DdosAllowBlock = DdosAllowBlock;
    }

    /**
     * Get Protocol blocking and null session protection
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DdosAntiPly Protocol blocking and null session protection
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public DDoSAntiPly getDdosAntiPly() {
        return this.DdosAntiPly;
    }

    /**
     * Set Protocol blocking and null session protection
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DdosAntiPly Protocol blocking and null session protection
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDdosAntiPly(DDoSAntiPly DdosAntiPly) {
        this.DdosAntiPly = DdosAntiPly;
    }

    /**
     * Get DDoS feature filtering
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DdosPacketFilter DDoS feature filtering
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public DdosPacketFilter getDdosPacketFilter() {
        return this.DdosPacketFilter;
    }

    /**
     * Set DDoS feature filtering
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DdosPacketFilter DDoS feature filtering
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDdosPacketFilter(DdosPacketFilter DdosPacketFilter) {
        this.DdosPacketFilter = DdosPacketFilter;
    }

    /**
     * Get DDoS port filtering
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DdosAcl DDoS port filtering
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public DdosAcls getDdosAcl() {
        return this.DdosAcl;
    }

    /**
     * Set DDoS port filtering
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DdosAcl DDoS port filtering
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDdosAcl(DdosAcls DdosAcl) {
        this.DdosAcl = DdosAcl;
    }

    /**
     * Get DDoS mitigation switch. `on`: Enable; `off`: Disable.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Switch DDoS mitigation switch. `on`: Enable; `off`: Disable.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set DDoS mitigation switch. `on`: Enable; `off`: Disable.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Switch DDoS mitigation switch. `on`: Enable; `off`: Disable.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Whether to enable UDP fragmentation. `on`: Enable; `off`: Disable.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UdpShardOpen Whether to enable UDP fragmentation. `on`: Enable; `off`: Disable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUdpShardOpen() {
        return this.UdpShardOpen;
    }

    /**
     * Set Whether to enable UDP fragmentation. `on`: Enable; `off`: Disable.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UdpShardOpen Whether to enable UDP fragmentation. `on`: Enable; `off`: Disable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUdpShardOpen(String UdpShardOpen) {
        this.UdpShardOpen = UdpShardOpen;
    }

    public DdosRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DdosRule(DdosRule source) {
        if (source.DdosStatusInfo != null) {
            this.DdosStatusInfo = new DDoSStatusInfo(source.DdosStatusInfo);
        }
        if (source.DdosGeoIp != null) {
            this.DdosGeoIp = new DDoSGeoIp(source.DdosGeoIp);
        }
        if (source.DdosAllowBlock != null) {
            this.DdosAllowBlock = new DdosAllowBlock(source.DdosAllowBlock);
        }
        if (source.DdosAntiPly != null) {
            this.DdosAntiPly = new DDoSAntiPly(source.DdosAntiPly);
        }
        if (source.DdosPacketFilter != null) {
            this.DdosPacketFilter = new DdosPacketFilter(source.DdosPacketFilter);
        }
        if (source.DdosAcl != null) {
            this.DdosAcl = new DdosAcls(source.DdosAcl);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.UdpShardOpen != null) {
            this.UdpShardOpen = new String(source.UdpShardOpen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DdosStatusInfo.", this.DdosStatusInfo);
        this.setParamObj(map, prefix + "DdosGeoIp.", this.DdosGeoIp);
        this.setParamObj(map, prefix + "DdosAllowBlock.", this.DdosAllowBlock);
        this.setParamObj(map, prefix + "DdosAntiPly.", this.DdosAntiPly);
        this.setParamObj(map, prefix + "DdosPacketFilter.", this.DdosPacketFilter);
        this.setParamObj(map, prefix + "DdosAcl.", this.DdosAcl);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "UdpShardOpen", this.UdpShardOpen);

    }
}

