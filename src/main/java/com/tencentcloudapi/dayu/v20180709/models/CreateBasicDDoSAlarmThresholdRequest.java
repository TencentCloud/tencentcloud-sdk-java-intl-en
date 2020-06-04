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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBasicDDoSAlarmThresholdRequest extends AbstractModel{

    /**
    * Anti-DDoS service type (`basic`: Anti-DDoS Basic)
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * `get`: read alarm threshold, `set`: set alarm threshold
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Alarm threshold type. 1: inbound traffic, 2: cleansed traffic. This field is required if `Method` is `set`;
    */
    @SerializedName("AlarmType")
    @Expose
    private Long AlarmType;

    /**
    * Alarm threshold. It is required if `Method` is `set`. If it is set to 0, it means to clear the alarm threshold configuration;
    */
    @SerializedName("AlarmThreshold")
    @Expose
    private Long AlarmThreshold;

    /**
     * Get Anti-DDoS service type (`basic`: Anti-DDoS Basic) 
     * @return Business Anti-DDoS service type (`basic`: Anti-DDoS Basic)
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type (`basic`: Anti-DDoS Basic)
     * @param Business Anti-DDoS service type (`basic`: Anti-DDoS Basic)
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get `get`: read alarm threshold, `set`: set alarm threshold 
     * @return Method `get`: read alarm threshold, `set`: set alarm threshold
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set `get`: read alarm threshold, `set`: set alarm threshold
     * @param Method `get`: read alarm threshold, `set`: set alarm threshold
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Alarm threshold type. 1: inbound traffic, 2: cleansed traffic. This field is required if `Method` is `set`; 
     * @return AlarmType Alarm threshold type. 1: inbound traffic, 2: cleansed traffic. This field is required if `Method` is `set`;
     */
    public Long getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set Alarm threshold type. 1: inbound traffic, 2: cleansed traffic. This field is required if `Method` is `set`;
     * @param AlarmType Alarm threshold type. 1: inbound traffic, 2: cleansed traffic. This field is required if `Method` is `set`;
     */
    public void setAlarmType(Long AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get Alarm threshold. It is required if `Method` is `set`. If it is set to 0, it means to clear the alarm threshold configuration; 
     * @return AlarmThreshold Alarm threshold. It is required if `Method` is `set`. If it is set to 0, it means to clear the alarm threshold configuration;
     */
    public Long getAlarmThreshold() {
        return this.AlarmThreshold;
    }

    /**
     * Set Alarm threshold. It is required if `Method` is `set`. If it is set to 0, it means to clear the alarm threshold configuration;
     * @param AlarmThreshold Alarm threshold. It is required if `Method` is `set`. If it is set to 0, it means to clear the alarm threshold configuration;
     */
    public void setAlarmThreshold(Long AlarmThreshold) {
        this.AlarmThreshold = AlarmThreshold;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "AlarmThreshold", this.AlarmThreshold);

    }
}

