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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel {

    /**
    * The task ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * The application ID.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * The network ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * The service ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
    * `0`: Under deployment; `1`: Deployed successfully; other values: Deployment failed.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The error code.
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * The error message.
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * The creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The last updated time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get The task ID. 
     * @return Id The task ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set The task ID.
     * @param Id The task ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get The application ID. 
     * @return AppId The application ID.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set The application ID.
     * @param AppId The application ID.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get The network ID. 
     * @return ClusterId The network ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The network ID.
     * @param ClusterId The network ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The group ID. 
     * @return GroupId The group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The group ID.
     * @param GroupId The group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get The service ID. 
     * @return ServiceId The service ID.
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set The service ID.
     * @param ServiceId The service ID.
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get `0`: Under deployment; `1`: Deployed successfully; other values: Deployment failed. 
     * @return Status `0`: Under deployment; `1`: Deployed successfully; other values: Deployment failed.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set `0`: Under deployment; `1`: Deployed successfully; other values: Deployment failed.
     * @param Status `0`: Under deployment; `1`: Deployed successfully; other values: Deployment failed.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The error code. 
     * @return ErrorCode The error code.
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set The error code.
     * @param ErrorCode The error code.
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get The error message. 
     * @return ErrorMsg The error message.
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set The error message.
     * @param ErrorMsg The error message.
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get The creation time. 
     * @return CreateTime The creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
     * @param CreateTime The creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The last updated time. 
     * @return UpdateTime The last updated time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The last updated time.
     * @param UpdateTime The last updated time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

