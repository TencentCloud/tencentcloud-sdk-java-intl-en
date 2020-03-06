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

public class UserDefineConfigureInfo extends AbstractModel{

    /**
    * Control parameter of custom figure audit.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FaceReviewInfo")
    @Expose
    private UserDefineFaceReviewTemplateInfo FaceReviewInfo;

    /**
    * Control parameter of custom speech audit.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private UserDefineAsrTextReviewTemplateInfo AsrReviewInfo;

    /**
    * Control parameter of custom text audit.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private UserDefineOcrTextReviewTemplateInfo OcrReviewInfo;

    /**
     * Get Control parameter of custom figure audit.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FaceReviewInfo Control parameter of custom figure audit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UserDefineFaceReviewTemplateInfo getFaceReviewInfo() {
        return this.FaceReviewInfo;
    }

    /**
     * Set Control parameter of custom figure audit.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FaceReviewInfo Control parameter of custom figure audit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFaceReviewInfo(UserDefineFaceReviewTemplateInfo FaceReviewInfo) {
        this.FaceReviewInfo = FaceReviewInfo;
    }

    /**
     * Get Control parameter of custom speech audit.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AsrReviewInfo Control parameter of custom speech audit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UserDefineAsrTextReviewTemplateInfo getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set Control parameter of custom speech audit.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AsrReviewInfo Control parameter of custom speech audit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAsrReviewInfo(UserDefineAsrTextReviewTemplateInfo AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get Control parameter of custom text audit.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OcrReviewInfo Control parameter of custom text audit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UserDefineOcrTextReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set Control parameter of custom text audit.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OcrReviewInfo Control parameter of custom text audit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOcrReviewInfo(UserDefineOcrTextReviewTemplateInfo OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
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

