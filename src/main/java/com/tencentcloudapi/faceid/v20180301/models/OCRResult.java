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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OCRResult extends AbstractModel {

    /**
    * Is the indentity verification or OCR process passed
    */
    @SerializedName("IsPass")
    @Expose
    private Boolean IsPass;

    /**
    * The Base64 of ID card image
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CardImageBase64")
    @Expose
    private String CardImageBase64;

    /**
    * OCR result of the ID card.
    */
    @SerializedName("CardInfo")
    @Expose
    private CardInfo CardInfo;

    /**
    * The request id
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Is the indentity verification or OCR process passed 
     * @return IsPass Is the indentity verification or OCR process passed
     */
    public Boolean getIsPass() {
        return this.IsPass;
    }

    /**
     * Set Is the indentity verification or OCR process passed
     * @param IsPass Is the indentity verification or OCR process passed
     */
    public void setIsPass(Boolean IsPass) {
        this.IsPass = IsPass;
    }

    /**
     * Get The Base64 of ID card image
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CardImageBase64 The Base64 of ID card image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCardImageBase64() {
        return this.CardImageBase64;
    }

    /**
     * Set The Base64 of ID card image
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CardImageBase64 The Base64 of ID card image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCardImageBase64(String CardImageBase64) {
        this.CardImageBase64 = CardImageBase64;
    }

    /**
     * Get OCR result of the ID card. 
     * @return CardInfo OCR result of the ID card.
     */
    public CardInfo getCardInfo() {
        return this.CardInfo;
    }

    /**
     * Set OCR result of the ID card.
     * @param CardInfo OCR result of the ID card.
     */
    public void setCardInfo(CardInfo CardInfo) {
        this.CardInfo = CardInfo;
    }

    /**
     * Get The request id 
     * @return RequestId The request id
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The request id
     * @param RequestId The request id
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public OCRResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OCRResult(OCRResult source) {
        if (source.IsPass != null) {
            this.IsPass = new Boolean(source.IsPass);
        }
        if (source.CardImageBase64 != null) {
            this.CardImageBase64 = new String(source.CardImageBase64);
        }
        if (source.CardInfo != null) {
            this.CardInfo = new CardInfo(source.CardInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsPass", this.IsPass);
        this.setParamSimple(map, prefix + "CardImageBase64", this.CardImageBase64);
        this.setParamObj(map, prefix + "CardInfo.", this.CardInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

