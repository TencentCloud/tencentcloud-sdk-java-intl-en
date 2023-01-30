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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAbnormalProcessLevelSummaryResponse extends AbstractModel{

    /**
    * Number of pending high-risk events of abnormal processes
    */
    @SerializedName("HighLevelEventCount")
    @Expose
    private Long HighLevelEventCount;

    /**
    * Number of pending medium-risk events of abnormal processes
    */
    @SerializedName("MediumLevelEventCount")
    @Expose
    private Long MediumLevelEventCount;

    /**
    * Number of pending low-risk events of abnormal processes
    */
    @SerializedName("LowLevelEventCount")
    @Expose
    private Long LowLevelEventCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of pending high-risk events of abnormal processes 
     * @return HighLevelEventCount Number of pending high-risk events of abnormal processes
     */
    public Long getHighLevelEventCount() {
        return this.HighLevelEventCount;
    }

    /**
     * Set Number of pending high-risk events of abnormal processes
     * @param HighLevelEventCount Number of pending high-risk events of abnormal processes
     */
    public void setHighLevelEventCount(Long HighLevelEventCount) {
        this.HighLevelEventCount = HighLevelEventCount;
    }

    /**
     * Get Number of pending medium-risk events of abnormal processes 
     * @return MediumLevelEventCount Number of pending medium-risk events of abnormal processes
     */
    public Long getMediumLevelEventCount() {
        return this.MediumLevelEventCount;
    }

    /**
     * Set Number of pending medium-risk events of abnormal processes
     * @param MediumLevelEventCount Number of pending medium-risk events of abnormal processes
     */
    public void setMediumLevelEventCount(Long MediumLevelEventCount) {
        this.MediumLevelEventCount = MediumLevelEventCount;
    }

    /**
     * Get Number of pending low-risk events of abnormal processes 
     * @return LowLevelEventCount Number of pending low-risk events of abnormal processes
     */
    public Long getLowLevelEventCount() {
        return this.LowLevelEventCount;
    }

    /**
     * Set Number of pending low-risk events of abnormal processes
     * @param LowLevelEventCount Number of pending low-risk events of abnormal processes
     */
    public void setLowLevelEventCount(Long LowLevelEventCount) {
        this.LowLevelEventCount = LowLevelEventCount;
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

    public DescribeAbnormalProcessLevelSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAbnormalProcessLevelSummaryResponse(DescribeAbnormalProcessLevelSummaryResponse source) {
        if (source.HighLevelEventCount != null) {
            this.HighLevelEventCount = new Long(source.HighLevelEventCount);
        }
        if (source.MediumLevelEventCount != null) {
            this.MediumLevelEventCount = new Long(source.MediumLevelEventCount);
        }
        if (source.LowLevelEventCount != null) {
            this.LowLevelEventCount = new Long(source.LowLevelEventCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighLevelEventCount", this.HighLevelEventCount);
        this.setParamSimple(map, prefix + "MediumLevelEventCount", this.MediumLevelEventCount);
        this.setParamSimple(map, prefix + "LowLevelEventCount", this.LowLevelEventCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

