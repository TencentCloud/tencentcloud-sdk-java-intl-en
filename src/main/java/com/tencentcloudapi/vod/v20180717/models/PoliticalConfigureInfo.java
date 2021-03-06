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

public class PoliticalConfigureInfo extends AbstractModel{

    /**
    * Control parameter of politically sensitive information detection in video image.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private PoliticalImgReviewTemplateInfo ImgReviewInfo;

    /**
    * Control parameter of politically sensitive information detection in speech.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private PoliticalAsrReviewTemplateInfo AsrReviewInfo;

    /**
    * Control parameter of politically sensitive information detection in text.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private PoliticalOcrReviewTemplateInfo OcrReviewInfo;

    /**
     * Get Control parameter of politically sensitive information detection in video image.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ImgReviewInfo Control parameter of politically sensitive information detection in video image.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PoliticalImgReviewTemplateInfo getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set Control parameter of politically sensitive information detection in video image.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ImgReviewInfo Control parameter of politically sensitive information detection in video image.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setImgReviewInfo(PoliticalImgReviewTemplateInfo ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * Get Control parameter of politically sensitive information detection in speech.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AsrReviewInfo Control parameter of politically sensitive information detection in speech.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PoliticalAsrReviewTemplateInfo getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set Control parameter of politically sensitive information detection in speech.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AsrReviewInfo Control parameter of politically sensitive information detection in speech.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAsrReviewInfo(PoliticalAsrReviewTemplateInfo AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get Control parameter of politically sensitive information detection in text.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OcrReviewInfo Control parameter of politically sensitive information detection in text.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PoliticalOcrReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set Control parameter of politically sensitive information detection in text.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OcrReviewInfo Control parameter of politically sensitive information detection in text.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOcrReviewInfo(PoliticalOcrReviewTemplateInfo OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    public PoliticalConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PoliticalConfigureInfo(PoliticalConfigureInfo source) {
        if (source.ImgReviewInfo != null) {
            this.ImgReviewInfo = new PoliticalImgReviewTemplateInfo(source.ImgReviewInfo);
        }
        if (source.AsrReviewInfo != null) {
            this.AsrReviewInfo = new PoliticalAsrReviewTemplateInfo(source.AsrReviewInfo);
        }
        if (source.OcrReviewInfo != null) {
            this.OcrReviewInfo = new PoliticalOcrReviewTemplateInfo(source.OcrReviewInfo);
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

