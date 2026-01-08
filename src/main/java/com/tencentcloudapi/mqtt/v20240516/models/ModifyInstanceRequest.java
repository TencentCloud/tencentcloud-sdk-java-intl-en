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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceRequest extends AbstractModel {

    /**
    * tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.comom/document/api/1778/111029?from_cn_redirect=1) api or console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the instance name to be modified, cannot be empty, 3-64 characters, only comprised of digits, letters, "-", and "_".
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Specifies the remark information to be modified, with a maximum of 128 characters.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Specifies the configuration specification to be changed.
Basic version and professional edition clusters cannot be upgraded to platinum version specifications. platinum edition clusters cannot be downgraded to basic version and enhanced specifications.
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * Specifies the registration method for the client certificate.
JITP: automatically register.
API: register manually through api.
    */
    @SerializedName("DeviceCertificateProvisionType")
    @Expose
    private String DeviceCertificateProvisionType;

    /**
    * Specifies whether to automatically activate the cert after automatic registration.
    */
    @SerializedName("AutomaticActivation")
    @Expose
    private Boolean AutomaticActivation;

    /**
    * Authorization policy switch.
    */
    @SerializedName("AuthorizationPolicy")
    @Expose
    private Boolean AuthorizationPolicy;

    /**
    * Specifies whether to use the default server certificate.
    */
    @SerializedName("UseDefaultServerCert")
    @Expose
    private Boolean UseDefaultServerCert;

    /**
    * TLS: one-way authentication.
mTLS. specifies mutual authentication.
BYOC: one device, one certificate.
    */
    @SerializedName("X509Mode")
    @Expose
    private String X509Mode;

    /**
    * Specifies the speed limit unit for client message send and receive in messages per second.
    */
    @SerializedName("MessageRate")
    @Expose
    private Long MessageRate;

    /**
     * Get tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.comom/document/api/1778/111029?from_cn_redirect=1) api or console. 
     * @return InstanceId tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.comom/document/api/1778/111029?from_cn_redirect=1) api or console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.comom/document/api/1778/111029?from_cn_redirect=1) api or console.
     * @param InstanceId tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.comom/document/api/1778/111029?from_cn_redirect=1) api or console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the instance name to be modified, cannot be empty, 3-64 characters, only comprised of digits, letters, "-", and "_". 
     * @return Name Specifies the instance name to be modified, cannot be empty, 3-64 characters, only comprised of digits, letters, "-", and "_".
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specifies the instance name to be modified, cannot be empty, 3-64 characters, only comprised of digits, letters, "-", and "_".
     * @param Name Specifies the instance name to be modified, cannot be empty, 3-64 characters, only comprised of digits, letters, "-", and "_".
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Specifies the remark information to be modified, with a maximum of 128 characters. 
     * @return Remark Specifies the remark information to be modified, with a maximum of 128 characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Specifies the remark information to be modified, with a maximum of 128 characters.
     * @param Remark Specifies the remark information to be modified, with a maximum of 128 characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Specifies the configuration specification to be changed.
Basic version and professional edition clusters cannot be upgraded to platinum version specifications. platinum edition clusters cannot be downgraded to basic version and enhanced specifications. 
     * @return SkuCode Specifies the configuration specification to be changed.
Basic version and professional edition clusters cannot be upgraded to platinum version specifications. platinum edition clusters cannot be downgraded to basic version and enhanced specifications.
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set Specifies the configuration specification to be changed.
Basic version and professional edition clusters cannot be upgraded to platinum version specifications. platinum edition clusters cannot be downgraded to basic version and enhanced specifications.
     * @param SkuCode Specifies the configuration specification to be changed.
Basic version and professional edition clusters cannot be upgraded to platinum version specifications. platinum edition clusters cannot be downgraded to basic version and enhanced specifications.
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get Specifies the registration method for the client certificate.
JITP: automatically register.
API: register manually through api. 
     * @return DeviceCertificateProvisionType Specifies the registration method for the client certificate.
JITP: automatically register.
API: register manually through api.
     * @deprecated
     */
    @Deprecated
    public String getDeviceCertificateProvisionType() {
        return this.DeviceCertificateProvisionType;
    }

    /**
     * Set Specifies the registration method for the client certificate.
JITP: automatically register.
API: register manually through api.
     * @param DeviceCertificateProvisionType Specifies the registration method for the client certificate.
JITP: automatically register.
API: register manually through api.
     * @deprecated
     */
    @Deprecated
    public void setDeviceCertificateProvisionType(String DeviceCertificateProvisionType) {
        this.DeviceCertificateProvisionType = DeviceCertificateProvisionType;
    }

    /**
     * Get Specifies whether to automatically activate the cert after automatic registration. 
     * @return AutomaticActivation Specifies whether to automatically activate the cert after automatic registration.
     * @deprecated
     */
    @Deprecated
    public Boolean getAutomaticActivation() {
        return this.AutomaticActivation;
    }

    /**
     * Set Specifies whether to automatically activate the cert after automatic registration.
     * @param AutomaticActivation Specifies whether to automatically activate the cert after automatic registration.
     * @deprecated
     */
    @Deprecated
    public void setAutomaticActivation(Boolean AutomaticActivation) {
        this.AutomaticActivation = AutomaticActivation;
    }

    /**
     * Get Authorization policy switch. 
     * @return AuthorizationPolicy Authorization policy switch.
     */
    public Boolean getAuthorizationPolicy() {
        return this.AuthorizationPolicy;
    }

    /**
     * Set Authorization policy switch.
     * @param AuthorizationPolicy Authorization policy switch.
     */
    public void setAuthorizationPolicy(Boolean AuthorizationPolicy) {
        this.AuthorizationPolicy = AuthorizationPolicy;
    }

    /**
     * Get Specifies whether to use the default server certificate. 
     * @return UseDefaultServerCert Specifies whether to use the default server certificate.
     */
    public Boolean getUseDefaultServerCert() {
        return this.UseDefaultServerCert;
    }

    /**
     * Set Specifies whether to use the default server certificate.
     * @param UseDefaultServerCert Specifies whether to use the default server certificate.
     */
    public void setUseDefaultServerCert(Boolean UseDefaultServerCert) {
        this.UseDefaultServerCert = UseDefaultServerCert;
    }

    /**
     * Get TLS: one-way authentication.
mTLS. specifies mutual authentication.
BYOC: one device, one certificate. 
     * @return X509Mode TLS: one-way authentication.
mTLS. specifies mutual authentication.
BYOC: one device, one certificate.
     */
    public String getX509Mode() {
        return this.X509Mode;
    }

    /**
     * Set TLS: one-way authentication.
mTLS. specifies mutual authentication.
BYOC: one device, one certificate.
     * @param X509Mode TLS: one-way authentication.
mTLS. specifies mutual authentication.
BYOC: one device, one certificate.
     */
    public void setX509Mode(String X509Mode) {
        this.X509Mode = X509Mode;
    }

    /**
     * Get Specifies the speed limit unit for client message send and receive in messages per second. 
     * @return MessageRate Specifies the speed limit unit for client message send and receive in messages per second.
     */
    public Long getMessageRate() {
        return this.MessageRate;
    }

    /**
     * Set Specifies the speed limit unit for client message send and receive in messages per second.
     * @param MessageRate Specifies the speed limit unit for client message send and receive in messages per second.
     */
    public void setMessageRate(Long MessageRate) {
        this.MessageRate = MessageRate;
    }

    public ModifyInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceRequest(ModifyInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.DeviceCertificateProvisionType != null) {
            this.DeviceCertificateProvisionType = new String(source.DeviceCertificateProvisionType);
        }
        if (source.AutomaticActivation != null) {
            this.AutomaticActivation = new Boolean(source.AutomaticActivation);
        }
        if (source.AuthorizationPolicy != null) {
            this.AuthorizationPolicy = new Boolean(source.AuthorizationPolicy);
        }
        if (source.UseDefaultServerCert != null) {
            this.UseDefaultServerCert = new Boolean(source.UseDefaultServerCert);
        }
        if (source.X509Mode != null) {
            this.X509Mode = new String(source.X509Mode);
        }
        if (source.MessageRate != null) {
            this.MessageRate = new Long(source.MessageRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "DeviceCertificateProvisionType", this.DeviceCertificateProvisionType);
        this.setParamSimple(map, prefix + "AutomaticActivation", this.AutomaticActivation);
        this.setParamSimple(map, prefix + "AuthorizationPolicy", this.AuthorizationPolicy);
        this.setParamSimple(map, prefix + "UseDefaultServerCert", this.UseDefaultServerCert);
        this.setParamSimple(map, prefix + "X509Mode", this.X509Mode);
        this.setParamSimple(map, prefix + "MessageRate", this.MessageRate);

    }
}

