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

public class DescribeInstanceTasksRequest extends AbstractModel {

    /**
    * Database instance ID, in the format of mssql-njj2mtpl.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Pagination size.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Asynchronous task status. 1 - running; 2 - running successful; 3 - running failed.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Pagination offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Database instance ID, in the format of mssql-njj2mtpl. 
     * @return InstanceId Database instance ID, in the format of mssql-njj2mtpl.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Database instance ID, in the format of mssql-njj2mtpl.
     * @param InstanceId Database instance ID, in the format of mssql-njj2mtpl.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get Asynchronous task status. 1 - running; 2 - running successful; 3 - running failed. 
     * @return Status Asynchronous task status. 1 - running; 2 - running successful; 3 - running failed.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Asynchronous task status. 1 - running; 2 - running successful; 3 - running failed.
     * @param Status Asynchronous task status. 1 - running; 2 - running successful; 3 - running failed.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Pagination offset. 
     * @return Offset Pagination offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset.
     * @param Offset Pagination offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeInstanceTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceTasksRequest(DescribeInstanceTasksRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

