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

public class DeviceCertificateItem extends AbstractModel {

    /**
    * Client ID.
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * device certificate
    */
    @SerializedName("DeviceCertificate")
    @Expose
    private String DeviceCertificate;

    /**
    * Device certificate SN serial number, used for unique identification of a device certificate
    */
    @SerializedName("DeviceCertificateSn")
    @Expose
    private String DeviceCertificateSn;

    /**
    * Device certificate Cn
    */
    @SerializedName("DeviceCertificateCn")
    @Expose
    private String DeviceCertificateCn;

    /**
    * Serial number of the CA cert that issued the cert
    */
    @SerializedName("CaSn")
    @Expose
    private String CaSn;

    /**
    * Certificate format, currently only support PEM
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Device certificate status
ACTIVE: Activate
INACTIVE: Inactive
REVOKED: Revoked
PENDING_ACTIVATION: To be activated.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Organization unit
    */
    @SerializedName("OrganizationalUnit")
    @Expose
    private String OrganizationalUnit;

    /**
    * Last activation time, millisecond-level timestamp.
    */
    @SerializedName("LastActivationTime")
    @Expose
    private Long LastActivationTime;

    /**
    * Last cancellation activation time, millisecond-level timestamp.
    */
    @SerializedName("LastInactivationTime")
    @Expose
    private Long LastInactivationTime;

    /**
    * createTime, millisecond-level timestamp.
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * Update time, millisecond-level timestamp.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Certificate source:
API, Manual Registration   
Automatic JITP registration
    */
    @SerializedName("CertificateSource")
    @Expose
    private String CertificateSource;

    /**
    * Certificate expiration date, millisecond-level timestamp.
    */
    @SerializedName("NotAfterTime")
    @Expose
    private Long NotAfterTime;

    /**
    * Start date when the certificate takes effect, millisecond-level timestamp.
    */
    @SerializedName("NotBeforeTime")
    @Expose
    private Long NotBeforeTime;

    /**
     * Get Client ID. 
     * @return ClientId Client ID.
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client ID.
     * @param ClientId Client ID.
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get device certificate 
     * @return DeviceCertificate device certificate
     */
    public String getDeviceCertificate() {
        return this.DeviceCertificate;
    }

    /**
     * Set device certificate
     * @param DeviceCertificate device certificate
     */
    public void setDeviceCertificate(String DeviceCertificate) {
        this.DeviceCertificate = DeviceCertificate;
    }

    /**
     * Get Device certificate SN serial number, used for unique identification of a device certificate 
     * @return DeviceCertificateSn Device certificate SN serial number, used for unique identification of a device certificate
     */
    public String getDeviceCertificateSn() {
        return this.DeviceCertificateSn;
    }

    /**
     * Set Device certificate SN serial number, used for unique identification of a device certificate
     * @param DeviceCertificateSn Device certificate SN serial number, used for unique identification of a device certificate
     */
    public void setDeviceCertificateSn(String DeviceCertificateSn) {
        this.DeviceCertificateSn = DeviceCertificateSn;
    }

    /**
     * Get Device certificate Cn 
     * @return DeviceCertificateCn Device certificate Cn
     */
    public String getDeviceCertificateCn() {
        return this.DeviceCertificateCn;
    }

    /**
     * Set Device certificate Cn
     * @param DeviceCertificateCn Device certificate Cn
     */
    public void setDeviceCertificateCn(String DeviceCertificateCn) {
        this.DeviceCertificateCn = DeviceCertificateCn;
    }

    /**
     * Get Serial number of the CA cert that issued the cert 
     * @return CaSn Serial number of the CA cert that issued the cert
     */
    public String getCaSn() {
        return this.CaSn;
    }

    /**
     * Set Serial number of the CA cert that issued the cert
     * @param CaSn Serial number of the CA cert that issued the cert
     */
    public void setCaSn(String CaSn) {
        this.CaSn = CaSn;
    }

    /**
     * Get Certificate format, currently only support PEM 
     * @return Format Certificate format, currently only support PEM
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Certificate format, currently only support PEM
     * @param Format Certificate format, currently only support PEM
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Device certificate status
ACTIVE: Activate
INACTIVE: Inactive
REVOKED: Revoked
PENDING_ACTIVATION: To be activated. 
     * @return Status Device certificate status
ACTIVE: Activate
INACTIVE: Inactive
REVOKED: Revoked
PENDING_ACTIVATION: To be activated.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Device certificate status
ACTIVE: Activate
INACTIVE: Inactive
REVOKED: Revoked
PENDING_ACTIVATION: To be activated.
     * @param Status Device certificate status
ACTIVE: Activate
INACTIVE: Inactive
REVOKED: Revoked
PENDING_ACTIVATION: To be activated.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Organization unit 
     * @return OrganizationalUnit Organization unit
     */
    public String getOrganizationalUnit() {
        return this.OrganizationalUnit;
    }

    /**
     * Set Organization unit
     * @param OrganizationalUnit Organization unit
     */
    public void setOrganizationalUnit(String OrganizationalUnit) {
        this.OrganizationalUnit = OrganizationalUnit;
    }

    /**
     * Get Last activation time, millisecond-level timestamp. 
     * @return LastActivationTime Last activation time, millisecond-level timestamp.
     */
    public Long getLastActivationTime() {
        return this.LastActivationTime;
    }

    /**
     * Set Last activation time, millisecond-level timestamp.
     * @param LastActivationTime Last activation time, millisecond-level timestamp.
     */
    public void setLastActivationTime(Long LastActivationTime) {
        this.LastActivationTime = LastActivationTime;
    }

    /**
     * Get Last cancellation activation time, millisecond-level timestamp. 
     * @return LastInactivationTime Last cancellation activation time, millisecond-level timestamp.
     */
    public Long getLastInactivationTime() {
        return this.LastInactivationTime;
    }

    /**
     * Set Last cancellation activation time, millisecond-level timestamp.
     * @param LastInactivationTime Last cancellation activation time, millisecond-level timestamp.
     */
    public void setLastInactivationTime(Long LastInactivationTime) {
        this.LastInactivationTime = LastInactivationTime;
    }

    /**
     * Get createTime, millisecond-level timestamp. 
     * @return CreatedTime createTime, millisecond-level timestamp.
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set createTime, millisecond-level timestamp.
     * @param CreatedTime createTime, millisecond-level timestamp.
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Update time, millisecond-level timestamp. 
     * @return UpdateTime Update time, millisecond-level timestamp.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time, millisecond-level timestamp.
     * @param UpdateTime Update time, millisecond-level timestamp.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Certificate source:
API, Manual Registration   
Automatic JITP registration 
     * @return CertificateSource Certificate source:
API, Manual Registration   
Automatic JITP registration
     */
    public String getCertificateSource() {
        return this.CertificateSource;
    }

    /**
     * Set Certificate source:
API, Manual Registration   
Automatic JITP registration
     * @param CertificateSource Certificate source:
API, Manual Registration   
Automatic JITP registration
     */
    public void setCertificateSource(String CertificateSource) {
        this.CertificateSource = CertificateSource;
    }

    /**
     * Get Certificate expiration date, millisecond-level timestamp. 
     * @return NotAfterTime Certificate expiration date, millisecond-level timestamp.
     */
    public Long getNotAfterTime() {
        return this.NotAfterTime;
    }

    /**
     * Set Certificate expiration date, millisecond-level timestamp.
     * @param NotAfterTime Certificate expiration date, millisecond-level timestamp.
     */
    public void setNotAfterTime(Long NotAfterTime) {
        this.NotAfterTime = NotAfterTime;
    }

    /**
     * Get Start date when the certificate takes effect, millisecond-level timestamp. 
     * @return NotBeforeTime Start date when the certificate takes effect, millisecond-level timestamp.
     */
    public Long getNotBeforeTime() {
        return this.NotBeforeTime;
    }

    /**
     * Set Start date when the certificate takes effect, millisecond-level timestamp.
     * @param NotBeforeTime Start date when the certificate takes effect, millisecond-level timestamp.
     */
    public void setNotBeforeTime(Long NotBeforeTime) {
        this.NotBeforeTime = NotBeforeTime;
    }

    public DeviceCertificateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceCertificateItem(DeviceCertificateItem source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.DeviceCertificate != null) {
            this.DeviceCertificate = new String(source.DeviceCertificate);
        }
        if (source.DeviceCertificateSn != null) {
            this.DeviceCertificateSn = new String(source.DeviceCertificateSn);
        }
        if (source.DeviceCertificateCn != null) {
            this.DeviceCertificateCn = new String(source.DeviceCertificateCn);
        }
        if (source.CaSn != null) {
            this.CaSn = new String(source.CaSn);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OrganizationalUnit != null) {
            this.OrganizationalUnit = new String(source.OrganizationalUnit);
        }
        if (source.LastActivationTime != null) {
            this.LastActivationTime = new Long(source.LastActivationTime);
        }
        if (source.LastInactivationTime != null) {
            this.LastInactivationTime = new Long(source.LastInactivationTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.CertificateSource != null) {
            this.CertificateSource = new String(source.CertificateSource);
        }
        if (source.NotAfterTime != null) {
            this.NotAfterTime = new Long(source.NotAfterTime);
        }
        if (source.NotBeforeTime != null) {
            this.NotBeforeTime = new Long(source.NotBeforeTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "DeviceCertificate", this.DeviceCertificate);
        this.setParamSimple(map, prefix + "DeviceCertificateSn", this.DeviceCertificateSn);
        this.setParamSimple(map, prefix + "DeviceCertificateCn", this.DeviceCertificateCn);
        this.setParamSimple(map, prefix + "CaSn", this.CaSn);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OrganizationalUnit", this.OrganizationalUnit);
        this.setParamSimple(map, prefix + "LastActivationTime", this.LastActivationTime);
        this.setParamSimple(map, prefix + "LastInactivationTime", this.LastInactivationTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CertificateSource", this.CertificateSource);
        this.setParamSimple(map, prefix + "NotAfterTime", this.NotAfterTime);
        this.setParamSimple(map, prefix + "NotBeforeTime", this.NotBeforeTime);

    }
}

