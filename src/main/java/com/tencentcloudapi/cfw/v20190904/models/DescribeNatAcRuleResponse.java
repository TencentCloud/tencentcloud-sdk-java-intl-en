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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatAcRuleResponse extends AbstractModel {

    /**
    * Total number of entries.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * NAT access control list data.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private DescAcItem [] Data;

    /**
    * Total number of entries returned without filtering.
    */
    @SerializedName("AllTotal")
    @Expose
    private Long AllTotal;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of entries. 
     * @return Total Total number of entries.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of entries.
     * @param Total Total number of entries.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get NAT access control list data.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Data NAT access control list data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DescAcItem [] getData() {
        return this.Data;
    }

    /**
     * Set NAT access control list data.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Data NAT access control list data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setData(DescAcItem [] Data) {
        this.Data = Data;
    }

    /**
     * Get Total number of entries returned without filtering. 
     * @return AllTotal Total number of entries returned without filtering.
     */
    public Long getAllTotal() {
        return this.AllTotal;
    }

    /**
     * Set Total number of entries returned without filtering.
     * @param AllTotal Total number of entries returned without filtering.
     */
    public void setAllTotal(Long AllTotal) {
        this.AllTotal = AllTotal;
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

    public DescribeNatAcRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatAcRuleResponse(DescribeNatAcRuleResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new DescAcItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DescAcItem(source.Data[i]);
            }
        }
        if (source.AllTotal != null) {
            this.AllTotal = new Long(source.AllTotal);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "AllTotal", this.AllTotal);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

