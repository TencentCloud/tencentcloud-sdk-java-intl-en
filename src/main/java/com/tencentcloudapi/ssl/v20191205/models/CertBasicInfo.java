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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertBasicInfo extends AbstractModel {

    /**
    * Issuer.
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * Issued to.
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * Certificate fingerprint.
    */
    @SerializedName("Fingerprint")
    @Expose
    private String Fingerprint;

    /**
    * Certificate valid period start time.
    */
    @SerializedName("ValidFrom")
    @Expose
    private String ValidFrom;

    /**
    * Certificate valid period end time.
    */
    @SerializedName("ValidTo")
    @Expose
    private String ValidTo;

    /**
     * Get Issuer. 
     * @return Issuer Issuer.
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set Issuer.
     * @param Issuer Issuer.
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get Issued to. 
     * @return Subject Issued to.
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set Issued to.
     * @param Subject Issued to.
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get Certificate fingerprint. 
     * @return Fingerprint Certificate fingerprint.
     */
    public String getFingerprint() {
        return this.Fingerprint;
    }

    /**
     * Set Certificate fingerprint.
     * @param Fingerprint Certificate fingerprint.
     */
    public void setFingerprint(String Fingerprint) {
        this.Fingerprint = Fingerprint;
    }

    /**
     * Get Certificate valid period start time. 
     * @return ValidFrom Certificate valid period start time.
     */
    public String getValidFrom() {
        return this.ValidFrom;
    }

    /**
     * Set Certificate valid period start time.
     * @param ValidFrom Certificate valid period start time.
     */
    public void setValidFrom(String ValidFrom) {
        this.ValidFrom = ValidFrom;
    }

    /**
     * Get Certificate valid period end time. 
     * @return ValidTo Certificate valid period end time.
     */
    public String getValidTo() {
        return this.ValidTo;
    }

    /**
     * Set Certificate valid period end time.
     * @param ValidTo Certificate valid period end time.
     */
    public void setValidTo(String ValidTo) {
        this.ValidTo = ValidTo;
    }

    public CertBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertBasicInfo(CertBasicInfo source) {
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.Fingerprint != null) {
            this.Fingerprint = new String(source.Fingerprint);
        }
        if (source.ValidFrom != null) {
            this.ValidFrom = new String(source.ValidFrom);
        }
        if (source.ValidTo != null) {
            this.ValidTo = new String(source.ValidTo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "Fingerprint", this.Fingerprint);
        this.setParamSimple(map, prefix + "ValidFrom", this.ValidFrom);
        this.setParamSimple(map, prefix + "ValidTo", this.ValidTo);

    }
}

