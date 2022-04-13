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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContentReviewResult extends AbstractModel{

    /**
    * The result type. Valid values:
<li>Porn.Image: Recognition of pornographic content in the image</li>
<li>Terrorism.Image: Recognition of terrorism content in the image</li>
<li>Political.Image: Recognition of politically sensitive content in the image</li>
<li>Porn.Ocr: OCR-based recognition of pornographic content in the image</li>
<li>Terrorism.Ocr: OCR-based recognition of terrorism content in the image</li>
<li>Political.Ocr: OCR-based recognition of politically sensitive content in the image</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The pornographic content detected in the image. This parameter is valid if `Type` is `Porn.Image`.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PornImageResult")
    @Expose
    private PornImageResult PornImageResult;

    /**
    * The terrorism content detected in the image. This parameter is valid if `Type` is `Terrorism.Image`.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("TerrorismImageResult")
    @Expose
    private TerrorismImageResult TerrorismImageResult;

    /**
    * The politically sensitive content detected in the image. This parameter is valid if `Type` is `Political.Image`.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PoliticalImageResult")
    @Expose
    private PoliticalImageResult PoliticalImageResult;

    /**
    * The pornographic content detected in the image based on OCR. This parameter is valid if `Type` is `Porn.Ocr`.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PornOcrResult")
    @Expose
    private ContentReviewOcrResult PornOcrResult;

    /**
    * The terrorism content detected in the image based on OCR. This parameter is valid if `Type` is `Terrorism.Ocr`.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("TerrorismOcrResult")
    @Expose
    private ContentReviewOcrResult TerrorismOcrResult;

    /**
    * The politically sensitive content detected in the image based on OCR. This parameter is valid if `Type` is `Political.Ocr`.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PoliticalOcrResult")
    @Expose
    private ContentReviewOcrResult PoliticalOcrResult;

    /**
     * Get The result type. Valid values:
<li>Porn.Image: Recognition of pornographic content in the image</li>
<li>Terrorism.Image: Recognition of terrorism content in the image</li>
<li>Political.Image: Recognition of politically sensitive content in the image</li>
<li>Porn.Ocr: OCR-based recognition of pornographic content in the image</li>
<li>Terrorism.Ocr: OCR-based recognition of terrorism content in the image</li>
<li>Political.Ocr: OCR-based recognition of politically sensitive content in the image</li> 
     * @return Type The result type. Valid values:
<li>Porn.Image: Recognition of pornographic content in the image</li>
<li>Terrorism.Image: Recognition of terrorism content in the image</li>
<li>Political.Image: Recognition of politically sensitive content in the image</li>
<li>Porn.Ocr: OCR-based recognition of pornographic content in the image</li>
<li>Terrorism.Ocr: OCR-based recognition of terrorism content in the image</li>
<li>Political.Ocr: OCR-based recognition of politically sensitive content in the image</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The result type. Valid values:
<li>Porn.Image: Recognition of pornographic content in the image</li>
<li>Terrorism.Image: Recognition of terrorism content in the image</li>
<li>Political.Image: Recognition of politically sensitive content in the image</li>
<li>Porn.Ocr: OCR-based recognition of pornographic content in the image</li>
<li>Terrorism.Ocr: OCR-based recognition of terrorism content in the image</li>
<li>Political.Ocr: OCR-based recognition of politically sensitive content in the image</li>
     * @param Type The result type. Valid values:
<li>Porn.Image: Recognition of pornographic content in the image</li>
<li>Terrorism.Image: Recognition of terrorism content in the image</li>
<li>Political.Image: Recognition of politically sensitive content in the image</li>
<li>Porn.Ocr: OCR-based recognition of pornographic content in the image</li>
<li>Terrorism.Ocr: OCR-based recognition of terrorism content in the image</li>
<li>Political.Ocr: OCR-based recognition of politically sensitive content in the image</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The pornographic content detected in the image. This parameter is valid if `Type` is `Porn.Image`.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return PornImageResult The pornographic content detected in the image. This parameter is valid if `Type` is `Porn.Image`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public PornImageResult getPornImageResult() {
        return this.PornImageResult;
    }

    /**
     * Set The pornographic content detected in the image. This parameter is valid if `Type` is `Porn.Image`.
Note: This field may return `null`, indicating that no valid value was found.
     * @param PornImageResult The pornographic content detected in the image. This parameter is valid if `Type` is `Porn.Image`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPornImageResult(PornImageResult PornImageResult) {
        this.PornImageResult = PornImageResult;
    }

    /**
     * Get The terrorism content detected in the image. This parameter is valid if `Type` is `Terrorism.Image`.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return TerrorismImageResult The terrorism content detected in the image. This parameter is valid if `Type` is `Terrorism.Image`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public TerrorismImageResult getTerrorismImageResult() {
        return this.TerrorismImageResult;
    }

    /**
     * Set The terrorism content detected in the image. This parameter is valid if `Type` is `Terrorism.Image`.
Note: This field may return `null`, indicating that no valid value was found.
     * @param TerrorismImageResult The terrorism content detected in the image. This parameter is valid if `Type` is `Terrorism.Image`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTerrorismImageResult(TerrorismImageResult TerrorismImageResult) {
        this.TerrorismImageResult = TerrorismImageResult;
    }

    /**
     * Get The politically sensitive content detected in the image. This parameter is valid if `Type` is `Political.Image`.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return PoliticalImageResult The politically sensitive content detected in the image. This parameter is valid if `Type` is `Political.Image`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public PoliticalImageResult getPoliticalImageResult() {
        return this.PoliticalImageResult;
    }

    /**
     * Set The politically sensitive content detected in the image. This parameter is valid if `Type` is `Political.Image`.
Note: This field may return `null`, indicating that no valid value was found.
     * @param PoliticalImageResult The politically sensitive content detected in the image. This parameter is valid if `Type` is `Political.Image`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPoliticalImageResult(PoliticalImageResult PoliticalImageResult) {
        this.PoliticalImageResult = PoliticalImageResult;
    }

    /**
     * Get The pornographic content detected in the image based on OCR. This parameter is valid if `Type` is `Porn.Ocr`.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return PornOcrResult The pornographic content detected in the image based on OCR. This parameter is valid if `Type` is `Porn.Ocr`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public ContentReviewOcrResult getPornOcrResult() {
        return this.PornOcrResult;
    }

    /**
     * Set The pornographic content detected in the image based on OCR. This parameter is valid if `Type` is `Porn.Ocr`.
Note: This field may return `null`, indicating that no valid value was found.
     * @param PornOcrResult The pornographic content detected in the image based on OCR. This parameter is valid if `Type` is `Porn.Ocr`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPornOcrResult(ContentReviewOcrResult PornOcrResult) {
        this.PornOcrResult = PornOcrResult;
    }

    /**
     * Get The terrorism content detected in the image based on OCR. This parameter is valid if `Type` is `Terrorism.Ocr`.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return TerrorismOcrResult The terrorism content detected in the image based on OCR. This parameter is valid if `Type` is `Terrorism.Ocr`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public ContentReviewOcrResult getTerrorismOcrResult() {
        return this.TerrorismOcrResult;
    }

    /**
     * Set The terrorism content detected in the image based on OCR. This parameter is valid if `Type` is `Terrorism.Ocr`.
Note: This field may return `null`, indicating that no valid value was found.
     * @param TerrorismOcrResult The terrorism content detected in the image based on OCR. This parameter is valid if `Type` is `Terrorism.Ocr`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTerrorismOcrResult(ContentReviewOcrResult TerrorismOcrResult) {
        this.TerrorismOcrResult = TerrorismOcrResult;
    }

    /**
     * Get The politically sensitive content detected in the image based on OCR. This parameter is valid if `Type` is `Political.Ocr`.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return PoliticalOcrResult The politically sensitive content detected in the image based on OCR. This parameter is valid if `Type` is `Political.Ocr`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public ContentReviewOcrResult getPoliticalOcrResult() {
        return this.PoliticalOcrResult;
    }

    /**
     * Set The politically sensitive content detected in the image based on OCR. This parameter is valid if `Type` is `Political.Ocr`.
Note: This field may return `null`, indicating that no valid value was found.
     * @param PoliticalOcrResult The politically sensitive content detected in the image based on OCR. This parameter is valid if `Type` is `Political.Ocr`.
Note: This field may return `null`, indicating that no valid value was found.
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

