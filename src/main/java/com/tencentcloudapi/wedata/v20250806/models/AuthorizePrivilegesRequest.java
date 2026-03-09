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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthorizePrivilegesRequest extends AbstractModel {

    /**
    * Resource array.
ResourceType: originates from the ResourceType returned by the GetGrantPrivilegesSTD API in the TCCATALOG module, and change to capitalize the first letter, such as METALAKE corresponding to METALAKE.
ResourceUri depends on ResourceType. fixed as default for Metalake. use the three-segment format of catalog for other categories, such as.
-Metalake, fixed as default.
-Catalog. specifies the catalogName.
-Schema. valid values: catalogName.SchemaName.
-Table, in the format of catalogName.SchemaName.TableName.

    */
    @SerializedName("Resources")
    @Expose
    private PrivilegeResource [] Resources;

    /**
    * Authorization entity array. specifies the SubjectType and corresponding SubjectValue value rules.
-User.
-User id obtained from DescribeTenantUserList.
-Project.
-ProjectId from the DescribeUserProjects request parameters structure.
-Role (project-level role).
-First call DescribeUserProjects to obtain the project ID (ProjectId), then call DescribeRoleList to get the role ID (RoleId), and combine them as $ProjectId.$ProjectId.RoleId, for example "3085649716411588608.308335260274237440".
-GlobalRole (platform-level role).
-AllAccountUsers all users.
-Another ID, taken from RoleId in DescribeTenantRole.
    */
    @SerializedName("Subjects")
    @Expose
    private Subject [] Subjects;

    /**
    * Permission point, comes from the NAME in various Privileges returned by the GetGrantPrivilegesSTD API in the TCCATALOG module.
    */
    @SerializedName("Privileges")
    @Expose
    private PrivilegeInfo [] Privileges;

    /**
     * Get Resource array.
ResourceType: originates from the ResourceType returned by the GetGrantPrivilegesSTD API in the TCCATALOG module, and change to capitalize the first letter, such as METALAKE corresponding to METALAKE.
ResourceUri depends on ResourceType. fixed as default for Metalake. use the three-segment format of catalog for other categories, such as.
-Metalake, fixed as default.
-Catalog. specifies the catalogName.
-Schema. valid values: catalogName.SchemaName.
-Table, in the format of catalogName.SchemaName.TableName.
 
     * @return Resources Resource array.
ResourceType: originates from the ResourceType returned by the GetGrantPrivilegesSTD API in the TCCATALOG module, and change to capitalize the first letter, such as METALAKE corresponding to METALAKE.
ResourceUri depends on ResourceType. fixed as default for Metalake. use the three-segment format of catalog for other categories, such as.
-Metalake, fixed as default.
-Catalog. specifies the catalogName.
-Schema. valid values: catalogName.SchemaName.
-Table, in the format of catalogName.SchemaName.TableName.

     */
    public PrivilegeResource [] getResources() {
        return this.Resources;
    }

    /**
     * Set Resource array.
ResourceType: originates from the ResourceType returned by the GetGrantPrivilegesSTD API in the TCCATALOG module, and change to capitalize the first letter, such as METALAKE corresponding to METALAKE.
ResourceUri depends on ResourceType. fixed as default for Metalake. use the three-segment format of catalog for other categories, such as.
-Metalake, fixed as default.
-Catalog. specifies the catalogName.
-Schema. valid values: catalogName.SchemaName.
-Table, in the format of catalogName.SchemaName.TableName.

     * @param Resources Resource array.
ResourceType: originates from the ResourceType returned by the GetGrantPrivilegesSTD API in the TCCATALOG module, and change to capitalize the first letter, such as METALAKE corresponding to METALAKE.
ResourceUri depends on ResourceType. fixed as default for Metalake. use the three-segment format of catalog for other categories, such as.
-Metalake, fixed as default.
-Catalog. specifies the catalogName.
-Schema. valid values: catalogName.SchemaName.
-Table, in the format of catalogName.SchemaName.TableName.

     */
    public void setResources(PrivilegeResource [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get Authorization entity array. specifies the SubjectType and corresponding SubjectValue value rules.
-User.
-User id obtained from DescribeTenantUserList.
-Project.
-ProjectId from the DescribeUserProjects request parameters structure.
-Role (project-level role).
-First call DescribeUserProjects to obtain the project ID (ProjectId), then call DescribeRoleList to get the role ID (RoleId), and combine them as $ProjectId.$ProjectId.RoleId, for example "3085649716411588608.308335260274237440".
-GlobalRole (platform-level role).
-AllAccountUsers all users.
-Another ID, taken from RoleId in DescribeTenantRole. 
     * @return Subjects Authorization entity array. specifies the SubjectType and corresponding SubjectValue value rules.
-User.
-User id obtained from DescribeTenantUserList.
-Project.
-ProjectId from the DescribeUserProjects request parameters structure.
-Role (project-level role).
-First call DescribeUserProjects to obtain the project ID (ProjectId), then call DescribeRoleList to get the role ID (RoleId), and combine them as $ProjectId.$ProjectId.RoleId, for example "3085649716411588608.308335260274237440".
-GlobalRole (platform-level role).
-AllAccountUsers all users.
-Another ID, taken from RoleId in DescribeTenantRole.
     */
    public Subject [] getSubjects() {
        return this.Subjects;
    }

    /**
     * Set Authorization entity array. specifies the SubjectType and corresponding SubjectValue value rules.
-User.
-User id obtained from DescribeTenantUserList.
-Project.
-ProjectId from the DescribeUserProjects request parameters structure.
-Role (project-level role).
-First call DescribeUserProjects to obtain the project ID (ProjectId), then call DescribeRoleList to get the role ID (RoleId), and combine them as $ProjectId.$ProjectId.RoleId, for example "3085649716411588608.308335260274237440".
-GlobalRole (platform-level role).
-AllAccountUsers all users.
-Another ID, taken from RoleId in DescribeTenantRole.
     * @param Subjects Authorization entity array. specifies the SubjectType and corresponding SubjectValue value rules.
-User.
-User id obtained from DescribeTenantUserList.
-Project.
-ProjectId from the DescribeUserProjects request parameters structure.
-Role (project-level role).
-First call DescribeUserProjects to obtain the project ID (ProjectId), then call DescribeRoleList to get the role ID (RoleId), and combine them as $ProjectId.$ProjectId.RoleId, for example "3085649716411588608.308335260274237440".
-GlobalRole (platform-level role).
-AllAccountUsers all users.
-Another ID, taken from RoleId in DescribeTenantRole.
     */
    public void setSubjects(Subject [] Subjects) {
        this.Subjects = Subjects;
    }

    /**
     * Get Permission point, comes from the NAME in various Privileges returned by the GetGrantPrivilegesSTD API in the TCCATALOG module. 
     * @return Privileges Permission point, comes from the NAME in various Privileges returned by the GetGrantPrivilegesSTD API in the TCCATALOG module.
     */
    public PrivilegeInfo [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set Permission point, comes from the NAME in various Privileges returned by the GetGrantPrivilegesSTD API in the TCCATALOG module.
     * @param Privileges Permission point, comes from the NAME in various Privileges returned by the GetGrantPrivilegesSTD API in the TCCATALOG module.
     */
    public void setPrivileges(PrivilegeInfo [] Privileges) {
        this.Privileges = Privileges;
    }

    public AuthorizePrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthorizePrivilegesRequest(AuthorizePrivilegesRequest source) {
        if (source.Resources != null) {
            this.Resources = new PrivilegeResource[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new PrivilegeResource(source.Resources[i]);
            }
        }
        if (source.Subjects != null) {
            this.Subjects = new Subject[source.Subjects.length];
            for (int i = 0; i < source.Subjects.length; i++) {
                this.Subjects[i] = new Subject(source.Subjects[i]);
            }
        }
        if (source.Privileges != null) {
            this.Privileges = new PrivilegeInfo[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new PrivilegeInfo(source.Privileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamArrayObj(map, prefix + "Subjects.", this.Subjects);
        this.setParamArrayObj(map, prefix + "Privileges.", this.Privileges);

    }
}

