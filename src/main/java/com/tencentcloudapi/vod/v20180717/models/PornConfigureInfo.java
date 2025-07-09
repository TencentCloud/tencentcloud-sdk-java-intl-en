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
    * Parameters for recognition of pornographic content in images
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private PornImgReviewTemplateInfo ImgReviewInfo;

    /**
    * Parameters for ASR-based recognition of pornographic content
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private PornAsrReviewTemplateInfo AsrReviewInfo;

    /**
    * Parameters for OCR-based recognition of pornographic content
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private PornOcrReviewTemplateInfo OcrReviewInfo;

    /**
     * Get Parameters for recognition of pornographic content in images
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return ImgReviewInfo Parameters for recognition of pornographic content in images
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public PornImgReviewTemplateInfo getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set Parameters for recognition of pornographic content in images
Note: This field may return `null`, indicating that no valid value can be found.
     * @param ImgReviewInfo Parameters for recognition of pornographic content in images
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setImgReviewInfo(PornImgReviewTemplateInfo ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * Get Parameters for ASR-based recognition of pornographic content
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return AsrReviewInfo Parameters for ASR-based recognition of pornographic content
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public PornAsrReviewTemplateInfo getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set Parameters for ASR-based recognition of pornographic content
Note: This field may return `null`, indicating that no valid value can be found.
     * @param AsrReviewInfo Parameters for ASR-based recognition of pornographic content
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setAsrReviewInfo(PornAsrReviewTemplateInfo AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get Parameters for OCR-based recognition of pornographic content
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return OcrReviewInfo Parameters for OCR-based recognition of pornographic content
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public PornOcrReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set Parameters for OCR-based recognition of pornographic content
Note: This field may return `null`, indicating that no valid value can be found.
     * @param OcrReviewInfo Parameters for OCR-based recognition of pornographic content
Note: This field may return `null`, indicating that no valid value can be found.
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

