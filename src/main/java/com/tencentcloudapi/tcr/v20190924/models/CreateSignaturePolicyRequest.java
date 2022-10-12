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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSignaturePolicyRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Namespace name
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * KMS key
    */
    @SerializedName("KmsId")
    @Expose
    private String KmsId;

    /**
    * Region of the KMS key
    */
    @SerializedName("KmsRegion")
    @Expose
    private String KmsRegion;

    /**
    * Custom domain name. If this parameter is left empty, the default domain name of the TCR instance will be used to generate the signature.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Whether to disable the signing policy. Default value: false.
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
     * Get Instance ID 
     * @return RegistryId Instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID
     * @param RegistryId Instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Policy name 
     * @return Name Policy name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Policy name
     * @param Name Policy name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Namespace name 
     * @return NamespaceName Namespace name
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set Namespace name
     * @param NamespaceName Namespace name
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get KMS key 
     * @return KmsId KMS key
     */
    public String getKmsId() {
        return this.KmsId;
    }

    /**
     * Set KMS key
     * @param KmsId KMS key
     */
    public void setKmsId(String KmsId) {
        this.KmsId = KmsId;
    }

    /**
     * Get Region of the KMS key 
     * @return KmsRegion Region of the KMS key
     */
    public String getKmsRegion() {
        return this.KmsRegion;
    }

    /**
     * Set Region of the KMS key
     * @param KmsRegion Region of the KMS key
     */
    public void setKmsRegion(String KmsRegion) {
        this.KmsRegion = KmsRegion;
    }

    /**
     * Get Custom domain name. If this parameter is left empty, the default domain name of the TCR instance will be used to generate the signature. 
     * @return Domain Custom domain name. If this parameter is left empty, the default domain name of the TCR instance will be used to generate the signature.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Custom domain name. If this parameter is left empty, the default domain name of the TCR instance will be used to generate the signature.
     * @param Domain Custom domain name. If this parameter is left empty, the default domain name of the TCR instance will be used to generate the signature.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Whether to disable the signing policy. Default value: false. 
     * @return Disabled Whether to disable the signing policy. Default value: false.
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set Whether to disable the signing policy. Default value: false.
     * @param Disabled Whether to disable the signing policy. Default value: false.
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    public CreateSignaturePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSignaturePolicyRequest(CreateSignaturePolicyRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.KmsId != null) {
            this.KmsId = new String(source.KmsId);
        }
        if (source.KmsRegion != null) {
            this.KmsRegion = new String(source.KmsRegion);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Disabled != null) {
            this.Disabled = new Boolean(source.Disabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "KmsId", this.KmsId);
        this.setParamSimple(map, prefix + "KmsRegion", this.KmsRegion);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);

    }
}

