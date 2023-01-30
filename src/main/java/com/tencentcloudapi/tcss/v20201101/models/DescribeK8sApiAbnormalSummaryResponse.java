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

public class DescribeK8sApiAbnormalSummaryResponse extends AbstractModel{

    /**
    * The number of pending events
    */
    @SerializedName("UnhandleEventCount")
    @Expose
    private Long UnhandleEventCount;

    /**
    * The number of pending high-risk events
    */
    @SerializedName("UnhandleHighLevelEventCount")
    @Expose
    private Long UnhandleHighLevelEventCount;

    /**
    * The number of pending medium-risk events
    */
    @SerializedName("UnhandleMediumLevelEventCount")
    @Expose
    private Long UnhandleMediumLevelEventCount;

    /**
    * The number of pending low-risk events
    */
    @SerializedName("UnhandleLowLevelEventCount")
    @Expose
    private Long UnhandleLowLevelEventCount;

    /**
    * The number of pending notice-level events
    */
    @SerializedName("UnhandleNoticeLevelEventCount")
    @Expose
    private Long UnhandleNoticeLevelEventCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The number of pending events 
     * @return UnhandleEventCount The number of pending events
     */
    public Long getUnhandleEventCount() {
        return this.UnhandleEventCount;
    }

    /**
     * Set The number of pending events
     * @param UnhandleEventCount The number of pending events
     */
    public void setUnhandleEventCount(Long UnhandleEventCount) {
        this.UnhandleEventCount = UnhandleEventCount;
    }

    /**
     * Get The number of pending high-risk events 
     * @return UnhandleHighLevelEventCount The number of pending high-risk events
     */
    public Long getUnhandleHighLevelEventCount() {
        return this.UnhandleHighLevelEventCount;
    }

    /**
     * Set The number of pending high-risk events
     * @param UnhandleHighLevelEventCount The number of pending high-risk events
     */
    public void setUnhandleHighLevelEventCount(Long UnhandleHighLevelEventCount) {
        this.UnhandleHighLevelEventCount = UnhandleHighLevelEventCount;
    }

    /**
     * Get The number of pending medium-risk events 
     * @return UnhandleMediumLevelEventCount The number of pending medium-risk events
     */
    public Long getUnhandleMediumLevelEventCount() {
        return this.UnhandleMediumLevelEventCount;
    }

    /**
     * Set The number of pending medium-risk events
     * @param UnhandleMediumLevelEventCount The number of pending medium-risk events
     */
    public void setUnhandleMediumLevelEventCount(Long UnhandleMediumLevelEventCount) {
        this.UnhandleMediumLevelEventCount = UnhandleMediumLevelEventCount;
    }

    /**
     * Get The number of pending low-risk events 
     * @return UnhandleLowLevelEventCount The number of pending low-risk events
     */
    public Long getUnhandleLowLevelEventCount() {
        return this.UnhandleLowLevelEventCount;
    }

    /**
     * Set The number of pending low-risk events
     * @param UnhandleLowLevelEventCount The number of pending low-risk events
     */
    public void setUnhandleLowLevelEventCount(Long UnhandleLowLevelEventCount) {
        this.UnhandleLowLevelEventCount = UnhandleLowLevelEventCount;
    }

    /**
     * Get The number of pending notice-level events 
     * @return UnhandleNoticeLevelEventCount The number of pending notice-level events
     */
    public Long getUnhandleNoticeLevelEventCount() {
        return this.UnhandleNoticeLevelEventCount;
    }

    /**
     * Set The number of pending notice-level events
     * @param UnhandleNoticeLevelEventCount The number of pending notice-level events
     */
    public void setUnhandleNoticeLevelEventCount(Long UnhandleNoticeLevelEventCount) {
        this.UnhandleNoticeLevelEventCount = UnhandleNoticeLevelEventCount;
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

    public DescribeK8sApiAbnormalSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeK8sApiAbnormalSummaryResponse(DescribeK8sApiAbnormalSummaryResponse source) {
        if (source.UnhandleEventCount != null) {
            this.UnhandleEventCount = new Long(source.UnhandleEventCount);
        }
        if (source.UnhandleHighLevelEventCount != null) {
            this.UnhandleHighLevelEventCount = new Long(source.UnhandleHighLevelEventCount);
        }
        if (source.UnhandleMediumLevelEventCount != null) {
            this.UnhandleMediumLevelEventCount = new Long(source.UnhandleMediumLevelEventCount);
        }
        if (source.UnhandleLowLevelEventCount != null) {
            this.UnhandleLowLevelEventCount = new Long(source.UnhandleLowLevelEventCount);
        }
        if (source.UnhandleNoticeLevelEventCount != null) {
            this.UnhandleNoticeLevelEventCount = new Long(source.UnhandleNoticeLevelEventCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnhandleEventCount", this.UnhandleEventCount);
        this.setParamSimple(map, prefix + "UnhandleHighLevelEventCount", this.UnhandleHighLevelEventCount);
        this.setParamSimple(map, prefix + "UnhandleMediumLevelEventCount", this.UnhandleMediumLevelEventCount);
        this.setParamSimple(map, prefix + "UnhandleLowLevelEventCount", this.UnhandleLowLevelEventCount);
        this.setParamSimple(map, prefix + "UnhandleNoticeLevelEventCount", this.UnhandleNoticeLevelEventCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

