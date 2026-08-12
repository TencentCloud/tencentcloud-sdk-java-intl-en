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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVulFixTaskRequest extends AbstractModel {

    /**
    * <p>Repair item list, each item specifies a vulnerability/KB patch and its hosts requiring fixing<br>Input parameter limit: No more than 100 items, total number of instances not more than 5000</p>
    */
    @SerializedName("FixItems")
    @Expose
    private VulFixItem [] FixItems;

    /**
    * <p>Maximum repair time<br>Measurement unit: second<br>Default value: 3600</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>Whether to create a disk snapshot before repair<br>Default value: false</p>
    */
    @SerializedName("CreateSnapshot")
    @Expose
    private Boolean CreateSnapshot;

    /**
    * <p>Snapshot name. Valid when CreateSnapshot is true.<br>Input parameter limit: Up to 128 characters.</p>
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * <p>Snapshot retention days. Valid when CreateSnapshot is true.</p>
    */
    @SerializedName("SaveDays")
    @Expose
    private Long SaveDays;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Repair item list, each item specifies a vulnerability/KB patch and its hosts requiring fixing<br>Input parameter limit: No more than 100 items, total number of instances not more than 5000</p> 
     * @return FixItems <p>Repair item list, each item specifies a vulnerability/KB patch and its hosts requiring fixing<br>Input parameter limit: No more than 100 items, total number of instances not more than 5000</p>
     */
    public VulFixItem [] getFixItems() {
        return this.FixItems;
    }

    /**
     * Set <p>Repair item list, each item specifies a vulnerability/KB patch and its hosts requiring fixing<br>Input parameter limit: No more than 100 items, total number of instances not more than 5000</p>
     * @param FixItems <p>Repair item list, each item specifies a vulnerability/KB patch and its hosts requiring fixing<br>Input parameter limit: No more than 100 items, total number of instances not more than 5000</p>
     */
    public void setFixItems(VulFixItem [] FixItems) {
        this.FixItems = FixItems;
    }

    /**
     * Get <p>Maximum repair time<br>Measurement unit: second<br>Default value: 3600</p> 
     * @return Timeout <p>Maximum repair time<br>Measurement unit: second<br>Default value: 3600</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>Maximum repair time<br>Measurement unit: second<br>Default value: 3600</p>
     * @param Timeout <p>Maximum repair time<br>Measurement unit: second<br>Default value: 3600</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>Whether to create a disk snapshot before repair<br>Default value: false</p> 
     * @return CreateSnapshot <p>Whether to create a disk snapshot before repair<br>Default value: false</p>
     */
    public Boolean getCreateSnapshot() {
        return this.CreateSnapshot;
    }

    /**
     * Set <p>Whether to create a disk snapshot before repair<br>Default value: false</p>
     * @param CreateSnapshot <p>Whether to create a disk snapshot before repair<br>Default value: false</p>
     */
    public void setCreateSnapshot(Boolean CreateSnapshot) {
        this.CreateSnapshot = CreateSnapshot;
    }

    /**
     * Get <p>Snapshot name. Valid when CreateSnapshot is true.<br>Input parameter limit: Up to 128 characters.</p> 
     * @return SnapshotName <p>Snapshot name. Valid when CreateSnapshot is true.<br>Input parameter limit: Up to 128 characters.</p>
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set <p>Snapshot name. Valid when CreateSnapshot is true.<br>Input parameter limit: Up to 128 characters.</p>
     * @param SnapshotName <p>Snapshot name. Valid when CreateSnapshot is true.<br>Input parameter limit: Up to 128 characters.</p>
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get <p>Snapshot retention days. Valid when CreateSnapshot is true.</p> 
     * @return SaveDays <p>Snapshot retention days. Valid when CreateSnapshot is true.</p>
     */
    public Long getSaveDays() {
        return this.SaveDays;
    }

    /**
     * Set <p>Snapshot retention days. Valid when CreateSnapshot is true.</p>
     * @param SaveDays <p>Snapshot retention days. Valid when CreateSnapshot is true.</p>
     */
    public void setSaveDays(Long SaveDays) {
        this.SaveDays = SaveDays;
    }

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public CreateVulFixTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulFixTaskRequest(CreateVulFixTaskRequest source) {
        if (source.FixItems != null) {
            this.FixItems = new VulFixItem[source.FixItems.length];
            for (int i = 0; i < source.FixItems.length; i++) {
                this.FixItems[i] = new VulFixItem(source.FixItems[i]);
            }
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.CreateSnapshot != null) {
            this.CreateSnapshot = new Boolean(source.CreateSnapshot);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.SaveDays != null) {
            this.SaveDays = new Long(source.SaveDays);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FixItems.", this.FixItems);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "CreateSnapshot", this.CreateSnapshot);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "SaveDays", this.SaveDays);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

