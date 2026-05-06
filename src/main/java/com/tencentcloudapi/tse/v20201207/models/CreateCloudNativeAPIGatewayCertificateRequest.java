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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudNativeAPIGatewayCertificateRequest extends AbstractModel {

    /**
    * Gateway ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Bound domain name
    */
    @SerializedName("BindDomains")
    @Expose
    private String [] BindDomains;

    /**
    * ssl platform cert Id
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Certificate Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Certificate Private Key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Certificate in pem format
    */
    @SerializedName("Crt")
    @Expose
    private String Crt;

    /**
     * Get Gateway ID 
     * @return GatewayId Gateway ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway ID
     * @param GatewayId Gateway ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Bound domain name 
     * @return BindDomains Bound domain name
     */
    public String [] getBindDomains() {
        return this.BindDomains;
    }

    /**
     * Set Bound domain name
     * @param BindDomains Bound domain name
     */
    public void setBindDomains(String [] BindDomains) {
        this.BindDomains = BindDomains;
    }

    /**
     * Get ssl platform cert Id 
     * @return CertId ssl platform cert Id
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set ssl platform cert Id
     * @param CertId ssl platform cert Id
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Certificate Name 
     * @return Name Certificate Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Certificate Name
     * @param Name Certificate Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Certificate Private Key 
     * @return Key Certificate Private Key
     * @deprecated
     */
    @Deprecated
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Certificate Private Key
     * @param Key Certificate Private Key
     * @deprecated
     */
    @Deprecated
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Certificate in pem format 
     * @return Crt Certificate in pem format
     * @deprecated
     */
    @Deprecated
    public String getCrt() {
        return this.Crt;
    }

    /**
     * Set Certificate in pem format
     * @param Crt Certificate in pem format
     * @deprecated
     */
    @Deprecated
    public void setCrt(String Crt) {
        this.Crt = Crt;
    }

    public CreateCloudNativeAPIGatewayCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayCertificateRequest(CreateCloudNativeAPIGatewayCertificateRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.BindDomains != null) {
            this.BindDomains = new String[source.BindDomains.length];
            for (int i = 0; i < source.BindDomains.length; i++) {
                this.BindDomains[i] = new String(source.BindDomains[i]);
            }
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Crt != null) {
            this.Crt = new String(source.Crt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamArraySimple(map, prefix + "BindDomains.", this.BindDomains);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Crt", this.Crt);

    }
}

