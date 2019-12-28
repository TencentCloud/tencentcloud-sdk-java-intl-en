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

public class ModifyAutoBackupConfigRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Date. Value range: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    */
    @SerializedName("WeekDays")
    @Expose
    private String [] WeekDays;

    /**
    * Time period. Value range: 00:00-01:00, 01:00-02:00...... 23:00-00:00
    */
    @SerializedName("TimePeriod")
    @Expose
    private String TimePeriod;

    /**
    * Auto backup type: 1 "scheduled rollback"
    */
    @SerializedName("AutoBackupType")
    @Expose
    private Long AutoBackupType;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Date. Value range: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday 
     * @return WeekDays Date. Value range: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
     */
    public String [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set Date. Value range: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
     * @param WeekDays Date. Value range: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
     */
    public void setWeekDays(String [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * Get Time period. Value range: 00:00-01:00, 01:00-02:00...... 23:00-00:00 
     * @return TimePeriod Time period. Value range: 00:00-01:00, 01:00-02:00...... 23:00-00:00
     */
    public String getTimePeriod() {
        return this.TimePeriod;
    }

    /**
     * Set Time period. Value range: 00:00-01:00, 01:00-02:00...... 23:00-00:00
     * @param TimePeriod Time period. Value range: 00:00-01:00, 01:00-02:00...... 23:00-00:00
     */
    public void setTimePeriod(String TimePeriod) {
        this.TimePeriod = TimePeriod;
    }

    /**
     * Get Auto backup type: 1 "scheduled rollback" 
     * @return AutoBackupType Auto backup type: 1 "scheduled rollback"
     */
    public Long getAutoBackupType() {
        return this.AutoBackupType;
    }

    /**
     * Set Auto backup type: 1 "scheduled rollback"
     * @param AutoBackupType Auto backup type: 1 "scheduled rollback"
     */
    public void setAutoBackupType(Long AutoBackupType) {
        this.AutoBackupType = AutoBackupType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);
        this.setParamSimple(map, prefix + "TimePeriod", this.TimePeriod);
        this.setParamSimple(map, prefix + "AutoBackupType", this.AutoBackupType);

    }
}

