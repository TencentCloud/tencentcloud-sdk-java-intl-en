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

public class PornConfigureInfo extends AbstractModel {

    /**
    * Control parameters for offensive information involved in image recognition.
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private PornImgReviewTemplateInfo ImgReviewInfo;

    /**
    * Control parameters for offensive information involved in ASR-based recognition.
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private PornAsrReviewTemplateInfo AsrReviewInfo;

    /**
    * Control parameters for offensive information involved in text recognition.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private PornOcrReviewTemplateInfo OcrReviewInfo;

    /**
     * Get Control parameters for offensive information involved in image recognition. 
     * @return ImgReviewInfo Control parameters for offensive information involved in image recognition.
     */
    public PornImgReviewTemplateInfo getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set Control parameters for offensive information involved in image recognition.
     * @param ImgReviewInfo Control parameters for offensive information involved in image recognition.
     */
    public void setImgReviewInfo(PornImgReviewTemplateInfo ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * Get Control parameters for offensive information involved in ASR-based recognition. 
     * @return AsrReviewInfo Control parameters for offensive information involved in ASR-based recognition.
     */
    public PornAsrReviewTemplateInfo getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set Control parameters for offensive information involved in ASR-based recognition.
     * @param AsrReviewInfo Control parameters for offensive information involved in ASR-based recognition.
     */
    public void setAsrReviewInfo(PornAsrReviewTemplateInfo AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get Control parameters for offensive information involved in text recognition. 
     * @return OcrReviewInfo Control parameters for offensive information involved in text recognition.
     */
    public PornOcrReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set Control parameters for offensive information involved in text recognition.
     * @param OcrReviewInfo Control parameters for offensive information involved in text recognition.
     */
    public void setOcrReviewInfo(PornOcrReviewTemplateInfo OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    public PornConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PornConfigureInfo(PornConfigureInfo source) {
        if (source.ImgReviewInfo != null) {
            this.ImgReviewInfo = new PornImgReviewTemplateInfo(source.ImgReviewInfo);
        }
        if (source.AsrReviewInfo != null) {
            this.AsrReviewInfo = new PornAsrReviewTemplateInfo(source.AsrReviewInfo);
        }
        if (source.OcrReviewInfo != null) {
            this.OcrReviewInfo = new PornOcrReviewTemplateInfo(source.OcrReviewInfo);
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

