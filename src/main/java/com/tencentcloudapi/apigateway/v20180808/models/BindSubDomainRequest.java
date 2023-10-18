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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindSubDomainRequest extends AbstractModel {

    /**
    * Unique service ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Custom domain name to be bound.
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * Protocol supported by service. Valid values: http, https, http&https.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Network type. Valid values: OUTER, INNER.
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * Whether the default path mapping is used. The default value is `true`. If the value is `false`, the custom path mapping will be used and `PathMappingSet` will be required in this case.
    */
    @SerializedName("IsDefaultMapping")
    @Expose
    private Boolean IsDefaultMapping;

    /**
    * Default domain name.
    */
    @SerializedName("NetSubDomain")
    @Expose
    private String NetSubDomain;

    /**
    * Unique certificate ID of the custom domain name to be bound. The certificate can be uploaded if `Protocol` is `https` or `http&https`.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Custom domain name path mapping. It can contain up to 3 `Environment` values which can be set to only `test`, `prepub`, and `release`, respectively.
    */
    @SerializedName("PathMappingSet")
    @Expose
    private PathMapping [] PathMappingSet;

    /**
    * Whether to force HTTP requests to redirect to HTTPS. Default value: `false`. When this parameter is `true`, API Gateway will redirect all requests using the custom domain name over the HTTP protocol to the HTTPS protocol for forwarding.
    */
    @SerializedName("IsForcedHttps")
    @Expose
    private Boolean IsForcedHttps;

    /**
     * Get Unique service ID. 
     * @return ServiceId Unique service ID.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique service ID.
     * @param ServiceId Unique service ID.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Custom domain name to be bound. 
     * @return SubDomain Custom domain name to be bound.
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set Custom domain name to be bound.
     * @param SubDomain Custom domain name to be bound.
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get Protocol supported by service. Valid values: http, https, http&https. 
     * @return Protocol Protocol supported by service. Valid values: http, https, http&https.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol supported by service. Valid values: http, https, http&https.
     * @param Protocol Protocol supported by service. Valid values: http, https, http&https.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Network type. Valid values: OUTER, INNER. 
     * @return NetType Network type. Valid values: OUTER, INNER.
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type. Valid values: OUTER, INNER.
     * @param NetType Network type. Valid values: OUTER, INNER.
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Whether the default path mapping is used. The default value is `true`. If the value is `false`, the custom path mapping will be used and `PathMappingSet` will be required in this case. 
     * @return IsDefaultMapping Whether the default path mapping is used. The default value is `true`. If the value is `false`, the custom path mapping will be used and `PathMappingSet` will be required in this case.
     */
    public Boolean getIsDefaultMapping() {
        return this.IsDefaultMapping;
    }

    /**
     * Set Whether the default path mapping is used. The default value is `true`. If the value is `false`, the custom path mapping will be used and `PathMappingSet` will be required in this case.
     * @param IsDefaultMapping Whether the default path mapping is used. The default value is `true`. If the value is `false`, the custom path mapping will be used and `PathMappingSet` will be required in this case.
     */
    public void setIsDefaultMapping(Boolean IsDefaultMapping) {
        this.IsDefaultMapping = IsDefaultMapping;
    }

    /**
     * Get Default domain name. 
     * @return NetSubDomain Default domain name.
     */
    public String getNetSubDomain() {
        return this.NetSubDomain;
    }

    /**
     * Set Default domain name.
     * @param NetSubDomain Default domain name.
     */
    public void setNetSubDomain(String NetSubDomain) {
        this.NetSubDomain = NetSubDomain;
    }

    /**
     * Get Unique certificate ID of the custom domain name to be bound. The certificate can be uploaded if `Protocol` is `https` or `http&https`. 
     * @return CertificateId Unique certificate ID of the custom domain name to be bound. The certificate can be uploaded if `Protocol` is `https` or `http&https`.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Unique certificate ID of the custom domain name to be bound. The certificate can be uploaded if `Protocol` is `https` or `http&https`.
     * @param CertificateId Unique certificate ID of the custom domain name to be bound. The certificate can be uploaded if `Protocol` is `https` or `http&https`.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Custom domain name path mapping. It can contain up to 3 `Environment` values which can be set to only `test`, `prepub`, and `release`, respectively. 
     * @return PathMappingSet Custom domain name path mapping. It can contain up to 3 `Environment` values which can be set to only `test`, `prepub`, and `release`, respectively.
     */
    public PathMapping [] getPathMappingSet() {
        return this.PathMappingSet;
    }

    /**
     * Set Custom domain name path mapping. It can contain up to 3 `Environment` values which can be set to only `test`, `prepub`, and `release`, respectively.
     * @param PathMappingSet Custom domain name path mapping. It can contain up to 3 `Environment` values which can be set to only `test`, `prepub`, and `release`, respectively.
     */
    public void setPathMappingSet(PathMapping [] PathMappingSet) {
        this.PathMappingSet = PathMappingSet;
    }

    /**
     * Get Whether to force HTTP requests to redirect to HTTPS. Default value: `false`. When this parameter is `true`, API Gateway will redirect all requests using the custom domain name over the HTTP protocol to the HTTPS protocol for forwarding. 
     * @return IsForcedHttps Whether to force HTTP requests to redirect to HTTPS. Default value: `false`. When this parameter is `true`, API Gateway will redirect all requests using the custom domain name over the HTTP protocol to the HTTPS protocol for forwarding.
     */
    public Boolean getIsForcedHttps() {
        return this.IsForcedHttps;
    }

    /**
     * Set Whether to force HTTP requests to redirect to HTTPS. Default value: `false`. When this parameter is `true`, API Gateway will redirect all requests using the custom domain name over the HTTP protocol to the HTTPS protocol for forwarding.
     * @param IsForcedHttps Whether to force HTTP requests to redirect to HTTPS. Default value: `false`. When this parameter is `true`, API Gateway will redirect all requests using the custom domain name over the HTTP protocol to the HTTPS protocol for forwarding.
     */
    public void setIsForcedHttps(Boolean IsForcedHttps) {
        this.IsForcedHttps = IsForcedHttps;
    }

    public BindSubDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindSubDomainRequest(BindSubDomainRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.IsDefaultMapping != null) {
            this.IsDefaultMapping = new Boolean(source.IsDefaultMapping);
        }
        if (source.NetSubDomain != null) {
            this.NetSubDomain = new String(source.NetSubDomain);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.PathMappingSet != null) {
            this.PathMappingSet = new PathMapping[source.PathMappingSet.length];
            for (int i = 0; i < source.PathMappingSet.length; i++) {
                this.PathMappingSet[i] = new PathMapping(source.PathMappingSet[i]);
            }
        }
        if (source.IsForcedHttps != null) {
            this.IsForcedHttps = new Boolean(source.IsForcedHttps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "IsDefaultMapping", this.IsDefaultMapping);
        this.setParamSimple(map, prefix + "NetSubDomain", this.NetSubDomain);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamArrayObj(map, prefix + "PathMappingSet.", this.PathMappingSet);
        this.setParamSimple(map, prefix + "IsForcedHttps", this.IsForcedHttps);

    }
}

