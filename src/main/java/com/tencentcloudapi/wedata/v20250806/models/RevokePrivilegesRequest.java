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

public class RevokePrivilegesRequest extends AbstractModel {

    /**
    * Resource array. data source is ResourceType and ResourceUri in the Resource of the ListPermissions API response.
    */
    @SerializedName("Resources")
    @Expose
    private PrivilegeResource [] Resources;

    /**
    * Authorization revoked principal array. need to pay attention to parameter assembly.
1. for SubjectType and SubjectValues, refer to SubjectType and SubjectValue in SubjectDetails returned by the ListPermissions api.
2. during batch reclamation, the length of the Subjects array must match the length of the Privileges permission point, and the data must have a one-to-one correspondence.
    */
    @SerializedName("Subjects")
    @Expose
    private Subject [] Subjects;

    /**
    * Permission point, Name originates from the Name in PermissionDetails of the ListPermissions API response, such as BROWSE, GRANT_PRIVILEGES.
    */
    @SerializedName("Privileges")
    @Expose
    private PrivilegeInfo [] Privileges;

    /**
     * Get Resource array. data source is ResourceType and ResourceUri in the Resource of the ListPermissions API response. 
     * @return Resources Resource array. data source is ResourceType and ResourceUri in the Resource of the ListPermissions API response.
     */
    public PrivilegeResource [] getResources() {
        return this.Resources;
    }

    /**
     * Set Resource array. data source is ResourceType and ResourceUri in the Resource of the ListPermissions API response.
     * @param Resources Resource array. data source is ResourceType and ResourceUri in the Resource of the ListPermissions API response.
     */
    public void setResources(PrivilegeResource [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get Authorization revoked principal array. need to pay attention to parameter assembly.
1. for SubjectType and SubjectValues, refer to SubjectType and SubjectValue in SubjectDetails returned by the ListPermissions api.
2. during batch reclamation, the length of the Subjects array must match the length of the Privileges permission point, and the data must have a one-to-one correspondence. 
     * @return Subjects Authorization revoked principal array. need to pay attention to parameter assembly.
1. for SubjectType and SubjectValues, refer to SubjectType and SubjectValue in SubjectDetails returned by the ListPermissions api.
2. during batch reclamation, the length of the Subjects array must match the length of the Privileges permission point, and the data must have a one-to-one correspondence.
     */
    public Subject [] getSubjects() {
        return this.Subjects;
    }

    /**
     * Set Authorization revoked principal array. need to pay attention to parameter assembly.
1. for SubjectType and SubjectValues, refer to SubjectType and SubjectValue in SubjectDetails returned by the ListPermissions api.
2. during batch reclamation, the length of the Subjects array must match the length of the Privileges permission point, and the data must have a one-to-one correspondence.
     * @param Subjects Authorization revoked principal array. need to pay attention to parameter assembly.
1. for SubjectType and SubjectValues, refer to SubjectType and SubjectValue in SubjectDetails returned by the ListPermissions api.
2. during batch reclamation, the length of the Subjects array must match the length of the Privileges permission point, and the data must have a one-to-one correspondence.
     */
    public void setSubjects(Subject [] Subjects) {
        this.Subjects = Subjects;
    }

    /**
     * Get Permission point, Name originates from the Name in PermissionDetails of the ListPermissions API response, such as BROWSE, GRANT_PRIVILEGES. 
     * @return Privileges Permission point, Name originates from the Name in PermissionDetails of the ListPermissions API response, such as BROWSE, GRANT_PRIVILEGES.
     */
    public PrivilegeInfo [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set Permission point, Name originates from the Name in PermissionDetails of the ListPermissions API response, such as BROWSE, GRANT_PRIVILEGES.
     * @param Privileges Permission point, Name originates from the Name in PermissionDetails of the ListPermissions API response, such as BROWSE, GRANT_PRIVILEGES.
     */
    public void setPrivileges(PrivilegeInfo [] Privileges) {
        this.Privileges = Privileges;
    }

    public RevokePrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RevokePrivilegesRequest(RevokePrivilegesRequest source) {
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

