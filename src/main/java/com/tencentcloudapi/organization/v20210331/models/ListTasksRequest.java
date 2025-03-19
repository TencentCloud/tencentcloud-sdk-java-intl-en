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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTasksRequest extends AbstractModel {

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * User synchronization ID. Valid values: When PrincipalType is Group, it is a user group ID (g-****). When PrincipalType is User, it is a user ID (u-****).
    */
    @SerializedName("PrincipalId")
    @Expose
    private String PrincipalId;

    /**
    * Token for querying the next page of returned results. During use of the API for the first time, NextToken is not needed. When you call the API for the first time, if the total number of returned data entries exceeds the MaxResults limit, the data is truncated and only MaxResults data entries are returned. Meanwhile, the return parameter IsTruncated is true and a NextToken is returned. You can use the NextToken returned last time to continue calling the API with other request parameters unchanged, to query the truncated data. You can use this method for multiple queries until IsTruncated is false, indicating that all data has been queried.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * Maximum number of data entries per page. Value range: 1-100. Default value: 10.
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Identity types synchronized for CAM users. Valid values: User: indicates the synchronized identity is a user. Group: indicates the synchronized identity is a user group.
    */
    @SerializedName("PrincipalType")
    @Expose
    private String PrincipalType;

    /**
    * UIN of the synchronized target account of the Tencent Cloud Organization.
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * Type of the synchronized target account of the Tencent Cloud Organization. ManagerUin: admin account; MemberUin: member account.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Permission configuration ID.
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * InProgress: The task is being executed; Success: The task execution succeeded; Failed: The task execution failed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task type.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
     * Get Space ID. 
     * @return ZoneId Space ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Space ID.
     * @param ZoneId Space ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get User synchronization ID. Valid values: When PrincipalType is Group, it is a user group ID (g-****). When PrincipalType is User, it is a user ID (u-****). 
     * @return PrincipalId User synchronization ID. Valid values: When PrincipalType is Group, it is a user group ID (g-****). When PrincipalType is User, it is a user ID (u-****).
     */
    public String getPrincipalId() {
        return this.PrincipalId;
    }

    /**
     * Set User synchronization ID. Valid values: When PrincipalType is Group, it is a user group ID (g-****). When PrincipalType is User, it is a user ID (u-****).
     * @param PrincipalId User synchronization ID. Valid values: When PrincipalType is Group, it is a user group ID (g-****). When PrincipalType is User, it is a user ID (u-****).
     */
    public void setPrincipalId(String PrincipalId) {
        this.PrincipalId = PrincipalId;
    }

    /**
     * Get Token for querying the next page of returned results. During use of the API for the first time, NextToken is not needed. When you call the API for the first time, if the total number of returned data entries exceeds the MaxResults limit, the data is truncated and only MaxResults data entries are returned. Meanwhile, the return parameter IsTruncated is true and a NextToken is returned. You can use the NextToken returned last time to continue calling the API with other request parameters unchanged, to query the truncated data. You can use this method for multiple queries until IsTruncated is false, indicating that all data has been queried. 
     * @return NextToken Token for querying the next page of returned results. During use of the API for the first time, NextToken is not needed. When you call the API for the first time, if the total number of returned data entries exceeds the MaxResults limit, the data is truncated and only MaxResults data entries are returned. Meanwhile, the return parameter IsTruncated is true and a NextToken is returned. You can use the NextToken returned last time to continue calling the API with other request parameters unchanged, to query the truncated data. You can use this method for multiple queries until IsTruncated is false, indicating that all data has been queried.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Token for querying the next page of returned results. During use of the API for the first time, NextToken is not needed. When you call the API for the first time, if the total number of returned data entries exceeds the MaxResults limit, the data is truncated and only MaxResults data entries are returned. Meanwhile, the return parameter IsTruncated is true and a NextToken is returned. You can use the NextToken returned last time to continue calling the API with other request parameters unchanged, to query the truncated data. You can use this method for multiple queries until IsTruncated is false, indicating that all data has been queried.
     * @param NextToken Token for querying the next page of returned results. During use of the API for the first time, NextToken is not needed. When you call the API for the first time, if the total number of returned data entries exceeds the MaxResults limit, the data is truncated and only MaxResults data entries are returned. Meanwhile, the return parameter IsTruncated is true and a NextToken is returned. You can use the NextToken returned last time to continue calling the API with other request parameters unchanged, to query the truncated data. You can use this method for multiple queries until IsTruncated is false, indicating that all data has been queried.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get Maximum number of data entries per page. Value range: 1-100. Default value: 10. 
     * @return MaxResults Maximum number of data entries per page. Value range: 1-100. Default value: 10.
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Maximum number of data entries per page. Value range: 1-100. Default value: 10.
     * @param MaxResults Maximum number of data entries per page. Value range: 1-100. Default value: 10.
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Identity types synchronized for CAM users. Valid values: User: indicates the synchronized identity is a user. Group: indicates the synchronized identity is a user group. 
     * @return PrincipalType Identity types synchronized for CAM users. Valid values: User: indicates the synchronized identity is a user. Group: indicates the synchronized identity is a user group.
     */
    public String getPrincipalType() {
        return this.PrincipalType;
    }

    /**
     * Set Identity types synchronized for CAM users. Valid values: User: indicates the synchronized identity is a user. Group: indicates the synchronized identity is a user group.
     * @param PrincipalType Identity types synchronized for CAM users. Valid values: User: indicates the synchronized identity is a user. Group: indicates the synchronized identity is a user group.
     */
    public void setPrincipalType(String PrincipalType) {
        this.PrincipalType = PrincipalType;
    }

    /**
     * Get UIN of the synchronized target account of the Tencent Cloud Organization. 
     * @return TargetUin UIN of the synchronized target account of the Tencent Cloud Organization.
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set UIN of the synchronized target account of the Tencent Cloud Organization.
     * @param TargetUin UIN of the synchronized target account of the Tencent Cloud Organization.
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get Type of the synchronized target account of the Tencent Cloud Organization. ManagerUin: admin account; MemberUin: member account. 
     * @return TargetType Type of the synchronized target account of the Tencent Cloud Organization. ManagerUin: admin account; MemberUin: member account.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Type of the synchronized target account of the Tencent Cloud Organization. ManagerUin: admin account; MemberUin: member account.
     * @param TargetType Type of the synchronized target account of the Tencent Cloud Organization. ManagerUin: admin account; MemberUin: member account.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Permission configuration ID. 
     * @return RoleConfigurationId Permission configuration ID.
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set Permission configuration ID.
     * @param RoleConfigurationId Permission configuration ID.
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    /**
     * Get InProgress: The task is being executed; Success: The task execution succeeded; Failed: The task execution failed. 
     * @return Status InProgress: The task is being executed; Success: The task execution succeeded; Failed: The task execution failed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set InProgress: The task is being executed; Success: The task execution succeeded; Failed: The task execution failed.
     * @param Status InProgress: The task is being executed; Success: The task execution succeeded; Failed: The task execution failed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task type. 
     * @return TaskType Task type.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type.
     * @param TaskType Task type.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    public ListTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTasksRequest(ListTasksRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.PrincipalId != null) {
            this.PrincipalId = new String(source.PrincipalId);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.PrincipalType != null) {
            this.PrincipalType = new String(source.PrincipalType);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "PrincipalId", this.PrincipalId);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "PrincipalType", this.PrincipalType);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

