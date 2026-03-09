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

public class ResourcePrivilegeDetail extends AbstractModel {

    /**
    * Resource.
    */
    @SerializedName("Resource")
    @Expose
    private PrivilegeResource Resource;

    /**
    * Subject.
    */
    @SerializedName("SubjectDetails")
    @Expose
    private SubjectInfo [] SubjectDetails;

    /**
    * Permission details.
    */
    @SerializedName("PermissionDetails")
    @Expose
    private PrivilegeInfo [] PermissionDetails;

    /**
     * Get Resource. 
     * @return Resource Resource.
     */
    public PrivilegeResource getResource() {
        return this.Resource;
    }

    /**
     * Set Resource.
     * @param Resource Resource.
     */
    public void setResource(PrivilegeResource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Subject. 
     * @return SubjectDetails Subject.
     */
    public SubjectInfo [] getSubjectDetails() {
        return this.SubjectDetails;
    }

    /**
     * Set Subject.
     * @param SubjectDetails Subject.
     */
    public void setSubjectDetails(SubjectInfo [] SubjectDetails) {
        this.SubjectDetails = SubjectDetails;
    }

    /**
     * Get Permission details. 
     * @return PermissionDetails Permission details.
     */
    public PrivilegeInfo [] getPermissionDetails() {
        return this.PermissionDetails;
    }

    /**
     * Set Permission details.
     * @param PermissionDetails Permission details.
     */
    public void setPermissionDetails(PrivilegeInfo [] PermissionDetails) {
        this.PermissionDetails = PermissionDetails;
    }

    public ResourcePrivilegeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourcePrivilegeDetail(ResourcePrivilegeDetail source) {
        if (source.Resource != null) {
            this.Resource = new PrivilegeResource(source.Resource);
        }
        if (source.SubjectDetails != null) {
            this.SubjectDetails = new SubjectInfo[source.SubjectDetails.length];
            for (int i = 0; i < source.SubjectDetails.length; i++) {
                this.SubjectDetails[i] = new SubjectInfo(source.SubjectDetails[i]);
            }
        }
        if (source.PermissionDetails != null) {
            this.PermissionDetails = new PrivilegeInfo[source.PermissionDetails.length];
            for (int i = 0; i < source.PermissionDetails.length; i++) {
                this.PermissionDetails[i] = new PrivilegeInfo(source.PermissionDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamArrayObj(map, prefix + "SubjectDetails.", this.SubjectDetails);
        this.setParamArrayObj(map, prefix + "PermissionDetails.", this.PermissionDetails);

    }
}

