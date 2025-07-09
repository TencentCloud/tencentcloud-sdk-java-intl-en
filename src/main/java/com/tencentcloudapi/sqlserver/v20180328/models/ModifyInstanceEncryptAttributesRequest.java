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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceEncryptAttributesRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Certificate ownership. Valid values: `self` (certificate of this account), `others` (certificate of the other account). Default value: `self`.
    */
    @SerializedName("CertificateAttribution")
    @Expose
    private String CertificateAttribution;

    /**
    * ID of the other referenced root account, which is required when `CertificateAttribution` is `others`.
    */
    @SerializedName("QuoteUin")
    @Expose
    private String QuoteUin;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Certificate ownership. Valid values: `self` (certificate of this account), `others` (certificate of the other account). Default value: `self`. 
     * @return CertificateAttribution Certificate ownership. Valid values: `self` (certificate of this account), `others` (certificate of the other account). Default value: `self`.
     */
    public String getCertificateAttribution() {
        return this.CertificateAttribution;
    }

    /**
     * Set Certificate ownership. Valid values: `self` (certificate of this account), `others` (certificate of the other account). Default value: `self`.
     * @param CertificateAttribution Certificate ownership. Valid values: `self` (certificate of this account), `others` (certificate of the other account). Default value: `self`.
     */
    public void setCertificateAttribution(String CertificateAttribution) {
        this.CertificateAttribution = CertificateAttribution;
    }

    /**
     * Get ID of the other referenced root account, which is required when `CertificateAttribution` is `others`. 
     * @return QuoteUin ID of the other referenced root account, which is required when `CertificateAttribution` is `others`.
     */
    public String getQuoteUin() {
        return this.QuoteUin;
    }

    /**
     * Set ID of the other referenced root account, which is required when `CertificateAttribution` is `others`.
     * @param QuoteUin ID of the other referenced root account, which is required when `CertificateAttribution` is `others`.
     */
    public void setQuoteUin(String QuoteUin) {
        this.QuoteUin = QuoteUin;
    }

    public ModifyInstanceEncryptAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceEncryptAttributesRequest(ModifyInstanceEncryptAttributesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CertificateAttribution != null) {
            this.CertificateAttribution = new String(source.CertificateAttribution);
        }
        if (source.QuoteUin != null) {
            this.QuoteUin = new String(source.QuoteUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CertificateAttribution", this.CertificateAttribution);
        this.setParamSimple(map, prefix + "QuoteUin", this.QuoteUin);

    }
}

