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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupRecordsRequest extends AbstractModel {

    /**
    * Cluster ID, which is used to query a specified cluster
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Number of results per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Table group ID used as a filter condition
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * Table name used as a filter condition
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get Cluster ID, which is used to query a specified cluster 
     * @return ClusterId Cluster ID, which is used to query a specified cluster
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID, which is used to query a specified cluster
     * @param ClusterId Cluster ID, which is used to query a specified cluster
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Number of results per page 
     * @return Limit Number of results per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results per page
     * @param Limit Number of results per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page offset 
     * @return Offset Page offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset
     * @param Offset Page offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Table group ID used as a filter condition 
     * @return TableGroupId Table group ID used as a filter condition
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set Table group ID used as a filter condition
     * @param TableGroupId Table group ID used as a filter condition
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get Table name used as a filter condition 
     * @return TableName Table name used as a filter condition
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name used as a filter condition
     * @param TableName Table name used as a filter condition
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public DescribeBackupRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupRecordsRequest(DescribeBackupRecordsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

