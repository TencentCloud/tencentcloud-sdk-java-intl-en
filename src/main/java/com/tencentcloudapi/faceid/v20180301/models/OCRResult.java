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
    * <p>Whether the identity authentication or OCR process is successful.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsPass")
    @Expose
    private Boolean IsPass;

    /**
    * <p>Base64 of the ID image</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CardImageBase64")
    @Expose
    private String CardImageBase64;

    /**
    * <p>ID card recognition result</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CardInfo")
    @Expose
    private CardInfo CardInfo;

    /**
    * <p>Document recognition result (when CheckMode value is 4, return the OriginalCardInfo field; other scenarios return the current field)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NormalCardInfo")
    @Expose
    private NormalCardInfo NormalCardInfo;

    /**
    * <p>Request id</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * <p>Base64 of the cropped ID image</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CardCutImageBase64")
    @Expose
    private String CardCutImageBase64;

    /**
    * <p>Base64 of the cropped image of the back side of the ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CardBackCutImageBase64")
    @Expose
    private String CardBackCutImageBase64;

    /**
    * <p>Alarm code</p><p>Enumeration value:</p><ul><li>9101: Alarm for incomplete document border</li><li>9102: Alarm for document photocopy</li><li>9103: Alarm for rephotographing</li><li>9104: PS alarm</li><li>9107: Reflective alarm</li><li>9108: Blurry alarm</li><li>9109: Alarm capability not enabled</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WarnCardInfos")
    @Expose
    private Long [] WarnCardInfos;

    /**
    * <p>Original document recognition information (the current field will be returned when CheckMode value is 4)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginalCardInfo")
    @Expose
    private String OriginalCardInfo;

    /**
     * Get <p>Whether the identity authentication or OCR process is successful.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsPass <p>Whether the identity authentication or OCR process is successful.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsPass() {
        return this.IsPass;
    }

    /**
     * Set <p>Whether the identity authentication or OCR process is successful.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsPass <p>Whether the identity authentication or OCR process is successful.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsPass(Boolean IsPass) {
        this.IsPass = IsPass;
    }

    /**
     * Get <p>Base64 of the ID image</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CardImageBase64 <p>Base64 of the ID image</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCardImageBase64() {
        return this.CardImageBase64;
    }

    /**
     * Set <p>Base64 of the ID image</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CardImageBase64 <p>Base64 of the ID image</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCardImageBase64(String CardImageBase64) {
        this.CardImageBase64 = CardImageBase64;
    }

    /**
     * Get <p>ID card recognition result</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CardInfo <p>ID card recognition result</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public CardInfo getCardInfo() {
        return this.CardInfo;
    }

    /**
     * Set <p>ID card recognition result</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CardInfo <p>ID card recognition result</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setCardInfo(CardInfo CardInfo) {
        this.CardInfo = CardInfo;
    }

    /**
     * Get <p>Document recognition result (when CheckMode value is 4, return the OriginalCardInfo field; other scenarios return the current field)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NormalCardInfo <p>Document recognition result (when CheckMode value is 4, return the OriginalCardInfo field; other scenarios return the current field)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NormalCardInfo getNormalCardInfo() {
        return this.NormalCardInfo;
    }

    /**
     * Set <p>Document recognition result (when CheckMode value is 4, return the OriginalCardInfo field; other scenarios return the current field)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NormalCardInfo <p>Document recognition result (when CheckMode value is 4, return the OriginalCardInfo field; other scenarios return the current field)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNormalCardInfo(NormalCardInfo NormalCardInfo) {
        this.NormalCardInfo = NormalCardInfo;
    }

    /**
     * Get <p>Request id</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RequestId <p>Request id</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set <p>Request id</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RequestId <p>Request id</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get <p>Base64 of the cropped ID image</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CardCutImageBase64 <p>Base64 of the cropped ID image</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCardCutImageBase64() {
        return this.CardCutImageBase64;
    }

    /**
     * Set <p>Base64 of the cropped ID image</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CardCutImageBase64 <p>Base64 of the cropped ID image</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCardCutImageBase64(String CardCutImageBase64) {
        this.CardCutImageBase64 = CardCutImageBase64;
    }

    /**
     * Get <p>Base64 of the cropped image of the back side of the ID</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CardBackCutImageBase64 <p>Base64 of the cropped image of the back side of the ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCardBackCutImageBase64() {
        return this.CardBackCutImageBase64;
    }

    /**
     * Set <p>Base64 of the cropped image of the back side of the ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CardBackCutImageBase64 <p>Base64 of the cropped image of the back side of the ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCardBackCutImageBase64(String CardBackCutImageBase64) {
        this.CardBackCutImageBase64 = CardBackCutImageBase64;
    }

    /**
     * Get <p>Alarm code</p><p>Enumeration value:</p><ul><li>9101: Alarm for incomplete document border</li><li>9102: Alarm for document photocopy</li><li>9103: Alarm for rephotographing</li><li>9104: PS alarm</li><li>9107: Reflective alarm</li><li>9108: Blurry alarm</li><li>9109: Alarm capability not enabled</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WarnCardInfos <p>Alarm code</p><p>Enumeration value:</p><ul><li>9101: Alarm for incomplete document border</li><li>9102: Alarm for document photocopy</li><li>9103: Alarm for rephotographing</li><li>9104: PS alarm</li><li>9107: Reflective alarm</li><li>9108: Blurry alarm</li><li>9109: Alarm capability not enabled</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getWarnCardInfos() {
        return this.WarnCardInfos;
    }

    /**
     * Set <p>Alarm code</p><p>Enumeration value:</p><ul><li>9101: Alarm for incomplete document border</li><li>9102: Alarm for document photocopy</li><li>9103: Alarm for rephotographing</li><li>9104: PS alarm</li><li>9107: Reflective alarm</li><li>9108: Blurry alarm</li><li>9109: Alarm capability not enabled</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WarnCardInfos <p>Alarm code</p><p>Enumeration value:</p><ul><li>9101: Alarm for incomplete document border</li><li>9102: Alarm for document photocopy</li><li>9103: Alarm for rephotographing</li><li>9104: PS alarm</li><li>9107: Reflective alarm</li><li>9108: Blurry alarm</li><li>9109: Alarm capability not enabled</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWarnCardInfos(Long [] WarnCardInfos) {
        this.WarnCardInfos = WarnCardInfos;
    }

    /**
     * Get <p>Original document recognition information (the current field will be returned when CheckMode value is 4)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginalCardInfo <p>Original document recognition information (the current field will be returned when CheckMode value is 4)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginalCardInfo() {
        return this.OriginalCardInfo;
    }

    /**
     * Set <p>Original document recognition information (the current field will be returned when CheckMode value is 4)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginalCardInfo <p>Original document recognition information (the current field will be returned when CheckMode value is 4)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginalCardInfo(String OriginalCardInfo) {
        this.OriginalCardInfo = OriginalCardInfo;
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
        if (source.OriginalCardInfo != null) {
            this.OriginalCardInfo = new String(source.OriginalCardInfo);
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
        this.setParamSimple(map, prefix + "OriginalCardInfo", this.OriginalCardInfo);

    }
}

