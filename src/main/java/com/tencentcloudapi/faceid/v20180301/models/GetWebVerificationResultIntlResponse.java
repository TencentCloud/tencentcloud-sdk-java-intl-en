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

public class GetWebVerificationResultIntlResponse extends AbstractModel {

    /**
    * The final result of this verification. `0` indicates that the person is the same as that in the photo.
For other error codes, see <a href="https://www.tencentcloud.com/document/product/1061/55390?lang=en&pg=#8a960e1e-39c0-42cb-b181-b3164d77f81e">Liveness Detection and Face Comparison (Mobile HTML5) Error Codes</a>
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * The description of the final verification result.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * The detailed verification result list of this process. Retries are allowed, so a verification process may have several entries of results.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VerificationDetailList")
    @Expose
    private VerificationDetail [] VerificationDetailList;

    /**
    * The Base64-encoded string of the video collected from the video stream. Retries are allowed, and this field returns only the data collected in the last verification. If no video is collected, null is returned.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoBase64")
    @Expose
    private String VideoBase64;

    /**
    * The Base64-encoded string of the best face screenshot u200dcollected from the video stream. Retries are allowed, and this field returns only the data collected in the last verification. If no best face screenshot is collected, null is returned.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BestFrameBase64")
    @Expose
    private String BestFrameBase64;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The final result of this verification. `0` indicates that the person is the same as that in the photo.
For other error codes, see <a href="https://www.tencentcloud.com/document/product/1061/55390?lang=en&pg=#8a960e1e-39c0-42cb-b181-b3164d77f81e">Liveness Detection and Face Comparison (Mobile HTML5) Error Codes</a>
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return ErrorCode The final result of this verification. `0` indicates that the person is the same as that in the photo.
For other error codes, see <a href="https://www.tencentcloud.com/document/product/1061/55390?lang=en&pg=#8a960e1e-39c0-42cb-b181-b3164d77f81e">Liveness Detection and Face Comparison (Mobile HTML5) Error Codes</a>
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set The final result of this verification. `0` indicates that the person is the same as that in the photo.
For other error codes, see <a href="https://www.tencentcloud.com/document/product/1061/55390?lang=en&pg=#8a960e1e-39c0-42cb-b181-b3164d77f81e">Liveness Detection and Face Comparison (Mobile HTML5) Error Codes</a>
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param ErrorCode The final result of this verification. `0` indicates that the person is the same as that in the photo.
For other error codes, see <a href="https://www.tencentcloud.com/document/product/1061/55390?lang=en&pg=#8a960e1e-39c0-42cb-b181-b3164d77f81e">Liveness Detection and Face Comparison (Mobile HTML5) Error Codes</a>
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get The description of the final verification result.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return ErrorMsg The description of the final verification result.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set The description of the final verification result.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param ErrorMsg The description of the final verification result.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get The detailed verification result list of this process. Retries are allowed, so a verification process may have several entries of results.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return VerificationDetailList The detailed verification result list of this process. Retries are allowed, so a verification process may have several entries of results.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public VerificationDetail [] getVerificationDetailList() {
        return this.VerificationDetailList;
    }

    /**
     * Set The detailed verification result list of this process. Retries are allowed, so a verification process may have several entries of results.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param VerificationDetailList The detailed verification result list of this process. Retries are allowed, so a verification process may have several entries of results.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setVerificationDetailList(VerificationDetail [] VerificationDetailList) {
        this.VerificationDetailList = VerificationDetailList;
    }

    /**
     * Get The Base64-encoded string of the video collected from the video stream. Retries are allowed, and this field returns only the data collected in the last verification. If no video is collected, null is returned.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return VideoBase64 The Base64-encoded string of the video collected from the video stream. Retries are allowed, and this field returns only the data collected in the last verification. If no video is collected, null is returned.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getVideoBase64() {
        return this.VideoBase64;
    }

    /**
     * Set The Base64-encoded string of the video collected from the video stream. Retries are allowed, and this field returns only the data collected in the last verification. If no video is collected, null is returned.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param VideoBase64 The Base64-encoded string of the video collected from the video stream. Retries are allowed, and this field returns only the data collected in the last verification. If no video is collected, null is returned.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoBase64(String VideoBase64) {
        this.VideoBase64 = VideoBase64;
    }

    /**
     * Get The Base64-encoded string of the best face screenshot u200dcollected from the video stream. Retries are allowed, and this field returns only the data collected in the last verification. If no best face screenshot is collected, null is returned.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return BestFrameBase64 The Base64-encoded string of the best face screenshot u200dcollected from the video stream. Retries are allowed, and this field returns only the data collected in the last verification. If no best face screenshot is collected, null is returned.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getBestFrameBase64() {
        return this.BestFrameBase64;
    }

    /**
     * Set The Base64-encoded string of the best face screenshot u200dcollected from the video stream. Retries are allowed, and this field returns only the data collected in the last verification. If no best face screenshot is collected, null is returned.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param BestFrameBase64 The Base64-encoded string of the best face screenshot u200dcollected from the video stream. Retries are allowed, and this field returns only the data collected in the last verification. If no best face screenshot is collected, null is returned.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setBestFrameBase64(String BestFrameBase64) {
        this.BestFrameBase64 = BestFrameBase64;
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

    public GetWebVerificationResultIntlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWebVerificationResultIntlResponse(GetWebVerificationResultIntlResponse source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.VerificationDetailList != null) {
            this.VerificationDetailList = new VerificationDetail[source.VerificationDetailList.length];
            for (int i = 0; i < source.VerificationDetailList.length; i++) {
                this.VerificationDetailList[i] = new VerificationDetail(source.VerificationDetailList[i]);
            }
        }
        if (source.VideoBase64 != null) {
            this.VideoBase64 = new String(source.VideoBase64);
        }
        if (source.BestFrameBase64 != null) {
            this.BestFrameBase64 = new String(source.BestFrameBase64);
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
        this.setParamArrayObj(map, prefix + "VerificationDetailList.", this.VerificationDetailList);
        this.setParamSimple(map, prefix + "VideoBase64", this.VideoBase64);
        this.setParamSimple(map, prefix + "BestFrameBase64", this.BestFrameBase64);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

