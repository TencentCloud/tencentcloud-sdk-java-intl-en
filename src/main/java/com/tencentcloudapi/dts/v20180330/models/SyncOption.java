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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncOption extends AbstractModel{

    /**
    * Sync object. 1: entire instance; 2: specified table
    */
    @SerializedName("SyncObject")
    @Expose
    private Long SyncObject;

    /**
    * Sync start configuration. 1: start immediately
    */
    @SerializedName("RunMode")
    @Expose
    private Long RunMode;

    /**
    * Sync mode. 3: full + incremental sync
    */
    @SerializedName("SyncType")
    @Expose
    private Long SyncType;

    /**
    * Data consistency check. 1: no configuration required
    */
    @SerializedName("ConsistencyType")
    @Expose
    private Long ConsistencyType;

    /**
     * Get Sync object. 1: entire instance; 2: specified table 
     * @return SyncObject Sync object. 1: entire instance; 2: specified table
     */
    public Long getSyncObject() {
        return this.SyncObject;
    }

    /**
     * Set Sync object. 1: entire instance; 2: specified table
     * @param SyncObject Sync object. 1: entire instance; 2: specified table
     */
    public void setSyncObject(Long SyncObject) {
        this.SyncObject = SyncObject;
    }

    /**
     * Get Sync start configuration. 1: start immediately 
     * @return RunMode Sync start configuration. 1: start immediately
     */
    public Long getRunMode() {
        return this.RunMode;
    }

    /**
     * Set Sync start configuration. 1: start immediately
     * @param RunMode Sync start configuration. 1: start immediately
     */
    public void setRunMode(Long RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get Sync mode. 3: full + incremental sync 
     * @return SyncType Sync mode. 3: full + incremental sync
     */
    public Long getSyncType() {
        return this.SyncType;
    }

    /**
     * Set Sync mode. 3: full + incremental sync
     * @param SyncType Sync mode. 3: full + incremental sync
     */
    public void setSyncType(Long SyncType) {
        this.SyncType = SyncType;
    }

    /**
     * Get Data consistency check. 1: no configuration required 
     * @return ConsistencyType Data consistency check. 1: no configuration required
     */
    public Long getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set Data consistency check. 1: no configuration required
     * @param ConsistencyType Data consistency check. 1: no configuration required
     */
    public void setConsistencyType(Long ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    public SyncOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncOption(SyncOption source) {
        if (source.SyncObject != null) {
            this.SyncObject = new Long(source.SyncObject);
        }
        if (source.RunMode != null) {
            this.RunMode = new Long(source.RunMode);
        }
        if (source.SyncType != null) {
            this.SyncType = new Long(source.SyncType);
        }
        if (source.ConsistencyType != null) {
            this.ConsistencyType = new Long(source.ConsistencyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SyncObject", this.SyncObject);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "SyncType", this.SyncType);
        this.setParamSimple(map, prefix + "ConsistencyType", this.ConsistencyType);

    }
}

