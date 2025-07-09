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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthorizationUserResouceInfo extends AbstractModel {

    /**
    * Resource ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Authorized resource
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Inheritance relationship
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InheritedForm")
    @Expose
    private InheritedForm InheritedForm;

    /**
    * Application account
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationAccounts")
    @Expose
    private String [] ApplicationAccounts;

    /**
    * Resource name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
     * Get Resource ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ResourceId Resource ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ResourceId Resource ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ResourceType Resource type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ResourceType Resource type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Authorized resource
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Resource Authorized resource
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Authorized resource
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Resource Authorized resource
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Inheritance relationship
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InheritedForm Inheritance relationship
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public InheritedForm getInheritedForm() {
        return this.InheritedForm;
    }

    /**
     * Set Inheritance relationship
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InheritedForm Inheritance relationship
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInheritedForm(InheritedForm InheritedForm) {
        this.InheritedForm = InheritedForm;
    }

    /**
     * Get Application account
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationAccounts Application account
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getApplicationAccounts() {
        return this.ApplicationAccounts;
    }

    /**
     * Set Application account
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApplicationAccounts Application account
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationAccounts(String [] ApplicationAccounts) {
        this.ApplicationAccounts = ApplicationAccounts;
    }

    /**
     * Get Resource name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ResourceName Resource name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ResourceName Resource name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    public AuthorizationUserResouceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthorizationUserResouceInfo(AuthorizationUserResouceInfo source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.InheritedForm != null) {
            this.InheritedForm = new InheritedForm(source.InheritedForm);
        }
        if (source.ApplicationAccounts != null) {
            this.ApplicationAccounts = new String[source.ApplicationAccounts.length];
            for (int i = 0; i < source.ApplicationAccounts.length; i++) {
                this.ApplicationAccounts[i] = new String(source.ApplicationAccounts[i]);
            }
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamObj(map, prefix + "InheritedForm.", this.InheritedForm);
        this.setParamArraySimple(map, prefix + "ApplicationAccounts.", this.ApplicationAccounts);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);

    }
}

