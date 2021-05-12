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

public class UserDefineConfigureInfoForUpdate extends AbstractModel{

    /**
    * Control parameter of custom figure audit.
    */
    @SerializedName("FaceReviewInfo")
    @Expose
    private UserDefineFaceReviewTemplateInfoForUpdate FaceReviewInfo;

    /**
    * Control parameter of custom speech audit.
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private UserDefineAsrTextReviewTemplateInfoForUpdate AsrReviewInfo;

    /**
    * Control parameter of custom text audit.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private UserDefineOcrTextReviewTemplateInfoForUpdate OcrReviewInfo;

    /**
     * Get Control parameter of custom figure audit. 
     * @return FaceReviewInfo Control parameter of custom figure audit.
     */
    public UserDefineFaceReviewTemplateInfoForUpdate getFaceReviewInfo() {
        return this.FaceReviewInfo;
    }

    /**
     * Set Control parameter of custom figure audit.
     * @param FaceReviewInfo Control parameter of custom figure audit.
     */
    public void setFaceReviewInfo(UserDefineFaceReviewTemplateInfoForUpdate FaceReviewInfo) {
        this.FaceReviewInfo = FaceReviewInfo;
    }

    /**
     * Get Control parameter of custom speech audit. 
     * @return AsrReviewInfo Control parameter of custom speech audit.
     */
    public UserDefineAsrTextReviewTemplateInfoForUpdate getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set Control parameter of custom speech audit.
     * @param AsrReviewInfo Control parameter of custom speech audit.
     */
    public void setAsrReviewInfo(UserDefineAsrTextReviewTemplateInfoForUpdate AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get Control parameter of custom text audit. 
     * @return OcrReviewInfo Control parameter of custom text audit.
     */
    public UserDefineOcrTextReviewTemplateInfoForUpdate getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set Control parameter of custom text audit.
     * @param OcrReviewInfo Control parameter of custom text audit.
     */
    public void setOcrReviewInfo(UserDefineOcrTextReviewTemplateInfoForUpdate OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    public UserDefineConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserDefineConfigureInfoForUpdate(UserDefineConfigureInfoForUpdate source) {
        if (source.FaceReviewInfo != null) {
            this.FaceReviewInfo = new UserDefineFaceReviewTemplateInfoForUpdate(source.FaceReviewInfo);
        }
        if (source.AsrReviewInfo != null) {
            this.AsrReviewInfo = new UserDefineAsrTextReviewTemplateInfoForUpdate(source.AsrReviewInfo);
        }
        if (source.OcrReviewInfo != null) {
            this.OcrReviewInfo = new UserDefineOcrTextReviewTemplateInfoForUpdate(source.OcrReviewInfo);
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

