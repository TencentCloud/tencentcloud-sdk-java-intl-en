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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BankCardOCRResponse extends AbstractModel{

    /**
    * Card number
    */
    @SerializedName("CardNo")
    @Expose
    private String CardNo;

    /**
    * Bank information
    */
    @SerializedName("BankInfo")
    @Expose
    private String BankInfo;

    /**
    * Expiration date
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Card number 
     * @return CardNo Card number
     */
    public String getCardNo() {
        return this.CardNo;
    }

    /**
     * Set Card number
     * @param CardNo Card number
     */
    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    /**
     * Get Bank information 
     * @return BankInfo Bank information
     */
    public String getBankInfo() {
        return this.BankInfo;
    }

    /**
     * Set Bank information
     * @param BankInfo Bank information
     */
    public void setBankInfo(String BankInfo) {
        this.BankInfo = BankInfo;
    }

    /**
     * Get Expiration date 
     * @return ValidDate Expiration date
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set Expiration date
     * @param ValidDate Expiration date
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CardNo", this.CardNo);
        this.setParamSimple(map, prefix + "BankInfo", this.BankInfo);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

