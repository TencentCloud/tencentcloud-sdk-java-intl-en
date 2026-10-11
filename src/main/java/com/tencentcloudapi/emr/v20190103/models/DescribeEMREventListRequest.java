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

public class DescribeEMREventListRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time for event query.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time for event query.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Event-triggered IP address.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Service role of the affected event.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Event name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Offset of the event list.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit of the event list.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Cluster ID. 
     * @return InstanceId Cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID.
     * @param InstanceId Cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time for event query. 
     * @return StartTime Start time for event query.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time for event query.
     * @param StartTime Start time for event query.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time for event query. 
     * @return EndTime End time for event query.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time for event query.
     * @param EndTime End time for event query.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Event-triggered IP address. 
     * @return Host Event-triggered IP address.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Event-triggered IP address.
     * @param Host Event-triggered IP address.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Service role of the affected event. 
     * @return Role Service role of the affected event.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Service role of the affected event.
     * @param Role Service role of the affected event.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Event name. 
     * @return Name Event name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Event name.
     * @param Name Event name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Offset of the event list. 
     * @return Offset Offset of the event list.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset of the event list.
     * @param Offset Offset of the event list.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit of the event list. 
     * @return Limit Limit of the event list.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit of the event list.
     * @param Limit Limit of the event list.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeEMREventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEMREventListRequest(DescribeEMREventListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

