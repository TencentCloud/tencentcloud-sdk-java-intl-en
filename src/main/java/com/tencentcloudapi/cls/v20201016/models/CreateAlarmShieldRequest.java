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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlarmShieldRequest extends AbstractModel {

    /**
    * Notification Channel Group ID
    */
    @SerializedName("AlarmNoticeId")
    @Expose
    private String AlarmNoticeId;

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
    * Blocking reason.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Blocking rules, required when Type is 2. For detailed information on filling in rules, see [Product Documentation](https://intl.cloud.tencent.com/document/product/614/103178?from_cn_redirect=1#rule).
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

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
     * Get Blocking rules, required when Type is 2. For detailed information on filling in rules, see [Product Documentation](https://intl.cloud.tencent.com/document/product/614/103178?from_cn_redirect=1#rule). 
     * @return Rule Blocking rules, required when Type is 2. For detailed information on filling in rules, see [Product Documentation](https://intl.cloud.tencent.com/document/product/614/103178?from_cn_redirect=1#rule).
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set Blocking rules, required when Type is 2. For detailed information on filling in rules, see [Product Documentation](https://intl.cloud.tencent.com/document/product/614/103178?from_cn_redirect=1#rule).
     * @param Rule Blocking rules, required when Type is 2. For detailed information on filling in rules, see [Product Documentation](https://intl.cloud.tencent.com/document/product/614/103178?from_cn_redirect=1#rule).
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    public CreateAlarmShieldRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlarmShieldRequest(CreateAlarmShieldRequest source) {
        if (source.AlarmNoticeId != null) {
            this.AlarmNoticeId = new String(source.AlarmNoticeId);
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
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmNoticeId", this.AlarmNoticeId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Rule", this.Rule);

    }
}

