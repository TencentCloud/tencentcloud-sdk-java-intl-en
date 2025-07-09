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
    * Status of the accelerated domain name. Values:
<li>`online`: Activated</li>
<li>`process`: Being deployed</li>
<li>`offline`: Disabled</li>
<li>`forbidden`: Blocked</li>
<li>`init`: Pending activation</li>
    */
    @SerializedName("DomainStatus")
    @Expose
    private String DomainStatus;

    /**
    * Details of the origin.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginDetail")
    @Expose
    private OriginDetail OriginDetail;

    /**
    * Origin-pull protocol configuration. Values:
<li>`FOLLOW`: Follow the protocol of origin</li>
<li>`HTTP`: Send requests to the origin over HTTP</li>
<li>`HTTPS`: Send requests to the origin over HTTPS</li>
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginProtocol")
    @Expose
    private String OriginProtocol;

    /**
    * The port used for HTTP origin-pull requests
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpOriginPort")
    @Expose
    private Long HttpOriginPort;

    /**
    * The port used for HTTPS origin-pull requests
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpsOriginPort")
    @Expose
    private Long HttpsOriginPort;

    /**
    * IPv6 status. Values:
<li>`follow`: Follow the IPv6 configuration of the site</li>
<li>`on`: Enable</li>
<li>`off`: Disable</li>
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("IPv6Status")
    @Expose
    private String IPv6Status;

    /**
    * The CNAME address.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * Ownership verification status. Values: <li>`pending`: Pending verification</li> <li>`finished`: Verified</li>	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdentificationStatus")
    @Expose
    private String IdentificationStatus;

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
    * Information required to verify the ownership of a domain name.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnershipVerification")
    @Expose
    private OwnershipVerification OwnershipVerification;

    /**
    * Domain name certificate information
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Certificate")
    @Expose
    private AccelerationDomainCertificate Certificate;

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
     * Get Status of the accelerated domain name. Values:
<li>`online`: Activated</li>
<li>`process`: Being deployed</li>
<li>`offline`: Disabled</li>
<li>`forbidden`: Blocked</li>
<li>`init`: Pending activation</li> 
     * @return DomainStatus Status of the accelerated domain name. Values:
<li>`online`: Activated</li>
<li>`process`: Being deployed</li>
<li>`offline`: Disabled</li>
<li>`forbidden`: Blocked</li>
<li>`init`: Pending activation</li>
     */
    public String getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set Status of the accelerated domain name. Values:
<li>`online`: Activated</li>
<li>`process`: Being deployed</li>
<li>`offline`: Disabled</li>
<li>`forbidden`: Blocked</li>
<li>`init`: Pending activation</li>
     * @param DomainStatus Status of the accelerated domain name. Values:
<li>`online`: Activated</li>
<li>`process`: Being deployed</li>
<li>`offline`: Disabled</li>
<li>`forbidden`: Blocked</li>
<li>`init`: Pending activation</li>
     */
    public void setDomainStatus(String DomainStatus) {
        this.DomainStatus = DomainStatus;
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
     * Get Origin-pull protocol configuration. Values:
<li>`FOLLOW`: Follow the protocol of origin</li>
<li>`HTTP`: Send requests to the origin over HTTP</li>
<li>`HTTPS`: Send requests to the origin over HTTPS</li>
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return OriginProtocol Origin-pull protocol configuration. Values:
<li>`FOLLOW`: Follow the protocol of origin</li>
<li>`HTTP`: Send requests to the origin over HTTP</li>
<li>`HTTPS`: Send requests to the origin over HTTPS</li>
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getOriginProtocol() {
        return this.OriginProtocol;
    }

    /**
     * Set Origin-pull protocol configuration. Values:
<li>`FOLLOW`: Follow the protocol of origin</li>
<li>`HTTP`: Send requests to the origin over HTTP</li>
<li>`HTTPS`: Send requests to the origin over HTTPS</li>
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param OriginProtocol Origin-pull protocol configuration. Values:
<li>`FOLLOW`: Follow the protocol of origin</li>
<li>`HTTP`: Send requests to the origin over HTTP</li>
<li>`HTTPS`: Send requests to the origin over HTTPS</li>
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setOriginProtocol(String OriginProtocol) {
        this.OriginProtocol = OriginProtocol;
    }

    /**
     * Get The port used for HTTP origin-pull requests
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return HttpOriginPort The port used for HTTP origin-pull requests
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getHttpOriginPort() {
        return this.HttpOriginPort;
    }

    /**
     * Set The port used for HTTP origin-pull requests
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param HttpOriginPort The port used for HTTP origin-pull requests
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setHttpOriginPort(Long HttpOriginPort) {
        this.HttpOriginPort = HttpOriginPort;
    }

    /**
     * Get The port used for HTTPS origin-pull requests
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return HttpsOriginPort The port used for HTTPS origin-pull requests
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getHttpsOriginPort() {
        return this.HttpsOriginPort;
    }

    /**
     * Set The port used for HTTPS origin-pull requests
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param HttpsOriginPort The port used for HTTPS origin-pull requests
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setHttpsOriginPort(Long HttpsOriginPort) {
        this.HttpsOriginPort = HttpsOriginPort;
    }

    /**
     * Get IPv6 status. Values:
<li>`follow`: Follow the IPv6 configuration of the site</li>
<li>`on`: Enable</li>
<li>`off`: Disable</li>
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return IPv6Status IPv6 status. Values:
<li>`follow`: Follow the IPv6 configuration of the site</li>
<li>`on`: Enable</li>
<li>`off`: Disable</li>
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getIPv6Status() {
        return this.IPv6Status;
    }

    /**
     * Set IPv6 status. Values:
<li>`follow`: Follow the IPv6 configuration of the site</li>
<li>`on`: Enable</li>
<li>`off`: Disable</li>
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param IPv6Status IPv6 status. Values:
<li>`follow`: Follow the IPv6 configuration of the site</li>
<li>`on`: Enable</li>
<li>`off`: Disable</li>
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setIPv6Status(String IPv6Status) {
        this.IPv6Status = IPv6Status;
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
     * Get Ownership verification status. Values: <li>`pending`: Pending verification</li> <li>`finished`: Verified</li>	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdentificationStatus Ownership verification status. Values: <li>`pending`: Pending verification</li> <li>`finished`: Verified</li>	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIdentificationStatus() {
        return this.IdentificationStatus;
    }

    /**
     * Set Ownership verification status. Values: <li>`pending`: Pending verification</li> <li>`finished`: Verified</li>	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdentificationStatus Ownership verification status. Values: <li>`pending`: Pending verification</li> <li>`finished`: Verified</li>	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdentificationStatus(String IdentificationStatus) {
        this.IdentificationStatus = IdentificationStatus;
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

    /**
     * Get Information required to verify the ownership of a domain name.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return OwnershipVerification Information required to verify the ownership of a domain name.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public OwnershipVerification getOwnershipVerification() {
        return this.OwnershipVerification;
    }

    /**
     * Set Information required to verify the ownership of a domain name.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param OwnershipVerification Information required to verify the ownership of a domain name.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setOwnershipVerification(OwnershipVerification OwnershipVerification) {
        this.OwnershipVerification = OwnershipVerification;
    }

    /**
     * Get Domain name certificate information
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Certificate Domain name certificate information
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public AccelerationDomainCertificate getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Domain name certificate information
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Certificate Domain name certificate information
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setCertificate(AccelerationDomainCertificate Certificate) {
        this.Certificate = Certificate;
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
        if (source.IPv6Status != null) {
            this.IPv6Status = new String(source.IPv6Status);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.IdentificationStatus != null) {
            this.IdentificationStatus = new String(source.IdentificationStatus);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.OwnershipVerification != null) {
            this.OwnershipVerification = new OwnershipVerification(source.OwnershipVerification);
        }
        if (source.Certificate != null) {
            this.Certificate = new AccelerationDomainCertificate(source.Certificate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "DomainStatus", this.DomainStatus);
        this.setParamObj(map, prefix + "OriginDetail.", this.OriginDetail);
        this.setParamSimple(map, prefix + "OriginProtocol", this.OriginProtocol);
        this.setParamSimple(map, prefix + "HttpOriginPort", this.HttpOriginPort);
        this.setParamSimple(map, prefix + "HttpsOriginPort", this.HttpsOriginPort);
        this.setParamSimple(map, prefix + "IPv6Status", this.IPv6Status);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "IdentificationStatus", this.IdentificationStatus);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamObj(map, prefix + "OwnershipVerification.", this.OwnershipVerification);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);

    }
}

