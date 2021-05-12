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

public class SearchPersonsResponse extends AbstractModel{

    /**
    * Recognition result.
    */
    @SerializedName("Results")
    @Expose
    private Result [] Results;

    /**
    * Number of the persons included in searched groups. If the quality of all faces in the input image does not meet the requirement, 0 will be returned.
    */
    @SerializedName("PersonNum")
    @Expose
    private Long PersonNum;

    /**
    * Algorithm model version used for face recognition.
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Recognition result. 
     * @return Results Recognition result.
     */
    public Result [] getResults() {
        return this.Results;
    }

    /**
     * Set Recognition result.
     * @param Results Recognition result.
     */
    public void setResults(Result [] Results) {
        this.Results = Results;
    }

    /**
     * Get Number of the persons included in searched groups. If the quality of all faces in the input image does not meet the requirement, 0 will be returned. 
     * @return PersonNum Number of the persons included in searched groups. If the quality of all faces in the input image does not meet the requirement, 0 will be returned.
     */
    public Long getPersonNum() {
        return this.PersonNum;
    }

    /**
     * Set Number of the persons included in searched groups. If the quality of all faces in the input image does not meet the requirement, 0 will be returned.
     * @param PersonNum Number of the persons included in searched groups. If the quality of all faces in the input image does not meet the requirement, 0 will be returned.
     */
    public void setPersonNum(Long PersonNum) {
        this.PersonNum = PersonNum;
    }

    /**
     * Get Algorithm model version used for face recognition.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FaceModelVersion Algorithm model version used for face recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set Algorithm model version used for face recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FaceModelVersion Algorithm model version used for face recognition.
Note: this field may return null, indicating that no valid values can be obtained.
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

    public SearchPersonsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchPersonsResponse(SearchPersonsResponse source) {
        if (source.Results != null) {
            this.Results = new Result[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new Result(source.Results[i]);
            }
        }
        if (source.PersonNum != null) {
            this.PersonNum = new Long(source.PersonNum);
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
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "PersonNum", this.PersonNum);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

