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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RefreshBatch extends AbstractModel {

    /**
    * Refresh batch number. For example, a value of 2 indicates that the current batch of instances will be refreshed in the second batch.
    */
    @SerializedName("RefreshBatchNum")
    @Expose
    private Long RefreshBatchNum;

    /**
    * Refresh batch status. Valid values: <li>WAITING: pending refresh;</li> <li>INIT: initializing;</li> <li>RUNNING: refreshing;</li> <li>FAILED: refresh failed;</li> <li>PARTIALLY_SUCCESSFUL: partially successful in the batch;</li> <li>CANCELLED: cancelled;</li> <li>SUCCESSFUL: refresh successful.</li>
    */
    @SerializedName("RefreshBatchStatus")
    @Expose
    private String RefreshBatchStatus;

    /**
    * List of instances linked to a refresh batch.
    */
    @SerializedName("RefreshBatchRelatedInstanceSet")
    @Expose
    private RefreshBatchRelatedInstance [] RefreshBatchRelatedInstanceSet;

    /**
    * Refresh batch start time.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Refresh batch end time.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Refresh batch number. For example, a value of 2 indicates that the current batch of instances will be refreshed in the second batch. 
     * @return RefreshBatchNum Refresh batch number. For example, a value of 2 indicates that the current batch of instances will be refreshed in the second batch.
     */
    public Long getRefreshBatchNum() {
        return this.RefreshBatchNum;
    }

    /**
     * Set Refresh batch number. For example, a value of 2 indicates that the current batch of instances will be refreshed in the second batch.
     * @param RefreshBatchNum Refresh batch number. For example, a value of 2 indicates that the current batch of instances will be refreshed in the second batch.
     */
    public void setRefreshBatchNum(Long RefreshBatchNum) {
        this.RefreshBatchNum = RefreshBatchNum;
    }

    /**
     * Get Refresh batch status. Valid values: <li>WAITING: pending refresh;</li> <li>INIT: initializing;</li> <li>RUNNING: refreshing;</li> <li>FAILED: refresh failed;</li> <li>PARTIALLY_SUCCESSFUL: partially successful in the batch;</li> <li>CANCELLED: cancelled;</li> <li>SUCCESSFUL: refresh successful.</li> 
     * @return RefreshBatchStatus Refresh batch status. Valid values: <li>WAITING: pending refresh;</li> <li>INIT: initializing;</li> <li>RUNNING: refreshing;</li> <li>FAILED: refresh failed;</li> <li>PARTIALLY_SUCCESSFUL: partially successful in the batch;</li> <li>CANCELLED: cancelled;</li> <li>SUCCESSFUL: refresh successful.</li>
     */
    public String getRefreshBatchStatus() {
        return this.RefreshBatchStatus;
    }

    /**
     * Set Refresh batch status. Valid values: <li>WAITING: pending refresh;</li> <li>INIT: initializing;</li> <li>RUNNING: refreshing;</li> <li>FAILED: refresh failed;</li> <li>PARTIALLY_SUCCESSFUL: partially successful in the batch;</li> <li>CANCELLED: cancelled;</li> <li>SUCCESSFUL: refresh successful.</li>
     * @param RefreshBatchStatus Refresh batch status. Valid values: <li>WAITING: pending refresh;</li> <li>INIT: initializing;</li> <li>RUNNING: refreshing;</li> <li>FAILED: refresh failed;</li> <li>PARTIALLY_SUCCESSFUL: partially successful in the batch;</li> <li>CANCELLED: cancelled;</li> <li>SUCCESSFUL: refresh successful.</li>
     */
    public void setRefreshBatchStatus(String RefreshBatchStatus) {
        this.RefreshBatchStatus = RefreshBatchStatus;
    }

    /**
     * Get List of instances linked to a refresh batch. 
     * @return RefreshBatchRelatedInstanceSet List of instances linked to a refresh batch.
     */
    public RefreshBatchRelatedInstance [] getRefreshBatchRelatedInstanceSet() {
        return this.RefreshBatchRelatedInstanceSet;
    }

    /**
     * Set List of instances linked to a refresh batch.
     * @param RefreshBatchRelatedInstanceSet List of instances linked to a refresh batch.
     */
    public void setRefreshBatchRelatedInstanceSet(RefreshBatchRelatedInstance [] RefreshBatchRelatedInstanceSet) {
        this.RefreshBatchRelatedInstanceSet = RefreshBatchRelatedInstanceSet;
    }

    /**
     * Get Refresh batch start time.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StartTime Refresh batch start time.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Refresh batch start time.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StartTime Refresh batch start time.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Refresh batch end time.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EndTime Refresh batch end time.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Refresh batch end time.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EndTime Refresh batch end time.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public RefreshBatch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefreshBatch(RefreshBatch source) {
        if (source.RefreshBatchNum != null) {
            this.RefreshBatchNum = new Long(source.RefreshBatchNum);
        }
        if (source.RefreshBatchStatus != null) {
            this.RefreshBatchStatus = new String(source.RefreshBatchStatus);
        }
        if (source.RefreshBatchRelatedInstanceSet != null) {
            this.RefreshBatchRelatedInstanceSet = new RefreshBatchRelatedInstance[source.RefreshBatchRelatedInstanceSet.length];
            for (int i = 0; i < source.RefreshBatchRelatedInstanceSet.length; i++) {
                this.RefreshBatchRelatedInstanceSet[i] = new RefreshBatchRelatedInstance(source.RefreshBatchRelatedInstanceSet[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RefreshBatchNum", this.RefreshBatchNum);
        this.setParamSimple(map, prefix + "RefreshBatchStatus", this.RefreshBatchStatus);
        this.setParamArrayObj(map, prefix + "RefreshBatchRelatedInstanceSet.", this.RefreshBatchRelatedInstanceSet);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

