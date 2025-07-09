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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneSecurityGroupRequest extends AbstractModel {

    /**
    * Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through the <a href="https://intl.cloud.tencent.com/document/product/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * The name of security group clone. You can enter any name within 60 characters. If this parameter is left empty, the security group clone will use the name of the source security group.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Description of the security group clone. You can enter up to 100 characters. If this parameter is left empty, the security group clone will use the description of the source security group.
    */
    @SerializedName("GroupDescription")
    @Expose
    private String GroupDescription;

    /**
    * Project ID. Default value: 0. You can query it on the <a href="https://console.cloud.tencent.com/project">project management page</a> of the Tencent Cloud console.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * The region of the source security group for a cross-region clone. For example, to clone the security group in Guangzhou to Shanghai, set it to `ap-guangzhou`.
    */
    @SerializedName("RemoteRegion")
    @Expose
    private String RemoteRegion;

    /**
     * Get Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through the <a href="https://intl.cloud.tencent.com/document/product/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API. 
     * @return SecurityGroupId Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through the <a href="https://intl.cloud.tencent.com/document/product/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API.
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through the <a href="https://intl.cloud.tencent.com/document/product/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API.
     * @param SecurityGroupId Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through the <a href="https://intl.cloud.tencent.com/document/product/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a> API.
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get The name of security group clone. You can enter any name within 60 characters. If this parameter is left empty, the security group clone will use the name of the source security group. 
     * @return GroupName The name of security group clone. You can enter any name within 60 characters. If this parameter is left empty, the security group clone will use the name of the source security group.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set The name of security group clone. You can enter any name within 60 characters. If this parameter is left empty, the security group clone will use the name of the source security group.
     * @param GroupName The name of security group clone. You can enter any name within 60 characters. If this parameter is left empty, the security group clone will use the name of the source security group.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Description of the security group clone. You can enter up to 100 characters. If this parameter is left empty, the security group clone will use the description of the source security group. 
     * @return GroupDescription Description of the security group clone. You can enter up to 100 characters. If this parameter is left empty, the security group clone will use the description of the source security group.
     */
    public String getGroupDescription() {
        return this.GroupDescription;
    }

    /**
     * Set Description of the security group clone. You can enter up to 100 characters. If this parameter is left empty, the security group clone will use the description of the source security group.
     * @param GroupDescription Description of the security group clone. You can enter up to 100 characters. If this parameter is left empty, the security group clone will use the description of the source security group.
     */
    public void setGroupDescription(String GroupDescription) {
        this.GroupDescription = GroupDescription;
    }

    /**
     * Get Project ID. Default value: 0. You can query it on the <a href="https://console.cloud.tencent.com/project">project management page</a> of the Tencent Cloud console. 
     * @return ProjectId Project ID. Default value: 0. You can query it on the <a href="https://console.cloud.tencent.com/project">project management page</a> of the Tencent Cloud console.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. Default value: 0. You can query it on the <a href="https://console.cloud.tencent.com/project">project management page</a> of the Tencent Cloud console.
     * @param ProjectId Project ID. Default value: 0. You can query it on the <a href="https://console.cloud.tencent.com/project">project management page</a> of the Tencent Cloud console.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get The region of the source security group for a cross-region clone. For example, to clone the security group in Guangzhou to Shanghai, set it to `ap-guangzhou`. 
     * @return RemoteRegion The region of the source security group for a cross-region clone. For example, to clone the security group in Guangzhou to Shanghai, set it to `ap-guangzhou`.
     */
    public String getRemoteRegion() {
        return this.RemoteRegion;
    }

    /**
     * Set The region of the source security group for a cross-region clone. For example, to clone the security group in Guangzhou to Shanghai, set it to `ap-guangzhou`.
     * @param RemoteRegion The region of the source security group for a cross-region clone. For example, to clone the security group in Guangzhou to Shanghai, set it to `ap-guangzhou`.
     */
    public void setRemoteRegion(String RemoteRegion) {
        this.RemoteRegion = RemoteRegion;
    }

    public CloneSecurityGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneSecurityGroupRequest(CloneSecurityGroupRequest source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupDescription != null) {
            this.GroupDescription = new String(source.GroupDescription);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RemoteRegion != null) {
            this.RemoteRegion = new String(source.RemoteRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupDescription", this.GroupDescription);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RemoteRegion", this.RemoteRegion);

    }
}

