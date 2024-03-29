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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Certificates extends AbstractModel {

    /**
    * User UIN
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Project ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Certificate source
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * The certificate plan type. Valid values:
null: Certificates uploaded by users (no plan type)
`1`: GeoTrust DV SSL CA - G3; `2`: TrustAsia TLS RSA CA; `3`: SecureSite EV Pro; `4`: SecureSite EV; `5`: SecureSite OV Pro; `6`: SecureSite OV; `7`: SecureSite OV wildcard; `8`: GeoTrust EV; `9`: GeoTrust OV; `10`: GeoTrust OV wildcard; `11`: TrustAsia DV multi-domain; `12`: TrustAsia DV wildcard; `13`: TrustAsia OV wildcard D3; `14`: TrustAsia OV D3; `15`: TrustAsia OV multi-domain D3; `16`: TrustAsia EV D3; `17`: TrustAsia EV multi-domain D3; `18`: GlobalSign OV; `19`: GlobalSign OV wildcard; `20`: GlobalSign EV; `21`: TrustAsia OV wildcard multi-domain D3; `22`: GlobalSign OV multi-domain; `23`: GlobalSign OV wildcard multi-domain; `24`: GlobalSign EV multi-domain
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Certificate type. `CA`: client certificate; `SVR`: server certificate
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * Issuer
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductZhName")
    @Expose
    private String ProductZhName;

    /**
    * Primary domain name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Alias
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Status. `0`: Reviewing; `1`: Approved; `2`: Unapproved; `3`: Expired; `4`: DNS record added for domain names of the DNS_AUTO verification type; `5`: Enterprise-grade certificate, pending submission; `6`: Canceling order; `7`: Canceled; `8`: Information submitted, pending confirmation letter upload; `9`: Revoking certificate; `10`: Revoked; `11`: Reissuing; `12`: Pending revocation confirmation letter upload; `13`: Pending information submission for the free certificate; `14`: Refunded.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Extended information of the certificate
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificateExtra")
    @Expose
    private CertificateExtra CertificateExtra;

    /**
    * Vulnerability scanning status. `INACTIVE`: not activated; `ACTIVE`: activated
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulnerabilityStatus")
    @Expose
    private String VulnerabilityStatus;

    /**
    * Status information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusMsg")
    @Expose
    private String StatusMsg;

    /**
    * Validation type. `DNS_AUTO`: automatic DNS validation; `DNS`: manual DNS validation; `FILE`: file validation; `EMAIL`: email validation
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * Time when the certificate takes effect
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertBeginTime")
    @Expose
    private String CertBeginTime;

    /**
    * Time when the certificate expires
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertEndTime")
    @Expose
    private String CertEndTime;

    /**
    * Validity period of the certificate, in months
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * Creation time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * Certificate ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Domain names associated with the certificate (including the primary domain name)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubjectAltName")
    @Expose
    private String [] SubjectAltName;

    /**
    * Certificate type name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageTypeName")
    @Expose
    private String PackageTypeName;

    /**
    * Status description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusName")
    @Expose
    private String StatusName;

    /**
    * Whether the customer is a VIP customer
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * Whether the certificate is a DV certificate
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDv")
    @Expose
    private Boolean IsDv;

    /**
    * Whether the certificate is a wildcard certificate
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsWildcard")
    @Expose
    private Boolean IsWildcard;

    /**
    * Whether the vulnerability scanning feature is enabled
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsVulnerability")
    @Expose
    private Boolean IsVulnerability;

    /**
    * Whether it can be renewed 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RenewAble")
    @Expose
    private Boolean RenewAble;

    /**
    * Project information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectInfo")
    @Expose
    private ProjectInfo ProjectInfo;

    /**
    * Associated Tencent Cloud services. Currently, this parameter is unavailable.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BoundResource")
    @Expose
    private String [] BoundResource;

    /**
    * Whether the certificate can be deployed
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Deployable")
    @Expose
    private Boolean Deployable;

    /**
    * List of tags
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * Whether the expiration notification was ignored
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsIgnore")
    @Expose
    private Boolean IsIgnore;

    /**
    * Whether the certificate is a Chinese SM certificate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsSM")
    @Expose
    private Boolean IsSM;

    /**
    * Certificate algorithm
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EncryptAlgorithm")
    @Expose
    private String EncryptAlgorithm;

    /**
    * Encryption algorithm of the uploaded CA certificate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CAEncryptAlgorithms")
    @Expose
    private String [] CAEncryptAlgorithms;

    /**
    * Expiration time of the uploaded CA certificate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CAEndTimes")
    @Expose
    private String [] CAEndTimes;

    /**
    * Generic name of the uploaded CA certificate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CACommonNames")
    @Expose
    private String [] CACommonNames;

    /**
    * Prereview information of the certificate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PreAuditInfo")
    @Expose
    private PreAuditInfo PreAuditInfo;

    /**
    * Whether auto-renewal is enabled.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * The hosting status. Valid values: `0` (hosting), `5` (replacing resources), `10` (hosting completed), and `-1` (not hosted). 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostingStatus")
    @Expose
    private Long HostingStatus;

    /**
    * The hosting completion time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostingCompleteTime")
    @Expose
    private String HostingCompleteTime;

    /**
    * The hosted new certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostingRenewCertId")
    @Expose
    private String HostingRenewCertId;

    /**
    * Existing renewed certificate ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("HasRenewOrder")
    @Expose
    private String HasRenewOrder;

    /**
    * Whether the original certificate is deleted when a certificate is reissued.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ReplaceOriCertIsDelete")
    @Expose
    private Boolean ReplaceOriCertIsDelete;

    /**
    * Whether the certificate is expiring soon. A certificate is considered to be expiring soon when there are 30 days or less left.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IsExpiring")
    @Expose
    private Boolean IsExpiring;

    /**
    * Validation expiration time for the addition of the DV certificate
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DVAuthDeadline")
    @Expose
    private String DVAuthDeadline;

    /**
    * Domain name validation pass time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ValidationPassedTime")
    @Expose
    private String ValidationPassedTime;

    /**
    * Multiple domain names with which the certificate is associated
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CertSANs")
    @Expose
    private String [] CertSANs;

    /**
    * Domain name validation rejection information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AwaitingValidationMsg")
    @Expose
    private String AwaitingValidationMsg;

    /**
    * Whether downloading is allowed
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AllowDownload")
    @Expose
    private Boolean AllowDownload;

    /**
    * 
    */
    @SerializedName("IsDNSPODResolve")
    @Expose
    private Boolean IsDNSPODResolve;

    /**
    * 
    */
    @SerializedName("IsPackage")
    @Expose
    private Boolean IsPackage;

    /**
    * 
    */
    @SerializedName("KeyPasswordCustomFlag")
    @Expose
    private Boolean KeyPasswordCustomFlag;

    /**
    * 
    */
    @SerializedName("SupportDownloadType")
    @Expose
    private SupportDownloadType SupportDownloadType;

    /**
     * Get User UIN
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OwnerUin User UIN
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set User UIN
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OwnerUin User UIN
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Project ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Certificate source
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return From Certificate source
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Certificate source
Note: this field may return null, indicating that no valid values can be obtained.
     * @param From Certificate source
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get The certificate plan type. Valid values:
null: Certificates uploaded by users (no plan type)
`1`: GeoTrust DV SSL CA - G3; `2`: TrustAsia TLS RSA CA; `3`: SecureSite EV Pro; `4`: SecureSite EV; `5`: SecureSite OV Pro; `6`: SecureSite OV; `7`: SecureSite OV wildcard; `8`: GeoTrust EV; `9`: GeoTrust OV; `10`: GeoTrust OV wildcard; `11`: TrustAsia DV multi-domain; `12`: TrustAsia DV wildcard; `13`: TrustAsia OV wildcard D3; `14`: TrustAsia OV D3; `15`: TrustAsia OV multi-domain D3; `16`: TrustAsia EV D3; `17`: TrustAsia EV multi-domain D3; `18`: GlobalSign OV; `19`: GlobalSign OV wildcard; `20`: GlobalSign EV; `21`: TrustAsia OV wildcard multi-domain D3; `22`: GlobalSign OV multi-domain; `23`: GlobalSign OV wildcard multi-domain; `24`: GlobalSign EV multi-domain
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PackageType The certificate plan type. Valid values:
null: Certificates uploaded by users (no plan type)
`1`: GeoTrust DV SSL CA - G3; `2`: TrustAsia TLS RSA CA; `3`: SecureSite EV Pro; `4`: SecureSite EV; `5`: SecureSite OV Pro; `6`: SecureSite OV; `7`: SecureSite OV wildcard; `8`: GeoTrust EV; `9`: GeoTrust OV; `10`: GeoTrust OV wildcard; `11`: TrustAsia DV multi-domain; `12`: TrustAsia DV wildcard; `13`: TrustAsia OV wildcard D3; `14`: TrustAsia OV D3; `15`: TrustAsia OV multi-domain D3; `16`: TrustAsia EV D3; `17`: TrustAsia EV multi-domain D3; `18`: GlobalSign OV; `19`: GlobalSign OV wildcard; `20`: GlobalSign EV; `21`: TrustAsia OV wildcard multi-domain D3; `22`: GlobalSign OV multi-domain; `23`: GlobalSign OV wildcard multi-domain; `24`: GlobalSign EV multi-domain
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set The certificate plan type. Valid values:
null: Certificates uploaded by users (no plan type)
`1`: GeoTrust DV SSL CA - G3; `2`: TrustAsia TLS RSA CA; `3`: SecureSite EV Pro; `4`: SecureSite EV; `5`: SecureSite OV Pro; `6`: SecureSite OV; `7`: SecureSite OV wildcard; `8`: GeoTrust EV; `9`: GeoTrust OV; `10`: GeoTrust OV wildcard; `11`: TrustAsia DV multi-domain; `12`: TrustAsia DV wildcard; `13`: TrustAsia OV wildcard D3; `14`: TrustAsia OV D3; `15`: TrustAsia OV multi-domain D3; `16`: TrustAsia EV D3; `17`: TrustAsia EV multi-domain D3; `18`: GlobalSign OV; `19`: GlobalSign OV wildcard; `20`: GlobalSign EV; `21`: TrustAsia OV wildcard multi-domain D3; `22`: GlobalSign OV multi-domain; `23`: GlobalSign OV wildcard multi-domain; `24`: GlobalSign EV multi-domain
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PackageType The certificate plan type. Valid values:
null: Certificates uploaded by users (no plan type)
`1`: GeoTrust DV SSL CA - G3; `2`: TrustAsia TLS RSA CA; `3`: SecureSite EV Pro; `4`: SecureSite EV; `5`: SecureSite OV Pro; `6`: SecureSite OV; `7`: SecureSite OV wildcard; `8`: GeoTrust EV; `9`: GeoTrust OV; `10`: GeoTrust OV wildcard; `11`: TrustAsia DV multi-domain; `12`: TrustAsia DV wildcard; `13`: TrustAsia OV wildcard D3; `14`: TrustAsia OV D3; `15`: TrustAsia OV multi-domain D3; `16`: TrustAsia EV D3; `17`: TrustAsia EV multi-domain D3; `18`: GlobalSign OV; `19`: GlobalSign OV wildcard; `20`: GlobalSign EV; `21`: TrustAsia OV wildcard multi-domain D3; `22`: GlobalSign OV multi-domain; `23`: GlobalSign OV wildcard multi-domain; `24`: GlobalSign EV multi-domain
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Certificate type. `CA`: client certificate; `SVR`: server certificate
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertificateType Certificate type. `CA`: client certificate; `SVR`: server certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set Certificate type. `CA`: client certificate; `SVR`: server certificate
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertificateType Certificate type. `CA`: client certificate; `SVR`: server certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get Issuer
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProductZhName Issuer
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProductZhName() {
        return this.ProductZhName;
    }

    /**
     * Set Issuer
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProductZhName Issuer
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProductZhName(String ProductZhName) {
        this.ProductZhName = ProductZhName;
    }

    /**
     * Get Primary domain name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Domain Primary domain name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Primary domain name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Domain Primary domain name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Alias
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Alias Alias
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Alias
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Alias Alias
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Status. `0`: Reviewing; `1`: Approved; `2`: Unapproved; `3`: Expired; `4`: DNS record added for domain names of the DNS_AUTO verification type; `5`: Enterprise-grade certificate, pending submission; `6`: Canceling order; `7`: Canceled; `8`: Information submitted, pending confirmation letter upload; `9`: Revoking certificate; `10`: Revoked; `11`: Reissuing; `12`: Pending revocation confirmation letter upload; `13`: Pending information submission for the free certificate; `14`: Refunded.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status. `0`: Reviewing; `1`: Approved; `2`: Unapproved; `3`: Expired; `4`: DNS record added for domain names of the DNS_AUTO verification type; `5`: Enterprise-grade certificate, pending submission; `6`: Canceling order; `7`: Canceled; `8`: Information submitted, pending confirmation letter upload; `9`: Revoking certificate; `10`: Revoked; `11`: Reissuing; `12`: Pending revocation confirmation letter upload; `13`: Pending information submission for the free certificate; `14`: Refunded.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. `0`: Reviewing; `1`: Approved; `2`: Unapproved; `3`: Expired; `4`: DNS record added for domain names of the DNS_AUTO verification type; `5`: Enterprise-grade certificate, pending submission; `6`: Canceling order; `7`: Canceled; `8`: Information submitted, pending confirmation letter upload; `9`: Revoking certificate; `10`: Revoked; `11`: Reissuing; `12`: Pending revocation confirmation letter upload; `13`: Pending information submission for the free certificate; `14`: Refunded.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status. `0`: Reviewing; `1`: Approved; `2`: Unapproved; `3`: Expired; `4`: DNS record added for domain names of the DNS_AUTO verification type; `5`: Enterprise-grade certificate, pending submission; `6`: Canceling order; `7`: Canceled; `8`: Information submitted, pending confirmation letter upload; `9`: Revoking certificate; `10`: Revoked; `11`: Reissuing; `12`: Pending revocation confirmation letter upload; `13`: Pending information submission for the free certificate; `14`: Refunded.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Extended information of the certificate
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertificateExtra Extended information of the certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CertificateExtra getCertificateExtra() {
        return this.CertificateExtra;
    }

    /**
     * Set Extended information of the certificate
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertificateExtra Extended information of the certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificateExtra(CertificateExtra CertificateExtra) {
        this.CertificateExtra = CertificateExtra;
    }

    /**
     * Get Vulnerability scanning status. `INACTIVE`: not activated; `ACTIVE`: activated
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VulnerabilityStatus Vulnerability scanning status. `INACTIVE`: not activated; `ACTIVE`: activated
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVulnerabilityStatus() {
        return this.VulnerabilityStatus;
    }

    /**
     * Set Vulnerability scanning status. `INACTIVE`: not activated; `ACTIVE`: activated
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VulnerabilityStatus Vulnerability scanning status. `INACTIVE`: not activated; `ACTIVE`: activated
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVulnerabilityStatus(String VulnerabilityStatus) {
        this.VulnerabilityStatus = VulnerabilityStatus;
    }

    /**
     * Get Status information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StatusMsg Status information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusMsg() {
        return this.StatusMsg;
    }

    /**
     * Set Status information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StatusMsg Status information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusMsg(String StatusMsg) {
        this.StatusMsg = StatusMsg;
    }

    /**
     * Get Validation type. `DNS_AUTO`: automatic DNS validation; `DNS`: manual DNS validation; `FILE`: file validation; `EMAIL`: email validation
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VerifyType Validation type. `DNS_AUTO`: automatic DNS validation; `DNS`: manual DNS validation; `FILE`: file validation; `EMAIL`: email validation
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set Validation type. `DNS_AUTO`: automatic DNS validation; `DNS`: manual DNS validation; `FILE`: file validation; `EMAIL`: email validation
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VerifyType Validation type. `DNS_AUTO`: automatic DNS validation; `DNS`: manual DNS validation; `FILE`: file validation; `EMAIL`: email validation
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get Time when the certificate takes effect
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertBeginTime Time when the certificate takes effect
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertBeginTime() {
        return this.CertBeginTime;
    }

    /**
     * Set Time when the certificate takes effect
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertBeginTime Time when the certificate takes effect
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertBeginTime(String CertBeginTime) {
        this.CertBeginTime = CertBeginTime;
    }

    /**
     * Get Time when the certificate expires
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertEndTime Time when the certificate expires
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertEndTime() {
        return this.CertEndTime;
    }

    /**
     * Set Time when the certificate expires
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertEndTime Time when the certificate expires
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertEndTime(String CertEndTime) {
        this.CertEndTime = CertEndTime;
    }

    /**
     * Get Validity period of the certificate, in months
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ValidityPeriod Validity period of the certificate, in months
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set Validity period of the certificate, in months
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ValidityPeriod Validity period of the certificate, in months
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get Creation time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InsertTime Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InsertTime Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get Certificate ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertificateId Certificate ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Certificate ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertificateId Certificate ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Domain names associated with the certificate (including the primary domain name)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubjectAltName Domain names associated with the certificate (including the primary domain name)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSubjectAltName() {
        return this.SubjectAltName;
    }

    /**
     * Set Domain names associated with the certificate (including the primary domain name)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubjectAltName Domain names associated with the certificate (including the primary domain name)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubjectAltName(String [] SubjectAltName) {
        this.SubjectAltName = SubjectAltName;
    }

    /**
     * Get Certificate type name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PackageTypeName Certificate type name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPackageTypeName() {
        return this.PackageTypeName;
    }

    /**
     * Set Certificate type name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PackageTypeName Certificate type name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPackageTypeName(String PackageTypeName) {
        this.PackageTypeName = PackageTypeName;
    }

    /**
     * Get Status description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StatusName Status description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusName() {
        return this.StatusName;
    }

    /**
     * Set Status description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StatusName Status description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusName(String StatusName) {
        this.StatusName = StatusName;
    }

    /**
     * Get Whether the customer is a VIP customer
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsVip Whether the customer is a VIP customer
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set Whether the customer is a VIP customer
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsVip Whether the customer is a VIP customer
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get Whether the certificate is a DV certificate
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsDv Whether the certificate is a DV certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsDv() {
        return this.IsDv;
    }

    /**
     * Set Whether the certificate is a DV certificate
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsDv Whether the certificate is a DV certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDv(Boolean IsDv) {
        this.IsDv = IsDv;
    }

    /**
     * Get Whether the certificate is a wildcard certificate
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsWildcard Whether the certificate is a wildcard certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsWildcard() {
        return this.IsWildcard;
    }

    /**
     * Set Whether the certificate is a wildcard certificate
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsWildcard Whether the certificate is a wildcard certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsWildcard(Boolean IsWildcard) {
        this.IsWildcard = IsWildcard;
    }

    /**
     * Get Whether the vulnerability scanning feature is enabled
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsVulnerability Whether the vulnerability scanning feature is enabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsVulnerability() {
        return this.IsVulnerability;
    }

    /**
     * Set Whether the vulnerability scanning feature is enabled
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsVulnerability Whether the vulnerability scanning feature is enabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsVulnerability(Boolean IsVulnerability) {
        this.IsVulnerability = IsVulnerability;
    }

    /**
     * Get Whether it can be renewed 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RenewAble Whether it can be renewed 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getRenewAble() {
        return this.RenewAble;
    }

    /**
     * Set Whether it can be renewed 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RenewAble Whether it can be renewed 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRenewAble(Boolean RenewAble) {
        this.RenewAble = RenewAble;
    }

    /**
     * Get Project information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectInfo Project information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ProjectInfo getProjectInfo() {
        return this.ProjectInfo;
    }

    /**
     * Set Project information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectInfo Project information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectInfo(ProjectInfo ProjectInfo) {
        this.ProjectInfo = ProjectInfo;
    }

    /**
     * Get Associated Tencent Cloud services. Currently, this parameter is unavailable.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BoundResource Associated Tencent Cloud services. Currently, this parameter is unavailable.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBoundResource() {
        return this.BoundResource;
    }

    /**
     * Set Associated Tencent Cloud services. Currently, this parameter is unavailable.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BoundResource Associated Tencent Cloud services. Currently, this parameter is unavailable.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBoundResource(String [] BoundResource) {
        this.BoundResource = BoundResource;
    }

    /**
     * Get Whether the certificate can be deployed
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Deployable Whether the certificate can be deployed
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getDeployable() {
        return this.Deployable;
    }

    /**
     * Set Whether the certificate can be deployed
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Deployable Whether the certificate can be deployed
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeployable(Boolean Deployable) {
        this.Deployable = Deployable;
    }

    /**
     * Get List of tags
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Tags List of tags
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Tags List of tags
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether the expiration notification was ignored
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsIgnore Whether the expiration notification was ignored
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsIgnore() {
        return this.IsIgnore;
    }

    /**
     * Set Whether the expiration notification was ignored
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsIgnore Whether the expiration notification was ignored
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsIgnore(Boolean IsIgnore) {
        this.IsIgnore = IsIgnore;
    }

    /**
     * Get Whether the certificate is a Chinese SM certificate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsSM Whether the certificate is a Chinese SM certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsSM() {
        return this.IsSM;
    }

    /**
     * Set Whether the certificate is a Chinese SM certificate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsSM Whether the certificate is a Chinese SM certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsSM(Boolean IsSM) {
        this.IsSM = IsSM;
    }

    /**
     * Get Certificate algorithm
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EncryptAlgorithm Certificate algorithm
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEncryptAlgorithm() {
        return this.EncryptAlgorithm;
    }

    /**
     * Set Certificate algorithm
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EncryptAlgorithm Certificate algorithm
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEncryptAlgorithm(String EncryptAlgorithm) {
        this.EncryptAlgorithm = EncryptAlgorithm;
    }

    /**
     * Get Encryption algorithm of the uploaded CA certificate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CAEncryptAlgorithms Encryption algorithm of the uploaded CA certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getCAEncryptAlgorithms() {
        return this.CAEncryptAlgorithms;
    }

    /**
     * Set Encryption algorithm of the uploaded CA certificate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CAEncryptAlgorithms Encryption algorithm of the uploaded CA certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCAEncryptAlgorithms(String [] CAEncryptAlgorithms) {
        this.CAEncryptAlgorithms = CAEncryptAlgorithms;
    }

    /**
     * Get Expiration time of the uploaded CA certificate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CAEndTimes Expiration time of the uploaded CA certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getCAEndTimes() {
        return this.CAEndTimes;
    }

    /**
     * Set Expiration time of the uploaded CA certificate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CAEndTimes Expiration time of the uploaded CA certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCAEndTimes(String [] CAEndTimes) {
        this.CAEndTimes = CAEndTimes;
    }

    /**
     * Get Generic name of the uploaded CA certificate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CACommonNames Generic name of the uploaded CA certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getCACommonNames() {
        return this.CACommonNames;
    }

    /**
     * Set Generic name of the uploaded CA certificate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CACommonNames Generic name of the uploaded CA certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCACommonNames(String [] CACommonNames) {
        this.CACommonNames = CACommonNames;
    }

    /**
     * Get Prereview information of the certificate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PreAuditInfo Prereview information of the certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PreAuditInfo getPreAuditInfo() {
        return this.PreAuditInfo;
    }

    /**
     * Set Prereview information of the certificate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PreAuditInfo Prereview information of the certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPreAuditInfo(PreAuditInfo PreAuditInfo) {
        this.PreAuditInfo = PreAuditInfo;
    }

    /**
     * Get Whether auto-renewal is enabled.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AutoRenewFlag Whether auto-renewal is enabled.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether auto-renewal is enabled.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AutoRenewFlag Whether auto-renewal is enabled.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get The hosting status. Valid values: `0` (hosting), `5` (replacing resources), `10` (hosting completed), and `-1` (not hosted). 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostingStatus The hosting status. Valid values: `0` (hosting), `5` (replacing resources), `10` (hosting completed), and `-1` (not hosted). 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHostingStatus() {
        return this.HostingStatus;
    }

    /**
     * Set The hosting status. Valid values: `0` (hosting), `5` (replacing resources), `10` (hosting completed), and `-1` (not hosted). 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostingStatus The hosting status. Valid values: `0` (hosting), `5` (replacing resources), `10` (hosting completed), and `-1` (not hosted). 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostingStatus(Long HostingStatus) {
        this.HostingStatus = HostingStatus;
    }

    /**
     * Get The hosting completion time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostingCompleteTime The hosting completion time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostingCompleteTime() {
        return this.HostingCompleteTime;
    }

    /**
     * Set The hosting completion time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostingCompleteTime The hosting completion time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostingCompleteTime(String HostingCompleteTime) {
        this.HostingCompleteTime = HostingCompleteTime;
    }

    /**
     * Get The hosted new certificate ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostingRenewCertId The hosted new certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostingRenewCertId() {
        return this.HostingRenewCertId;
    }

    /**
     * Set The hosted new certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostingRenewCertId The hosted new certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostingRenewCertId(String HostingRenewCertId) {
        this.HostingRenewCertId = HostingRenewCertId;
    }

    /**
     * Get Existing renewed certificate ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return HasRenewOrder Existing renewed certificate ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getHasRenewOrder() {
        return this.HasRenewOrder;
    }

    /**
     * Set Existing renewed certificate ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param HasRenewOrder Existing renewed certificate ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setHasRenewOrder(String HasRenewOrder) {
        this.HasRenewOrder = HasRenewOrder;
    }

    /**
     * Get Whether the original certificate is deleted when a certificate is reissued.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ReplaceOriCertIsDelete Whether the original certificate is deleted when a certificate is reissued.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getReplaceOriCertIsDelete() {
        return this.ReplaceOriCertIsDelete;
    }

    /**
     * Set Whether the original certificate is deleted when a certificate is reissued.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ReplaceOriCertIsDelete Whether the original certificate is deleted when a certificate is reissued.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReplaceOriCertIsDelete(Boolean ReplaceOriCertIsDelete) {
        this.ReplaceOriCertIsDelete = ReplaceOriCertIsDelete;
    }

    /**
     * Get Whether the certificate is expiring soon. A certificate is considered to be expiring soon when there are 30 days or less left.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IsExpiring Whether the certificate is expiring soon. A certificate is considered to be expiring soon when there are 30 days or less left.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getIsExpiring() {
        return this.IsExpiring;
    }

    /**
     * Set Whether the certificate is expiring soon. A certificate is considered to be expiring soon when there are 30 days or less left.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IsExpiring Whether the certificate is expiring soon. A certificate is considered to be expiring soon when there are 30 days or less left.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIsExpiring(Boolean IsExpiring) {
        this.IsExpiring = IsExpiring;
    }

    /**
     * Get Validation expiration time for the addition of the DV certificate
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DVAuthDeadline Validation expiration time for the addition of the DV certificate
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDVAuthDeadline() {
        return this.DVAuthDeadline;
    }

    /**
     * Set Validation expiration time for the addition of the DV certificate
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DVAuthDeadline Validation expiration time for the addition of the DV certificate
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDVAuthDeadline(String DVAuthDeadline) {
        this.DVAuthDeadline = DVAuthDeadline;
    }

    /**
     * Get Domain name validation pass time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ValidationPassedTime Domain name validation pass time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getValidationPassedTime() {
        return this.ValidationPassedTime;
    }

    /**
     * Set Domain name validation pass time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ValidationPassedTime Domain name validation pass time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setValidationPassedTime(String ValidationPassedTime) {
        this.ValidationPassedTime = ValidationPassedTime;
    }

    /**
     * Get Multiple domain names with which the certificate is associated
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CertSANs Multiple domain names with which the certificate is associated
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getCertSANs() {
        return this.CertSANs;
    }

    /**
     * Set Multiple domain names with which the certificate is associated
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CertSANs Multiple domain names with which the certificate is associated
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCertSANs(String [] CertSANs) {
        this.CertSANs = CertSANs;
    }

    /**
     * Get Domain name validation rejection information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AwaitingValidationMsg Domain name validation rejection information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAwaitingValidationMsg() {
        return this.AwaitingValidationMsg;
    }

    /**
     * Set Domain name validation rejection information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AwaitingValidationMsg Domain name validation rejection information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAwaitingValidationMsg(String AwaitingValidationMsg) {
        this.AwaitingValidationMsg = AwaitingValidationMsg;
    }

    /**
     * Get Whether downloading is allowed
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AllowDownload Whether downloading is allowed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getAllowDownload() {
        return this.AllowDownload;
    }

    /**
     * Set Whether downloading is allowed
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AllowDownload Whether downloading is allowed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAllowDownload(Boolean AllowDownload) {
        this.AllowDownload = AllowDownload;
    }

    /**
     * Get  
     * @return IsDNSPODResolve 
     */
    public Boolean getIsDNSPODResolve() {
        return this.IsDNSPODResolve;
    }

    /**
     * Set 
     * @param IsDNSPODResolve 
     */
    public void setIsDNSPODResolve(Boolean IsDNSPODResolve) {
        this.IsDNSPODResolve = IsDNSPODResolve;
    }

    /**
     * Get  
     * @return IsPackage 
     */
    public Boolean getIsPackage() {
        return this.IsPackage;
    }

    /**
     * Set 
     * @param IsPackage 
     */
    public void setIsPackage(Boolean IsPackage) {
        this.IsPackage = IsPackage;
    }

    /**
     * Get  
     * @return KeyPasswordCustomFlag 
     */
    public Boolean getKeyPasswordCustomFlag() {
        return this.KeyPasswordCustomFlag;
    }

    /**
     * Set 
     * @param KeyPasswordCustomFlag 
     */
    public void setKeyPasswordCustomFlag(Boolean KeyPasswordCustomFlag) {
        this.KeyPasswordCustomFlag = KeyPasswordCustomFlag;
    }

    /**
     * Get  
     * @return SupportDownloadType 
     */
    public SupportDownloadType getSupportDownloadType() {
        return this.SupportDownloadType;
    }

    /**
     * Set 
     * @param SupportDownloadType 
     */
    public void setSupportDownloadType(SupportDownloadType SupportDownloadType) {
        this.SupportDownloadType = SupportDownloadType;
    }

    public Certificates() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Certificates(Certificates source) {
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.CertificateType != null) {
            this.CertificateType = new String(source.CertificateType);
        }
        if (source.ProductZhName != null) {
            this.ProductZhName = new String(source.ProductZhName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CertificateExtra != null) {
            this.CertificateExtra = new CertificateExtra(source.CertificateExtra);
        }
        if (source.VulnerabilityStatus != null) {
            this.VulnerabilityStatus = new String(source.VulnerabilityStatus);
        }
        if (source.StatusMsg != null) {
            this.StatusMsg = new String(source.StatusMsg);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
        if (source.CertBeginTime != null) {
            this.CertBeginTime = new String(source.CertBeginTime);
        }
        if (source.CertEndTime != null) {
            this.CertEndTime = new String(source.CertEndTime);
        }
        if (source.ValidityPeriod != null) {
            this.ValidityPeriod = new String(source.ValidityPeriod);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.SubjectAltName != null) {
            this.SubjectAltName = new String[source.SubjectAltName.length];
            for (int i = 0; i < source.SubjectAltName.length; i++) {
                this.SubjectAltName[i] = new String(source.SubjectAltName[i]);
            }
        }
        if (source.PackageTypeName != null) {
            this.PackageTypeName = new String(source.PackageTypeName);
        }
        if (source.StatusName != null) {
            this.StatusName = new String(source.StatusName);
        }
        if (source.IsVip != null) {
            this.IsVip = new Boolean(source.IsVip);
        }
        if (source.IsDv != null) {
            this.IsDv = new Boolean(source.IsDv);
        }
        if (source.IsWildcard != null) {
            this.IsWildcard = new Boolean(source.IsWildcard);
        }
        if (source.IsVulnerability != null) {
            this.IsVulnerability = new Boolean(source.IsVulnerability);
        }
        if (source.RenewAble != null) {
            this.RenewAble = new Boolean(source.RenewAble);
        }
        if (source.ProjectInfo != null) {
            this.ProjectInfo = new ProjectInfo(source.ProjectInfo);
        }
        if (source.BoundResource != null) {
            this.BoundResource = new String[source.BoundResource.length];
            for (int i = 0; i < source.BoundResource.length; i++) {
                this.BoundResource[i] = new String(source.BoundResource[i]);
            }
        }
        if (source.Deployable != null) {
            this.Deployable = new Boolean(source.Deployable);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.IsIgnore != null) {
            this.IsIgnore = new Boolean(source.IsIgnore);
        }
        if (source.IsSM != null) {
            this.IsSM = new Boolean(source.IsSM);
        }
        if (source.EncryptAlgorithm != null) {
            this.EncryptAlgorithm = new String(source.EncryptAlgorithm);
        }
        if (source.CAEncryptAlgorithms != null) {
            this.CAEncryptAlgorithms = new String[source.CAEncryptAlgorithms.length];
            for (int i = 0; i < source.CAEncryptAlgorithms.length; i++) {
                this.CAEncryptAlgorithms[i] = new String(source.CAEncryptAlgorithms[i]);
            }
        }
        if (source.CAEndTimes != null) {
            this.CAEndTimes = new String[source.CAEndTimes.length];
            for (int i = 0; i < source.CAEndTimes.length; i++) {
                this.CAEndTimes[i] = new String(source.CAEndTimes[i]);
            }
        }
        if (source.CACommonNames != null) {
            this.CACommonNames = new String[source.CACommonNames.length];
            for (int i = 0; i < source.CACommonNames.length; i++) {
                this.CACommonNames[i] = new String(source.CACommonNames[i]);
            }
        }
        if (source.PreAuditInfo != null) {
            this.PreAuditInfo = new PreAuditInfo(source.PreAuditInfo);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.HostingStatus != null) {
            this.HostingStatus = new Long(source.HostingStatus);
        }
        if (source.HostingCompleteTime != null) {
            this.HostingCompleteTime = new String(source.HostingCompleteTime);
        }
        if (source.HostingRenewCertId != null) {
            this.HostingRenewCertId = new String(source.HostingRenewCertId);
        }
        if (source.HasRenewOrder != null) {
            this.HasRenewOrder = new String(source.HasRenewOrder);
        }
        if (source.ReplaceOriCertIsDelete != null) {
            this.ReplaceOriCertIsDelete = new Boolean(source.ReplaceOriCertIsDelete);
        }
        if (source.IsExpiring != null) {
            this.IsExpiring = new Boolean(source.IsExpiring);
        }
        if (source.DVAuthDeadline != null) {
            this.DVAuthDeadline = new String(source.DVAuthDeadline);
        }
        if (source.ValidationPassedTime != null) {
            this.ValidationPassedTime = new String(source.ValidationPassedTime);
        }
        if (source.CertSANs != null) {
            this.CertSANs = new String[source.CertSANs.length];
            for (int i = 0; i < source.CertSANs.length; i++) {
                this.CertSANs[i] = new String(source.CertSANs[i]);
            }
        }
        if (source.AwaitingValidationMsg != null) {
            this.AwaitingValidationMsg = new String(source.AwaitingValidationMsg);
        }
        if (source.AllowDownload != null) {
            this.AllowDownload = new Boolean(source.AllowDownload);
        }
        if (source.IsDNSPODResolve != null) {
            this.IsDNSPODResolve = new Boolean(source.IsDNSPODResolve);
        }
        if (source.IsPackage != null) {
            this.IsPackage = new Boolean(source.IsPackage);
        }
        if (source.KeyPasswordCustomFlag != null) {
            this.KeyPasswordCustomFlag = new Boolean(source.KeyPasswordCustomFlag);
        }
        if (source.SupportDownloadType != null) {
            this.SupportDownloadType = new SupportDownloadType(source.SupportDownloadType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "ProductZhName", this.ProductZhName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "CertificateExtra.", this.CertificateExtra);
        this.setParamSimple(map, prefix + "VulnerabilityStatus", this.VulnerabilityStatus);
        this.setParamSimple(map, prefix + "StatusMsg", this.StatusMsg);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "CertBeginTime", this.CertBeginTime);
        this.setParamSimple(map, prefix + "CertEndTime", this.CertEndTime);
        this.setParamSimple(map, prefix + "ValidityPeriod", this.ValidityPeriod);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamArraySimple(map, prefix + "SubjectAltName.", this.SubjectAltName);
        this.setParamSimple(map, prefix + "PackageTypeName", this.PackageTypeName);
        this.setParamSimple(map, prefix + "StatusName", this.StatusName);
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "IsDv", this.IsDv);
        this.setParamSimple(map, prefix + "IsWildcard", this.IsWildcard);
        this.setParamSimple(map, prefix + "IsVulnerability", this.IsVulnerability);
        this.setParamSimple(map, prefix + "RenewAble", this.RenewAble);
        this.setParamObj(map, prefix + "ProjectInfo.", this.ProjectInfo);
        this.setParamArraySimple(map, prefix + "BoundResource.", this.BoundResource);
        this.setParamSimple(map, prefix + "Deployable", this.Deployable);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "IsIgnore", this.IsIgnore);
        this.setParamSimple(map, prefix + "IsSM", this.IsSM);
        this.setParamSimple(map, prefix + "EncryptAlgorithm", this.EncryptAlgorithm);
        this.setParamArraySimple(map, prefix + "CAEncryptAlgorithms.", this.CAEncryptAlgorithms);
        this.setParamArraySimple(map, prefix + "CAEndTimes.", this.CAEndTimes);
        this.setParamArraySimple(map, prefix + "CACommonNames.", this.CACommonNames);
        this.setParamObj(map, prefix + "PreAuditInfo.", this.PreAuditInfo);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "HostingStatus", this.HostingStatus);
        this.setParamSimple(map, prefix + "HostingCompleteTime", this.HostingCompleteTime);
        this.setParamSimple(map, prefix + "HostingRenewCertId", this.HostingRenewCertId);
        this.setParamSimple(map, prefix + "HasRenewOrder", this.HasRenewOrder);
        this.setParamSimple(map, prefix + "ReplaceOriCertIsDelete", this.ReplaceOriCertIsDelete);
        this.setParamSimple(map, prefix + "IsExpiring", this.IsExpiring);
        this.setParamSimple(map, prefix + "DVAuthDeadline", this.DVAuthDeadline);
        this.setParamSimple(map, prefix + "ValidationPassedTime", this.ValidationPassedTime);
        this.setParamArraySimple(map, prefix + "CertSANs.", this.CertSANs);
        this.setParamSimple(map, prefix + "AwaitingValidationMsg", this.AwaitingValidationMsg);
        this.setParamSimple(map, prefix + "AllowDownload", this.AllowDownload);
        this.setParamSimple(map, prefix + "IsDNSPODResolve", this.IsDNSPODResolve);
        this.setParamSimple(map, prefix + "IsPackage", this.IsPackage);
        this.setParamSimple(map, prefix + "KeyPasswordCustomFlag", this.KeyPasswordCustomFlag);
        this.setParamObj(map, prefix + "SupportDownloadType.", this.SupportDownloadType);

    }
}

