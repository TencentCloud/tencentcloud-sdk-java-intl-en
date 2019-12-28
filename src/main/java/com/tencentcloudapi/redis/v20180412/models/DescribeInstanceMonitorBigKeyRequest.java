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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceMonitorBigKeyRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Request type. 1: string type; 2: all types
    */
    @SerializedName("ReqType")
    @Expose
    private Long ReqType;

    /**
    * Time, such as "20190219"
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Request type. 1: string type; 2: all types 
     * @return ReqType Request type. 1: string type; 2: all types
     */
    public Long getReqType() {
        return this.ReqType;
    }

    /**
     * Set Request type. 1: string type; 2: all types
     * @param ReqType Request type. 1: string type; 2: all types
     */
    public void setReqType(Long ReqType) {
        this.ReqType = ReqType;
    }

    /**
     * Get Time, such as "20190219" 
     * @return Date Time, such as "20190219"
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Time, such as "20190219"
     * @param Date Time, such as "20190219"
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ReqType", this.ReqType);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

