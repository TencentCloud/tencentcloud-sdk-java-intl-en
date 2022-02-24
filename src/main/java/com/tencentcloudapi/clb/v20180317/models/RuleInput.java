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

public class RuleInput extends AbstractModel{

    /**
    * Forwarding rule path. Length: 1-200.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * The domain name associated with the forwarding rule. It can contain 1-80 characters. Only one domain name can be entered. If you need to enter multiple domain names, use `Domains`.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Session persistence time in seconds. Value range: 30-3,600. Setting it to 0 indicates that session persistence is disabled.
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * Health check information. For more information, please see [Health Check](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1)
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * Certificate information
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * Request forwarding method of the rule. Value range: WRR, LEAST_CONN, IP_HASH
They represent weighted round robin, least connections, and IP hash, respectively. Default value: WRR.
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Forwarding protocol between the CLB instance and real server. Currently, HTTP/HTTPS/TRPC are supported.
    */
    @SerializedName("ForwardType")
    @Expose
    private String ForwardType;

    /**
    * Whether to set this domain name as the default domain name. Note: Only one default domain name can be set under one listener.
    */
    @SerializedName("DefaultServer")
    @Expose
    private Boolean DefaultServer;

    /**
    * Whether to enable HTTP/2. Note: HTTP/2 can be enabled only for HTTPS domain names.
    */
    @SerializedName("Http2")
    @Expose
    private Boolean Http2;

    /**
    * Target real server type. NODE: binding a general node; TARGETGROUP: binding a target group.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * TRPC callee server route, which is required when `ForwardType` is `TRPC`.
    */
    @SerializedName("TrpcCallee")
    @Expose
    private String TrpcCallee;

    /**
    * TRPC calling service API, which is required when `ForwardType` is `TRPC`.
    */
    @SerializedName("TrpcFunc")
    @Expose
    private String TrpcFunc;

    /**
    * Whether to enable QUIC. Note: QUIC can be enabled only for HTTPS domain names
    */
    @SerializedName("Quic")
    @Expose
    private Boolean Quic;

    /**
    * The domain name associated with the forwarding rule. Each contain 1-80 characters. If you only need to enter one domain name, use `Domain` instead.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
     * Get Forwarding rule path. Length: 1-200. 
     * @return Url Forwarding rule path. Length: 1-200.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Forwarding rule path. Length: 1-200.
     * @param Url Forwarding rule path. Length: 1-200.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get The domain name associated with the forwarding rule. It can contain 1-80 characters. Only one domain name can be entered. If you need to enter multiple domain names, use `Domains`. 
     * @return Domain The domain name associated with the forwarding rule. It can contain 1-80 characters. Only one domain name can be entered. If you need to enter multiple domain names, use `Domains`.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain name associated with the forwarding rule. It can contain 1-80 characters. Only one domain name can be entered. If you need to enter multiple domain names, use `Domains`.
     * @param Domain The domain name associated with the forwarding rule. It can contain 1-80 characters. Only one domain name can be entered. If you need to enter multiple domain names, use `Domains`.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Session persistence time in seconds. Value range: 30-3,600. Setting it to 0 indicates that session persistence is disabled. 
     * @return SessionExpireTime Session persistence time in seconds. Value range: 30-3,600. Setting it to 0 indicates that session persistence is disabled.
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set Session persistence time in seconds. Value range: 30-3,600. Setting it to 0 indicates that session persistence is disabled.
     * @param SessionExpireTime Session persistence time in seconds. Value range: 30-3,600. Setting it to 0 indicates that session persistence is disabled.
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get Health check information. For more information, please see [Health Check](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1) 
     * @return HealthCheck Health check information. For more information, please see [Health Check](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1)
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check information. For more information, please see [Health Check](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1)
     * @param HealthCheck Health check information. For more information, please see [Health Check](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1)
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Certificate information 
     * @return Certificate Certificate information
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Certificate information
     * @param Certificate Certificate information
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get Request forwarding method of the rule. Value range: WRR, LEAST_CONN, IP_HASH
They represent weighted round robin, least connections, and IP hash, respectively. Default value: WRR. 
     * @return Scheduler Request forwarding method of the rule. Value range: WRR, LEAST_CONN, IP_HASH
They represent weighted round robin, least connections, and IP hash, respectively. Default value: WRR.
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set Request forwarding method of the rule. Value range: WRR, LEAST_CONN, IP_HASH
They represent weighted round robin, least connections, and IP hash, respectively. Default value: WRR.
     * @param Scheduler Request forwarding method of the rule. Value range: WRR, LEAST_CONN, IP_HASH
They represent weighted round robin, least connections, and IP hash, respectively. Default value: WRR.
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Forwarding protocol between the CLB instance and real server. Currently, HTTP/HTTPS/TRPC are supported. 
     * @return ForwardType Forwarding protocol between the CLB instance and real server. Currently, HTTP/HTTPS/TRPC are supported.
     */
    public String getForwardType() {
        return this.ForwardType;
    }

    /**
     * Set Forwarding protocol between the CLB instance and real server. Currently, HTTP/HTTPS/TRPC are supported.
     * @param ForwardType Forwarding protocol between the CLB instance and real server. Currently, HTTP/HTTPS/TRPC are supported.
     */
    public void setForwardType(String ForwardType) {
        this.ForwardType = ForwardType;
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
     * Get Target real server type. NODE: binding a general node; TARGETGROUP: binding a target group. 
     * @return TargetType Target real server type. NODE: binding a general node; TARGETGROUP: binding a target group.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Target real server type. NODE: binding a general node; TARGETGROUP: binding a target group.
     * @param TargetType Target real server type. NODE: binding a general node; TARGETGROUP: binding a target group.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get TRPC callee server route, which is required when `ForwardType` is `TRPC`. 
     * @return TrpcCallee TRPC callee server route, which is required when `ForwardType` is `TRPC`.
     */
    public String getTrpcCallee() {
        return this.TrpcCallee;
    }

    /**
     * Set TRPC callee server route, which is required when `ForwardType` is `TRPC`.
     * @param TrpcCallee TRPC callee server route, which is required when `ForwardType` is `TRPC`.
     */
    public void setTrpcCallee(String TrpcCallee) {
        this.TrpcCallee = TrpcCallee;
    }

    /**
     * Get TRPC calling service API, which is required when `ForwardType` is `TRPC`. 
     * @return TrpcFunc TRPC calling service API, which is required when `ForwardType` is `TRPC`.
     */
    public String getTrpcFunc() {
        return this.TrpcFunc;
    }

    /**
     * Set TRPC calling service API, which is required when `ForwardType` is `TRPC`.
     * @param TrpcFunc TRPC calling service API, which is required when `ForwardType` is `TRPC`.
     */
    public void setTrpcFunc(String TrpcFunc) {
        this.TrpcFunc = TrpcFunc;
    }

    /**
     * Get Whether to enable QUIC. Note: QUIC can be enabled only for HTTPS domain names 
     * @return Quic Whether to enable QUIC. Note: QUIC can be enabled only for HTTPS domain names
     */
    public Boolean getQuic() {
        return this.Quic;
    }

    /**
     * Set Whether to enable QUIC. Note: QUIC can be enabled only for HTTPS domain names
     * @param Quic Whether to enable QUIC. Note: QUIC can be enabled only for HTTPS domain names
     */
    public void setQuic(Boolean Quic) {
        this.Quic = Quic;
    }

    /**
     * Get The domain name associated with the forwarding rule. Each contain 1-80 characters. If you only need to enter one domain name, use `Domain` instead. 
     * @return Domains The domain name associated with the forwarding rule. Each contain 1-80 characters. If you only need to enter one domain name, use `Domain` instead.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set The domain name associated with the forwarding rule. Each contain 1-80 characters. If you only need to enter one domain name, use `Domain` instead.
     * @param Domains The domain name associated with the forwarding rule. Each contain 1-80 characters. If you only need to enter one domain name, use `Domain` instead.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    public RuleInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleInput(RuleInput source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SessionExpireTime != null) {
            this.SessionExpireTime = new Long(source.SessionExpireTime);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new HealthCheck(source.HealthCheck);
        }
        if (source.Certificate != null) {
            this.Certificate = new CertificateInput(source.Certificate);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.ForwardType != null) {
            this.ForwardType = new String(source.ForwardType);
        }
        if (source.DefaultServer != null) {
            this.DefaultServer = new Boolean(source.DefaultServer);
        }
        if (source.Http2 != null) {
            this.Http2 = new Boolean(source.Http2);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.TrpcCallee != null) {
            this.TrpcCallee = new String(source.TrpcCallee);
        }
        if (source.TrpcFunc != null) {
            this.TrpcFunc = new String(source.TrpcFunc);
        }
        if (source.Quic != null) {
            this.Quic = new Boolean(source.Quic);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "ForwardType", this.ForwardType);
        this.setParamSimple(map, prefix + "DefaultServer", this.DefaultServer);
        this.setParamSimple(map, prefix + "Http2", this.Http2);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "TrpcCallee", this.TrpcCallee);
        this.setParamSimple(map, prefix + "TrpcFunc", this.TrpcFunc);
        this.setParamSimple(map, prefix + "Quic", this.Quic);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);

    }
}

