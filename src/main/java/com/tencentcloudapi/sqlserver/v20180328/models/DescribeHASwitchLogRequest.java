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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHASwitchLogRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time (yyyy-MM-dd HH:mm:ss).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time (yyyy-MM-dd HH:mm:ss).
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Switch mode. 0 - system automatic switch; 1 - manual switch. Check all switch modes by default if the parameter is left unspecified.
    */
    @SerializedName("SwitchType")
    @Expose
    private Long SwitchType;

    /**
    * Pagination size.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination number.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time (yyyy-MM-dd HH:mm:ss). 
     * @return StartTime Start time (yyyy-MM-dd HH:mm:ss).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (yyyy-MM-dd HH:mm:ss).
     * @param StartTime Start time (yyyy-MM-dd HH:mm:ss).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time (yyyy-MM-dd HH:mm:ss). 
     * @return EndTime End time (yyyy-MM-dd HH:mm:ss).
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (yyyy-MM-dd HH:mm:ss).
     * @param EndTime End time (yyyy-MM-dd HH:mm:ss).
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Switch mode. 0 - system automatic switch; 1 - manual switch. Check all switch modes by default if the parameter is left unspecified. 
     * @return SwitchType Switch mode. 0 - system automatic switch; 1 - manual switch. Check all switch modes by default if the parameter is left unspecified.
     */
    public Long getSwitchType() {
        return this.SwitchType;
    }

    /**
     * Set Switch mode. 0 - system automatic switch; 1 - manual switch. Check all switch modes by default if the parameter is left unspecified.
     * @param SwitchType Switch mode. 0 - system automatic switch; 1 - manual switch. Check all switch modes by default if the parameter is left unspecified.
     */
    public void setSwitchType(Long SwitchType) {
        this.SwitchType = SwitchType;
    }

    /**
     * Get Pagination size. 
     * @return Limit Pagination size.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination size.
     * @param Limit Pagination size.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination number. 
     * @return Offset Pagination number.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination number.
     * @param Offset Pagination number.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeHASwitchLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHASwitchLogRequest(DescribeHASwitchLogRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SwitchType != null) {
            this.SwitchType = new Long(source.SwitchType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SwitchType", this.SwitchType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

