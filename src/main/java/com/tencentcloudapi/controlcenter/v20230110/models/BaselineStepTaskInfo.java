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
package com.tencentcloudapi.controlcenter.v20230110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineStepTaskInfo extends AbstractModel {

    /**
    * Specifies the unique Id of the task, which can only contain english letters and digits, and is a 16-character random string.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Specifies the unique identifier for the baseline feature item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * Specifies the member account uin of the applied baseline item.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Baseline item application status. Running means the baseline item is in application. Success means the baseline item application is successful. Failed means the baseline item application failure. Pending means the baseline item is Pending application. Skipped means the baseline item is Skipped.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * Error message
    */
    @SerializedName("ErrMessage")
    @Expose
    private String ErrMessage;

    /**
    * Baseline item deployment output.
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * Creation time, represented in ISO8601 standard format as yyyy-MM-dd hh:MM:ss.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Specifies the last update time in ISO8601 standard representation with format yyyy-MM-dd hh:MM:ss.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Specifies the unique Id of the task, which can only contain english letters and digits, and is a 16-character random string. 
     * @return TaskId Specifies the unique Id of the task, which can only contain english letters and digits, and is a 16-character random string.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Specifies the unique Id of the task, which can only contain english letters and digits, and is a 16-character random string.
     * @param TaskId Specifies the unique Id of the task, which can only contain english letters and digits, and is a 16-character random string.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Specifies the unique identifier for the baseline feature item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters. 
     * @return Identifier Specifies the unique identifier for the baseline feature item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set Specifies the unique identifier for the baseline feature item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
     * @param Identifier Specifies the unique identifier for the baseline feature item, can only contain english letters, digits, and @, ,._[]-:()()[]+=., with a length of 2-128 characters.
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get Specifies the member account uin of the applied baseline item. 
     * @return MemberUin Specifies the member account uin of the applied baseline item.
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set Specifies the member account uin of the applied baseline item.
     * @param MemberUin Specifies the member account uin of the applied baseline item.
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get Baseline item application status. Running means the baseline item is in application. Success means the baseline item application is successful. Failed means the baseline item application failure. Pending means the baseline item is Pending application. Skipped means the baseline item is Skipped. 
     * @return Status Baseline item application status. Running means the baseline item is in application. Success means the baseline item application is successful. Failed means the baseline item application failure. Pending means the baseline item is Pending application. Skipped means the baseline item is Skipped.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Baseline item application status. Running means the baseline item is in application. Success means the baseline item application is successful. Failed means the baseline item application failure. Pending means the baseline item is Pending application. Skipped means the baseline item is Skipped.
     * @param Status Baseline item application status. Running means the baseline item is in application. Success means the baseline item application is successful. Failed means the baseline item application failure. Pending means the baseline item is Pending application. Skipped means the baseline item is Skipped.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code 
     * @return ErrCode Error code
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code
     * @param ErrCode Error code
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error message 
     * @return ErrMessage Error message
     */
    public String getErrMessage() {
        return this.ErrMessage;
    }

    /**
     * Set Error message
     * @param ErrMessage Error message
     */
    public void setErrMessage(String ErrMessage) {
        this.ErrMessage = ErrMessage;
    }

    /**
     * Get Baseline item deployment output. 
     * @return Output Baseline item deployment output.
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set Baseline item deployment output.
     * @param Output Baseline item deployment output.
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get Creation time, represented in ISO8601 standard format as yyyy-MM-dd hh:MM:ss. 
     * @return CreateTime Creation time, represented in ISO8601 standard format as yyyy-MM-dd hh:MM:ss.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time, represented in ISO8601 standard format as yyyy-MM-dd hh:MM:ss.
     * @param CreateTime Creation time, represented in ISO8601 standard format as yyyy-MM-dd hh:MM:ss.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Specifies the last update time in ISO8601 standard representation with format yyyy-MM-dd hh:MM:ss. 
     * @return UpdateTime Specifies the last update time in ISO8601 standard representation with format yyyy-MM-dd hh:MM:ss.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Specifies the last update time in ISO8601 standard representation with format yyyy-MM-dd hh:MM:ss.
     * @param UpdateTime Specifies the last update time in ISO8601 standard representation with format yyyy-MM-dd hh:MM:ss.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public BaselineStepTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineStepTaskInfo(BaselineStepTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ErrMessage != null) {
            this.ErrMessage = new String(source.ErrMessage);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMessage", this.ErrMessage);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

