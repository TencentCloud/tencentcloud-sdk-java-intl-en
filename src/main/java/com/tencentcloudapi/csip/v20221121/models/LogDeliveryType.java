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

public class LogDeliveryType extends AbstractModel {

    /**
    * Log shipping type.
    */
    @SerializedName("LogType")
    @Expose
    private Long LogType;

    /**
    * Name of the shipped log type.
    */
    @SerializedName("LogTypeName")
    @Expose
    private String LogTypeName;

    /**
    * Description of the shipped log type.
    */
    @SerializedName("LogTypeDesc")
    @Expose
    private String LogTypeDesc;

    /**
     * Get Log shipping type. 
     * @return LogType Log shipping type.
     */
    public Long getLogType() {
        return this.LogType;
    }

    /**
     * Set Log shipping type.
     * @param LogType Log shipping type.
     */
    public void setLogType(Long LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Name of the shipped log type. 
     * @return LogTypeName Name of the shipped log type.
     */
    public String getLogTypeName() {
        return this.LogTypeName;
    }

    /**
     * Set Name of the shipped log type.
     * @param LogTypeName Name of the shipped log type.
     */
    public void setLogTypeName(String LogTypeName) {
        this.LogTypeName = LogTypeName;
    }

    /**
     * Get Description of the shipped log type. 
     * @return LogTypeDesc Description of the shipped log type.
     */
    public String getLogTypeDesc() {
        return this.LogTypeDesc;
    }

    /**
     * Set Description of the shipped log type.
     * @param LogTypeDesc Description of the shipped log type.
     */
    public void setLogTypeDesc(String LogTypeDesc) {
        this.LogTypeDesc = LogTypeDesc;
    }

    public LogDeliveryType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogDeliveryType(LogDeliveryType source) {
        if (source.LogType != null) {
            this.LogType = new Long(source.LogType);
        }
        if (source.LogTypeName != null) {
            this.LogTypeName = new String(source.LogTypeName);
        }
        if (source.LogTypeDesc != null) {
            this.LogTypeDesc = new String(source.LogTypeDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "LogTypeName", this.LogTypeName);
        this.setParamSimple(map, prefix + "LogTypeDesc", this.LogTypeDesc);

    }
}

