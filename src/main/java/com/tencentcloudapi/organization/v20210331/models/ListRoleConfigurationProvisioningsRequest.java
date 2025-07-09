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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListRoleConfigurationProvisioningsRequest extends AbstractModel {

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Permission configuration ID.
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * Maximum number of data entries per page. Value range: 1-100. Default value: 10.
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Token for querying the next page of returned results. During use of the API for the first time, NextToken is not needed. When you call the API for the first time, if the total number of returned data entries exceeds the MaxResults limit, the data is truncated and only MaxResults data entries are returned. Meanwhile, the return parameter IsTruncated is true and a NextToken is returned. You can use the NextToken returned last time to continue calling the API with other request parameters unchanged, to query the truncated data. You can use this method for multiple queries until IsTruncated is false, indicating that all data has been queried.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * Type of the synchronized target account of the Tencent Cloud Organization. ManagerUin: admin account; MemberUin: member account.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * UIN of the synchronized target account of the Tencent Cloud Organization.
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * Deployed: Deployment succeeded; DeployedRequired: Redeployment required; DeployFailed: Deployment failed.
    */
    @SerializedName("DeploymentStatus")
    @Expose
    private String DeploymentStatus;

    /**
    * Search by configuration name is supported.
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

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
     * Get Deployed: Deployment succeeded; DeployedRequired: Redeployment required; DeployFailed: Deployment failed. 
     * @return DeploymentStatus Deployed: Deployment succeeded; DeployedRequired: Redeployment required; DeployFailed: Deployment failed.
     */
    public String getDeploymentStatus() {
        return this.DeploymentStatus;
    }

    /**
     * Set Deployed: Deployment succeeded; DeployedRequired: Redeployment required; DeployFailed: Deployment failed.
     * @param DeploymentStatus Deployed: Deployment succeeded; DeployedRequired: Redeployment required; DeployFailed: Deployment failed.
     */
    public void setDeploymentStatus(String DeploymentStatus) {
        this.DeploymentStatus = DeploymentStatus;
    }

    /**
     * Get Search by configuration name is supported. 
     * @return Filter Search by configuration name is supported.
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set Search by configuration name is supported.
     * @param Filter Search by configuration name is supported.
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    public ListRoleConfigurationProvisioningsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRoleConfigurationProvisioningsRequest(ListRoleConfigurationProvisioningsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.DeploymentStatus != null) {
            this.DeploymentStatus = new String(source.DeploymentStatus);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "DeploymentStatus", this.DeploymentStatus);
        this.setParamSimple(map, prefix + "Filter", this.Filter);

    }
}

