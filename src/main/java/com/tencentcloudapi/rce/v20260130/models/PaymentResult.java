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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PaymentResult extends AbstractModel {

    /**
    * <p>The status of the payment</p><p>Enumeration values: </p><ul><li>success: Success, </li><li>failure: Failure.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>The reason why the payment has been declined. e.g.card_declined</p>
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
    * <p>Whether the 3DS has been used in the payment,  enumeration value:</p><ul><li>Yes: true</li><li>No: false</li></ul>
    */
    @SerializedName("ThreeDomainSecure")
    @Expose
    private Boolean ThreeDomainSecure;

    /**
    * <p>The ECI code returned when 3DS used</p>
    */
    @SerializedName("ECICode")
    @Expose
    private String ECICode;

    /**
    * <p>Response code from the AVS used for address verification</p>
    */
    @SerializedName("AVSCode")
    @Expose
    private String AVSCode;

    /**
    * <p>Response code from the CVC used for payment authenticity</p>
    */
    @SerializedName("CVCCode")
    @Expose
    private String CVCCode;

    /**
     * Get <p>The status of the payment</p><p>Enumeration values: </p><ul><li>success: Success, </li><li>failure: Failure.</li></ul> 
     * @return Status <p>The status of the payment</p><p>Enumeration values: </p><ul><li>success: Success, </li><li>failure: Failure.</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>The status of the payment</p><p>Enumeration values: </p><ul><li>success: Success, </li><li>failure: Failure.</li></ul>
     * @param Status <p>The status of the payment</p><p>Enumeration values: </p><ul><li>success: Success, </li><li>failure: Failure.</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>The reason why the payment has been declined. e.g.card_declined</p> 
     * @return FailureReason <p>The reason why the payment has been declined. e.g.card_declined</p>
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set <p>The reason why the payment has been declined. e.g.card_declined</p>
     * @param FailureReason <p>The reason why the payment has been declined. e.g.card_declined</p>
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    /**
     * Get <p>Whether the 3DS has been used in the payment,  enumeration value:</p><ul><li>Yes: true</li><li>No: false</li></ul> 
     * @return ThreeDomainSecure <p>Whether the 3DS has been used in the payment,  enumeration value:</p><ul><li>Yes: true</li><li>No: false</li></ul>
     */
    public Boolean getThreeDomainSecure() {
        return this.ThreeDomainSecure;
    }

    /**
     * Set <p>Whether the 3DS has been used in the payment,  enumeration value:</p><ul><li>Yes: true</li><li>No: false</li></ul>
     * @param ThreeDomainSecure <p>Whether the 3DS has been used in the payment,  enumeration value:</p><ul><li>Yes: true</li><li>No: false</li></ul>
     */
    public void setThreeDomainSecure(Boolean ThreeDomainSecure) {
        this.ThreeDomainSecure = ThreeDomainSecure;
    }

    /**
     * Get <p>The ECI code returned when 3DS used</p> 
     * @return ECICode <p>The ECI code returned when 3DS used</p>
     */
    public String getECICode() {
        return this.ECICode;
    }

    /**
     * Set <p>The ECI code returned when 3DS used</p>
     * @param ECICode <p>The ECI code returned when 3DS used</p>
     */
    public void setECICode(String ECICode) {
        this.ECICode = ECICode;
    }

    /**
     * Get <p>Response code from the AVS used for address verification</p> 
     * @return AVSCode <p>Response code from the AVS used for address verification</p>
     */
    public String getAVSCode() {
        return this.AVSCode;
    }

    /**
     * Set <p>Response code from the AVS used for address verification</p>
     * @param AVSCode <p>Response code from the AVS used for address verification</p>
     */
    public void setAVSCode(String AVSCode) {
        this.AVSCode = AVSCode;
    }

    /**
     * Get <p>Response code from the CVC used for payment authenticity</p> 
     * @return CVCCode <p>Response code from the CVC used for payment authenticity</p>
     */
    public String getCVCCode() {
        return this.CVCCode;
    }

    /**
     * Set <p>Response code from the CVC used for payment authenticity</p>
     * @param CVCCode <p>Response code from the CVC used for payment authenticity</p>
     */
    public void setCVCCode(String CVCCode) {
        this.CVCCode = CVCCode;
    }

    public PaymentResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PaymentResult(PaymentResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
        if (source.ThreeDomainSecure != null) {
            this.ThreeDomainSecure = new Boolean(source.ThreeDomainSecure);
        }
        if (source.ECICode != null) {
            this.ECICode = new String(source.ECICode);
        }
        if (source.AVSCode != null) {
            this.AVSCode = new String(source.AVSCode);
        }
        if (source.CVCCode != null) {
            this.CVCCode = new String(source.CVCCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "ThreeDomainSecure", this.ThreeDomainSecure);
        this.setParamSimple(map, prefix + "ECICode", this.ECICode);
        this.setParamSimple(map, prefix + "AVSCode", this.AVSCode);
        this.setParamSimple(map, prefix + "CVCCode", this.CVCCode);

    }
}

