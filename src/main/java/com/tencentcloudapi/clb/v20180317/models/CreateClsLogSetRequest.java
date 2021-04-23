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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClsLogSetRequest extends AbstractModel{

    /**
    * Logset retention period in days; max value: 90
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Logset name, which must be unique among all CLS logsets; default value: clb_logset
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * Logset type. Valid values: ACCESS (access logs; default value) and HEALTH (health check logs).
    */
    @SerializedName("LogsetType")
    @Expose
    private String LogsetType;

    /**
     * Get Logset retention period in days; max value: 90 
     * @return Period Logset retention period in days; max value: 90
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Logset retention period in days; max value: 90
     * @param Period Logset retention period in days; max value: 90
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Logset name, which must be unique among all CLS logsets; default value: clb_logset 
     * @return LogsetName Logset name, which must be unique among all CLS logsets; default value: clb_logset
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set Logset name, which must be unique among all CLS logsets; default value: clb_logset
     * @param LogsetName Logset name, which must be unique among all CLS logsets; default value: clb_logset
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get Logset type. Valid values: ACCESS (access logs; default value) and HEALTH (health check logs). 
     * @return LogsetType Logset type. Valid values: ACCESS (access logs; default value) and HEALTH (health check logs).
     */
    public String getLogsetType() {
        return this.LogsetType;
    }

    /**
     * Set Logset type. Valid values: ACCESS (access logs; default value) and HEALTH (health check logs).
     * @param LogsetType Logset type. Valid values: ACCESS (access logs; default value) and HEALTH (health check logs).
     */
    public void setLogsetType(String LogsetType) {
        this.LogsetType = LogsetType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "LogsetType", this.LogsetType);

    }
}

