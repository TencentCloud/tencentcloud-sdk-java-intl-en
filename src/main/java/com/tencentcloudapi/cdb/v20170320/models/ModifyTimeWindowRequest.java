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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTimeWindowRequest extends AbstractModel {

    /**
    * Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The modified maintenance time slot. Among them, each time period is in the format of 10:00-12:00. The start and end time is aligned by half hour. The shortest is half hour and the longest is three hours. Up to two time periods can be set. The start and end time ranges from [00:00, 24:00].
Description: The following is an example of setting two time periods in json.
[
    "01:00-01:30",
    "02:00-02:30"
  ]
    */
    @SerializedName("TimeRanges")
    @Expose
    private String [] TimeRanges;

    /**
    * Specify which day to modify the maintenance time slot. Possible values are: monday, tuesday, wednesday, thursday, friday, saturday, sunday. If not specified or empty, modify all seven days of the week by default.
Description: The json example for modifying more than one day is as follows.
[
    "monday",
    "tuesday"
  ]
    */
    @SerializedName("Weekdays")
    @Expose
    private String [] Weekdays;

    /**
    * Data latency threshold (seconds), only applicable to primary instance and disaster recovery instance. No modification by default to keep the original threshold. Value ranges from 1 to 10 integers.
    */
    @SerializedName("MaxDelayTime")
    @Expose
    private Long MaxDelayTime;

    /**
     * Get Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The modified maintenance time slot. Among them, each time period is in the format of 10:00-12:00. The start and end time is aligned by half hour. The shortest is half hour and the longest is three hours. Up to two time periods can be set. The start and end time ranges from [00:00, 24:00].
Description: The following is an example of setting two time periods in json.
[
    "01:00-01:30",
    "02:00-02:30"
  ] 
     * @return TimeRanges The modified maintenance time slot. Among them, each time period is in the format of 10:00-12:00. The start and end time is aligned by half hour. The shortest is half hour and the longest is three hours. Up to two time periods can be set. The start and end time ranges from [00:00, 24:00].
Description: The following is an example of setting two time periods in json.
[
    "01:00-01:30",
    "02:00-02:30"
  ]
     */
    public String [] getTimeRanges() {
        return this.TimeRanges;
    }

    /**
     * Set The modified maintenance time slot. Among them, each time period is in the format of 10:00-12:00. The start and end time is aligned by half hour. The shortest is half hour and the longest is three hours. Up to two time periods can be set. The start and end time ranges from [00:00, 24:00].
Description: The following is an example of setting two time periods in json.
[
    "01:00-01:30",
    "02:00-02:30"
  ]
     * @param TimeRanges The modified maintenance time slot. Among them, each time period is in the format of 10:00-12:00. The start and end time is aligned by half hour. The shortest is half hour and the longest is three hours. Up to two time periods can be set. The start and end time ranges from [00:00, 24:00].
Description: The following is an example of setting two time periods in json.
[
    "01:00-01:30",
    "02:00-02:30"
  ]
     */
    public void setTimeRanges(String [] TimeRanges) {
        this.TimeRanges = TimeRanges;
    }

    /**
     * Get Specify which day to modify the maintenance time slot. Possible values are: monday, tuesday, wednesday, thursday, friday, saturday, sunday. If not specified or empty, modify all seven days of the week by default.
Description: The json example for modifying more than one day is as follows.
[
    "monday",
    "tuesday"
  ] 
     * @return Weekdays Specify which day to modify the maintenance time slot. Possible values are: monday, tuesday, wednesday, thursday, friday, saturday, sunday. If not specified or empty, modify all seven days of the week by default.
Description: The json example for modifying more than one day is as follows.
[
    "monday",
    "tuesday"
  ]
     */
    public String [] getWeekdays() {
        return this.Weekdays;
    }

    /**
     * Set Specify which day to modify the maintenance time slot. Possible values are: monday, tuesday, wednesday, thursday, friday, saturday, sunday. If not specified or empty, modify all seven days of the week by default.
Description: The json example for modifying more than one day is as follows.
[
    "monday",
    "tuesday"
  ]
     * @param Weekdays Specify which day to modify the maintenance time slot. Possible values are: monday, tuesday, wednesday, thursday, friday, saturday, sunday. If not specified or empty, modify all seven days of the week by default.
Description: The json example for modifying more than one day is as follows.
[
    "monday",
    "tuesday"
  ]
     */
    public void setWeekdays(String [] Weekdays) {
        this.Weekdays = Weekdays;
    }

    /**
     * Get Data latency threshold (seconds), only applicable to primary instance and disaster recovery instance. No modification by default to keep the original threshold. Value ranges from 1 to 10 integers. 
     * @return MaxDelayTime Data latency threshold (seconds), only applicable to primary instance and disaster recovery instance. No modification by default to keep the original threshold. Value ranges from 1 to 10 integers.
     */
    public Long getMaxDelayTime() {
        return this.MaxDelayTime;
    }

    /**
     * Set Data latency threshold (seconds), only applicable to primary instance and disaster recovery instance. No modification by default to keep the original threshold. Value ranges from 1 to 10 integers.
     * @param MaxDelayTime Data latency threshold (seconds), only applicable to primary instance and disaster recovery instance. No modification by default to keep the original threshold. Value ranges from 1 to 10 integers.
     */
    public void setMaxDelayTime(Long MaxDelayTime) {
        this.MaxDelayTime = MaxDelayTime;
    }

    public ModifyTimeWindowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTimeWindowRequest(ModifyTimeWindowRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TimeRanges != null) {
            this.TimeRanges = new String[source.TimeRanges.length];
            for (int i = 0; i < source.TimeRanges.length; i++) {
                this.TimeRanges[i] = new String(source.TimeRanges[i]);
            }
        }
        if (source.Weekdays != null) {
            this.Weekdays = new String[source.Weekdays.length];
            for (int i = 0; i < source.Weekdays.length; i++) {
                this.Weekdays[i] = new String(source.Weekdays[i]);
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
        this.setParamArraySimple(map, prefix + "TimeRanges.", this.TimeRanges);
        this.setParamArraySimple(map, prefix + "Weekdays.", this.Weekdays);
        this.setParamSimple(map, prefix + "MaxDelayTime", this.MaxDelayTime);

    }
}

