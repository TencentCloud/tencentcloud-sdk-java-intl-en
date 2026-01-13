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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainAttributesRequest extends AbstractModel {

    /**
    * ID of the CLB instance. You can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * ID of the CLB instance listener. You can call the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) API to query the ID.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Domain name (must be a domain name under a created forwarding rule). if it is multiple domains, you can specify any one of the domain name list. it can be accessed through the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) api.
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
    * Specifies whether to enable HTTP/2. note that only HTTPS domain names support HTTP/2.
True: enable HTTP2. false: disable HTTP2.
    */
    @SerializedName("Http2")
    @Expose
    private Boolean Http2;

    /**
    * Whether to set as the default domain name. Note: Only one default domain name can be set under a listener.
True: set as default domain name. false: do not set as default domain name.
    */
    @SerializedName("DefaultServer")
    @Expose
    private Boolean DefaultServer;

    /**
    * Specifies whether QUIC is enabled. note that QUIC can only be enabled for HTTPS domains.
True: enable QUIC. False: disable.
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
    * Certificate information related to the domain name. Note: This applies only to listeners with SNI enabled. Multiple server certificates with different algorithm types can be input simultaneously, but this parameter cannot be input together with the Certificate.
    */
    @SerializedName("MultiCertInfo")
    @Expose
    private MultiCertInfo MultiCertInfo;

    /**
     * Get ID of the CLB instance. You can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to query the ID. 
     * @return LoadBalancerId ID of the CLB instance. You can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set ID of the CLB instance. You can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
     * @param LoadBalancerId ID of the CLB instance. You can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/214/30685?from_cn_redirect=1) API to query the ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get ID of the CLB instance listener. You can call the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) API to query the ID. 
     * @return ListenerId ID of the CLB instance listener. You can call the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) API to query the ID.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set ID of the CLB instance listener. You can call the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) API to query the ID.
     * @param ListenerId ID of the CLB instance listener. You can call the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) API to query the ID.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Domain name (must be a domain name under a created forwarding rule). if it is multiple domains, you can specify any one of the domain name list. it can be accessed through the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) api. 
     * @return Domain Domain name (must be a domain name under a created forwarding rule). if it is multiple domains, you can specify any one of the domain name list. it can be accessed through the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) api.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name (must be a domain name under a created forwarding rule). if it is multiple domains, you can specify any one of the domain name list. it can be accessed through the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) api.
     * @param Domain Domain name (must be a domain name under a created forwarding rule). if it is multiple domains, you can specify any one of the domain name list. it can be accessed through the [DescribeListeners](https://www.tencentcloud.com/document/product/214/30686?from_cn_redirect=1) api.
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
     * Get Specifies whether to enable HTTP/2. note that only HTTPS domain names support HTTP/2.
True: enable HTTP2. false: disable HTTP2. 
     * @return Http2 Specifies whether to enable HTTP/2. note that only HTTPS domain names support HTTP/2.
True: enable HTTP2. false: disable HTTP2.
     */
    public Boolean getHttp2() {
        return this.Http2;
    }

    /**
     * Set Specifies whether to enable HTTP/2. note that only HTTPS domain names support HTTP/2.
True: enable HTTP2. false: disable HTTP2.
     * @param Http2 Specifies whether to enable HTTP/2. note that only HTTPS domain names support HTTP/2.
True: enable HTTP2. false: disable HTTP2.
     */
    public void setHttp2(Boolean Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get Whether to set as the default domain name. Note: Only one default domain name can be set under a listener.
True: set as default domain name. false: do not set as default domain name. 
     * @return DefaultServer Whether to set as the default domain name. Note: Only one default domain name can be set under a listener.
True: set as default domain name. false: do not set as default domain name.
     */
    public Boolean getDefaultServer() {
        return this.DefaultServer;
    }

    /**
     * Set Whether to set as the default domain name. Note: Only one default domain name can be set under a listener.
True: set as default domain name. false: do not set as default domain name.
     * @param DefaultServer Whether to set as the default domain name. Note: Only one default domain name can be set under a listener.
True: set as default domain name. false: do not set as default domain name.
     */
    public void setDefaultServer(Boolean DefaultServer) {
        this.DefaultServer = DefaultServer;
    }

    /**
     * Get Specifies whether QUIC is enabled. note that QUIC can only be enabled for HTTPS domains.
True: enable QUIC. False: disable. 
     * @return Quic Specifies whether QUIC is enabled. note that QUIC can only be enabled for HTTPS domains.
True: enable QUIC. False: disable.
     */
    public Boolean getQuic() {
        return this.Quic;
    }

    /**
     * Set Specifies whether QUIC is enabled. note that QUIC can only be enabled for HTTPS domains.
True: enable QUIC. False: disable.
     * @param Quic Specifies whether QUIC is enabled. note that QUIC can only be enabled for HTTPS domains.
True: enable QUIC. False: disable.
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
     * Get Certificate information related to the domain name. Note: This applies only to listeners with SNI enabled. Multiple server certificates with different algorithm types can be input simultaneously, but this parameter cannot be input together with the Certificate. 
     * @return MultiCertInfo Certificate information related to the domain name. Note: This applies only to listeners with SNI enabled. Multiple server certificates with different algorithm types can be input simultaneously, but this parameter cannot be input together with the Certificate.
     */
    public MultiCertInfo getMultiCertInfo() {
        return this.MultiCertInfo;
    }

    /**
     * Set Certificate information related to the domain name. Note: This applies only to listeners with SNI enabled. Multiple server certificates with different algorithm types can be input simultaneously, but this parameter cannot be input together with the Certificate.
     * @param MultiCertInfo Certificate information related to the domain name. Note: This applies only to listeners with SNI enabled. Multiple server certificates with different algorithm types can be input simultaneously, but this parameter cannot be input together with the Certificate.
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

