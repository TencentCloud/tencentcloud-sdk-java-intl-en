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

public class ResultsReturnsByGroup extends AbstractModel {

    /**
    * Position of detected face frame
    */
    @SerializedName("FaceRect")
    @Expose
    private FaceRect FaceRect;

    /**
    * Recognition result.
    */
    @SerializedName("GroupCandidates")
    @Expose
    private GroupCandidate [] GroupCandidates;

    /**
    * Status return code of detected face image. 0: normal. 
-1601: the image quality control requirement is not met; in this case, `Candidate` is empty.
    */
    @SerializedName("RetCode")
    @Expose
    private Long RetCode;

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
     * Get Recognition result. 
     * @return GroupCandidates Recognition result.
     */
    public GroupCandidate [] getGroupCandidates() {
        return this.GroupCandidates;
    }

    /**
     * Set Recognition result.
     * @param GroupCandidates Recognition result.
     */
    public void setGroupCandidates(GroupCandidate [] GroupCandidates) {
        this.GroupCandidates = GroupCandidates;
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

    public ResultsReturnsByGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResultsReturnsByGroup(ResultsReturnsByGroup source) {
        if (source.FaceRect != null) {
            this.FaceRect = new FaceRect(source.FaceRect);
        }
        if (source.GroupCandidates != null) {
            this.GroupCandidates = new GroupCandidate[source.GroupCandidates.length];
            for (int i = 0; i < source.GroupCandidates.length; i++) {
                this.GroupCandidates[i] = new GroupCandidate(source.GroupCandidates[i]);
            }
        }
        if (source.RetCode != null) {
            this.RetCode = new Long(source.RetCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FaceRect.", this.FaceRect);
        this.setParamArrayObj(map, prefix + "GroupCandidates.", this.GroupCandidates);
        this.setParamSimple(map, prefix + "RetCode", this.RetCode);

    }
}

