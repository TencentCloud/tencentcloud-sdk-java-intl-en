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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UebaCustomRule extends AbstractModel {

    /**
    * Policy name.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 1: Cloud account
2: Custom user
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
    * Occurrence time
10 minutes
2:1 hour
3: One day
4: A week
5: One month
    */
    @SerializedName("TimeInterval")
    @Expose
    private Long TimeInterval;

    /**
    * Event
    */
    @SerializedName("EventContent")
    @Expose
    private UebaEventContent EventContent;

    /**
    * Alarm name
    */
    @SerializedName("AlertName")
    @Expose
    private String AlertName;

    /**
    * Alarm type
Prompt.
1: low
2: Medium risk
3: High risk
4: Critical
    */
    @SerializedName("AlterLevel")
    @Expose
    private Long AlterLevel;

    /**
    * Operator.
    */
    @SerializedName("Operator")
    @Expose
    private String [] Operator;

    /**
    * Operation object.
    */
    @SerializedName("OperateObject")
    @Expose
    private String [] OperateObject;

    /**
    * Operation method
    */
    @SerializedName("OperateMethod")
    @Expose
    private String [] OperateMethod;

    /**
    * Log type
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Chinese name in logs
    */
    @SerializedName("LogTypeStr")
    @Expose
    private String LogTypeStr;

    /**
     * Get Policy name. 
     * @return RuleName Policy name.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Policy name.
     * @param RuleName Policy name.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 1: Cloud account
2: Custom user 
     * @return UserType 1: Cloud account
2: Custom user
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set 1: Cloud account
2: Custom user
     * @param UserType 1: Cloud account
2: Custom user
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    /**
     * Get Occurrence time
10 minutes
2:1 hour
3: One day
4: A week
5: One month 
     * @return TimeInterval Occurrence time
10 minutes
2:1 hour
3: One day
4: A week
5: One month
     */
    public Long getTimeInterval() {
        return this.TimeInterval;
    }

    /**
     * Set Occurrence time
10 minutes
2:1 hour
3: One day
4: A week
5: One month
     * @param TimeInterval Occurrence time
10 minutes
2:1 hour
3: One day
4: A week
5: One month
     */
    public void setTimeInterval(Long TimeInterval) {
        this.TimeInterval = TimeInterval;
    }

    /**
     * Get Event 
     * @return EventContent Event
     */
    public UebaEventContent getEventContent() {
        return this.EventContent;
    }

    /**
     * Set Event
     * @param EventContent Event
     */
    public void setEventContent(UebaEventContent EventContent) {
        this.EventContent = EventContent;
    }

    /**
     * Get Alarm name 
     * @return AlertName Alarm name
     */
    public String getAlertName() {
        return this.AlertName;
    }

    /**
     * Set Alarm name
     * @param AlertName Alarm name
     */
    public void setAlertName(String AlertName) {
        this.AlertName = AlertName;
    }

    /**
     * Get Alarm type
Prompt.
1: low
2: Medium risk
3: High risk
4: Critical 
     * @return AlterLevel Alarm type
Prompt.
1: low
2: Medium risk
3: High risk
4: Critical
     */
    public Long getAlterLevel() {
        return this.AlterLevel;
    }

    /**
     * Set Alarm type
Prompt.
1: low
2: Medium risk
3: High risk
4: Critical
     * @param AlterLevel Alarm type
Prompt.
1: low
2: Medium risk
3: High risk
4: Critical
     */
    public void setAlterLevel(Long AlterLevel) {
        this.AlterLevel = AlterLevel;
    }

    /**
     * Get Operator. 
     * @return Operator Operator.
     */
    public String [] getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator.
     * @param Operator Operator.
     */
    public void setOperator(String [] Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Operation object. 
     * @return OperateObject Operation object.
     */
    public String [] getOperateObject() {
        return this.OperateObject;
    }

    /**
     * Set Operation object.
     * @param OperateObject Operation object.
     */
    public void setOperateObject(String [] OperateObject) {
        this.OperateObject = OperateObject;
    }

    /**
     * Get Operation method 
     * @return OperateMethod Operation method
     */
    public String [] getOperateMethod() {
        return this.OperateMethod;
    }

    /**
     * Set Operation method
     * @param OperateMethod Operation method
     */
    public void setOperateMethod(String [] OperateMethod) {
        this.OperateMethod = OperateMethod;
    }

    /**
     * Get Log type 
     * @return LogType Log type
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type
     * @param LogType Log type
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Chinese name in logs 
     * @return LogTypeStr Chinese name in logs
     */
    public String getLogTypeStr() {
        return this.LogTypeStr;
    }

    /**
     * Set Chinese name in logs
     * @param LogTypeStr Chinese name in logs
     */
    public void setLogTypeStr(String LogTypeStr) {
        this.LogTypeStr = LogTypeStr;
    }

    public UebaCustomRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UebaCustomRule(UebaCustomRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.UserType != null) {
            this.UserType = new Long(source.UserType);
        }
        if (source.TimeInterval != null) {
            this.TimeInterval = new Long(source.TimeInterval);
        }
        if (source.EventContent != null) {
            this.EventContent = new UebaEventContent(source.EventContent);
        }
        if (source.AlertName != null) {
            this.AlertName = new String(source.AlertName);
        }
        if (source.AlterLevel != null) {
            this.AlterLevel = new Long(source.AlterLevel);
        }
        if (source.Operator != null) {
            this.Operator = new String[source.Operator.length];
            for (int i = 0; i < source.Operator.length; i++) {
                this.Operator[i] = new String(source.Operator[i]);
            }
        }
        if (source.OperateObject != null) {
            this.OperateObject = new String[source.OperateObject.length];
            for (int i = 0; i < source.OperateObject.length; i++) {
                this.OperateObject[i] = new String(source.OperateObject[i]);
            }
        }
        if (source.OperateMethod != null) {
            this.OperateMethod = new String[source.OperateMethod.length];
            for (int i = 0; i < source.OperateMethod.length; i++) {
                this.OperateMethod[i] = new String(source.OperateMethod[i]);
            }
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.LogTypeStr != null) {
            this.LogTypeStr = new String(source.LogTypeStr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "TimeInterval", this.TimeInterval);
        this.setParamObj(map, prefix + "EventContent.", this.EventContent);
        this.setParamSimple(map, prefix + "AlertName", this.AlertName);
        this.setParamSimple(map, prefix + "AlterLevel", this.AlterLevel);
        this.setParamArraySimple(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "OperateObject.", this.OperateObject);
        this.setParamArraySimple(map, prefix + "OperateMethod.", this.OperateMethod);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "LogTypeStr", this.LogTypeStr);

    }
}

