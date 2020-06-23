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

public class Result extends AbstractModel{

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
    * Status return code of detected face image. 0: normal. 
-1601: the image quality control requirement is not met; in this case, `Candidate` is empty.
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
     * Get Status return code of detected face image. 0: normal. 
-1601: the image quality control requirement is not met; in this case, `Candidate` is empty. 
     * @return RetCode Status return code of detected face image. 0: normal. 
-1601: the image quality control requirement is not met; in this case, `Candidate` is empty.
     */
    public Long getRetCode() {
        return this.RetCode;
    }

    /**
     * Set Status return code of detected face image. 0: normal. 
-1601: the image quality control requirement is not met; in this case, `Candidate` is empty.
     * @param RetCode Status return code of detected face image. 0: normal. 
-1601: the image quality control requirement is not met; in this case, `Candidate` is empty.
     */
    public void setRetCode(Long RetCode) {
        this.RetCode = RetCode;
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

