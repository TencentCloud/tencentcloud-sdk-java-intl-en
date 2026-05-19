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

public class DomainDetailInfo extends AbstractModel {

    /**
    * <p>Domain name.</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Acceleration region information.</p>
    */
    @SerializedName("AccelerateAreaInfos")
    @Expose
    private AccelerateAreaInfo [] AccelerateAreaInfos;

    /**
    * <p>Deployment state. Valid values:</p><li>Online: Goes live.</li><li>Deploying: Deployment in progress.</li><li>Locked: Locked. When this state occurs, unable to perform deployment change on that domain name.</li>
    */
    @SerializedName("DeployStatus")
    @Expose
    private String DeployStatus;

    /**
    * <p>HTTPS configuration message.</p>
    */
    @SerializedName("HTTPSConfig")
    @Expose
    private DomainHTTPSConfig HTTPSConfig;

    /**
    * <p><a href="https://www.tencentcloud.com/document/product/266/14047?from_cn_redirect=1">Key hotlink protection</a> configuration message.</p>
    */
    @SerializedName("UrlSignatureAuthPolicy")
    @Expose
    private UrlSignatureAuthPolicy UrlSignatureAuthPolicy;

    /**
    * <p><a href="https://www.tencentcloud.com/document/product/266/14046?from_cn_redirect=1">Referer hotlink protection</a> configuration message.</p>
    */
    @SerializedName("RefererAuthPolicy")
    @Expose
    private RefererAuthPolicy RefererAuthPolicy;

    /**
    * <p>The time when the domain name is added to the Tencent Cloud VOD system.</p><li>Format according to ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</li>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Domain name QUIC configuration message.</p>
    */
    @SerializedName("QUICConfig")
    @Expose
    private DomainQUICConfig QUICConfig;

    /**
    * <p>IP access restriction configuration message.</p>
    */
    @SerializedName("IPFilterPolicy")
    @Expose
    private IPFilterPolicy IPFilterPolicy;

    /**
    * <p>Domain type. Valid values: <li>VOD: Domain name distributed by using the VOD product;</li> <li>EdgeOne: Domain name distributed by using the EdgeOne product.</li></p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
     * Get <p>Acceleration region information.</p> 
     * @return AccelerateAreaInfos <p>Acceleration region information.</p>
     */
    public AccelerateAreaInfo [] getAccelerateAreaInfos() {
        return this.AccelerateAreaInfos;
    }

    /**
     * Set <p>Acceleration region information.</p>
     * @param AccelerateAreaInfos <p>Acceleration region information.</p>
     */
    public void setAccelerateAreaInfos(AccelerateAreaInfo [] AccelerateAreaInfos) {
        this.AccelerateAreaInfos = AccelerateAreaInfos;
    }

    /**
     * Get <p>Deployment state. Valid values:</p><li>Online: Goes live.</li><li>Deploying: Deployment in progress.</li><li>Locked: Locked. When this state occurs, unable to perform deployment change on that domain name.</li> 
     * @return DeployStatus <p>Deployment state. Valid values:</p><li>Online: Goes live.</li><li>Deploying: Deployment in progress.</li><li>Locked: Locked. When this state occurs, unable to perform deployment change on that domain name.</li>
     */
    public String getDeployStatus() {
        return this.DeployStatus;
    }

    /**
     * Set <p>Deployment state. Valid values:</p><li>Online: Goes live.</li><li>Deploying: Deployment in progress.</li><li>Locked: Locked. When this state occurs, unable to perform deployment change on that domain name.</li>
     * @param DeployStatus <p>Deployment state. Valid values:</p><li>Online: Goes live.</li><li>Deploying: Deployment in progress.</li><li>Locked: Locked. When this state occurs, unable to perform deployment change on that domain name.</li>
     */
    public void setDeployStatus(String DeployStatus) {
        this.DeployStatus = DeployStatus;
    }

    /**
     * Get <p>HTTPS configuration message.</p> 
     * @return HTTPSConfig <p>HTTPS configuration message.</p>
     */
    public DomainHTTPSConfig getHTTPSConfig() {
        return this.HTTPSConfig;
    }

    /**
     * Set <p>HTTPS configuration message.</p>
     * @param HTTPSConfig <p>HTTPS configuration message.</p>
     */
    public void setHTTPSConfig(DomainHTTPSConfig HTTPSConfig) {
        this.HTTPSConfig = HTTPSConfig;
    }

    /**
     * Get <p><a href="https://www.tencentcloud.com/document/product/266/14047?from_cn_redirect=1">Key hotlink protection</a> configuration message.</p> 
     * @return UrlSignatureAuthPolicy <p><a href="https://www.tencentcloud.com/document/product/266/14047?from_cn_redirect=1">Key hotlink protection</a> configuration message.</p>
     */
    public UrlSignatureAuthPolicy getUrlSignatureAuthPolicy() {
        return this.UrlSignatureAuthPolicy;
    }

    /**
     * Set <p><a href="https://www.tencentcloud.com/document/product/266/14047?from_cn_redirect=1">Key hotlink protection</a> configuration message.</p>
     * @param UrlSignatureAuthPolicy <p><a href="https://www.tencentcloud.com/document/product/266/14047?from_cn_redirect=1">Key hotlink protection</a> configuration message.</p>
     */
    public void setUrlSignatureAuthPolicy(UrlSignatureAuthPolicy UrlSignatureAuthPolicy) {
        this.UrlSignatureAuthPolicy = UrlSignatureAuthPolicy;
    }

    /**
     * Get <p><a href="https://www.tencentcloud.com/document/product/266/14046?from_cn_redirect=1">Referer hotlink protection</a> configuration message.</p> 
     * @return RefererAuthPolicy <p><a href="https://www.tencentcloud.com/document/product/266/14046?from_cn_redirect=1">Referer hotlink protection</a> configuration message.</p>
     */
    public RefererAuthPolicy getRefererAuthPolicy() {
        return this.RefererAuthPolicy;
    }

    /**
     * Set <p><a href="https://www.tencentcloud.com/document/product/266/14046?from_cn_redirect=1">Referer hotlink protection</a> configuration message.</p>
     * @param RefererAuthPolicy <p><a href="https://www.tencentcloud.com/document/product/266/14046?from_cn_redirect=1">Referer hotlink protection</a> configuration message.</p>
     */
    public void setRefererAuthPolicy(RefererAuthPolicy RefererAuthPolicy) {
        this.RefererAuthPolicy = RefererAuthPolicy;
    }

    /**
     * Get <p>The time when the domain name is added to the Tencent Cloud VOD system.</p><li>Format according to ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</li> 
     * @return CreateTime <p>The time when the domain name is added to the Tencent Cloud VOD system.</p><li>Format according to ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</li>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>The time when the domain name is added to the Tencent Cloud VOD system.</p><li>Format according to ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</li>
     * @param CreateTime <p>The time when the domain name is added to the Tencent Cloud VOD system.</p><li>Format according to ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</li>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Domain name QUIC configuration message.</p> 
     * @return QUICConfig <p>Domain name QUIC configuration message.</p>
     */
    public DomainQUICConfig getQUICConfig() {
        return this.QUICConfig;
    }

    /**
     * Set <p>Domain name QUIC configuration message.</p>
     * @param QUICConfig <p>Domain name QUIC configuration message.</p>
     */
    public void setQUICConfig(DomainQUICConfig QUICConfig) {
        this.QUICConfig = QUICConfig;
    }

    /**
     * Get <p>IP access restriction configuration message.</p> 
     * @return IPFilterPolicy <p>IP access restriction configuration message.</p>
     */
    public IPFilterPolicy getIPFilterPolicy() {
        return this.IPFilterPolicy;
    }

    /**
     * Set <p>IP access restriction configuration message.</p>
     * @param IPFilterPolicy <p>IP access restriction configuration message.</p>
     */
    public void setIPFilterPolicy(IPFilterPolicy IPFilterPolicy) {
        this.IPFilterPolicy = IPFilterPolicy;
    }

    /**
     * Get <p>Domain type. Valid values: <li>VOD: Domain name distributed by using the VOD product;</li> <li>EdgeOne: Domain name distributed by using the EdgeOne product.</li></p> 
     * @return Type <p>Domain type. Valid values: <li>VOD: Domain name distributed by using the VOD product;</li> <li>EdgeOne: Domain name distributed by using the EdgeOne product.</li></p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Domain type. Valid values: <li>VOD: Domain name distributed by using the VOD product;</li> <li>EdgeOne: Domain name distributed by using the EdgeOne product.</li></p>
     * @param Type <p>Domain type. Valid values: <li>VOD: Domain name distributed by using the VOD product;</li> <li>EdgeOne: Domain name distributed by using the EdgeOne product.</li></p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DomainDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainDetailInfo(DomainDetailInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AccelerateAreaInfos != null) {
            this.AccelerateAreaInfos = new AccelerateAreaInfo[source.AccelerateAreaInfos.length];
            for (int i = 0; i < source.AccelerateAreaInfos.length; i++) {
                this.AccelerateAreaInfos[i] = new AccelerateAreaInfo(source.AccelerateAreaInfos[i]);
            }
        }
        if (source.DeployStatus != null) {
            this.DeployStatus = new String(source.DeployStatus);
        }
        if (source.HTTPSConfig != null) {
            this.HTTPSConfig = new DomainHTTPSConfig(source.HTTPSConfig);
        }
        if (source.UrlSignatureAuthPolicy != null) {
            this.UrlSignatureAuthPolicy = new UrlSignatureAuthPolicy(source.UrlSignatureAuthPolicy);
        }
        if (source.RefererAuthPolicy != null) {
            this.RefererAuthPolicy = new RefererAuthPolicy(source.RefererAuthPolicy);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.QUICConfig != null) {
            this.QUICConfig = new DomainQUICConfig(source.QUICConfig);
        }
        if (source.IPFilterPolicy != null) {
            this.IPFilterPolicy = new IPFilterPolicy(source.IPFilterPolicy);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "AccelerateAreaInfos.", this.AccelerateAreaInfos);
        this.setParamSimple(map, prefix + "DeployStatus", this.DeployStatus);
        this.setParamObj(map, prefix + "HTTPSConfig.", this.HTTPSConfig);
        this.setParamObj(map, prefix + "UrlSignatureAuthPolicy.", this.UrlSignatureAuthPolicy);
        this.setParamObj(map, prefix + "RefererAuthPolicy.", this.RefererAuthPolicy);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "QUICConfig.", this.QUICConfig);
        this.setParamObj(map, prefix + "IPFilterPolicy.", this.IPFilterPolicy);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

