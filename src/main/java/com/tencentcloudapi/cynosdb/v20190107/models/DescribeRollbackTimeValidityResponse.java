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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRollbackTimeValidityResponse extends AbstractModel{

    /**
    * Storage `poolID`
    */
    @SerializedName("PoolId")
    @Expose
    private Long PoolId;

    /**
    * Rollback task ID, which needs to be passed in when rolling back to this time point
    */
    @SerializedName("QueryId")
    @Expose
    private Long QueryId;

    /**
    * Whether the time point is valid. pass: check passed; fail: check failed
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Suggested time point. This value takes effect only if `Status` is `fail`
    */
    @SerializedName("SuggestTime")
    @Expose
    private String SuggestTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Storage `poolID` 
     * @return PoolId Storage `poolID`
     */
    public Long getPoolId() {
        return this.PoolId;
    }

    /**
     * Set Storage `poolID`
     * @param PoolId Storage `poolID`
     */
    public void setPoolId(Long PoolId) {
        this.PoolId = PoolId;
    }

    /**
     * Get Rollback task ID, which needs to be passed in when rolling back to this time point 
     * @return QueryId Rollback task ID, which needs to be passed in when rolling back to this time point
     */
    public Long getQueryId() {
        return this.QueryId;
    }

    /**
     * Set Rollback task ID, which needs to be passed in when rolling back to this time point
     * @param QueryId Rollback task ID, which needs to be passed in when rolling back to this time point
     */
    public void setQueryId(Long QueryId) {
        this.QueryId = QueryId;
    }

    /**
     * Get Whether the time point is valid. pass: check passed; fail: check failed 
     * @return Status Whether the time point is valid. pass: check passed; fail: check failed
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the time point is valid. pass: check passed; fail: check failed
     * @param Status Whether the time point is valid. pass: check passed; fail: check failed
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Suggested time point. This value takes effect only if `Status` is `fail` 
     * @return SuggestTime Suggested time point. This value takes effect only if `Status` is `fail`
     */
    public String getSuggestTime() {
        return this.SuggestTime;
    }

    /**
     * Set Suggested time point. This value takes effect only if `Status` is `fail`
     * @param SuggestTime Suggested time point. This value takes effect only if `Status` is `fail`
     */
    public void setSuggestTime(String SuggestTime) {
        this.SuggestTime = SuggestTime;
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

    public DescribeRollbackTimeValidityResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRollbackTimeValidityResponse(DescribeRollbackTimeValidityResponse source) {
        if (source.PoolId != null) {
            this.PoolId = new Long(source.PoolId);
        }
        if (source.QueryId != null) {
            this.QueryId = new Long(source.QueryId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SuggestTime != null) {
            this.SuggestTime = new String(source.SuggestTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PoolId", this.PoolId);
        this.setParamSimple(map, prefix + "QueryId", this.QueryId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SuggestTime", this.SuggestTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

