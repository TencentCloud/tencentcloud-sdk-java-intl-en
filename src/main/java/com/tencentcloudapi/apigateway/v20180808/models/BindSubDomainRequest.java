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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindSubDomainRequest extends AbstractModel{

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
    * Protocols supported by service. Valid values: http, https, http&https.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Network type. Valid values: INNER, OUTER.
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * Whether to use the default path mapping. The default value is `true`. If the value is `false`, the custom path mapping will be used and `PathMappingSet` is required.
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
    * Unique ID of the certificate of the custom domain name to be bound. The certificate can be uploaded only when `Protocol` is `https` or `http&https`.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Custom domain name path mapping. It can contain up to 3 `Environment` parameters which can be set to only `test`, `prepub`, or `release`.
    */
    @SerializedName("PathMappingSet")
    @Expose
    private PathMapping [] PathMappingSet;

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
     * Get Protocols supported by service. Valid values: http, https, http&https. 
     * @return Protocol Protocols supported by service. Valid values: http, https, http&https.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocols supported by service. Valid values: http, https, http&https.
     * @param Protocol Protocols supported by service. Valid values: http, https, http&https.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Network type. Valid values: INNER, OUTER. 
     * @return NetType Network type. Valid values: INNER, OUTER.
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type. Valid values: INNER, OUTER.
     * @param NetType Network type. Valid values: INNER, OUTER.
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Whether to use the default path mapping. The default value is `true`. If the value is `false`, the custom path mapping will be used and `PathMappingSet` is required. 
     * @return IsDefaultMapping Whether to use the default path mapping. The default value is `true`. If the value is `false`, the custom path mapping will be used and `PathMappingSet` is required.
     */
    public Boolean getIsDefaultMapping() {
        return this.IsDefaultMapping;
    }

    /**
     * Set Whether to use the default path mapping. The default value is `true`. If the value is `false`, the custom path mapping will be used and `PathMappingSet` is required.
     * @param IsDefaultMapping Whether to use the default path mapping. The default value is `true`. If the value is `false`, the custom path mapping will be used and `PathMappingSet` is required.
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
     * Get Unique ID of the certificate of the custom domain name to be bound. The certificate can be uploaded only when `Protocol` is `https` or `http&https`. 
     * @return CertificateId Unique ID of the certificate of the custom domain name to be bound. The certificate can be uploaded only when `Protocol` is `https` or `http&https`.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Unique ID of the certificate of the custom domain name to be bound. The certificate can be uploaded only when `Protocol` is `https` or `http&https`.
     * @param CertificateId Unique ID of the certificate of the custom domain name to be bound. The certificate can be uploaded only when `Protocol` is `https` or `http&https`.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Custom domain name path mapping. It can contain up to 3 `Environment` parameters which can be set to only `test`, `prepub`, or `release`. 
     * @return PathMappingSet Custom domain name path mapping. It can contain up to 3 `Environment` parameters which can be set to only `test`, `prepub`, or `release`.
     */
    public PathMapping [] getPathMappingSet() {
        return this.PathMappingSet;
    }

    /**
     * Set Custom domain name path mapping. It can contain up to 3 `Environment` parameters which can be set to only `test`, `prepub`, or `release`.
     * @param PathMappingSet Custom domain name path mapping. It can contain up to 3 `Environment` parameters which can be set to only `test`, `prepub`, or `release`.
     */
    public void setPathMappingSet(PathMapping [] PathMappingSet) {
        this.PathMappingSet = PathMappingSet;
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

    }
}

