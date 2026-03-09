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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInvokerRecordsRequest extends AbstractModel {

    /**
    * Executor ID list. the list has a cap of 100.

Call the [DescribeInvokers](https://www.tencentcloud.comom/document/api/1340/61759?from_cn_redirect=1) api to query execution.
    */
    @SerializedName("InvokerIds")
    @Expose
    private String [] InvokerIds;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Executor ID list. the list has a cap of 100.

Call the [DescribeInvokers](https://www.tencentcloud.comom/document/api/1340/61759?from_cn_redirect=1) api to query execution. 
     * @return InvokerIds Executor ID list. the list has a cap of 100.

Call the [DescribeInvokers](https://www.tencentcloud.comom/document/api/1340/61759?from_cn_redirect=1) api to query execution.
     */
    public String [] getInvokerIds() {
        return this.InvokerIds;
    }

    /**
     * Set Executor ID list. the list has a cap of 100.

Call the [DescribeInvokers](https://www.tencentcloud.comom/document/api/1340/61759?from_cn_redirect=1) api to query execution.
     * @param InvokerIds Executor ID list. the list has a cap of 100.

Call the [DescribeInvokers](https://www.tencentcloud.comom/document/api/1340/61759?from_cn_redirect=1) api to query execution.
     */
    public void setInvokerIds(String [] InvokerIds) {
        this.InvokerIds = InvokerIds;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeInvokerRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInvokerRecordsRequest(DescribeInvokerRecordsRequest source) {
        if (source.InvokerIds != null) {
            this.InvokerIds = new String[source.InvokerIds.length];
            for (int i = 0; i < source.InvokerIds.length; i++) {
                this.InvokerIds[i] = new String(source.InvokerIds[i]);
            }
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
        this.setParamArraySimple(map, prefix + "InvokerIds.", this.InvokerIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

