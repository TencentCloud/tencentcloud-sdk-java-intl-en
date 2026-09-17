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
    * 
    */
    @SerializedName("FaceReviewInfo")
    @Expose
    private UserDefineFaceReviewTemplateInfo FaceReviewInfo;

    /**
    * 
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private UserDefineAsrTextReviewTemplateInfo AsrReviewInfo;

    /**
    * 
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private UserDefineOcrTextReviewTemplateInfo OcrReviewInfo;

    /**
     * Get  
     * @return FaceReviewInfo 
     */
    public UserDefineFaceReviewTemplateInfo getFaceReviewInfo() {
        return this.FaceReviewInfo;
    }

    /**
     * Set 
     * @param FaceReviewInfo 
     */
    public void setFaceReviewInfo(UserDefineFaceReviewTemplateInfo FaceReviewInfo) {
        this.FaceReviewInfo = FaceReviewInfo;
    }

    /**
     * Get  
     * @return AsrReviewInfo 
     */
    public UserDefineAsrTextReviewTemplateInfo getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set 
     * @param AsrReviewInfo 
     */
    public void setAsrReviewInfo(UserDefineAsrTextReviewTemplateInfo AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get  
     * @return OcrReviewInfo 
     */
    public UserDefineOcrTextReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set 
     * @param OcrReviewInfo 
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

