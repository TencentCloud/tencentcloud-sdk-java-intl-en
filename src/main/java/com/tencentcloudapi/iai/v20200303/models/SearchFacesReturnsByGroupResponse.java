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

public class SearchFacesReturnsByGroupResponse extends AbstractModel{

    /**
    * Number of faces included in searched groups.
    */
    @SerializedName("FaceNum")
    @Expose
    private Long FaceNum;

    /**
    * Recognition result.
    */
    @SerializedName("ResultsReturnsByGroup")
    @Expose
    private ResultsReturnsByGroup [] ResultsReturnsByGroup;

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
     * Get Number of faces included in searched groups. 
     * @return FaceNum Number of faces included in searched groups.
     */
    public Long getFaceNum() {
        return this.FaceNum;
    }

    /**
     * Set Number of faces included in searched groups.
     * @param FaceNum Number of faces included in searched groups.
     */
    public void setFaceNum(Long FaceNum) {
        this.FaceNum = FaceNum;
    }

    /**
     * Get Recognition result. 
     * @return ResultsReturnsByGroup Recognition result.
     */
    public ResultsReturnsByGroup [] getResultsReturnsByGroup() {
        return this.ResultsReturnsByGroup;
    }

    /**
     * Set Recognition result.
     * @param ResultsReturnsByGroup Recognition result.
     */
    public void setResultsReturnsByGroup(ResultsReturnsByGroup [] ResultsReturnsByGroup) {
        this.ResultsReturnsByGroup = ResultsReturnsByGroup;
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

    public SearchFacesReturnsByGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchFacesReturnsByGroupResponse(SearchFacesReturnsByGroupResponse source) {
        if (source.FaceNum != null) {
            this.FaceNum = new Long(source.FaceNum);
        }
        if (source.ResultsReturnsByGroup != null) {
            this.ResultsReturnsByGroup = new ResultsReturnsByGroup[source.ResultsReturnsByGroup.length];
            for (int i = 0; i < source.ResultsReturnsByGroup.length; i++) {
                this.ResultsReturnsByGroup[i] = new ResultsReturnsByGroup(source.ResultsReturnsByGroup[i]);
            }
        }
        if (source.FaceModelVersion != null) {
            this.FaceModelVersion = new String(source.FaceModelVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaceNum", this.FaceNum);
        this.setParamArrayObj(map, prefix + "ResultsReturnsByGroup.", this.ResultsReturnsByGroup);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

