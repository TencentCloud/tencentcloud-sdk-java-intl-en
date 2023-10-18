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

public class VideoLivenessCompareRequest extends AbstractModel {

    /**
    * The URL of the photo for face comparison. The downloaded image after Base64 encoding can be up to 3 MB and must be in JPG or PNG.

The image must be stored in a COS bucket in the region where the FaceID service resides to ensure a higher download speed and better stability. You can generate an image URL by using `CreateUploadUrl` or purchase the COS service.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * The 32-bit MD5 checksum of the image for comparison
    */
    @SerializedName("ImageMd5")
    @Expose
    private String ImageMd5;

    /**
    * The URL of the video for liveness detection. The downloaded video after Base64 encoding can be up to 8 MB and must be in MP4, AVI, or FLV. It takes no more than 4s to download the video.

The video must be stored in a COS bucket in the region where the FaceID service resides to ensure a higher download speed and better stability. You can generate a video URL by using `CreateUploadUrl` or purchase the COS service.
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * The 32-bit MD5 checksum of the video
    */
    @SerializedName("VideoMd5")
    @Expose
    private String VideoMd5;

    /**
    * The liveness detection type. Valid values: `LIP`, `ACTION`, and `SILENT`.
`LIP`: Numeric mode; `ACTION`: Motion mode; `SILENT`: silent mode. Select one of them.
    */
    @SerializedName("LivenessType")
    @Expose
    private String LivenessType;

    /**
    * LIP parameter: Pass in a custom 4-digit verification code.
ACTION parameter: Pass in a custom action sequence (`2,1` or `1,2`).
SILENT parameter: Null.
    */
    @SerializedName("ValidateData")
    @Expose
    private String ValidateData;

    /**
     * Get The URL of the photo for face comparison. The downloaded image after Base64 encoding can be up to 3 MB and must be in JPG or PNG.

The image must be stored in a COS bucket in the region where the FaceID service resides to ensure a higher download speed and better stability. You can generate an image URL by using `CreateUploadUrl` or purchase the COS service. 
     * @return ImageUrl The URL of the photo for face comparison. The downloaded image after Base64 encoding can be up to 3 MB and must be in JPG or PNG.

The image must be stored in a COS bucket in the region where the FaceID service resides to ensure a higher download speed and better stability. You can generate an image URL by using `CreateUploadUrl` or purchase the COS service.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set The URL of the photo for face comparison. The downloaded image after Base64 encoding can be up to 3 MB and must be in JPG or PNG.

The image must be stored in a COS bucket in the region where the FaceID service resides to ensure a higher download speed and better stability. You can generate an image URL by using `CreateUploadUrl` or purchase the COS service.
     * @param ImageUrl The URL of the photo for face comparison. The downloaded image after Base64 encoding can be up to 3 MB and must be in JPG or PNG.

The image must be stored in a COS bucket in the region where the FaceID service resides to ensure a higher download speed and better stability. You can generate an image URL by using `CreateUploadUrl` or purchase the COS service.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get The 32-bit MD5 checksum of the image for comparison 
     * @return ImageMd5 The 32-bit MD5 checksum of the image for comparison
     */
    public String getImageMd5() {
        return this.ImageMd5;
    }

    /**
     * Set The 32-bit MD5 checksum of the image for comparison
     * @param ImageMd5 The 32-bit MD5 checksum of the image for comparison
     */
    public void setImageMd5(String ImageMd5) {
        this.ImageMd5 = ImageMd5;
    }

    /**
     * Get The URL of the video for liveness detection. The downloaded video after Base64 encoding can be up to 8 MB and must be in MP4, AVI, or FLV. It takes no more than 4s to download the video.

The video must be stored in a COS bucket in the region where the FaceID service resides to ensure a higher download speed and better stability. You can generate a video URL by using `CreateUploadUrl` or purchase the COS service. 
     * @return VideoUrl The URL of the video for liveness detection. The downloaded video after Base64 encoding can be up to 8 MB and must be in MP4, AVI, or FLV. It takes no more than 4s to download the video.

The video must be stored in a COS bucket in the region where the FaceID service resides to ensure a higher download speed and better stability. You can generate a video URL by using `CreateUploadUrl` or purchase the COS service.
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set The URL of the video for liveness detection. The downloaded video after Base64 encoding can be up to 8 MB and must be in MP4, AVI, or FLV. It takes no more than 4s to download the video.

The video must be stored in a COS bucket in the region where the FaceID service resides to ensure a higher download speed and better stability. You can generate a video URL by using `CreateUploadUrl` or purchase the COS service.
     * @param VideoUrl The URL of the video for liveness detection. The downloaded video after Base64 encoding can be up to 8 MB and must be in MP4, AVI, or FLV. It takes no more than 4s to download the video.

The video must be stored in a COS bucket in the region where the FaceID service resides to ensure a higher download speed and better stability. You can generate a video URL by using `CreateUploadUrl` or purchase the COS service.
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get The 32-bit MD5 checksum of the video 
     * @return VideoMd5 The 32-bit MD5 checksum of the video
     */
    public String getVideoMd5() {
        return this.VideoMd5;
    }

    /**
     * Set The 32-bit MD5 checksum of the video
     * @param VideoMd5 The 32-bit MD5 checksum of the video
     */
    public void setVideoMd5(String VideoMd5) {
        this.VideoMd5 = VideoMd5;
    }

    /**
     * Get The liveness detection type. Valid values: `LIP`, `ACTION`, and `SILENT`.
`LIP`: Numeric mode; `ACTION`: Motion mode; `SILENT`: silent mode. Select one of them. 
     * @return LivenessType The liveness detection type. Valid values: `LIP`, `ACTION`, and `SILENT`.
`LIP`: Numeric mode; `ACTION`: Motion mode; `SILENT`: silent mode. Select one of them.
     */
    public String getLivenessType() {
        return this.LivenessType;
    }

    /**
     * Set The liveness detection type. Valid values: `LIP`, `ACTION`, and `SILENT`.
`LIP`: Numeric mode; `ACTION`: Motion mode; `SILENT`: silent mode. Select one of them.
     * @param LivenessType The liveness detection type. Valid values: `LIP`, `ACTION`, and `SILENT`.
`LIP`: Numeric mode; `ACTION`: Motion mode; `SILENT`: silent mode. Select one of them.
     */
    public void setLivenessType(String LivenessType) {
        this.LivenessType = LivenessType;
    }

    /**
     * Get LIP parameter: Pass in a custom 4-digit verification code.
ACTION parameter: Pass in a custom action sequence (`2,1` or `1,2`).
SILENT parameter: Null. 
     * @return ValidateData LIP parameter: Pass in a custom 4-digit verification code.
ACTION parameter: Pass in a custom action sequence (`2,1` or `1,2`).
SILENT parameter: Null.
     */
    public String getValidateData() {
        return this.ValidateData;
    }

    /**
     * Set LIP parameter: Pass in a custom 4-digit verification code.
ACTION parameter: Pass in a custom action sequence (`2,1` or `1,2`).
SILENT parameter: Null.
     * @param ValidateData LIP parameter: Pass in a custom 4-digit verification code.
ACTION parameter: Pass in a custom action sequence (`2,1` or `1,2`).
SILENT parameter: Null.
     */
    public void setValidateData(String ValidateData) {
        this.ValidateData = ValidateData;
    }

    public VideoLivenessCompareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoLivenessCompareRequest(VideoLivenessCompareRequest source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageMd5 != null) {
            this.ImageMd5 = new String(source.ImageMd5);
        }
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.VideoMd5 != null) {
            this.VideoMd5 = new String(source.VideoMd5);
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
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageMd5", this.ImageMd5);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "VideoMd5", this.VideoMd5);
        this.setParamSimple(map, prefix + "LivenessType", this.LivenessType);
        this.setParamSimple(map, prefix + "ValidateData", this.ValidateData);

    }
}

