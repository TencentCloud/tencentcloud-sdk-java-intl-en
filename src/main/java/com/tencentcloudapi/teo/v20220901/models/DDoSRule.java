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

public class DDoSRule extends AbstractModel{

    /**
    * The DDoS mitigation level. If it is null, the setting that was last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DDoSStatusInfo")
    @Expose
    private DDoSStatusInfo DDoSStatusInfo;

    /**
    * The regional blocking settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DDoSGeoIp")
    @Expose
    private DDoSGeoIp DDoSGeoIp;

    /**
    * The IP blocklist/allowlist. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DDoSAllowBlock")
    @Expose
    private DDoSAllowBlock DDoSAllowBlock;

    /**
    * The protocol and connection protection settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DDoSAntiPly")
    @Expose
    private DDoSAntiPly DDoSAntiPly;

    /**
    * The feature filtering settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DDoSPacketFilter")
    @Expose
    private DDoSPacketFilter DDoSPacketFilter;

    /**
    * The port filtering settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DDoSAcl")
    @Expose
    private DDoSAcl DDoSAcl;

    /**
    * Whether to enable DDoS mitigation. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>If it is null, the setting that was last configured will be used.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Whether to enable UDP fragmentation. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>It is required only when used as an output parameter.
    */
    @SerializedName("UdpShardOpen")
    @Expose
    private String UdpShardOpen;

    /**
    * The settings of the rate limiting rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DDoSSpeedLimit")
    @Expose
    private DDoSSpeedLimit DDoSSpeedLimit;

    /**
     * Get The DDoS mitigation level. If it is null, the setting that was last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DDoSStatusInfo The DDoS mitigation level. If it is null, the setting that was last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DDoSStatusInfo getDDoSStatusInfo() {
        return this.DDoSStatusInfo;
    }

    /**
     * Set The DDoS mitigation level. If it is null, the setting that was last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DDoSStatusInfo The DDoS mitigation level. If it is null, the setting that was last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDDoSStatusInfo(DDoSStatusInfo DDoSStatusInfo) {
        this.DDoSStatusInfo = DDoSStatusInfo;
    }

    /**
     * Get The regional blocking settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DDoSGeoIp The regional blocking settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DDoSGeoIp getDDoSGeoIp() {
        return this.DDoSGeoIp;
    }

    /**
     * Set The regional blocking settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DDoSGeoIp The regional blocking settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDDoSGeoIp(DDoSGeoIp DDoSGeoIp) {
        this.DDoSGeoIp = DDoSGeoIp;
    }

    /**
     * Get The IP blocklist/allowlist. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DDoSAllowBlock The IP blocklist/allowlist. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DDoSAllowBlock getDDoSAllowBlock() {
        return this.DDoSAllowBlock;
    }

    /**
     * Set The IP blocklist/allowlist. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DDoSAllowBlock The IP blocklist/allowlist. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDDoSAllowBlock(DDoSAllowBlock DDoSAllowBlock) {
        this.DDoSAllowBlock = DDoSAllowBlock;
    }

    /**
     * Get The protocol and connection protection settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DDoSAntiPly The protocol and connection protection settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DDoSAntiPly getDDoSAntiPly() {
        return this.DDoSAntiPly;
    }

    /**
     * Set The protocol and connection protection settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DDoSAntiPly The protocol and connection protection settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDDoSAntiPly(DDoSAntiPly DDoSAntiPly) {
        this.DDoSAntiPly = DDoSAntiPly;
    }

    /**
     * Get The feature filtering settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DDoSPacketFilter The feature filtering settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DDoSPacketFilter getDDoSPacketFilter() {
        return this.DDoSPacketFilter;
    }

    /**
     * Set The feature filtering settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DDoSPacketFilter The feature filtering settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDDoSPacketFilter(DDoSPacketFilter DDoSPacketFilter) {
        this.DDoSPacketFilter = DDoSPacketFilter;
    }

    /**
     * Get The port filtering settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DDoSAcl The port filtering settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DDoSAcl getDDoSAcl() {
        return this.DDoSAcl;
    }

    /**
     * Set The port filtering settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DDoSAcl The port filtering settings. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDDoSAcl(DDoSAcl DDoSAcl) {
        this.DDoSAcl = DDoSAcl;
    }

    /**
     * Get Whether to enable DDoS mitigation. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>If it is null, the setting that was last configured will be used. 
     * @return Switch Whether to enable DDoS mitigation. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>If it is null, the setting that was last configured will be used.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable DDoS mitigation. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>If it is null, the setting that was last configured will be used.
     * @param Switch Whether to enable DDoS mitigation. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>If it is null, the setting that was last configured will be used.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Whether to enable UDP fragmentation. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>It is required only when used as an output parameter. 
     * @return UdpShardOpen Whether to enable UDP fragmentation. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>It is required only when used as an output parameter.
     */
    public String getUdpShardOpen() {
        return this.UdpShardOpen;
    }

    /**
     * Set Whether to enable UDP fragmentation. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>It is required only when used as an output parameter.
     * @param UdpShardOpen Whether to enable UDP fragmentation. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>It is required only when used as an output parameter.
     */
    public void setUdpShardOpen(String UdpShardOpen) {
        this.UdpShardOpen = UdpShardOpen;
    }

    /**
     * Get The settings of the rate limiting rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DDoSSpeedLimit The settings of the rate limiting rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DDoSSpeedLimit getDDoSSpeedLimit() {
        return this.DDoSSpeedLimit;
    }

    /**
     * Set The settings of the rate limiting rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DDoSSpeedLimit The settings of the rate limiting rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDDoSSpeedLimit(DDoSSpeedLimit DDoSSpeedLimit) {
        this.DDoSSpeedLimit = DDoSSpeedLimit;
    }

    public DDoSRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSRule(DDoSRule source) {
        if (source.DDoSStatusInfo != null) {
            this.DDoSStatusInfo = new DDoSStatusInfo(source.DDoSStatusInfo);
        }
        if (source.DDoSGeoIp != null) {
            this.DDoSGeoIp = new DDoSGeoIp(source.DDoSGeoIp);
        }
        if (source.DDoSAllowBlock != null) {
            this.DDoSAllowBlock = new DDoSAllowBlock(source.DDoSAllowBlock);
        }
        if (source.DDoSAntiPly != null) {
            this.DDoSAntiPly = new DDoSAntiPly(source.DDoSAntiPly);
        }
        if (source.DDoSPacketFilter != null) {
            this.DDoSPacketFilter = new DDoSPacketFilter(source.DDoSPacketFilter);
        }
        if (source.DDoSAcl != null) {
            this.DDoSAcl = new DDoSAcl(source.DDoSAcl);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.UdpShardOpen != null) {
            this.UdpShardOpen = new String(source.UdpShardOpen);
        }
        if (source.DDoSSpeedLimit != null) {
            this.DDoSSpeedLimit = new DDoSSpeedLimit(source.DDoSSpeedLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DDoSStatusInfo.", this.DDoSStatusInfo);
        this.setParamObj(map, prefix + "DDoSGeoIp.", this.DDoSGeoIp);
        this.setParamObj(map, prefix + "DDoSAllowBlock.", this.DDoSAllowBlock);
        this.setParamObj(map, prefix + "DDoSAntiPly.", this.DDoSAntiPly);
        this.setParamObj(map, prefix + "DDoSPacketFilter.", this.DDoSPacketFilter);
        this.setParamObj(map, prefix + "DDoSAcl.", this.DDoSAcl);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "UdpShardOpen", this.UdpShardOpen);
        this.setParamObj(map, prefix + "DDoSSpeedLimit.", this.DDoSSpeedLimit);

    }
}

