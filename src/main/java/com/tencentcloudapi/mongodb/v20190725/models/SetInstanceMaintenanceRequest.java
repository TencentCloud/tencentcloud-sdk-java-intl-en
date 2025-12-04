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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetInstanceMaintenanceRequest extends AbstractModel {

    /**
    * Specifies the instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time of the maintenance window. The value range is any hour or half-hour between 00:00 and 23:00, such as 00:00 or 00:30.
    */
    @SerializedName("MaintenanceStart")
    @Expose
    private String MaintenanceStart;

    /**
    * End time of the maintenance window.
- The value range is any hour or half-hour between 00:00 and 23:00. The minimum value of maintenance time is 30 minutes, and the maximum value is 3 hours.
- The end time should be later than the start time.
    */
    @SerializedName("MaintenanceEnd")
    @Expose
    private String MaintenanceEnd;

    /**
     * Get Specifies the instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
 
     * @return InstanceId Specifies the instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Specifies the instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.

     * @param InstanceId Specifies the instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time of the maintenance window. The value range is any hour or half-hour between 00:00 and 23:00, such as 00:00 or 00:30. 
     * @return MaintenanceStart Start time of the maintenance window. The value range is any hour or half-hour between 00:00 and 23:00, such as 00:00 or 00:30.
     */
    public String getMaintenanceStart() {
        return this.MaintenanceStart;
    }

    /**
     * Set Start time of the maintenance window. The value range is any hour or half-hour between 00:00 and 23:00, such as 00:00 or 00:30.
     * @param MaintenanceStart Start time of the maintenance window. The value range is any hour or half-hour between 00:00 and 23:00, such as 00:00 or 00:30.
     */
    public void setMaintenanceStart(String MaintenanceStart) {
        this.MaintenanceStart = MaintenanceStart;
    }

    /**
     * Get End time of the maintenance window.
- The value range is any hour or half-hour between 00:00 and 23:00. The minimum value of maintenance time is 30 minutes, and the maximum value is 3 hours.
- The end time should be later than the start time. 
     * @return MaintenanceEnd End time of the maintenance window.
- The value range is any hour or half-hour between 00:00 and 23:00. The minimum value of maintenance time is 30 minutes, and the maximum value is 3 hours.
- The end time should be later than the start time.
     */
    public String getMaintenanceEnd() {
        return this.MaintenanceEnd;
    }

    /**
     * Set End time of the maintenance window.
- The value range is any hour or half-hour between 00:00 and 23:00. The minimum value of maintenance time is 30 minutes, and the maximum value is 3 hours.
- The end time should be later than the start time.
     * @param MaintenanceEnd End time of the maintenance window.
- The value range is any hour or half-hour between 00:00 and 23:00. The minimum value of maintenance time is 30 minutes, and the maximum value is 3 hours.
- The end time should be later than the start time.
     */
    public void setMaintenanceEnd(String MaintenanceEnd) {
        this.MaintenanceEnd = MaintenanceEnd;
    }

    public SetInstanceMaintenanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetInstanceMaintenanceRequest(SetInstanceMaintenanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MaintenanceStart != null) {
            this.MaintenanceStart = new String(source.MaintenanceStart);
        }
        if (source.MaintenanceEnd != null) {
            this.MaintenanceEnd = new String(source.MaintenanceEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MaintenanceStart", this.MaintenanceStart);
        this.setParamSimple(map, prefix + "MaintenanceEnd", this.MaintenanceEnd);

    }
}

