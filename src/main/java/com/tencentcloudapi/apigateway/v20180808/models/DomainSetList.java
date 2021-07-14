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

public class DomainSetList extends AbstractModel{

    /**
    * Domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Domain name resolution status. True: success; False: failure.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Certificate ID.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Whether the default path mapping is used.
    */
    @SerializedName("IsDefaultMapping")
    @Expose
    private Boolean IsDefaultMapping;

    /**
    * Custom domain name protocol type.
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
    * Whether to force HTTP requests to redirect to HTTPS. Default value: `false`. When this parameter is `true`, API Gateway will redirect all requests using the custom domain name over the HTTP protocol to the HTTPS protocol for forwarding.
    */
    @SerializedName("IsForcedHttps")
    @Expose
    private Boolean IsForcedHttps;

    /**
    * ICP filing status
    */
    @SerializedName("RegistrationStatus")
    @Expose
    private Boolean RegistrationStatus;

    /**
     * Get Domain name. 
     * @return DomainName Domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Domain name.
     * @param DomainName Domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Domain name resolution status. True: success; False: failure. 
     * @return Status Domain name resolution status. True: success; False: failure.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Domain name resolution status. True: success; False: failure.
     * @param Status Domain name resolution status. True: success; False: failure.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Certificate ID. 
     * @return CertificateId Certificate ID.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Certificate ID.
     * @param CertificateId Certificate ID.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Whether the default path mapping is used. 
     * @return IsDefaultMapping Whether the default path mapping is used.
     */
    public Boolean getIsDefaultMapping() {
        return this.IsDefaultMapping;
    }

    /**
     * Set Whether the default path mapping is used.
     * @param IsDefaultMapping Whether the default path mapping is used.
     */
    public void setIsDefaultMapping(Boolean IsDefaultMapping) {
        this.IsDefaultMapping = IsDefaultMapping;
    }

    /**
     * Get Custom domain name protocol type. 
     * @return Protocol Custom domain name protocol type.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Custom domain name protocol type.
     * @param Protocol Custom domain name protocol type.
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

    /**
     * Get ICP filing status 
     * @return RegistrationStatus ICP filing status
     */
    public Boolean getRegistrationStatus() {
        return this.RegistrationStatus;
    }

    /**
     * Set ICP filing status
     * @param RegistrationStatus ICP filing status
     */
    public void setRegistrationStatus(Boolean RegistrationStatus) {
        this.RegistrationStatus = RegistrationStatus;
    }

    public DomainSetList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainSetList(DomainSetList source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.IsDefaultMapping != null) {
            this.IsDefaultMapping = new Boolean(source.IsDefaultMapping);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.IsForcedHttps != null) {
            this.IsForcedHttps = new Boolean(source.IsForcedHttps);
        }
        if (source.RegistrationStatus != null) {
            this.RegistrationStatus = new Boolean(source.RegistrationStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "IsDefaultMapping", this.IsDefaultMapping);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "IsForcedHttps", this.IsForcedHttps);
        this.setParamSimple(map, prefix + "RegistrationStatus", this.RegistrationStatus);

    }
}

