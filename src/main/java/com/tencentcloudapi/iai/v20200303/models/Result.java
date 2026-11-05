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
    * The most similar candidate identified.
    */
    @SerializedName("Candidates")
    @Expose
    private Candidate [] Candidates;

    /**
    * Face bounding box position detected.
    */
    @SerializedName("FaceRect")
    @Expose
    private FaceRect FaceRect;

    /**
    * Status return code of the detected face image.
- 0 indicates normal. 
-1601 indicates the image quality control requirement is not met. At this point, the Candidate content is empty.
    */
    @SerializedName("RetCode")
    @Expose
    private Long RetCode;

    /**
     * Get The most similar candidate identified. 
     * @return Candidates The most similar candidate identified.
     */
    public Candidate [] getCandidates() {
        return this.Candidates;
    }

    /**
     * Set The most similar candidate identified.
     * @param Candidates The most similar candidate identified.
     */
    public void setCandidates(Candidate [] Candidates) {
        this.Candidates = Candidates;
    }

    /**
     * Get Face bounding box position detected. 
     * @return FaceRect Face bounding box position detected.
     */
    public FaceRect getFaceRect() {
        return this.FaceRect;
    }

    /**
     * Set Face bounding box position detected.
     * @param FaceRect Face bounding box position detected.
     */
    public void setFaceRect(FaceRect FaceRect) {
        this.FaceRect = FaceRect;
    }

    /**
     * Get Status return code of the detected face image.
- 0 indicates normal. 
-1601 indicates the image quality control requirement is not met. At this point, the Candidate content is empty. 
     * @return RetCode Status return code of the detected face image.
- 0 indicates normal. 
-1601 indicates the image quality control requirement is not met. At this point, the Candidate content is empty.
     */
    public Long getRetCode() {
        return this.RetCode;
    }

    /**
     * Set Status return code of the detected face image.
- 0 indicates normal. 
-1601 indicates the image quality control requirement is not met. At this point, the Candidate content is empty.
     * @param RetCode Status return code of the detected face image.
- 0 indicates normal. 
-1601 indicates the image quality control requirement is not met. At this point, the Candidate content is empty.
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

