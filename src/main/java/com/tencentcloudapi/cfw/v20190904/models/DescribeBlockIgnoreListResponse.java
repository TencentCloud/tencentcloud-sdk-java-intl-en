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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBlockIgnoreListResponse extends AbstractModel {

    /**
    * List data.
    */
    @SerializedName("Data")
    @Expose
    private BlockIgnoreRule [] Data;

    /**
    * Total number of results, which is used for pagination.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Status code. Valid values: 0: successful; others: failed.
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * Status message. Valid values: success: successful query; fail: failed query.
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List data. 
     * @return Data List data.
     */
    public BlockIgnoreRule [] getData() {
        return this.Data;
    }

    /**
     * Set List data.
     * @param Data List data.
     */
    public void setData(BlockIgnoreRule [] Data) {
        this.Data = Data;
    }

    /**
     * Get Total number of results, which is used for pagination. 
     * @return Total Total number of results, which is used for pagination.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of results, which is used for pagination.
     * @param Total Total number of results, which is used for pagination.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Status code. Valid values: 0: successful; others: failed. 
     * @return ReturnCode Status code. Valid values: 0: successful; others: failed.
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set Status code. Valid values: 0: successful; others: failed.
     * @param ReturnCode Status code. Valid values: 0: successful; others: failed.
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get Status message. Valid values: success: successful query; fail: failed query. 
     * @return ReturnMsg Status message. Valid values: success: successful query; fail: failed query.
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set Status message. Valid values: success: successful query; fail: failed query.
     * @param ReturnMsg Status message. Valid values: success: successful query; fail: failed query.
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
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

    public DescribeBlockIgnoreListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlockIgnoreListResponse(DescribeBlockIgnoreListResponse source) {
        if (source.Data != null) {
            this.Data = new BlockIgnoreRule[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new BlockIgnoreRule(source.Data[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

