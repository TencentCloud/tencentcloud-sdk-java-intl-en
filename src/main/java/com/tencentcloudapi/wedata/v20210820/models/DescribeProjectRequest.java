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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectRequest extends AbstractModel {

    /**
    * Project ID. It is common to use the Project ID for queries, and either this or projectName must be present.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Whether to Display Associated Cluster Information
    */
    @SerializedName("DescribeClusters")
    @Expose
    private Boolean DescribeClusters;

    /**
    * Whether to Display Information of Associated Execution Group, only partial information.
    */
    @SerializedName("DescribeExecutors")
    @Expose
    private Boolean DescribeExecutors;

    /**
    * Default not to display project administrator information
    */
    @SerializedName("DescribeAdminUsers")
    @Expose
    private Boolean DescribeAdminUsers;

    /**
    * Default not to count the number of project personnel
    */
    @SerializedName("DescribeMemberCount")
    @Expose
    private Boolean DescribeMemberCount;

    /**
    * Default not to query creator's information
    */
    @SerializedName("DescribeCreator")
    @Expose
    private Boolean DescribeCreator;

    /**
    * The project name is unique within a tenant, generally used for conversion to Project ID.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
     * Get Project ID. It is common to use the Project ID for queries, and either this or projectName must be present. 
     * @return ProjectId Project ID. It is common to use the Project ID for queries, and either this or projectName must be present.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. It is common to use the Project ID for queries, and either this or projectName must be present.
     * @param ProjectId Project ID. It is common to use the Project ID for queries, and either this or projectName must be present.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Whether to Display Associated Cluster Information 
     * @return DescribeClusters Whether to Display Associated Cluster Information
     */
    public Boolean getDescribeClusters() {
        return this.DescribeClusters;
    }

    /**
     * Set Whether to Display Associated Cluster Information
     * @param DescribeClusters Whether to Display Associated Cluster Information
     */
    public void setDescribeClusters(Boolean DescribeClusters) {
        this.DescribeClusters = DescribeClusters;
    }

    /**
     * Get Whether to Display Information of Associated Execution Group, only partial information. 
     * @return DescribeExecutors Whether to Display Information of Associated Execution Group, only partial information.
     */
    public Boolean getDescribeExecutors() {
        return this.DescribeExecutors;
    }

    /**
     * Set Whether to Display Information of Associated Execution Group, only partial information.
     * @param DescribeExecutors Whether to Display Information of Associated Execution Group, only partial information.
     */
    public void setDescribeExecutors(Boolean DescribeExecutors) {
        this.DescribeExecutors = DescribeExecutors;
    }

    /**
     * Get Default not to display project administrator information 
     * @return DescribeAdminUsers Default not to display project administrator information
     */
    public Boolean getDescribeAdminUsers() {
        return this.DescribeAdminUsers;
    }

    /**
     * Set Default not to display project administrator information
     * @param DescribeAdminUsers Default not to display project administrator information
     */
    public void setDescribeAdminUsers(Boolean DescribeAdminUsers) {
        this.DescribeAdminUsers = DescribeAdminUsers;
    }

    /**
     * Get Default not to count the number of project personnel 
     * @return DescribeMemberCount Default not to count the number of project personnel
     */
    public Boolean getDescribeMemberCount() {
        return this.DescribeMemberCount;
    }

    /**
     * Set Default not to count the number of project personnel
     * @param DescribeMemberCount Default not to count the number of project personnel
     */
    public void setDescribeMemberCount(Boolean DescribeMemberCount) {
        this.DescribeMemberCount = DescribeMemberCount;
    }

    /**
     * Get Default not to query creator's information 
     * @return DescribeCreator Default not to query creator's information
     */
    public Boolean getDescribeCreator() {
        return this.DescribeCreator;
    }

    /**
     * Set Default not to query creator's information
     * @param DescribeCreator Default not to query creator's information
     */
    public void setDescribeCreator(Boolean DescribeCreator) {
        this.DescribeCreator = DescribeCreator;
    }

    /**
     * Get The project name is unique within a tenant, generally used for conversion to Project ID. 
     * @return ProjectName The project name is unique within a tenant, generally used for conversion to Project ID.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set The project name is unique within a tenant, generally used for conversion to Project ID.
     * @param ProjectName The project name is unique within a tenant, generally used for conversion to Project ID.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public DescribeProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectRequest(DescribeProjectRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DescribeClusters != null) {
            this.DescribeClusters = new Boolean(source.DescribeClusters);
        }
        if (source.DescribeExecutors != null) {
            this.DescribeExecutors = new Boolean(source.DescribeExecutors);
        }
        if (source.DescribeAdminUsers != null) {
            this.DescribeAdminUsers = new Boolean(source.DescribeAdminUsers);
        }
        if (source.DescribeMemberCount != null) {
            this.DescribeMemberCount = new Boolean(source.DescribeMemberCount);
        }
        if (source.DescribeCreator != null) {
            this.DescribeCreator = new Boolean(source.DescribeCreator);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DescribeClusters", this.DescribeClusters);
        this.setParamSimple(map, prefix + "DescribeExecutors", this.DescribeExecutors);
        this.setParamSimple(map, prefix + "DescribeAdminUsers", this.DescribeAdminUsers);
        this.setParamSimple(map, prefix + "DescribeMemberCount", this.DescribeMemberCount);
        this.setParamSimple(map, prefix + "DescribeCreator", this.DescribeCreator);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);

    }
}

