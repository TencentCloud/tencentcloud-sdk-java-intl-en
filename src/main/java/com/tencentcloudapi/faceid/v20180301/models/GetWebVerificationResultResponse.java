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

public class GetWebVerificationResultResponse extends AbstractModel{

    /**
    * The final result of this verification. `0` indicates that the person is the same as that in the photo.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * The description of the final verification result.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * The temporary URL of the best face screenshot collected from the video stream. It is valid for 10 minutes. Download the image if needed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoBestFrameUrl")
    @Expose
    private String VideoBestFrameUrl;

    /**
    * The MD5 hash value of the best face screenshot collected from the video stream. It can be used to check whether the image content is consistent with the file content.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoBestFrameMd5")
    @Expose
    private String VideoBestFrameMd5;

    /**
    * The details list of this verification process.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VerificationDetailList")
    @Expose
    private VerificationDetail [] VerificationDetailList;

    /**
    * The temporary URL of the video collected from the video stream. It is valid for 10 minutes. Download the video if needed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * The MD5 hash value of the video collected from the video stream. It can be used to check whether the video content is consistent with the file content.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoMd5")
    @Expose
    private String VideoMd5;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The final result of this verification. `0` indicates that the person is the same as that in the photo.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorCode The final result of this verification. `0` indicates that the person is the same as that in the photo.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set The final result of this verification. `0` indicates that the person is the same as that in the photo.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorCode The final result of this verification. `0` indicates that the person is the same as that in the photo.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get The description of the final verification result.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorMsg The description of the final verification result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set The description of the final verification result.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorMsg The description of the final verification result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get The temporary URL of the best face screenshot collected from the video stream. It is valid for 10 minutes. Download the image if needed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VideoBestFrameUrl The temporary URL of the best face screenshot collected from the video stream. It is valid for 10 minutes. Download the image if needed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVideoBestFrameUrl() {
        return this.VideoBestFrameUrl;
    }

    /**
     * Set The temporary URL of the best face screenshot collected from the video stream. It is valid for 10 minutes. Download the image if needed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VideoBestFrameUrl The temporary URL of the best face screenshot collected from the video stream. It is valid for 10 minutes. Download the image if needed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoBestFrameUrl(String VideoBestFrameUrl) {
        this.VideoBestFrameUrl = VideoBestFrameUrl;
    }

    /**
     * Get The MD5 hash value of the best face screenshot collected from the video stream. It can be used to check whether the image content is consistent with the file content.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VideoBestFrameMd5 The MD5 hash value of the best face screenshot collected from the video stream. It can be used to check whether the image content is consistent with the file content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVideoBestFrameMd5() {
        return this.VideoBestFrameMd5;
    }

    /**
     * Set The MD5 hash value of the best face screenshot collected from the video stream. It can be used to check whether the image content is consistent with the file content.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VideoBestFrameMd5 The MD5 hash value of the best face screenshot collected from the video stream. It can be used to check whether the image content is consistent with the file content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoBestFrameMd5(String VideoBestFrameMd5) {
        this.VideoBestFrameMd5 = VideoBestFrameMd5;
    }

    /**
     * Get The details list of this verification process.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VerificationDetailList The details list of this verification process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VerificationDetail [] getVerificationDetailList() {
        return this.VerificationDetailList;
    }

    /**
     * Set The details list of this verification process.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VerificationDetailList The details list of this verification process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVerificationDetailList(VerificationDetail [] VerificationDetailList) {
        this.VerificationDetailList = VerificationDetailList;
    }

    /**
     * Get The temporary URL of the video collected from the video stream. It is valid for 10 minutes. Download the video if needed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VideoUrl The temporary URL of the video collected from the video stream. It is valid for 10 minutes. Download the video if needed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set The temporary URL of the video collected from the video stream. It is valid for 10 minutes. Download the video if needed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VideoUrl The temporary URL of the video collected from the video stream. It is valid for 10 minutes. Download the video if needed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get The MD5 hash value of the video collected from the video stream. It can be used to check whether the video content is consistent with the file content.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VideoMd5 The MD5 hash value of the video collected from the video stream. It can be used to check whether the video content is consistent with the file content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVideoMd5() {
        return this.VideoMd5;
    }

    /**
     * Set The MD5 hash value of the video collected from the video stream. It can be used to check whether the video content is consistent with the file content.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VideoMd5 The MD5 hash value of the video collected from the video stream. It can be used to check whether the video content is consistent with the file content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoMd5(String VideoMd5) {
        this.VideoMd5 = VideoMd5;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetWebVerificationResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWebVerificationResultResponse(GetWebVerificationResultResponse source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.VideoBestFrameUrl != null) {
            this.VideoBestFrameUrl = new String(source.VideoBestFrameUrl);
        }
        if (source.VideoBestFrameMd5 != null) {
            this.VideoBestFrameMd5 = new String(source.VideoBestFrameMd5);
        }
        if (source.VerificationDetailList != null) {
            this.VerificationDetailList = new VerificationDetail[source.VerificationDetailList.length];
            for (int i = 0; i < source.VerificationDetailList.length; i++) {
                this.VerificationDetailList[i] = new VerificationDetail(source.VerificationDetailList[i]);
            }
        }
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.VideoMd5 != null) {
            this.VideoMd5 = new String(source.VideoMd5);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "VideoBestFrameUrl", this.VideoBestFrameUrl);
        this.setParamSimple(map, prefix + "VideoBestFrameMd5", this.VideoBestFrameMd5);
        this.setParamArrayObj(map, prefix + "VerificationDetailList.", this.VerificationDetailList);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "VideoMd5", this.VideoMd5);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

