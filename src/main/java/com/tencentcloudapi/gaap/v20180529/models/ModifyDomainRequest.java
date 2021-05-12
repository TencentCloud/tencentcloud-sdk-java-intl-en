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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainRequest extends AbstractModel{

    /**
    * Layer-7 listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Original domain name information
    */
    @SerializedName("OldDomain")
    @Expose
    private String OldDomain;

    /**
    * New domain name information
    */
    @SerializedName("NewDomain")
    @Expose
    private String NewDomain;

    /**
    * Server SSL certificate ID. It's only applicable to the connections of version 3.0:
If this field is not passed in, the original certificate will be used;
If this field is passed in, and CertificateId=default, the listener certificate will be used;
For other cases, the certificate specified by CertificateId will be used.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Client CA certificate ID. It's only applicable to the connections of version 3.0:
If this field is not passed in, the original certificate will be used;
If this field is passed in, and ClientCertificateId=default, the listener certificate will be used;
For other cases, the certificate specified by ClientCertificateId will be used.
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
    * Client CA certificate ID. It is only applicable to connections on version 3.0, where:
If this field and `ClientCertificateId` are not included, the original certificate will be used;
If this field is included, and ClientCertificateId=default, then the listener certificate will be used;
In other cases, the certificate specified by `ClientCertificateId` or `PolyClientCertificateIds` will be used.
    */
    @SerializedName("PolyClientCertificateIds")
    @Expose
    private String [] PolyClientCertificateIds;

    /**
     * Get Layer-7 listener ID 
     * @return ListenerId Layer-7 listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Layer-7 listener ID
     * @param ListenerId Layer-7 listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Original domain name information 
     * @return OldDomain Original domain name information
     */
    public String getOldDomain() {
        return this.OldDomain;
    }

    /**
     * Set Original domain name information
     * @param OldDomain Original domain name information
     */
    public void setOldDomain(String OldDomain) {
        this.OldDomain = OldDomain;
    }

    /**
     * Get New domain name information 
     * @return NewDomain New domain name information
     */
    public String getNewDomain() {
        return this.NewDomain;
    }

    /**
     * Set New domain name information
     * @param NewDomain New domain name information
     */
    public void setNewDomain(String NewDomain) {
        this.NewDomain = NewDomain;
    }

    /**
     * Get Server SSL certificate ID. It's only applicable to the connections of version 3.0:
If this field is not passed in, the original certificate will be used;
If this field is passed in, and CertificateId=default, the listener certificate will be used;
For other cases, the certificate specified by CertificateId will be used. 
     * @return CertificateId Server SSL certificate ID. It's only applicable to the connections of version 3.0:
If this field is not passed in, the original certificate will be used;
If this field is passed in, and CertificateId=default, the listener certificate will be used;
For other cases, the certificate specified by CertificateId will be used.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Server SSL certificate ID. It's only applicable to the connections of version 3.0:
If this field is not passed in, the original certificate will be used;
If this field is passed in, and CertificateId=default, the listener certificate will be used;
For other cases, the certificate specified by CertificateId will be used.
     * @param CertificateId Server SSL certificate ID. It's only applicable to the connections of version 3.0:
If this field is not passed in, the original certificate will be used;
If this field is passed in, and CertificateId=default, the listener certificate will be used;
For other cases, the certificate specified by CertificateId will be used.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Client CA certificate ID. It's only applicable to the connections of version 3.0:
If this field is not passed in, the original certificate will be used;
If this field is passed in, and ClientCertificateId=default, the listener certificate will be used;
For other cases, the certificate specified by ClientCertificateId will be used. 
     * @return ClientCertificateId Client CA certificate ID. It's only applicable to the connections of version 3.0:
If this field is not passed in, the original certificate will be used;
If this field is passed in, and ClientCertificateId=default, the listener certificate will be used;
For other cases, the certificate specified by ClientCertificateId will be used.
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * Set Client CA certificate ID. It's only applicable to the connections of version 3.0:
If this field is not passed in, the original certificate will be used;
If this field is passed in, and ClientCertificateId=default, the listener certificate will be used;
For other cases, the certificate specified by ClientCertificateId will be used.
     * @param ClientCertificateId Client CA certificate ID. It's only applicable to the connections of version 3.0:
If this field is not passed in, the original certificate will be used;
If this field is passed in, and ClientCertificateId=default, the listener certificate will be used;
For other cases, the certificate specified by ClientCertificateId will be used.
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * Get Client CA certificate ID. It is only applicable to connections on version 3.0, where:
If this field and `ClientCertificateId` are not included, the original certificate will be used;
If this field is included, and ClientCertificateId=default, then the listener certificate will be used;
In other cases, the certificate specified by `ClientCertificateId` or `PolyClientCertificateIds` will be used. 
     * @return PolyClientCertificateIds Client CA certificate ID. It is only applicable to connections on version 3.0, where:
If this field and `ClientCertificateId` are not included, the original certificate will be used;
If this field is included, and ClientCertificateId=default, then the listener certificate will be used;
In other cases, the certificate specified by `ClientCertificateId` or `PolyClientCertificateIds` will be used.
     */
    public String [] getPolyClientCertificateIds() {
        return this.PolyClientCertificateIds;
    }

    /**
     * Set Client CA certificate ID. It is only applicable to connections on version 3.0, where:
If this field and `ClientCertificateId` are not included, the original certificate will be used;
If this field is included, and ClientCertificateId=default, then the listener certificate will be used;
In other cases, the certificate specified by `ClientCertificateId` or `PolyClientCertificateIds` will be used.
     * @param PolyClientCertificateIds Client CA certificate ID. It is only applicable to connections on version 3.0, where:
If this field and `ClientCertificateId` are not included, the original certificate will be used;
If this field is included, and ClientCertificateId=default, then the listener certificate will be used;
In other cases, the certificate specified by `ClientCertificateId` or `PolyClientCertificateIds` will be used.
     */
    public void setPolyClientCertificateIds(String [] PolyClientCertificateIds) {
        this.PolyClientCertificateIds = PolyClientCertificateIds;
    }

    public ModifyDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainRequest(ModifyDomainRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.OldDomain != null) {
            this.OldDomain = new String(source.OldDomain);
        }
        if (source.NewDomain != null) {
            this.NewDomain = new String(source.NewDomain);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "OldDomain", this.OldDomain);
        this.setParamSimple(map, prefix + "NewDomain", this.NewDomain);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ClientCertificateId", this.ClientCertificateId);
        this.setParamArraySimple(map, prefix + "PolyClientCertificateIds.", this.PolyClientCertificateIds);

    }
}

