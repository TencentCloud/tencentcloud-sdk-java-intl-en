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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEmrApplicationStaticsRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time in the format of timestamp. Unit: seconds.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time in the format of timestamp. Unit: seconds.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Queue name used for filtering
    */
    @SerializedName("Queues")
    @Expose
    private String [] Queues;

    /**
    * Username used for filtering
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * Application type used for filtering
    */
    @SerializedName("ApplicationTypes")
    @Expose
    private String [] ApplicationTypes;

    /**
    * Group field. Valid values: `queue`, `user`, and `applicationType`.
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
    * Sorting field. Valid values: `sumMemorySeconds`, `sumVCoreSeconds`, `sumHDFSBytesWritten`, and `sumHDFSBytesRead`.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Order type. Valid values: `0` (descending) and `1`(ascending).
    */
    @SerializedName("IsAsc")
    @Expose
    private Long IsAsc;

    /**
    * Page number
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Page capacity in the range of [10,100].
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Cluster ID 
     * @return InstanceId Cluster ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID
     * @param InstanceId Cluster ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time in the format of timestamp. Unit: seconds. 
     * @return StartTime Start time in the format of timestamp. Unit: seconds.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time in the format of timestamp. Unit: seconds.
     * @param StartTime Start time in the format of timestamp. Unit: seconds.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in the format of timestamp. Unit: seconds. 
     * @return EndTime End time in the format of timestamp. Unit: seconds.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in the format of timestamp. Unit: seconds.
     * @param EndTime End time in the format of timestamp. Unit: seconds.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Queue name used for filtering 
     * @return Queues Queue name used for filtering
     */
    public String [] getQueues() {
        return this.Queues;
    }

    /**
     * Set Queue name used for filtering
     * @param Queues Queue name used for filtering
     */
    public void setQueues(String [] Queues) {
        this.Queues = Queues;
    }

    /**
     * Get Username used for filtering 
     * @return Users Username used for filtering
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set Username used for filtering
     * @param Users Username used for filtering
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    /**
     * Get Application type used for filtering 
     * @return ApplicationTypes Application type used for filtering
     */
    public String [] getApplicationTypes() {
        return this.ApplicationTypes;
    }

    /**
     * Set Application type used for filtering
     * @param ApplicationTypes Application type used for filtering
     */
    public void setApplicationTypes(String [] ApplicationTypes) {
        this.ApplicationTypes = ApplicationTypes;
    }

    /**
     * Get Group field. Valid values: `queue`, `user`, and `applicationType`. 
     * @return GroupBy Group field. Valid values: `queue`, `user`, and `applicationType`.
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set Group field. Valid values: `queue`, `user`, and `applicationType`.
     * @param GroupBy Group field. Valid values: `queue`, `user`, and `applicationType`.
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get Sorting field. Valid values: `sumMemorySeconds`, `sumVCoreSeconds`, `sumHDFSBytesWritten`, and `sumHDFSBytesRead`. 
     * @return OrderBy Sorting field. Valid values: `sumMemorySeconds`, `sumVCoreSeconds`, `sumHDFSBytesWritten`, and `sumHDFSBytesRead`.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. Valid values: `sumMemorySeconds`, `sumVCoreSeconds`, `sumHDFSBytesWritten`, and `sumHDFSBytesRead`.
     * @param OrderBy Sorting field. Valid values: `sumMemorySeconds`, `sumVCoreSeconds`, `sumHDFSBytesWritten`, and `sumHDFSBytesRead`.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Order type. Valid values: `0` (descending) and `1`(ascending). 
     * @return IsAsc Order type. Valid values: `0` (descending) and `1`(ascending).
     */
    public Long getIsAsc() {
        return this.IsAsc;
    }

    /**
     * Set Order type. Valid values: `0` (descending) and `1`(ascending).
     * @param IsAsc Order type. Valid values: `0` (descending) and `1`(ascending).
     */
    public void setIsAsc(Long IsAsc) {
        this.IsAsc = IsAsc;
    }

    /**
     * Get Page number 
     * @return Offset Page number
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number
     * @param Offset Page number
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Page capacity in the range of [10,100]. 
     * @return Limit Page capacity in the range of [10,100].
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page capacity in the range of [10,100].
     * @param Limit Page capacity in the range of [10,100].
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeEmrApplicationStaticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEmrApplicationStaticsRequest(DescribeEmrApplicationStaticsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Queues != null) {
            this.Queues = new String[source.Queues.length];
            for (int i = 0; i < source.Queues.length; i++) {
                this.Queues[i] = new String(source.Queues[i]);
            }
        }
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
        if (source.ApplicationTypes != null) {
            this.ApplicationTypes = new String[source.ApplicationTypes.length];
            for (int i = 0; i < source.ApplicationTypes.length; i++) {
                this.ApplicationTypes[i] = new String(source.ApplicationTypes[i]);
            }
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.IsAsc != null) {
            this.IsAsc = new Long(source.IsAsc);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Queues.", this.Queues);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);
        this.setParamArraySimple(map, prefix + "ApplicationTypes.", this.ApplicationTypes);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "IsAsc", this.IsAsc);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

