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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainValidationResult extends AbstractModel {

    /**
    * Domain names bound to the certificate.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain name validation type. Value is DNS, FILE, DNS_AUTO, DNS_PROXY, or FILE_PROXY.
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * Tencent Cloud detection result, Value: 1 (verified); -1 (rate limited or txt record not found); -2 (txt record not match); -3 (ns record not found); -4 (file not found); -5 (file not match); -6 (cname record not found); -7 (cname record not match); -8 (ns record not found); -9 (file not found); -10 (file not match).

    */
    @SerializedName("LocalCheck")
    @Expose
    private Long LocalCheck;

    /**
    * CA check result. Value: -1 (detection failed); 2 (detection passed).
    */
    @SerializedName("CaCheck")
    @Expose
    private Long CaCheck;

    /**
    * Check failure reasons. Description of the LocalCheck status.
    */
    @SerializedName("LocalCheckFailReason")
    @Expose
    private String LocalCheckFailReason;

    /**
    * Detected value.
    */
    @SerializedName("CheckValue")
    @Expose
    private String [] CheckValue;

    /**
    * Whether the request is rate-limited. Valid values: false (not rate-limited); true (rate-limited).
    */
    @SerializedName("Frequently")
    @Expose
    private Boolean Frequently;

    /**
    * Whether the certificate has been issued. Value: false (not issued); true (issued).
    */
    @SerializedName("Issued")
    @Expose
    private Boolean Issued;

    /**
     * Get Domain names bound to the certificate. 
     * @return Domain Domain names bound to the certificate.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain names bound to the certificate.
     * @param Domain Domain names bound to the certificate.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Domain name validation type. Value is DNS, FILE, DNS_AUTO, DNS_PROXY, or FILE_PROXY. 
     * @return VerifyType Domain name validation type. Value is DNS, FILE, DNS_AUTO, DNS_PROXY, or FILE_PROXY.
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set Domain name validation type. Value is DNS, FILE, DNS_AUTO, DNS_PROXY, or FILE_PROXY.
     * @param VerifyType Domain name validation type. Value is DNS, FILE, DNS_AUTO, DNS_PROXY, or FILE_PROXY.
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get Tencent Cloud detection result, Value: 1 (verified); -1 (rate limited or txt record not found); -2 (txt record not match); -3 (ns record not found); -4 (file not found); -5 (file not match); -6 (cname record not found); -7 (cname record not match); -8 (ns record not found); -9 (file not found); -10 (file not match).
 
     * @return LocalCheck Tencent Cloud detection result, Value: 1 (verified); -1 (rate limited or txt record not found); -2 (txt record not match); -3 (ns record not found); -4 (file not found); -5 (file not match); -6 (cname record not found); -7 (cname record not match); -8 (ns record not found); -9 (file not found); -10 (file not match).

     */
    public Long getLocalCheck() {
        return this.LocalCheck;
    }

    /**
     * Set Tencent Cloud detection result, Value: 1 (verified); -1 (rate limited or txt record not found); -2 (txt record not match); -3 (ns record not found); -4 (file not found); -5 (file not match); -6 (cname record not found); -7 (cname record not match); -8 (ns record not found); -9 (file not found); -10 (file not match).

     * @param LocalCheck Tencent Cloud detection result, Value: 1 (verified); -1 (rate limited or txt record not found); -2 (txt record not match); -3 (ns record not found); -4 (file not found); -5 (file not match); -6 (cname record not found); -7 (cname record not match); -8 (ns record not found); -9 (file not found); -10 (file not match).

     */
    public void setLocalCheck(Long LocalCheck) {
        this.LocalCheck = LocalCheck;
    }

    /**
     * Get CA check result. Value: -1 (detection failed); 2 (detection passed). 
     * @return CaCheck CA check result. Value: -1 (detection failed); 2 (detection passed).
     */
    public Long getCaCheck() {
        return this.CaCheck;
    }

    /**
     * Set CA check result. Value: -1 (detection failed); 2 (detection passed).
     * @param CaCheck CA check result. Value: -1 (detection failed); 2 (detection passed).
     */
    public void setCaCheck(Long CaCheck) {
        this.CaCheck = CaCheck;
    }

    /**
     * Get Check failure reasons. Description of the LocalCheck status. 
     * @return LocalCheckFailReason Check failure reasons. Description of the LocalCheck status.
     */
    public String getLocalCheckFailReason() {
        return this.LocalCheckFailReason;
    }

    /**
     * Set Check failure reasons. Description of the LocalCheck status.
     * @param LocalCheckFailReason Check failure reasons. Description of the LocalCheck status.
     */
    public void setLocalCheckFailReason(String LocalCheckFailReason) {
        this.LocalCheckFailReason = LocalCheckFailReason;
    }

    /**
     * Get Detected value. 
     * @return CheckValue Detected value.
     */
    public String [] getCheckValue() {
        return this.CheckValue;
    }

    /**
     * Set Detected value.
     * @param CheckValue Detected value.
     */
    public void setCheckValue(String [] CheckValue) {
        this.CheckValue = CheckValue;
    }

    /**
     * Get Whether the request is rate-limited. Valid values: false (not rate-limited); true (rate-limited). 
     * @return Frequently Whether the request is rate-limited. Valid values: false (not rate-limited); true (rate-limited).
     */
    public Boolean getFrequently() {
        return this.Frequently;
    }

    /**
     * Set Whether the request is rate-limited. Valid values: false (not rate-limited); true (rate-limited).
     * @param Frequently Whether the request is rate-limited. Valid values: false (not rate-limited); true (rate-limited).
     */
    public void setFrequently(Boolean Frequently) {
        this.Frequently = Frequently;
    }

    /**
     * Get Whether the certificate has been issued. Value: false (not issued); true (issued). 
     * @return Issued Whether the certificate has been issued. Value: false (not issued); true (issued).
     */
    public Boolean getIssued() {
        return this.Issued;
    }

    /**
     * Set Whether the certificate has been issued. Value: false (not issued); true (issued).
     * @param Issued Whether the certificate has been issued. Value: false (not issued); true (issued).
     */
    public void setIssued(Boolean Issued) {
        this.Issued = Issued;
    }

    public DomainValidationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainValidationResult(DomainValidationResult source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
        if (source.LocalCheck != null) {
            this.LocalCheck = new Long(source.LocalCheck);
        }
        if (source.CaCheck != null) {
            this.CaCheck = new Long(source.CaCheck);
        }
        if (source.LocalCheckFailReason != null) {
            this.LocalCheckFailReason = new String(source.LocalCheckFailReason);
        }
        if (source.CheckValue != null) {
            this.CheckValue = new String[source.CheckValue.length];
            for (int i = 0; i < source.CheckValue.length; i++) {
                this.CheckValue[i] = new String(source.CheckValue[i]);
            }
        }
        if (source.Frequently != null) {
            this.Frequently = new Boolean(source.Frequently);
        }
        if (source.Issued != null) {
            this.Issued = new Boolean(source.Issued);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "LocalCheck", this.LocalCheck);
        this.setParamSimple(map, prefix + "CaCheck", this.CaCheck);
        this.setParamSimple(map, prefix + "LocalCheckFailReason", this.LocalCheckFailReason);
        this.setParamArraySimple(map, prefix + "CheckValue.", this.CheckValue);
        this.setParamSimple(map, prefix + "Frequently", this.Frequently);
        this.setParamSimple(map, prefix + "Issued", this.Issued);

    }
}

