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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAutoBackupConfigResponse extends AbstractModel{

    /**
    * Backup type. Auto backup type: 1 "scheduled rollback"
    */
    @SerializedName("AutoBackupType")
    @Expose
    private Long AutoBackupType;

    /**
    * Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
    */
    @SerializedName("WeekDays")
    @Expose
    private String [] WeekDays;

    /**
    * Time period.
    */
    @SerializedName("TimePeriod")
    @Expose
    private String TimePeriod;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Backup type. Auto backup type: 1 "scheduled rollback" 
     * @return AutoBackupType Backup type. Auto backup type: 1 "scheduled rollback"
     */
    public Long getAutoBackupType() {
        return this.AutoBackupType;
    }

    /**
     * Set Backup type. Auto backup type: 1 "scheduled rollback"
     * @param AutoBackupType Backup type. Auto backup type: 1 "scheduled rollback"
     */
    public void setAutoBackupType(Long AutoBackupType) {
        this.AutoBackupType = AutoBackupType;
    }

    /**
     * Get Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday. 
     * @return WeekDays Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
     */
    public String [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
     * @param WeekDays Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
     */
    public void setWeekDays(String [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * Get Time period. 
     * @return TimePeriod Time period.
     */
    public String getTimePeriod() {
        return this.TimePeriod;
    }

    /**
     * Set Time period.
     * @param TimePeriod Time period.
     */
    public void setTimePeriod(String TimePeriod) {
        this.TimePeriod = TimePeriod;
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

    public DescribeAutoBackupConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoBackupConfigResponse(DescribeAutoBackupConfigResponse source) {
        if (source.AutoBackupType != null) {
            this.AutoBackupType = new Long(source.AutoBackupType);
        }
        if (source.WeekDays != null) {
            this.WeekDays = new String[source.WeekDays.length];
            for (int i = 0; i < source.WeekDays.length; i++) {
                this.WeekDays[i] = new String(source.WeekDays[i]);
            }
        }
        if (source.TimePeriod != null) {
            this.TimePeriod = new String(source.TimePeriod);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoBackupType", this.AutoBackupType);
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);
        this.setParamSimple(map, prefix + "TimePeriod", this.TimePeriod);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

