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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskResultRequest extends AbstractModel {

    /**
    * Unique task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The pagination information returned by the last response. This parameter can be omitted for the first response, where the data will be returned from the beginning. The data with a volume set by the `MaxResults` field is returned each time.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * Maximum number of returned rows. Value range: 0–1,000. Default value: 1,000.
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Whether to convert the data type
    */
    @SerializedName("IsTransformDataType")
    @Expose
    private Boolean IsTransformDataType;

    /**
     * Get Unique task ID 
     * @return TaskId Unique task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Unique task ID
     * @param TaskId Unique task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The pagination information returned by the last response. This parameter can be omitted for the first response, where the data will be returned from the beginning. The data with a volume set by the `MaxResults` field is returned each time. 
     * @return NextToken The pagination information returned by the last response. This parameter can be omitted for the first response, where the data will be returned from the beginning. The data with a volume set by the `MaxResults` field is returned each time.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set The pagination information returned by the last response. This parameter can be omitted for the first response, where the data will be returned from the beginning. The data with a volume set by the `MaxResults` field is returned each time.
     * @param NextToken The pagination information returned by the last response. This parameter can be omitted for the first response, where the data will be returned from the beginning. The data with a volume set by the `MaxResults` field is returned each time.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get Maximum number of returned rows. Value range: 0–1,000. Default value: 1,000. 
     * @return MaxResults Maximum number of returned rows. Value range: 0–1,000. Default value: 1,000.
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Maximum number of returned rows. Value range: 0–1,000. Default value: 1,000.
     * @param MaxResults Maximum number of returned rows. Value range: 0–1,000. Default value: 1,000.
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Whether to convert the data type 
     * @return IsTransformDataType Whether to convert the data type
     */
    public Boolean getIsTransformDataType() {
        return this.IsTransformDataType;
    }

    /**
     * Set Whether to convert the data type
     * @param IsTransformDataType Whether to convert the data type
     */
    public void setIsTransformDataType(Boolean IsTransformDataType) {
        this.IsTransformDataType = IsTransformDataType;
    }

    public DescribeTaskResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskResultRequest(DescribeTaskResultRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.IsTransformDataType != null) {
            this.IsTransformDataType = new Boolean(source.IsTransformDataType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "IsTransformDataType", this.IsTransformDataType);

    }
}

