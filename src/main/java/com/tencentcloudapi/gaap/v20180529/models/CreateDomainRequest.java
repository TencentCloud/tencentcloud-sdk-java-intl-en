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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDomainRequest extends AbstractModel {

    /**
    * Listener ID.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Domain name to be created. Each listener supports up to 100 domain names.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Server certificate, which is used for the HTTPS interaction between client and GAAP.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Client CA certificate, which is used for the HTTPS interaction between client and GAAP.
This field is required only when the mutual authentication method is adopted.
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
    * Client CA certificate, which is used for the HTTPS interaction between the client and GAAP.
This field or the `ClientCertificateId` field is required for mutual authentication only.
    */
    @SerializedName("PolyClientCertificateIds")
    @Expose
    private String [] PolyClientCertificateIds;

    /**
    * Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
HTTP3 is not enabled by default. You can enable it with this field SetDomainHttp3.
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
     * Get Listener ID. 
     * @return ListenerId Listener ID.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID.
     * @param ListenerId Listener ID.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Domain name to be created. Each listener supports up to 100 domain names. 
     * @return Domain Domain name to be created. Each listener supports up to 100 domain names.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name to be created. Each listener supports up to 100 domain names.
     * @param Domain Domain name to be created. Each listener supports up to 100 domain names.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Server certificate, which is used for the HTTPS interaction between client and GAAP. 
     * @return CertificateId Server certificate, which is used for the HTTPS interaction between client and GAAP.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Server certificate, which is used for the HTTPS interaction between client and GAAP.
     * @param CertificateId Server certificate, which is used for the HTTPS interaction between client and GAAP.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Client CA certificate, which is used for the HTTPS interaction between client and GAAP.
This field is required only when the mutual authentication method is adopted. 
     * @return ClientCertificateId Client CA certificate, which is used for the HTTPS interaction between client and GAAP.
This field is required only when the mutual authentication method is adopted.
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * Set Client CA certificate, which is used for the HTTPS interaction between client and GAAP.
This field is required only when the mutual authentication method is adopted.
     * @param ClientCertificateId Client CA certificate, which is used for the HTTPS interaction between client and GAAP.
This field is required only when the mutual authentication method is adopted.
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * Get Client CA certificate, which is used for the HTTPS interaction between the client and GAAP.
This field or the `ClientCertificateId` field is required for mutual authentication only. 
     * @return PolyClientCertificateIds Client CA certificate, which is used for the HTTPS interaction between the client and GAAP.
This field or the `ClientCertificateId` field is required for mutual authentication only.
     */
    public String [] getPolyClientCertificateIds() {
        return this.PolyClientCertificateIds;
    }

    /**
     * Set Client CA certificate, which is used for the HTTPS interaction between the client and GAAP.
This field or the `ClientCertificateId` field is required for mutual authentication only.
     * @param PolyClientCertificateIds Client CA certificate, which is used for the HTTPS interaction between the client and GAAP.
This field or the `ClientCertificateId` field is required for mutual authentication only.
     */
    public void setPolyClientCertificateIds(String [] PolyClientCertificateIds) {
        this.PolyClientCertificateIds = PolyClientCertificateIds;
    }

    /**
     * Get Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
HTTP3 is not enabled by default. You can enable it with this field SetDomainHttp3. 
     * @return Http3Supported Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
HTTP3 is not enabled by default. You can enable it with this field SetDomainHttp3.
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
HTTP3 is not enabled by default. You can enable it with this field SetDomainHttp3.
     * @param Http3Supported Specifies whether to enable HTTP3. Valid values:
`0`: disable HTTP3;
`1`: enable HTTP3.
HTTP3 is not enabled by default. You can enable it with this field SetDomainHttp3.
     */
    public void setHttp3Supported(Long Http3Supported) {
        this.Http3Supported = Http3Supported;
    }

    public CreateDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDomainRequest(CreateDomainRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.ClientCertificateId != null) {
            this.ClientCertificateId = new String(source.ClientCertificateId);
        }
        if (source.PolyClientCertificateIds != null) {
            this.PolyClientCertificateIds = new String[source.PolyClientCertificateIds.length];
            for (int i = 0; i < source.PolyClientCertificateIds.length; i++) {
                this.PolyClientCertificateIds[i] = new String(source.PolyClientCertificateIds[i]);
            }
        }
        if (source.Http3Supported != null) {
            this.Http3Supported = new Long(source.Http3Supported);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ClientCertificateId", this.ClientCertificateId);
        this.setParamArraySimple(map, prefix + "PolyClientCertificateIds.", this.PolyClientCertificateIds);
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);

    }
}

