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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateInfo extends AbstractModel {

    /**
    * Certificate binding time.
    */
    @SerializedName("AssociatedTime")
    @Expose
    private String AssociatedTime;

    /**
    * Certificate ID.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Certificate type. Valid values: CA or SVR (server certificate).
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * Whether it is the default certificate of the listener. Value:
true: default certificate.
false: expand the certificate.
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * The binding status of the certificate and listener. Values: Associated, Associating, Disassociating, Error.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Certificate binding time. 
     * @return AssociatedTime Certificate binding time.
     */
    public String getAssociatedTime() {
        return this.AssociatedTime;
    }

    /**
     * Set Certificate binding time.
     * @param AssociatedTime Certificate binding time.
     */
    public void setAssociatedTime(String AssociatedTime) {
        this.AssociatedTime = AssociatedTime;
    }

    /**
     * Get Certificate ID. 
     * @return CertificateId Certificate ID.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Certificate ID.
     * @param CertificateId Certificate ID.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Certificate type. Valid values: CA or SVR (server certificate). 
     * @return CertificateType Certificate type. Valid values: CA or SVR (server certificate).
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set Certificate type. Valid values: CA or SVR (server certificate).
     * @param CertificateType Certificate type. Valid values: CA or SVR (server certificate).
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get Whether it is the default certificate of the listener. Value:
true: default certificate.
false: expand the certificate. 
     * @return IsDefault Whether it is the default certificate of the listener. Value:
true: default certificate.
false: expand the certificate.
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default certificate of the listener. Value:
true: default certificate.
false: expand the certificate.
     * @param IsDefault Whether it is the default certificate of the listener. Value:
true: default certificate.
false: expand the certificate.
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get The binding status of the certificate and listener. Values: Associated, Associating, Disassociating, Error. 
     * @return Status The binding status of the certificate and listener. Values: Associated, Associating, Disassociating, Error.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The binding status of the certificate and listener. Values: Associated, Associating, Disassociating, Error.
     * @param Status The binding status of the certificate and listener. Values: Associated, Associating, Disassociating, Error.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CertificateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateInfo(CertificateInfo source) {
        if (source.AssociatedTime != null) {
            this.AssociatedTime = new String(source.AssociatedTime);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.CertificateType != null) {
            this.CertificateType = new String(source.CertificateType);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssociatedTime", this.AssociatedTime);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

