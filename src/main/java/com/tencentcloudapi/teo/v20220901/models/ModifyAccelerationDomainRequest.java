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

public class ModifyAccelerationDomainRequest extends AbstractModel {

    /**
    * Zone ID of the acceleration domain name.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Acceleration domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Origin server information.
    */
    @SerializedName("OriginInfo")
    @Expose
    private OriginInfo OriginInfo;

    /**
    * Origin-pull protocol. Valid values:
<li>FOLLOW: follow protocol;</li>
<li>HTTP: Origin-pull over HTTP;</li>
<li>HTTPS: Origin-pull over HTTPS protocol.</li>
<li>Leave blank to retain the original configuration.</li>
    */
    @SerializedName("OriginProtocol")
    @Expose
    private String OriginProtocol;

    /**
    * HTTP origin-pull port. Value range: 1–65535. This parameter is valid only when OriginProtocol is FOLLOW or HTTP. If not specified, the original configuration is retained.
    */
    @SerializedName("HttpOriginPort")
    @Expose
    private Long HttpOriginPort;

    /**
    * HTTPS origin-pull port. Value range: 1-65535. This parameter is valid only when OriginProtocol is FOLLOW or HTTPS. If not specified, the original configuration is retained.
    */
    @SerializedName("HttpsOriginPort")
    @Expose
    private Long HttpsOriginPort;

    /**
    * IPv6 status. Valid values:
<li>follow: follow the site IPv6 configuration;</li>
<li>on: enabled;</li>
<li>off: Disabled.</li>
<li>Leave blank to retain the original configuration.</li>
    */
    @SerializedName("IPv6Status")
    @Expose
    private String IPv6Status;

    /**
     * Get Zone ID of the acceleration domain name. 
     * @return ZoneId Zone ID of the acceleration domain name.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID of the acceleration domain name.
     * @param ZoneId Zone ID of the acceleration domain name.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Acceleration domain name. 
     * @return DomainName Acceleration domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Acceleration domain name.
     * @param DomainName Acceleration domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Origin server information. 
     * @return OriginInfo Origin server information.
     */
    public OriginInfo getOriginInfo() {
        return this.OriginInfo;
    }

    /**
     * Set Origin server information.
     * @param OriginInfo Origin server information.
     */
    public void setOriginInfo(OriginInfo OriginInfo) {
        this.OriginInfo = OriginInfo;
    }

    /**
     * Get Origin-pull protocol. Valid values:
<li>FOLLOW: follow protocol;</li>
<li>HTTP: Origin-pull over HTTP;</li>
<li>HTTPS: Origin-pull over HTTPS protocol.</li>
<li>Leave blank to retain the original configuration.</li> 
     * @return OriginProtocol Origin-pull protocol. Valid values:
<li>FOLLOW: follow protocol;</li>
<li>HTTP: Origin-pull over HTTP;</li>
<li>HTTPS: Origin-pull over HTTPS protocol.</li>
<li>Leave blank to retain the original configuration.</li>
     */
    public String getOriginProtocol() {
        return this.OriginProtocol;
    }

    /**
     * Set Origin-pull protocol. Valid values:
<li>FOLLOW: follow protocol;</li>
<li>HTTP: Origin-pull over HTTP;</li>
<li>HTTPS: Origin-pull over HTTPS protocol.</li>
<li>Leave blank to retain the original configuration.</li>
     * @param OriginProtocol Origin-pull protocol. Valid values:
<li>FOLLOW: follow protocol;</li>
<li>HTTP: Origin-pull over HTTP;</li>
<li>HTTPS: Origin-pull over HTTPS protocol.</li>
<li>Leave blank to retain the original configuration.</li>
     */
    public void setOriginProtocol(String OriginProtocol) {
        this.OriginProtocol = OriginProtocol;
    }

    /**
     * Get HTTP origin-pull port. Value range: 1–65535. This parameter is valid only when OriginProtocol is FOLLOW or HTTP. If not specified, the original configuration is retained. 
     * @return HttpOriginPort HTTP origin-pull port. Value range: 1–65535. This parameter is valid only when OriginProtocol is FOLLOW or HTTP. If not specified, the original configuration is retained.
     */
    public Long getHttpOriginPort() {
        return this.HttpOriginPort;
    }

    /**
     * Set HTTP origin-pull port. Value range: 1–65535. This parameter is valid only when OriginProtocol is FOLLOW or HTTP. If not specified, the original configuration is retained.
     * @param HttpOriginPort HTTP origin-pull port. Value range: 1–65535. This parameter is valid only when OriginProtocol is FOLLOW or HTTP. If not specified, the original configuration is retained.
     */
    public void setHttpOriginPort(Long HttpOriginPort) {
        this.HttpOriginPort = HttpOriginPort;
    }

    /**
     * Get HTTPS origin-pull port. Value range: 1-65535. This parameter is valid only when OriginProtocol is FOLLOW or HTTPS. If not specified, the original configuration is retained. 
     * @return HttpsOriginPort HTTPS origin-pull port. Value range: 1-65535. This parameter is valid only when OriginProtocol is FOLLOW or HTTPS. If not specified, the original configuration is retained.
     */
    public Long getHttpsOriginPort() {
        return this.HttpsOriginPort;
    }

    /**
     * Set HTTPS origin-pull port. Value range: 1-65535. This parameter is valid only when OriginProtocol is FOLLOW or HTTPS. If not specified, the original configuration is retained.
     * @param HttpsOriginPort HTTPS origin-pull port. Value range: 1-65535. This parameter is valid only when OriginProtocol is FOLLOW or HTTPS. If not specified, the original configuration is retained.
     */
    public void setHttpsOriginPort(Long HttpsOriginPort) {
        this.HttpsOriginPort = HttpsOriginPort;
    }

    /**
     * Get IPv6 status. Valid values:
<li>follow: follow the site IPv6 configuration;</li>
<li>on: enabled;</li>
<li>off: Disabled.</li>
<li>Leave blank to retain the original configuration.</li> 
     * @return IPv6Status IPv6 status. Valid values:
<li>follow: follow the site IPv6 configuration;</li>
<li>on: enabled;</li>
<li>off: Disabled.</li>
<li>Leave blank to retain the original configuration.</li>
     */
    public String getIPv6Status() {
        return this.IPv6Status;
    }

    /**
     * Set IPv6 status. Valid values:
<li>follow: follow the site IPv6 configuration;</li>
<li>on: enabled;</li>
<li>off: Disabled.</li>
<li>Leave blank to retain the original configuration.</li>
     * @param IPv6Status IPv6 status. Valid values:
<li>follow: follow the site IPv6 configuration;</li>
<li>on: enabled;</li>
<li>off: Disabled.</li>
<li>Leave blank to retain the original configuration.</li>
     */
    public void setIPv6Status(String IPv6Status) {
        this.IPv6Status = IPv6Status;
    }

    public ModifyAccelerationDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccelerationDomainRequest(ModifyAccelerationDomainRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.OriginInfo != null) {
            this.OriginInfo = new OriginInfo(source.OriginInfo);
        }
        if (source.OriginProtocol != null) {
            this.OriginProtocol = new String(source.OriginProtocol);
        }
        if (source.HttpOriginPort != null) {
            this.HttpOriginPort = new Long(source.HttpOriginPort);
        }
        if (source.HttpsOriginPort != null) {
            this.HttpsOriginPort = new Long(source.HttpsOriginPort);
        }
        if (source.IPv6Status != null) {
            this.IPv6Status = new String(source.IPv6Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamObj(map, prefix + "OriginInfo.", this.OriginInfo);
        this.setParamSimple(map, prefix + "OriginProtocol", this.OriginProtocol);
        this.setParamSimple(map, prefix + "HttpOriginPort", this.HttpOriginPort);
        this.setParamSimple(map, prefix + "HttpsOriginPort", this.HttpsOriginPort);
        this.setParamSimple(map, prefix + "IPv6Status", this.IPv6Status);

    }
}

