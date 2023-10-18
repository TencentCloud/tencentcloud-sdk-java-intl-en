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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendTaskData extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Sender address
    */
    @SerializedName("FromEmailAddress")
    @Expose
    private String FromEmailAddress;

    /**
    * Recipient group ID
    */
    @SerializedName("ReceiverId")
    @Expose
    private Long ReceiverId;

    /**
    * Task status. `1`: to start; `5`: sending; `6`: sending suspended today; `7`: sending error; `10`: sent
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * Task type. `1`: immediate; `2`: scheduled; `3`: recurring
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Number of emails requested to be sent
    */
    @SerializedName("RequestCount")
    @Expose
    private Long RequestCount;

    /**
    * Number of emails sent
    */
    @SerializedName("SendCount")
    @Expose
    private Long SendCount;

    /**
    * Number of emails cached
    */
    @SerializedName("CacheCount")
    @Expose
    private Long CacheCount;

    /**
    * Task creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Email subject
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * Template and template data
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * Parameters of a recurring task
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("CycleParam")
    @Expose
    private CycleEmailParam CycleParam;

    /**
    * Parameters of a scheduled task
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("TimedParam")
    @Expose
    private TimedEmailParam TimedParam;

    /**
    * Task exception information
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * Recipient group name
    */
    @SerializedName("ReceiversName")
    @Expose
    private String ReceiversName;

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Sender address 
     * @return FromEmailAddress Sender address
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set Sender address
     * @param FromEmailAddress Sender address
     */
    public void setFromEmailAddress(String FromEmailAddress) {
        this.FromEmailAddress = FromEmailAddress;
    }

    /**
     * Get Recipient group ID 
     * @return ReceiverId Recipient group ID
     */
    public Long getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set Recipient group ID
     * @param ReceiverId Recipient group ID
     */
    public void setReceiverId(Long ReceiverId) {
        this.ReceiverId = ReceiverId;
    }

    /**
     * Get Task status. `1`: to start; `5`: sending; `6`: sending suspended today; `7`: sending error; `10`: sent 
     * @return TaskStatus Task status. `1`: to start; `5`: sending; `6`: sending suspended today; `7`: sending error; `10`: sent
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status. `1`: to start; `5`: sending; `6`: sending suspended today; `7`: sending error; `10`: sent
     * @param TaskStatus Task status. `1`: to start; `5`: sending; `6`: sending suspended today; `7`: sending error; `10`: sent
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Task type. `1`: immediate; `2`: scheduled; `3`: recurring 
     * @return TaskType Task type. `1`: immediate; `2`: scheduled; `3`: recurring
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type. `1`: immediate; `2`: scheduled; `3`: recurring
     * @param TaskType Task type. `1`: immediate; `2`: scheduled; `3`: recurring
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Number of emails requested to be sent 
     * @return RequestCount Number of emails requested to be sent
     */
    public Long getRequestCount() {
        return this.RequestCount;
    }

    /**
     * Set Number of emails requested to be sent
     * @param RequestCount Number of emails requested to be sent
     */
    public void setRequestCount(Long RequestCount) {
        this.RequestCount = RequestCount;
    }

    /**
     * Get Number of emails sent 
     * @return SendCount Number of emails sent
     */
    public Long getSendCount() {
        return this.SendCount;
    }

    /**
     * Set Number of emails sent
     * @param SendCount Number of emails sent
     */
    public void setSendCount(Long SendCount) {
        this.SendCount = SendCount;
    }

    /**
     * Get Number of emails cached 
     * @return CacheCount Number of emails cached
     */
    public Long getCacheCount() {
        return this.CacheCount;
    }

    /**
     * Set Number of emails cached
     * @param CacheCount Number of emails cached
     */
    public void setCacheCount(Long CacheCount) {
        this.CacheCount = CacheCount;
    }

    /**
     * Get Task creation time 
     * @return CreateTime Task creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time
     * @param CreateTime Task creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task update time 
     * @return UpdateTime Task update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Task update time
     * @param UpdateTime Task update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Email subject 
     * @return Subject Email subject
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set Email subject
     * @param Subject Email subject
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get Template and template data
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return Template Template and template data
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set Template and template data
Note: This field may return `null`, indicating that no valid value can be found.
     * @param Template Template and template data
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get Parameters of a recurring task
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return CycleParam Parameters of a recurring task
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public CycleEmailParam getCycleParam() {
        return this.CycleParam;
    }

    /**
     * Set Parameters of a recurring task
Note: This field may return `null`, indicating that no valid value can be found.
     * @param CycleParam Parameters of a recurring task
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setCycleParam(CycleEmailParam CycleParam) {
        this.CycleParam = CycleParam;
    }

    /**
     * Get Parameters of a scheduled task
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return TimedParam Parameters of a scheduled task
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public TimedEmailParam getTimedParam() {
        return this.TimedParam;
    }

    /**
     * Set Parameters of a scheduled task
Note: This field may return `null`, indicating that no valid value can be found.
     * @param TimedParam Parameters of a scheduled task
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setTimedParam(TimedEmailParam TimedParam) {
        this.TimedParam = TimedParam;
    }

    /**
     * Get Task exception information
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return ErrMsg Task exception information
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set Task exception information
Note: This field may return `null`, indicating that no valid value can be found.
     * @param ErrMsg Task exception information
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get Recipient group name 
     * @return ReceiversName Recipient group name
     */
    public String getReceiversName() {
        return this.ReceiversName;
    }

    /**
     * Set Recipient group name
     * @param ReceiversName Recipient group name
     */
    public void setReceiversName(String ReceiversName) {
        this.ReceiversName = ReceiversName;
    }

    public SendTaskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendTaskData(SendTaskData source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.FromEmailAddress != null) {
            this.FromEmailAddress = new String(source.FromEmailAddress);
        }
        if (source.ReceiverId != null) {
            this.ReceiverId = new Long(source.ReceiverId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.RequestCount != null) {
            this.RequestCount = new Long(source.RequestCount);
        }
        if (source.SendCount != null) {
            this.SendCount = new Long(source.SendCount);
        }
        if (source.CacheCount != null) {
            this.CacheCount = new Long(source.CacheCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.Template != null) {
            this.Template = new Template(source.Template);
        }
        if (source.CycleParam != null) {
            this.CycleParam = new CycleEmailParam(source.CycleParam);
        }
        if (source.TimedParam != null) {
            this.TimedParam = new TimedEmailParam(source.TimedParam);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.ReceiversName != null) {
            this.ReceiversName = new String(source.ReceiversName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "FromEmailAddress", this.FromEmailAddress);
        this.setParamSimple(map, prefix + "ReceiverId", this.ReceiverId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "RequestCount", this.RequestCount);
        this.setParamSimple(map, prefix + "SendCount", this.SendCount);
        this.setParamSimple(map, prefix + "CacheCount", this.CacheCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamObj(map, prefix + "Template.", this.Template);
        this.setParamObj(map, prefix + "CycleParam.", this.CycleParam);
        this.setParamObj(map, prefix + "TimedParam.", this.TimedParam);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "ReceiversName", this.ReceiversName);

    }
}

