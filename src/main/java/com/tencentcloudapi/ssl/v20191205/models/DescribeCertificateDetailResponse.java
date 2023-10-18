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

public class DescribeCertificateDetailResponse extends AbstractModel {

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
    * Certificate source. `trustasia`: TrustAsia; `upload`: certificate uploaded by users
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Certificate type. `CA`: client certificate; `SVR`: server certificate
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * Certificate plan type. null: User-uploaded certificate (no plan type); `1`: GeoTrust DV SSL CA - G3; `2`: TrustAsia TLS RSA CA; `3`: SecureSite EV Pro; `4`: SecureSite EV; `5`: SecureSite OV Pro; `6`: SecureSite OV; `7`: SecureSite OV wildcard; `8`: GeoTrust EV; `9`: GeoTrust OV; `10`: GeoTrust OV wildcard; `11`: TrustAsia DV multi-domain; `12`: TrustAsia DV wildcard; `13`: TrustAsia OV wildcard D3; `14`: TrustAsia OV D3; `15`: TrustAsia OV multi-domain D3; `16`: TrustAsia EV D3; `17`: TrustAsia EV multi-domain D3; `18`: GlobalSign OV; `19`: GlobalSign OV wildcard; `20`: GlobalSign EV; `21`: TrustAsia OV wildcard multi-domain D3; `22`: GlobalSign OV multi-domain; `23`: GlobalSign OV wildcard multi-domain; `24`: GlobalSign EV multi-domain; `25` WoTrus DV; `26`: WoTrus DV multi-domain; `27`: WoTrus DV wildcard; `28`: WoTrus OV; `29`: WoTrus OV multi-domain; `30`: WoTrus OV wildcard; `31`: WoTrus EV; `32`: WoTrus EV multi-domain; `33`: DNSPod SM2 DV; `34`: DNSPod SM2 DV multi-domain; `35`: DNSPod SM2 DV wildcard; `37`: DNSPod SM2 OV; `38`: DNSPod SM2 OV multi-domain; `39`: DNSPod SM2 OV wildcard: `40`: DNSPod SM2 EV; `41`: DNSPod SM2 EV multi-domain; `42`: TrustAsia DV wildcard multi-domain.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Issuer
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductZhName")
    @Expose
    private String ProductZhName;

    /**
    * Domain name
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
    * Certificate status. `0`: reviewing; `1`: approved; `2`: unapproved; `3`: expired; `4`: DNS record added; `5`: enterprise-grade certificate, pending submission; `6`: canceling order; `7`: canceled; `8`: information submitted, pending confirmation letter upload; `9`: revoking certificate; `10`: revoked; `11`: reissuing; `12`: pending revocation confirmation letter upload
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
    * Vulnerability scanning status
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulnerabilityStatus")
    @Expose
    private String VulnerabilityStatus;

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
    * Application time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * Order ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * Extended information of the certificate
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificateExtra")
    @Expose
    private CertificateExtra CertificateExtra;

    /**
    * Private key of the certificate
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificatePrivateKey")
    @Expose
    private String CertificatePrivateKey;

    /**
    * Public key of the certificate
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificatePublicKey")
    @Expose
    private String CertificatePublicKey;

    /**
    * DV authentication information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthDetail")
    @Expose
    private DvAuthDetail DvAuthDetail;

    /**
    * Vulnerability scanning assessment report
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulnerabilityReport")
    @Expose
    private String VulnerabilityReport;

    /**
    * Certificate ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Certificate type name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * Status description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusName")
    @Expose
    private String StatusName;

    /**
    * Multiple domain names included in the certificate (excluding the primary domain name, which uses the `Domain` field)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubjectAltName")
    @Expose
    private String [] SubjectAltName;

    /**
    * Whether the certificate is a paid one.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * Whether the certificate is a wildcard certificate
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsWildcard")
    @Expose
    private Boolean IsWildcard;

    /**
    * Whether the certificate is a DV certificate
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDv")
    @Expose
    private Boolean IsDv;

    /**
    * Whether the vulnerability scanning feature is enabled
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsVulnerability")
    @Expose
    private Boolean IsVulnerability;

    /**
    * Submitted data
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubmittedData")
    @Expose
    private SubmittedData SubmittedData;

    /**
    * Whether the certificate can be renewed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewAble")
    @Expose
    private Boolean RenewAble;

    /**
    * Whether the certificate can be deployed
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Deployable")
    @Expose
    private Boolean Deployable;

    /**
    * List of associated tags
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * Root certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RootCert")
    @Expose
    private RootCertificates RootCert;

    /**
    * Chinese SM encryption certificate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EncryptCert")
    @Expose
    private String EncryptCert;

    /**
    * Private key of Chinese SM encryption
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EncryptPrivateKey")
    @Expose
    private String EncryptPrivateKey;

    /**
    * SHA1 fingerprint of the signature certificate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertFingerprint")
    @Expose
    private String CertFingerprint;

    /**
    * SHA1 fingerprint of the encryption certificate (for Chinese SM certificates only)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EncryptCertFingerprint")
    @Expose
    private String EncryptCertFingerprint;

    /**
    * Certificate algorithm
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EncryptAlgorithm")
    @Expose
    private String EncryptAlgorithm;

    /**
    * The authentication value for DV certificate revocation.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvRevokeAuthDetail")
    @Expose
    private DvAuths [] DvRevokeAuthDetail;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get Certificate source. `trustasia`: TrustAsia; `upload`: certificate uploaded by users
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return From Certificate source. `trustasia`: TrustAsia; `upload`: certificate uploaded by users
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Certificate source. `trustasia`: TrustAsia; `upload`: certificate uploaded by users
Note: this field may return null, indicating that no valid values can be obtained.
     * @param From Certificate source. `trustasia`: TrustAsia; `upload`: certificate uploaded by users
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFrom(String From) {
        this.From = From;
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
     * Get Certificate plan type. null: User-uploaded certificate (no plan type); `1`: GeoTrust DV SSL CA - G3; `2`: TrustAsia TLS RSA CA; `3`: SecureSite EV Pro; `4`: SecureSite EV; `5`: SecureSite OV Pro; `6`: SecureSite OV; `7`: SecureSite OV wildcard; `8`: GeoTrust EV; `9`: GeoTrust OV; `10`: GeoTrust OV wildcard; `11`: TrustAsia DV multi-domain; `12`: TrustAsia DV wildcard; `13`: TrustAsia OV wildcard D3; `14`: TrustAsia OV D3; `15`: TrustAsia OV multi-domain D3; `16`: TrustAsia EV D3; `17`: TrustAsia EV multi-domain D3; `18`: GlobalSign OV; `19`: GlobalSign OV wildcard; `20`: GlobalSign EV; `21`: TrustAsia OV wildcard multi-domain D3; `22`: GlobalSign OV multi-domain; `23`: GlobalSign OV wildcard multi-domain; `24`: GlobalSign EV multi-domain; `25` WoTrus DV; `26`: WoTrus DV multi-domain; `27`: WoTrus DV wildcard; `28`: WoTrus OV; `29`: WoTrus OV multi-domain; `30`: WoTrus OV wildcard; `31`: WoTrus EV; `32`: WoTrus EV multi-domain; `33`: DNSPod SM2 DV; `34`: DNSPod SM2 DV multi-domain; `35`: DNSPod SM2 DV wildcard; `37`: DNSPod SM2 OV; `38`: DNSPod SM2 OV multi-domain; `39`: DNSPod SM2 OV wildcard: `40`: DNSPod SM2 EV; `41`: DNSPod SM2 EV multi-domain; `42`: TrustAsia DV wildcard multi-domain. 
     * @return PackageType Certificate plan type. null: User-uploaded certificate (no plan type); `1`: GeoTrust DV SSL CA - G3; `2`: TrustAsia TLS RSA CA; `3`: SecureSite EV Pro; `4`: SecureSite EV; `5`: SecureSite OV Pro; `6`: SecureSite OV; `7`: SecureSite OV wildcard; `8`: GeoTrust EV; `9`: GeoTrust OV; `10`: GeoTrust OV wildcard; `11`: TrustAsia DV multi-domain; `12`: TrustAsia DV wildcard; `13`: TrustAsia OV wildcard D3; `14`: TrustAsia OV D3; `15`: TrustAsia OV multi-domain D3; `16`: TrustAsia EV D3; `17`: TrustAsia EV multi-domain D3; `18`: GlobalSign OV; `19`: GlobalSign OV wildcard; `20`: GlobalSign EV; `21`: TrustAsia OV wildcard multi-domain D3; `22`: GlobalSign OV multi-domain; `23`: GlobalSign OV wildcard multi-domain; `24`: GlobalSign EV multi-domain; `25` WoTrus DV; `26`: WoTrus DV multi-domain; `27`: WoTrus DV wildcard; `28`: WoTrus OV; `29`: WoTrus OV multi-domain; `30`: WoTrus OV wildcard; `31`: WoTrus EV; `32`: WoTrus EV multi-domain; `33`: DNSPod SM2 DV; `34`: DNSPod SM2 DV multi-domain; `35`: DNSPod SM2 DV wildcard; `37`: DNSPod SM2 OV; `38`: DNSPod SM2 OV multi-domain; `39`: DNSPod SM2 OV wildcard: `40`: DNSPod SM2 EV; `41`: DNSPod SM2 EV multi-domain; `42`: TrustAsia DV wildcard multi-domain.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Certificate plan type. null: User-uploaded certificate (no plan type); `1`: GeoTrust DV SSL CA - G3; `2`: TrustAsia TLS RSA CA; `3`: SecureSite EV Pro; `4`: SecureSite EV; `5`: SecureSite OV Pro; `6`: SecureSite OV; `7`: SecureSite OV wildcard; `8`: GeoTrust EV; `9`: GeoTrust OV; `10`: GeoTrust OV wildcard; `11`: TrustAsia DV multi-domain; `12`: TrustAsia DV wildcard; `13`: TrustAsia OV wildcard D3; `14`: TrustAsia OV D3; `15`: TrustAsia OV multi-domain D3; `16`: TrustAsia EV D3; `17`: TrustAsia EV multi-domain D3; `18`: GlobalSign OV; `19`: GlobalSign OV wildcard; `20`: GlobalSign EV; `21`: TrustAsia OV wildcard multi-domain D3; `22`: GlobalSign OV multi-domain; `23`: GlobalSign OV wildcard multi-domain; `24`: GlobalSign EV multi-domain; `25` WoTrus DV; `26`: WoTrus DV multi-domain; `27`: WoTrus DV wildcard; `28`: WoTrus OV; `29`: WoTrus OV multi-domain; `30`: WoTrus OV wildcard; `31`: WoTrus EV; `32`: WoTrus EV multi-domain; `33`: DNSPod SM2 DV; `34`: DNSPod SM2 DV multi-domain; `35`: DNSPod SM2 DV wildcard; `37`: DNSPod SM2 OV; `38`: DNSPod SM2 OV multi-domain; `39`: DNSPod SM2 OV wildcard: `40`: DNSPod SM2 EV; `41`: DNSPod SM2 EV multi-domain; `42`: TrustAsia DV wildcard multi-domain.
     * @param PackageType Certificate plan type. null: User-uploaded certificate (no plan type); `1`: GeoTrust DV SSL CA - G3; `2`: TrustAsia TLS RSA CA; `3`: SecureSite EV Pro; `4`: SecureSite EV; `5`: SecureSite OV Pro; `6`: SecureSite OV; `7`: SecureSite OV wildcard; `8`: GeoTrust EV; `9`: GeoTrust OV; `10`: GeoTrust OV wildcard; `11`: TrustAsia DV multi-domain; `12`: TrustAsia DV wildcard; `13`: TrustAsia OV wildcard D3; `14`: TrustAsia OV D3; `15`: TrustAsia OV multi-domain D3; `16`: TrustAsia EV D3; `17`: TrustAsia EV multi-domain D3; `18`: GlobalSign OV; `19`: GlobalSign OV wildcard; `20`: GlobalSign EV; `21`: TrustAsia OV wildcard multi-domain D3; `22`: GlobalSign OV multi-domain; `23`: GlobalSign OV wildcard multi-domain; `24`: GlobalSign EV multi-domain; `25` WoTrus DV; `26`: WoTrus DV multi-domain; `27`: WoTrus DV wildcard; `28`: WoTrus OV; `29`: WoTrus OV multi-domain; `30`: WoTrus OV wildcard; `31`: WoTrus EV; `32`: WoTrus EV multi-domain; `33`: DNSPod SM2 DV; `34`: DNSPod SM2 DV multi-domain; `35`: DNSPod SM2 DV wildcard; `37`: DNSPod SM2 OV; `38`: DNSPod SM2 OV multi-domain; `39`: DNSPod SM2 OV wildcard: `40`: DNSPod SM2 EV; `41`: DNSPod SM2 EV multi-domain; `42`: TrustAsia DV wildcard multi-domain.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
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
     * Get Domain name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Domain Domain name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Domain Domain name
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
     * Get Certificate status. `0`: reviewing; `1`: approved; `2`: unapproved; `3`: expired; `4`: DNS record added; `5`: enterprise-grade certificate, pending submission; `6`: canceling order; `7`: canceled; `8`: information submitted, pending confirmation letter upload; `9`: revoking certificate; `10`: revoked; `11`: reissuing; `12`: pending revocation confirmation letter upload
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Certificate status. `0`: reviewing; `1`: approved; `2`: unapproved; `3`: expired; `4`: DNS record added; `5`: enterprise-grade certificate, pending submission; `6`: canceling order; `7`: canceled; `8`: information submitted, pending confirmation letter upload; `9`: revoking certificate; `10`: revoked; `11`: reissuing; `12`: pending revocation confirmation letter upload
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Certificate status. `0`: reviewing; `1`: approved; `2`: unapproved; `3`: expired; `4`: DNS record added; `5`: enterprise-grade certificate, pending submission; `6`: canceling order; `7`: canceled; `8`: information submitted, pending confirmation letter upload; `9`: revoking certificate; `10`: revoked; `11`: reissuing; `12`: pending revocation confirmation letter upload
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Certificate status. `0`: reviewing; `1`: approved; `2`: unapproved; `3`: expired; `4`: DNS record added; `5`: enterprise-grade certificate, pending submission; `6`: canceling order; `7`: canceled; `8`: information submitted, pending confirmation letter upload; `9`: revoking certificate; `10`: revoked; `11`: reissuing; `12`: pending revocation confirmation letter upload
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get Vulnerability scanning status
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VulnerabilityStatus Vulnerability scanning status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVulnerabilityStatus() {
        return this.VulnerabilityStatus;
    }

    /**
     * Set Vulnerability scanning status
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VulnerabilityStatus Vulnerability scanning status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVulnerabilityStatus(String VulnerabilityStatus) {
        this.VulnerabilityStatus = VulnerabilityStatus;
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
     * Get Application time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InsertTime Application time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Application time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InsertTime Application time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get Order ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrderId Order ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set Order ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrderId Order ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
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
     * Get Private key of the certificate
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertificatePrivateKey Private key of the certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificatePrivateKey() {
        return this.CertificatePrivateKey;
    }

    /**
     * Set Private key of the certificate
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertificatePrivateKey Private key of the certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificatePrivateKey(String CertificatePrivateKey) {
        this.CertificatePrivateKey = CertificatePrivateKey;
    }

    /**
     * Get Public key of the certificate
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertificatePublicKey Public key of the certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificatePublicKey() {
        return this.CertificatePublicKey;
    }

    /**
     * Set Public key of the certificate
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertificatePublicKey Public key of the certificate
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificatePublicKey(String CertificatePublicKey) {
        this.CertificatePublicKey = CertificatePublicKey;
    }

    /**
     * Get DV authentication information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthDetail DV authentication information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DvAuthDetail getDvAuthDetail() {
        return this.DvAuthDetail;
    }

    /**
     * Set DV authentication information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthDetail DV authentication information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthDetail(DvAuthDetail DvAuthDetail) {
        this.DvAuthDetail = DvAuthDetail;
    }

    /**
     * Get Vulnerability scanning assessment report
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VulnerabilityReport Vulnerability scanning assessment report
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVulnerabilityReport() {
        return this.VulnerabilityReport;
    }

    /**
     * Set Vulnerability scanning assessment report
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VulnerabilityReport Vulnerability scanning assessment report
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVulnerabilityReport(String VulnerabilityReport) {
        this.VulnerabilityReport = VulnerabilityReport;
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
     * Get Certificate type name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TypeName Certificate type name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Certificate type name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TypeName Certificate type name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
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
     * Get Multiple domain names included in the certificate (excluding the primary domain name, which uses the `Domain` field)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubjectAltName Multiple domain names included in the certificate (excluding the primary domain name, which uses the `Domain` field)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSubjectAltName() {
        return this.SubjectAltName;
    }

    /**
     * Set Multiple domain names included in the certificate (excluding the primary domain name, which uses the `Domain` field)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubjectAltName Multiple domain names included in the certificate (excluding the primary domain name, which uses the `Domain` field)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubjectAltName(String [] SubjectAltName) {
        this.SubjectAltName = SubjectAltName;
    }

    /**
     * Get Whether the certificate is a paid one.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsVip Whether the certificate is a paid one.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set Whether the certificate is a paid one.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsVip Whether the certificate is a paid one.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
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
     * Get Submitted data
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubmittedData Submitted data
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public SubmittedData getSubmittedData() {
        return this.SubmittedData;
    }

    /**
     * Set Submitted data
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubmittedData Submitted data
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubmittedData(SubmittedData SubmittedData) {
        this.SubmittedData = SubmittedData;
    }

    /**
     * Get Whether the certificate can be renewed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewAble Whether the certificate can be renewed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getRenewAble() {
        return this.RenewAble;
    }

    /**
     * Set Whether the certificate can be renewed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewAble Whether the certificate can be renewed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewAble(Boolean RenewAble) {
        this.RenewAble = RenewAble;
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
     * Get List of associated tags
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Tags List of associated tags
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of associated tags
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Tags List of associated tags
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Root certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RootCert Root certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RootCertificates getRootCert() {
        return this.RootCert;
    }

    /**
     * Set Root certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RootCert Root certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRootCert(RootCertificates RootCert) {
        this.RootCert = RootCert;
    }

    /**
     * Get Chinese SM encryption certificate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EncryptCert Chinese SM encryption certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEncryptCert() {
        return this.EncryptCert;
    }

    /**
     * Set Chinese SM encryption certificate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EncryptCert Chinese SM encryption certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEncryptCert(String EncryptCert) {
        this.EncryptCert = EncryptCert;
    }

    /**
     * Get Private key of Chinese SM encryption
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EncryptPrivateKey Private key of Chinese SM encryption
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEncryptPrivateKey() {
        return this.EncryptPrivateKey;
    }

    /**
     * Set Private key of Chinese SM encryption
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EncryptPrivateKey Private key of Chinese SM encryption
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEncryptPrivateKey(String EncryptPrivateKey) {
        this.EncryptPrivateKey = EncryptPrivateKey;
    }

    /**
     * Get SHA1 fingerprint of the signature certificate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CertFingerprint SHA1 fingerprint of the signature certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCertFingerprint() {
        return this.CertFingerprint;
    }

    /**
     * Set SHA1 fingerprint of the signature certificate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CertFingerprint SHA1 fingerprint of the signature certificate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertFingerprint(String CertFingerprint) {
        this.CertFingerprint = CertFingerprint;
    }

    /**
     * Get SHA1 fingerprint of the encryption certificate (for Chinese SM certificates only)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EncryptCertFingerprint SHA1 fingerprint of the encryption certificate (for Chinese SM certificates only)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEncryptCertFingerprint() {
        return this.EncryptCertFingerprint;
    }

    /**
     * Set SHA1 fingerprint of the encryption certificate (for Chinese SM certificates only)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EncryptCertFingerprint SHA1 fingerprint of the encryption certificate (for Chinese SM certificates only)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEncryptCertFingerprint(String EncryptCertFingerprint) {
        this.EncryptCertFingerprint = EncryptCertFingerprint;
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
     * Get The authentication value for DV certificate revocation.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DvRevokeAuthDetail The authentication value for DV certificate revocation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DvAuths [] getDvRevokeAuthDetail() {
        return this.DvRevokeAuthDetail;
    }

    /**
     * Set The authentication value for DV certificate revocation.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DvRevokeAuthDetail The authentication value for DV certificate revocation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDvRevokeAuthDetail(DvAuths [] DvRevokeAuthDetail) {
        this.DvRevokeAuthDetail = DvRevokeAuthDetail;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCertificateDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificateDetailResponse(DescribeCertificateDetailResponse source) {
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.CertificateType != null) {
            this.CertificateType = new String(source.CertificateType);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
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
        if (source.StatusMsg != null) {
            this.StatusMsg = new String(source.StatusMsg);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
        if (source.VulnerabilityStatus != null) {
            this.VulnerabilityStatus = new String(source.VulnerabilityStatus);
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
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.CertificateExtra != null) {
            this.CertificateExtra = new CertificateExtra(source.CertificateExtra);
        }
        if (source.CertificatePrivateKey != null) {
            this.CertificatePrivateKey = new String(source.CertificatePrivateKey);
        }
        if (source.CertificatePublicKey != null) {
            this.CertificatePublicKey = new String(source.CertificatePublicKey);
        }
        if (source.DvAuthDetail != null) {
            this.DvAuthDetail = new DvAuthDetail(source.DvAuthDetail);
        }
        if (source.VulnerabilityReport != null) {
            this.VulnerabilityReport = new String(source.VulnerabilityReport);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.StatusName != null) {
            this.StatusName = new String(source.StatusName);
        }
        if (source.SubjectAltName != null) {
            this.SubjectAltName = new String[source.SubjectAltName.length];
            for (int i = 0; i < source.SubjectAltName.length; i++) {
                this.SubjectAltName[i] = new String(source.SubjectAltName[i]);
            }
        }
        if (source.IsVip != null) {
            this.IsVip = new Boolean(source.IsVip);
        }
        if (source.IsWildcard != null) {
            this.IsWildcard = new Boolean(source.IsWildcard);
        }
        if (source.IsDv != null) {
            this.IsDv = new Boolean(source.IsDv);
        }
        if (source.IsVulnerability != null) {
            this.IsVulnerability = new Boolean(source.IsVulnerability);
        }
        if (source.SubmittedData != null) {
            this.SubmittedData = new SubmittedData(source.SubmittedData);
        }
        if (source.RenewAble != null) {
            this.RenewAble = new Boolean(source.RenewAble);
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
        if (source.RootCert != null) {
            this.RootCert = new RootCertificates(source.RootCert);
        }
        if (source.EncryptCert != null) {
            this.EncryptCert = new String(source.EncryptCert);
        }
        if (source.EncryptPrivateKey != null) {
            this.EncryptPrivateKey = new String(source.EncryptPrivateKey);
        }
        if (source.CertFingerprint != null) {
            this.CertFingerprint = new String(source.CertFingerprint);
        }
        if (source.EncryptCertFingerprint != null) {
            this.EncryptCertFingerprint = new String(source.EncryptCertFingerprint);
        }
        if (source.EncryptAlgorithm != null) {
            this.EncryptAlgorithm = new String(source.EncryptAlgorithm);
        }
        if (source.DvRevokeAuthDetail != null) {
            this.DvRevokeAuthDetail = new DvAuths[source.DvRevokeAuthDetail.length];
            for (int i = 0; i < source.DvRevokeAuthDetail.length; i++) {
                this.DvRevokeAuthDetail[i] = new DvAuths(source.DvRevokeAuthDetail[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "ProductZhName", this.ProductZhName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusMsg", this.StatusMsg);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "VulnerabilityStatus", this.VulnerabilityStatus);
        this.setParamSimple(map, prefix + "CertBeginTime", this.CertBeginTime);
        this.setParamSimple(map, prefix + "CertEndTime", this.CertEndTime);
        this.setParamSimple(map, prefix + "ValidityPeriod", this.ValidityPeriod);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamObj(map, prefix + "CertificateExtra.", this.CertificateExtra);
        this.setParamSimple(map, prefix + "CertificatePrivateKey", this.CertificatePrivateKey);
        this.setParamSimple(map, prefix + "CertificatePublicKey", this.CertificatePublicKey);
        this.setParamObj(map, prefix + "DvAuthDetail.", this.DvAuthDetail);
        this.setParamSimple(map, prefix + "VulnerabilityReport", this.VulnerabilityReport);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "StatusName", this.StatusName);
        this.setParamArraySimple(map, prefix + "SubjectAltName.", this.SubjectAltName);
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "IsWildcard", this.IsWildcard);
        this.setParamSimple(map, prefix + "IsDv", this.IsDv);
        this.setParamSimple(map, prefix + "IsVulnerability", this.IsVulnerability);
        this.setParamObj(map, prefix + "SubmittedData.", this.SubmittedData);
        this.setParamSimple(map, prefix + "RenewAble", this.RenewAble);
        this.setParamSimple(map, prefix + "Deployable", this.Deployable);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "RootCert.", this.RootCert);
        this.setParamSimple(map, prefix + "EncryptCert", this.EncryptCert);
        this.setParamSimple(map, prefix + "EncryptPrivateKey", this.EncryptPrivateKey);
        this.setParamSimple(map, prefix + "CertFingerprint", this.CertFingerprint);
        this.setParamSimple(map, prefix + "EncryptCertFingerprint", this.EncryptCertFingerprint);
        this.setParamSimple(map, prefix + "EncryptAlgorithm", this.EncryptAlgorithm);
        this.setParamArrayObj(map, prefix + "DvRevokeAuthDetail.", this.DvRevokeAuthDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

