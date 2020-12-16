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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogDataRequest extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start timestamp.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End timestamp.
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
    * Sort by field. Valid values: Timestamp, QueryTime, LockTime, RowsExamined, RowsSent.
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * Sorting order. Valid values: ASC (ascending), DESC (descending).
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of results per page in paginated queries. Default value: 100. Maximum value: 400.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start timestamp. 
     * @return StartTime Start timestamp.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp.
     * @param StartTime Start timestamp.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End timestamp. 
     * @return EndTime End timestamp.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timestamp.
     * @param EndTime End timestamp.
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
     * Get Sort by field. Valid values: Timestamp, QueryTime, LockTime, RowsExamined, RowsSent. 
     * @return SortBy Sort by field. Valid values: Timestamp, QueryTime, LockTime, RowsExamined, RowsSent.
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sort by field. Valid values: Timestamp, QueryTime, LockTime, RowsExamined, RowsSent.
     * @param SortBy Sort by field. Valid values: Timestamp, QueryTime, LockTime, RowsExamined, RowsSent.
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get Sorting order. Valid values: ASC (ascending), DESC (descending). 
     * @return OrderBy Sorting order. Valid values: ASC (ascending), DESC (descending).
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting order. Valid values: ASC (ascending), DESC (descending).
     * @param OrderBy Sorting order. Valid values: ASC (ascending), DESC (descending).
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
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

    /**
     * Get The number of results per page in paginated queries. Default value: 100. Maximum value: 400. 
     * @return Limit The number of results per page in paginated queries. Default value: 100. Maximum value: 400.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of results per page in paginated queries. Default value: 100. Maximum value: 400.
     * @param Limit The number of results per page in paginated queries. Default value: 100. Maximum value: 400.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    }
}

