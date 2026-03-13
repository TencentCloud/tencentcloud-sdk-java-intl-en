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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotOperationLogsRequest extends AbstractModel {

    /**
    * Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.com/document/api/582/80206?from_cn_redirect=1) api.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Start time, format "YYYY-MM-DD hh:MM:ss".
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time, format "YYYY-MM-DD hh:MM:ss".
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.com/document/api/582/80206?from_cn_redirect=1) api. 
     * @return SnapshotId Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.com/document/api/582/80206?from_cn_redirect=1) api.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.com/document/api/582/80206?from_cn_redirect=1) api.
     * @param SnapshotId Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.com/document/api/582/80206?from_cn_redirect=1) api.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Start time, format "YYYY-MM-DD hh:MM:ss". 
     * @return StartTime Start time, format "YYYY-MM-DD hh:MM:ss".
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, format "YYYY-MM-DD hh:MM:ss".
     * @param StartTime Start time, format "YYYY-MM-DD hh:MM:ss".
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, format "YYYY-MM-DD hh:MM:ss". 
     * @return EndTime End time, format "YYYY-MM-DD hh:MM:ss".
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, format "YYYY-MM-DD hh:MM:ss".
     * @param EndTime End time, format "YYYY-MM-DD hh:MM:ss".
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeSnapshotOperationLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotOperationLogsRequest(DescribeSnapshotOperationLogsRequest source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
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
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

