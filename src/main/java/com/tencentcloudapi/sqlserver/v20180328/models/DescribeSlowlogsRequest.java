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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowlogsRequest extends AbstractModel{

    /**
    * Instance ID in the format of mssql-k8voqdlz
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Query start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Number of results per page. Value range: 1-100. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Instance ID in the format of mssql-k8voqdlz 
     * @return InstanceId Instance ID in the format of mssql-k8voqdlz
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of mssql-k8voqdlz
     * @param InstanceId Instance ID in the format of mssql-k8voqdlz
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Query start time 
     * @return StartTime Query start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time
     * @param StartTime Query start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time 
     * @return EndTime Query end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time
     * @param EndTime Query end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of results per page. Value range: 1-100. Default value: 20 
     * @return Limit Number of results per page. Value range: 1-100. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results per page. Value range: 1-100. Default value: 20
     * @param Limit Number of results per page. Value range: 1-100. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number. Default value: 0 
     * @return Offset Page number. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number. Default value: 0
     * @param Offset Page number. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

