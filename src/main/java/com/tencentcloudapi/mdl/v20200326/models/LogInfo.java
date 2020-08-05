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

public class LogInfo extends AbstractModel{

    /**
    * Log type.
It contains the value of `StreamStart` which refers to the push information.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Time when the log is printed.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Log details.
    */
    @SerializedName("Message")
    @Expose
    private LogMessageInfo Message;

    /**
     * Get Log type.
It contains the value of `StreamStart` which refers to the push information. 
     * @return Type Log type.
It contains the value of `StreamStart` which refers to the push information.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Log type.
It contains the value of `StreamStart` which refers to the push information.
     * @param Type Log type.
It contains the value of `StreamStart` which refers to the push information.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Time when the log is printed. 
     * @return Time Time when the log is printed.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Time when the log is printed.
     * @param Time Time when the log is printed.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Log details. 
     * @return Message Log details.
     */
    public LogMessageInfo getMessage() {
        return this.Message;
    }

    /**
     * Set Log details.
     * @param Message Log details.
     */
    public void setMessage(LogMessageInfo Message) {
        this.Message = Message;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamObj(map, prefix + "Message.", this.Message);

    }
}

