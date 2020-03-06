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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PoliticalConfigureInfoForUpdate extends AbstractModel{

    /**
    * Control parameter of politically sensitive information detection in image.
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private PoliticalImgReviewTemplateInfoForUpdate ImgReviewInfo;

    /**
    * Control parameter of politically sensitive information detection in speech.
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private PoliticalAsrReviewTemplateInfoForUpdate AsrReviewInfo;

    /**
    * Control parameter of politically sensitive information detection in text.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private PoliticalOcrReviewTemplateInfoForUpdate OcrReviewInfo;

    /**
     * Get Control parameter of politically sensitive information detection in image. 
     * @return ImgReviewInfo Control parameter of politically sensitive information detection in image.
     */
    public PoliticalImgReviewTemplateInfoForUpdate getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set Control parameter of politically sensitive information detection in image.
     * @param ImgReviewInfo Control parameter of politically sensitive information detection in image.
     */
    public void setImgReviewInfo(PoliticalImgReviewTemplateInfoForUpdate ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * Get Control parameter of politically sensitive information detection in speech. 
     * @return AsrReviewInfo Control parameter of politically sensitive information detection in speech.
     */
    public PoliticalAsrReviewTemplateInfoForUpdate getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set Control parameter of politically sensitive information detection in speech.
     * @param AsrReviewInfo Control parameter of politically sensitive information detection in speech.
     */
    public void setAsrReviewInfo(PoliticalAsrReviewTemplateInfoForUpdate AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get Control parameter of politically sensitive information detection in text. 
     * @return OcrReviewInfo Control parameter of politically sensitive information detection in text.
     */
    public PoliticalOcrReviewTemplateInfoForUpdate getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set Control parameter of politically sensitive information detection in text.
     * @param OcrReviewInfo Control parameter of politically sensitive information detection in text.
     */
    public void setOcrReviewInfo(PoliticalOcrReviewTemplateInfoForUpdate OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
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

