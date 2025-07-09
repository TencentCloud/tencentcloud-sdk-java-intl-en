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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Result extends AbstractModel {

    /**
    * Most matching candidate recognized
    */
    @SerializedName("Candidates")
    @Expose
    private Candidate [] Candidates;

    /**
    * Position of detected face frame
    */
    @SerializedName("FaceRect")
    @Expose
    private FaceRect FaceRect;

    /**
    * The status return code for the face image detected. Valid values: `0` - normal; `-1601` - the image does not meet the quality requirements, in which case `Candidate` is empty; `-1604` - the face similarity is not higher than `FaceMatchThreshold`.
    */
    @SerializedName("RetCode")
    @Expose
    private Long RetCode;

    /**
     * Get Most matching candidate recognized 
     * @return Candidates Most matching candidate recognized
     */
    public Candidate [] getCandidates() {
        return this.Candidates;
    }

    /**
     * Set Most matching candidate recognized
     * @param Candidates Most matching candidate recognized
     */
    public void setCandidates(Candidate [] Candidates) {
        this.Candidates = Candidates;
    }

    /**
     * Get Position of detected face frame 
     * @return FaceRect Position of detected face frame
     */
    public FaceRect getFaceRect() {
        return this.FaceRect;
    }

    /**
     * Set Position of detected face frame
     * @param FaceRect Position of detected face frame
     */
    public void setFaceRect(FaceRect FaceRect) {
        this.FaceRect = FaceRect;
    }

    /**
     * Get The status return code for the face image detected. Valid values: `0` - normal; `-1601` - the image does not meet the quality requirements, in which case `Candidate` is empty; `-1604` - the face similarity is not higher than `FaceMatchThreshold`. 
     * @return RetCode The status return code for the face image detected. Valid values: `0` - normal; `-1601` - the image does not meet the quality requirements, in which case `Candidate` is empty; `-1604` - the face similarity is not higher than `FaceMatchThreshold`.
     */
    public Long getRetCode() {
        return this.RetCode;
    }

    /**
     * Set The status return code for the face image detected. Valid values: `0` - normal; `-1601` - the image does not meet the quality requirements, in which case `Candidate` is empty; `-1604` - the face similarity is not higher than `FaceMatchThreshold`.
     * @param RetCode The status return code for the face image detected. Valid values: `0` - normal; `-1601` - the image does not meet the quality requirements, in which case `Candidate` is empty; `-1604` - the face similarity is not higher than `FaceMatchThreshold`.
     */
    public void setRetCode(Long RetCode) {
        this.RetCode = RetCode;
    }

    public Result() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Result(Result source) {
        if (source.Candidates != null) {
            this.Candidates = new Candidate[source.Candidates.length];
            for (int i = 0; i < source.Candidates.length; i++) {
                this.Candidates[i] = new Candidate(source.Candidates[i]);
            }
        }
        if (source.FaceRect != null) {
            this.FaceRect = new FaceRect(source.FaceRect);
        }
        if (source.RetCode != null) {
            this.RetCode = new Long(source.RetCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Candidates.", this.Candidates);
        this.setParamObj(map, prefix + "FaceRect.", this.FaceRect);
        this.setParamSimple(map, prefix + "RetCode", this.RetCode);

    }
}

