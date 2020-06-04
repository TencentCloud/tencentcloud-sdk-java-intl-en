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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelPipelineAlerts extends AbstractModel{

    /**
    * Alarm start time in UTC time.
    */
    @SerializedName("SetTime")
    @Expose
    private String SetTime;

    /**
    * Alarm end time in UTC time.
This time is available only after the alarm ends.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClearTime")
    @Expose
    private String ClearTime;

    /**
    * Alarm type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Alarm details.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Alarm start time in UTC time. 
     * @return SetTime Alarm start time in UTC time.
     */
    public String getSetTime() {
        return this.SetTime;
    }

    /**
     * Set Alarm start time in UTC time.
     * @param SetTime Alarm start time in UTC time.
     */
    public void setSetTime(String SetTime) {
        this.SetTime = SetTime;
    }

    /**
     * Get Alarm end time in UTC time.
This time is available only after the alarm ends.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClearTime Alarm end time in UTC time.
This time is available only after the alarm ends.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClearTime() {
        return this.ClearTime;
    }

    /**
     * Set Alarm end time in UTC time.
This time is available only after the alarm ends.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClearTime Alarm end time in UTC time.
This time is available only after the alarm ends.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClearTime(String ClearTime) {
        this.ClearTime = ClearTime;
    }

    /**
     * Get Alarm type. 
     * @return Type Alarm type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Alarm type.
     * @param Type Alarm type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Alarm details. 
     * @return Message Alarm details.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Alarm details.
     * @param Message Alarm details.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SetTime", this.SetTime);
        this.setParamSimple(map, prefix + "ClearTime", this.ClearTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

