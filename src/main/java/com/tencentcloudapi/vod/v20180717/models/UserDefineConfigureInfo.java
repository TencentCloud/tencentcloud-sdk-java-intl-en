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

public class UserDefineConfigureInfo extends AbstractModel {

    /**
    * Parameters for custom facial recognition
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("FaceReviewInfo")
    @Expose
    private UserDefineFaceReviewTemplateInfo FaceReviewInfo;

    /**
    * Parameters for custom ASR-based recognition
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private UserDefineAsrTextReviewTemplateInfo AsrReviewInfo;

    /**
    * Parameters for custom OCR-based recognition
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private UserDefineOcrTextReviewTemplateInfo OcrReviewInfo;

    /**
     * Get Parameters for custom facial recognition
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return FaceReviewInfo Parameters for custom facial recognition
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public UserDefineFaceReviewTemplateInfo getFaceReviewInfo() {
        return this.FaceReviewInfo;
    }

    /**
     * Set Parameters for custom facial recognition
Note: This field may return `null`, indicating that no valid value can be found.
     * @param FaceReviewInfo Parameters for custom facial recognition
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setFaceReviewInfo(UserDefineFaceReviewTemplateInfo FaceReviewInfo) {
        this.FaceReviewInfo = FaceReviewInfo;
    }

    /**
     * Get Parameters for custom ASR-based recognition
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return AsrReviewInfo Parameters for custom ASR-based recognition
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public UserDefineAsrTextReviewTemplateInfo getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set Parameters for custom ASR-based recognition
Note: This field may return `null`, indicating that no valid value can be found.
     * @param AsrReviewInfo Parameters for custom ASR-based recognition
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setAsrReviewInfo(UserDefineAsrTextReviewTemplateInfo AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get Parameters for custom OCR-based recognition
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return OcrReviewInfo Parameters for custom OCR-based recognition
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public UserDefineOcrTextReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set Parameters for custom OCR-based recognition
Note: This field may return `null`, indicating that no valid value can be found.
     * @param OcrReviewInfo Parameters for custom OCR-based recognition
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setOcrReviewInfo(UserDefineOcrTextReviewTemplateInfo OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    public UserDefineConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserDefineConfigureInfo(UserDefineConfigureInfo source) {
        if (source.FaceReviewInfo != null) {
            this.FaceReviewInfo = new UserDefineFaceReviewTemplateInfo(source.FaceReviewInfo);
        }
        if (source.AsrReviewInfo != null) {
            this.AsrReviewInfo = new UserDefineAsrTextReviewTemplateInfo(source.AsrReviewInfo);
        }
        if (source.OcrReviewInfo != null) {
            this.OcrReviewInfo = new UserDefineOcrTextReviewTemplateInfo(source.OcrReviewInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FaceReviewInfo.", this.FaceReviewInfo);
        this.setParamObj(map, prefix + "AsrReviewInfo.", this.AsrReviewInfo);
        this.setParamObj(map, prefix + "OcrReviewInfo.", this.OcrReviewInfo);

    }
}

