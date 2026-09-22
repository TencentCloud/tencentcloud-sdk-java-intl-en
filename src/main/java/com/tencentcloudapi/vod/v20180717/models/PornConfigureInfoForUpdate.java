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

public class PornConfigureInfoForUpdate extends AbstractModel {

    /**
    * Image recognition involves control parameters for offensive information.
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private PornImgReviewTemplateInfoForUpdate ImgReviewInfo;

    /**
    * Control parameters for offensive information involved in ASR-based recognition.
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private PornAsrReviewTemplateInfoForUpdate AsrReviewInfo;

    /**
    * Control parameters for text recognition involving offensive content.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private PornOcrReviewTemplateInfoForUpdate OcrReviewInfo;

    /**
     * Get Image recognition involves control parameters for offensive information. 
     * @return ImgReviewInfo Image recognition involves control parameters for offensive information.
     */
    public PornImgReviewTemplateInfoForUpdate getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set Image recognition involves control parameters for offensive information.
     * @param ImgReviewInfo Image recognition involves control parameters for offensive information.
     */
    public void setImgReviewInfo(PornImgReviewTemplateInfoForUpdate ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * Get Control parameters for offensive information involved in ASR-based recognition. 
     * @return AsrReviewInfo Control parameters for offensive information involved in ASR-based recognition.
     */
    public PornAsrReviewTemplateInfoForUpdate getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set Control parameters for offensive information involved in ASR-based recognition.
     * @param AsrReviewInfo Control parameters for offensive information involved in ASR-based recognition.
     */
    public void setAsrReviewInfo(PornAsrReviewTemplateInfoForUpdate AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get Control parameters for text recognition involving offensive content. 
     * @return OcrReviewInfo Control parameters for text recognition involving offensive content.
     */
    public PornOcrReviewTemplateInfoForUpdate getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set Control parameters for text recognition involving offensive content.
     * @param OcrReviewInfo Control parameters for text recognition involving offensive content.
     */
    public void setOcrReviewInfo(PornOcrReviewTemplateInfoForUpdate OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    public PornConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PornConfigureInfoForUpdate(PornConfigureInfoForUpdate source) {
        if (source.ImgReviewInfo != null) {
            this.ImgReviewInfo = new PornImgReviewTemplateInfoForUpdate(source.ImgReviewInfo);
        }
        if (source.AsrReviewInfo != null) {
            this.AsrReviewInfo = new PornAsrReviewTemplateInfoForUpdate(source.AsrReviewInfo);
        }
        if (source.OcrReviewInfo != null) {
            this.OcrReviewInfo = new PornOcrReviewTemplateInfoForUpdate(source.OcrReviewInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImgReviewInfo.", this.ImgReviewInfo);
        this.setParamObj(map, prefix + "AsrReviewInfo.", this.AsrReviewInfo);
        this.setParamObj(map, prefix + "OcrReviewInfo.", this.OcrReviewInfo);

    }
}

