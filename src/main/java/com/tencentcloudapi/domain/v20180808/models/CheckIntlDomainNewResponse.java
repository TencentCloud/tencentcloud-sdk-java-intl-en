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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckIntlDomainNewResponse extends AbstractModel {

    /**
    * The name of the domain checked.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Whether the domain is available for registration.
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * The reason why the domain cannot be registered.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Whether the domain is a premium one.
    */
    @SerializedName("Premium")
    @Expose
    private Boolean Premium;

    /**
    * The domain price.
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
    * Whether the domain name involves restricted words.
    */
    @SerializedName("BlackWord")
    @Expose
    private Boolean BlackWord;

    /**
    * The premium domain description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * The price for renewing the premium domain.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FeeRenew")
    @Expose
    private Float FeeRenew;

    /**
    * The real price of the domain. For a premium domain, its price varies depending on the period. For a non-premium domain, the price is the 1-year price.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealPrice")
    @Expose
    private Float RealPrice;

    /**
    * The price for transferring a premium domain in.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FeeTransfer")
    @Expose
    private Float FeeTransfer;

    /**
    * The price for redeeming a premium domain.
    */
    @SerializedName("FeeRestore")
    @Expose
    private Float FeeRestore;

    /**
    * The period (in years) of the domain.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * The reason why the domain cannot be registered, expressed in Chinese.
    */
    @SerializedName("ReasonZh")
    @Expose
    private String ReasonZh;

    /**
    * The internal error code.
    */
    @SerializedName("ResCode")
    @Expose
    private String ResCode;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The name of the domain checked. 
     * @return DomainName The name of the domain checked.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set The name of the domain checked.
     * @param DomainName The name of the domain checked.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Whether the domain is available for registration. 
     * @return Available Whether the domain is available for registration.
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set Whether the domain is available for registration.
     * @param Available Whether the domain is available for registration.
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get The reason why the domain cannot be registered. 
     * @return Reason The reason why the domain cannot be registered.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set The reason why the domain cannot be registered.
     * @param Reason The reason why the domain cannot be registered.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Whether the domain is a premium one. 
     * @return Premium Whether the domain is a premium one.
     */
    public Boolean getPremium() {
        return this.Premium;
    }

    /**
     * Set Whether the domain is a premium one.
     * @param Premium Whether the domain is a premium one.
     */
    public void setPremium(Boolean Premium) {
        this.Premium = Premium;
    }

    /**
     * Get The domain price. 
     * @return Price The domain price.
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set The domain price.
     * @param Price The domain price.
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    /**
     * Get Whether the domain name involves restricted words. 
     * @return BlackWord Whether the domain name involves restricted words.
     */
    public Boolean getBlackWord() {
        return this.BlackWord;
    }

    /**
     * Set Whether the domain name involves restricted words.
     * @param BlackWord Whether the domain name involves restricted words.
     */
    public void setBlackWord(Boolean BlackWord) {
        this.BlackWord = BlackWord;
    }

    /**
     * Get The premium domain description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Describe The premium domain description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set The premium domain description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Describe The premium domain description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get The price for renewing the premium domain.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FeeRenew The price for renewing the premium domain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getFeeRenew() {
        return this.FeeRenew;
    }

    /**
     * Set The price for renewing the premium domain.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FeeRenew The price for renewing the premium domain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFeeRenew(Float FeeRenew) {
        this.FeeRenew = FeeRenew;
    }

    /**
     * Get The real price of the domain. For a premium domain, its price varies depending on the period. For a non-premium domain, the price is the 1-year price.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealPrice The real price of the domain. For a premium domain, its price varies depending on the period. For a non-premium domain, the price is the 1-year price.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getRealPrice() {
        return this.RealPrice;
    }

    /**
     * Set The real price of the domain. For a premium domain, its price varies depending on the period. For a non-premium domain, the price is the 1-year price.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealPrice The real price of the domain. For a premium domain, its price varies depending on the period. For a non-premium domain, the price is the 1-year price.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealPrice(Float RealPrice) {
        this.RealPrice = RealPrice;
    }

    /**
     * Get The price for transferring a premium domain in.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FeeTransfer The price for transferring a premium domain in.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getFeeTransfer() {
        return this.FeeTransfer;
    }

    /**
     * Set The price for transferring a premium domain in.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FeeTransfer The price for transferring a premium domain in.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFeeTransfer(Float FeeTransfer) {
        this.FeeTransfer = FeeTransfer;
    }

    /**
     * Get The price for redeeming a premium domain. 
     * @return FeeRestore The price for redeeming a premium domain.
     */
    public Float getFeeRestore() {
        return this.FeeRestore;
    }

    /**
     * Set The price for redeeming a premium domain.
     * @param FeeRestore The price for redeeming a premium domain.
     */
    public void setFeeRestore(Float FeeRestore) {
        this.FeeRestore = FeeRestore;
    }

    /**
     * Get The period (in years) of the domain. 
     * @return Period The period (in years) of the domain.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set The period (in years) of the domain.
     * @param Period The period (in years) of the domain.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get The reason why the domain cannot be registered, expressed in Chinese. 
     * @return ReasonZh The reason why the domain cannot be registered, expressed in Chinese.
     */
    public String getReasonZh() {
        return this.ReasonZh;
    }

    /**
     * Set The reason why the domain cannot be registered, expressed in Chinese.
     * @param ReasonZh The reason why the domain cannot be registered, expressed in Chinese.
     */
    public void setReasonZh(String ReasonZh) {
        this.ReasonZh = ReasonZh;
    }

    /**
     * Get The internal error code. 
     * @return ResCode The internal error code.
     */
    public String getResCode() {
        return this.ResCode;
    }

    /**
     * Set The internal error code.
     * @param ResCode The internal error code.
     */
    public void setResCode(String ResCode) {
        this.ResCode = ResCode;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CheckIntlDomainNewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckIntlDomainNewResponse(CheckIntlDomainNewResponse source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Available != null) {
            this.Available = new Boolean(source.Available);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Premium != null) {
            this.Premium = new Boolean(source.Premium);
        }
        if (source.Price != null) {
            this.Price = new Float(source.Price);
        }
        if (source.BlackWord != null) {
            this.BlackWord = new Boolean(source.BlackWord);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.FeeRenew != null) {
            this.FeeRenew = new Float(source.FeeRenew);
        }
        if (source.RealPrice != null) {
            this.RealPrice = new Float(source.RealPrice);
        }
        if (source.FeeTransfer != null) {
            this.FeeTransfer = new Float(source.FeeTransfer);
        }
        if (source.FeeRestore != null) {
            this.FeeRestore = new Float(source.FeeRestore);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.ReasonZh != null) {
            this.ReasonZh = new String(source.ReasonZh);
        }
        if (source.ResCode != null) {
            this.ResCode = new String(source.ResCode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Premium", this.Premium);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "BlackWord", this.BlackWord);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "FeeRenew", this.FeeRenew);
        this.setParamSimple(map, prefix + "RealPrice", this.RealPrice);
        this.setParamSimple(map, prefix + "FeeTransfer", this.FeeTransfer);
        this.setParamSimple(map, prefix + "FeeRestore", this.FeeRestore);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ReasonZh", this.ReasonZh);
        this.setParamSimple(map, prefix + "ResCode", this.ResCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

