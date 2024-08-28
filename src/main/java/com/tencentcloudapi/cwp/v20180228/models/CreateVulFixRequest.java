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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVulFixRequest extends AbstractModel {

    /**
    * List of hosts for which the vulnerability should be fixed
    */
    @SerializedName("CreateVulFixTaskQuuids")
    @Expose
    private CreateVulFixTaskQuuids [] CreateVulFixTaskQuuids;

    /**
    * Snapshot retention days: 0 days indicates that no snapshot will be created. Hosts without a snapshot for 24 hours must have a snapshot created to be restored.
    */
    @SerializedName("SaveDays")
    @Expose
    private Long SaveDays;

    /**
    * Snapshot name
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
     * Get List of hosts for which the vulnerability should be fixed 
     * @return CreateVulFixTaskQuuids List of hosts for which the vulnerability should be fixed
     */
    public CreateVulFixTaskQuuids [] getCreateVulFixTaskQuuids() {
        return this.CreateVulFixTaskQuuids;
    }

    /**
     * Set List of hosts for which the vulnerability should be fixed
     * @param CreateVulFixTaskQuuids List of hosts for which the vulnerability should be fixed
     */
    public void setCreateVulFixTaskQuuids(CreateVulFixTaskQuuids [] CreateVulFixTaskQuuids) {
        this.CreateVulFixTaskQuuids = CreateVulFixTaskQuuids;
    }

    /**
     * Get Snapshot retention days: 0 days indicates that no snapshot will be created. Hosts without a snapshot for 24 hours must have a snapshot created to be restored. 
     * @return SaveDays Snapshot retention days: 0 days indicates that no snapshot will be created. Hosts without a snapshot for 24 hours must have a snapshot created to be restored.
     */
    public Long getSaveDays() {
        return this.SaveDays;
    }

    /**
     * Set Snapshot retention days: 0 days indicates that no snapshot will be created. Hosts without a snapshot for 24 hours must have a snapshot created to be restored.
     * @param SaveDays Snapshot retention days: 0 days indicates that no snapshot will be created. Hosts without a snapshot for 24 hours must have a snapshot created to be restored.
     */
    public void setSaveDays(Long SaveDays) {
        this.SaveDays = SaveDays;
    }

    /**
     * Get Snapshot name 
     * @return SnapshotName Snapshot name
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set Snapshot name
     * @param SnapshotName Snapshot name
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    public CreateVulFixRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulFixRequest(CreateVulFixRequest source) {
        if (source.CreateVulFixTaskQuuids != null) {
            this.CreateVulFixTaskQuuids = new CreateVulFixTaskQuuids[source.CreateVulFixTaskQuuids.length];
            for (int i = 0; i < source.CreateVulFixTaskQuuids.length; i++) {
                this.CreateVulFixTaskQuuids[i] = new CreateVulFixTaskQuuids(source.CreateVulFixTaskQuuids[i]);
            }
        }
        if (source.SaveDays != null) {
            this.SaveDays = new Long(source.SaveDays);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CreateVulFixTaskQuuids.", this.CreateVulFixTaskQuuids);
        this.setParamSimple(map, prefix + "SaveDays", this.SaveDays);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);

    }
}

