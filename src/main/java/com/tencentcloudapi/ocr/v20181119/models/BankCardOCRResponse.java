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
    * Expiration date. Format: 07/2023
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * Card type
    */
    @SerializedName("CardType")
    @Expose
    private String CardType;

    /**
    * Card name
    */
    @SerializedName("CardName")
    @Expose
    private String CardName;

    /**
    * Sliced image data
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BorderCutImage")
    @Expose
    private String BorderCutImage;

    /**
    * Card number image data
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CardNoImage")
    @Expose
    private String CardNoImage;

    /**
    * Warning code:
-9110: the bank card date is invalid. 
-9111: the bank card border is incomplete. 
-9112: the bank card image is reflective.
-9113: the bank card image is a photocopy.
-9114: the bank card image is a photograph.
Multiple warning codes may be returned at a time.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("WarningCode")
    @Expose
    private Long [] WarningCode;

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
     * Get Expiration date. Format: 07/2023 
     * @return ValidDate Expiration date. Format: 07/2023
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set Expiration date. Format: 07/2023
     * @param ValidDate Expiration date. Format: 07/2023
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get Card type 
     * @return CardType Card type
     */
    public String getCardType() {
        return this.CardType;
    }

    /**
     * Set Card type
     * @param CardType Card type
     */
    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    /**
     * Get Card name 
     * @return CardName Card name
     */
    public String getCardName() {
        return this.CardName;
    }

    /**
     * Set Card name
     * @param CardName Card name
     */
    public void setCardName(String CardName) {
        this.CardName = CardName;
    }

    /**
     * Get Sliced image data
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return BorderCutImage Sliced image data
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getBorderCutImage() {
        return this.BorderCutImage;
    }

    /**
     * Set Sliced image data
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param BorderCutImage Sliced image data
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBorderCutImage(String BorderCutImage) {
        this.BorderCutImage = BorderCutImage;
    }

    /**
     * Get Card number image data
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CardNoImage Card number image data
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCardNoImage() {
        return this.CardNoImage;
    }

    /**
     * Set Card number image data
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CardNoImage Card number image data
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCardNoImage(String CardNoImage) {
        this.CardNoImage = CardNoImage;
    }

    /**
     * Get Warning code:
-9110: the bank card date is invalid. 
-9111: the bank card border is incomplete. 
-9112: the bank card image is reflective.
-9113: the bank card image is a photocopy.
-9114: the bank card image is a photograph.
Multiple warning codes may be returned at a time.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return WarningCode Warning code:
-9110: the bank card date is invalid. 
-9111: the bank card border is incomplete. 
-9112: the bank card image is reflective.
-9113: the bank card image is a photocopy.
-9114: the bank card image is a photograph.
Multiple warning codes may be returned at a time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long [] getWarningCode() {
        return this.WarningCode;
    }

    /**
     * Set Warning code:
-9110: the bank card date is invalid. 
-9111: the bank card border is incomplete. 
-9112: the bank card image is reflective.
-9113: the bank card image is a photocopy.
-9114: the bank card image is a photograph.
Multiple warning codes may be returned at a time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param WarningCode Warning code:
-9110: the bank card date is invalid. 
-9111: the bank card border is incomplete. 
-9112: the bank card image is reflective.
-9113: the bank card image is a photocopy.
-9114: the bank card image is a photograph.
Multiple warning codes may be returned at a time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setWarningCode(Long [] WarningCode) {
        this.WarningCode = WarningCode;
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
        this.setParamSimple(map, prefix + "CardType", this.CardType);
        this.setParamSimple(map, prefix + "CardName", this.CardName);
        this.setParamSimple(map, prefix + "BorderCutImage", this.BorderCutImage);
        this.setParamSimple(map, prefix + "CardNoImage", this.CardNoImage);
        this.setParamArraySimple(map, prefix + "WarningCode.", this.WarningCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

