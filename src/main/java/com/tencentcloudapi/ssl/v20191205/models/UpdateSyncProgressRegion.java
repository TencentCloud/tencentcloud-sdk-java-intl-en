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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateSyncProgressRegion extends AbstractModel {

    /**
    * Resource type.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Total number
.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Quantity of executions completed.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OffsetCount")
    @Expose
    private Long OffsetCount;

    /**
    * Asynchronous update progress status: 0, pending, 1 processed, 3 processing.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Resource type.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Region Resource type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Resource type.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Region Resource type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Total number
.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number
.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number
.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number
.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Quantity of executions completed.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OffsetCount Quantity of executions completed.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getOffsetCount() {
        return this.OffsetCount;
    }

    /**
     * Set Quantity of executions completed.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OffsetCount Quantity of executions completed.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOffsetCount(Long OffsetCount) {
        this.OffsetCount = OffsetCount;
    }

    /**
     * Get Asynchronous update progress status: 0, pending, 1 processed, 3 processing.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Asynchronous update progress status: 0, pending, 1 processed, 3 processing.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Asynchronous update progress status: 0, pending, 1 processed, 3 processing.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Asynchronous update progress status: 0, pending, 1 processed, 3 processing.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public UpdateSyncProgressRegion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSyncProgressRegion(UpdateSyncProgressRegion source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.OffsetCount != null) {
            this.OffsetCount = new Long(source.OffsetCount);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "OffsetCount", this.OffsetCount);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

