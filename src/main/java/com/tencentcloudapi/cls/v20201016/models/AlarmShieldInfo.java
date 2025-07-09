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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmShieldInfo extends AbstractModel {

    /**
    * Notification Channel Group ID
    */
    @SerializedName("AlarmNoticeId")
    @Expose
    private String AlarmNoticeId;

    /**
    * Shield Rule ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Block start time (second-level timestamp).
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Block end time (second-level timestamp).
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Block type. 1: Block all notifications, 2: Block matching rules notifications according to the Rule parameter.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Rule for shielding, mandatory when Type is 2. See Product Documentation (https://intl.cloud.tencent.com/document/product/614/103178?from_cn_redirect=1#rule) for rule writing details.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * Blocking reason.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Rule Creation Source.
1. Console; 2. API; 3. Alarm notification
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * Operator.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Rule Status.
0: Not yet effective; 1: In effect; 2: Expired
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Rule Creation Time.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Rule Update Time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Notification Channel Group ID 
     * @return AlarmNoticeId Notification Channel Group ID
     */
    public String getAlarmNoticeId() {
        return this.AlarmNoticeId;
    }

    /**
     * Set Notification Channel Group ID
     * @param AlarmNoticeId Notification Channel Group ID
     */
    public void setAlarmNoticeId(String AlarmNoticeId) {
        this.AlarmNoticeId = AlarmNoticeId;
    }

    /**
     * Get Shield Rule ID 
     * @return TaskId Shield Rule ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Shield Rule ID
     * @param TaskId Shield Rule ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Block start time (second-level timestamp). 
     * @return StartTime Block start time (second-level timestamp).
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Block start time (second-level timestamp).
     * @param StartTime Block start time (second-level timestamp).
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Block end time (second-level timestamp). 
     * @return EndTime Block end time (second-level timestamp).
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Block end time (second-level timestamp).
     * @param EndTime Block end time (second-level timestamp).
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Block type. 1: Block all notifications, 2: Block matching rules notifications according to the Rule parameter. 
     * @return Type Block type. 1: Block all notifications, 2: Block matching rules notifications according to the Rule parameter.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Block type. 1: Block all notifications, 2: Block matching rules notifications according to the Rule parameter.
     * @param Type Block type. 1: Block all notifications, 2: Block matching rules notifications according to the Rule parameter.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Rule for shielding, mandatory when Type is 2. See Product Documentation (https://intl.cloud.tencent.com/document/product/614/103178?from_cn_redirect=1#rule) for rule writing details.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Rule Rule for shielding, mandatory when Type is 2. See Product Documentation (https://intl.cloud.tencent.com/document/product/614/103178?from_cn_redirect=1#rule) for rule writing details.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set Rule for shielding, mandatory when Type is 2. See Product Documentation (https://intl.cloud.tencent.com/document/product/614/103178?from_cn_redirect=1#rule) for rule writing details.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Rule Rule for shielding, mandatory when Type is 2. See Product Documentation (https://intl.cloud.tencent.com/document/product/614/103178?from_cn_redirect=1#rule) for rule writing details.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get Blocking reason. 
     * @return Reason Blocking reason.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Blocking reason.
     * @param Reason Blocking reason.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Rule Creation Source.
1. Console; 2. API; 3. Alarm notification 
     * @return Source Rule Creation Source.
1. Console; 2. API; 3. Alarm notification
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set Rule Creation Source.
1. Console; 2. API; 3. Alarm notification
     * @param Source Rule Creation Source.
1. Console; 2. API; 3. Alarm notification
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get Operator. 
     * @return Operator Operator.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator.
     * @param Operator Operator.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Rule Status.
0: Not yet effective; 1: In effect; 2: Expired 
     * @return Status Rule Status.
0: Not yet effective; 1: In effect; 2: Expired
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Rule Status.
0: Not yet effective; 1: In effect; 2: Expired
     * @param Status Rule Status.
0: Not yet effective; 1: In effect; 2: Expired
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Rule Creation Time. 
     * @return CreateTime Rule Creation Time.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Rule Creation Time.
     * @param CreateTime Rule Creation Time.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Rule Update Time. 
     * @return UpdateTime Rule Update Time.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Rule Update Time.
     * @param UpdateTime Rule Update Time.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AlarmShieldInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmShieldInfo(AlarmShieldInfo source) {
        if (source.AlarmNoticeId != null) {
            this.AlarmNoticeId = new String(source.AlarmNoticeId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmNoticeId", this.AlarmNoticeId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

