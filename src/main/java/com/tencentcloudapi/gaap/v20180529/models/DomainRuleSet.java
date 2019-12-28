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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainRuleSet extends AbstractModel{

    /**
    * Forwarding rule domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Forwarding rule list of the domain name.
    */
    @SerializedName("RuleSet")
    @Expose
    private RuleInfo [] RuleSet;

    /**
    * Server certificate ID of the domain. When it is `default`, it indicates that the default certificate will be used (i.e., the certificate configured for the listener).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Server certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificateAlias")
    @Expose
    private String CertificateAlias;

    /**
    * Client certificate ID of the domain. When it is `default`, it indicates that the default certificate will be used (i.e., the certificate configured for the listener).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
    * Client certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientCertificateAlias")
    @Expose
    private String ClientCertificateAlias;

    /**
    * Basic authentication configuration ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BasicAuthConfId")
    @Expose
    private String BasicAuthConfId;

    /**
    * Basic authentication status:
0: disabled;
1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BasicAuth")
    @Expose
    private Long BasicAuth;

    /**
    * Basic authentication configuration name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BasicAuthConfAlias")
    @Expose
    private String BasicAuthConfAlias;

    /**
    * Origin server authentication certificate ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealServerCertificateId")
    @Expose
    private String RealServerCertificateId;

    /**
    * Origin server authentication status:
0: disabled;
1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealServerAuth")
    @Expose
    private Long RealServerAuth;

    /**
    * Origin server authentication certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealServerCertificateAlias")
    @Expose
    private String RealServerCertificateAlias;

    /**
    * Connection authentication certificate ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GaapCertificateId")
    @Expose
    private String GaapCertificateId;

    /**
    * Connection authentication status:
0: disabled;
1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GaapAuth")
    @Expose
    private Long GaapAuth;

    /**
    * Connection authentication certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GaapCertificateAlias")
    @Expose
    private String GaapCertificateAlias;

    /**
    * Origin server authentication domain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealServerCertificateDomain")
    @Expose
    private String RealServerCertificateDomain;

    /**
    * Returns IDs and list of multiple certificates when there are multiple client certificates.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolyClientCertificateAliasInfo")
    @Expose
    private CertificateAliasInfo [] PolyClientCertificateAliasInfo;

    /**
    * 
    */
    @SerializedName("PolyRealServerCertificateAliasInfo")
    @Expose
    private CertificateAliasInfo [] PolyRealServerCertificateAliasInfo;

    /**
     * Get Forwarding rule domain name. 
     * @return Domain Forwarding rule domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Forwarding rule domain name.
     * @param Domain Forwarding rule domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Forwarding rule list of the domain name. 
     * @return RuleSet Forwarding rule list of the domain name.
     */
    public RuleInfo [] getRuleSet() {
        return this.RuleSet;
    }

    /**
     * Set Forwarding rule list of the domain name.
     * @param RuleSet Forwarding rule list of the domain name.
     */
    public void setRuleSet(RuleInfo [] RuleSet) {
        this.RuleSet = RuleSet;
    }

    /**
     * Get Server certificate ID of the domain. When it is `default`, it indicates that the default certificate will be used (i.e., the certificate configured for the listener).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CertificateId Server certificate ID of the domain. When it is `default`, it indicates that the default certificate will be used (i.e., the certificate configured for the listener).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Server certificate ID of the domain. When it is `default`, it indicates that the default certificate will be used (i.e., the certificate configured for the listener).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CertificateId Server certificate ID of the domain. When it is `default`, it indicates that the default certificate will be used (i.e., the certificate configured for the listener).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Server certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CertificateAlias Server certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificateAlias() {
        return this.CertificateAlias;
    }

    /**
     * Set Server certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CertificateAlias Server certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificateAlias(String CertificateAlias) {
        this.CertificateAlias = CertificateAlias;
    }

    /**
     * Get Client certificate ID of the domain. When it is `default`, it indicates that the default certificate will be used (i.e., the certificate configured for the listener).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientCertificateId Client certificate ID of the domain. When it is `default`, it indicates that the default certificate will be used (i.e., the certificate configured for the listener).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * Set Client certificate ID of the domain. When it is `default`, it indicates that the default certificate will be used (i.e., the certificate configured for the listener).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientCertificateId Client certificate ID of the domain. When it is `default`, it indicates that the default certificate will be used (i.e., the certificate configured for the listener).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * Get Client certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientCertificateAlias Client certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClientCertificateAlias() {
        return this.ClientCertificateAlias;
    }

    /**
     * Set Client certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientCertificateAlias Client certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientCertificateAlias(String ClientCertificateAlias) {
        this.ClientCertificateAlias = ClientCertificateAlias;
    }

    /**
     * Get Basic authentication configuration ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BasicAuthConfId Basic authentication configuration ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBasicAuthConfId() {
        return this.BasicAuthConfId;
    }

    /**
     * Set Basic authentication configuration ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BasicAuthConfId Basic authentication configuration ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBasicAuthConfId(String BasicAuthConfId) {
        this.BasicAuthConfId = BasicAuthConfId;
    }

    /**
     * Get Basic authentication status:
0: disabled;
1: enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BasicAuth Basic authentication status:
0: disabled;
1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBasicAuth() {
        return this.BasicAuth;
    }

    /**
     * Set Basic authentication status:
0: disabled;
1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BasicAuth Basic authentication status:
0: disabled;
1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBasicAuth(Long BasicAuth) {
        this.BasicAuth = BasicAuth;
    }

    /**
     * Get Basic authentication configuration name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BasicAuthConfAlias Basic authentication configuration name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBasicAuthConfAlias() {
        return this.BasicAuthConfAlias;
    }

    /**
     * Set Basic authentication configuration name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BasicAuthConfAlias Basic authentication configuration name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBasicAuthConfAlias(String BasicAuthConfAlias) {
        this.BasicAuthConfAlias = BasicAuthConfAlias;
    }

    /**
     * Get Origin server authentication certificate ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealServerCertificateId Origin server authentication certificate ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRealServerCertificateId() {
        return this.RealServerCertificateId;
    }

    /**
     * Set Origin server authentication certificate ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealServerCertificateId Origin server authentication certificate ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealServerCertificateId(String RealServerCertificateId) {
        this.RealServerCertificateId = RealServerCertificateId;
    }

    /**
     * Get Origin server authentication status:
0: disabled;
1: enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealServerAuth Origin server authentication status:
0: disabled;
1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRealServerAuth() {
        return this.RealServerAuth;
    }

    /**
     * Set Origin server authentication status:
0: disabled;
1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealServerAuth Origin server authentication status:
0: disabled;
1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealServerAuth(Long RealServerAuth) {
        this.RealServerAuth = RealServerAuth;
    }

    /**
     * Get Origin server authentication certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealServerCertificateAlias Origin server authentication certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRealServerCertificateAlias() {
        return this.RealServerCertificateAlias;
    }

    /**
     * Set Origin server authentication certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealServerCertificateAlias Origin server authentication certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealServerCertificateAlias(String RealServerCertificateAlias) {
        this.RealServerCertificateAlias = RealServerCertificateAlias;
    }

    /**
     * Get Connection authentication certificate ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GaapCertificateId Connection authentication certificate ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGaapCertificateId() {
        return this.GaapCertificateId;
    }

    /**
     * Set Connection authentication certificate ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GaapCertificateId Connection authentication certificate ID of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGaapCertificateId(String GaapCertificateId) {
        this.GaapCertificateId = GaapCertificateId;
    }

    /**
     * Get Connection authentication status:
0: disabled;
1: enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GaapAuth Connection authentication status:
0: disabled;
1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getGaapAuth() {
        return this.GaapAuth;
    }

    /**
     * Set Connection authentication status:
0: disabled;
1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GaapAuth Connection authentication status:
0: disabled;
1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGaapAuth(Long GaapAuth) {
        this.GaapAuth = GaapAuth;
    }

    /**
     * Get Connection authentication certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GaapCertificateAlias Connection authentication certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGaapCertificateAlias() {
        return this.GaapCertificateAlias;
    }

    /**
     * Set Connection authentication certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GaapCertificateAlias Connection authentication certificate name of the domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGaapCertificateAlias(String GaapCertificateAlias) {
        this.GaapCertificateAlias = GaapCertificateAlias;
    }

    /**
     * Get Origin server authentication domain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealServerCertificateDomain Origin server authentication domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRealServerCertificateDomain() {
        return this.RealServerCertificateDomain;
    }

    /**
     * Set Origin server authentication domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealServerCertificateDomain Origin server authentication domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealServerCertificateDomain(String RealServerCertificateDomain) {
        this.RealServerCertificateDomain = RealServerCertificateDomain;
    }

    /**
     * Get Returns IDs and list of multiple certificates when there are multiple client certificates.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolyClientCertificateAliasInfo Returns IDs and list of multiple certificates when there are multiple client certificates.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CertificateAliasInfo [] getPolyClientCertificateAliasInfo() {
        return this.PolyClientCertificateAliasInfo;
    }

    /**
     * Set Returns IDs and list of multiple certificates when there are multiple client certificates.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolyClientCertificateAliasInfo Returns IDs and list of multiple certificates when there are multiple client certificates.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolyClientCertificateAliasInfo(CertificateAliasInfo [] PolyClientCertificateAliasInfo) {
        this.PolyClientCertificateAliasInfo = PolyClientCertificateAliasInfo;
    }

    /**
     * Get  
     * @return PolyRealServerCertificateAliasInfo 
     */
    public CertificateAliasInfo [] getPolyRealServerCertificateAliasInfo() {
        return this.PolyRealServerCertificateAliasInfo;
    }

    /**
     * Set 
     * @param PolyRealServerCertificateAliasInfo 
     */
    public void setPolyRealServerCertificateAliasInfo(CertificateAliasInfo [] PolyRealServerCertificateAliasInfo) {
        this.PolyRealServerCertificateAliasInfo = PolyRealServerCertificateAliasInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "RuleSet.", this.RuleSet);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "CertificateAlias", this.CertificateAlias);
        this.setParamSimple(map, prefix + "ClientCertificateId", this.ClientCertificateId);
        this.setParamSimple(map, prefix + "ClientCertificateAlias", this.ClientCertificateAlias);
        this.setParamSimple(map, prefix + "BasicAuthConfId", this.BasicAuthConfId);
        this.setParamSimple(map, prefix + "BasicAuth", this.BasicAuth);
        this.setParamSimple(map, prefix + "BasicAuthConfAlias", this.BasicAuthConfAlias);
        this.setParamSimple(map, prefix + "RealServerCertificateId", this.RealServerCertificateId);
        this.setParamSimple(map, prefix + "RealServerAuth", this.RealServerAuth);
        this.setParamSimple(map, prefix + "RealServerCertificateAlias", this.RealServerCertificateAlias);
        this.setParamSimple(map, prefix + "GaapCertificateId", this.GaapCertificateId);
        this.setParamSimple(map, prefix + "GaapAuth", this.GaapAuth);
        this.setParamSimple(map, prefix + "GaapCertificateAlias", this.GaapCertificateAlias);
        this.setParamSimple(map, prefix + "RealServerCertificateDomain", this.RealServerCertificateDomain);
        this.setParamArrayObj(map, prefix + "PolyClientCertificateAliasInfo.", this.PolyClientCertificateAliasInfo);
        this.setParamArrayObj(map, prefix + "PolyRealServerCertificateAliasInfo.", this.PolyRealServerCertificateAliasInfo);

    }
}

