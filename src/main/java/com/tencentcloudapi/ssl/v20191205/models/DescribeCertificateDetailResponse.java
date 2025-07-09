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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificateDetailResponse extends AbstractModel {

    /**
    * Certificate belonging to user main account uin.
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
    * Certificate source:.
trustAsia.
upload.
wosign.
sheca.
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
    * Certificate package type:.
null: user uploads a certificate (no package type),.
2: trustasia tls rsa ca,. 
3: securesite enhanced enterprise version (ev pro),. 
4: securesite enhanced (ev),. 
5: securesite enterprise pro (ov pro).
6: securesite enterprise (ov). 
7: securesite enterprise (ov) wildcard. 
8: geotrust enhanced (ev). 
9: geotrust enterprise (ov). 
10: geotrust enterprise (ov) wildcard cert. 
11: trustasia domain name-based multiple domain names ssl certificate. 
12: trustasia domain name-based (dv) wildcard cert. 
13: trustasia enterprise wildcard (ov) ssl certificate (d3). 
14: trustasia enterprise (ov) ssl certificate (d3). 
15: trustasia enterprise multiple domain names (ov) ssl certificate (d3). 
16: trustasia enhanced (ev) ssl certificate (d3). 
17: trustasia enhanced multiple domain names (ev) ssl certificate (d3). 
18: globalsign enterprise (ov) ssl certificate. 
19: globalsign enterprise wildcard (ov) ssl certificate. 
20: globalsign enhanced (ev) ssl certificate. 
21: trustasia enterprise wildcard multiple domain names (ov) ssl certificate (d3). 
22: globalsign enterprise multiple domain names (ov) ssl certificate. 
23: globalsign enterprise wildcard multiple domain names (ov) ssl certificate.
24: globalsign enhanced multiple domain names (ev) ssl certificate.
25: wotrus domain cert.
26: wotrus multi-domain cert.
27: wotrus wildcard cert.
28: wotrus enterprise cert.
29: wotrus enterprise multi-domain cert.
30: wotrus enterprise wildcard certificate.
31: wotrus enhanced certificate.
32: wotrus enhanced multi-domain name certificate.
33: wotrus-national cryptography domain name certificate.
34: wotrus-national cryptography domain name certificate (multiple domain names).
35: wotrus-national cryptography wildcard certificate.
37: wotrus-national cryptography enterprise certificate.
38: wotrus-national cryptography enterprise certificate (multiple domain names).
39: wotrus-national cryptography enterprise certificate (wildcard).
40: wotrus-national cryptography enhanced certificate.
41: wotrus - national cryptography enhanced certificate (multiple domain names).
42: trustasia - domain name certificate (wildcard multiple domain names).
43: DNSPod - enterprise (ov) ssl certificate.
44: DNSPod - enterprise (ov) wildcard ssl certificate.
45: DNSPod - enterprise (ov) multiple domain names ssl certificate.
46: dnspod-enhanced (ev) ssl certificate.
47: dnspod-enhanced (ev) multiple domain names ssl certificate.
48: dnspod-domain name-based (dv) ssl certificate.
49: dnspod-domain name-based (dv) wildcard ssl certificate.
50: dnspod-domain name-based (dv) multiple domain names ssl certificate.
51: DNSPod (national cryptography) - enterprise (ov) ssl certificate.
52: DNSPod (national cryptography) - enterprise (ov) wildcard ssl certificate.
53: DNSPod (national cryptography) - enterprise (ov) multiple domain names ssl certificate.
54: DNSPod (national cryptography) - domain name-based (dv) ssl certificate.
55: DNSPod (national cryptography) - domain name-based (dv) wildcard ssl certificate.
56: DNSPod (national cryptography) - domain name-based (dv) multiple domain names ssl certificate.
57: securesite enterprise professional version multiple domain names (ov pro).
58: securesite enterprise multiple domain names (ov).
59: securesite enhanced professional version multiple domain names (ev pro).
60: securesite enhanced multiple domain names (ev).
61: geotrust enhanced multiple domain names (ev).
75: securesite enterprise (ov).
76: securesite enterprise (ov) wildcard.
77: securesite enhanced (ev).
78: geotrust enterprise (ov).
79: geotrust enterprise (ov) wildcard.
80: geotrust enhanced (ev).
81: globalsign enterprise (ov) ssl certificate.
82: globalsign enterprise wildcard (ov) ssl certificate.
83: trustasia c1 dv free.
85: globalsign enhanced (ev) ssl certificate.
88: globalsign enterprise wildcard multiple domain names (ov) ssl certificate.
89: globalsign enterprise multiple domain names (ov) ssl certificate.
90: globalsign enhanced multiple domain names (ev) ssl certificate.
91: geotrust enhanced multiple domain names (ev).
92: securesite enterprise ov pro for multiple domain names.
93: securesite enterprise for multiple domain names (ov).
94: securesite ev pro for multiple domain names.
95: securesite ev for multiple domain names.
96: securesite ev pro.
97: securesite enterprise professional edition (ov pro).
98: cfca enterprise (ov) ssl certificate.
99: cfca enterprise multiple domain names (ov) ssl certificate.
100: cfca enterprise wildcard (ov) ssl certificate.
101: cfca enhanced (ev) ssl certificate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Certificate product name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductZhName")
    @Expose
    private String ProductZhName;

    /**
    * Certificate binds to a common name domain.
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
    * Certificate status: 0 = under review, 1 = approved, 2 = review failed, 3 = expired, 4 = automatically added dns records, 5 = enterprise certificate, pending document submission, 6 = order cancellation in progress, 7 = canceled, 8 = documents submitted, pending upload of confirmation letter, 9 = certificate revocation in progress, 10 = revoked, 11 = reissue in progress, 12 = pending upload of revocation confirmation letter, 13 = free certificate pending document submission, 14 = certificate has been refunded, 15 = certificate migration in progress.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Status information. valid values:.
//Common status information.
PRE-REVIEWING: in prereview.
LEGAL-REVIEWING: in legal review.
CA-REVIEWING: in ca review.
PENDING-DCV: in domain verification.
WAIT-ISSUE: waiting for issue (domain verification passed).
Certificate review failure status information.
1. order review failed.
2. ca review failed, and the domain name did not pass the security review.
3. domain name verification timed out, and the order was automatically closed. please reapply for the certificate.
4. the certificate information did not pass the review of the certificate ca agency. the reviewer will call the contact information reserved for the certificate. please pay attention to the incoming call. subsequently, you can resubmit the information through "modify information".
To be continuously improved.
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
    * Certificate application time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * CA order id.
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
    * Private key certificate; for Chinese SM certificates, it refers to the private key certificate in the signature certificate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificatePrivateKey")
    @Expose
    private String CertificatePrivateKey;

    /**
    * Public key certificate; for Chinese SM certificate, it refers to the public key certificate in the signature certificate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificatePublicKey")
    @Expose
    private String CertificatePublicKey;

    /**
    * Certificate domain name verification information.
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
    * Profile information submitted for paid certificates.
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
    * Chinese SM certificate public key, only has value for national cryptography certificates.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EncryptCert")
    @Expose
    private String EncryptCert;

    /**
    * Chinese SM certificate private key certificate, only has value for national cryptography certificates.
Note: this field may return null, indicating that no valid values can be obtained.
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
    * Certificate encryption algorithm (or Chinese SM certificates only).
Note: this field may return null, indicating that no valid values can be obtained.
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
    * Certificate chain information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertChainInfo")
    @Expose
    private CertBasicInfo [] CertChainInfo;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Certificate belonging to user main account uin.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OwnerUin Certificate belonging to user main account uin.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Certificate belonging to user main account uin.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OwnerUin Certificate belonging to user main account uin.
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
     * Get Certificate source:.
trustAsia.
upload.
wosign.
sheca.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return From Certificate source:.
trustAsia.
upload.
wosign.
sheca.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Certificate source:.
trustAsia.
upload.
wosign.
sheca.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param From Certificate source:.
trustAsia.
upload.
wosign.
sheca.
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
     * Get Certificate package type:.
null: user uploads a certificate (no package type),.
2: trustasia tls rsa ca,. 
3: securesite enhanced enterprise version (ev pro),. 
4: securesite enhanced (ev),. 
5: securesite enterprise pro (ov pro).
6: securesite enterprise (ov). 
7: securesite enterprise (ov) wildcard. 
8: geotrust enhanced (ev). 
9: geotrust enterprise (ov). 
10: geotrust enterprise (ov) wildcard cert. 
11: trustasia domain name-based multiple domain names ssl certificate. 
12: trustasia domain name-based (dv) wildcard cert. 
13: trustasia enterprise wildcard (ov) ssl certificate (d3). 
14: trustasia enterprise (ov) ssl certificate (d3). 
15: trustasia enterprise multiple domain names (ov) ssl certificate (d3). 
16: trustasia enhanced (ev) ssl certificate (d3). 
17: trustasia enhanced multiple domain names (ev) ssl certificate (d3). 
18: globalsign enterprise (ov) ssl certificate. 
19: globalsign enterprise wildcard (ov) ssl certificate. 
20: globalsign enhanced (ev) ssl certificate. 
21: trustasia enterprise wildcard multiple domain names (ov) ssl certificate (d3). 
22: globalsign enterprise multiple domain names (ov) ssl certificate. 
23: globalsign enterprise wildcard multiple domain names (ov) ssl certificate.
24: globalsign enhanced multiple domain names (ev) ssl certificate.
25: wotrus domain cert.
26: wotrus multi-domain cert.
27: wotrus wildcard cert.
28: wotrus enterprise cert.
29: wotrus enterprise multi-domain cert.
30: wotrus enterprise wildcard certificate.
31: wotrus enhanced certificate.
32: wotrus enhanced multi-domain name certificate.
33: wotrus-national cryptography domain name certificate.
34: wotrus-national cryptography domain name certificate (multiple domain names).
35: wotrus-national cryptography wildcard certificate.
37: wotrus-national cryptography enterprise certificate.
38: wotrus-national cryptography enterprise certificate (multiple domain names).
39: wotrus-national cryptography enterprise certificate (wildcard).
40: wotrus-national cryptography enhanced certificate.
41: wotrus - national cryptography enhanced certificate (multiple domain names).
42: trustasia - domain name certificate (wildcard multiple domain names).
43: DNSPod - enterprise (ov) ssl certificate.
44: DNSPod - enterprise (ov) wildcard ssl certificate.
45: DNSPod - enterprise (ov) multiple domain names ssl certificate.
46: dnspod-enhanced (ev) ssl certificate.
47: dnspod-enhanced (ev) multiple domain names ssl certificate.
48: dnspod-domain name-based (dv) ssl certificate.
49: dnspod-domain name-based (dv) wildcard ssl certificate.
50: dnspod-domain name-based (dv) multiple domain names ssl certificate.
51: DNSPod (national cryptography) - enterprise (ov) ssl certificate.
52: DNSPod (national cryptography) - enterprise (ov) wildcard ssl certificate.
53: DNSPod (national cryptography) - enterprise (ov) multiple domain names ssl certificate.
54: DNSPod (national cryptography) - domain name-based (dv) ssl certificate.
55: DNSPod (national cryptography) - domain name-based (dv) wildcard ssl certificate.
56: DNSPod (national cryptography) - domain name-based (dv) multiple domain names ssl certificate.
57: securesite enterprise professional version multiple domain names (ov pro).
58: securesite enterprise multiple domain names (ov).
59: securesite enhanced professional version multiple domain names (ev pro).
60: securesite enhanced multiple domain names (ev).
61: geotrust enhanced multiple domain names (ev).
75: securesite enterprise (ov).
76: securesite enterprise (ov) wildcard.
77: securesite enhanced (ev).
78: geotrust enterprise (ov).
79: geotrust enterprise (ov) wildcard.
80: geotrust enhanced (ev).
81: globalsign enterprise (ov) ssl certificate.
82: globalsign enterprise wildcard (ov) ssl certificate.
83: trustasia c1 dv free.
85: globalsign enhanced (ev) ssl certificate.
88: globalsign enterprise wildcard multiple domain names (ov) ssl certificate.
89: globalsign enterprise multiple domain names (ov) ssl certificate.
90: globalsign enhanced multiple domain names (ev) ssl certificate.
91: geotrust enhanced multiple domain names (ev).
92: securesite enterprise ov pro for multiple domain names.
93: securesite enterprise for multiple domain names (ov).
94: securesite ev pro for multiple domain names.
95: securesite ev for multiple domain names.
96: securesite ev pro.
97: securesite enterprise professional edition (ov pro).
98: cfca enterprise (ov) ssl certificate.
99: cfca enterprise multiple domain names (ov) ssl certificate.
100: cfca enterprise wildcard (ov) ssl certificate.
101: cfca enhanced (ev) ssl certificate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PackageType Certificate package type:.
null: user uploads a certificate (no package type),.
2: trustasia tls rsa ca,. 
3: securesite enhanced enterprise version (ev pro),. 
4: securesite enhanced (ev),. 
5: securesite enterprise pro (ov pro).
6: securesite enterprise (ov). 
7: securesite enterprise (ov) wildcard. 
8: geotrust enhanced (ev). 
9: geotrust enterprise (ov). 
10: geotrust enterprise (ov) wildcard cert. 
11: trustasia domain name-based multiple domain names ssl certificate. 
12: trustasia domain name-based (dv) wildcard cert. 
13: trustasia enterprise wildcard (ov) ssl certificate (d3). 
14: trustasia enterprise (ov) ssl certificate (d3). 
15: trustasia enterprise multiple domain names (ov) ssl certificate (d3). 
16: trustasia enhanced (ev) ssl certificate (d3). 
17: trustasia enhanced multiple domain names (ev) ssl certificate (d3). 
18: globalsign enterprise (ov) ssl certificate. 
19: globalsign enterprise wildcard (ov) ssl certificate. 
20: globalsign enhanced (ev) ssl certificate. 
21: trustasia enterprise wildcard multiple domain names (ov) ssl certificate (d3). 
22: globalsign enterprise multiple domain names (ov) ssl certificate. 
23: globalsign enterprise wildcard multiple domain names (ov) ssl certificate.
24: globalsign enhanced multiple domain names (ev) ssl certificate.
25: wotrus domain cert.
26: wotrus multi-domain cert.
27: wotrus wildcard cert.
28: wotrus enterprise cert.
29: wotrus enterprise multi-domain cert.
30: wotrus enterprise wildcard certificate.
31: wotrus enhanced certificate.
32: wotrus enhanced multi-domain name certificate.
33: wotrus-national cryptography domain name certificate.
34: wotrus-national cryptography domain name certificate (multiple domain names).
35: wotrus-national cryptography wildcard certificate.
37: wotrus-national cryptography enterprise certificate.
38: wotrus-national cryptography enterprise certificate (multiple domain names).
39: wotrus-national cryptography enterprise certificate (wildcard).
40: wotrus-national cryptography enhanced certificate.
41: wotrus - national cryptography enhanced certificate (multiple domain names).
42: trustasia - domain name certificate (wildcard multiple domain names).
43: DNSPod - enterprise (ov) ssl certificate.
44: DNSPod - enterprise (ov) wildcard ssl certificate.
45: DNSPod - enterprise (ov) multiple domain names ssl certificate.
46: dnspod-enhanced (ev) ssl certificate.
47: dnspod-enhanced (ev) multiple domain names ssl certificate.
48: dnspod-domain name-based (dv) ssl certificate.
49: dnspod-domain name-based (dv) wildcard ssl certificate.
50: dnspod-domain name-based (dv) multiple domain names ssl certificate.
51: DNSPod (national cryptography) - enterprise (ov) ssl certificate.
52: DNSPod (national cryptography) - enterprise (ov) wildcard ssl certificate.
53: DNSPod (national cryptography) - enterprise (ov) multiple domain names ssl certificate.
54: DNSPod (national cryptography) - domain name-based (dv) ssl certificate.
55: DNSPod (national cryptography) - domain name-based (dv) wildcard ssl certificate.
56: DNSPod (national cryptography) - domain name-based (dv) multiple domain names ssl certificate.
57: securesite enterprise professional version multiple domain names (ov pro).
58: securesite enterprise multiple domain names (ov).
59: securesite enhanced professional version multiple domain names (ev pro).
60: securesite enhanced multiple domain names (ev).
61: geotrust enhanced multiple domain names (ev).
75: securesite enterprise (ov).
76: securesite enterprise (ov) wildcard.
77: securesite enhanced (ev).
78: geotrust enterprise (ov).
79: geotrust enterprise (ov) wildcard.
80: geotrust enhanced (ev).
81: globalsign enterprise (ov) ssl certificate.
82: globalsign enterprise wildcard (ov) ssl certificate.
83: trustasia c1 dv free.
85: globalsign enhanced (ev) ssl certificate.
88: globalsign enterprise wildcard multiple domain names (ov) ssl certificate.
89: globalsign enterprise multiple domain names (ov) ssl certificate.
90: globalsign enhanced multiple domain names (ev) ssl certificate.
91: geotrust enhanced multiple domain names (ev).
92: securesite enterprise ov pro for multiple domain names.
93: securesite enterprise for multiple domain names (ov).
94: securesite ev pro for multiple domain names.
95: securesite ev for multiple domain names.
96: securesite ev pro.
97: securesite enterprise professional edition (ov pro).
98: cfca enterprise (ov) ssl certificate.
99: cfca enterprise multiple domain names (ov) ssl certificate.
100: cfca enterprise wildcard (ov) ssl certificate.
101: cfca enhanced (ev) ssl certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Certificate package type:.
null: user uploads a certificate (no package type),.
2: trustasia tls rsa ca,. 
3: securesite enhanced enterprise version (ev pro),. 
4: securesite enhanced (ev),. 
5: securesite enterprise pro (ov pro).
6: securesite enterprise (ov). 
7: securesite enterprise (ov) wildcard. 
8: geotrust enhanced (ev). 
9: geotrust enterprise (ov). 
10: geotrust enterprise (ov) wildcard cert. 
11: trustasia domain name-based multiple domain names ssl certificate. 
12: trustasia domain name-based (dv) wildcard cert. 
13: trustasia enterprise wildcard (ov) ssl certificate (d3). 
14: trustasia enterprise (ov) ssl certificate (d3). 
15: trustasia enterprise multiple domain names (ov) ssl certificate (d3). 
16: trustasia enhanced (ev) ssl certificate (d3). 
17: trustasia enhanced multiple domain names (ev) ssl certificate (d3). 
18: globalsign enterprise (ov) ssl certificate. 
19: globalsign enterprise wildcard (ov) ssl certificate. 
20: globalsign enhanced (ev) ssl certificate. 
21: trustasia enterprise wildcard multiple domain names (ov) ssl certificate (d3). 
22: globalsign enterprise multiple domain names (ov) ssl certificate. 
23: globalsign enterprise wildcard multiple domain names (ov) ssl certificate.
24: globalsign enhanced multiple domain names (ev) ssl certificate.
25: wotrus domain cert.
26: wotrus multi-domain cert.
27: wotrus wildcard cert.
28: wotrus enterprise cert.
29: wotrus enterprise multi-domain cert.
30: wotrus enterprise wildcard certificate.
31: wotrus enhanced certificate.
32: wotrus enhanced multi-domain name certificate.
33: wotrus-national cryptography domain name certificate.
34: wotrus-national cryptography domain name certificate (multiple domain names).
35: wotrus-national cryptography wildcard certificate.
37: wotrus-national cryptography enterprise certificate.
38: wotrus-national cryptography enterprise certificate (multiple domain names).
39: wotrus-national cryptography enterprise certificate (wildcard).
40: wotrus-national cryptography enhanced certificate.
41: wotrus - national cryptography enhanced certificate (multiple domain names).
42: trustasia - domain name certificate (wildcard multiple domain names).
43: DNSPod - enterprise (ov) ssl certificate.
44: DNSPod - enterprise (ov) wildcard ssl certificate.
45: DNSPod - enterprise (ov) multiple domain names ssl certificate.
46: dnspod-enhanced (ev) ssl certificate.
47: dnspod-enhanced (ev) multiple domain names ssl certificate.
48: dnspod-domain name-based (dv) ssl certificate.
49: dnspod-domain name-based (dv) wildcard ssl certificate.
50: dnspod-domain name-based (dv) multiple domain names ssl certificate.
51: DNSPod (national cryptography) - enterprise (ov) ssl certificate.
52: DNSPod (national cryptography) - enterprise (ov) wildcard ssl certificate.
53: DNSPod (national cryptography) - enterprise (ov) multiple domain names ssl certificate.
54: DNSPod (national cryptography) - domain name-based (dv) ssl certificate.
55: DNSPod (national cryptography) - domain name-based (dv) wildcard ssl certificate.
56: DNSPod (national cryptography) - domain name-based (dv) multiple domain names ssl certificate.
57: securesite enterprise professional version multiple domain names (ov pro).
58: securesite enterprise multiple domain names (ov).
59: securesite enhanced professional version multiple domain names (ev pro).
60: securesite enhanced multiple domain names (ev).
61: geotrust enhanced multiple domain names (ev).
75: securesite enterprise (ov).
76: securesite enterprise (ov) wildcard.
77: securesite enhanced (ev).
78: geotrust enterprise (ov).
79: geotrust enterprise (ov) wildcard.
80: geotrust enhanced (ev).
81: globalsign enterprise (ov) ssl certificate.
82: globalsign enterprise wildcard (ov) ssl certificate.
83: trustasia c1 dv free.
85: globalsign enhanced (ev) ssl certificate.
88: globalsign enterprise wildcard multiple domain names (ov) ssl certificate.
89: globalsign enterprise multiple domain names (ov) ssl certificate.
90: globalsign enhanced multiple domain names (ev) ssl certificate.
91: geotrust enhanced multiple domain names (ev).
92: securesite enterprise ov pro for multiple domain names.
93: securesite enterprise for multiple domain names (ov).
94: securesite ev pro for multiple domain names.
95: securesite ev for multiple domain names.
96: securesite ev pro.
97: securesite enterprise professional edition (ov pro).
98: cfca enterprise (ov) ssl certificate.
99: cfca enterprise multiple domain names (ov) ssl certificate.
100: cfca enterprise wildcard (ov) ssl certificate.
101: cfca enhanced (ev) ssl certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PackageType Certificate package type:.
null: user uploads a certificate (no package type),.
2: trustasia tls rsa ca,. 
3: securesite enhanced enterprise version (ev pro),. 
4: securesite enhanced (ev),. 
5: securesite enterprise pro (ov pro).
6: securesite enterprise (ov). 
7: securesite enterprise (ov) wildcard. 
8: geotrust enhanced (ev). 
9: geotrust enterprise (ov). 
10: geotrust enterprise (ov) wildcard cert. 
11: trustasia domain name-based multiple domain names ssl certificate. 
12: trustasia domain name-based (dv) wildcard cert. 
13: trustasia enterprise wildcard (ov) ssl certificate (d3). 
14: trustasia enterprise (ov) ssl certificate (d3). 
15: trustasia enterprise multiple domain names (ov) ssl certificate (d3). 
16: trustasia enhanced (ev) ssl certificate (d3). 
17: trustasia enhanced multiple domain names (ev) ssl certificate (d3). 
18: globalsign enterprise (ov) ssl certificate. 
19: globalsign enterprise wildcard (ov) ssl certificate. 
20: globalsign enhanced (ev) ssl certificate. 
21: trustasia enterprise wildcard multiple domain names (ov) ssl certificate (d3). 
22: globalsign enterprise multiple domain names (ov) ssl certificate. 
23: globalsign enterprise wildcard multiple domain names (ov) ssl certificate.
24: globalsign enhanced multiple domain names (ev) ssl certificate.
25: wotrus domain cert.
26: wotrus multi-domain cert.
27: wotrus wildcard cert.
28: wotrus enterprise cert.
29: wotrus enterprise multi-domain cert.
30: wotrus enterprise wildcard certificate.
31: wotrus enhanced certificate.
32: wotrus enhanced multi-domain name certificate.
33: wotrus-national cryptography domain name certificate.
34: wotrus-national cryptography domain name certificate (multiple domain names).
35: wotrus-national cryptography wildcard certificate.
37: wotrus-national cryptography enterprise certificate.
38: wotrus-national cryptography enterprise certificate (multiple domain names).
39: wotrus-national cryptography enterprise certificate (wildcard).
40: wotrus-national cryptography enhanced certificate.
41: wotrus - national cryptography enhanced certificate (multiple domain names).
42: trustasia - domain name certificate (wildcard multiple domain names).
43: DNSPod - enterprise (ov) ssl certificate.
44: DNSPod - enterprise (ov) wildcard ssl certificate.
45: DNSPod - enterprise (ov) multiple domain names ssl certificate.
46: dnspod-enhanced (ev) ssl certificate.
47: dnspod-enhanced (ev) multiple domain names ssl certificate.
48: dnspod-domain name-based (dv) ssl certificate.
49: dnspod-domain name-based (dv) wildcard ssl certificate.
50: dnspod-domain name-based (dv) multiple domain names ssl certificate.
51: DNSPod (national cryptography) - enterprise (ov) ssl certificate.
52: DNSPod (national cryptography) - enterprise (ov) wildcard ssl certificate.
53: DNSPod (national cryptography) - enterprise (ov) multiple domain names ssl certificate.
54: DNSPod (national cryptography) - domain name-based (dv) ssl certificate.
55: DNSPod (national cryptography) - domain name-based (dv) wildcard ssl certificate.
56: DNSPod (national cryptography) - domain name-based (dv) multiple domain names ssl certificate.
57: securesite enterprise professional version multiple domain names (ov pro).
58: securesite enterprise multiple domain names (ov).
59: securesite enhanced professional version multiple domain names (ev pro).
60: securesite enhanced multiple domain names (ev).
61: geotrust enhanced multiple domain names (ev).
75: securesite enterprise (ov).
76: securesite enterprise (ov) wildcard.
77: securesite enhanced (ev).
78: geotrust enterprise (ov).
79: geotrust enterprise (ov) wildcard.
80: geotrust enhanced (ev).
81: globalsign enterprise (ov) ssl certificate.
82: globalsign enterprise wildcard (ov) ssl certificate.
83: trustasia c1 dv free.
85: globalsign enhanced (ev) ssl certificate.
88: globalsign enterprise wildcard multiple domain names (ov) ssl certificate.
89: globalsign enterprise multiple domain names (ov) ssl certificate.
90: globalsign enhanced multiple domain names (ev) ssl certificate.
91: geotrust enhanced multiple domain names (ev).
92: securesite enterprise ov pro for multiple domain names.
93: securesite enterprise for multiple domain names (ov).
94: securesite ev pro for multiple domain names.
95: securesite ev for multiple domain names.
96: securesite ev pro.
97: securesite enterprise professional edition (ov pro).
98: cfca enterprise (ov) ssl certificate.
99: cfca enterprise multiple domain names (ov) ssl certificate.
100: cfca enterprise wildcard (ov) ssl certificate.
101: cfca enhanced (ev) ssl certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Certificate product name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProductZhName Certificate product name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProductZhName() {
        return this.ProductZhName;
    }

    /**
     * Set Certificate product name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProductZhName Certificate product name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProductZhName(String ProductZhName) {
        this.ProductZhName = ProductZhName;
    }

    /**
     * Get Certificate binds to a common name domain.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Domain Certificate binds to a common name domain.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Certificate binds to a common name domain.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Domain Certificate binds to a common name domain.
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
     * Get Certificate status: 0 = under review, 1 = approved, 2 = review failed, 3 = expired, 4 = automatically added dns records, 5 = enterprise certificate, pending document submission, 6 = order cancellation in progress, 7 = canceled, 8 = documents submitted, pending upload of confirmation letter, 9 = certificate revocation in progress, 10 = revoked, 11 = reissue in progress, 12 = pending upload of revocation confirmation letter, 13 = free certificate pending document submission, 14 = certificate has been refunded, 15 = certificate migration in progress.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Certificate status: 0 = under review, 1 = approved, 2 = review failed, 3 = expired, 4 = automatically added dns records, 5 = enterprise certificate, pending document submission, 6 = order cancellation in progress, 7 = canceled, 8 = documents submitted, pending upload of confirmation letter, 9 = certificate revocation in progress, 10 = revoked, 11 = reissue in progress, 12 = pending upload of revocation confirmation letter, 13 = free certificate pending document submission, 14 = certificate has been refunded, 15 = certificate migration in progress.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Certificate status: 0 = under review, 1 = approved, 2 = review failed, 3 = expired, 4 = automatically added dns records, 5 = enterprise certificate, pending document submission, 6 = order cancellation in progress, 7 = canceled, 8 = documents submitted, pending upload of confirmation letter, 9 = certificate revocation in progress, 10 = revoked, 11 = reissue in progress, 12 = pending upload of revocation confirmation letter, 13 = free certificate pending document submission, 14 = certificate has been refunded, 15 = certificate migration in progress.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Certificate status: 0 = under review, 1 = approved, 2 = review failed, 3 = expired, 4 = automatically added dns records, 5 = enterprise certificate, pending document submission, 6 = order cancellation in progress, 7 = canceled, 8 = documents submitted, pending upload of confirmation letter, 9 = certificate revocation in progress, 10 = revoked, 11 = reissue in progress, 12 = pending upload of revocation confirmation letter, 13 = free certificate pending document submission, 14 = certificate has been refunded, 15 = certificate migration in progress.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Status information. valid values:.
//Common status information.
PRE-REVIEWING: in prereview.
LEGAL-REVIEWING: in legal review.
CA-REVIEWING: in ca review.
PENDING-DCV: in domain verification.
WAIT-ISSUE: waiting for issue (domain verification passed).
Certificate review failure status information.
1. order review failed.
2. ca review failed, and the domain name did not pass the security review.
3. domain name verification timed out, and the order was automatically closed. please reapply for the certificate.
4. the certificate information did not pass the review of the certificate ca agency. the reviewer will call the contact information reserved for the certificate. please pay attention to the incoming call. subsequently, you can resubmit the information through "modify information".
To be continuously improved.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StatusMsg Status information. valid values:.
//Common status information.
PRE-REVIEWING: in prereview.
LEGAL-REVIEWING: in legal review.
CA-REVIEWING: in ca review.
PENDING-DCV: in domain verification.
WAIT-ISSUE: waiting for issue (domain verification passed).
Certificate review failure status information.
1. order review failed.
2. ca review failed, and the domain name did not pass the security review.
3. domain name verification timed out, and the order was automatically closed. please reapply for the certificate.
4. the certificate information did not pass the review of the certificate ca agency. the reviewer will call the contact information reserved for the certificate. please pay attention to the incoming call. subsequently, you can resubmit the information through "modify information".
To be continuously improved.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusMsg() {
        return this.StatusMsg;
    }

    /**
     * Set Status information. valid values:.
//Common status information.
PRE-REVIEWING: in prereview.
LEGAL-REVIEWING: in legal review.
CA-REVIEWING: in ca review.
PENDING-DCV: in domain verification.
WAIT-ISSUE: waiting for issue (domain verification passed).
Certificate review failure status information.
1. order review failed.
2. ca review failed, and the domain name did not pass the security review.
3. domain name verification timed out, and the order was automatically closed. please reapply for the certificate.
4. the certificate information did not pass the review of the certificate ca agency. the reviewer will call the contact information reserved for the certificate. please pay attention to the incoming call. subsequently, you can resubmit the information through "modify information".
To be continuously improved.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StatusMsg Status information. valid values:.
//Common status information.
PRE-REVIEWING: in prereview.
LEGAL-REVIEWING: in legal review.
CA-REVIEWING: in ca review.
PENDING-DCV: in domain verification.
WAIT-ISSUE: waiting for issue (domain verification passed).
Certificate review failure status information.
1. order review failed.
2. ca review failed, and the domain name did not pass the security review.
3. domain name verification timed out, and the order was automatically closed. please reapply for the certificate.
4. the certificate information did not pass the review of the certificate ca agency. the reviewer will call the contact information reserved for the certificate. please pay attention to the incoming call. subsequently, you can resubmit the information through "modify information".
To be continuously improved.
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
     * Get Certificate application time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InsertTime Certificate application time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Certificate application time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InsertTime Certificate application time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get CA order id.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrderId CA order id.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set CA order id.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrderId CA order id.
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
     * Get Private key certificate; for Chinese SM certificates, it refers to the private key certificate in the signature certificate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertificatePrivateKey Private key certificate; for Chinese SM certificates, it refers to the private key certificate in the signature certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificatePrivateKey() {
        return this.CertificatePrivateKey;
    }

    /**
     * Set Private key certificate; for Chinese SM certificates, it refers to the private key certificate in the signature certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertificatePrivateKey Private key certificate; for Chinese SM certificates, it refers to the private key certificate in the signature certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificatePrivateKey(String CertificatePrivateKey) {
        this.CertificatePrivateKey = CertificatePrivateKey;
    }

    /**
     * Get Public key certificate; for Chinese SM certificate, it refers to the public key certificate in the signature certificate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertificatePublicKey Public key certificate; for Chinese SM certificate, it refers to the public key certificate in the signature certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificatePublicKey() {
        return this.CertificatePublicKey;
    }

    /**
     * Set Public key certificate; for Chinese SM certificate, it refers to the public key certificate in the signature certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertificatePublicKey Public key certificate; for Chinese SM certificate, it refers to the public key certificate in the signature certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificatePublicKey(String CertificatePublicKey) {
        this.CertificatePublicKey = CertificatePublicKey;
    }

    /**
     * Get Certificate domain name verification information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthDetail Certificate domain name verification information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DvAuthDetail getDvAuthDetail() {
        return this.DvAuthDetail;
    }

    /**
     * Set Certificate domain name verification information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthDetail Certificate domain name verification information.
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
     * Get Profile information submitted for paid certificates.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubmittedData Profile information submitted for paid certificates.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public SubmittedData getSubmittedData() {
        return this.SubmittedData;
    }

    /**
     * Set Profile information submitted for paid certificates.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubmittedData Profile information submitted for paid certificates.
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
     * Get Chinese SM certificate public key, only has value for national cryptography certificates.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EncryptCert Chinese SM certificate public key, only has value for national cryptography certificates.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEncryptCert() {
        return this.EncryptCert;
    }

    /**
     * Set Chinese SM certificate public key, only has value for national cryptography certificates.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EncryptCert Chinese SM certificate public key, only has value for national cryptography certificates.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEncryptCert(String EncryptCert) {
        this.EncryptCert = EncryptCert;
    }

    /**
     * Get Chinese SM certificate private key certificate, only has value for national cryptography certificates.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EncryptPrivateKey Chinese SM certificate private key certificate, only has value for national cryptography certificates.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEncryptPrivateKey() {
        return this.EncryptPrivateKey;
    }

    /**
     * Set Chinese SM certificate private key certificate, only has value for national cryptography certificates.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EncryptPrivateKey Chinese SM certificate private key certificate, only has value for national cryptography certificates.
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Certificate encryption algorithm (or Chinese SM certificates only).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EncryptAlgorithm Certificate encryption algorithm (or Chinese SM certificates only).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEncryptAlgorithm() {
        return this.EncryptAlgorithm;
    }

    /**
     * Set Certificate encryption algorithm (or Chinese SM certificates only).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EncryptAlgorithm Certificate encryption algorithm (or Chinese SM certificates only).
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Certificate chain information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertChainInfo Certificate chain information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CertBasicInfo [] getCertChainInfo() {
        return this.CertChainInfo;
    }

    /**
     * Set Certificate chain information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertChainInfo Certificate chain information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertChainInfo(CertBasicInfo [] CertChainInfo) {
        this.CertChainInfo = CertChainInfo;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
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
        if (source.CertChainInfo != null) {
            this.CertChainInfo = new CertBasicInfo[source.CertChainInfo.length];
            for (int i = 0; i < source.CertChainInfo.length; i++) {
                this.CertChainInfo[i] = new CertBasicInfo(source.CertChainInfo[i]);
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
        this.setParamArrayObj(map, prefix + "CertChainInfo.", this.CertChainInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

