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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificateOperateLogsResponse extends AbstractModel{

    /**
    * Total number of logs that meet query conditions
    */
    @SerializedName("AllTotal")
    @Expose
    private Long AllTotal;

    /**
    * Number of logs returned for this request
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Certificate operation log list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperateLogs")
    @Expose
    private OperationLog [] OperateLogs;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of logs that meet query conditions 
     * @return AllTotal Total number of logs that meet query conditions
     */
    public Long getAllTotal() {
        return this.AllTotal;
    }

    /**
     * Set Total number of logs that meet query conditions
     * @param AllTotal Total number of logs that meet query conditions
     */
    public void setAllTotal(Long AllTotal) {
        this.AllTotal = AllTotal;
    }

    /**
     * Get Number of logs returned for this request 
     * @return TotalCount Number of logs returned for this request
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of logs returned for this request
     * @param TotalCount Number of logs returned for this request
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Certificate operation log list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OperateLogs Certificate operation log list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OperationLog [] getOperateLogs() {
        return this.OperateLogs;
    }

    /**
     * Set Certificate operation log list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OperateLogs Certificate operation log list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOperateLogs(OperationLog [] OperateLogs) {
        this.OperateLogs = OperateLogs;
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

    public DescribeCertificateOperateLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificateOperateLogsResponse(DescribeCertificateOperateLogsResponse source) {
        if (source.AllTotal != null) {
            this.AllTotal = new Long(source.AllTotal);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.OperateLogs != null) {
            this.OperateLogs = new OperationLog[source.OperateLogs.length];
            for (int i = 0; i < source.OperateLogs.length; i++) {
                this.OperateLogs[i] = new OperationLog(source.OperateLogs[i]);
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
        this.setParamSimple(map, prefix + "AllTotal", this.AllTotal);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "OperateLogs.", this.OperateLogs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

