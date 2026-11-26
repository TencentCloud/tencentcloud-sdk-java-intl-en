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

public class CreateAccelerationDomainRequest extends AbstractModel {

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
<li>HTTP: Origin-pull over HTTP protocol;</li>
<li>HTTPS: origin-pull over the HTTPS protocol.</li>If not specified, the default is FOLLOW.
    */
    @SerializedName("OriginProtocol")
    @Expose
    private String OriginProtocol;

    /**
    * HTTP origin-pull port. Default value: 80. Value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTP.
    */
    @SerializedName("HttpOriginPort")
    @Expose
    private Long HttpOriginPort;

    /**
    * HTTPS origin port. Default value: 443. Value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTPS.
    */
    @SerializedName("HttpsOriginPort")
    @Expose
    private Long HttpsOriginPort;

    /**
    * IPv6 status. Valid values:
<li>follow: follow the site IPv6 configuration;</li>
<li>`on`: Enabled status;</li>
<li>off: Disabled.</li>If not specified, the default is: follow.
    */
    @SerializedName("IPv6Status")
    @Expose
    private String IPv6Status;

    /**
    * Shared CNAME address bound to the specified domain. If not specified, the default CNAME is used.
Binding a shared CNAME requires the scheduling policies of all domains to be consistent. The following configurations affect the scheduling policy. When they are inconsistent, binding a shared CNAME is processed as follows:
- IPv6 access: not allowed to create a domain name. Modify IPv6Status to match the domain configuration of the rest bound to the shared CNAME.
-DDoS protection: If DDoS protection is enabled for the selected shared CNAME, DDoS protection will be enabled for the domain by default when you create the domain.
-Network optimization in the Chinese mainland (international acceleration): You are not allowed to create a domain name. Make sure the network optimization in the Chinese mainland (international acceleration) configuration of the current domain name is consistent with the rest of the domain names bound to the shared CNAME, and try again later.

Note: Shared CNAME is currently in beta test. To use it, contact us to enable it.
    */
    @SerializedName("SharedCNAME")
    @Expose
    private String SharedCNAME;

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
<li>HTTP: Origin-pull over HTTP protocol;</li>
<li>HTTPS: origin-pull over the HTTPS protocol.</li>If not specified, the default is FOLLOW. 
     * @return OriginProtocol Origin-pull protocol. Valid values:
<li>FOLLOW: follow protocol;</li>
<li>HTTP: Origin-pull over HTTP protocol;</li>
<li>HTTPS: origin-pull over the HTTPS protocol.</li>If not specified, the default is FOLLOW.
     */
    public String getOriginProtocol() {
        return this.OriginProtocol;
    }

    /**
     * Set Origin-pull protocol. Valid values:
<li>FOLLOW: follow protocol;</li>
<li>HTTP: Origin-pull over HTTP protocol;</li>
<li>HTTPS: origin-pull over the HTTPS protocol.</li>If not specified, the default is FOLLOW.
     * @param OriginProtocol Origin-pull protocol. Valid values:
<li>FOLLOW: follow protocol;</li>
<li>HTTP: Origin-pull over HTTP protocol;</li>
<li>HTTPS: origin-pull over the HTTPS protocol.</li>If not specified, the default is FOLLOW.
     */
    public void setOriginProtocol(String OriginProtocol) {
        this.OriginProtocol = OriginProtocol;
    }

    /**
     * Get HTTP origin-pull port. Default value: 80. Value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTP. 
     * @return HttpOriginPort HTTP origin-pull port. Default value: 80. Value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTP.
     */
    public Long getHttpOriginPort() {
        return this.HttpOriginPort;
    }

    /**
     * Set HTTP origin-pull port. Default value: 80. Value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTP.
     * @param HttpOriginPort HTTP origin-pull port. Default value: 80. Value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTP.
     */
    public void setHttpOriginPort(Long HttpOriginPort) {
        this.HttpOriginPort = HttpOriginPort;
    }

    /**
     * Get HTTPS origin port. Default value: 443. Value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTPS. 
     * @return HttpsOriginPort HTTPS origin port. Default value: 443. Value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTPS.
     */
    public Long getHttpsOriginPort() {
        return this.HttpsOriginPort;
    }

    /**
     * Set HTTPS origin port. Default value: 443. Value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTPS.
     * @param HttpsOriginPort HTTPS origin port. Default value: 443. Value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTPS.
     */
    public void setHttpsOriginPort(Long HttpsOriginPort) {
        this.HttpsOriginPort = HttpsOriginPort;
    }

    /**
     * Get IPv6 status. Valid values:
<li>follow: follow the site IPv6 configuration;</li>
<li>`on`: Enabled status;</li>
<li>off: Disabled.</li>If not specified, the default is: follow. 
     * @return IPv6Status IPv6 status. Valid values:
<li>follow: follow the site IPv6 configuration;</li>
<li>`on`: Enabled status;</li>
<li>off: Disabled.</li>If not specified, the default is: follow.
     */
    public String getIPv6Status() {
        return this.IPv6Status;
    }

    /**
     * Set IPv6 status. Valid values:
<li>follow: follow the site IPv6 configuration;</li>
<li>`on`: Enabled status;</li>
<li>off: Disabled.</li>If not specified, the default is: follow.
     * @param IPv6Status IPv6 status. Valid values:
<li>follow: follow the site IPv6 configuration;</li>
<li>`on`: Enabled status;</li>
<li>off: Disabled.</li>If not specified, the default is: follow.
     */
    public void setIPv6Status(String IPv6Status) {
        this.IPv6Status = IPv6Status;
    }

    /**
     * Get Shared CNAME address bound to the specified domain. If not specified, the default CNAME is used.
Binding a shared CNAME requires the scheduling policies of all domains to be consistent. The following configurations affect the scheduling policy. When they are inconsistent, binding a shared CNAME is processed as follows:
- IPv6 access: not allowed to create a domain name. Modify IPv6Status to match the domain configuration of the rest bound to the shared CNAME.
-DDoS protection: If DDoS protection is enabled for the selected shared CNAME, DDoS protection will be enabled for the domain by default when you create the domain.
-Network optimization in the Chinese mainland (international acceleration): You are not allowed to create a domain name. Make sure the network optimization in the Chinese mainland (international acceleration) configuration of the current domain name is consistent with the rest of the domain names bound to the shared CNAME, and try again later.

Note: Shared CNAME is currently in beta test. To use it, contact us to enable it. 
     * @return SharedCNAME Shared CNAME address bound to the specified domain. If not specified, the default CNAME is used.
Binding a shared CNAME requires the scheduling policies of all domains to be consistent. The following configurations affect the scheduling policy. When they are inconsistent, binding a shared CNAME is processed as follows:
- IPv6 access: not allowed to create a domain name. Modify IPv6Status to match the domain configuration of the rest bound to the shared CNAME.
-DDoS protection: If DDoS protection is enabled for the selected shared CNAME, DDoS protection will be enabled for the domain by default when you create the domain.
-Network optimization in the Chinese mainland (international acceleration): You are not allowed to create a domain name. Make sure the network optimization in the Chinese mainland (international acceleration) configuration of the current domain name is consistent with the rest of the domain names bound to the shared CNAME, and try again later.

Note: Shared CNAME is currently in beta test. To use it, contact us to enable it.
     */
    public String getSharedCNAME() {
        return this.SharedCNAME;
    }

    /**
     * Set Shared CNAME address bound to the specified domain. If not specified, the default CNAME is used.
Binding a shared CNAME requires the scheduling policies of all domains to be consistent. The following configurations affect the scheduling policy. When they are inconsistent, binding a shared CNAME is processed as follows:
- IPv6 access: not allowed to create a domain name. Modify IPv6Status to match the domain configuration of the rest bound to the shared CNAME.
-DDoS protection: If DDoS protection is enabled for the selected shared CNAME, DDoS protection will be enabled for the domain by default when you create the domain.
-Network optimization in the Chinese mainland (international acceleration): You are not allowed to create a domain name. Make sure the network optimization in the Chinese mainland (international acceleration) configuration of the current domain name is consistent with the rest of the domain names bound to the shared CNAME, and try again later.

Note: Shared CNAME is currently in beta test. To use it, contact us to enable it.
     * @param SharedCNAME Shared CNAME address bound to the specified domain. If not specified, the default CNAME is used.
Binding a shared CNAME requires the scheduling policies of all domains to be consistent. The following configurations affect the scheduling policy. When they are inconsistent, binding a shared CNAME is processed as follows:
- IPv6 access: not allowed to create a domain name. Modify IPv6Status to match the domain configuration of the rest bound to the shared CNAME.
-DDoS protection: If DDoS protection is enabled for the selected shared CNAME, DDoS protection will be enabled for the domain by default when you create the domain.
-Network optimization in the Chinese mainland (international acceleration): You are not allowed to create a domain name. Make sure the network optimization in the Chinese mainland (international acceleration) configuration of the current domain name is consistent with the rest of the domain names bound to the shared CNAME, and try again later.

Note: Shared CNAME is currently in beta test. To use it, contact us to enable it.
     */
    public void setSharedCNAME(String SharedCNAME) {
        this.SharedCNAME = SharedCNAME;
    }

    public CreateAccelerationDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccelerationDomainRequest(CreateAccelerationDomainRequest source) {
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
        if (source.SharedCNAME != null) {
            this.SharedCNAME = new String(source.SharedCNAME);
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
        this.setParamSimple(map, prefix + "SharedCNAME", this.SharedCNAME);

    }
}

