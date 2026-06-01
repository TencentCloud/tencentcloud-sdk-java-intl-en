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

public class DescribeSlowLogDataRequest extends AbstractModel {

    /**
    * Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Session start timestamp. For example, 1585142640.
Description: This parameter is a timestamp in seconds.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End timestamp. Example: 1585142640.
Description: This parameter is a timestamp in seconds.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Client `Host` list.
    */
    @SerializedName("UserHosts")
    @Expose
    private String [] UserHosts;

    /**
    * Client username list.
    */
    @SerializedName("UserNames")
    @Expose
    private String [] UserNames;

    /**
    * Accessed database list.
    */
    @SerializedName("DataBases")
    @Expose
    private String [] DataBases;

    /**
    * Sorting field. Currently supported fields and their meanings are as follows. Default value is Timestamp.
1. Timestamp: SQL execution time
2. QueryTime: SQL execution duration (seconds)
3. LockTime: Lock duration (seconds)
4. RowsExamined: Number of scanned rows
5. RowsSent: Result set row count
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * Ascending or descending order. Valid values: "ASC" - Ascending order, "DESC" - Descending order. Default value: "ASC".
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Offset. The default is 0, and the maximum is 9999.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of records returned in a single use, default is 100, maximum is 800.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * This parameter is valid only for source or disaster recovery instances. Valid value: `slave`, which indicates pulling logs from the replica.
    */
    @SerializedName("InstType")
    @Expose
    private String InstType;

    /**
    * Node ID.
    */
    @SerializedName("OpResourceId")
    @Expose
    private String OpResourceId;

    /**
     * Get Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Session start timestamp. For example, 1585142640.
Description: This parameter is a timestamp in seconds. 
     * @return StartTime Session start timestamp. For example, 1585142640.
Description: This parameter is a timestamp in seconds.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Session start timestamp. For example, 1585142640.
Description: This parameter is a timestamp in seconds.
     * @param StartTime Session start timestamp. For example, 1585142640.
Description: This parameter is a timestamp in seconds.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End timestamp. Example: 1585142640.
Description: This parameter is a timestamp in seconds. 
     * @return EndTime End timestamp. Example: 1585142640.
Description: This parameter is a timestamp in seconds.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timestamp. Example: 1585142640.
Description: This parameter is a timestamp in seconds.
     * @param EndTime End timestamp. Example: 1585142640.
Description: This parameter is a timestamp in seconds.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Client `Host` list. 
     * @return UserHosts Client `Host` list.
     */
    public String [] getUserHosts() {
        return this.UserHosts;
    }

    /**
     * Set Client `Host` list.
     * @param UserHosts Client `Host` list.
     */
    public void setUserHosts(String [] UserHosts) {
        this.UserHosts = UserHosts;
    }

    /**
     * Get Client username list. 
     * @return UserNames Client username list.
     */
    public String [] getUserNames() {
        return this.UserNames;
    }

    /**
     * Set Client username list.
     * @param UserNames Client username list.
     */
    public void setUserNames(String [] UserNames) {
        this.UserNames = UserNames;
    }

    /**
     * Get Accessed database list. 
     * @return DataBases Accessed database list.
     */
    public String [] getDataBases() {
        return this.DataBases;
    }

    /**
     * Set Accessed database list.
     * @param DataBases Accessed database list.
     */
    public void setDataBases(String [] DataBases) {
        this.DataBases = DataBases;
    }

    /**
     * Get Sorting field. Currently supported fields and their meanings are as follows. Default value is Timestamp.
1. Timestamp: SQL execution time
2. QueryTime: SQL execution duration (seconds)
3. LockTime: Lock duration (seconds)
4. RowsExamined: Number of scanned rows
5. RowsSent: Result set row count 
     * @return SortBy Sorting field. Currently supported fields and their meanings are as follows. Default value is Timestamp.
1. Timestamp: SQL execution time
2. QueryTime: SQL execution duration (seconds)
3. LockTime: Lock duration (seconds)
4. RowsExamined: Number of scanned rows
5. RowsSent: Result set row count
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sorting field. Currently supported fields and their meanings are as follows. Default value is Timestamp.
1. Timestamp: SQL execution time
2. QueryTime: SQL execution duration (seconds)
3. LockTime: Lock duration (seconds)
4. RowsExamined: Number of scanned rows
5. RowsSent: Result set row count
     * @param SortBy Sorting field. Currently supported fields and their meanings are as follows. Default value is Timestamp.
1. Timestamp: SQL execution time
2. QueryTime: SQL execution duration (seconds)
3. LockTime: Lock duration (seconds)
4. RowsExamined: Number of scanned rows
5. RowsSent: Result set row count
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get Ascending or descending order. Valid values: "ASC" - Ascending order, "DESC" - Descending order. Default value: "ASC". 
     * @return OrderBy Ascending or descending order. Valid values: "ASC" - Ascending order, "DESC" - Descending order. Default value: "ASC".
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Ascending or descending order. Valid values: "ASC" - Ascending order, "DESC" - Descending order. Default value: "ASC".
     * @param OrderBy Ascending or descending order. Valid values: "ASC" - Ascending order, "DESC" - Descending order. Default value: "ASC".
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Offset. The default is 0, and the maximum is 9999. 
     * @return Offset Offset. The default is 0, and the maximum is 9999.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. The default is 0, and the maximum is 9999.
     * @param Offset Offset. The default is 0, and the maximum is 9999.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of records returned in a single use, default is 100, maximum is 800. 
     * @return Limit The number of records returned in a single use, default is 100, maximum is 800.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of records returned in a single use, default is 100, maximum is 800.
     * @param Limit The number of records returned in a single use, default is 100, maximum is 800.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get This parameter is valid only for source or disaster recovery instances. Valid value: `slave`, which indicates pulling logs from the replica. 
     * @return InstType This parameter is valid only for source or disaster recovery instances. Valid value: `slave`, which indicates pulling logs from the replica.
     */
    public String getInstType() {
        return this.InstType;
    }

    /**
     * Set This parameter is valid only for source or disaster recovery instances. Valid value: `slave`, which indicates pulling logs from the replica.
     * @param InstType This parameter is valid only for source or disaster recovery instances. Valid value: `slave`, which indicates pulling logs from the replica.
     */
    public void setInstType(String InstType) {
        this.InstType = InstType;
    }

    /**
     * Get Node ID. 
     * @return OpResourceId Node ID.
     */
    public String getOpResourceId() {
        return this.OpResourceId;
    }

    /**
     * Set Node ID.
     * @param OpResourceId Node ID.
     */
    public void setOpResourceId(String OpResourceId) {
        this.OpResourceId = OpResourceId;
    }

    public DescribeSlowLogDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogDataRequest(DescribeSlowLogDataRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.UserHosts != null) {
            this.UserHosts = new String[source.UserHosts.length];
            for (int i = 0; i < source.UserHosts.length; i++) {
                this.UserHosts[i] = new String(source.UserHosts[i]);
            }
        }
        if (source.UserNames != null) {
            this.UserNames = new String[source.UserNames.length];
            for (int i = 0; i < source.UserNames.length; i++) {
                this.UserNames[i] = new String(source.UserNames[i]);
            }
        }
        if (source.DataBases != null) {
            this.DataBases = new String[source.DataBases.length];
            for (int i = 0; i < source.DataBases.length; i++) {
                this.DataBases[i] = new String(source.DataBases[i]);
            }
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstType != null) {
            this.InstType = new String(source.InstType);
        }
        if (source.OpResourceId != null) {
            this.OpResourceId = new String(source.OpResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "UserHosts.", this.UserHosts);
        this.setParamArraySimple(map, prefix + "UserNames.", this.UserNames);
        this.setParamArraySimple(map, prefix + "DataBases.", this.DataBases);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InstType", this.InstType);
        this.setParamSimple(map, prefix + "OpResourceId", this.OpResourceId);

    }
}

