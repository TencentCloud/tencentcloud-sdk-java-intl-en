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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloneListRequest extends AbstractModel {

    /**
    * Query the cloning task list of the specified source instance. Obtain the instance ID through the [DescribeDBInstances](https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Paginated query offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page for paging query. Default value: 20. Maximum value: 100 recommended.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Query the cloning task list of the specified source instance. Obtain the instance ID through the [DescribeDBInstances](https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId Query the cloning task list of the specified source instance. Obtain the instance ID through the [DescribeDBInstances](https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Query the cloning task list of the specified source instance. Obtain the instance ID through the [DescribeDBInstances](https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) API.
     * @param InstanceId Query the cloning task list of the specified source instance. Obtain the instance ID through the [DescribeDBInstances](https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Paginated query offset. Default value: `0`. 
     * @return Offset Paginated query offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paginated query offset. Default value: `0`.
     * @param Offset Paginated query offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page for paging query. Default value: 20. Maximum value: 100 recommended. 
     * @return Limit Number of entries per page for paging query. Default value: 20. Maximum value: 100 recommended.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page for paging query. Default value: 20. Maximum value: 100 recommended.
     * @param Limit Number of entries per page for paging query. Default value: 20. Maximum value: 100 recommended.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCloneListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloneListRequest(DescribeCloneListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

