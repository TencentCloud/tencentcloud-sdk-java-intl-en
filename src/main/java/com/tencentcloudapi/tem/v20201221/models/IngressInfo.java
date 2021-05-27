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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IngressInfo extends AbstractModel{

    /**
    * tem namespaceId
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * eks namespace
    */
    @SerializedName("EksNamespace")
    @Expose
    private String EksNamespace;

    /**
    * ip version
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * ingress name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Rules configuration
    */
    @SerializedName("Rules")
    @Expose
    private IngressRule [] Rules;

    /**
    * clb ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClbId")
    @Expose
    private String ClbId;

    /**
    * TLS configuration
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tls")
    @Expose
    private IngressTls [] Tls;

    /**
    * eks clusterId
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * clb ip
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get tem namespaceId
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NamespaceId tem namespaceId
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set tem namespaceId
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NamespaceId tem namespaceId
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get eks namespace 
     * @return EksNamespace eks namespace
     */
    public String getEksNamespace() {
        return this.EksNamespace;
    }

    /**
     * Set eks namespace
     * @param EksNamespace eks namespace
     */
    public void setEksNamespace(String EksNamespace) {
        this.EksNamespace = EksNamespace;
    }

    /**
     * Get ip version 
     * @return AddressIPVersion ip version
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set ip version
     * @param AddressIPVersion ip version
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get ingress name 
     * @return Name ingress name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set ingress name
     * @param Name ingress name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Rules configuration 
     * @return Rules Rules configuration
     */
    public IngressRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Rules configuration
     * @param Rules Rules configuration
     */
    public void setRules(IngressRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get clb ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClbId clb ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClbId() {
        return this.ClbId;
    }

    /**
     * Set clb ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClbId clb ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClbId(String ClbId) {
        this.ClbId = ClbId;
    }

    /**
     * Get TLS configuration
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tls TLS configuration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public IngressTls [] getTls() {
        return this.Tls;
    }

    /**
     * Set TLS configuration
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tls TLS configuration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTls(IngressTls [] Tls) {
        this.Tls = Tls;
    }

    /**
     * Get eks clusterId
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClusterId eks clusterId
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set eks clusterId
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClusterId eks clusterId
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get clb ip
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Vip clb ip
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set clb ip
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Vip clb ip
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public IngressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IngressInfo(IngressInfo source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.EksNamespace != null) {
            this.EksNamespace = new String(source.EksNamespace);
        }
        if (source.AddressIPVersion != null) {
            this.AddressIPVersion = new String(source.AddressIPVersion);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rules != null) {
            this.Rules = new IngressRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new IngressRule(source.Rules[i]);
            }
        }
        if (source.ClbId != null) {
            this.ClbId = new String(source.ClbId);
        }
        if (source.Tls != null) {
            this.Tls = new IngressTls[source.Tls.length];
            for (int i = 0; i < source.Tls.length; i++) {
                this.Tls[i] = new IngressTls(source.Tls[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "EksNamespace", this.EksNamespace);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "ClbId", this.ClbId);
        this.setParamArrayObj(map, prefix + "Tls.", this.Tls);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

