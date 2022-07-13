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

public class DescribeTaskListRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Maximum number of results returned per page. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which is an integral multiple of `Limit` (rounded down automatically).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Project ID
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * Task type
    */
    @SerializedName("TaskTypes")
    @Expose
    private String [] TaskTypes;

    /**
    * Start time
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task status
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long [] TaskStatus;

    /**
    * Task status
    */
    @SerializedName("Result")
    @Expose
    private Long [] Result;

    /**
    * The field `OperatorUin` has been disused and replaced by `OperateUin`.
    */
    @SerializedName("OperatorUin")
    @Expose
    private Long [] OperatorUin;

    /**
    * Operator Uin
    */
    @SerializedName("OperateUin")
    @Expose
    private String [] OperateUin;

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
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Maximum number of results returned per page. Default value: 20. Maximum value: 100. 
     * @return Limit Maximum number of results returned per page. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of results returned per page. Default value: 20. Maximum value: 100.
     * @param Limit Maximum number of results returned per page. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which is an integral multiple of `Limit` (rounded down automatically). 
     * @return Offset Offset, which is an integral multiple of `Limit` (rounded down automatically).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is an integral multiple of `Limit` (rounded down automatically).
     * @param Offset Offset, which is an integral multiple of `Limit` (rounded down automatically).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Project ID 
     * @return ProjectIds Project ID
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Project ID
     * @param ProjectIds Project ID
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Task type 
     * @return TaskTypes Task type
     */
    public String [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set Task type
     * @param TaskTypes Task type
     */
    public void setTaskTypes(String [] TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    /**
     * Get Start time 
     * @return BeginTime Start time
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time
     * @param BeginTime Start time
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task status 
     * @return TaskStatus Task status
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status
     * @param TaskStatus Task status
     */
    public void setTaskStatus(Long [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Task status 
     * @return Result Task status
     */
    public Long [] getResult() {
        return this.Result;
    }

    /**
     * Set Task status
     * @param Result Task status
     */
    public void setResult(Long [] Result) {
        this.Result = Result;
    }

    /**
     * Get The field `OperatorUin` has been disused and replaced by `OperateUin`. 
     * @return OperatorUin The field `OperatorUin` has been disused and replaced by `OperateUin`.
     */
    public Long [] getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set The field `OperatorUin` has been disused and replaced by `OperateUin`.
     * @param OperatorUin The field `OperatorUin` has been disused and replaced by `OperateUin`.
     */
    public void setOperatorUin(Long [] OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get Operator Uin 
     * @return OperateUin Operator Uin
     */
    public String [] getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set Operator Uin
     * @param OperateUin Operator Uin
     */
    public void setOperateUin(String [] OperateUin) {
        this.OperateUin = OperateUin;
    }

    public DescribeTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskListRequest(DescribeTaskListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.TaskTypes != null) {
            this.TaskTypes = new String[source.TaskTypes.length];
            for (int i = 0; i < source.TaskTypes.length; i++) {
                this.TaskTypes[i] = new String(source.TaskTypes[i]);
            }
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long[source.TaskStatus.length];
            for (int i = 0; i < source.TaskStatus.length; i++) {
                this.TaskStatus[i] = new Long(source.TaskStatus[i]);
            }
        }
        if (source.Result != null) {
            this.Result = new Long[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new Long(source.Result[i]);
            }
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new Long[source.OperatorUin.length];
            for (int i = 0; i < source.OperatorUin.length; i++) {
                this.OperatorUin[i] = new Long(source.OperatorUin[i]);
            }
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String[source.OperateUin.length];
            for (int i = 0; i < source.OperateUin.length; i++) {
                this.OperateUin[i] = new String(source.OperateUin[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "TaskStatus.", this.TaskStatus);
        this.setParamArraySimple(map, prefix + "Result.", this.Result);
        this.setParamArraySimple(map, prefix + "OperatorUin.", this.OperatorUin);
        this.setParamArraySimple(map, prefix + "OperateUin.", this.OperateUin);

    }
}

