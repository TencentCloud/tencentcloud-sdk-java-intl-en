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

public class GetSimilarPersonResultResponse extends AbstractModel{

    /**
    * Duplicate check task completion progress. Value range: [0.0,100.0]. `SimilarPersons` takes effect only if this parameter value is 100.
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * Temporary download link for the information file of the persons suspected to be duplicate. The validity period is 5 minutes, and the result file retention duration is 90 days.
The file content is an array of `SimilarPerson` values.
    */
    @SerializedName("SimilarPersonsUrl")
    @Expose
    private String SimilarPersonsUrl;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Duplicate check task completion progress. Value range: [0.0,100.0]. `SimilarPersons` takes effect only if this parameter value is 100. 
     * @return Progress Duplicate check task completion progress. Value range: [0.0,100.0]. `SimilarPersons` takes effect only if this parameter value is 100.
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set Duplicate check task completion progress. Value range: [0.0,100.0]. `SimilarPersons` takes effect only if this parameter value is 100.
     * @param Progress Duplicate check task completion progress. Value range: [0.0,100.0]. `SimilarPersons` takes effect only if this parameter value is 100.
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Temporary download link for the information file of the persons suspected to be duplicate. The validity period is 5 minutes, and the result file retention duration is 90 days.
The file content is an array of `SimilarPerson` values. 
     * @return SimilarPersonsUrl Temporary download link for the information file of the persons suspected to be duplicate. The validity period is 5 minutes, and the result file retention duration is 90 days.
The file content is an array of `SimilarPerson` values.
     */
    public String getSimilarPersonsUrl() {
        return this.SimilarPersonsUrl;
    }

    /**
     * Set Temporary download link for the information file of the persons suspected to be duplicate. The validity period is 5 minutes, and the result file retention duration is 90 days.
The file content is an array of `SimilarPerson` values.
     * @param SimilarPersonsUrl Temporary download link for the information file of the persons suspected to be duplicate. The validity period is 5 minutes, and the result file retention duration is 90 days.
The file content is an array of `SimilarPerson` values.
     */
    public void setSimilarPersonsUrl(String SimilarPersonsUrl) {
        this.SimilarPersonsUrl = SimilarPersonsUrl;
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
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "SimilarPersonsUrl", this.SimilarPersonsUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

