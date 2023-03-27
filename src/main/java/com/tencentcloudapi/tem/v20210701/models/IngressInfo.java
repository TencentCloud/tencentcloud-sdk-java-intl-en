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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IngressInfo extends AbstractModel{

    /**
    * Environment ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Environment namespace
    */
    @SerializedName("ClusterNamespace")
    @Expose
    private String ClusterNamespace;

    /**
    * ip version
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * ingress name
    */
    @SerializedName("IngressName")
    @Expose
    private String IngressName;

    /**
    * Rules configuration
    */
    @SerializedName("Rules")
    @Expose
    private IngressRule [] Rules;

    /**
    * clb ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClbId")
    @Expose
    private String ClbId;

    /**
    * TLS configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Tls")
    @Expose
    private IngressTls [] Tls;

    /**
    * Environment cluster ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * clb ip
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Whether to listen on both the HTTP 80 port and HTTPS 443 port. The default value is `false`. The optional value `true` means listening on both the HTTP 80 port and HTTPS 443 port.
    */
    @SerializedName("Mixed")
    @Expose
    private Boolean Mixed;

    /**
    * Redirection mode. Values:
- `AUTO` (automatically redirect HTTP to HTTPS)
- `NONE` (no redirection)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RewriteType")
    @Expose
    private String RewriteType;

    /**
    * CLB domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get Environment ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return EnvironmentId Environment ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param EnvironmentId Environment ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Environment namespace 
     * @return ClusterNamespace Environment namespace
     */
    public String getClusterNamespace() {
        return this.ClusterNamespace;
    }

    /**
     * Set Environment namespace
     * @param ClusterNamespace Environment namespace
     */
    public void setClusterNamespace(String ClusterNamespace) {
        this.ClusterNamespace = ClusterNamespace;
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
     * @return IngressName ingress name
     */
    public String getIngressName() {
        return this.IngressName;
    }

    /**
     * Set ingress name
     * @param IngressName ingress name
     */
    public void setIngressName(String IngressName) {
        this.IngressName = IngressName;
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
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ClbId clb ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getClbId() {
        return this.ClbId;
    }

    /**
     * Set clb ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ClbId clb ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClbId(String ClbId) {
        this.ClbId = ClbId;
    }

    /**
     * Get TLS configuration
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Tls TLS configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public IngressTls [] getTls() {
        return this.Tls;
    }

    /**
     * Set TLS configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Tls TLS configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTls(IngressTls [] Tls) {
        this.Tls = Tls;
    }

    /**
     * Get Environment cluster ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterId Environment cluster ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Environment cluster ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterId Environment cluster ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get clb ip
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Vip clb ip
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set clb ip
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Vip clb ip
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Creation time
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Whether to listen on both the HTTP 80 port and HTTPS 443 port. The default value is `false`. The optional value `true` means listening on both the HTTP 80 port and HTTPS 443 port. 
     * @return Mixed Whether to listen on both the HTTP 80 port and HTTPS 443 port. The default value is `false`. The optional value `true` means listening on both the HTTP 80 port and HTTPS 443 port.
     */
    public Boolean getMixed() {
        return this.Mixed;
    }

    /**
     * Set Whether to listen on both the HTTP 80 port and HTTPS 443 port. The default value is `false`. The optional value `true` means listening on both the HTTP 80 port and HTTPS 443 port.
     * @param Mixed Whether to listen on both the HTTP 80 port and HTTPS 443 port. The default value is `false`. The optional value `true` means listening on both the HTTP 80 port and HTTPS 443 port.
     */
    public void setMixed(Boolean Mixed) {
        this.Mixed = Mixed;
    }

    /**
     * Get Redirection mode. Values:
- `AUTO` (automatically redirect HTTP to HTTPS)
- `NONE` (no redirection)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RewriteType Redirection mode. Values:
- `AUTO` (automatically redirect HTTP to HTTPS)
- `NONE` (no redirection)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRewriteType() {
        return this.RewriteType;
    }

    /**
     * Set Redirection mode. Values:
- `AUTO` (automatically redirect HTTP to HTTPS)
- `NONE` (no redirection)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RewriteType Redirection mode. Values:
- `AUTO` (automatically redirect HTTP to HTTPS)
- `NONE` (no redirection)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRewriteType(String RewriteType) {
        this.RewriteType = RewriteType;
    }

    /**
     * Get CLB domain name
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Domain CLB domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set CLB domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Domain CLB domain name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public IngressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IngressInfo(IngressInfo source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.ClusterNamespace != null) {
            this.ClusterNamespace = new String(source.ClusterNamespace);
        }
        if (source.AddressIPVersion != null) {
            this.AddressIPVersion = new String(source.AddressIPVersion);
        }
        if (source.IngressName != null) {
            this.IngressName = new String(source.IngressName);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Mixed != null) {
            this.Mixed = new Boolean(source.Mixed);
        }
        if (source.RewriteType != null) {
            this.RewriteType = new String(source.RewriteType);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "ClusterNamespace", this.ClusterNamespace);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "IngressName", this.IngressName);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "ClbId", this.ClbId);
        this.setParamArrayObj(map, prefix + "Tls.", this.Tls);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Mixed", this.Mixed);
        this.setParamSimple(map, prefix + "RewriteType", this.RewriteType);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

