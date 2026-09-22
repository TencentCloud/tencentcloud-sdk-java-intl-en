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
    * Control parameter for video moderation of user-defined characters.
    */
    @SerializedName("FaceReviewInfo")
    @Expose
    private UserDefineFaceReviewTemplateInfo FaceReviewInfo;

    /**
    * User-customized control parameters for voice audio and video moderation.
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private UserDefineAsrTextReviewTemplateInfo AsrReviewInfo;

    /**
    * User custom text audio/video moderation control parameter.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private UserDefineOcrTextReviewTemplateInfo OcrReviewInfo;

    /**
     * Get Control parameter for video moderation of user-defined characters. 
     * @return FaceReviewInfo Control parameter for video moderation of user-defined characters.
     */
    public UserDefineFaceReviewTemplateInfo getFaceReviewInfo() {
        return this.FaceReviewInfo;
    }

    /**
     * Set Control parameter for video moderation of user-defined characters.
     * @param FaceReviewInfo Control parameter for video moderation of user-defined characters.
     */
    public void setFaceReviewInfo(UserDefineFaceReviewTemplateInfo FaceReviewInfo) {
        this.FaceReviewInfo = FaceReviewInfo;
    }

    /**
     * Get User-customized control parameters for voice audio and video moderation. 
     * @return AsrReviewInfo User-customized control parameters for voice audio and video moderation.
     */
    public UserDefineAsrTextReviewTemplateInfo getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set User-customized control parameters for voice audio and video moderation.
     * @param AsrReviewInfo User-customized control parameters for voice audio and video moderation.
     */
    public void setAsrReviewInfo(UserDefineAsrTextReviewTemplateInfo AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get User custom text audio/video moderation control parameter. 
     * @return OcrReviewInfo User custom text audio/video moderation control parameter.
     */
    public UserDefineOcrTextReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set User custom text audio/video moderation control parameter.
     * @param OcrReviewInfo User custom text audio/video moderation control parameter.
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

