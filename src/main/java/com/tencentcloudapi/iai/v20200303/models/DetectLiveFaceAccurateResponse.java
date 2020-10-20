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

public class DetectLiveFaceAccurateResponse extends AbstractModel{

    /**
    * Liveness score. Value range: [0, 100]. You can set several thresholds such as 5, 10, 40, 70 and 90 to determine whether the image is photographed. We recommend using the threshold 40.
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

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
     * Get Liveness score. Value range: [0, 100]. You can set several thresholds such as 5, 10, 40, 70 and 90 to determine whether the image is photographed. We recommend using the threshold 40. 
     * @return Score Liveness score. Value range: [0, 100]. You can set several thresholds such as 5, 10, 40, 70 and 90 to determine whether the image is photographed. We recommend using the threshold 40.
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set Liveness score. Value range: [0, 100]. You can set several thresholds such as 5, 10, 40, 70 and 90 to determine whether the image is photographed. We recommend using the threshold 40.
     * @param Score Liveness score. Value range: [0, 100]. You can set several thresholds such as 5, 10, 40, 70 and 90 to determine whether the image is photographed. We recommend using the threshold 40.
     */
    public void setScore(Float Score) {
        this.Score = Score;
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
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

