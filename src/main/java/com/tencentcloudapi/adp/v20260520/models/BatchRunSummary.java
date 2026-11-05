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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchRunSummary extends AbstractModel {

    /**
    * 	Number of failures.
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
    * 	Number of successes.
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * Total batches
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Failed subscript
    */
    @SerializedName("FailedIndexList")
    @Expose
    private Long [] FailedIndexList;

    /**
    * 	Batches completed in the previous round
    */
    @SerializedName("JustCompletedIndexList")
    @Expose
    private Long [] JustCompletedIndexList;

    /**
    * Subscript in running
    */
    @SerializedName("RunningIndexList")
    @Expose
    private Long [] RunningIndexList;

    /**
    * Subscript of success
    */
    @SerializedName("SuccessIndexList")
    @Expose
    private Long [] SuccessIndexList;

    /**
     * Get 	Number of failures. 
     * @return FailedCount 	Number of failures.
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set 	Number of failures.
     * @param FailedCount 	Number of failures.
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get 	Number of successes. 
     * @return SuccessCount 	Number of successes.
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 	Number of successes.
     * @param SuccessCount 	Number of successes.
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get Total batches 
     * @return TotalCount Total batches
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total batches
     * @param TotalCount Total batches
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Failed subscript 
     * @return FailedIndexList Failed subscript
     */
    public Long [] getFailedIndexList() {
        return this.FailedIndexList;
    }

    /**
     * Set Failed subscript
     * @param FailedIndexList Failed subscript
     */
    public void setFailedIndexList(Long [] FailedIndexList) {
        this.FailedIndexList = FailedIndexList;
    }

    /**
     * Get 	Batches completed in the previous round 
     * @return JustCompletedIndexList 	Batches completed in the previous round
     */
    public Long [] getJustCompletedIndexList() {
        return this.JustCompletedIndexList;
    }

    /**
     * Set 	Batches completed in the previous round
     * @param JustCompletedIndexList 	Batches completed in the previous round
     */
    public void setJustCompletedIndexList(Long [] JustCompletedIndexList) {
        this.JustCompletedIndexList = JustCompletedIndexList;
    }

    /**
     * Get Subscript in running 
     * @return RunningIndexList Subscript in running
     */
    public Long [] getRunningIndexList() {
        return this.RunningIndexList;
    }

    /**
     * Set Subscript in running
     * @param RunningIndexList Subscript in running
     */
    public void setRunningIndexList(Long [] RunningIndexList) {
        this.RunningIndexList = RunningIndexList;
    }

    /**
     * Get Subscript of success 
     * @return SuccessIndexList Subscript of success
     */
    public Long [] getSuccessIndexList() {
        return this.SuccessIndexList;
    }

    /**
     * Set Subscript of success
     * @param SuccessIndexList Subscript of success
     */
    public void setSuccessIndexList(Long [] SuccessIndexList) {
        this.SuccessIndexList = SuccessIndexList;
    }

    public BatchRunSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchRunSummary(BatchRunSummary source) {
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.FailedIndexList != null) {
            this.FailedIndexList = new Long[source.FailedIndexList.length];
            for (int i = 0; i < source.FailedIndexList.length; i++) {
                this.FailedIndexList[i] = new Long(source.FailedIndexList[i]);
            }
        }
        if (source.JustCompletedIndexList != null) {
            this.JustCompletedIndexList = new Long[source.JustCompletedIndexList.length];
            for (int i = 0; i < source.JustCompletedIndexList.length; i++) {
                this.JustCompletedIndexList[i] = new Long(source.JustCompletedIndexList[i]);
            }
        }
        if (source.RunningIndexList != null) {
            this.RunningIndexList = new Long[source.RunningIndexList.length];
            for (int i = 0; i < source.RunningIndexList.length; i++) {
                this.RunningIndexList[i] = new Long(source.RunningIndexList[i]);
            }
        }
        if (source.SuccessIndexList != null) {
            this.SuccessIndexList = new Long[source.SuccessIndexList.length];
            for (int i = 0; i < source.SuccessIndexList.length; i++) {
                this.SuccessIndexList[i] = new Long(source.SuccessIndexList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "FailedIndexList.", this.FailedIndexList);
        this.setParamArraySimple(map, prefix + "JustCompletedIndexList.", this.JustCompletedIndexList);
        this.setParamArraySimple(map, prefix + "RunningIndexList.", this.RunningIndexList);
        this.setParamArraySimple(map, prefix + "SuccessIndexList.", this.SuccessIndexList);

    }
}

