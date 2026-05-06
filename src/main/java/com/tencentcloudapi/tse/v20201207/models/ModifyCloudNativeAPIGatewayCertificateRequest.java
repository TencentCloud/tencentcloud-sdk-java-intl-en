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

public class ModifyCloudNativeAPIGatewayCertificateRequest extends AbstractModel {

    /**
    * gateway ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Certificate ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Certificate name, will already be deprecated
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Certificate private key. Required when CertSource is native.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Certificate in pem format. Required when CertSource is native.
    */
    @SerializedName("Crt")
    @Expose
    private String Crt;

    /**
    * Bound domain names will already be deprecated
    */
    @SerializedName("BindDomains")
    @Expose
    private String [] BindDomains;

    /**
    * ssl platform cert Id. Required when CertSource is ssl.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Certificate source
-ssl (Platform Cert), default value
-native (kong custom certificate) 

    */
    @SerializedName("CertSource")
    @Expose
    private String CertSource;

    /**
     * Get gateway ID 
     * @return GatewayId gateway ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set gateway ID
     * @param GatewayId gateway ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Certificate ID. 
     * @return Id Certificate ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Certificate ID.
     * @param Id Certificate ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Certificate name, will already be deprecated 
     * @return Name Certificate name, will already be deprecated
     * @deprecated
     */
    @Deprecated
    public String getName() {
        return this.Name;
    }

    /**
     * Set Certificate name, will already be deprecated
     * @param Name Certificate name, will already be deprecated
     * @deprecated
     */
    @Deprecated
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Certificate private key. Required when CertSource is native. 
     * @return Key Certificate private key. Required when CertSource is native.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Certificate private key. Required when CertSource is native.
     * @param Key Certificate private key. Required when CertSource is native.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Certificate in pem format. Required when CertSource is native. 
     * @return Crt Certificate in pem format. Required when CertSource is native.
     */
    public String getCrt() {
        return this.Crt;
    }

    /**
     * Set Certificate in pem format. Required when CertSource is native.
     * @param Crt Certificate in pem format. Required when CertSource is native.
     */
    public void setCrt(String Crt) {
        this.Crt = Crt;
    }

    /**
     * Get Bound domain names will already be deprecated 
     * @return BindDomains Bound domain names will already be deprecated
     * @deprecated
     */
    @Deprecated
    public String [] getBindDomains() {
        return this.BindDomains;
    }

    /**
     * Set Bound domain names will already be deprecated
     * @param BindDomains Bound domain names will already be deprecated
     * @deprecated
     */
    @Deprecated
    public void setBindDomains(String [] BindDomains) {
        this.BindDomains = BindDomains;
    }

    /**
     * Get ssl platform cert Id. Required when CertSource is ssl. 
     * @return CertId ssl platform cert Id. Required when CertSource is ssl.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set ssl platform cert Id. Required when CertSource is ssl.
     * @param CertId ssl platform cert Id. Required when CertSource is ssl.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Certificate source
-ssl (Platform Cert), default value
-native (kong custom certificate) 
 
     * @return CertSource Certificate source
-ssl (Platform Cert), default value
-native (kong custom certificate) 

     */
    public String getCertSource() {
        return this.CertSource;
    }

    /**
     * Set Certificate source
-ssl (Platform Cert), default value
-native (kong custom certificate) 

     * @param CertSource Certificate source
-ssl (Platform Cert), default value
-native (kong custom certificate) 

     */
    public void setCertSource(String CertSource) {
        this.CertSource = CertSource;
    }

    public ModifyCloudNativeAPIGatewayCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudNativeAPIGatewayCertificateRequest(ModifyCloudNativeAPIGatewayCertificateRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
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
        if (source.BindDomains != null) {
            this.BindDomains = new String[source.BindDomains.length];
            for (int i = 0; i < source.BindDomains.length; i++) {
                this.BindDomains[i] = new String(source.BindDomains[i]);
            }
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.CertSource != null) {
            this.CertSource = new String(source.CertSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Crt", this.Crt);
        this.setParamArraySimple(map, prefix + "BindDomains.", this.BindDomains);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertSource", this.CertSource);

    }
}

