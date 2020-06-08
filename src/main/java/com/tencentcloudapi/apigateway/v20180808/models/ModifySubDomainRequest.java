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

public class ModifySubDomainRequest extends AbstractModel{

    /**
    * Unique service ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Custom domain name for which the path mapping is to be modified.
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * Whether to change to the default path mapping. true: use the default path mapping. false: use the custom path mapping.
    */
    @SerializedName("IsDefaultMapping")
    @Expose
    private Boolean IsDefaultMapping;

    /**
    * Certificate ID, which is required when the HTTPS protocol is included.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Modified custom domain name protocol type. Valid values: http, https, http&https.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Modified path mapping list.
    */
    @SerializedName("PathMappingSet")
    @Expose
    private PathMapping [] PathMappingSet;

    /**
    * Network type. Valid values: INNER, OUTER.
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

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
     * Get Custom domain name for which the path mapping is to be modified. 
     * @return SubDomain Custom domain name for which the path mapping is to be modified.
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set Custom domain name for which the path mapping is to be modified.
     * @param SubDomain Custom domain name for which the path mapping is to be modified.
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get Whether to change to the default path mapping. true: use the default path mapping. false: use the custom path mapping. 
     * @return IsDefaultMapping Whether to change to the default path mapping. true: use the default path mapping. false: use the custom path mapping.
     */
    public Boolean getIsDefaultMapping() {
        return this.IsDefaultMapping;
    }

    /**
     * Set Whether to change to the default path mapping. true: use the default path mapping. false: use the custom path mapping.
     * @param IsDefaultMapping Whether to change to the default path mapping. true: use the default path mapping. false: use the custom path mapping.
     */
    public void setIsDefaultMapping(Boolean IsDefaultMapping) {
        this.IsDefaultMapping = IsDefaultMapping;
    }

    /**
     * Get Certificate ID, which is required when the HTTPS protocol is included. 
     * @return CertificateId Certificate ID, which is required when the HTTPS protocol is included.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Certificate ID, which is required when the HTTPS protocol is included.
     * @param CertificateId Certificate ID, which is required when the HTTPS protocol is included.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Modified custom domain name protocol type. Valid values: http, https, http&https. 
     * @return Protocol Modified custom domain name protocol type. Valid values: http, https, http&https.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Modified custom domain name protocol type. Valid values: http, https, http&https.
     * @param Protocol Modified custom domain name protocol type. Valid values: http, https, http&https.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Modified path mapping list. 
     * @return PathMappingSet Modified path mapping list.
     */
    public PathMapping [] getPathMappingSet() {
        return this.PathMappingSet;
    }

    /**
     * Set Modified path mapping list.
     * @param PathMappingSet Modified path mapping list.
     */
    public void setPathMappingSet(PathMapping [] PathMappingSet) {
        this.PathMappingSet = PathMappingSet;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "IsDefaultMapping", this.IsDefaultMapping);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "PathMappingSet.", this.PathMappingSet);
        this.setParamSimple(map, prefix + "NetType", this.NetType);

    }
}

