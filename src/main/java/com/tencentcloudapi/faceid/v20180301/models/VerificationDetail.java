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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerificationDetail extends AbstractModel {

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
    * The result of this liveness detection process. `0` indicates success.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LivenessErrorCode")
    @Expose
    private Long LivenessErrorCode;

    /**
    * The result description of this liveness detection process.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LivenessErrorMsg")
    @Expose
    private String LivenessErrorMsg;

    /**
    * The result of this comparison process. `0` indicates that the person in the best face screenshot collected from the video stream is the same as that in the uploaded image for comparison.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompareErrorCode")
    @Expose
    private Long CompareErrorCode;

    /**
    * The result description of this comparison process.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompareErrorMsg")
    @Expose
    private String CompareErrorMsg;

    /**
    * The timestamp (ms) of this verification process.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReqTimestamp")
    @Expose
    private Long ReqTimestamp;

    /**
    * The similarity of the best face screenshot collected from the video stream and the uploaded image for comparison in this verification process. Value range: [0.00, 100.00]. By default, the person in the screenshot is determined to be the same person in the image if the similarity is greater than or equal to 70.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Similarity")
    @Expose
    private Float Similarity;

    /**
    * Unique ID of this verification process.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Seq")
    @Expose
    private String Seq;

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
     * Get The result of this liveness detection process. `0` indicates success.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LivenessErrorCode The result of this liveness detection process. `0` indicates success.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLivenessErrorCode() {
        return this.LivenessErrorCode;
    }

    /**
     * Set The result of this liveness detection process. `0` indicates success.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LivenessErrorCode The result of this liveness detection process. `0` indicates success.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLivenessErrorCode(Long LivenessErrorCode) {
        this.LivenessErrorCode = LivenessErrorCode;
    }

    /**
     * Get The result description of this liveness detection process.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LivenessErrorMsg The result description of this liveness detection process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLivenessErrorMsg() {
        return this.LivenessErrorMsg;
    }

    /**
     * Set The result description of this liveness detection process.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LivenessErrorMsg The result description of this liveness detection process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLivenessErrorMsg(String LivenessErrorMsg) {
        this.LivenessErrorMsg = LivenessErrorMsg;
    }

    /**
     * Get The result of this comparison process. `0` indicates that the person in the best face screenshot collected from the video stream is the same as that in the uploaded image for comparison.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CompareErrorCode The result of this comparison process. `0` indicates that the person in the best face screenshot collected from the video stream is the same as that in the uploaded image for comparison.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCompareErrorCode() {
        return this.CompareErrorCode;
    }

    /**
     * Set The result of this comparison process. `0` indicates that the person in the best face screenshot collected from the video stream is the same as that in the uploaded image for comparison.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CompareErrorCode The result of this comparison process. `0` indicates that the person in the best face screenshot collected from the video stream is the same as that in the uploaded image for comparison.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompareErrorCode(Long CompareErrorCode) {
        this.CompareErrorCode = CompareErrorCode;
    }

    /**
     * Get The result description of this comparison process.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CompareErrorMsg The result description of this comparison process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCompareErrorMsg() {
        return this.CompareErrorMsg;
    }

    /**
     * Set The result description of this comparison process.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CompareErrorMsg The result description of this comparison process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompareErrorMsg(String CompareErrorMsg) {
        this.CompareErrorMsg = CompareErrorMsg;
    }

    /**
     * Get The timestamp (ms) of this verification process.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReqTimestamp The timestamp (ms) of this verification process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getReqTimestamp() {
        return this.ReqTimestamp;
    }

    /**
     * Set The timestamp (ms) of this verification process.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReqTimestamp The timestamp (ms) of this verification process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReqTimestamp(Long ReqTimestamp) {
        this.ReqTimestamp = ReqTimestamp;
    }

    /**
     * Get The similarity of the best face screenshot collected from the video stream and the uploaded image for comparison in this verification process. Value range: [0.00, 100.00]. By default, the person in the screenshot is determined to be the same person in the image if the similarity is greater than or equal to 70.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Similarity The similarity of the best face screenshot collected from the video stream and the uploaded image for comparison in this verification process. Value range: [0.00, 100.00]. By default, the person in the screenshot is determined to be the same person in the image if the similarity is greater than or equal to 70.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getSimilarity() {
        return this.Similarity;
    }

    /**
     * Set The similarity of the best face screenshot collected from the video stream and the uploaded image for comparison in this verification process. Value range: [0.00, 100.00]. By default, the person in the screenshot is determined to be the same person in the image if the similarity is greater than or equal to 70.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Similarity The similarity of the best face screenshot collected from the video stream and the uploaded image for comparison in this verification process. Value range: [0.00, 100.00]. By default, the person in the screenshot is determined to be the same person in the image if the similarity is greater than or equal to 70.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSimilarity(Float Similarity) {
        this.Similarity = Similarity;
    }

    /**
     * Get Unique ID of this verification process.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Seq Unique ID of this verification process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSeq() {
        return this.Seq;
    }

    /**
     * Set Unique ID of this verification process.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Seq Unique ID of this verification process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSeq(String Seq) {
        this.Seq = Seq;
    }

    public VerificationDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerificationDetail(VerificationDetail source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.LivenessErrorCode != null) {
            this.LivenessErrorCode = new Long(source.LivenessErrorCode);
        }
        if (source.LivenessErrorMsg != null) {
            this.LivenessErrorMsg = new String(source.LivenessErrorMsg);
        }
        if (source.CompareErrorCode != null) {
            this.CompareErrorCode = new Long(source.CompareErrorCode);
        }
        if (source.CompareErrorMsg != null) {
            this.CompareErrorMsg = new String(source.CompareErrorMsg);
        }
        if (source.ReqTimestamp != null) {
            this.ReqTimestamp = new Long(source.ReqTimestamp);
        }
        if (source.Similarity != null) {
            this.Similarity = new Float(source.Similarity);
        }
        if (source.Seq != null) {
            this.Seq = new String(source.Seq);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "LivenessErrorCode", this.LivenessErrorCode);
        this.setParamSimple(map, prefix + "LivenessErrorMsg", this.LivenessErrorMsg);
        this.setParamSimple(map, prefix + "CompareErrorCode", this.CompareErrorCode);
        this.setParamSimple(map, prefix + "CompareErrorMsg", this.CompareErrorMsg);
        this.setParamSimple(map, prefix + "ReqTimestamp", this.ReqTimestamp);
        this.setParamSimple(map, prefix + "Similarity", this.Similarity);
        this.setParamSimple(map, prefix + "Seq", this.Seq);

    }
}

