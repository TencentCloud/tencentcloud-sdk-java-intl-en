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
    * ID of the site related with the acceleration domain name.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Acceleration domain name
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Details of the origin.
    */
    @SerializedName("OriginInfo")
    @Expose
    private OriginInfo OriginInfo;

    /**
    * Origin-Pull protocol. valid values:.
<Li>FOLLOW: follow protocol;</li>.
<Li>HTTP: http protocol for origin-pull;</li>.
<li>HTTPS: the origin server uses the HTTPS protocol.</li>defaults to FOLLOW if left blank.
    */
    @SerializedName("OriginProtocol")
    @Expose
    private String OriginProtocol;

    /**
    * HTTP origin port. default value 80. value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTP.
    */
    @SerializedName("HttpOriginPort")
    @Expose
    private Long HttpOriginPort;

    /**
    * HTTPS origin port. default value 443. value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTPS.
    */
    @SerializedName("HttpsOriginPort")
    @Expose
    private Long HttpsOriginPort;

    /**
    * IPv6 status. valid values:.
<li>follow: adhere to the site IPv6 configuration;</li>.
<li>on: enabled status;</li>.
<li>off: disabled.</li>if left empty, the default value is follow.
    */
    @SerializedName("IPv6Status")
    @Expose
    private String IPv6Status;

    /**
    * Specify the shared CNAME address for domain binding. use the default CNAME when not specified.
Bind shared CNAME requires the scheduling policy of all domains to be consistent. the following configuration affects the scheduling policy. when inconsistent, bind shared CNAME will be processed as follows:.
-IPv6 access: not allowed to create domain name. change IPv6Status to keep it configured the same as other domain names bound to the shared CNAME.
-Anti-DDoS: if the selected shared CNAME has DDoS protection enabled, domain activation will enable DDoS protection by default.
-Network optimization in the chinese mainland (international acceleration): not allowed to create a domain name. keep the network optimization in the chinese mainland (international acceleration) configuration of the current domain name consistent with the other domain names bound to the shared CNAME and try again after.

Note: shared CNAME is currently in beta test. if you need to use it, contact us to enable it.
    */
    @SerializedName("SharedCNAME")
    @Expose
    private String SharedCNAME;

    /**
     * Get ID of the site related with the acceleration domain name. 
     * @return ZoneId ID of the site related with the acceleration domain name.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site related with the acceleration domain name.
     * @param ZoneId ID of the site related with the acceleration domain name.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Acceleration domain name 
     * @return DomainName Acceleration domain name
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Acceleration domain name
     * @param DomainName Acceleration domain name
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Details of the origin. 
     * @return OriginInfo Details of the origin.
     */
    public OriginInfo getOriginInfo() {
        return this.OriginInfo;
    }

    /**
     * Set Details of the origin.
     * @param OriginInfo Details of the origin.
     */
    public void setOriginInfo(OriginInfo OriginInfo) {
        this.OriginInfo = OriginInfo;
    }

    /**
     * Get Origin-Pull protocol. valid values:.
<Li>FOLLOW: follow protocol;</li>.
<Li>HTTP: http protocol for origin-pull;</li>.
<li>HTTPS: the origin server uses the HTTPS protocol.</li>defaults to FOLLOW if left blank. 
     * @return OriginProtocol Origin-Pull protocol. valid values:.
<Li>FOLLOW: follow protocol;</li>.
<Li>HTTP: http protocol for origin-pull;</li>.
<li>HTTPS: the origin server uses the HTTPS protocol.</li>defaults to FOLLOW if left blank.
     */
    public String getOriginProtocol() {
        return this.OriginProtocol;
    }

    /**
     * Set Origin-Pull protocol. valid values:.
<Li>FOLLOW: follow protocol;</li>.
<Li>HTTP: http protocol for origin-pull;</li>.
<li>HTTPS: the origin server uses the HTTPS protocol.</li>defaults to FOLLOW if left blank.
     * @param OriginProtocol Origin-Pull protocol. valid values:.
<Li>FOLLOW: follow protocol;</li>.
<Li>HTTP: http protocol for origin-pull;</li>.
<li>HTTPS: the origin server uses the HTTPS protocol.</li>defaults to FOLLOW if left blank.
     */
    public void setOriginProtocol(String OriginProtocol) {
        this.OriginProtocol = OriginProtocol;
    }

    /**
     * Get HTTP origin port. default value 80. value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTP. 
     * @return HttpOriginPort HTTP origin port. default value 80. value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTP.
     */
    public Long getHttpOriginPort() {
        return this.HttpOriginPort;
    }

    /**
     * Set HTTP origin port. default value 80. value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTP.
     * @param HttpOriginPort HTTP origin port. default value 80. value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTP.
     */
    public void setHttpOriginPort(Long HttpOriginPort) {
        this.HttpOriginPort = HttpOriginPort;
    }

    /**
     * Get HTTPS origin port. default value 443. value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTPS. 
     * @return HttpsOriginPort HTTPS origin port. default value 443. value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTPS.
     */
    public Long getHttpsOriginPort() {
        return this.HttpsOriginPort;
    }

    /**
     * Set HTTPS origin port. default value 443. value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTPS.
     * @param HttpsOriginPort HTTPS origin port. default value 443. value range: 1–65535.
This parameter is valid only when OriginProtocol is FOLLOW or HTTPS.
     */
    public void setHttpsOriginPort(Long HttpsOriginPort) {
        this.HttpsOriginPort = HttpsOriginPort;
    }

    /**
     * Get IPv6 status. valid values:.
<li>follow: adhere to the site IPv6 configuration;</li>.
<li>on: enabled status;</li>.
<li>off: disabled.</li>if left empty, the default value is follow. 
     * @return IPv6Status IPv6 status. valid values:.
<li>follow: adhere to the site IPv6 configuration;</li>.
<li>on: enabled status;</li>.
<li>off: disabled.</li>if left empty, the default value is follow.
     */
    public String getIPv6Status() {
        return this.IPv6Status;
    }

    /**
     * Set IPv6 status. valid values:.
<li>follow: adhere to the site IPv6 configuration;</li>.
<li>on: enabled status;</li>.
<li>off: disabled.</li>if left empty, the default value is follow.
     * @param IPv6Status IPv6 status. valid values:.
<li>follow: adhere to the site IPv6 configuration;</li>.
<li>on: enabled status;</li>.
<li>off: disabled.</li>if left empty, the default value is follow.
     */
    public void setIPv6Status(String IPv6Status) {
        this.IPv6Status = IPv6Status;
    }

    /**
     * Get Specify the shared CNAME address for domain binding. use the default CNAME when not specified.
Bind shared CNAME requires the scheduling policy of all domains to be consistent. the following configuration affects the scheduling policy. when inconsistent, bind shared CNAME will be processed as follows:.
-IPv6 access: not allowed to create domain name. change IPv6Status to keep it configured the same as other domain names bound to the shared CNAME.
-Anti-DDoS: if the selected shared CNAME has DDoS protection enabled, domain activation will enable DDoS protection by default.
-Network optimization in the chinese mainland (international acceleration): not allowed to create a domain name. keep the network optimization in the chinese mainland (international acceleration) configuration of the current domain name consistent with the other domain names bound to the shared CNAME and try again after.

Note: shared CNAME is currently in beta test. if you need to use it, contact us to enable it. 
     * @return SharedCNAME Specify the shared CNAME address for domain binding. use the default CNAME when not specified.
Bind shared CNAME requires the scheduling policy of all domains to be consistent. the following configuration affects the scheduling policy. when inconsistent, bind shared CNAME will be processed as follows:.
-IPv6 access: not allowed to create domain name. change IPv6Status to keep it configured the same as other domain names bound to the shared CNAME.
-Anti-DDoS: if the selected shared CNAME has DDoS protection enabled, domain activation will enable DDoS protection by default.
-Network optimization in the chinese mainland (international acceleration): not allowed to create a domain name. keep the network optimization in the chinese mainland (international acceleration) configuration of the current domain name consistent with the other domain names bound to the shared CNAME and try again after.

Note: shared CNAME is currently in beta test. if you need to use it, contact us to enable it.
     */
    public String getSharedCNAME() {
        return this.SharedCNAME;
    }

    /**
     * Set Specify the shared CNAME address for domain binding. use the default CNAME when not specified.
Bind shared CNAME requires the scheduling policy of all domains to be consistent. the following configuration affects the scheduling policy. when inconsistent, bind shared CNAME will be processed as follows:.
-IPv6 access: not allowed to create domain name. change IPv6Status to keep it configured the same as other domain names bound to the shared CNAME.
-Anti-DDoS: if the selected shared CNAME has DDoS protection enabled, domain activation will enable DDoS protection by default.
-Network optimization in the chinese mainland (international acceleration): not allowed to create a domain name. keep the network optimization in the chinese mainland (international acceleration) configuration of the current domain name consistent with the other domain names bound to the shared CNAME and try again after.

Note: shared CNAME is currently in beta test. if you need to use it, contact us to enable it.
     * @param SharedCNAME Specify the shared CNAME address for domain binding. use the default CNAME when not specified.
Bind shared CNAME requires the scheduling policy of all domains to be consistent. the following configuration affects the scheduling policy. when inconsistent, bind shared CNAME will be processed as follows:.
-IPv6 access: not allowed to create domain name. change IPv6Status to keep it configured the same as other domain names bound to the shared CNAME.
-Anti-DDoS: if the selected shared CNAME has DDoS protection enabled, domain activation will enable DDoS protection by default.
-Network optimization in the chinese mainland (international acceleration): not allowed to create a domain name. keep the network optimization in the chinese mainland (international acceleration) configuration of the current domain name consistent with the other domain names bound to the shared CNAME and try again after.

Note: shared CNAME is currently in beta test. if you need to use it, contact us to enable it.
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

