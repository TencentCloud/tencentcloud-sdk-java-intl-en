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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSyncModeResponse extends AbstractModel{

    /**
    * Sync mode. 0: async; 1: strong sync; 2: downgradable strong sync
    */
    @SerializedName("SyncMode")
    @Expose
    private Long SyncMode;

    /**
    * Whether a modification is in progress. 1: yes; 0: no.
    */
    @SerializedName("IsModifying")
    @Expose
    private Long IsModifying;

    /**
    * Current sync mode. Valid values: `0` (async), `1` (sync).
    */
    @SerializedName("CurrentSyncMode")
    @Expose
    private Long CurrentSyncMode;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Sync mode. 0: async; 1: strong sync; 2: downgradable strong sync 
     * @return SyncMode Sync mode. 0: async; 1: strong sync; 2: downgradable strong sync
     */
    public Long getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set Sync mode. 0: async; 1: strong sync; 2: downgradable strong sync
     * @param SyncMode Sync mode. 0: async; 1: strong sync; 2: downgradable strong sync
     */
    public void setSyncMode(Long SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get Whether a modification is in progress. 1: yes; 0: no. 
     * @return IsModifying Whether a modification is in progress. 1: yes; 0: no.
     */
    public Long getIsModifying() {
        return this.IsModifying;
    }

    /**
     * Set Whether a modification is in progress. 1: yes; 0: no.
     * @param IsModifying Whether a modification is in progress. 1: yes; 0: no.
     */
    public void setIsModifying(Long IsModifying) {
        this.IsModifying = IsModifying;
    }

    /**
     * Get Current sync mode. Valid values: `0` (async), `1` (sync). 
     * @return CurrentSyncMode Current sync mode. Valid values: `0` (async), `1` (sync).
     */
    public Long getCurrentSyncMode() {
        return this.CurrentSyncMode;
    }

    /**
     * Set Current sync mode. Valid values: `0` (async), `1` (sync).
     * @param CurrentSyncMode Current sync mode. Valid values: `0` (async), `1` (sync).
     */
    public void setCurrentSyncMode(Long CurrentSyncMode) {
        this.CurrentSyncMode = CurrentSyncMode;
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
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);
        this.setParamSimple(map, prefix + "IsModifying", this.IsModifying);
        this.setParamSimple(map, prefix + "CurrentSyncMode", this.CurrentSyncMode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

