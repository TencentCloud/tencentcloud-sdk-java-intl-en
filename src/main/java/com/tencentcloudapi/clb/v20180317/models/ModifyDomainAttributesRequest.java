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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainAttributesRequest extends AbstractModel{

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Domain name, which must be under a created forwarding rule.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * New domain name
    */
    @SerializedName("NewDomain")
    @Expose
    private String NewDomain;

    /**
    * Domain name certificate information. Note: This is only applicable to SNI-enabled listeners.
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * Whether to enable HTTP/2. Note: HTTP/2 can be enabled only for HTTPS domain names.
    */
    @SerializedName("Http2")
    @Expose
    private Boolean Http2;

    /**
    * Whether to set this domain name as the default domain name. Note: Only one default domain name can be set under one listener.
    */
    @SerializedName("DefaultServer")
    @Expose
    private Boolean DefaultServer;

    /**
    * A listener must be configured with a default domain name. If you need to disable the default domain name, you must specify another one as the new default domain name.
    */
    @SerializedName("NewDefaultServerDomain")
    @Expose
    private String NewDefaultServerDomain;

    /**
     * Get CLB instance ID 
     * @return LoadBalancerId CLB instance ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID
     * @param LoadBalancerId CLB instance ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB listener ID 
     * @return ListenerId CLB listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set CLB listener ID
     * @param ListenerId CLB listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Domain name, which must be under a created forwarding rule. 
     * @return Domain Domain name, which must be under a created forwarding rule.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name, which must be under a created forwarding rule.
     * @param Domain Domain name, which must be under a created forwarding rule.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get New domain name 
     * @return NewDomain New domain name
     */
    public String getNewDomain() {
        return this.NewDomain;
    }

    /**
     * Set New domain name
     * @param NewDomain New domain name
     */
    public void setNewDomain(String NewDomain) {
        this.NewDomain = NewDomain;
    }

    /**
     * Get Domain name certificate information. Note: This is only applicable to SNI-enabled listeners. 
     * @return Certificate Domain name certificate information. Note: This is only applicable to SNI-enabled listeners.
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Domain name certificate information. Note: This is only applicable to SNI-enabled listeners.
     * @param Certificate Domain name certificate information. Note: This is only applicable to SNI-enabled listeners.
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get Whether to enable HTTP/2. Note: HTTP/2 can be enabled only for HTTPS domain names. 
     * @return Http2 Whether to enable HTTP/2. Note: HTTP/2 can be enabled only for HTTPS domain names.
     */
    public Boolean getHttp2() {
        return this.Http2;
    }

    /**
     * Set Whether to enable HTTP/2. Note: HTTP/2 can be enabled only for HTTPS domain names.
     * @param Http2 Whether to enable HTTP/2. Note: HTTP/2 can be enabled only for HTTPS domain names.
     */
    public void setHttp2(Boolean Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get Whether to set this domain name as the default domain name. Note: Only one default domain name can be set under one listener. 
     * @return DefaultServer Whether to set this domain name as the default domain name. Note: Only one default domain name can be set under one listener.
     */
    public Boolean getDefaultServer() {
        return this.DefaultServer;
    }

    /**
     * Set Whether to set this domain name as the default domain name. Note: Only one default domain name can be set under one listener.
     * @param DefaultServer Whether to set this domain name as the default domain name. Note: Only one default domain name can be set under one listener.
     */
    public void setDefaultServer(Boolean DefaultServer) {
        this.DefaultServer = DefaultServer;
    }

    /**
     * Get A listener must be configured with a default domain name. If you need to disable the default domain name, you must specify another one as the new default domain name. 
     * @return NewDefaultServerDomain A listener must be configured with a default domain name. If you need to disable the default domain name, you must specify another one as the new default domain name.
     */
    public String getNewDefaultServerDomain() {
        return this.NewDefaultServerDomain;
    }

    /**
     * Set A listener must be configured with a default domain name. If you need to disable the default domain name, you must specify another one as the new default domain name.
     * @param NewDefaultServerDomain A listener must be configured with a default domain name. If you need to disable the default domain name, you must specify another one as the new default domain name.
     */
    public void setNewDefaultServerDomain(String NewDefaultServerDomain) {
        this.NewDefaultServerDomain = NewDefaultServerDomain;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "NewDomain", this.NewDomain);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "Http2", this.Http2);
        this.setParamSimple(map, prefix + "DefaultServer", this.DefaultServer);
        this.setParamSimple(map, prefix + "NewDefaultServerDomain", this.NewDefaultServerDomain);

    }
}

