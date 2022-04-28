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
    * Maintenance window on Monday. The format should be 10:00-12:00. You can set multiple time windows on a day. Each time window lasts from half an hour to three hours, and must start and end on the hour or half hour. At least one time window is required in a week. The same rule applies to the following parameters.
    */
    @SerializedName("Monday")
    @Expose
    private String [] Monday;

    /**
    * Maintenance window on Tuesday. At least one time window is required in a week.
    */
    @SerializedName("Tuesday")
    @Expose
    private String [] Tuesday;

    /**
    * Maintenance window on Wednesday. At least one time window is required in a week.
    */
    @SerializedName("Wednesday")
    @Expose
    private String [] Wednesday;

    /**
    * Maintenance window on Thursday. At least one time window is required in a week.
    */
    @SerializedName("Thursday")
    @Expose
    private String [] Thursday;

    /**
    * Maintenance window on Friday. At least one time window is required in a week.
    */
    @SerializedName("Friday")
    @Expose
    private String [] Friday;

    /**
    * Maintenance window on Saturday. At least one time window is required in a week.
    */
    @SerializedName("Saturday")
    @Expose
    private String [] Saturday;

    /**
    * Maintenance window on Sunday. At least one time window is required in a week.
    */
    @SerializedName("Sunday")
    @Expose
    private String [] Sunday;

    /**
    * Maximum delay threshold, which takes effect only for source instances and disaster recovery instances.
    */
    @SerializedName("MaxDelayTime")
    @Expose
    private Long MaxDelayTime;

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
     * Get Maintenance window on Monday. The format should be 10:00-12:00. You can set multiple time windows on a day. Each time window lasts from half an hour to three hours, and must start and end on the hour or half hour. At least one time window is required in a week. The same rule applies to the following parameters. 
     * @return Monday Maintenance window on Monday. The format should be 10:00-12:00. You can set multiple time windows on a day. Each time window lasts from half an hour to three hours, and must start and end on the hour or half hour. At least one time window is required in a week. The same rule applies to the following parameters.
     */
    public String [] getMonday() {
        return this.Monday;
    }

    /**
     * Set Maintenance window on Monday. The format should be 10:00-12:00. You can set multiple time windows on a day. Each time window lasts from half an hour to three hours, and must start and end on the hour or half hour. At least one time window is required in a week. The same rule applies to the following parameters.
     * @param Monday Maintenance window on Monday. The format should be 10:00-12:00. You can set multiple time windows on a day. Each time window lasts from half an hour to three hours, and must start and end on the hour or half hour. At least one time window is required in a week. The same rule applies to the following parameters.
     */
    public void setMonday(String [] Monday) {
        this.Monday = Monday;
    }

    /**
     * Get Maintenance window on Tuesday. At least one time window is required in a week. 
     * @return Tuesday Maintenance window on Tuesday. At least one time window is required in a week.
     */
    public String [] getTuesday() {
        return this.Tuesday;
    }

    /**
     * Set Maintenance window on Tuesday. At least one time window is required in a week.
     * @param Tuesday Maintenance window on Tuesday. At least one time window is required in a week.
     */
    public void setTuesday(String [] Tuesday) {
        this.Tuesday = Tuesday;
    }

    /**
     * Get Maintenance window on Wednesday. At least one time window is required in a week. 
     * @return Wednesday Maintenance window on Wednesday. At least one time window is required in a week.
     */
    public String [] getWednesday() {
        return this.Wednesday;
    }

    /**
     * Set Maintenance window on Wednesday. At least one time window is required in a week.
     * @param Wednesday Maintenance window on Wednesday. At least one time window is required in a week.
     */
    public void setWednesday(String [] Wednesday) {
        this.Wednesday = Wednesday;
    }

    /**
     * Get Maintenance window on Thursday. At least one time window is required in a week. 
     * @return Thursday Maintenance window on Thursday. At least one time window is required in a week.
     */
    public String [] getThursday() {
        return this.Thursday;
    }

    /**
     * Set Maintenance window on Thursday. At least one time window is required in a week.
     * @param Thursday Maintenance window on Thursday. At least one time window is required in a week.
     */
    public void setThursday(String [] Thursday) {
        this.Thursday = Thursday;
    }

    /**
     * Get Maintenance window on Friday. At least one time window is required in a week. 
     * @return Friday Maintenance window on Friday. At least one time window is required in a week.
     */
    public String [] getFriday() {
        return this.Friday;
    }

    /**
     * Set Maintenance window on Friday. At least one time window is required in a week.
     * @param Friday Maintenance window on Friday. At least one time window is required in a week.
     */
    public void setFriday(String [] Friday) {
        this.Friday = Friday;
    }

    /**
     * Get Maintenance window on Saturday. At least one time window is required in a week. 
     * @return Saturday Maintenance window on Saturday. At least one time window is required in a week.
     */
    public String [] getSaturday() {
        return this.Saturday;
    }

    /**
     * Set Maintenance window on Saturday. At least one time window is required in a week.
     * @param Saturday Maintenance window on Saturday. At least one time window is required in a week.
     */
    public void setSaturday(String [] Saturday) {
        this.Saturday = Saturday;
    }

    /**
     * Get Maintenance window on Sunday. At least one time window is required in a week. 
     * @return Sunday Maintenance window on Sunday. At least one time window is required in a week.
     */
    public String [] getSunday() {
        return this.Sunday;
    }

    /**
     * Set Maintenance window on Sunday. At least one time window is required in a week.
     * @param Sunday Maintenance window on Sunday. At least one time window is required in a week.
     */
    public void setSunday(String [] Sunday) {
        this.Sunday = Sunday;
    }

    /**
     * Get Maximum delay threshold, which takes effect only for source instances and disaster recovery instances. 
     * @return MaxDelayTime Maximum delay threshold, which takes effect only for source instances and disaster recovery instances.
     */
    public Long getMaxDelayTime() {
        return this.MaxDelayTime;
    }

    /**
     * Set Maximum delay threshold, which takes effect only for source instances and disaster recovery instances.
     * @param MaxDelayTime Maximum delay threshold, which takes effect only for source instances and disaster recovery instances.
     */
    public void setMaxDelayTime(Long MaxDelayTime) {
        this.MaxDelayTime = MaxDelayTime;
    }

    public AddTimeWindowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddTimeWindowRequest(AddTimeWindowRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Monday != null) {
            this.Monday = new String[source.Monday.length];
            for (int i = 0; i < source.Monday.length; i++) {
                this.Monday[i] = new String(source.Monday[i]);
            }
        }
        if (source.Tuesday != null) {
            this.Tuesday = new String[source.Tuesday.length];
            for (int i = 0; i < source.Tuesday.length; i++) {
                this.Tuesday[i] = new String(source.Tuesday[i]);
            }
        }
        if (source.Wednesday != null) {
            this.Wednesday = new String[source.Wednesday.length];
            for (int i = 0; i < source.Wednesday.length; i++) {
                this.Wednesday[i] = new String(source.Wednesday[i]);
            }
        }
        if (source.Thursday != null) {
            this.Thursday = new String[source.Thursday.length];
            for (int i = 0; i < source.Thursday.length; i++) {
                this.Thursday[i] = new String(source.Thursday[i]);
            }
        }
        if (source.Friday != null) {
            this.Friday = new String[source.Friday.length];
            for (int i = 0; i < source.Friday.length; i++) {
                this.Friday[i] = new String(source.Friday[i]);
            }
        }
        if (source.Saturday != null) {
            this.Saturday = new String[source.Saturday.length];
            for (int i = 0; i < source.Saturday.length; i++) {
                this.Saturday[i] = new String(source.Saturday[i]);
            }
        }
        if (source.Sunday != null) {
            this.Sunday = new String[source.Sunday.length];
            for (int i = 0; i < source.Sunday.length; i++) {
                this.Sunday[i] = new String(source.Sunday[i]);
            }
        }
        if (source.MaxDelayTime != null) {
            this.MaxDelayTime = new Long(source.MaxDelayTime);
        }
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
        this.setParamSimple(map, prefix + "MaxDelayTime", this.MaxDelayTime);

    }
}

