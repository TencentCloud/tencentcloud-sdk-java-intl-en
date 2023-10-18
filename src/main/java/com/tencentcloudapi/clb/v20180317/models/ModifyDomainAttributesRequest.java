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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainAttributesRequest extends AbstractModel {

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
    * The domain name, which must be associated with an existing forwarding rule. If there are multiple domain names, you only need to specify one.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The one domain name to modify. `NewDomain` and `NewDomains` can not be both specified.
    */
    @SerializedName("NewDomain")
    @Expose
    private String NewDomain;

    /**
    * Certificate information of the domain name. It is only applicable to listeners with SNI enabled. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
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
    * Whether to enable QUIC. Note: QUIC can be enabled only for HTTPS domain names.
    */
    @SerializedName("Quic")
    @Expose
    private Boolean Quic;

    /**
    * Specifies a new default domain name for the listener. This field is used when the original default domain name is disabled. If there are multiple domain names, specify one of them.
    */
    @SerializedName("NewDefaultServerDomain")
    @Expose
    private String NewDefaultServerDomain;

    /**
    * The new domain names to modify. `NewDomain` and `NewDomains` can not be both specified.
    */
    @SerializedName("NewDomains")
    @Expose
    private String [] NewDomains;

    /**
    * Certificate information of the domain name. It is only applicable to listeners with SNI enabled. You can specify multiple server-side certificates with different algorithm types. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
    */
    @SerializedName("MultiCertInfo")
    @Expose
    private MultiCertInfo MultiCertInfo;

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
     * Get The domain name, which must be associated with an existing forwarding rule. If there are multiple domain names, you only need to specify one. 
     * @return Domain The domain name, which must be associated with an existing forwarding rule. If there are multiple domain names, you only need to specify one.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain name, which must be associated with an existing forwarding rule. If there are multiple domain names, you only need to specify one.
     * @param Domain The domain name, which must be associated with an existing forwarding rule. If there are multiple domain names, you only need to specify one.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The one domain name to modify. `NewDomain` and `NewDomains` can not be both specified. 
     * @return NewDomain The one domain name to modify. `NewDomain` and `NewDomains` can not be both specified.
     */
    public String getNewDomain() {
        return this.NewDomain;
    }

    /**
     * Set The one domain name to modify. `NewDomain` and `NewDomains` can not be both specified.
     * @param NewDomain The one domain name to modify. `NewDomain` and `NewDomains` can not be both specified.
     */
    public void setNewDomain(String NewDomain) {
        this.NewDomain = NewDomain;
    }

    /**
     * Get Certificate information of the domain name. It is only applicable to listeners with SNI enabled. `Certificate` and `MultiCertInfo` cannot be specified at the same time.  
     * @return Certificate Certificate information of the domain name. It is only applicable to listeners with SNI enabled. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Certificate information of the domain name. It is only applicable to listeners with SNI enabled. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
     * @param Certificate Certificate information of the domain name. It is only applicable to listeners with SNI enabled. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
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
     * Get Whether to enable QUIC. Note: QUIC can be enabled only for HTTPS domain names. 
     * @return Quic Whether to enable QUIC. Note: QUIC can be enabled only for HTTPS domain names.
     */
    public Boolean getQuic() {
        return this.Quic;
    }

    /**
     * Set Whether to enable QUIC. Note: QUIC can be enabled only for HTTPS domain names.
     * @param Quic Whether to enable QUIC. Note: QUIC can be enabled only for HTTPS domain names.
     */
    public void setQuic(Boolean Quic) {
        this.Quic = Quic;
    }

    /**
     * Get Specifies a new default domain name for the listener. This field is used when the original default domain name is disabled. If there are multiple domain names, specify one of them. 
     * @return NewDefaultServerDomain Specifies a new default domain name for the listener. This field is used when the original default domain name is disabled. If there are multiple domain names, specify one of them.
     */
    public String getNewDefaultServerDomain() {
        return this.NewDefaultServerDomain;
    }

    /**
     * Set Specifies a new default domain name for the listener. This field is used when the original default domain name is disabled. If there are multiple domain names, specify one of them.
     * @param NewDefaultServerDomain Specifies a new default domain name for the listener. This field is used when the original default domain name is disabled. If there are multiple domain names, specify one of them.
     */
    public void setNewDefaultServerDomain(String NewDefaultServerDomain) {
        this.NewDefaultServerDomain = NewDefaultServerDomain;
    }

    /**
     * Get The new domain names to modify. `NewDomain` and `NewDomains` can not be both specified. 
     * @return NewDomains The new domain names to modify. `NewDomain` and `NewDomains` can not be both specified.
     */
    public String [] getNewDomains() {
        return this.NewDomains;
    }

    /**
     * Set The new domain names to modify. `NewDomain` and `NewDomains` can not be both specified.
     * @param NewDomains The new domain names to modify. `NewDomain` and `NewDomains` can not be both specified.
     */
    public void setNewDomains(String [] NewDomains) {
        this.NewDomains = NewDomains;
    }

    /**
     * Get Certificate information of the domain name. It is only applicable to listeners with SNI enabled. You can specify multiple server-side certificates with different algorithm types. `Certificate` and `MultiCertInfo` cannot be specified at the same time.  
     * @return MultiCertInfo Certificate information of the domain name. It is only applicable to listeners with SNI enabled. You can specify multiple server-side certificates with different algorithm types. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
     */
    public MultiCertInfo getMultiCertInfo() {
        return this.MultiCertInfo;
    }

    /**
     * Set Certificate information of the domain name. It is only applicable to listeners with SNI enabled. You can specify multiple server-side certificates with different algorithm types. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
     * @param MultiCertInfo Certificate information of the domain name. It is only applicable to listeners with SNI enabled. You can specify multiple server-side certificates with different algorithm types. `Certificate` and `MultiCertInfo` cannot be specified at the same time. 
     */
    public void setMultiCertInfo(MultiCertInfo MultiCertInfo) {
        this.MultiCertInfo = MultiCertInfo;
    }

    public ModifyDomainAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainAttributesRequest(ModifyDomainAttributesRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.NewDomain != null) {
            this.NewDomain = new String(source.NewDomain);
        }
        if (source.Certificate != null) {
            this.Certificate = new CertificateInput(source.Certificate);
        }
        if (source.Http2 != null) {
            this.Http2 = new Boolean(source.Http2);
        }
        if (source.DefaultServer != null) {
            this.DefaultServer = new Boolean(source.DefaultServer);
        }
        if (source.Quic != null) {
            this.Quic = new Boolean(source.Quic);
        }
        if (source.NewDefaultServerDomain != null) {
            this.NewDefaultServerDomain = new String(source.NewDefaultServerDomain);
        }
        if (source.NewDomains != null) {
            this.NewDomains = new String[source.NewDomains.length];
            for (int i = 0; i < source.NewDomains.length; i++) {
                this.NewDomains[i] = new String(source.NewDomains[i]);
            }
        }
        if (source.MultiCertInfo != null) {
            this.MultiCertInfo = new MultiCertInfo(source.MultiCertInfo);
        }
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
        this.setParamSimple(map, prefix + "Quic", this.Quic);
        this.setParamSimple(map, prefix + "NewDefaultServerDomain", this.NewDefaultServerDomain);
        this.setParamArraySimple(map, prefix + "NewDomains.", this.NewDomains);
        this.setParamObj(map, prefix + "MultiCertInfo.", this.MultiCertInfo);

    }
}

