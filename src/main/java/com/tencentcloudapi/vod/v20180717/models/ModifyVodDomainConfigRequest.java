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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVodDomainConfigRequest extends AbstractModel {

    /**
    * <p>Domain name.</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p><a href="/document/product/266/14046">Referer hotlink protection</a> rule.</p>
    */
    @SerializedName("RefererAuthPolicy")
    @Expose
    private RefererAuthPolicy RefererAuthPolicy;

    /**
    * <p><a href="/document/product/266/14047">Key hotlink protection</a> rule.</p>
    */
    @SerializedName("UrlSignatureAuthPolicy")
    @Expose
    private UrlSignatureAuthPolicy UrlSignatureAuthPolicy;

    /**
    * <p>QUIC configuration.</p>
    */
    @SerializedName("QUICConfig")
    @Expose
    private DomainQUICConfig QUICConfig;

    /**
    * <p>IP access restriction rule.</p>
    */
    @SerializedName("IPFilterPolicy")
    @Expose
    private IPFilterPolicy IPFilterPolicy;

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
     * Get <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be set to the app ID when accessing resources in on-demand applications, whether in the default application or a newly created application.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p><a href="/document/product/266/14046">Referer hotlink protection</a> rule.</p> 
     * @return RefererAuthPolicy <p><a href="/document/product/266/14046">Referer hotlink protection</a> rule.</p>
     */
    public RefererAuthPolicy getRefererAuthPolicy() {
        return this.RefererAuthPolicy;
    }

    /**
     * Set <p><a href="/document/product/266/14046">Referer hotlink protection</a> rule.</p>
     * @param RefererAuthPolicy <p><a href="/document/product/266/14046">Referer hotlink protection</a> rule.</p>
     */
    public void setRefererAuthPolicy(RefererAuthPolicy RefererAuthPolicy) {
        this.RefererAuthPolicy = RefererAuthPolicy;
    }

    /**
     * Get <p><a href="/document/product/266/14047">Key hotlink protection</a> rule.</p> 
     * @return UrlSignatureAuthPolicy <p><a href="/document/product/266/14047">Key hotlink protection</a> rule.</p>
     */
    public UrlSignatureAuthPolicy getUrlSignatureAuthPolicy() {
        return this.UrlSignatureAuthPolicy;
    }

    /**
     * Set <p><a href="/document/product/266/14047">Key hotlink protection</a> rule.</p>
     * @param UrlSignatureAuthPolicy <p><a href="/document/product/266/14047">Key hotlink protection</a> rule.</p>
     */
    public void setUrlSignatureAuthPolicy(UrlSignatureAuthPolicy UrlSignatureAuthPolicy) {
        this.UrlSignatureAuthPolicy = UrlSignatureAuthPolicy;
    }

    /**
     * Get <p>QUIC configuration.</p> 
     * @return QUICConfig <p>QUIC configuration.</p>
     */
    public DomainQUICConfig getQUICConfig() {
        return this.QUICConfig;
    }

    /**
     * Set <p>QUIC configuration.</p>
     * @param QUICConfig <p>QUIC configuration.</p>
     */
    public void setQUICConfig(DomainQUICConfig QUICConfig) {
        this.QUICConfig = QUICConfig;
    }

    /**
     * Get <p>IP access restriction rule.</p> 
     * @return IPFilterPolicy <p>IP access restriction rule.</p>
     */
    public IPFilterPolicy getIPFilterPolicy() {
        return this.IPFilterPolicy;
    }

    /**
     * Set <p>IP access restriction rule.</p>
     * @param IPFilterPolicy <p>IP access restriction rule.</p>
     */
    public void setIPFilterPolicy(IPFilterPolicy IPFilterPolicy) {
        this.IPFilterPolicy = IPFilterPolicy;
    }

    public ModifyVodDomainConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVodDomainConfigRequest(ModifyVodDomainConfigRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.RefererAuthPolicy != null) {
            this.RefererAuthPolicy = new RefererAuthPolicy(source.RefererAuthPolicy);
        }
        if (source.UrlSignatureAuthPolicy != null) {
            this.UrlSignatureAuthPolicy = new UrlSignatureAuthPolicy(source.UrlSignatureAuthPolicy);
        }
        if (source.QUICConfig != null) {
            this.QUICConfig = new DomainQUICConfig(source.QUICConfig);
        }
        if (source.IPFilterPolicy != null) {
            this.IPFilterPolicy = new IPFilterPolicy(source.IPFilterPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "RefererAuthPolicy.", this.RefererAuthPolicy);
        this.setParamObj(map, prefix + "UrlSignatureAuthPolicy.", this.UrlSignatureAuthPolicy);
        this.setParamObj(map, prefix + "QUICConfig.", this.QUICConfig);
        this.setParamObj(map, prefix + "IPFilterPolicy.", this.IPFilterPolicy);

    }
}

