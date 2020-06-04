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

public class DescribeCCUrlAllowResponse extends AbstractModel{

    /**
    * This field has been replaced by `RecordList` and should not be used
    */
    @SerializedName("Data")
    @Expose
    private KeyValue [] Data;

    /**
    * Total number of records
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Returned Blacklist/whitelist record,
If "Key":"url", "Value": URL;
If "Key":"domain", "Value": domain name.
If "Key":"type", "Value" can be `white` (whitelist) or `black` (blacklist).
If "Key":"protocol", "Value": CC protection type (HTTP protection or HTTPS domain name protection);
    */
    @SerializedName("RecordList")
    @Expose
    private KeyValueRecord [] RecordList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get This field has been replaced by `RecordList` and should not be used 
     * @return Data This field has been replaced by `RecordList` and should not be used
     */
    public KeyValue [] getData() {
        return this.Data;
    }

    /**
     * Set This field has been replaced by `RecordList` and should not be used
     * @param Data This field has been replaced by `RecordList` and should not be used
     */
    public void setData(KeyValue [] Data) {
        this.Data = Data;
    }

    /**
     * Get Total number of records 
     * @return Total Total number of records
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of records
     * @param Total Total number of records
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Returned Blacklist/whitelist record,
If "Key":"url", "Value": URL;
If "Key":"domain", "Value": domain name.
If "Key":"type", "Value" can be `white` (whitelist) or `black` (blacklist).
If "Key":"protocol", "Value": CC protection type (HTTP protection or HTTPS domain name protection); 
     * @return RecordList Returned Blacklist/whitelist record,
If "Key":"url", "Value": URL;
If "Key":"domain", "Value": domain name.
If "Key":"type", "Value" can be `white` (whitelist) or `black` (blacklist).
If "Key":"protocol", "Value": CC protection type (HTTP protection or HTTPS domain name protection);
     */
    public KeyValueRecord [] getRecordList() {
        return this.RecordList;
    }

    /**
     * Set Returned Blacklist/whitelist record,
If "Key":"url", "Value": URL;
If "Key":"domain", "Value": domain name.
If "Key":"type", "Value" can be `white` (whitelist) or `black` (blacklist).
If "Key":"protocol", "Value": CC protection type (HTTP protection or HTTPS domain name protection);
     * @param RecordList Returned Blacklist/whitelist record,
If "Key":"url", "Value": URL;
If "Key":"domain", "Value": domain name.
If "Key":"type", "Value" can be `white` (whitelist) or `black` (blacklist).
If "Key":"protocol", "Value": CC protection type (HTTP protection or HTTPS domain name protection);
     */
    public void setRecordList(KeyValueRecord [] RecordList) {
        this.RecordList = RecordList;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "RecordList.", this.RecordList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

