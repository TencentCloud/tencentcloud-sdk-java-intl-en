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

public class AccelerationDomain extends AbstractModel {

    /**
    * ID of the site.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Accelerated domain name
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Accelerated domain name status. valid values:.
<li>online: in effect;</li>.
<li>process: deployment in progress.</li>.
<li>offline: disabled;</li>.
<li>`forbidden`: banned.</li>.
<li>init: not applied, site to be activated.</li>.
    */
    @SerializedName("DomainStatus")
    @Expose
    private String DomainStatus;

    /**
    * The CNAME address.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * IPv6 status. valid values:.
<li>follow: specifies whether to adhere to the site IPv6 configuration.</li>.
<li>on: enabled status.</li>.
<li>off: disabled.</li>.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("IPv6Status")
    @Expose
    private String IPv6Status;

    /**
    * Acceleration domain ownership verification status. valid values:. 
<li>pending: to be verified.</li>.
<li>finished: verified.</li>.	
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("IdentificationStatus")
    @Expose
    private String IdentificationStatus;

    /**
    * Acceleration domain name needs to perform ownership verification to continue providing services. this object carries the required information for the corresponding verification method.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("OwnershipVerification")
    @Expose
    private OwnershipVerification OwnershipVerification;

    /**
    * Details of the origin.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginDetail")
    @Expose
    private OriginDetail OriginDetail;

    /**
    * Origin-Pull protocol. valid values:.
<Li>FOLLOW: follow protocol.</li>.
<Li>HTTP: specifies the http protocol for origin-pull.</li>.
<Li>HTTPS: specifies the https protocol for origin-pull.</li>.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("OriginProtocol")
    @Expose
    private String OriginProtocol;

    /**
    * Specifies the HTTP origin port.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("HttpOriginPort")
    @Expose
    private Long HttpOriginPort;

    /**
    * Specifies the HTTPS origin port.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("HttpsOriginPort")
    @Expose
    private Long HttpsOriginPort;

    /**
    * Accelerates domain name certificate information.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Certificate")
    @Expose
    private AccelerationDomainCertificate Certificate;

    /**
    * Creation time of the accelerated domain name.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Modification time of the accelerated domain name.
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get ID of the site. 
     * @return ZoneId ID of the site.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site.
     * @param ZoneId ID of the site.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Accelerated domain name 
     * @return DomainName Accelerated domain name
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Accelerated domain name
     * @param DomainName Accelerated domain name
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Accelerated domain name status. valid values:.
<li>online: in effect;</li>.
<li>process: deployment in progress.</li>.
<li>offline: disabled;</li>.
<li>`forbidden`: banned.</li>.
<li>init: not applied, site to be activated.</li>. 
     * @return DomainStatus Accelerated domain name status. valid values:.
<li>online: in effect;</li>.
<li>process: deployment in progress.</li>.
<li>offline: disabled;</li>.
<li>`forbidden`: banned.</li>.
<li>init: not applied, site to be activated.</li>.
     */
    public String getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set Accelerated domain name status. valid values:.
<li>online: in effect;</li>.
<li>process: deployment in progress.</li>.
<li>offline: disabled;</li>.
<li>`forbidden`: banned.</li>.
<li>init: not applied, site to be activated.</li>.
     * @param DomainStatus Accelerated domain name status. valid values:.
<li>online: in effect;</li>.
<li>process: deployment in progress.</li>.
<li>offline: disabled;</li>.
<li>`forbidden`: banned.</li>.
<li>init: not applied, site to be activated.</li>.
     */
    public void setDomainStatus(String DomainStatus) {
        this.DomainStatus = DomainStatus;
    }

    /**
     * Get The CNAME address. 
     * @return Cname The CNAME address.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set The CNAME address.
     * @param Cname The CNAME address.
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get IPv6 status. valid values:.
<li>follow: specifies whether to adhere to the site IPv6 configuration.</li>.
<li>on: enabled status.</li>.
<li>off: disabled.</li>.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return IPv6Status IPv6 status. valid values:.
<li>follow: specifies whether to adhere to the site IPv6 configuration.</li>.
<li>on: enabled status.</li>.
<li>off: disabled.</li>.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getIPv6Status() {
        return this.IPv6Status;
    }

    /**
     * Set IPv6 status. valid values:.
<li>follow: specifies whether to adhere to the site IPv6 configuration.</li>.
<li>on: enabled status.</li>.
<li>off: disabled.</li>.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param IPv6Status IPv6 status. valid values:.
<li>follow: specifies whether to adhere to the site IPv6 configuration.</li>.
<li>on: enabled status.</li>.
<li>off: disabled.</li>.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setIPv6Status(String IPv6Status) {
        this.IPv6Status = IPv6Status;
    }

    /**
     * Get Acceleration domain ownership verification status. valid values:. 
<li>pending: to be verified.</li>.
<li>finished: verified.</li>.	
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return IdentificationStatus Acceleration domain ownership verification status. valid values:. 
<li>pending: to be verified.</li>.
<li>finished: verified.</li>.	
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getIdentificationStatus() {
        return this.IdentificationStatus;
    }

    /**
     * Set Acceleration domain ownership verification status. valid values:. 
<li>pending: to be verified.</li>.
<li>finished: verified.</li>.	
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param IdentificationStatus Acceleration domain ownership verification status. valid values:. 
<li>pending: to be verified.</li>.
<li>finished: verified.</li>.	
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setIdentificationStatus(String IdentificationStatus) {
        this.IdentificationStatus = IdentificationStatus;
    }

    /**
     * Get Acceleration domain name needs to perform ownership verification to continue providing services. this object carries the required information for the corresponding verification method.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return OwnershipVerification Acceleration domain name needs to perform ownership verification to continue providing services. this object carries the required information for the corresponding verification method.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public OwnershipVerification getOwnershipVerification() {
        return this.OwnershipVerification;
    }

    /**
     * Set Acceleration domain name needs to perform ownership verification to continue providing services. this object carries the required information for the corresponding verification method.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param OwnershipVerification Acceleration domain name needs to perform ownership verification to continue providing services. this object carries the required information for the corresponding verification method.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setOwnershipVerification(OwnershipVerification OwnershipVerification) {
        this.OwnershipVerification = OwnershipVerification;
    }

    /**
     * Get Details of the origin.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginDetail Details of the origin.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public OriginDetail getOriginDetail() {
        return this.OriginDetail;
    }

    /**
     * Set Details of the origin.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginDetail Details of the origin.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginDetail(OriginDetail OriginDetail) {
        this.OriginDetail = OriginDetail;
    }

    /**
     * Get Origin-Pull protocol. valid values:.
<Li>FOLLOW: follow protocol.</li>.
<Li>HTTP: specifies the http protocol for origin-pull.</li>.
<Li>HTTPS: specifies the https protocol for origin-pull.</li>.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return OriginProtocol Origin-Pull protocol. valid values:.
<Li>FOLLOW: follow protocol.</li>.
<Li>HTTP: specifies the http protocol for origin-pull.</li>.
<Li>HTTPS: specifies the https protocol for origin-pull.</li>.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getOriginProtocol() {
        return this.OriginProtocol;
    }

    /**
     * Set Origin-Pull protocol. valid values:.
<Li>FOLLOW: follow protocol.</li>.
<Li>HTTP: specifies the http protocol for origin-pull.</li>.
<Li>HTTPS: specifies the https protocol for origin-pull.</li>.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param OriginProtocol Origin-Pull protocol. valid values:.
<Li>FOLLOW: follow protocol.</li>.
<Li>HTTP: specifies the http protocol for origin-pull.</li>.
<Li>HTTPS: specifies the https protocol for origin-pull.</li>.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setOriginProtocol(String OriginProtocol) {
        this.OriginProtocol = OriginProtocol;
    }

    /**
     * Get Specifies the HTTP origin port.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return HttpOriginPort Specifies the HTTP origin port.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public Long getHttpOriginPort() {
        return this.HttpOriginPort;
    }

    /**
     * Set Specifies the HTTP origin port.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param HttpOriginPort Specifies the HTTP origin port.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setHttpOriginPort(Long HttpOriginPort) {
        this.HttpOriginPort = HttpOriginPort;
    }

    /**
     * Get Specifies the HTTPS origin port.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return HttpsOriginPort Specifies the HTTPS origin port.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public Long getHttpsOriginPort() {
        return this.HttpsOriginPort;
    }

    /**
     * Set Specifies the HTTPS origin port.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param HttpsOriginPort Specifies the HTTPS origin port.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setHttpsOriginPort(Long HttpsOriginPort) {
        this.HttpsOriginPort = HttpsOriginPort;
    }

    /**
     * Get Accelerates domain name certificate information.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return Certificate Accelerates domain name certificate information.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public AccelerationDomainCertificate getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Accelerates domain name certificate information.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param Certificate Accelerates domain name certificate information.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setCertificate(AccelerationDomainCertificate Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get Creation time of the accelerated domain name. 
     * @return CreatedOn Creation time of the accelerated domain name.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Creation time of the accelerated domain name.
     * @param CreatedOn Creation time of the accelerated domain name.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Modification time of the accelerated domain name. 
     * @return ModifiedOn Modification time of the accelerated domain name.
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set Modification time of the accelerated domain name.
     * @param ModifiedOn Modification time of the accelerated domain name.
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    public AccelerationDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccelerationDomain(AccelerationDomain source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.DomainStatus != null) {
            this.DomainStatus = new String(source.DomainStatus);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.IPv6Status != null) {
            this.IPv6Status = new String(source.IPv6Status);
        }
        if (source.IdentificationStatus != null) {
            this.IdentificationStatus = new String(source.IdentificationStatus);
        }
        if (source.OwnershipVerification != null) {
            this.OwnershipVerification = new OwnershipVerification(source.OwnershipVerification);
        }
        if (source.OriginDetail != null) {
            this.OriginDetail = new OriginDetail(source.OriginDetail);
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
        if (source.Certificate != null) {
            this.Certificate = new AccelerationDomainCertificate(source.Certificate);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "DomainStatus", this.DomainStatus);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "IPv6Status", this.IPv6Status);
        this.setParamSimple(map, prefix + "IdentificationStatus", this.IdentificationStatus);
        this.setParamObj(map, prefix + "OwnershipVerification.", this.OwnershipVerification);
        this.setParamObj(map, prefix + "OriginDetail.", this.OriginDetail);
        this.setParamSimple(map, prefix + "OriginProtocol", this.OriginProtocol);
        this.setParamSimple(map, prefix + "HttpOriginPort", this.HttpOriginPort);
        this.setParamSimple(map, prefix + "HttpsOriginPort", this.HttpsOriginPort);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);

    }
}

