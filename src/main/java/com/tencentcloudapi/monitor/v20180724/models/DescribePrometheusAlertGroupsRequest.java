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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusAlertGroupsRequest extends AbstractModel {

    /**
    * prometheus instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Number of returned results. defaults to 20. maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Alert group ID, such as alert-xxxx.
List the alert group with the given ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Specifies the alert group name.
List alert groups which name contains the given string.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get prometheus instance ID 
     * @return InstanceId prometheus instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set prometheus instance ID
     * @param InstanceId prometheus instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Number of returned results. defaults to 20. maximum value is 100. 
     * @return Limit Number of returned results. defaults to 20. maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. defaults to 20. maximum value is 100.
     * @param Limit Number of returned results. defaults to 20. maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. default value: 0. 
     * @return Offset Offset. default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. default value: 0.
     * @param Offset Offset. default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Alert group ID, such as alert-xxxx.
List the alert group with the given ID. 
     * @return GroupId Alert group ID, such as alert-xxxx.
List the alert group with the given ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Alert group ID, such as alert-xxxx.
List the alert group with the given ID.
     * @param GroupId Alert group ID, such as alert-xxxx.
List the alert group with the given ID.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Specifies the alert group name.
List alert groups which name contains the given string. 
     * @return GroupName Specifies the alert group name.
List alert groups which name contains the given string.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Specifies the alert group name.
List alert groups which name contains the given string.
     * @param GroupName Specifies the alert group name.
List alert groups which name contains the given string.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public DescribePrometheusAlertGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusAlertGroupsRequest(DescribePrometheusAlertGroupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

