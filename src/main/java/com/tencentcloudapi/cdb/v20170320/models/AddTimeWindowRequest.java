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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddTimeWindowRequest extends AbstractModel{

    /**
    * Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Time period available for maintenance on Monday in the format of 10:00-12:00. Each period lasts from half an hour to three hours, with the start time and end time aligned by half-hour. Up to two time periods can be set. The same rule applies below.
    */
    @SerializedName("Monday")
    @Expose
    private String [] Monday;

    /**
    * Maintenance time window on Tuesday
    */
    @SerializedName("Tuesday")
    @Expose
    private String [] Tuesday;

    /**
    * Maintenance time window on Wednesday
    */
    @SerializedName("Wednesday")
    @Expose
    private String [] Wednesday;

    /**
    * Maintenance time window on Thursday
    */
    @SerializedName("Thursday")
    @Expose
    private String [] Thursday;

    /**
    * Maintenance time window on Friday
    */
    @SerializedName("Friday")
    @Expose
    private String [] Friday;

    /**
    * Maintenance time window on Saturday
    */
    @SerializedName("Saturday")
    @Expose
    private String [] Saturday;

    /**
    * Maintenance time window on Sunday
    */
    @SerializedName("Sunday")
    @Expose
    private String [] Sunday;

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv or cdbro-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Time period available for maintenance on Monday in the format of 10:00-12:00. Each period lasts from half an hour to three hours, with the start time and end time aligned by half-hour. Up to two time periods can be set. The same rule applies below. 
     * @return Monday Time period available for maintenance on Monday in the format of 10:00-12:00. Each period lasts from half an hour to three hours, with the start time and end time aligned by half-hour. Up to two time periods can be set. The same rule applies below.
     */
    public String [] getMonday() {
        return this.Monday;
    }

    /**
     * Set Time period available for maintenance on Monday in the format of 10:00-12:00. Each period lasts from half an hour to three hours, with the start time and end time aligned by half-hour. Up to two time periods can be set. The same rule applies below.
     * @param Monday Time period available for maintenance on Monday in the format of 10:00-12:00. Each period lasts from half an hour to three hours, with the start time and end time aligned by half-hour. Up to two time periods can be set. The same rule applies below.
     */
    public void setMonday(String [] Monday) {
        this.Monday = Monday;
    }

    /**
     * Get Maintenance time window on Tuesday 
     * @return Tuesday Maintenance time window on Tuesday
     */
    public String [] getTuesday() {
        return this.Tuesday;
    }

    /**
     * Set Maintenance time window on Tuesday
     * @param Tuesday Maintenance time window on Tuesday
     */
    public void setTuesday(String [] Tuesday) {
        this.Tuesday = Tuesday;
    }

    /**
     * Get Maintenance time window on Wednesday 
     * @return Wednesday Maintenance time window on Wednesday
     */
    public String [] getWednesday() {
        return this.Wednesday;
    }

    /**
     * Set Maintenance time window on Wednesday
     * @param Wednesday Maintenance time window on Wednesday
     */
    public void setWednesday(String [] Wednesday) {
        this.Wednesday = Wednesday;
    }

    /**
     * Get Maintenance time window on Thursday 
     * @return Thursday Maintenance time window on Thursday
     */
    public String [] getThursday() {
        return this.Thursday;
    }

    /**
     * Set Maintenance time window on Thursday
     * @param Thursday Maintenance time window on Thursday
     */
    public void setThursday(String [] Thursday) {
        this.Thursday = Thursday;
    }

    /**
     * Get Maintenance time window on Friday 
     * @return Friday Maintenance time window on Friday
     */
    public String [] getFriday() {
        return this.Friday;
    }

    /**
     * Set Maintenance time window on Friday
     * @param Friday Maintenance time window on Friday
     */
    public void setFriday(String [] Friday) {
        this.Friday = Friday;
    }

    /**
     * Get Maintenance time window on Saturday 
     * @return Saturday Maintenance time window on Saturday
     */
    public String [] getSaturday() {
        return this.Saturday;
    }

    /**
     * Set Maintenance time window on Saturday
     * @param Saturday Maintenance time window on Saturday
     */
    public void setSaturday(String [] Saturday) {
        this.Saturday = Saturday;
    }

    /**
     * Get Maintenance time window on Sunday 
     * @return Sunday Maintenance time window on Sunday
     */
    public String [] getSunday() {
        return this.Sunday;
    }

    /**
     * Set Maintenance time window on Sunday
     * @param Sunday Maintenance time window on Sunday
     */
    public void setSunday(String [] Sunday) {
        this.Sunday = Sunday;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "Monday.", this.Monday);
        this.setParamArraySimple(map, prefix + "Tuesday.", this.Tuesday);
        this.setParamArraySimple(map, prefix + "Wednesday.", this.Wednesday);
        this.setParamArraySimple(map, prefix + "Thursday.", this.Thursday);
        this.setParamArraySimple(map, prefix + "Friday.", this.Friday);
        this.setParamArraySimple(map, prefix + "Saturday.", this.Saturday);
        this.setParamArraySimple(map, prefix + "Sunday.", this.Sunday);

    }
}

