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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetryCreateSnapshotRequest extends AbstractModel {

    /**
    * Fix task ID
    */
    @SerializedName("FixId")
    @Expose
    private Long FixId;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Unique ID of the snapshot returned by the task progress
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Fix task ID 
     * @return FixId Fix task ID
     */
    public Long getFixId() {
        return this.FixId;
    }

    /**
     * Set Fix task ID
     * @param FixId Fix task ID
     */
    public void setFixId(Long FixId) {
        this.FixId = FixId;
    }

    /**
     * Get Host QUUID 
     * @return Quuid Host QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
     * @param Quuid Host QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Unique ID of the snapshot returned by the task progress 
     * @return Id Unique ID of the snapshot returned by the task progress
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique ID of the snapshot returned by the task progress
     * @param Id Unique ID of the snapshot returned by the task progress
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public RetryCreateSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetryCreateSnapshotRequest(RetryCreateSnapshotRequest source) {
        if (source.FixId != null) {
            this.FixId = new Long(source.FixId);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FixId", this.FixId);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

