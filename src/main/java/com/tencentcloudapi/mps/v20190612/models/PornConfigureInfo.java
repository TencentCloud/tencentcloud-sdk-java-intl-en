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

public class PornConfigureInfo extends AbstractModel{

    /**
    * Control parameter of porn information detection in image.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private PornImgReviewTemplateInfo ImgReviewInfo;

    /**
    * Control parameter of porn information detection in speech.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private PornAsrReviewTemplateInfo AsrReviewInfo;

    /**
    * Control parameter of porn information detection in text.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private PornOcrReviewTemplateInfo OcrReviewInfo;

    /**
     * Get Control parameter of porn information detection in image.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImgReviewInfo Control parameter of porn information detection in image.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PornImgReviewTemplateInfo getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set Control parameter of porn information detection in image.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImgReviewInfo Control parameter of porn information detection in image.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImgReviewInfo(PornImgReviewTemplateInfo ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * Get Control parameter of porn information detection in speech.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AsrReviewInfo Control parameter of porn information detection in speech.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PornAsrReviewTemplateInfo getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set Control parameter of porn information detection in speech.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AsrReviewInfo Control parameter of porn information detection in speech.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAsrReviewInfo(PornAsrReviewTemplateInfo AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get Control parameter of porn information detection in text.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OcrReviewInfo Control parameter of porn information detection in text.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PornOcrReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set Control parameter of porn information detection in text.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OcrReviewInfo Control parameter of porn information detection in text.
Note: This field may return null, indicating that no valid values can be obtained.
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

