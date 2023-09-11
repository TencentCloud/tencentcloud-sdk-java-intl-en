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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiGatewayInstanceDetail extends AbstractModel{

    /**
    * The instance ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * The instance name.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * The domain.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * The protocol.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get The instance ID. 
     * @return ServiceId The instance ID.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set The instance ID.
     * @param ServiceId The instance ID.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get The instance name. 
     * @return ServiceName The instance name.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set The instance name.
     * @param ServiceName The instance name.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get The domain. 
     * @return Domain The domain.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain.
     * @param Domain The domain.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The certificate ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CertId The certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set The certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CertId The certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get The protocol. 
     * @return Protocol The protocol.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The protocol.
     * @param Protocol The protocol.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public ApiGatewayInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiGatewayInstanceDetail(ApiGatewayInstanceDetail source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

