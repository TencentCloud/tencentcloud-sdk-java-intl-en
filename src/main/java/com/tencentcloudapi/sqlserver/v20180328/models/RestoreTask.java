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

public class RestoreTask extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TargetInstanceId")
    @Expose
    private String TargetInstanceId;

    /**
    * 
    */
    @SerializedName("TargetInstanceName")
    @Expose
    private String TargetInstanceName;

    /**
    * 
    */
    @SerializedName("TargetInstanceStatus")
    @Expose
    private Long TargetInstanceStatus;

    /**
    * 
    */
    @SerializedName("TargetRegion")
    @Expose
    private String TargetRegion;

    /**
    * 
    */
    @SerializedName("RestoreId")
    @Expose
    private Long RestoreId;

    /**
    * 
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * 
    */
    @SerializedName("RestoreType")
    @Expose
    private Long RestoreType;

    /**
    * 
    */
    @SerializedName("RestoreTime")
    @Expose
    private String RestoreTime;

    /**
    * 
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
     * Get  
     * @return TargetInstanceId 
     */
    public String getTargetInstanceId() {
        return this.TargetInstanceId;
    }

    /**
     * Set 
     * @param TargetInstanceId 
     */
    public void setTargetInstanceId(String TargetInstanceId) {
        this.TargetInstanceId = TargetInstanceId;
    }

    /**
     * Get  
     * @return TargetInstanceName 
     */
    public String getTargetInstanceName() {
        return this.TargetInstanceName;
    }

    /**
     * Set 
     * @param TargetInstanceName 
     */
    public void setTargetInstanceName(String TargetInstanceName) {
        this.TargetInstanceName = TargetInstanceName;
    }

    /**
     * Get  
     * @return TargetInstanceStatus 
     */
    public Long getTargetInstanceStatus() {
        return this.TargetInstanceStatus;
    }

    /**
     * Set 
     * @param TargetInstanceStatus 
     */
    public void setTargetInstanceStatus(Long TargetInstanceStatus) {
        this.TargetInstanceStatus = TargetInstanceStatus;
    }

    /**
     * Get  
     * @return TargetRegion 
     */
    public String getTargetRegion() {
        return this.TargetRegion;
    }

    /**
     * Set 
     * @param TargetRegion 
     */
    public void setTargetRegion(String TargetRegion) {
        this.TargetRegion = TargetRegion;
    }

    /**
     * Get  
     * @return RestoreId 
     */
    public Long getRestoreId() {
        return this.RestoreId;
    }

    /**
     * Set 
     * @param RestoreId 
     */
    public void setRestoreId(Long RestoreId) {
        this.RestoreId = RestoreId;
    }

    /**
     * Get  
     * @return TargetType 
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 
     * @param TargetType 
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get  
     * @return RestoreType 
     */
    public Long getRestoreType() {
        return this.RestoreType;
    }

    /**
     * Set 
     * @param RestoreType 
     */
    public void setRestoreType(Long RestoreType) {
        this.RestoreType = RestoreType;
    }

    /**
     * Get  
     * @return RestoreTime 
     */
    public String getRestoreTime() {
        return this.RestoreTime;
    }

    /**
     * Set 
     * @param RestoreTime 
     */
    public void setRestoreTime(String RestoreTime) {
        this.RestoreTime = RestoreTime;
    }

    /**
     * Get  
     * @return StartTime 
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 
     * @param StartTime 
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get  
     * @return EndTime 
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 
     * @param EndTime 
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get  
     * @return Status 
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return FlowId 
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 
     * @param FlowId 
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    public RestoreTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreTask(RestoreTask source) {
        if (source.TargetInstanceId != null) {
            this.TargetInstanceId = new String(source.TargetInstanceId);
        }
        if (source.TargetInstanceName != null) {
            this.TargetInstanceName = new String(source.TargetInstanceName);
        }
        if (source.TargetInstanceStatus != null) {
            this.TargetInstanceStatus = new Long(source.TargetInstanceStatus);
        }
        if (source.TargetRegion != null) {
            this.TargetRegion = new String(source.TargetRegion);
        }
        if (source.RestoreId != null) {
            this.RestoreId = new Long(source.RestoreId);
        }
        if (source.TargetType != null) {
            this.TargetType = new Long(source.TargetType);
        }
        if (source.RestoreType != null) {
            this.RestoreType = new Long(source.RestoreType);
        }
        if (source.RestoreTime != null) {
            this.RestoreTime = new String(source.RestoreTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetInstanceId", this.TargetInstanceId);
        this.setParamSimple(map, prefix + "TargetInstanceName", this.TargetInstanceName);
        this.setParamSimple(map, prefix + "TargetInstanceStatus", this.TargetInstanceStatus);
        this.setParamSimple(map, prefix + "TargetRegion", this.TargetRegion);
        this.setParamSimple(map, prefix + "RestoreId", this.RestoreId);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "RestoreType", this.RestoreType);
        this.setParamSimple(map, prefix + "RestoreTime", this.RestoreTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);

    }
}

