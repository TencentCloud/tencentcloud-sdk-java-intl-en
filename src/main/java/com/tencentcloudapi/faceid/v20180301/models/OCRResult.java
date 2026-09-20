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
    */
    @SerializedName("IsPass")
    @Expose
    private Boolean IsPass;

    /**
    * <p>Base64 of the front image of the identity document</p>
    */
    @SerializedName("CardImageBase64")
    @Expose
    private String CardImageBase64;

    /**
    * <p>ID document recognition result</p>
    */
    @SerializedName("CardInfo")
    @Expose
    private CardInfo CardInfo;

    /**
    * <p>ID document recognition result (when CheckMode value is 4, the OriginalCardInfo field is returned; in other scenarios, the current field is returned)</p>
    */
    @SerializedName("NormalCardInfo")
    @Expose
    private NormalCardInfo NormalCardInfo;

    /**
    * <p>Request id</p>
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * <p>Base64 of the front cropped image of the identity document</p>
    */
    @SerializedName("CardCutImageBase64")
    @Expose
    private String CardCutImageBase64;

    /**
    * <p>Base64 of the edge-cropped image of the back of an identity document</p>
    */
    @SerializedName("CardBackCutImageBase64")
    @Expose
    private String CardBackCutImageBase64;

    /**
    * <p>Alarm code</p><p>Enumeration value:</p><ul><li>-9101: alarm for incomplete document border</li><li>-9102: alarm for document photocopy</li><li>-9103: alarm for document rephotographing</li><li>-9104: document PS alarm</li><li>-9107: document reflective alarm</li><li>-9108: alarm for blurry document</li><li>-9109: alarm capability not enabled</li></ul>
    */
    @SerializedName("WarnCardInfos")
    @Expose
    private Long [] WarnCardInfos;

    /**
    * <p>Original document recognition information (when CheckMode value is 4, the current field will be returned)</p>
    */
    @SerializedName("OriginalCardInfo")
    @Expose
    private String OriginalCardInfo;

    /**
    * <p>Portrait matting in the document</p>
    */
    @SerializedName("HeadImageBase64")
    @Expose
    private String HeadImageBase64;

    /**
    * <p>Base64 of the back image of the identity document</p>
    */
    @SerializedName("CardBackImageBase64")
    @Expose
    private String CardBackImageBase64;

    /**
     * Get <p>Whether the identity authentication or OCR process is successful.</p> 
     * @return IsPass <p>Whether the identity authentication or OCR process is successful.</p>
     */
    public Boolean getIsPass() {
        return this.IsPass;
    }

    /**
     * Set <p>Whether the identity authentication or OCR process is successful.</p>
     * @param IsPass <p>Whether the identity authentication or OCR process is successful.</p>
     */
    public void setIsPass(Boolean IsPass) {
        this.IsPass = IsPass;
    }

    /**
     * Get <p>Base64 of the front image of the identity document</p> 
     * @return CardImageBase64 <p>Base64 of the front image of the identity document</p>
     */
    public String getCardImageBase64() {
        return this.CardImageBase64;
    }

    /**
     * Set <p>Base64 of the front image of the identity document</p>
     * @param CardImageBase64 <p>Base64 of the front image of the identity document</p>
     */
    public void setCardImageBase64(String CardImageBase64) {
        this.CardImageBase64 = CardImageBase64;
    }

    /**
     * Get <p>ID document recognition result</p> 
     * @return CardInfo <p>ID document recognition result</p>
     * @deprecated
     */
    @Deprecated
    public CardInfo getCardInfo() {
        return this.CardInfo;
    }

    /**
     * Set <p>ID document recognition result</p>
     * @param CardInfo <p>ID document recognition result</p>
     * @deprecated
     */
    @Deprecated
    public void setCardInfo(CardInfo CardInfo) {
        this.CardInfo = CardInfo;
    }

    /**
     * Get <p>ID document recognition result (when CheckMode value is 4, the OriginalCardInfo field is returned; in other scenarios, the current field is returned)</p> 
     * @return NormalCardInfo <p>ID document recognition result (when CheckMode value is 4, the OriginalCardInfo field is returned; in other scenarios, the current field is returned)</p>
     */
    public NormalCardInfo getNormalCardInfo() {
        return this.NormalCardInfo;
    }

    /**
     * Set <p>ID document recognition result (when CheckMode value is 4, the OriginalCardInfo field is returned; in other scenarios, the current field is returned)</p>
     * @param NormalCardInfo <p>ID document recognition result (when CheckMode value is 4, the OriginalCardInfo field is returned; in other scenarios, the current field is returned)</p>
     */
    public void setNormalCardInfo(NormalCardInfo NormalCardInfo) {
        this.NormalCardInfo = NormalCardInfo;
    }

    /**
     * Get <p>Request id</p> 
     * @return RequestId <p>Request id</p>
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set <p>Request id</p>
     * @param RequestId <p>Request id</p>
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get <p>Base64 of the front cropped image of the identity document</p> 
     * @return CardCutImageBase64 <p>Base64 of the front cropped image of the identity document</p>
     */
    public String getCardCutImageBase64() {
        return this.CardCutImageBase64;
    }

    /**
     * Set <p>Base64 of the front cropped image of the identity document</p>
     * @param CardCutImageBase64 <p>Base64 of the front cropped image of the identity document</p>
     */
    public void setCardCutImageBase64(String CardCutImageBase64) {
        this.CardCutImageBase64 = CardCutImageBase64;
    }

    /**
     * Get <p>Base64 of the edge-cropped image of the back of an identity document</p> 
     * @return CardBackCutImageBase64 <p>Base64 of the edge-cropped image of the back of an identity document</p>
     */
    public String getCardBackCutImageBase64() {
        return this.CardBackCutImageBase64;
    }

    /**
     * Set <p>Base64 of the edge-cropped image of the back of an identity document</p>
     * @param CardBackCutImageBase64 <p>Base64 of the edge-cropped image of the back of an identity document</p>
     */
    public void setCardBackCutImageBase64(String CardBackCutImageBase64) {
        this.CardBackCutImageBase64 = CardBackCutImageBase64;
    }

    /**
     * Get <p>Alarm code</p><p>Enumeration value:</p><ul><li>-9101: alarm for incomplete document border</li><li>-9102: alarm for document photocopy</li><li>-9103: alarm for document rephotographing</li><li>-9104: document PS alarm</li><li>-9107: document reflective alarm</li><li>-9108: alarm for blurry document</li><li>-9109: alarm capability not enabled</li></ul> 
     * @return WarnCardInfos <p>Alarm code</p><p>Enumeration value:</p><ul><li>-9101: alarm for incomplete document border</li><li>-9102: alarm for document photocopy</li><li>-9103: alarm for document rephotographing</li><li>-9104: document PS alarm</li><li>-9107: document reflective alarm</li><li>-9108: alarm for blurry document</li><li>-9109: alarm capability not enabled</li></ul>
     */
    public Long [] getWarnCardInfos() {
        return this.WarnCardInfos;
    }

    /**
     * Set <p>Alarm code</p><p>Enumeration value:</p><ul><li>-9101: alarm for incomplete document border</li><li>-9102: alarm for document photocopy</li><li>-9103: alarm for document rephotographing</li><li>-9104: document PS alarm</li><li>-9107: document reflective alarm</li><li>-9108: alarm for blurry document</li><li>-9109: alarm capability not enabled</li></ul>
     * @param WarnCardInfos <p>Alarm code</p><p>Enumeration value:</p><ul><li>-9101: alarm for incomplete document border</li><li>-9102: alarm for document photocopy</li><li>-9103: alarm for document rephotographing</li><li>-9104: document PS alarm</li><li>-9107: document reflective alarm</li><li>-9108: alarm for blurry document</li><li>-9109: alarm capability not enabled</li></ul>
     */
    public void setWarnCardInfos(Long [] WarnCardInfos) {
        this.WarnCardInfos = WarnCardInfos;
    }

    /**
     * Get <p>Original document recognition information (when CheckMode value is 4, the current field will be returned)</p> 
     * @return OriginalCardInfo <p>Original document recognition information (when CheckMode value is 4, the current field will be returned)</p>
     */
    public String getOriginalCardInfo() {
        return this.OriginalCardInfo;
    }

    /**
     * Set <p>Original document recognition information (when CheckMode value is 4, the current field will be returned)</p>
     * @param OriginalCardInfo <p>Original document recognition information (when CheckMode value is 4, the current field will be returned)</p>
     */
    public void setOriginalCardInfo(String OriginalCardInfo) {
        this.OriginalCardInfo = OriginalCardInfo;
    }

    /**
     * Get <p>Portrait matting in the document</p> 
     * @return HeadImageBase64 <p>Portrait matting in the document</p>
     */
    public String getHeadImageBase64() {
        return this.HeadImageBase64;
    }

    /**
     * Set <p>Portrait matting in the document</p>
     * @param HeadImageBase64 <p>Portrait matting in the document</p>
     */
    public void setHeadImageBase64(String HeadImageBase64) {
        this.HeadImageBase64 = HeadImageBase64;
    }

    /**
     * Get <p>Base64 of the back image of the identity document</p> 
     * @return CardBackImageBase64 <p>Base64 of the back image of the identity document</p>
     */
    public String getCardBackImageBase64() {
        return this.CardBackImageBase64;
    }

    /**
     * Set <p>Base64 of the back image of the identity document</p>
     * @param CardBackImageBase64 <p>Base64 of the back image of the identity document</p>
     */
    public void setCardBackImageBase64(String CardBackImageBase64) {
        this.CardBackImageBase64 = CardBackImageBase64;
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
        if (source.HeadImageBase64 != null) {
            this.HeadImageBase64 = new String(source.HeadImageBase64);
        }
        if (source.CardBackImageBase64 != null) {
            this.CardBackImageBase64 = new String(source.CardBackImageBase64);
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
        this.setParamSimple(map, prefix + "HeadImageBase64", this.HeadImageBase64);
        this.setParamSimple(map, prefix + "CardBackImageBase64", this.CardBackImageBase64);

    }
}

