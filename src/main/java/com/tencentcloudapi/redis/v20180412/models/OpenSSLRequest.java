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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenSSLRequest extends AbstractModel {

    /**
    * <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>SSL address type.</p><p>Enumeration values:</p><ul><li>0: Unlimited.</li><li>1: Private IPv4 address.</li><li>2: Private IPv6 address.</li><li>3: Public network.</li><li>-1: Unspecified.</li></ul><p>Default value: 0</p>
    */
    @SerializedName("AddressType")
    @Expose
    private Long AddressType;

    /**
    * <p>Key type.</p><p>Enumeration values:</p><ul><li>0: Tencent Cloud provides</li><li>1: User-defined certificate</li></ul><p>Default value: 0</p>
    */
    @SerializedName("CertSource")
    @Expose
    private Long CertSource;

    /**
    * <p>Switch time. (This parameter is deprecated and no longer effective.)</p><p>Enumeration values:</p><ul><li>1: Operate within the maintenance window: SSL encryption will be enabled and executed within the set maintenance window. Use the DescribeMaintenanceWindow interface to query the set maintenance time period.</li><li>2: Immediate operation: The operation will be executed immediately with no waiting for the maintenance window. The system default setting is immediate operation.</li></ul>
    */
    @SerializedName("SwitchOption")
    @Expose
    private Long SwitchOption;

    /**
    * <p>Certificate ID of the SSL certificate service. Required when CertSource=1</p>
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * <p>Min TLS version</p><p>Enumeration values:</p><ul><li>TLSv1.0: TLSv1.0</li><li>TLSv1.1: TLSv1.1</li><li>TLSv1.2: TLSv1.2</li></ul>
    */
    @SerializedName("SSLMinVersion")
    @Expose
    private String SSLMinVersion;

    /**
    * <p>Target encryption mode</p><p>Enumeration values:</p><ul><li>required: Enforced encryption</li><li>flexible: Compatible mode</li></ul><p>Default value: flexible</p>
    */
    @SerializedName("EncryptionMode")
    @Expose
    private String EncryptionMode;

    /**
     * Get <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p> 
     * @return InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
     * @param InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>SSL address type.</p><p>Enumeration values:</p><ul><li>0: Unlimited.</li><li>1: Private IPv4 address.</li><li>2: Private IPv6 address.</li><li>3: Public network.</li><li>-1: Unspecified.</li></ul><p>Default value: 0</p> 
     * @return AddressType <p>SSL address type.</p><p>Enumeration values:</p><ul><li>0: Unlimited.</li><li>1: Private IPv4 address.</li><li>2: Private IPv6 address.</li><li>3: Public network.</li><li>-1: Unspecified.</li></ul><p>Default value: 0</p>
     */
    public Long getAddressType() {
        return this.AddressType;
    }

    /**
     * Set <p>SSL address type.</p><p>Enumeration values:</p><ul><li>0: Unlimited.</li><li>1: Private IPv4 address.</li><li>2: Private IPv6 address.</li><li>3: Public network.</li><li>-1: Unspecified.</li></ul><p>Default value: 0</p>
     * @param AddressType <p>SSL address type.</p><p>Enumeration values:</p><ul><li>0: Unlimited.</li><li>1: Private IPv4 address.</li><li>2: Private IPv6 address.</li><li>3: Public network.</li><li>-1: Unspecified.</li></ul><p>Default value: 0</p>
     */
    public void setAddressType(Long AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get <p>Key type.</p><p>Enumeration values:</p><ul><li>0: Tencent Cloud provides</li><li>1: User-defined certificate</li></ul><p>Default value: 0</p> 
     * @return CertSource <p>Key type.</p><p>Enumeration values:</p><ul><li>0: Tencent Cloud provides</li><li>1: User-defined certificate</li></ul><p>Default value: 0</p>
     */
    public Long getCertSource() {
        return this.CertSource;
    }

    /**
     * Set <p>Key type.</p><p>Enumeration values:</p><ul><li>0: Tencent Cloud provides</li><li>1: User-defined certificate</li></ul><p>Default value: 0</p>
     * @param CertSource <p>Key type.</p><p>Enumeration values:</p><ul><li>0: Tencent Cloud provides</li><li>1: User-defined certificate</li></ul><p>Default value: 0</p>
     */
    public void setCertSource(Long CertSource) {
        this.CertSource = CertSource;
    }

    /**
     * Get <p>Switch time. (This parameter is deprecated and no longer effective.)</p><p>Enumeration values:</p><ul><li>1: Operate within the maintenance window: SSL encryption will be enabled and executed within the set maintenance window. Use the DescribeMaintenanceWindow interface to query the set maintenance time period.</li><li>2: Immediate operation: The operation will be executed immediately with no waiting for the maintenance window. The system default setting is immediate operation.</li></ul> 
     * @return SwitchOption <p>Switch time. (This parameter is deprecated and no longer effective.)</p><p>Enumeration values:</p><ul><li>1: Operate within the maintenance window: SSL encryption will be enabled and executed within the set maintenance window. Use the DescribeMaintenanceWindow interface to query the set maintenance time period.</li><li>2: Immediate operation: The operation will be executed immediately with no waiting for the maintenance window. The system default setting is immediate operation.</li></ul>
     * @deprecated
     */
    @Deprecated
    public Long getSwitchOption() {
        return this.SwitchOption;
    }

    /**
     * Set <p>Switch time. (This parameter is deprecated and no longer effective.)</p><p>Enumeration values:</p><ul><li>1: Operate within the maintenance window: SSL encryption will be enabled and executed within the set maintenance window. Use the DescribeMaintenanceWindow interface to query the set maintenance time period.</li><li>2: Immediate operation: The operation will be executed immediately with no waiting for the maintenance window. The system default setting is immediate operation.</li></ul>
     * @param SwitchOption <p>Switch time. (This parameter is deprecated and no longer effective.)</p><p>Enumeration values:</p><ul><li>1: Operate within the maintenance window: SSL encryption will be enabled and executed within the set maintenance window. Use the DescribeMaintenanceWindow interface to query the set maintenance time period.</li><li>2: Immediate operation: The operation will be executed immediately with no waiting for the maintenance window. The system default setting is immediate operation.</li></ul>
     * @deprecated
     */
    @Deprecated
    public void setSwitchOption(Long SwitchOption) {
        this.SwitchOption = SwitchOption;
    }

    /**
     * Get <p>Certificate ID of the SSL certificate service. Required when CertSource=1</p> 
     * @return CertId <p>Certificate ID of the SSL certificate service. Required when CertSource=1</p>
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set <p>Certificate ID of the SSL certificate service. Required when CertSource=1</p>
     * @param CertId <p>Certificate ID of the SSL certificate service. Required when CertSource=1</p>
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get <p>Min TLS version</p><p>Enumeration values:</p><ul><li>TLSv1.0: TLSv1.0</li><li>TLSv1.1: TLSv1.1</li><li>TLSv1.2: TLSv1.2</li></ul> 
     * @return SSLMinVersion <p>Min TLS version</p><p>Enumeration values:</p><ul><li>TLSv1.0: TLSv1.0</li><li>TLSv1.1: TLSv1.1</li><li>TLSv1.2: TLSv1.2</li></ul>
     */
    public String getSSLMinVersion() {
        return this.SSLMinVersion;
    }

    /**
     * Set <p>Min TLS version</p><p>Enumeration values:</p><ul><li>TLSv1.0: TLSv1.0</li><li>TLSv1.1: TLSv1.1</li><li>TLSv1.2: TLSv1.2</li></ul>
     * @param SSLMinVersion <p>Min TLS version</p><p>Enumeration values:</p><ul><li>TLSv1.0: TLSv1.0</li><li>TLSv1.1: TLSv1.1</li><li>TLSv1.2: TLSv1.2</li></ul>
     */
    public void setSSLMinVersion(String SSLMinVersion) {
        this.SSLMinVersion = SSLMinVersion;
    }

    /**
     * Get <p>Target encryption mode</p><p>Enumeration values:</p><ul><li>required: Enforced encryption</li><li>flexible: Compatible mode</li></ul><p>Default value: flexible</p> 
     * @return EncryptionMode <p>Target encryption mode</p><p>Enumeration values:</p><ul><li>required: Enforced encryption</li><li>flexible: Compatible mode</li></ul><p>Default value: flexible</p>
     */
    public String getEncryptionMode() {
        return this.EncryptionMode;
    }

    /**
     * Set <p>Target encryption mode</p><p>Enumeration values:</p><ul><li>required: Enforced encryption</li><li>flexible: Compatible mode</li></ul><p>Default value: flexible</p>
     * @param EncryptionMode <p>Target encryption mode</p><p>Enumeration values:</p><ul><li>required: Enforced encryption</li><li>flexible: Compatible mode</li></ul><p>Default value: flexible</p>
     */
    public void setEncryptionMode(String EncryptionMode) {
        this.EncryptionMode = EncryptionMode;
    }

    public OpenSSLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenSSLRequest(OpenSSLRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AddressType != null) {
            this.AddressType = new Long(source.AddressType);
        }
        if (source.CertSource != null) {
            this.CertSource = new Long(source.CertSource);
        }
        if (source.SwitchOption != null) {
            this.SwitchOption = new Long(source.SwitchOption);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.SSLMinVersion != null) {
            this.SSLMinVersion = new String(source.SSLMinVersion);
        }
        if (source.EncryptionMode != null) {
            this.EncryptionMode = new String(source.EncryptionMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "CertSource", this.CertSource);
        this.setParamSimple(map, prefix + "SwitchOption", this.SwitchOption);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "SSLMinVersion", this.SSLMinVersion);
        this.setParamSimple(map, prefix + "EncryptionMode", this.EncryptionMode);

    }
}

