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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareFaceLivenessRequest extends AbstractModel {

    /**
    * Base64 string of the image for face comparison.
- The size of the Base64-encoded image data can be up to 3 MB. JPG and PNG formats are supported.
- Please use the standard Base64 encoding method (with = padding). Refer to RFC4648 for the encoding specification.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * Base64 string of the video for liveness detection.
- The size of the Base64-encoded video data can be up to 8 MB. MP4, AVI, and FLV formats are supported.
-Use standard Base64 encoding (with = padding), following RFC4648.
    */
    @SerializedName("VideoBase64")
    @Expose
    private String VideoBase64;

    /**
    * Liveness detection type.
-Values:
ACTION is action mode.
SILENT is silent mode.
-Choose one of the two modes to pass in.
    */
    @SerializedName("LivenessType")
    @Expose
    private String LivenessType;

    /**
    * Control the action sequence. Action types include: 1 (open mouth), 2 (blink), 3 (nod), 4 (shake head). Supports one or two actions.
-Required when the LivenessType parameter is set to ACTION.
-Single action example: "1".
-Multiple actions parameter passing example: "4,2".
-When the LivenessType parameter is set to SILENT, leave it blank.
    */
    @SerializedName("ValidateData")
    @Expose
    private String ValidateData;

    /**
     * Get Base64 string of the image for face comparison.
- The size of the Base64-encoded image data can be up to 3 MB. JPG and PNG formats are supported.
- Please use the standard Base64 encoding method (with = padding). Refer to RFC4648 for the encoding specification. 
     * @return ImageBase64 Base64 string of the image for face comparison.
- The size of the Base64-encoded image data can be up to 3 MB. JPG and PNG formats are supported.
- Please use the standard Base64 encoding method (with = padding). Refer to RFC4648 for the encoding specification.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set Base64 string of the image for face comparison.
- The size of the Base64-encoded image data can be up to 3 MB. JPG and PNG formats are supported.
- Please use the standard Base64 encoding method (with = padding). Refer to RFC4648 for the encoding specification.
     * @param ImageBase64 Base64 string of the image for face comparison.
- The size of the Base64-encoded image data can be up to 3 MB. JPG and PNG formats are supported.
- Please use the standard Base64 encoding method (with = padding). Refer to RFC4648 for the encoding specification.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get Base64 string of the video for liveness detection.
- The size of the Base64-encoded video data can be up to 8 MB. MP4, AVI, and FLV formats are supported.
-Use standard Base64 encoding (with = padding), following RFC4648. 
     * @return VideoBase64 Base64 string of the video for liveness detection.
- The size of the Base64-encoded video data can be up to 8 MB. MP4, AVI, and FLV formats are supported.
-Use standard Base64 encoding (with = padding), following RFC4648.
     */
    public String getVideoBase64() {
        return this.VideoBase64;
    }

    /**
     * Set Base64 string of the video for liveness detection.
- The size of the Base64-encoded video data can be up to 8 MB. MP4, AVI, and FLV formats are supported.
-Use standard Base64 encoding (with = padding), following RFC4648.
     * @param VideoBase64 Base64 string of the video for liveness detection.
- The size of the Base64-encoded video data can be up to 8 MB. MP4, AVI, and FLV formats are supported.
-Use standard Base64 encoding (with = padding), following RFC4648.
     */
    public void setVideoBase64(String VideoBase64) {
        this.VideoBase64 = VideoBase64;
    }

    /**
     * Get Liveness detection type.
-Values:
ACTION is action mode.
SILENT is silent mode.
-Choose one of the two modes to pass in. 
     * @return LivenessType Liveness detection type.
-Values:
ACTION is action mode.
SILENT is silent mode.
-Choose one of the two modes to pass in.
     */
    public String getLivenessType() {
        return this.LivenessType;
    }

    /**
     * Set Liveness detection type.
-Values:
ACTION is action mode.
SILENT is silent mode.
-Choose one of the two modes to pass in.
     * @param LivenessType Liveness detection type.
-Values:
ACTION is action mode.
SILENT is silent mode.
-Choose one of the two modes to pass in.
     */
    public void setLivenessType(String LivenessType) {
        this.LivenessType = LivenessType;
    }

    /**
     * Get Control the action sequence. Action types include: 1 (open mouth), 2 (blink), 3 (nod), 4 (shake head). Supports one or two actions.
-Required when the LivenessType parameter is set to ACTION.
-Single action example: "1".
-Multiple actions parameter passing example: "4,2".
-When the LivenessType parameter is set to SILENT, leave it blank. 
     * @return ValidateData Control the action sequence. Action types include: 1 (open mouth), 2 (blink), 3 (nod), 4 (shake head). Supports one or two actions.
-Required when the LivenessType parameter is set to ACTION.
-Single action example: "1".
-Multiple actions parameter passing example: "4,2".
-When the LivenessType parameter is set to SILENT, leave it blank.
     */
    public String getValidateData() {
        return this.ValidateData;
    }

    /**
     * Set Control the action sequence. Action types include: 1 (open mouth), 2 (blink), 3 (nod), 4 (shake head). Supports one or two actions.
-Required when the LivenessType parameter is set to ACTION.
-Single action example: "1".
-Multiple actions parameter passing example: "4,2".
-When the LivenessType parameter is set to SILENT, leave it blank.
     * @param ValidateData Control the action sequence. Action types include: 1 (open mouth), 2 (blink), 3 (nod), 4 (shake head). Supports one or two actions.
-Required when the LivenessType parameter is set to ACTION.
-Single action example: "1".
-Multiple actions parameter passing example: "4,2".
-When the LivenessType parameter is set to SILENT, leave it blank.
     */
    public void setValidateData(String ValidateData) {
        this.ValidateData = ValidateData;
    }

    public CompareFaceLivenessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareFaceLivenessRequest(CompareFaceLivenessRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.VideoBase64 != null) {
            this.VideoBase64 = new String(source.VideoBase64);
        }
        if (source.LivenessType != null) {
            this.LivenessType = new String(source.LivenessType);
        }
        if (source.ValidateData != null) {
            this.ValidateData = new String(source.ValidateData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "VideoBase64", this.VideoBase64);
        this.setParamSimple(map, prefix + "LivenessType", this.LivenessType);
        this.setParamSimple(map, prefix + "ValidateData", this.ValidateData);

    }
}

