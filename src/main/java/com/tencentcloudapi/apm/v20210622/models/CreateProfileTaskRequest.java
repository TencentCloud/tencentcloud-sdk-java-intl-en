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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProfileTaskRequest extends AbstractModel {

    /**
    * Application name
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * APM business system ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Application instance (online).
    */
    @SerializedName("ServiceInstance")
    @Expose
    private String ServiceInstance;

    /**
    * Event type (cpu, alloc).
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * Specifies the task duration in milliseconds (ms). value range: 5 to 180 seconds.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Number of execution. value range: 1-100.
    */
    @SerializedName("AllTimes")
    @Expose
    private Long AllTimes;

    /**
    * Start timestamp. 0 indicates start from the current time (unit: seconds).
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Specifies the task execution interval in milliseconds (ms). value range: 10 to 600 seconds. cannot be less than 1.5 times the Duration.
    */
    @SerializedName("TaskInterval")
    @Expose
    private Long TaskInterval;

    /**
     * Get Application name 
     * @return ServiceName Application name
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Application name
     * @param ServiceName Application name
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get APM business system ID. 
     * @return InstanceId APM business system ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set APM business system ID.
     * @param InstanceId APM business system ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Application instance (online). 
     * @return ServiceInstance Application instance (online).
     */
    public String getServiceInstance() {
        return this.ServiceInstance;
    }

    /**
     * Set Application instance (online).
     * @param ServiceInstance Application instance (online).
     */
    public void setServiceInstance(String ServiceInstance) {
        this.ServiceInstance = ServiceInstance;
    }

    /**
     * Get Event type (cpu, alloc). 
     * @return Event Event type (cpu, alloc).
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set Event type (cpu, alloc).
     * @param Event Event type (cpu, alloc).
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get Specifies the task duration in milliseconds (ms). value range: 5 to 180 seconds. 
     * @return Duration Specifies the task duration in milliseconds (ms). value range: 5 to 180 seconds.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Specifies the task duration in milliseconds (ms). value range: 5 to 180 seconds.
     * @param Duration Specifies the task duration in milliseconds (ms). value range: 5 to 180 seconds.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Number of execution. value range: 1-100. 
     * @return AllTimes Number of execution. value range: 1-100.
     */
    public Long getAllTimes() {
        return this.AllTimes;
    }

    /**
     * Set Number of execution. value range: 1-100.
     * @param AllTimes Number of execution. value range: 1-100.
     */
    public void setAllTimes(Long AllTimes) {
        this.AllTimes = AllTimes;
    }

    /**
     * Get Start timestamp. 0 indicates start from the current time (unit: seconds). 
     * @return StartTime Start timestamp. 0 indicates start from the current time (unit: seconds).
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp. 0 indicates start from the current time (unit: seconds).
     * @param StartTime Start timestamp. 0 indicates start from the current time (unit: seconds).
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Specifies the task execution interval in milliseconds (ms). value range: 10 to 600 seconds. cannot be less than 1.5 times the Duration. 
     * @return TaskInterval Specifies the task execution interval in milliseconds (ms). value range: 10 to 600 seconds. cannot be less than 1.5 times the Duration.
     */
    public Long getTaskInterval() {
        return this.TaskInterval;
    }

    /**
     * Set Specifies the task execution interval in milliseconds (ms). value range: 10 to 600 seconds. cannot be less than 1.5 times the Duration.
     * @param TaskInterval Specifies the task execution interval in milliseconds (ms). value range: 10 to 600 seconds. cannot be less than 1.5 times the Duration.
     */
    public void setTaskInterval(Long TaskInterval) {
        this.TaskInterval = TaskInterval;
    }

    public CreateProfileTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProfileTaskRequest(CreateProfileTaskRequest source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ServiceInstance != null) {
            this.ServiceInstance = new String(source.ServiceInstance);
        }
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.AllTimes != null) {
            this.AllTimes = new Long(source.AllTimes);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.TaskInterval != null) {
            this.TaskInterval = new Long(source.TaskInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ServiceInstance", this.ServiceInstance);
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "AllTimes", this.AllTimes);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TaskInterval", this.TaskInterval);

    }
}

