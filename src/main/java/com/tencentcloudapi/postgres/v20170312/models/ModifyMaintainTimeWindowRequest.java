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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMaintainTimeWindowRequest extends AbstractModel {

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Maintenance start time. time zone is UTC+8.
    */
    @SerializedName("MaintainStartTime")
    @Expose
    private String MaintainStartTime;

    /**
    * Maintenance duration. unit: hr. value range: [1,4].
    */
    @SerializedName("MaintainDuration")
    @Expose
    private Long MaintainDuration;

    /**
    * Specifies the maintenance period.
    */
    @SerializedName("MaintainWeekDays")
    @Expose
    private String [] MaintainWeekDays;

    /**
     * Get Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en). 
     * @return DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     * @param DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Maintenance start time. time zone is UTC+8. 
     * @return MaintainStartTime Maintenance start time. time zone is UTC+8.
     */
    public String getMaintainStartTime() {
        return this.MaintainStartTime;
    }

    /**
     * Set Maintenance start time. time zone is UTC+8.
     * @param MaintainStartTime Maintenance start time. time zone is UTC+8.
     */
    public void setMaintainStartTime(String MaintainStartTime) {
        this.MaintainStartTime = MaintainStartTime;
    }

    /**
     * Get Maintenance duration. unit: hr. value range: [1,4]. 
     * @return MaintainDuration Maintenance duration. unit: hr. value range: [1,4].
     */
    public Long getMaintainDuration() {
        return this.MaintainDuration;
    }

    /**
     * Set Maintenance duration. unit: hr. value range: [1,4].
     * @param MaintainDuration Maintenance duration. unit: hr. value range: [1,4].
     */
    public void setMaintainDuration(Long MaintainDuration) {
        this.MaintainDuration = MaintainDuration;
    }

    /**
     * Get Specifies the maintenance period. 
     * @return MaintainWeekDays Specifies the maintenance period.
     */
    public String [] getMaintainWeekDays() {
        return this.MaintainWeekDays;
    }

    /**
     * Set Specifies the maintenance period.
     * @param MaintainWeekDays Specifies the maintenance period.
     */
    public void setMaintainWeekDays(String [] MaintainWeekDays) {
        this.MaintainWeekDays = MaintainWeekDays;
    }

    public ModifyMaintainTimeWindowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMaintainTimeWindowRequest(ModifyMaintainTimeWindowRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.MaintainStartTime != null) {
            this.MaintainStartTime = new String(source.MaintainStartTime);
        }
        if (source.MaintainDuration != null) {
            this.MaintainDuration = new Long(source.MaintainDuration);
        }
        if (source.MaintainWeekDays != null) {
            this.MaintainWeekDays = new String[source.MaintainWeekDays.length];
            for (int i = 0; i < source.MaintainWeekDays.length; i++) {
                this.MaintainWeekDays[i] = new String(source.MaintainWeekDays[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "MaintainStartTime", this.MaintainStartTime);
        this.setParamSimple(map, prefix + "MaintainDuration", this.MaintainDuration);
        this.setParamArraySimple(map, prefix + "MaintainWeekDays.", this.MaintainWeekDays);

    }
}

