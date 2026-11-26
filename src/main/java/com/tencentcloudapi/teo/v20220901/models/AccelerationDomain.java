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
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Acceleration domain name.</p>
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * <p>Acceleration domain name status</p><p>Enumeration values:</p><ul><li>online: effective</li><li>process: deploying</li><li>offline: disabled</li><li>init: not applied, site to be activated</li></ul>
    */
    @SerializedName("DomainStatus")
    @Expose
    private String DomainStatus;

    /**
    * <p>CNAME address.</p>
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * <p>IPv6 status. Valid values:</p><li>follow: Follow the site IPv6 configuration;</li><li>on: Enabled;</li><li>off: Disabled.</li>
    */
    @SerializedName("IPv6Status")
    @Expose
    private String IPv6Status;

    /**
    * <p>Acceleration domain ownership verification status. Valid values: </p><li>pending: to be verified;</li><li>finished: verified.</li>
    */
    @SerializedName("IdentificationStatus")
    @Expose
    private String IdentificationStatus;

    /**
    * <p>When the acceleration domain name needs to perform ownership verification to continue providing services, this object will carry the information required for the corresponding verification method.</p>
    */
    @SerializedName("OwnershipVerification")
    @Expose
    private OwnershipVerification OwnershipVerification;

    /**
    * <p>Origin server information.</p>
    */
    @SerializedName("OriginDetail")
    @Expose
    private OriginDetail OriginDetail;

    /**
    * <p>Origin-pull protocol. Valid values:</p><li>FOLLOW: follow protocol;</li><li>HTTP: origin-pull over HTTP protocol;</li><li>HTTPS: origin-pull over HTTPS protocol.</li>
    */
    @SerializedName("OriginProtocol")
    @Expose
    private String OriginProtocol;

    /**
    * <p>HTTP origin port.</p>
    */
    @SerializedName("HttpOriginPort")
    @Expose
    private Long HttpOriginPort;

    /**
    * <p>HTTPS origin port.</p>
    */
    @SerializedName("HttpsOriginPort")
    @Expose
    private Long HttpsOriginPort;

    /**
    * <p>Acceleration domain name certificate information.</p>
    */
    @SerializedName("Certificate")
    @Expose
    private AccelerationDomainCertificate Certificate;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * <p>Last modified.</p>
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * <p>List of region access restrictions on a domain name due to compliance issues.</p>
    */
    @SerializedName("ComplianceRestrictions")
    @Expose
    private ComplianceRestriction [] ComplianceRestrictions;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Acceleration domain name.</p> 
     * @return DomainName <p>Acceleration domain name.</p>
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set <p>Acceleration domain name.</p>
     * @param DomainName <p>Acceleration domain name.</p>
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get <p>Acceleration domain name status</p><p>Enumeration values:</p><ul><li>online: effective</li><li>process: deploying</li><li>offline: disabled</li><li>init: not applied, site to be activated</li></ul> 
     * @return DomainStatus <p>Acceleration domain name status</p><p>Enumeration values:</p><ul><li>online: effective</li><li>process: deploying</li><li>offline: disabled</li><li>init: not applied, site to be activated</li></ul>
     */
    public String getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set <p>Acceleration domain name status</p><p>Enumeration values:</p><ul><li>online: effective</li><li>process: deploying</li><li>offline: disabled</li><li>init: not applied, site to be activated</li></ul>
     * @param DomainStatus <p>Acceleration domain name status</p><p>Enumeration values:</p><ul><li>online: effective</li><li>process: deploying</li><li>offline: disabled</li><li>init: not applied, site to be activated</li></ul>
     */
    public void setDomainStatus(String DomainStatus) {
        this.DomainStatus = DomainStatus;
    }

    /**
     * Get <p>CNAME address.</p> 
     * @return Cname <p>CNAME address.</p>
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set <p>CNAME address.</p>
     * @param Cname <p>CNAME address.</p>
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get <p>IPv6 status. Valid values:</p><li>follow: Follow the site IPv6 configuration;</li><li>on: Enabled;</li><li>off: Disabled.</li> 
     * @return IPv6Status <p>IPv6 status. Valid values:</p><li>follow: Follow the site IPv6 configuration;</li><li>on: Enabled;</li><li>off: Disabled.</li>
     */
    public String getIPv6Status() {
        return this.IPv6Status;
    }

    /**
     * Set <p>IPv6 status. Valid values:</p><li>follow: Follow the site IPv6 configuration;</li><li>on: Enabled;</li><li>off: Disabled.</li>
     * @param IPv6Status <p>IPv6 status. Valid values:</p><li>follow: Follow the site IPv6 configuration;</li><li>on: Enabled;</li><li>off: Disabled.</li>
     */
    public void setIPv6Status(String IPv6Status) {
        this.IPv6Status = IPv6Status;
    }

    /**
     * Get <p>Acceleration domain ownership verification status. Valid values: </p><li>pending: to be verified;</li><li>finished: verified.</li> 
     * @return IdentificationStatus <p>Acceleration domain ownership verification status. Valid values: </p><li>pending: to be verified;</li><li>finished: verified.</li>
     */
    public String getIdentificationStatus() {
        return this.IdentificationStatus;
    }

    /**
     * Set <p>Acceleration domain ownership verification status. Valid values: </p><li>pending: to be verified;</li><li>finished: verified.</li>
     * @param IdentificationStatus <p>Acceleration domain ownership verification status. Valid values: </p><li>pending: to be verified;</li><li>finished: verified.</li>
     */
    public void setIdentificationStatus(String IdentificationStatus) {
        this.IdentificationStatus = IdentificationStatus;
    }

    /**
     * Get <p>When the acceleration domain name needs to perform ownership verification to continue providing services, this object will carry the information required for the corresponding verification method.</p> 
     * @return OwnershipVerification <p>When the acceleration domain name needs to perform ownership verification to continue providing services, this object will carry the information required for the corresponding verification method.</p>
     */
    public OwnershipVerification getOwnershipVerification() {
        return this.OwnershipVerification;
    }

    /**
     * Set <p>When the acceleration domain name needs to perform ownership verification to continue providing services, this object will carry the information required for the corresponding verification method.</p>
     * @param OwnershipVerification <p>When the acceleration domain name needs to perform ownership verification to continue providing services, this object will carry the information required for the corresponding verification method.</p>
     */
    public void setOwnershipVerification(OwnershipVerification OwnershipVerification) {
        this.OwnershipVerification = OwnershipVerification;
    }

    /**
     * Get <p>Origin server information.</p> 
     * @return OriginDetail <p>Origin server information.</p>
     */
    public OriginDetail getOriginDetail() {
        return this.OriginDetail;
    }

    /**
     * Set <p>Origin server information.</p>
     * @param OriginDetail <p>Origin server information.</p>
     */
    public void setOriginDetail(OriginDetail OriginDetail) {
        this.OriginDetail = OriginDetail;
    }

    /**
     * Get <p>Origin-pull protocol. Valid values:</p><li>FOLLOW: follow protocol;</li><li>HTTP: origin-pull over HTTP protocol;</li><li>HTTPS: origin-pull over HTTPS protocol.</li> 
     * @return OriginProtocol <p>Origin-pull protocol. Valid values:</p><li>FOLLOW: follow protocol;</li><li>HTTP: origin-pull over HTTP protocol;</li><li>HTTPS: origin-pull over HTTPS protocol.</li>
     */
    public String getOriginProtocol() {
        return this.OriginProtocol;
    }

    /**
     * Set <p>Origin-pull protocol. Valid values:</p><li>FOLLOW: follow protocol;</li><li>HTTP: origin-pull over HTTP protocol;</li><li>HTTPS: origin-pull over HTTPS protocol.</li>
     * @param OriginProtocol <p>Origin-pull protocol. Valid values:</p><li>FOLLOW: follow protocol;</li><li>HTTP: origin-pull over HTTP protocol;</li><li>HTTPS: origin-pull over HTTPS protocol.</li>
     */
    public void setOriginProtocol(String OriginProtocol) {
        this.OriginProtocol = OriginProtocol;
    }

    /**
     * Get <p>HTTP origin port.</p> 
     * @return HttpOriginPort <p>HTTP origin port.</p>
     */
    public Long getHttpOriginPort() {
        return this.HttpOriginPort;
    }

    /**
     * Set <p>HTTP origin port.</p>
     * @param HttpOriginPort <p>HTTP origin port.</p>
     */
    public void setHttpOriginPort(Long HttpOriginPort) {
        this.HttpOriginPort = HttpOriginPort;
    }

    /**
     * Get <p>HTTPS origin port.</p> 
     * @return HttpsOriginPort <p>HTTPS origin port.</p>
     */
    public Long getHttpsOriginPort() {
        return this.HttpsOriginPort;
    }

    /**
     * Set <p>HTTPS origin port.</p>
     * @param HttpsOriginPort <p>HTTPS origin port.</p>
     */
    public void setHttpsOriginPort(Long HttpsOriginPort) {
        this.HttpsOriginPort = HttpsOriginPort;
    }

    /**
     * Get <p>Acceleration domain name certificate information.</p> 
     * @return Certificate <p>Acceleration domain name certificate information.</p>
     */
    public AccelerationDomainCertificate getCertificate() {
        return this.Certificate;
    }

    /**
     * Set <p>Acceleration domain name certificate information.</p>
     * @param Certificate <p>Acceleration domain name certificate information.</p>
     */
    public void setCertificate(AccelerationDomainCertificate Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreatedOn <p>Creation time.</p>
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreatedOn <p>Creation time.</p>
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get <p>Last modified.</p> 
     * @return ModifiedOn <p>Last modified.</p>
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set <p>Last modified.</p>
     * @param ModifiedOn <p>Last modified.</p>
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get <p>List of region access restrictions on a domain name due to compliance issues.</p> 
     * @return ComplianceRestrictions <p>List of region access restrictions on a domain name due to compliance issues.</p>
     */
    public ComplianceRestriction [] getComplianceRestrictions() {
        return this.ComplianceRestrictions;
    }

    /**
     * Set <p>List of region access restrictions on a domain name due to compliance issues.</p>
     * @param ComplianceRestrictions <p>List of region access restrictions on a domain name due to compliance issues.</p>
     */
    public void setComplianceRestrictions(ComplianceRestriction [] ComplianceRestrictions) {
        this.ComplianceRestrictions = ComplianceRestrictions;
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
        if (source.ComplianceRestrictions != null) {
            this.ComplianceRestrictions = new ComplianceRestriction[source.ComplianceRestrictions.length];
            for (int i = 0; i < source.ComplianceRestrictions.length; i++) {
                this.ComplianceRestrictions[i] = new ComplianceRestriction(source.ComplianceRestrictions[i]);
            }
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
        this.setParamArrayObj(map, prefix + "ComplianceRestrictions.", this.ComplianceRestrictions);

    }
}

