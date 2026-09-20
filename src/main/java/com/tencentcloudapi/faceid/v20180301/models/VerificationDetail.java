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
    * Final result of this verification. 0 indicates that the verification is passed and the person is determined to be the same person.
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * Final result description of this verification
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * Liveness detection result of this verification. 0 indicates success.
    */
    @SerializedName("LivenessErrorCode")
    @Expose
    private Long LivenessErrorCode;

    /**
    * Description of the liveness detection result for this verification
    */
    @SerializedName("LivenessErrorMsg")
    @Expose
    private String LivenessErrorMsg;

    /**
    * Result of this verification comparison. 0 indicates that the best face photo collected from the video stream and the uploaded image for comparison are determined to be the same person.
    */
    @SerializedName("CompareErrorCode")
    @Expose
    private Long CompareErrorCode;

    /**
    * Result description of this verification comparison
    */
    @SerializedName("CompareErrorMsg")
    @Expose
    private String CompareErrorMsg;

    /**
    * Verification timestamp (ms) this time
    */
    @SerializedName("ReqTimestamp")
    @Expose
    private Long ReqTimestamp;

    /**
    * Similarity between the best face photo collected from the video stream in this verification and the uploaded image for comparison. Value range: [0.00, 100.00]. By default, the two are determined to be the same person when the similarity is at least 70.
    */
    @SerializedName("Similarity")
    @Expose
    private Float Similarity;

    /**
    * Unique identifier for this verification
    */
    @SerializedName("Seq")
    @Expose
    private String Seq;

    /**
    * Description of the detailed reason why the current request was rejected in the liveness phase. This parameter is returned only for the PLUS version of the eKYC service.
-Details as follows:
01-User eyes closed throughout
02 - User has not completed the specified action
03-Suspected rephotography attack
04-Suspected synthesis attack
05-Suspected fraud template
06-Suspected watermark
07-Reflection validation failed
08-Suspected midway change person
09: Poor face quality
10-distance check failed
11-Suspected adversarial sample attack
12-Mouth area suspected of attack traces
13-Eye area suspected to have attack traces
14-Eye or mouth covered
Note: This field may return null, indicating that no valid values can be obtained.
Example value: ["01"].
    */
    @SerializedName("LivenessInfoTag")
    @Expose
    private String [] LivenessInfoTag;

    /**
     * Get Final result of this verification. 0 indicates that the verification is passed and the person is determined to be the same person. 
     * @return ErrorCode Final result of this verification. 0 indicates that the verification is passed and the person is determined to be the same person.
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set Final result of this verification. 0 indicates that the verification is passed and the person is determined to be the same person.
     * @param ErrorCode Final result of this verification. 0 indicates that the verification is passed and the person is determined to be the same person.
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get Final result description of this verification 
     * @return ErrorMsg Final result description of this verification
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set Final result description of this verification
     * @param ErrorMsg Final result description of this verification
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get Liveness detection result of this verification. 0 indicates success. 
     * @return LivenessErrorCode Liveness detection result of this verification. 0 indicates success.
     */
    public Long getLivenessErrorCode() {
        return this.LivenessErrorCode;
    }

    /**
     * Set Liveness detection result of this verification. 0 indicates success.
     * @param LivenessErrorCode Liveness detection result of this verification. 0 indicates success.
     */
    public void setLivenessErrorCode(Long LivenessErrorCode) {
        this.LivenessErrorCode = LivenessErrorCode;
    }

    /**
     * Get Description of the liveness detection result for this verification 
     * @return LivenessErrorMsg Description of the liveness detection result for this verification
     */
    public String getLivenessErrorMsg() {
        return this.LivenessErrorMsg;
    }

    /**
     * Set Description of the liveness detection result for this verification
     * @param LivenessErrorMsg Description of the liveness detection result for this verification
     */
    public void setLivenessErrorMsg(String LivenessErrorMsg) {
        this.LivenessErrorMsg = LivenessErrorMsg;
    }

    /**
     * Get Result of this verification comparison. 0 indicates that the best face photo collected from the video stream and the uploaded image for comparison are determined to be the same person. 
     * @return CompareErrorCode Result of this verification comparison. 0 indicates that the best face photo collected from the video stream and the uploaded image for comparison are determined to be the same person.
     */
    public Long getCompareErrorCode() {
        return this.CompareErrorCode;
    }

    /**
     * Set Result of this verification comparison. 0 indicates that the best face photo collected from the video stream and the uploaded image for comparison are determined to be the same person.
     * @param CompareErrorCode Result of this verification comparison. 0 indicates that the best face photo collected from the video stream and the uploaded image for comparison are determined to be the same person.
     */
    public void setCompareErrorCode(Long CompareErrorCode) {
        this.CompareErrorCode = CompareErrorCode;
    }

    /**
     * Get Result description of this verification comparison 
     * @return CompareErrorMsg Result description of this verification comparison
     */
    public String getCompareErrorMsg() {
        return this.CompareErrorMsg;
    }

    /**
     * Set Result description of this verification comparison
     * @param CompareErrorMsg Result description of this verification comparison
     */
    public void setCompareErrorMsg(String CompareErrorMsg) {
        this.CompareErrorMsg = CompareErrorMsg;
    }

    /**
     * Get Verification timestamp (ms) this time 
     * @return ReqTimestamp Verification timestamp (ms) this time
     */
    public Long getReqTimestamp() {
        return this.ReqTimestamp;
    }

    /**
     * Set Verification timestamp (ms) this time
     * @param ReqTimestamp Verification timestamp (ms) this time
     */
    public void setReqTimestamp(Long ReqTimestamp) {
        this.ReqTimestamp = ReqTimestamp;
    }

    /**
     * Get Similarity between the best face photo collected from the video stream in this verification and the uploaded image for comparison. Value range: [0.00, 100.00]. By default, the two are determined to be the same person when the similarity is at least 70. 
     * @return Similarity Similarity between the best face photo collected from the video stream in this verification and the uploaded image for comparison. Value range: [0.00, 100.00]. By default, the two are determined to be the same person when the similarity is at least 70.
     */
    public Float getSimilarity() {
        return this.Similarity;
    }

    /**
     * Set Similarity between the best face photo collected from the video stream in this verification and the uploaded image for comparison. Value range: [0.00, 100.00]. By default, the two are determined to be the same person when the similarity is at least 70.
     * @param Similarity Similarity between the best face photo collected from the video stream in this verification and the uploaded image for comparison. Value range: [0.00, 100.00]. By default, the two are determined to be the same person when the similarity is at least 70.
     */
    public void setSimilarity(Float Similarity) {
        this.Similarity = Similarity;
    }

    /**
     * Get Unique identifier for this verification 
     * @return Seq Unique identifier for this verification
     */
    public String getSeq() {
        return this.Seq;
    }

    /**
     * Set Unique identifier for this verification
     * @param Seq Unique identifier for this verification
     */
    public void setSeq(String Seq) {
        this.Seq = Seq;
    }

    /**
     * Get Description of the detailed reason why the current request was rejected in the liveness phase. This parameter is returned only for the PLUS version of the eKYC service.
-Details as follows:
01-User eyes closed throughout
02 - User has not completed the specified action
03-Suspected rephotography attack
04-Suspected synthesis attack
05-Suspected fraud template
06-Suspected watermark
07-Reflection validation failed
08-Suspected midway change person
09: Poor face quality
10-distance check failed
11-Suspected adversarial sample attack
12-Mouth area suspected of attack traces
13-Eye area suspected to have attack traces
14-Eye or mouth covered
Note: This field may return null, indicating that no valid values can be obtained.
Example value: ["01"]. 
     * @return LivenessInfoTag Description of the detailed reason why the current request was rejected in the liveness phase. This parameter is returned only for the PLUS version of the eKYC service.
-Details as follows:
01-User eyes closed throughout
02 - User has not completed the specified action
03-Suspected rephotography attack
04-Suspected synthesis attack
05-Suspected fraud template
06-Suspected watermark
07-Reflection validation failed
08-Suspected midway change person
09: Poor face quality
10-distance check failed
11-Suspected adversarial sample attack
12-Mouth area suspected of attack traces
13-Eye area suspected to have attack traces
14-Eye or mouth covered
Note: This field may return null, indicating that no valid values can be obtained.
Example value: ["01"].
     */
    public String [] getLivenessInfoTag() {
        return this.LivenessInfoTag;
    }

    /**
     * Set Description of the detailed reason why the current request was rejected in the liveness phase. This parameter is returned only for the PLUS version of the eKYC service.
-Details as follows:
01-User eyes closed throughout
02 - User has not completed the specified action
03-Suspected rephotography attack
04-Suspected synthesis attack
05-Suspected fraud template
06-Suspected watermark
07-Reflection validation failed
08-Suspected midway change person
09: Poor face quality
10-distance check failed
11-Suspected adversarial sample attack
12-Mouth area suspected of attack traces
13-Eye area suspected to have attack traces
14-Eye or mouth covered
Note: This field may return null, indicating that no valid values can be obtained.
Example value: ["01"].
     * @param LivenessInfoTag Description of the detailed reason why the current request was rejected in the liveness phase. This parameter is returned only for the PLUS version of the eKYC service.
-Details as follows:
01-User eyes closed throughout
02 - User has not completed the specified action
03-Suspected rephotography attack
04-Suspected synthesis attack
05-Suspected fraud template
06-Suspected watermark
07-Reflection validation failed
08-Suspected midway change person
09: Poor face quality
10-distance check failed
11-Suspected adversarial sample attack
12-Mouth area suspected of attack traces
13-Eye area suspected to have attack traces
14-Eye or mouth covered
Note: This field may return null, indicating that no valid values can be obtained.
Example value: ["01"].
     */
    public void setLivenessInfoTag(String [] LivenessInfoTag) {
        this.LivenessInfoTag = LivenessInfoTag;
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
        if (source.LivenessInfoTag != null) {
            this.LivenessInfoTag = new String[source.LivenessInfoTag.length];
            for (int i = 0; i < source.LivenessInfoTag.length; i++) {
                this.LivenessInfoTag[i] = new String(source.LivenessInfoTag[i]);
            }
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
        this.setParamArraySimple(map, prefix + "LivenessInfoTag.", this.LivenessInfoTag);

    }
}

