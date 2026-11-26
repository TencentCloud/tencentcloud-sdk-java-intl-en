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

public class InferenceDomain extends AbstractModel {

    /**
    * <p>Domain name.</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Domain name status.</p><p>Enumeration values:</p><ul><li>Online: effective;</li><li>Process: deploying;</li><li>Offline: disabled;</li><li>Init: not applied, site to be activated;</li><li>Forbidden: domain name disabled.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Authentication switch for inference task requests.</p><p>Enumeration values:</p><ul><li>Off: Disable authentication;</li><li>On: Enable authentication.</li></ul><p>Default value: On.</p>
    */
    @SerializedName("AuthSwitch")
    @Expose
    private String AuthSwitch;

    /**
    * <p>CNAME address.</p><p>To validate the CNAME configuration status of a domain, see the <a href="https://www.tencentcloud.com/document/api/1552/94491?from_cn_redirect=1"> CheckCnameStatus </a> api.</p>
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * <p>When the domain name needs to perform ownership verification to continue providing services, this object will carry the information required for the corresponding verification method.</p><p>To verify ownership, see the <a href="https://www.tencentcloud.com/document/api/1552/98879?from_cn_redirect=1"> VerifyOwnership </a> API.</p>
    */
    @SerializedName("OwnershipVerification")
    @Expose
    private OwnershipVerification OwnershipVerification;

    /**
    * <p>Domain name certificate information.</p><p>To apply for a free certificate, see the <a href="https://www.tencentcloud.com/document/api/1552/124807?from_cn_redirect=1">ApplyFreeCertificate</a> API;<br>To check the free certificate application result, see the <a href="https://www.tencentcloud.com/document/api/1552/124806?from_cn_redirect=1">CheckFreeCertificateVerification</a> API;<br>To configure the domain name certificate, see the <a href="https://www.tencentcloud.com/document/api/1552/80764?from_cn_redirect=1">ModifyHostsCertificate</a> API.</p>
    */
    @SerializedName("Certificate")
    @Expose
    private HostsCertificate Certificate;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last modified.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Domain name.</p> 
     * @return Domain <p>Domain name.</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Domain name.</p>
     * @param Domain <p>Domain name.</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Domain name status.</p><p>Enumeration values:</p><ul><li>Online: effective;</li><li>Process: deploying;</li><li>Offline: disabled;</li><li>Init: not applied, site to be activated;</li><li>Forbidden: domain name disabled.</li></ul> 
     * @return Status <p>Domain name status.</p><p>Enumeration values:</p><ul><li>Online: effective;</li><li>Process: deploying;</li><li>Offline: disabled;</li><li>Init: not applied, site to be activated;</li><li>Forbidden: domain name disabled.</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Domain name status.</p><p>Enumeration values:</p><ul><li>Online: effective;</li><li>Process: deploying;</li><li>Offline: disabled;</li><li>Init: not applied, site to be activated;</li><li>Forbidden: domain name disabled.</li></ul>
     * @param Status <p>Domain name status.</p><p>Enumeration values:</p><ul><li>Online: effective;</li><li>Process: deploying;</li><li>Offline: disabled;</li><li>Init: not applied, site to be activated;</li><li>Forbidden: domain name disabled.</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Authentication switch for inference task requests.</p><p>Enumeration values:</p><ul><li>Off: Disable authentication;</li><li>On: Enable authentication.</li></ul><p>Default value: On.</p> 
     * @return AuthSwitch <p>Authentication switch for inference task requests.</p><p>Enumeration values:</p><ul><li>Off: Disable authentication;</li><li>On: Enable authentication.</li></ul><p>Default value: On.</p>
     */
    public String getAuthSwitch() {
        return this.AuthSwitch;
    }

    /**
     * Set <p>Authentication switch for inference task requests.</p><p>Enumeration values:</p><ul><li>Off: Disable authentication;</li><li>On: Enable authentication.</li></ul><p>Default value: On.</p>
     * @param AuthSwitch <p>Authentication switch for inference task requests.</p><p>Enumeration values:</p><ul><li>Off: Disable authentication;</li><li>On: Enable authentication.</li></ul><p>Default value: On.</p>
     */
    public void setAuthSwitch(String AuthSwitch) {
        this.AuthSwitch = AuthSwitch;
    }

    /**
     * Get <p>CNAME address.</p><p>To validate the CNAME configuration status of a domain, see the <a href="https://www.tencentcloud.com/document/api/1552/94491?from_cn_redirect=1"> CheckCnameStatus </a> api.</p> 
     * @return Cname <p>CNAME address.</p><p>To validate the CNAME configuration status of a domain, see the <a href="https://www.tencentcloud.com/document/api/1552/94491?from_cn_redirect=1"> CheckCnameStatus </a> api.</p>
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set <p>CNAME address.</p><p>To validate the CNAME configuration status of a domain, see the <a href="https://www.tencentcloud.com/document/api/1552/94491?from_cn_redirect=1"> CheckCnameStatus </a> api.</p>
     * @param Cname <p>CNAME address.</p><p>To validate the CNAME configuration status of a domain, see the <a href="https://www.tencentcloud.com/document/api/1552/94491?from_cn_redirect=1"> CheckCnameStatus </a> api.</p>
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get <p>When the domain name needs to perform ownership verification to continue providing services, this object will carry the information required for the corresponding verification method.</p><p>To verify ownership, see the <a href="https://www.tencentcloud.com/document/api/1552/98879?from_cn_redirect=1"> VerifyOwnership </a> API.</p> 
     * @return OwnershipVerification <p>When the domain name needs to perform ownership verification to continue providing services, this object will carry the information required for the corresponding verification method.</p><p>To verify ownership, see the <a href="https://www.tencentcloud.com/document/api/1552/98879?from_cn_redirect=1"> VerifyOwnership </a> API.</p>
     */
    public OwnershipVerification getOwnershipVerification() {
        return this.OwnershipVerification;
    }

    /**
     * Set <p>When the domain name needs to perform ownership verification to continue providing services, this object will carry the information required for the corresponding verification method.</p><p>To verify ownership, see the <a href="https://www.tencentcloud.com/document/api/1552/98879?from_cn_redirect=1"> VerifyOwnership </a> API.</p>
     * @param OwnershipVerification <p>When the domain name needs to perform ownership verification to continue providing services, this object will carry the information required for the corresponding verification method.</p><p>To verify ownership, see the <a href="https://www.tencentcloud.com/document/api/1552/98879?from_cn_redirect=1"> VerifyOwnership </a> API.</p>
     */
    public void setOwnershipVerification(OwnershipVerification OwnershipVerification) {
        this.OwnershipVerification = OwnershipVerification;
    }

    /**
     * Get <p>Domain name certificate information.</p><p>To apply for a free certificate, see the <a href="https://www.tencentcloud.com/document/api/1552/124807?from_cn_redirect=1">ApplyFreeCertificate</a> API;<br>To check the free certificate application result, see the <a href="https://www.tencentcloud.com/document/api/1552/124806?from_cn_redirect=1">CheckFreeCertificateVerification</a> API;<br>To configure the domain name certificate, see the <a href="https://www.tencentcloud.com/document/api/1552/80764?from_cn_redirect=1">ModifyHostsCertificate</a> API.</p> 
     * @return Certificate <p>Domain name certificate information.</p><p>To apply for a free certificate, see the <a href="https://www.tencentcloud.com/document/api/1552/124807?from_cn_redirect=1">ApplyFreeCertificate</a> API;<br>To check the free certificate application result, see the <a href="https://www.tencentcloud.com/document/api/1552/124806?from_cn_redirect=1">CheckFreeCertificateVerification</a> API;<br>To configure the domain name certificate, see the <a href="https://www.tencentcloud.com/document/api/1552/80764?from_cn_redirect=1">ModifyHostsCertificate</a> API.</p>
     */
    public HostsCertificate getCertificate() {
        return this.Certificate;
    }

    /**
     * Set <p>Domain name certificate information.</p><p>To apply for a free certificate, see the <a href="https://www.tencentcloud.com/document/api/1552/124807?from_cn_redirect=1">ApplyFreeCertificate</a> API;<br>To check the free certificate application result, see the <a href="https://www.tencentcloud.com/document/api/1552/124806?from_cn_redirect=1">CheckFreeCertificateVerification</a> API;<br>To configure the domain name certificate, see the <a href="https://www.tencentcloud.com/document/api/1552/80764?from_cn_redirect=1">ModifyHostsCertificate</a> API.</p>
     * @param Certificate <p>Domain name certificate information.</p><p>To apply for a free certificate, see the <a href="https://www.tencentcloud.com/document/api/1552/124807?from_cn_redirect=1">ApplyFreeCertificate</a> API;<br>To check the free certificate application result, see the <a href="https://www.tencentcloud.com/document/api/1552/124806?from_cn_redirect=1">CheckFreeCertificateVerification</a> API;<br>To configure the domain name certificate, see the <a href="https://www.tencentcloud.com/document/api/1552/80764?from_cn_redirect=1">ModifyHostsCertificate</a> API.</p>
     */
    public void setCertificate(HostsCertificate Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last modified.</p> 
     * @return UpdateTime <p>Last modified.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Last modified.</p>
     * @param UpdateTime <p>Last modified.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public InferenceDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceDomain(InferenceDomain source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AuthSwitch != null) {
            this.AuthSwitch = new String(source.AuthSwitch);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.OwnershipVerification != null) {
            this.OwnershipVerification = new OwnershipVerification(source.OwnershipVerification);
        }
        if (source.Certificate != null) {
            this.Certificate = new HostsCertificate(source.Certificate);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AuthSwitch", this.AuthSwitch);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamObj(map, prefix + "OwnershipVerification.", this.OwnershipVerification);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

