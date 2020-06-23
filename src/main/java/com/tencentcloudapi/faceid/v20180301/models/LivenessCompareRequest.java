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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LivenessCompareRequest extends AbstractModel{

    /**
    * Base64 value of a photo for face comparison;
Base64-encoded image data is up to 3 MB. Only JPG and PNG formats are supported.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * Base64 value of a video for liveness detection;
The size after Base64-encoding cannot exceed 5 MB. MP4, AVI, and FLV formats are supported.
    */
    @SerializedName("VideoBase64")
    @Expose
    private String VideoBase64;

    /**
    * Liveness detection type. Valid values: LIP/ACTION/SILENT.
LIP: numeric mode; ACTION: motion mode; SILENT: silent mode. You need to select a mode to input.
    */
    @SerializedName("LivenessType")
    @Expose
    private String LivenessType;

    /**
    * Input parameter for the numeric mode: numeric verification code (1234). An API needs to be called first to get a numeric verification code;
Input parameter for the motion mode: motion order (2,1 or 1,2). An API needs to be called first to get the motion order;
Input parameter for silent mode: empty.
    */
    @SerializedName("ValidateData")
    @Expose
    private String ValidateData;

    /**
    * This parameter does not need to be passed in for this API.
    */
    @SerializedName("Optional")
    @Expose
    private String Optional;

    /**
     * Get Base64 value of a photo for face comparison;
Base64-encoded image data is up to 3 MB. Only JPG and PNG formats are supported. 
     * @return ImageBase64 Base64 value of a photo for face comparison;
Base64-encoded image data is up to 3 MB. Only JPG and PNG formats are supported.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set Base64 value of a photo for face comparison;
Base64-encoded image data is up to 3 MB. Only JPG and PNG formats are supported.
     * @param ImageBase64 Base64 value of a photo for face comparison;
Base64-encoded image data is up to 3 MB. Only JPG and PNG formats are supported.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get Base64 value of a video for liveness detection;
The size after Base64-encoding cannot exceed 5 MB. MP4, AVI, and FLV formats are supported. 
     * @return VideoBase64 Base64 value of a video for liveness detection;
The size after Base64-encoding cannot exceed 5 MB. MP4, AVI, and FLV formats are supported.
     */
    public String getVideoBase64() {
        return this.VideoBase64;
    }

    /**
     * Set Base64 value of a video for liveness detection;
The size after Base64-encoding cannot exceed 5 MB. MP4, AVI, and FLV formats are supported.
     * @param VideoBase64 Base64 value of a video for liveness detection;
The size after Base64-encoding cannot exceed 5 MB. MP4, AVI, and FLV formats are supported.
     */
    public void setVideoBase64(String VideoBase64) {
        this.VideoBase64 = VideoBase64;
    }

    /**
     * Get Liveness detection type. Valid values: LIP/ACTION/SILENT.
LIP: numeric mode; ACTION: motion mode; SILENT: silent mode. You need to select a mode to input. 
     * @return LivenessType Liveness detection type. Valid values: LIP/ACTION/SILENT.
LIP: numeric mode; ACTION: motion mode; SILENT: silent mode. You need to select a mode to input.
     */
    public String getLivenessType() {
        return this.LivenessType;
    }

    /**
     * Set Liveness detection type. Valid values: LIP/ACTION/SILENT.
LIP: numeric mode; ACTION: motion mode; SILENT: silent mode. You need to select a mode to input.
     * @param LivenessType Liveness detection type. Valid values: LIP/ACTION/SILENT.
LIP: numeric mode; ACTION: motion mode; SILENT: silent mode. You need to select a mode to input.
     */
    public void setLivenessType(String LivenessType) {
        this.LivenessType = LivenessType;
    }

    /**
     * Get Input parameter for the numeric mode: numeric verification code (1234). An API needs to be called first to get a numeric verification code;
Input parameter for the motion mode: motion order (2,1 or 1,2). An API needs to be called first to get the motion order;
Input parameter for silent mode: empty. 
     * @return ValidateData Input parameter for the numeric mode: numeric verification code (1234). An API needs to be called first to get a numeric verification code;
Input parameter for the motion mode: motion order (2,1 or 1,2). An API needs to be called first to get the motion order;
Input parameter for silent mode: empty.
     */
    public String getValidateData() {
        return this.ValidateData;
    }

    /**
     * Set Input parameter for the numeric mode: numeric verification code (1234). An API needs to be called first to get a numeric verification code;
Input parameter for the motion mode: motion order (2,1 or 1,2). An API needs to be called first to get the motion order;
Input parameter for silent mode: empty.
     * @param ValidateData Input parameter for the numeric mode: numeric verification code (1234). An API needs to be called first to get a numeric verification code;
Input parameter for the motion mode: motion order (2,1 or 1,2). An API needs to be called first to get the motion order;
Input parameter for silent mode: empty.
     */
    public void setValidateData(String ValidateData) {
        this.ValidateData = ValidateData;
    }

    /**
     * Get This parameter does not need to be passed in for this API. 
     * @return Optional This parameter does not need to be passed in for this API.
     */
    public String getOptional() {
        return this.Optional;
    }

    /**
     * Set This parameter does not need to be passed in for this API.
     * @param Optional This parameter does not need to be passed in for this API.
     */
    public void setOptional(String Optional) {
        this.Optional = Optional;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "VideoBase64", this.VideoBase64);
        this.setParamSimple(map, prefix + "LivenessType", this.LivenessType);
        this.setParamSimple(map, prefix + "ValidateData", this.ValidateData);
        this.setParamSimple(map, prefix + "Optional", this.Optional);

    }
}

