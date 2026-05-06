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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGovernanceLaneGroupsRequest extends AbstractModel {

    /**
    * Engine Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Pagination query offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items per page.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * swimlane name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Lane ID
    */
    @SerializedName("GroupID")
    @Expose
    private String GroupID;

    /**
    * Whether to display the lane rule list
    */
    @SerializedName("Brief")
    @Expose
    private Boolean Brief;

    /**
     * Get Engine Instance ID 
     * @return InstanceId Engine Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Engine Instance ID
     * @param InstanceId Engine Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Pagination query offset. 
     * @return Offset Pagination query offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination query offset.
     * @param Offset Pagination query offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of items per page. 
     * @return Limit Number of items per page.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page.
     * @param Limit Number of items per page.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get swimlane name 
     * @return Name swimlane name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set swimlane name
     * @param Name swimlane name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Lane ID 
     * @return GroupID Lane ID
     */
    public String getGroupID() {
        return this.GroupID;
    }

    /**
     * Set Lane ID
     * @param GroupID Lane ID
     */
    public void setGroupID(String GroupID) {
        this.GroupID = GroupID;
    }

    /**
     * Get Whether to display the lane rule list 
     * @return Brief Whether to display the lane rule list
     */
    public Boolean getBrief() {
        return this.Brief;
    }

    /**
     * Set Whether to display the lane rule list
     * @param Brief Whether to display the lane rule list
     */
    public void setBrief(Boolean Brief) {
        this.Brief = Brief;
    }

    public DescribeGovernanceLaneGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGovernanceLaneGroupsRequest(DescribeGovernanceLaneGroupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.GroupID != null) {
            this.GroupID = new String(source.GroupID);
        }
        if (source.Brief != null) {
            this.Brief = new Boolean(source.Brief);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "GroupID", this.GroupID);
        this.setParamSimple(map, prefix + "Brief", this.Brief);

    }
}

