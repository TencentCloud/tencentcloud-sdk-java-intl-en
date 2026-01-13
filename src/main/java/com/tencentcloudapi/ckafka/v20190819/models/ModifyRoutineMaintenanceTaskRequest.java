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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRoutineMaintenanceTaskRequest extends AbstractModel {

    /**
    * Specifies the ckafka cluster instance id. can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Automated operation and maintenance category. valid values: QUOTA, ANALYSIS, RE_BALANCE, ELASTIC_BANDWIDTH.
    */
    @SerializedName("MaintenanceType")
    @Expose
    private String MaintenanceType;

    /**
    * INSTANCE_STORAGE_CAPACITY (automatic disk scale-out)/MESSAGE_RETENTION_PERIOD (dynamic MESSAGE RETENTION policy).
    */
    @SerializedName("MaintenanceSubtype")
    @Expose
    private String MaintenanceSubtype;

    /**
    * Topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Task trigger threshold.
    */
    @SerializedName("ConfigureThreshold")
    @Expose
    private Long ConfigureThreshold;

    /**
    * Specifies the step length for task adjustment.
    */
    @SerializedName("ConfigureStepSize")
    @Expose
    private Long ConfigureStepSize;

    /**
    * Task adjustment upper limit.
    */
    @SerializedName("ConfigureLimit")
    @Expose
    private Long ConfigureLimit;

    /**
    * Specifies the expected trigger time of the task, storing the offset in seconds from 0 AM of the current day.
    */
    @SerializedName("PlannedTime")
    @Expose
    private Long PlannedTime;

    /**
    * Additional task information.
    */
    @SerializedName("ExtraConfig")
    @Expose
    private String ExtraConfig;

    /**
    * Task status. 0: enabled, 1: disabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Specifies the day of the week.
    */
    @SerializedName("Week")
    @Expose
    private String Week;

    /**
     * Get Specifies the ckafka cluster instance id. can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api. 
     * @return InstanceId Specifies the ckafka cluster instance id. can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Specifies the ckafka cluster instance id. can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     * @param InstanceId Specifies the ckafka cluster instance id. can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Automated operation and maintenance category. valid values: QUOTA, ANALYSIS, RE_BALANCE, ELASTIC_BANDWIDTH. 
     * @return MaintenanceType Automated operation and maintenance category. valid values: QUOTA, ANALYSIS, RE_BALANCE, ELASTIC_BANDWIDTH.
     */
    public String getMaintenanceType() {
        return this.MaintenanceType;
    }

    /**
     * Set Automated operation and maintenance category. valid values: QUOTA, ANALYSIS, RE_BALANCE, ELASTIC_BANDWIDTH.
     * @param MaintenanceType Automated operation and maintenance category. valid values: QUOTA, ANALYSIS, RE_BALANCE, ELASTIC_BANDWIDTH.
     */
    public void setMaintenanceType(String MaintenanceType) {
        this.MaintenanceType = MaintenanceType;
    }

    /**
     * Get INSTANCE_STORAGE_CAPACITY (automatic disk scale-out)/MESSAGE_RETENTION_PERIOD (dynamic MESSAGE RETENTION policy). 
     * @return MaintenanceSubtype INSTANCE_STORAGE_CAPACITY (automatic disk scale-out)/MESSAGE_RETENTION_PERIOD (dynamic MESSAGE RETENTION policy).
     */
    public String getMaintenanceSubtype() {
        return this.MaintenanceSubtype;
    }

    /**
     * Set INSTANCE_STORAGE_CAPACITY (automatic disk scale-out)/MESSAGE_RETENTION_PERIOD (dynamic MESSAGE RETENTION policy).
     * @param MaintenanceSubtype INSTANCE_STORAGE_CAPACITY (automatic disk scale-out)/MESSAGE_RETENTION_PERIOD (dynamic MESSAGE RETENTION policy).
     */
    public void setMaintenanceSubtype(String MaintenanceSubtype) {
        this.MaintenanceSubtype = MaintenanceSubtype;
    }

    /**
     * Get Topic name 
     * @return TopicName Topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name
     * @param TopicName Topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Task trigger threshold. 
     * @return ConfigureThreshold Task trigger threshold.
     */
    public Long getConfigureThreshold() {
        return this.ConfigureThreshold;
    }

    /**
     * Set Task trigger threshold.
     * @param ConfigureThreshold Task trigger threshold.
     */
    public void setConfigureThreshold(Long ConfigureThreshold) {
        this.ConfigureThreshold = ConfigureThreshold;
    }

    /**
     * Get Specifies the step length for task adjustment. 
     * @return ConfigureStepSize Specifies the step length for task adjustment.
     */
    public Long getConfigureStepSize() {
        return this.ConfigureStepSize;
    }

    /**
     * Set Specifies the step length for task adjustment.
     * @param ConfigureStepSize Specifies the step length for task adjustment.
     */
    public void setConfigureStepSize(Long ConfigureStepSize) {
        this.ConfigureStepSize = ConfigureStepSize;
    }

    /**
     * Get Task adjustment upper limit. 
     * @return ConfigureLimit Task adjustment upper limit.
     */
    public Long getConfigureLimit() {
        return this.ConfigureLimit;
    }

    /**
     * Set Task adjustment upper limit.
     * @param ConfigureLimit Task adjustment upper limit.
     */
    public void setConfigureLimit(Long ConfigureLimit) {
        this.ConfigureLimit = ConfigureLimit;
    }

    /**
     * Get Specifies the expected trigger time of the task, storing the offset in seconds from 0 AM of the current day. 
     * @return PlannedTime Specifies the expected trigger time of the task, storing the offset in seconds from 0 AM of the current day.
     */
    public Long getPlannedTime() {
        return this.PlannedTime;
    }

    /**
     * Set Specifies the expected trigger time of the task, storing the offset in seconds from 0 AM of the current day.
     * @param PlannedTime Specifies the expected trigger time of the task, storing the offset in seconds from 0 AM of the current day.
     */
    public void setPlannedTime(Long PlannedTime) {
        this.PlannedTime = PlannedTime;
    }

    /**
     * Get Additional task information. 
     * @return ExtraConfig Additional task information.
     */
    public String getExtraConfig() {
        return this.ExtraConfig;
    }

    /**
     * Set Additional task information.
     * @param ExtraConfig Additional task information.
     */
    public void setExtraConfig(String ExtraConfig) {
        this.ExtraConfig = ExtraConfig;
    }

    /**
     * Get Task status. 0: enabled, 1: disabled. 
     * @return Status Task status. 0: enabled, 1: disabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. 0: enabled, 1: disabled.
     * @param Status Task status. 0: enabled, 1: disabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Specifies the day of the week. 
     * @return Week Specifies the day of the week.
     */
    public String getWeek() {
        return this.Week;
    }

    /**
     * Set Specifies the day of the week.
     * @param Week Specifies the day of the week.
     */
    public void setWeek(String Week) {
        this.Week = Week;
    }

    public ModifyRoutineMaintenanceTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoutineMaintenanceTaskRequest(ModifyRoutineMaintenanceTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MaintenanceType != null) {
            this.MaintenanceType = new String(source.MaintenanceType);
        }
        if (source.MaintenanceSubtype != null) {
            this.MaintenanceSubtype = new String(source.MaintenanceSubtype);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.ConfigureThreshold != null) {
            this.ConfigureThreshold = new Long(source.ConfigureThreshold);
        }
        if (source.ConfigureStepSize != null) {
            this.ConfigureStepSize = new Long(source.ConfigureStepSize);
        }
        if (source.ConfigureLimit != null) {
            this.ConfigureLimit = new Long(source.ConfigureLimit);
        }
        if (source.PlannedTime != null) {
            this.PlannedTime = new Long(source.PlannedTime);
        }
        if (source.ExtraConfig != null) {
            this.ExtraConfig = new String(source.ExtraConfig);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Week != null) {
            this.Week = new String(source.Week);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MaintenanceType", this.MaintenanceType);
        this.setParamSimple(map, prefix + "MaintenanceSubtype", this.MaintenanceSubtype);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "ConfigureThreshold", this.ConfigureThreshold);
        this.setParamSimple(map, prefix + "ConfigureStepSize", this.ConfigureStepSize);
        this.setParamSimple(map, prefix + "ConfigureLimit", this.ConfigureLimit);
        this.setParamSimple(map, prefix + "PlannedTime", this.PlannedTime);
        this.setParamSimple(map, prefix + "ExtraConfig", this.ExtraConfig);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Week", this.Week);

    }
}

