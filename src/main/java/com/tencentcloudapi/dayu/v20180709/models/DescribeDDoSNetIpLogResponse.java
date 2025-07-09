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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSNetIpLogResponse extends AbstractModel {

    /**
    * Anti-DDoS service type (`net`: Anti-DDoS Ultimate)
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Anti-DDoS instance ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Attack start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Attack end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * IP attack log, which is a `KeyValue` array. Valid values of `Key-Value`:
If `Key` is `LogTime`, `Value` indicates the IP log time
If `Key` is `LogMessage`, `Value` indicates the IP log content
    */
    @SerializedName("Data")
    @Expose
    private KeyValueRecord [] Data;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Anti-DDoS service type (`net`: Anti-DDoS Ultimate) 
     * @return Business Anti-DDoS service type (`net`: Anti-DDoS Ultimate)
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type (`net`: Anti-DDoS Ultimate)
     * @param Business Anti-DDoS service type (`net`: Anti-DDoS Ultimate)
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Anti-DDoS instance ID 
     * @return Id Anti-DDoS instance ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Anti-DDoS instance ID
     * @param Id Anti-DDoS instance ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Attack start time 
     * @return StartTime Attack start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Attack start time
     * @param StartTime Attack start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Attack end time 
     * @return EndTime Attack end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Attack end time
     * @param EndTime Attack end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get IP attack log, which is a `KeyValue` array. Valid values of `Key-Value`:
If `Key` is `LogTime`, `Value` indicates the IP log time
If `Key` is `LogMessage`, `Value` indicates the IP log content 
     * @return Data IP attack log, which is a `KeyValue` array. Valid values of `Key-Value`:
If `Key` is `LogTime`, `Value` indicates the IP log time
If `Key` is `LogMessage`, `Value` indicates the IP log content
     */
    public KeyValueRecord [] getData() {
        return this.Data;
    }

    /**
     * Set IP attack log, which is a `KeyValue` array. Valid values of `Key-Value`:
If `Key` is `LogTime`, `Value` indicates the IP log time
If `Key` is `LogMessage`, `Value` indicates the IP log content
     * @param Data IP attack log, which is a `KeyValue` array. Valid values of `Key-Value`:
If `Key` is `LogTime`, `Value` indicates the IP log time
If `Key` is `LogMessage`, `Value` indicates the IP log content
     */
    public void setData(KeyValueRecord [] Data) {
        this.Data = Data;
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

    public DescribeDDoSNetIpLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSNetIpLogResponse(DescribeDDoSNetIpLogResponse source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Data != null) {
            this.Data = new KeyValueRecord[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new KeyValueRecord(source.Data[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

