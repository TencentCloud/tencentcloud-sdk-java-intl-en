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
    * Domain name resolution status. True: success; Flase: failure.
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
     * Get Domain name resolution status. True: success; Flase: failure. 
     * @return Status Domain name resolution status. True: success; Flase: failure.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Domain name resolution status. True: success; Flase: failure.
     * @param Status Domain name resolution status. True: success; Flase: failure.
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "IsDefaultMapping", this.IsDefaultMapping);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "NetType", this.NetType);

    }
}

