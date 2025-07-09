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

public class Certificates extends AbstractModel {

    /**
    * User uin.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Project id.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Certificate source:.
trustasia.
upload.
wosign.
sheca.
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Certificate package type:.
Null: user uploads a certificate (without package type),.
2: trustasia tls rsa ca,. 
3: securesite enhanced enterprise edition (ev pro),. 
4: securesite enhanced (ev). 
5: securesite enterprise professional edition (ov pro).
6: securesite enterprise (ov). 
7: securesite enterprise (ov) wildcard. 
8: geotrust enhanced (ev). 
9: geotrust enterprise (ov) cert. 
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
24: globalsign enhanced multiple domain name (ev) ssl certificate.
25: wotrus domain name cert.
26: wotrus domain name multiple domain name cert.
27: wotrus domain name wildcard cert.
28: wotrus enterprise cert.
29: wotrus enterprise multi - domain name certificate.
30: wotrus enterprise wildcard certificate.
31: wotrus enhanced certificate.
32: wotrus enhanced multi - domain name certificate.
33: wotrus - national cryptography domain - type certificate.
34: wotrus-national cryptography domain certificate (multiple domain names).
35: wotrus-national cryptography domain certificate (wildcard).
37: wotrus-national cryptography enterprise certificate.
38: wotrus-national cryptography enterprise certificate (multiple domain names).
39: wotrus-national cryptography enterprise certificate (wildcard).
40: wotrus - enhanced national cryptography certificate.
41: wotrus - enhanced national cryptography certificate (multiple domain names).
42: trustasia - domain name type certificate (wildcard multiple domain names).
43: DNSPod - enterprise (ov) ssl certificate.
44: DNSPod - enterprise (ov) wildcard ssl certificate.
45: DNSPod - enterprise (ov) multiple domain names ssl certificate.
46: DNSPod - enhanced (ev) ssl certificate.
47: DNSPod - enhanced (ev) multiple domain names ssl certificate.
48: DNSPod - domain name-based (dv) ssl certificate.
49: DNSPod - domain name-based (dv) wildcard ssl certificate.
50: DNSPod - domain name-based (dv) multiple domain names ssl certificate.
51: DNSPod (national cryptography) - enterprise (ov) ssl certificate.
52: DNSPod (national cryptography) - enterprise (ov) wildcard ssl certificate.
53: DNSPod (national cryptography) - enterprise (ov) multiple domain names ssl certificate.
54: DNSPod (national cryptography) - domain name-based (dv) ssl certificate.
55: DNSPod (national cryptography) - domain name-based (dv) wildcard ssl certificate.
56: DNSPod (national cryptography) - domain name-based (dv) multiple domain names ssl certificate.
57: securesite enterprise professional edition multiple domain names (ov pro).
58: securesite enterprise multiple domain names (ov).
59: securesite enhanced professional edition multiple domain names (ev pro).
60: securesite enhanced multiple domain names (ev).
61: geotrust enhanced multiple domain names (ev).
75: securesite enterprise (ov).
76: securesite enterprise (ov) wildcard.
77: securesite enhanced (ev).
78: geotrust enterprise (ov).
79: geotrust enterprise wildcard (ov).
80: geotrust enhanced (ev).
81: globalsign enterprise (ov) ssl certificate.
82: globalsign enterprise wildcard (ov) ssl certificate.
83: trustasia c1 dv free.
85: globalsign enhanced (ev) ssl certificate.
88: globalsign enterprise wildcard multiple domain names (ov) ssl certificate.
89: globalsign enterprise multiple domain names (ov) ssl certificate.
90: globalsign enhanced multiple domain names (ev) ssl certificate.
91: geotrust enhanced multiple domain names (ev).
92: securesite enterprise pro multiple domain names (ov pro).
93: securesite enterprise multiple domain names (ov).
94: securesite enhanced pro multiple domain names (ev pro).
95: securesite enhanced multiple domain names (ev).
96: securesite ev pro.
97: securesite enterprise professional edition (ov pro).
98: cfca enterprise (ov) ssl certificate.
99: cfca enterprise ov ssl certificate for multiple domain names.
100: cfca ov wildcard ssl certificate.
101: cfca enhanced (ev) ssl certificate.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Certificate type. ca = client certificate; svr = server certificate.
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * Certificate product name.
    */
    @SerializedName("ProductZhName")
    @Expose
    private String ProductZhName;

    /**
    * Primary domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Remark name.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Certificate status: 0 = under review, 1 = approved, 2 = review failed, 3 = expired, 4 = dns record added automatically, 5 = enterprise certificate, pending documentation submission, 6 = order cancellation in progress, 7 = canceled, 8 = documents submitted, pending upload of confirmation letter, 9 = certificate revocation in progress, 10 = revoked, 11 = reissue in progress, 12 = pending upload of revocation confirmation letter, 13 = free certificate pending documentation submission, 14 = certificate refunded, 15 = certificate migration in progress.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Certificate extended information.
    */
    @SerializedName("CertificateExtra")
    @Expose
    private CertificateExtra CertificateExtra;

    /**
    * Vulnerability scanning status: INACTIVE = not enabled, ACTIVE = enabled.
    */
    @SerializedName("VulnerabilityStatus")
    @Expose
    private String VulnerabilityStatus;

    /**
    * Status information.
    */
    @SerializedName("StatusMsg")
    @Expose
    private String StatusMsg;

    /**
    * Validation type: DNS_AUTO = automatic dns validation, DNS = manual dns validation, FILE = file verification, DNS_PROXY = dns proxy validation, FILE_PROXY = file proxy verification.
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * Certificate validation time.
    */
    @SerializedName("CertBeginTime")
    @Expose
    private String CertBeginTime;

    /**
    * Certificate expiration time.
    */
    @SerializedName("CertEndTime")
    @Expose
    private String CertEndTime;

    /**
    * Certificate validity period (month).
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * Creation time.
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * Certificate id.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Multiple domain names contained in the certificate (including the primary domain name).
    */
    @SerializedName("SubjectAltName")
    @Expose
    private String [] SubjectAltName;

    /**
    * Certificate type name.
    */
    @SerializedName("PackageTypeName")
    @Expose
    private String PackageTypeName;

    /**
    * Status name.
    */
    @SerializedName("StatusName")
    @Expose
    private String StatusName;

    /**
    * Specifies whether the customer is a vip customer. true indicates yes and false indicates no.
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * Specifies whether it is a dv version certificate. true indicates yes and false indicates no.
    */
    @SerializedName("IsDv")
    @Expose
    private Boolean IsDv;

    /**
    * Specifies whether it is a wildcard domain name certificate. true indicates yes and false indicates no.
    */
    @SerializedName("IsWildcard")
    @Expose
    private Boolean IsWildcard;

    /**
    * Whether the vulnerability scanning feature is enabled.
    */
    @SerializedName("IsVulnerability")
    @Expose
    private Boolean IsVulnerability;

    /**
    * Whether it is renewable.
    */
    @SerializedName("RenewAble")
    @Expose
    private Boolean RenewAble;

    /**
    * Project information.
    */
    @SerializedName("ProjectInfo")
    @Expose
    private ProjectInfo ProjectInfo;

    /**
    * Associated cloud resources are temporarily unavailable.
    */
    @SerializedName("BoundResource")
    @Expose
    private String [] BoundResource;

    /**
    * Whether it can be deployed.
    */
    @SerializedName("Deployable")
    @Expose
    private Boolean Deployable;

    /**
    * Tag list.
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * Whether expiration notice has been ignored.
    */
    @SerializedName("IsIgnore")
    @Expose
    private Boolean IsIgnore;

    /**
    * Whether it is a China SM certificate.
    */
    @SerializedName("IsSM")
    @Expose
    private Boolean IsSM;

    /**
    * Certificate algorithm.
    */
    @SerializedName("EncryptAlgorithm")
    @Expose
    private String EncryptAlgorithm;

    /**
    * Encryption algorithm for upload ca certificate.
    */
    @SerializedName("CAEncryptAlgorithms")
    @Expose
    private String [] CAEncryptAlgorithms;

    /**
    * Expiration time for upload ca certificate.
    */
    @SerializedName("CAEndTimes")
    @Expose
    private String [] CAEndTimes;

    /**
    * Common name of the upload ca certificate.
    */
    @SerializedName("CACommonNames")
    @Expose
    private String [] CACommonNames;

    /**
    * Certificate prereview information.
    */
    @SerializedName("PreAuditInfo")
    @Expose
    private PreAuditInfo PreAuditInfo;

    /**
    * Whether to auto-renew.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Hosting status: 0, hosting; 5, resource replacement; 10, hosting completed; -1, not hosted. 
    */
    @SerializedName("HostingStatus")
    @Expose
    private Long HostingStatus;

    /**
    * Hosting completion time.
    */
    @SerializedName("HostingCompleteTime")
    @Expose
    private String HostingCompleteTime;

    /**
    * Manage the new certificate id.
    */
    @SerializedName("HostingRenewCertId")
    @Expose
    private String HostingRenewCertId;

    /**
    * Existing renewal certificate id.
    */
    @SerializedName("HasRenewOrder")
    @Expose
    private String HasRenewOrder;

    /**
    * Indicates whether the original certificate is deleted during reissue.
    */
    @SerializedName("ReplaceOriCertIsDelete")
    @Expose
    private Boolean ReplaceOriCertIsDelete;

    /**
    * Indicates whether it is about to expire. a certificate is about to expire if it will expire within 30 days.
    */
    @SerializedName("IsExpiring")
    @Expose
    private Boolean IsExpiring;

    /**
    * Add validation expiration date for DV certificate
    */
    @SerializedName("DVAuthDeadline")
    @Expose
    private String DVAuthDeadline;

    /**
    * Domain verification passed time.
    */
    @SerializedName("ValidationPassedTime")
    @Expose
    private String ValidationPassedTime;

    /**
    * Multiple domain names associated with the certificate.
    */
    @SerializedName("CertSANs")
    @Expose
    private String [] CertSANs;

    /**
    * Domain verification rejection information.
    */
    @SerializedName("AwaitingValidationMsg")
    @Expose
    private String AwaitingValidationMsg;

    /**
    * Whether to allow downloading.
    */
    @SerializedName("AllowDownload")
    @Expose
    private Boolean AllowDownload;

    /**
    * Whether all certificate domain names are managed and resolved by dnspod.
    */
    @SerializedName("IsDNSPODResolve")
    @Expose
    private Boolean IsDNSPODResolve;

    /**
    * Whether the certificate is purchased with benefit points.
    */
    @SerializedName("IsPackage")
    @Expose
    private Boolean IsPackage;

    /**
    * Whether there is a private key password.
    */
    @SerializedName("KeyPasswordCustomFlag")
    @Expose
    private Boolean KeyPasswordCustomFlag;

    /**
    * Types of web servers supported for download: nginx, apache, iis, tomcat, jks, root, other.
    */
    @SerializedName("SupportDownloadType")
    @Expose
    private SupportDownloadType SupportDownloadType;

    /**
    * Certificate revocation completion time.
    */
    @SerializedName("CertRevokedTime")
    @Expose
    private String CertRevokedTime;

    /**
    * Hosted resource type list.
    */
    @SerializedName("HostingResourceTypes")
    @Expose
    private String [] HostingResourceTypes;

    /**
    * Managed configuration information.
    */
    @SerializedName("HostingConfig")
    @Expose
    private HostingConfig HostingConfig;

    /**
     * Get User uin. 
     * @return OwnerUin User uin.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set User uin.
     * @param OwnerUin User uin.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Project id. 
     * @return ProjectId Project id.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project id.
     * @param ProjectId Project id.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Certificate source:.
trustasia.
upload.
wosign.
sheca. 
     * @return From Certificate source:.
trustasia.
upload.
wosign.
sheca.
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Certificate source:.
trustasia.
upload.
wosign.
sheca.
     * @param From Certificate source:.
trustasia.
upload.
wosign.
sheca.
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Certificate package type:.
Null: user uploads a certificate (without package type),.
2: trustasia tls rsa ca,. 
3: securesite enhanced enterprise edition (ev pro),. 
4: securesite enhanced (ev). 
5: securesite enterprise professional edition (ov pro).
6: securesite enterprise (ov). 
7: securesite enterprise (ov) wildcard. 
8: geotrust enhanced (ev). 
9: geotrust enterprise (ov) cert. 
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
24: globalsign enhanced multiple domain name (ev) ssl certificate.
25: wotrus domain name cert.
26: wotrus domain name multiple domain name cert.
27: wotrus domain name wildcard cert.
28: wotrus enterprise cert.
29: wotrus enterprise multi - domain name certificate.
30: wotrus enterprise wildcard certificate.
31: wotrus enhanced certificate.
32: wotrus enhanced multi - domain name certificate.
33: wotrus - national cryptography domain - type certificate.
34: wotrus-national cryptography domain certificate (multiple domain names).
35: wotrus-national cryptography domain certificate (wildcard).
37: wotrus-national cryptography enterprise certificate.
38: wotrus-national cryptography enterprise certificate (multiple domain names).
39: wotrus-national cryptography enterprise certificate (wildcard).
40: wotrus - enhanced national cryptography certificate.
41: wotrus - enhanced national cryptography certificate (multiple domain names).
42: trustasia - domain name type certificate (wildcard multiple domain names).
43: DNSPod - enterprise (ov) ssl certificate.
44: DNSPod - enterprise (ov) wildcard ssl certificate.
45: DNSPod - enterprise (ov) multiple domain names ssl certificate.
46: DNSPod - enhanced (ev) ssl certificate.
47: DNSPod - enhanced (ev) multiple domain names ssl certificate.
48: DNSPod - domain name-based (dv) ssl certificate.
49: DNSPod - domain name-based (dv) wildcard ssl certificate.
50: DNSPod - domain name-based (dv) multiple domain names ssl certificate.
51: DNSPod (national cryptography) - enterprise (ov) ssl certificate.
52: DNSPod (national cryptography) - enterprise (ov) wildcard ssl certificate.
53: DNSPod (national cryptography) - enterprise (ov) multiple domain names ssl certificate.
54: DNSPod (national cryptography) - domain name-based (dv) ssl certificate.
55: DNSPod (national cryptography) - domain name-based (dv) wildcard ssl certificate.
56: DNSPod (national cryptography) - domain name-based (dv) multiple domain names ssl certificate.
57: securesite enterprise professional edition multiple domain names (ov pro).
58: securesite enterprise multiple domain names (ov).
59: securesite enhanced professional edition multiple domain names (ev pro).
60: securesite enhanced multiple domain names (ev).
61: geotrust enhanced multiple domain names (ev).
75: securesite enterprise (ov).
76: securesite enterprise (ov) wildcard.
77: securesite enhanced (ev).
78: geotrust enterprise (ov).
79: geotrust enterprise wildcard (ov).
80: geotrust enhanced (ev).
81: globalsign enterprise (ov) ssl certificate.
82: globalsign enterprise wildcard (ov) ssl certificate.
83: trustasia c1 dv free.
85: globalsign enhanced (ev) ssl certificate.
88: globalsign enterprise wildcard multiple domain names (ov) ssl certificate.
89: globalsign enterprise multiple domain names (ov) ssl certificate.
90: globalsign enhanced multiple domain names (ev) ssl certificate.
91: geotrust enhanced multiple domain names (ev).
92: securesite enterprise pro multiple domain names (ov pro).
93: securesite enterprise multiple domain names (ov).
94: securesite enhanced pro multiple domain names (ev pro).
95: securesite enhanced multiple domain names (ev).
96: securesite ev pro.
97: securesite enterprise professional edition (ov pro).
98: cfca enterprise (ov) ssl certificate.
99: cfca enterprise ov ssl certificate for multiple domain names.
100: cfca ov wildcard ssl certificate.
101: cfca enhanced (ev) ssl certificate. 
     * @return PackageType Certificate package type:.
Null: user uploads a certificate (without package type),.
2: trustasia tls rsa ca,. 
3: securesite enhanced enterprise edition (ev pro),. 
4: securesite enhanced (ev). 
5: securesite enterprise professional edition (ov pro).
6: securesite enterprise (ov). 
7: securesite enterprise (ov) wildcard. 
8: geotrust enhanced (ev). 
9: geotrust enterprise (ov) cert. 
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
24: globalsign enhanced multiple domain name (ev) ssl certificate.
25: wotrus domain name cert.
26: wotrus domain name multiple domain name cert.
27: wotrus domain name wildcard cert.
28: wotrus enterprise cert.
29: wotrus enterprise multi - domain name certificate.
30: wotrus enterprise wildcard certificate.
31: wotrus enhanced certificate.
32: wotrus enhanced multi - domain name certificate.
33: wotrus - national cryptography domain - type certificate.
34: wotrus-national cryptography domain certificate (multiple domain names).
35: wotrus-national cryptography domain certificate (wildcard).
37: wotrus-national cryptography enterprise certificate.
38: wotrus-national cryptography enterprise certificate (multiple domain names).
39: wotrus-national cryptography enterprise certificate (wildcard).
40: wotrus - enhanced national cryptography certificate.
41: wotrus - enhanced national cryptography certificate (multiple domain names).
42: trustasia - domain name type certificate (wildcard multiple domain names).
43: DNSPod - enterprise (ov) ssl certificate.
44: DNSPod - enterprise (ov) wildcard ssl certificate.
45: DNSPod - enterprise (ov) multiple domain names ssl certificate.
46: DNSPod - enhanced (ev) ssl certificate.
47: DNSPod - enhanced (ev) multiple domain names ssl certificate.
48: DNSPod - domain name-based (dv) ssl certificate.
49: DNSPod - domain name-based (dv) wildcard ssl certificate.
50: DNSPod - domain name-based (dv) multiple domain names ssl certificate.
51: DNSPod (national cryptography) - enterprise (ov) ssl certificate.
52: DNSPod (national cryptography) - enterprise (ov) wildcard ssl certificate.
53: DNSPod (national cryptography) - enterprise (ov) multiple domain names ssl certificate.
54: DNSPod (national cryptography) - domain name-based (dv) ssl certificate.
55: DNSPod (national cryptography) - domain name-based (dv) wildcard ssl certificate.
56: DNSPod (national cryptography) - domain name-based (dv) multiple domain names ssl certificate.
57: securesite enterprise professional edition multiple domain names (ov pro).
58: securesite enterprise multiple domain names (ov).
59: securesite enhanced professional edition multiple domain names (ev pro).
60: securesite enhanced multiple domain names (ev).
61: geotrust enhanced multiple domain names (ev).
75: securesite enterprise (ov).
76: securesite enterprise (ov) wildcard.
77: securesite enhanced (ev).
78: geotrust enterprise (ov).
79: geotrust enterprise wildcard (ov).
80: geotrust enhanced (ev).
81: globalsign enterprise (ov) ssl certificate.
82: globalsign enterprise wildcard (ov) ssl certificate.
83: trustasia c1 dv free.
85: globalsign enhanced (ev) ssl certificate.
88: globalsign enterprise wildcard multiple domain names (ov) ssl certificate.
89: globalsign enterprise multiple domain names (ov) ssl certificate.
90: globalsign enhanced multiple domain names (ev) ssl certificate.
91: geotrust enhanced multiple domain names (ev).
92: securesite enterprise pro multiple domain names (ov pro).
93: securesite enterprise multiple domain names (ov).
94: securesite enhanced pro multiple domain names (ev pro).
95: securesite enhanced multiple domain names (ev).
96: securesite ev pro.
97: securesite enterprise professional edition (ov pro).
98: cfca enterprise (ov) ssl certificate.
99: cfca enterprise ov ssl certificate for multiple domain names.
100: cfca ov wildcard ssl certificate.
101: cfca enhanced (ev) ssl certificate.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Certificate package type:.
Null: user uploads a certificate (without package type),.
2: trustasia tls rsa ca,. 
3: securesite enhanced enterprise edition (ev pro),. 
4: securesite enhanced (ev). 
5: securesite enterprise professional edition (ov pro).
6: securesite enterprise (ov). 
7: securesite enterprise (ov) wildcard. 
8: geotrust enhanced (ev). 
9: geotrust enterprise (ov) cert. 
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
24: globalsign enhanced multiple domain name (ev) ssl certificate.
25: wotrus domain name cert.
26: wotrus domain name multiple domain name cert.
27: wotrus domain name wildcard cert.
28: wotrus enterprise cert.
29: wotrus enterprise multi - domain name certificate.
30: wotrus enterprise wildcard certificate.
31: wotrus enhanced certificate.
32: wotrus enhanced multi - domain name certificate.
33: wotrus - national cryptography domain - type certificate.
34: wotrus-national cryptography domain certificate (multiple domain names).
35: wotrus-national cryptography domain certificate (wildcard).
37: wotrus-national cryptography enterprise certificate.
38: wotrus-national cryptography enterprise certificate (multiple domain names).
39: wotrus-national cryptography enterprise certificate (wildcard).
40: wotrus - enhanced national cryptography certificate.
41: wotrus - enhanced national cryptography certificate (multiple domain names).
42: trustasia - domain name type certificate (wildcard multiple domain names).
43: DNSPod - enterprise (ov) ssl certificate.
44: DNSPod - enterprise (ov) wildcard ssl certificate.
45: DNSPod - enterprise (ov) multiple domain names ssl certificate.
46: DNSPod - enhanced (ev) ssl certificate.
47: DNSPod - enhanced (ev) multiple domain names ssl certificate.
48: DNSPod - domain name-based (dv) ssl certificate.
49: DNSPod - domain name-based (dv) wildcard ssl certificate.
50: DNSPod - domain name-based (dv) multiple domain names ssl certificate.
51: DNSPod (national cryptography) - enterprise (ov) ssl certificate.
52: DNSPod (national cryptography) - enterprise (ov) wildcard ssl certificate.
53: DNSPod (national cryptography) - enterprise (ov) multiple domain names ssl certificate.
54: DNSPod (national cryptography) - domain name-based (dv) ssl certificate.
55: DNSPod (national cryptography) - domain name-based (dv) wildcard ssl certificate.
56: DNSPod (national cryptography) - domain name-based (dv) multiple domain names ssl certificate.
57: securesite enterprise professional edition multiple domain names (ov pro).
58: securesite enterprise multiple domain names (ov).
59: securesite enhanced professional edition multiple domain names (ev pro).
60: securesite enhanced multiple domain names (ev).
61: geotrust enhanced multiple domain names (ev).
75: securesite enterprise (ov).
76: securesite enterprise (ov) wildcard.
77: securesite enhanced (ev).
78: geotrust enterprise (ov).
79: geotrust enterprise wildcard (ov).
80: geotrust enhanced (ev).
81: globalsign enterprise (ov) ssl certificate.
82: globalsign enterprise wildcard (ov) ssl certificate.
83: trustasia c1 dv free.
85: globalsign enhanced (ev) ssl certificate.
88: globalsign enterprise wildcard multiple domain names (ov) ssl certificate.
89: globalsign enterprise multiple domain names (ov) ssl certificate.
90: globalsign enhanced multiple domain names (ev) ssl certificate.
91: geotrust enhanced multiple domain names (ev).
92: securesite enterprise pro multiple domain names (ov pro).
93: securesite enterprise multiple domain names (ov).
94: securesite enhanced pro multiple domain names (ev pro).
95: securesite enhanced multiple domain names (ev).
96: securesite ev pro.
97: securesite enterprise professional edition (ov pro).
98: cfca enterprise (ov) ssl certificate.
99: cfca enterprise ov ssl certificate for multiple domain names.
100: cfca ov wildcard ssl certificate.
101: cfca enhanced (ev) ssl certificate.
     * @param PackageType Certificate package type:.
Null: user uploads a certificate (without package type),.
2: trustasia tls rsa ca,. 
3: securesite enhanced enterprise edition (ev pro),. 
4: securesite enhanced (ev). 
5: securesite enterprise professional edition (ov pro).
6: securesite enterprise (ov). 
7: securesite enterprise (ov) wildcard. 
8: geotrust enhanced (ev). 
9: geotrust enterprise (ov) cert. 
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
24: globalsign enhanced multiple domain name (ev) ssl certificate.
25: wotrus domain name cert.
26: wotrus domain name multiple domain name cert.
27: wotrus domain name wildcard cert.
28: wotrus enterprise cert.
29: wotrus enterprise multi - domain name certificate.
30: wotrus enterprise wildcard certificate.
31: wotrus enhanced certificate.
32: wotrus enhanced multi - domain name certificate.
33: wotrus - national cryptography domain - type certificate.
34: wotrus-national cryptography domain certificate (multiple domain names).
35: wotrus-national cryptography domain certificate (wildcard).
37: wotrus-national cryptography enterprise certificate.
38: wotrus-national cryptography enterprise certificate (multiple domain names).
39: wotrus-national cryptography enterprise certificate (wildcard).
40: wotrus - enhanced national cryptography certificate.
41: wotrus - enhanced national cryptography certificate (multiple domain names).
42: trustasia - domain name type certificate (wildcard multiple domain names).
43: DNSPod - enterprise (ov) ssl certificate.
44: DNSPod - enterprise (ov) wildcard ssl certificate.
45: DNSPod - enterprise (ov) multiple domain names ssl certificate.
46: DNSPod - enhanced (ev) ssl certificate.
47: DNSPod - enhanced (ev) multiple domain names ssl certificate.
48: DNSPod - domain name-based (dv) ssl certificate.
49: DNSPod - domain name-based (dv) wildcard ssl certificate.
50: DNSPod - domain name-based (dv) multiple domain names ssl certificate.
51: DNSPod (national cryptography) - enterprise (ov) ssl certificate.
52: DNSPod (national cryptography) - enterprise (ov) wildcard ssl certificate.
53: DNSPod (national cryptography) - enterprise (ov) multiple domain names ssl certificate.
54: DNSPod (national cryptography) - domain name-based (dv) ssl certificate.
55: DNSPod (national cryptography) - domain name-based (dv) wildcard ssl certificate.
56: DNSPod (national cryptography) - domain name-based (dv) multiple domain names ssl certificate.
57: securesite enterprise professional edition multiple domain names (ov pro).
58: securesite enterprise multiple domain names (ov).
59: securesite enhanced professional edition multiple domain names (ev pro).
60: securesite enhanced multiple domain names (ev).
61: geotrust enhanced multiple domain names (ev).
75: securesite enterprise (ov).
76: securesite enterprise (ov) wildcard.
77: securesite enhanced (ev).
78: geotrust enterprise (ov).
79: geotrust enterprise wildcard (ov).
80: geotrust enhanced (ev).
81: globalsign enterprise (ov) ssl certificate.
82: globalsign enterprise wildcard (ov) ssl certificate.
83: trustasia c1 dv free.
85: globalsign enhanced (ev) ssl certificate.
88: globalsign enterprise wildcard multiple domain names (ov) ssl certificate.
89: globalsign enterprise multiple domain names (ov) ssl certificate.
90: globalsign enhanced multiple domain names (ev) ssl certificate.
91: geotrust enhanced multiple domain names (ev).
92: securesite enterprise pro multiple domain names (ov pro).
93: securesite enterprise multiple domain names (ov).
94: securesite enhanced pro multiple domain names (ev pro).
95: securesite enhanced multiple domain names (ev).
96: securesite ev pro.
97: securesite enterprise professional edition (ov pro).
98: cfca enterprise (ov) ssl certificate.
99: cfca enterprise ov ssl certificate for multiple domain names.
100: cfca ov wildcard ssl certificate.
101: cfca enhanced (ev) ssl certificate.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Certificate type. ca = client certificate; svr = server certificate. 
     * @return CertificateType Certificate type. ca = client certificate; svr = server certificate.
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set Certificate type. ca = client certificate; svr = server certificate.
     * @param CertificateType Certificate type. ca = client certificate; svr = server certificate.
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get Certificate product name. 
     * @return ProductZhName Certificate product name.
     */
    public String getProductZhName() {
        return this.ProductZhName;
    }

    /**
     * Set Certificate product name.
     * @param ProductZhName Certificate product name.
     */
    public void setProductZhName(String ProductZhName) {
        this.ProductZhName = ProductZhName;
    }

    /**
     * Get Primary domain name. 
     * @return Domain Primary domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Primary domain name.
     * @param Domain Primary domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Remark name. 
     * @return Alias Remark name.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Remark name.
     * @param Alias Remark name.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Certificate status: 0 = under review, 1 = approved, 2 = review failed, 3 = expired, 4 = dns record added automatically, 5 = enterprise certificate, pending documentation submission, 6 = order cancellation in progress, 7 = canceled, 8 = documents submitted, pending upload of confirmation letter, 9 = certificate revocation in progress, 10 = revoked, 11 = reissue in progress, 12 = pending upload of revocation confirmation letter, 13 = free certificate pending documentation submission, 14 = certificate refunded, 15 = certificate migration in progress. 
     * @return Status Certificate status: 0 = under review, 1 = approved, 2 = review failed, 3 = expired, 4 = dns record added automatically, 5 = enterprise certificate, pending documentation submission, 6 = order cancellation in progress, 7 = canceled, 8 = documents submitted, pending upload of confirmation letter, 9 = certificate revocation in progress, 10 = revoked, 11 = reissue in progress, 12 = pending upload of revocation confirmation letter, 13 = free certificate pending documentation submission, 14 = certificate refunded, 15 = certificate migration in progress.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Certificate status: 0 = under review, 1 = approved, 2 = review failed, 3 = expired, 4 = dns record added automatically, 5 = enterprise certificate, pending documentation submission, 6 = order cancellation in progress, 7 = canceled, 8 = documents submitted, pending upload of confirmation letter, 9 = certificate revocation in progress, 10 = revoked, 11 = reissue in progress, 12 = pending upload of revocation confirmation letter, 13 = free certificate pending documentation submission, 14 = certificate refunded, 15 = certificate migration in progress.
     * @param Status Certificate status: 0 = under review, 1 = approved, 2 = review failed, 3 = expired, 4 = dns record added automatically, 5 = enterprise certificate, pending documentation submission, 6 = order cancellation in progress, 7 = canceled, 8 = documents submitted, pending upload of confirmation letter, 9 = certificate revocation in progress, 10 = revoked, 11 = reissue in progress, 12 = pending upload of revocation confirmation letter, 13 = free certificate pending documentation submission, 14 = certificate refunded, 15 = certificate migration in progress.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Certificate extended information. 
     * @return CertificateExtra Certificate extended information.
     */
    public CertificateExtra getCertificateExtra() {
        return this.CertificateExtra;
    }

    /**
     * Set Certificate extended information.
     * @param CertificateExtra Certificate extended information.
     */
    public void setCertificateExtra(CertificateExtra CertificateExtra) {
        this.CertificateExtra = CertificateExtra;
    }

    /**
     * Get Vulnerability scanning status: INACTIVE = not enabled, ACTIVE = enabled. 
     * @return VulnerabilityStatus Vulnerability scanning status: INACTIVE = not enabled, ACTIVE = enabled.
     */
    public String getVulnerabilityStatus() {
        return this.VulnerabilityStatus;
    }

    /**
     * Set Vulnerability scanning status: INACTIVE = not enabled, ACTIVE = enabled.
     * @param VulnerabilityStatus Vulnerability scanning status: INACTIVE = not enabled, ACTIVE = enabled.
     */
    public void setVulnerabilityStatus(String VulnerabilityStatus) {
        this.VulnerabilityStatus = VulnerabilityStatus;
    }

    /**
     * Get Status information. 
     * @return StatusMsg Status information.
     */
    public String getStatusMsg() {
        return this.StatusMsg;
    }

    /**
     * Set Status information.
     * @param StatusMsg Status information.
     */
    public void setStatusMsg(String StatusMsg) {
        this.StatusMsg = StatusMsg;
    }

    /**
     * Get Validation type: DNS_AUTO = automatic dns validation, DNS = manual dns validation, FILE = file verification, DNS_PROXY = dns proxy validation, FILE_PROXY = file proxy verification. 
     * @return VerifyType Validation type: DNS_AUTO = automatic dns validation, DNS = manual dns validation, FILE = file verification, DNS_PROXY = dns proxy validation, FILE_PROXY = file proxy verification.
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set Validation type: DNS_AUTO = automatic dns validation, DNS = manual dns validation, FILE = file verification, DNS_PROXY = dns proxy validation, FILE_PROXY = file proxy verification.
     * @param VerifyType Validation type: DNS_AUTO = automatic dns validation, DNS = manual dns validation, FILE = file verification, DNS_PROXY = dns proxy validation, FILE_PROXY = file proxy verification.
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get Certificate validation time. 
     * @return CertBeginTime Certificate validation time.
     */
    public String getCertBeginTime() {
        return this.CertBeginTime;
    }

    /**
     * Set Certificate validation time.
     * @param CertBeginTime Certificate validation time.
     */
    public void setCertBeginTime(String CertBeginTime) {
        this.CertBeginTime = CertBeginTime;
    }

    /**
     * Get Certificate expiration time. 
     * @return CertEndTime Certificate expiration time.
     */
    public String getCertEndTime() {
        return this.CertEndTime;
    }

    /**
     * Set Certificate expiration time.
     * @param CertEndTime Certificate expiration time.
     */
    public void setCertEndTime(String CertEndTime) {
        this.CertEndTime = CertEndTime;
    }

    /**
     * Get Certificate validity period (month). 
     * @return ValidityPeriod Certificate validity period (month).
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set Certificate validity period (month).
     * @param ValidityPeriod Certificate validity period (month).
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get Creation time. 
     * @return InsertTime Creation time.
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Creation time.
     * @param InsertTime Creation time.
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get Certificate id. 
     * @return CertificateId Certificate id.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Certificate id.
     * @param CertificateId Certificate id.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Multiple domain names contained in the certificate (including the primary domain name). 
     * @return SubjectAltName Multiple domain names contained in the certificate (including the primary domain name).
     */
    public String [] getSubjectAltName() {
        return this.SubjectAltName;
    }

    /**
     * Set Multiple domain names contained in the certificate (including the primary domain name).
     * @param SubjectAltName Multiple domain names contained in the certificate (including the primary domain name).
     */
    public void setSubjectAltName(String [] SubjectAltName) {
        this.SubjectAltName = SubjectAltName;
    }

    /**
     * Get Certificate type name. 
     * @return PackageTypeName Certificate type name.
     */
    public String getPackageTypeName() {
        return this.PackageTypeName;
    }

    /**
     * Set Certificate type name.
     * @param PackageTypeName Certificate type name.
     */
    public void setPackageTypeName(String PackageTypeName) {
        this.PackageTypeName = PackageTypeName;
    }

    /**
     * Get Status name. 
     * @return StatusName Status name.
     */
    public String getStatusName() {
        return this.StatusName;
    }

    /**
     * Set Status name.
     * @param StatusName Status name.
     */
    public void setStatusName(String StatusName) {
        this.StatusName = StatusName;
    }

    /**
     * Get Specifies whether the customer is a vip customer. true indicates yes and false indicates no. 
     * @return IsVip Specifies whether the customer is a vip customer. true indicates yes and false indicates no.
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set Specifies whether the customer is a vip customer. true indicates yes and false indicates no.
     * @param IsVip Specifies whether the customer is a vip customer. true indicates yes and false indicates no.
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get Specifies whether it is a dv version certificate. true indicates yes and false indicates no. 
     * @return IsDv Specifies whether it is a dv version certificate. true indicates yes and false indicates no.
     */
    public Boolean getIsDv() {
        return this.IsDv;
    }

    /**
     * Set Specifies whether it is a dv version certificate. true indicates yes and false indicates no.
     * @param IsDv Specifies whether it is a dv version certificate. true indicates yes and false indicates no.
     */
    public void setIsDv(Boolean IsDv) {
        this.IsDv = IsDv;
    }

    /**
     * Get Specifies whether it is a wildcard domain name certificate. true indicates yes and false indicates no. 
     * @return IsWildcard Specifies whether it is a wildcard domain name certificate. true indicates yes and false indicates no.
     */
    public Boolean getIsWildcard() {
        return this.IsWildcard;
    }

    /**
     * Set Specifies whether it is a wildcard domain name certificate. true indicates yes and false indicates no.
     * @param IsWildcard Specifies whether it is a wildcard domain name certificate. true indicates yes and false indicates no.
     */
    public void setIsWildcard(Boolean IsWildcard) {
        this.IsWildcard = IsWildcard;
    }

    /**
     * Get Whether the vulnerability scanning feature is enabled. 
     * @return IsVulnerability Whether the vulnerability scanning feature is enabled.
     */
    public Boolean getIsVulnerability() {
        return this.IsVulnerability;
    }

    /**
     * Set Whether the vulnerability scanning feature is enabled.
     * @param IsVulnerability Whether the vulnerability scanning feature is enabled.
     */
    public void setIsVulnerability(Boolean IsVulnerability) {
        this.IsVulnerability = IsVulnerability;
    }

    /**
     * Get Whether it is renewable. 
     * @return RenewAble Whether it is renewable.
     */
    public Boolean getRenewAble() {
        return this.RenewAble;
    }

    /**
     * Set Whether it is renewable.
     * @param RenewAble Whether it is renewable.
     */
    public void setRenewAble(Boolean RenewAble) {
        this.RenewAble = RenewAble;
    }

    /**
     * Get Project information. 
     * @return ProjectInfo Project information.
     */
    public ProjectInfo getProjectInfo() {
        return this.ProjectInfo;
    }

    /**
     * Set Project information.
     * @param ProjectInfo Project information.
     */
    public void setProjectInfo(ProjectInfo ProjectInfo) {
        this.ProjectInfo = ProjectInfo;
    }

    /**
     * Get Associated cloud resources are temporarily unavailable. 
     * @return BoundResource Associated cloud resources are temporarily unavailable.
     */
    public String [] getBoundResource() {
        return this.BoundResource;
    }

    /**
     * Set Associated cloud resources are temporarily unavailable.
     * @param BoundResource Associated cloud resources are temporarily unavailable.
     */
    public void setBoundResource(String [] BoundResource) {
        this.BoundResource = BoundResource;
    }

    /**
     * Get Whether it can be deployed. 
     * @return Deployable Whether it can be deployed.
     */
    public Boolean getDeployable() {
        return this.Deployable;
    }

    /**
     * Set Whether it can be deployed.
     * @param Deployable Whether it can be deployed.
     */
    public void setDeployable(Boolean Deployable) {
        this.Deployable = Deployable;
    }

    /**
     * Get Tag list. 
     * @return Tags Tag list.
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list.
     * @param Tags Tag list.
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether expiration notice has been ignored. 
     * @return IsIgnore Whether expiration notice has been ignored.
     */
    public Boolean getIsIgnore() {
        return this.IsIgnore;
    }

    /**
     * Set Whether expiration notice has been ignored.
     * @param IsIgnore Whether expiration notice has been ignored.
     */
    public void setIsIgnore(Boolean IsIgnore) {
        this.IsIgnore = IsIgnore;
    }

    /**
     * Get Whether it is a China SM certificate. 
     * @return IsSM Whether it is a China SM certificate.
     */
    public Boolean getIsSM() {
        return this.IsSM;
    }

    /**
     * Set Whether it is a China SM certificate.
     * @param IsSM Whether it is a China SM certificate.
     */
    public void setIsSM(Boolean IsSM) {
        this.IsSM = IsSM;
    }

    /**
     * Get Certificate algorithm. 
     * @return EncryptAlgorithm Certificate algorithm.
     */
    public String getEncryptAlgorithm() {
        return this.EncryptAlgorithm;
    }

    /**
     * Set Certificate algorithm.
     * @param EncryptAlgorithm Certificate algorithm.
     */
    public void setEncryptAlgorithm(String EncryptAlgorithm) {
        this.EncryptAlgorithm = EncryptAlgorithm;
    }

    /**
     * Get Encryption algorithm for upload ca certificate. 
     * @return CAEncryptAlgorithms Encryption algorithm for upload ca certificate.
     */
    public String [] getCAEncryptAlgorithms() {
        return this.CAEncryptAlgorithms;
    }

    /**
     * Set Encryption algorithm for upload ca certificate.
     * @param CAEncryptAlgorithms Encryption algorithm for upload ca certificate.
     */
    public void setCAEncryptAlgorithms(String [] CAEncryptAlgorithms) {
        this.CAEncryptAlgorithms = CAEncryptAlgorithms;
    }

    /**
     * Get Expiration time for upload ca certificate. 
     * @return CAEndTimes Expiration time for upload ca certificate.
     */
    public String [] getCAEndTimes() {
        return this.CAEndTimes;
    }

    /**
     * Set Expiration time for upload ca certificate.
     * @param CAEndTimes Expiration time for upload ca certificate.
     */
    public void setCAEndTimes(String [] CAEndTimes) {
        this.CAEndTimes = CAEndTimes;
    }

    /**
     * Get Common name of the upload ca certificate. 
     * @return CACommonNames Common name of the upload ca certificate.
     */
    public String [] getCACommonNames() {
        return this.CACommonNames;
    }

    /**
     * Set Common name of the upload ca certificate.
     * @param CACommonNames Common name of the upload ca certificate.
     */
    public void setCACommonNames(String [] CACommonNames) {
        this.CACommonNames = CACommonNames;
    }

    /**
     * Get Certificate prereview information. 
     * @return PreAuditInfo Certificate prereview information.
     */
    public PreAuditInfo getPreAuditInfo() {
        return this.PreAuditInfo;
    }

    /**
     * Set Certificate prereview information.
     * @param PreAuditInfo Certificate prereview information.
     */
    public void setPreAuditInfo(PreAuditInfo PreAuditInfo) {
        this.PreAuditInfo = PreAuditInfo;
    }

    /**
     * Get Whether to auto-renew. 
     * @return AutoRenewFlag Whether to auto-renew.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether to auto-renew.
     * @param AutoRenewFlag Whether to auto-renew.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Hosting status: 0, hosting; 5, resource replacement; 10, hosting completed; -1, not hosted.  
     * @return HostingStatus Hosting status: 0, hosting; 5, resource replacement; 10, hosting completed; -1, not hosted. 
     */
    public Long getHostingStatus() {
        return this.HostingStatus;
    }

    /**
     * Set Hosting status: 0, hosting; 5, resource replacement; 10, hosting completed; -1, not hosted. 
     * @param HostingStatus Hosting status: 0, hosting; 5, resource replacement; 10, hosting completed; -1, not hosted. 
     */
    public void setHostingStatus(Long HostingStatus) {
        this.HostingStatus = HostingStatus;
    }

    /**
     * Get Hosting completion time. 
     * @return HostingCompleteTime Hosting completion time.
     */
    public String getHostingCompleteTime() {
        return this.HostingCompleteTime;
    }

    /**
     * Set Hosting completion time.
     * @param HostingCompleteTime Hosting completion time.
     */
    public void setHostingCompleteTime(String HostingCompleteTime) {
        this.HostingCompleteTime = HostingCompleteTime;
    }

    /**
     * Get Manage the new certificate id. 
     * @return HostingRenewCertId Manage the new certificate id.
     */
    public String getHostingRenewCertId() {
        return this.HostingRenewCertId;
    }

    /**
     * Set Manage the new certificate id.
     * @param HostingRenewCertId Manage the new certificate id.
     */
    public void setHostingRenewCertId(String HostingRenewCertId) {
        this.HostingRenewCertId = HostingRenewCertId;
    }

    /**
     * Get Existing renewal certificate id. 
     * @return HasRenewOrder Existing renewal certificate id.
     */
    public String getHasRenewOrder() {
        return this.HasRenewOrder;
    }

    /**
     * Set Existing renewal certificate id.
     * @param HasRenewOrder Existing renewal certificate id.
     */
    public void setHasRenewOrder(String HasRenewOrder) {
        this.HasRenewOrder = HasRenewOrder;
    }

    /**
     * Get Indicates whether the original certificate is deleted during reissue. 
     * @return ReplaceOriCertIsDelete Indicates whether the original certificate is deleted during reissue.
     */
    public Boolean getReplaceOriCertIsDelete() {
        return this.ReplaceOriCertIsDelete;
    }

    /**
     * Set Indicates whether the original certificate is deleted during reissue.
     * @param ReplaceOriCertIsDelete Indicates whether the original certificate is deleted during reissue.
     */
    public void setReplaceOriCertIsDelete(Boolean ReplaceOriCertIsDelete) {
        this.ReplaceOriCertIsDelete = ReplaceOriCertIsDelete;
    }

    /**
     * Get Indicates whether it is about to expire. a certificate is about to expire if it will expire within 30 days. 
     * @return IsExpiring Indicates whether it is about to expire. a certificate is about to expire if it will expire within 30 days.
     */
    public Boolean getIsExpiring() {
        return this.IsExpiring;
    }

    /**
     * Set Indicates whether it is about to expire. a certificate is about to expire if it will expire within 30 days.
     * @param IsExpiring Indicates whether it is about to expire. a certificate is about to expire if it will expire within 30 days.
     */
    public void setIsExpiring(Boolean IsExpiring) {
        this.IsExpiring = IsExpiring;
    }

    /**
     * Get Add validation expiration date for DV certificate 
     * @return DVAuthDeadline Add validation expiration date for DV certificate
     */
    public String getDVAuthDeadline() {
        return this.DVAuthDeadline;
    }

    /**
     * Set Add validation expiration date for DV certificate
     * @param DVAuthDeadline Add validation expiration date for DV certificate
     */
    public void setDVAuthDeadline(String DVAuthDeadline) {
        this.DVAuthDeadline = DVAuthDeadline;
    }

    /**
     * Get Domain verification passed time. 
     * @return ValidationPassedTime Domain verification passed time.
     */
    public String getValidationPassedTime() {
        return this.ValidationPassedTime;
    }

    /**
     * Set Domain verification passed time.
     * @param ValidationPassedTime Domain verification passed time.
     */
    public void setValidationPassedTime(String ValidationPassedTime) {
        this.ValidationPassedTime = ValidationPassedTime;
    }

    /**
     * Get Multiple domain names associated with the certificate. 
     * @return CertSANs Multiple domain names associated with the certificate.
     */
    public String [] getCertSANs() {
        return this.CertSANs;
    }

    /**
     * Set Multiple domain names associated with the certificate.
     * @param CertSANs Multiple domain names associated with the certificate.
     */
    public void setCertSANs(String [] CertSANs) {
        this.CertSANs = CertSANs;
    }

    /**
     * Get Domain verification rejection information. 
     * @return AwaitingValidationMsg Domain verification rejection information.
     */
    public String getAwaitingValidationMsg() {
        return this.AwaitingValidationMsg;
    }

    /**
     * Set Domain verification rejection information.
     * @param AwaitingValidationMsg Domain verification rejection information.
     */
    public void setAwaitingValidationMsg(String AwaitingValidationMsg) {
        this.AwaitingValidationMsg = AwaitingValidationMsg;
    }

    /**
     * Get Whether to allow downloading. 
     * @return AllowDownload Whether to allow downloading.
     */
    public Boolean getAllowDownload() {
        return this.AllowDownload;
    }

    /**
     * Set Whether to allow downloading.
     * @param AllowDownload Whether to allow downloading.
     */
    public void setAllowDownload(Boolean AllowDownload) {
        this.AllowDownload = AllowDownload;
    }

    /**
     * Get Whether all certificate domain names are managed and resolved by dnspod. 
     * @return IsDNSPODResolve Whether all certificate domain names are managed and resolved by dnspod.
     */
    public Boolean getIsDNSPODResolve() {
        return this.IsDNSPODResolve;
    }

    /**
     * Set Whether all certificate domain names are managed and resolved by dnspod.
     * @param IsDNSPODResolve Whether all certificate domain names are managed and resolved by dnspod.
     */
    public void setIsDNSPODResolve(Boolean IsDNSPODResolve) {
        this.IsDNSPODResolve = IsDNSPODResolve;
    }

    /**
     * Get Whether the certificate is purchased with benefit points. 
     * @return IsPackage Whether the certificate is purchased with benefit points.
     */
    public Boolean getIsPackage() {
        return this.IsPackage;
    }

    /**
     * Set Whether the certificate is purchased with benefit points.
     * @param IsPackage Whether the certificate is purchased with benefit points.
     */
    public void setIsPackage(Boolean IsPackage) {
        this.IsPackage = IsPackage;
    }

    /**
     * Get Whether there is a private key password. 
     * @return KeyPasswordCustomFlag Whether there is a private key password.
     */
    public Boolean getKeyPasswordCustomFlag() {
        return this.KeyPasswordCustomFlag;
    }

    /**
     * Set Whether there is a private key password.
     * @param KeyPasswordCustomFlag Whether there is a private key password.
     */
    public void setKeyPasswordCustomFlag(Boolean KeyPasswordCustomFlag) {
        this.KeyPasswordCustomFlag = KeyPasswordCustomFlag;
    }

    /**
     * Get Types of web servers supported for download: nginx, apache, iis, tomcat, jks, root, other. 
     * @return SupportDownloadType Types of web servers supported for download: nginx, apache, iis, tomcat, jks, root, other.
     */
    public SupportDownloadType getSupportDownloadType() {
        return this.SupportDownloadType;
    }

    /**
     * Set Types of web servers supported for download: nginx, apache, iis, tomcat, jks, root, other.
     * @param SupportDownloadType Types of web servers supported for download: nginx, apache, iis, tomcat, jks, root, other.
     */
    public void setSupportDownloadType(SupportDownloadType SupportDownloadType) {
        this.SupportDownloadType = SupportDownloadType;
    }

    /**
     * Get Certificate revocation completion time. 
     * @return CertRevokedTime Certificate revocation completion time.
     */
    public String getCertRevokedTime() {
        return this.CertRevokedTime;
    }

    /**
     * Set Certificate revocation completion time.
     * @param CertRevokedTime Certificate revocation completion time.
     */
    public void setCertRevokedTime(String CertRevokedTime) {
        this.CertRevokedTime = CertRevokedTime;
    }

    /**
     * Get Hosted resource type list. 
     * @return HostingResourceTypes Hosted resource type list.
     */
    public String [] getHostingResourceTypes() {
        return this.HostingResourceTypes;
    }

    /**
     * Set Hosted resource type list.
     * @param HostingResourceTypes Hosted resource type list.
     */
    public void setHostingResourceTypes(String [] HostingResourceTypes) {
        this.HostingResourceTypes = HostingResourceTypes;
    }

    /**
     * Get Managed configuration information. 
     * @return HostingConfig Managed configuration information.
     */
    public HostingConfig getHostingConfig() {
        return this.HostingConfig;
    }

    /**
     * Set Managed configuration information.
     * @param HostingConfig Managed configuration information.
     */
    public void setHostingConfig(HostingConfig HostingConfig) {
        this.HostingConfig = HostingConfig;
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
        if (source.CertRevokedTime != null) {
            this.CertRevokedTime = new String(source.CertRevokedTime);
        }
        if (source.HostingResourceTypes != null) {
            this.HostingResourceTypes = new String[source.HostingResourceTypes.length];
            for (int i = 0; i < source.HostingResourceTypes.length; i++) {
                this.HostingResourceTypes[i] = new String(source.HostingResourceTypes[i]);
            }
        }
        if (source.HostingConfig != null) {
            this.HostingConfig = new HostingConfig(source.HostingConfig);
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
        this.setParamSimple(map, prefix + "CertRevokedTime", this.CertRevokedTime);
        this.setParamArraySimple(map, prefix + "HostingResourceTypes.", this.HostingResourceTypes);
        this.setParamObj(map, prefix + "HostingConfig.", this.HostingConfig);

    }
}

