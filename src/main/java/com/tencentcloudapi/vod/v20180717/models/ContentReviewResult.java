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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContentReviewResult extends AbstractModel {

    /**
    * Result type. Valid values:
<li>Porn.Image: authentication result of offensive content in the image;</li>
<li>Terrorism.Image: authentication result of unsafe information in the image;</li>
<li>Political.Image: authentication result of inappropriate information in the image;</li>
<li>Porn.Ocr: authentication result of offensive content in image OCR text;</li>
<li>Terrorism.Ocr: Authentication result of unsafe information in image OCR text;</li>
<li>Political.Ocr: The authentication result of inappropriate information in the image OCR text.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Authentication result for offensive content in the image. Valid when Type is Porn.Image.
    */
    @SerializedName("PornImageResult")
    @Expose
    private PornImageResult PornImageResult;

    /**
    * Authentication result for unsafe information in the image. Valid when Type is Terrorism.Image.
    */
    @SerializedName("TerrorismImageResult")
    @Expose
    private TerrorismImageResult TerrorismImageResult;

    /**
    * Authentication of inappropriate information results in the image. Valid when Type is Political.Image.
    */
    @SerializedName("PoliticalImageResult")
    @Expose
    private PoliticalImageResult PoliticalImageResult;

    /**
    * Authentication result for offensive content in image OCR text. Valid when Type is Porn.Ocr.
    */
    @SerializedName("PornOcrResult")
    @Expose
    private ContentReviewOcrResult PornOcrResult;

    /**
    * Authentication result of unsafe information in image OCR. Valid when Type is Terrorism.Ocr.
    */
    @SerializedName("TerrorismOcrResult")
    @Expose
    private ContentReviewOcrResult TerrorismOcrResult;

    /**
    * The authentication result of inappropriate information in the image OCR text. Valid when Type is Political.Ocr.
    */
    @SerializedName("PoliticalOcrResult")
    @Expose
    private ContentReviewOcrResult PoliticalOcrResult;

    /**
     * Get Result type. Valid values:
<li>Porn.Image: authentication result of offensive content in the image;</li>
<li>Terrorism.Image: authentication result of unsafe information in the image;</li>
<li>Political.Image: authentication result of inappropriate information in the image;</li>
<li>Porn.Ocr: authentication result of offensive content in image OCR text;</li>
<li>Terrorism.Ocr: Authentication result of unsafe information in image OCR text;</li>
<li>Political.Ocr: The authentication result of inappropriate information in the image OCR text.</li> 
     * @return Type Result type. Valid values:
<li>Porn.Image: authentication result of offensive content in the image;</li>
<li>Terrorism.Image: authentication result of unsafe information in the image;</li>
<li>Political.Image: authentication result of inappropriate information in the image;</li>
<li>Porn.Ocr: authentication result of offensive content in image OCR text;</li>
<li>Terrorism.Ocr: Authentication result of unsafe information in image OCR text;</li>
<li>Political.Ocr: The authentication result of inappropriate information in the image OCR text.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Result type. Valid values:
<li>Porn.Image: authentication result of offensive content in the image;</li>
<li>Terrorism.Image: authentication result of unsafe information in the image;</li>
<li>Political.Image: authentication result of inappropriate information in the image;</li>
<li>Porn.Ocr: authentication result of offensive content in image OCR text;</li>
<li>Terrorism.Ocr: Authentication result of unsafe information in image OCR text;</li>
<li>Political.Ocr: The authentication result of inappropriate information in the image OCR text.</li>
     * @param Type Result type. Valid values:
<li>Porn.Image: authentication result of offensive content in the image;</li>
<li>Terrorism.Image: authentication result of unsafe information in the image;</li>
<li>Political.Image: authentication result of inappropriate information in the image;</li>
<li>Porn.Ocr: authentication result of offensive content in image OCR text;</li>
<li>Terrorism.Ocr: Authentication result of unsafe information in image OCR text;</li>
<li>Political.Ocr: The authentication result of inappropriate information in the image OCR text.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Authentication result for offensive content in the image. Valid when Type is Porn.Image. 
     * @return PornImageResult Authentication result for offensive content in the image. Valid when Type is Porn.Image.
     */
    public PornImageResult getPornImageResult() {
        return this.PornImageResult;
    }

    /**
     * Set Authentication result for offensive content in the image. Valid when Type is Porn.Image.
     * @param PornImageResult Authentication result for offensive content in the image. Valid when Type is Porn.Image.
     */
    public void setPornImageResult(PornImageResult PornImageResult) {
        this.PornImageResult = PornImageResult;
    }

    /**
     * Get Authentication result for unsafe information in the image. Valid when Type is Terrorism.Image. 
     * @return TerrorismImageResult Authentication result for unsafe information in the image. Valid when Type is Terrorism.Image.
     */
    public TerrorismImageResult getTerrorismImageResult() {
        return this.TerrorismImageResult;
    }

    /**
     * Set Authentication result for unsafe information in the image. Valid when Type is Terrorism.Image.
     * @param TerrorismImageResult Authentication result for unsafe information in the image. Valid when Type is Terrorism.Image.
     */
    public void setTerrorismImageResult(TerrorismImageResult TerrorismImageResult) {
        this.TerrorismImageResult = TerrorismImageResult;
    }

    /**
     * Get Authentication of inappropriate information results in the image. Valid when Type is Political.Image. 
     * @return PoliticalImageResult Authentication of inappropriate information results in the image. Valid when Type is Political.Image.
     */
    public PoliticalImageResult getPoliticalImageResult() {
        return this.PoliticalImageResult;
    }

    /**
     * Set Authentication of inappropriate information results in the image. Valid when Type is Political.Image.
     * @param PoliticalImageResult Authentication of inappropriate information results in the image. Valid when Type is Political.Image.
     */
    public void setPoliticalImageResult(PoliticalImageResult PoliticalImageResult) {
        this.PoliticalImageResult = PoliticalImageResult;
    }

    /**
     * Get Authentication result for offensive content in image OCR text. Valid when Type is Porn.Ocr. 
     * @return PornOcrResult Authentication result for offensive content in image OCR text. Valid when Type is Porn.Ocr.
     */
    public ContentReviewOcrResult getPornOcrResult() {
        return this.PornOcrResult;
    }

    /**
     * Set Authentication result for offensive content in image OCR text. Valid when Type is Porn.Ocr.
     * @param PornOcrResult Authentication result for offensive content in image OCR text. Valid when Type is Porn.Ocr.
     */
    public void setPornOcrResult(ContentReviewOcrResult PornOcrResult) {
        this.PornOcrResult = PornOcrResult;
    }

    /**
     * Get Authentication result of unsafe information in image OCR. Valid when Type is Terrorism.Ocr. 
     * @return TerrorismOcrResult Authentication result of unsafe information in image OCR. Valid when Type is Terrorism.Ocr.
     */
    public ContentReviewOcrResult getTerrorismOcrResult() {
        return this.TerrorismOcrResult;
    }

    /**
     * Set Authentication result of unsafe information in image OCR. Valid when Type is Terrorism.Ocr.
     * @param TerrorismOcrResult Authentication result of unsafe information in image OCR. Valid when Type is Terrorism.Ocr.
     */
    public void setTerrorismOcrResult(ContentReviewOcrResult TerrorismOcrResult) {
        this.TerrorismOcrResult = TerrorismOcrResult;
    }

    /**
     * Get The authentication result of inappropriate information in the image OCR text. Valid when Type is Political.Ocr. 
     * @return PoliticalOcrResult The authentication result of inappropriate information in the image OCR text. Valid when Type is Political.Ocr.
     */
    public ContentReviewOcrResult getPoliticalOcrResult() {
        return this.PoliticalOcrResult;
    }

    /**
     * Set The authentication result of inappropriate information in the image OCR text. Valid when Type is Political.Ocr.
     * @param PoliticalOcrResult The authentication result of inappropriate information in the image OCR text. Valid when Type is Political.Ocr.
     */
    public void setPoliticalOcrResult(ContentReviewOcrResult PoliticalOcrResult) {
        this.PoliticalOcrResult = PoliticalOcrResult;
    }

    public ContentReviewResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentReviewResult(ContentReviewResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PornImageResult != null) {
            this.PornImageResult = new PornImageResult(source.PornImageResult);
        }
        if (source.TerrorismImageResult != null) {
            this.TerrorismImageResult = new TerrorismImageResult(source.TerrorismImageResult);
        }
        if (source.PoliticalImageResult != null) {
            this.PoliticalImageResult = new PoliticalImageResult(source.PoliticalImageResult);
        }
        if (source.PornOcrResult != null) {
            this.PornOcrResult = new ContentReviewOcrResult(source.PornOcrResult);
        }
        if (source.TerrorismOcrResult != null) {
            this.TerrorismOcrResult = new ContentReviewOcrResult(source.TerrorismOcrResult);
        }
        if (source.PoliticalOcrResult != null) {
            this.PoliticalOcrResult = new ContentReviewOcrResult(source.PoliticalOcrResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "PornImageResult.", this.PornImageResult);
        this.setParamObj(map, prefix + "TerrorismImageResult.", this.TerrorismImageResult);
        this.setParamObj(map, prefix + "PoliticalImageResult.", this.PoliticalImageResult);
        this.setParamObj(map, prefix + "PornOcrResult.", this.PornOcrResult);
        this.setParamObj(map, prefix + "TerrorismOcrResult.", this.TerrorismOcrResult);
        this.setParamObj(map, prefix + "PoliticalOcrResult.", this.PoliticalOcrResult);

    }
}

