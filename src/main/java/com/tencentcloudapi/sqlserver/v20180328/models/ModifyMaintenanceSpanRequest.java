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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMaintenanceSpanRequest extends AbstractModel {

    /**
    * Instance ID, in the format of mssql-k8voqdlz.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the days in each week allowed for maintenance. For example, [1,2,3,4,5,6,7] indicates that all days from Monday to Sunday are allowed for maintenance. If this parameter is left unspecified, this value is not modified.
    */
    @SerializedName("Weekly")
    @Expose
    private Long [] Weekly;

    /**
    * Maintenance start time each day. For example, 10:24 indicates that the maintenance window starts at 10:24. If this parameter is left unspecified, this value is not modified.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Maintenance duration each day, in hours. For example, 1 indicates that the duration is 1 hour after maintenance starts. If this parameter is left unspecified, this value is not modified.
    */
    @SerializedName("Span")
    @Expose
    private Long Span;

    /**
     * Get Instance ID, in the format of mssql-k8voqdlz. 
     * @return InstanceId Instance ID, in the format of mssql-k8voqdlz.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format of mssql-k8voqdlz.
     * @param InstanceId Instance ID, in the format of mssql-k8voqdlz.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the days in each week allowed for maintenance. For example, [1,2,3,4,5,6,7] indicates that all days from Monday to Sunday are allowed for maintenance. If this parameter is left unspecified, this value is not modified. 
     * @return Weekly Specifies the days in each week allowed for maintenance. For example, [1,2,3,4,5,6,7] indicates that all days from Monday to Sunday are allowed for maintenance. If this parameter is left unspecified, this value is not modified.
     */
    public Long [] getWeekly() {
        return this.Weekly;
    }

    /**
     * Set Specifies the days in each week allowed for maintenance. For example, [1,2,3,4,5,6,7] indicates that all days from Monday to Sunday are allowed for maintenance. If this parameter is left unspecified, this value is not modified.
     * @param Weekly Specifies the days in each week allowed for maintenance. For example, [1,2,3,4,5,6,7] indicates that all days from Monday to Sunday are allowed for maintenance. If this parameter is left unspecified, this value is not modified.
     */
    public void setWeekly(Long [] Weekly) {
        this.Weekly = Weekly;
    }

    /**
     * Get Maintenance start time each day. For example, 10:24 indicates that the maintenance window starts at 10:24. If this parameter is left unspecified, this value is not modified. 
     * @return StartTime Maintenance start time each day. For example, 10:24 indicates that the maintenance window starts at 10:24. If this parameter is left unspecified, this value is not modified.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Maintenance start time each day. For example, 10:24 indicates that the maintenance window starts at 10:24. If this parameter is left unspecified, this value is not modified.
     * @param StartTime Maintenance start time each day. For example, 10:24 indicates that the maintenance window starts at 10:24. If this parameter is left unspecified, this value is not modified.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Maintenance duration each day, in hours. For example, 1 indicates that the duration is 1 hour after maintenance starts. If this parameter is left unspecified, this value is not modified. 
     * @return Span Maintenance duration each day, in hours. For example, 1 indicates that the duration is 1 hour after maintenance starts. If this parameter is left unspecified, this value is not modified.
     */
    public Long getSpan() {
        return this.Span;
    }

    /**
     * Set Maintenance duration each day, in hours. For example, 1 indicates that the duration is 1 hour after maintenance starts. If this parameter is left unspecified, this value is not modified.
     * @param Span Maintenance duration each day, in hours. For example, 1 indicates that the duration is 1 hour after maintenance starts. If this parameter is left unspecified, this value is not modified.
     */
    public void setSpan(Long Span) {
        this.Span = Span;
    }

    public ModifyMaintenanceSpanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMaintenanceSpanRequest(ModifyMaintenanceSpanRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Weekly != null) {
            this.Weekly = new Long[source.Weekly.length];
            for (int i = 0; i < source.Weekly.length; i++) {
                this.Weekly[i] = new Long(source.Weekly[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Span != null) {
            this.Span = new Long(source.Span);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "Weekly.", this.Weekly);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Span", this.Span);

    }
}

