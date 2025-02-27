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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateSyncProgress extends AbstractModel {

    /**
    * Resource type.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Region result list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateSyncProgressRegions")
    @Expose
    private UpdateSyncProgressRegion [] UpdateSyncProgressRegions;

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
     * @return ResourceType Resource type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ResourceType Resource type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Region result list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UpdateSyncProgressRegions Region result list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public UpdateSyncProgressRegion [] getUpdateSyncProgressRegions() {
        return this.UpdateSyncProgressRegions;
    }

    /**
     * Set Region result list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UpdateSyncProgressRegions Region result list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateSyncProgressRegions(UpdateSyncProgressRegion [] UpdateSyncProgressRegions) {
        this.UpdateSyncProgressRegions = UpdateSyncProgressRegions;
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

    public UpdateSyncProgress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSyncProgress(UpdateSyncProgress source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.UpdateSyncProgressRegions != null) {
            this.UpdateSyncProgressRegions = new UpdateSyncProgressRegion[source.UpdateSyncProgressRegions.length];
            for (int i = 0; i < source.UpdateSyncProgressRegions.length; i++) {
                this.UpdateSyncProgressRegions[i] = new UpdateSyncProgressRegion(source.UpdateSyncProgressRegions[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArrayObj(map, prefix + "UpdateSyncProgressRegions.", this.UpdateSyncProgressRegions);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

