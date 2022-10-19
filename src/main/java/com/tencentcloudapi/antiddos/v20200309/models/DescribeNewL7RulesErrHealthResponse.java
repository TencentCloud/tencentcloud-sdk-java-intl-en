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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNewL7RulesErrHealthResponse extends AbstractModel{

    /**
    * List of rules with exceptions. `Key`: Rule ID, `Value`: Exception IPs and error message. 
    */
    @SerializedName("ErrHealths")
    @Expose
    private KeyValue [] ErrHealths;

    /**
    * Total number of rules with exceptions
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of rules with exceptions. `Key`: Rule ID, `Value`: Exception IPs and error message.  
     * @return ErrHealths List of rules with exceptions. `Key`: Rule ID, `Value`: Exception IPs and error message. 
     */
    public KeyValue [] getErrHealths() {
        return this.ErrHealths;
    }

    /**
     * Set List of rules with exceptions. `Key`: Rule ID, `Value`: Exception IPs and error message. 
     * @param ErrHealths List of rules with exceptions. `Key`: Rule ID, `Value`: Exception IPs and error message. 
     */
    public void setErrHealths(KeyValue [] ErrHealths) {
        this.ErrHealths = ErrHealths;
    }

    /**
     * Get Total number of rules with exceptions 
     * @return Total Total number of rules with exceptions
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of rules with exceptions
     * @param Total Total number of rules with exceptions
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeNewL7RulesErrHealthResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNewL7RulesErrHealthResponse(DescribeNewL7RulesErrHealthResponse source) {
        if (source.ErrHealths != null) {
            this.ErrHealths = new KeyValue[source.ErrHealths.length];
            for (int i = 0; i < source.ErrHealths.length; i++) {
                this.ErrHealths[i] = new KeyValue(source.ErrHealths[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ErrHealths.", this.ErrHealths);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

