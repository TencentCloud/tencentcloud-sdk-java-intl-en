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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyPersonResponse extends AbstractModel{

    /**
    * Similarity between given face image and `PersonId`. If there are multiple faces under the `PersonId`, their information will be fused for verification.
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * Whether the person in the image matches the `PersonId`.
    */
    @SerializedName("IsMatch")
    @Expose
    private Boolean IsMatch;

    /**
    * Algorithm model version used for face recognition.
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Similarity between given face image and `PersonId`. If there are multiple faces under the `PersonId`, their information will be fused for verification. 
     * @return Score Similarity between given face image and `PersonId`. If there are multiple faces under the `PersonId`, their information will be fused for verification.
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set Similarity between given face image and `PersonId`. If there are multiple faces under the `PersonId`, their information will be fused for verification.
     * @param Score Similarity between given face image and `PersonId`. If there are multiple faces under the `PersonId`, their information will be fused for verification.
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get Whether the person in the image matches the `PersonId`. 
     * @return IsMatch Whether the person in the image matches the `PersonId`.
     */
    public Boolean getIsMatch() {
        return this.IsMatch;
    }

    /**
     * Set Whether the person in the image matches the `PersonId`.
     * @param IsMatch Whether the person in the image matches the `PersonId`.
     */
    public void setIsMatch(Boolean IsMatch) {
        this.IsMatch = IsMatch;
    }

    /**
     * Get Algorithm model version used for face recognition. 
     * @return FaceModelVersion Algorithm model version used for face recognition.
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set Algorithm model version used for face recognition.
     * @param FaceModelVersion Algorithm model version used for face recognition.
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "IsMatch", this.IsMatch);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

