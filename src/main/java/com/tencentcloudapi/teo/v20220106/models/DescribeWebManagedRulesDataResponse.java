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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWebManagedRulesDataResponse extends AbstractModel {

    /**
    * Web attack log entity
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private SecEntry [] Data;

    /**
    * Status. 1: failed; 0: succeeded
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Returned message
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * Query time granularity. Valid values: {min,5min,hour,day}
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Web attack log entity
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Data Web attack log entity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SecEntry [] getData() {
        return this.Data;
    }

    /**
     * Set Web attack log entity
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Data Web attack log entity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setData(SecEntry [] Data) {
        this.Data = Data;
    }

    /**
     * Get Status. 1: failed; 0: succeeded 
     * @return Status Status. 1: failed; 0: succeeded
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 1: failed; 0: succeeded
     * @param Status Status. 1: failed; 0: succeeded
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Returned message 
     * @return Msg Returned message
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set Returned message
     * @param Msg Returned message
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get Query time granularity. Valid values: {min,5min,hour,day} 
     * @return Interval Query time granularity. Valid values: {min,5min,hour,day}
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Query time granularity. Valid values: {min,5min,hour,day}
     * @param Interval Query time granularity. Valid values: {min,5min,hour,day}
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeWebManagedRulesDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebManagedRulesDataResponse(DescribeWebManagedRulesDataResponse source) {
        if (source.Data != null) {
            this.Data = new SecEntry[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SecEntry(source.Data[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

