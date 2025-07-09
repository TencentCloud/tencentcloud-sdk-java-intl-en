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
    * OCR result of the ID card.
    */
    @SerializedName("NormalCardInfo")
    @Expose
    private NormalCardInfo NormalCardInfo;

    /**
    * The request id
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * Base64 of cropped image of ID card
    */
    @SerializedName("CardCutImageBase64")
    @Expose
    private String CardCutImageBase64;

    /**
    * Base64 of the cropped image on the reverse side of the ID card
    */
    @SerializedName("CardBackCutImageBase64")
    @Expose
    private String CardBackCutImageBase64;

    /**
    * Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9104 Alarm for PS certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled.
    */
    @SerializedName("WarnCardInfos")
    @Expose
    private Long [] WarnCardInfos;

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
     * @deprecated
     */
    @Deprecated
    public CardInfo getCardInfo() {
        return this.CardInfo;
    }

    /**
     * Set OCR result of the ID card.
     * @param CardInfo OCR result of the ID card.
     * @deprecated
     */
    @Deprecated
    public void setCardInfo(CardInfo CardInfo) {
        this.CardInfo = CardInfo;
    }

    /**
     * Get OCR result of the ID card. 
     * @return NormalCardInfo OCR result of the ID card.
     */
    public NormalCardInfo getNormalCardInfo() {
        return this.NormalCardInfo;
    }

    /**
     * Set OCR result of the ID card.
     * @param NormalCardInfo OCR result of the ID card.
     */
    public void setNormalCardInfo(NormalCardInfo NormalCardInfo) {
        this.NormalCardInfo = NormalCardInfo;
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

    /**
     * Get Base64 of cropped image of ID card 
     * @return CardCutImageBase64 Base64 of cropped image of ID card
     */
    public String getCardCutImageBase64() {
        return this.CardCutImageBase64;
    }

    /**
     * Set Base64 of cropped image of ID card
     * @param CardCutImageBase64 Base64 of cropped image of ID card
     */
    public void setCardCutImageBase64(String CardCutImageBase64) {
        this.CardCutImageBase64 = CardCutImageBase64;
    }

    /**
     * Get Base64 of the cropped image on the reverse side of the ID card 
     * @return CardBackCutImageBase64 Base64 of the cropped image on the reverse side of the ID card
     */
    public String getCardBackCutImageBase64() {
        return this.CardBackCutImageBase64;
    }

    /**
     * Set Base64 of the cropped image on the reverse side of the ID card
     * @param CardBackCutImageBase64 Base64 of the cropped image on the reverse side of the ID card
     */
    public void setCardBackCutImageBase64(String CardBackCutImageBase64) {
        this.CardBackCutImageBase64 = CardBackCutImageBase64;
    }

    /**
     * Get Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9104 Alarm for PS certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled. 
     * @return WarnCardInfos Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9104 Alarm for PS certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled.
     */
    public Long [] getWarnCardInfos() {
        return this.WarnCardInfos;
    }

    /**
     * Set Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9104 Alarm for PS certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled.
     * @param WarnCardInfos Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9104 Alarm for PS certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled.
     */
    public void setWarnCardInfos(Long [] WarnCardInfos) {
        this.WarnCardInfos = WarnCardInfos;
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
        if (source.NormalCardInfo != null) {
            this.NormalCardInfo = new NormalCardInfo(source.NormalCardInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.CardCutImageBase64 != null) {
            this.CardCutImageBase64 = new String(source.CardCutImageBase64);
        }
        if (source.CardBackCutImageBase64 != null) {
            this.CardBackCutImageBase64 = new String(source.CardBackCutImageBase64);
        }
        if (source.WarnCardInfos != null) {
            this.WarnCardInfos = new Long[source.WarnCardInfos.length];
            for (int i = 0; i < source.WarnCardInfos.length; i++) {
                this.WarnCardInfos[i] = new Long(source.WarnCardInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsPass", this.IsPass);
        this.setParamSimple(map, prefix + "CardImageBase64", this.CardImageBase64);
        this.setParamObj(map, prefix + "CardInfo.", this.CardInfo);
        this.setParamObj(map, prefix + "NormalCardInfo.", this.NormalCardInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "CardCutImageBase64", this.CardCutImageBase64);
        this.setParamSimple(map, prefix + "CardBackCutImageBase64", this.CardBackCutImageBase64);
        this.setParamArraySimple(map, prefix + "WarnCardInfos.", this.WarnCardInfos);

    }
}

