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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationAuthorizationInfo extends AbstractModel{

    /**
    * List of the user's accounts under authorized applications
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationAccounts")
    @Expose
    private String [] ApplicationAccounts;

    /**
    * Application ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * List of IDs of the user's user groups and organization nodes that have access to the application.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InheritedForm")
    @Expose
    private InheritedForm InheritedForm;

    /**
    * Application name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Application creation time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedDate")
    @Expose
    private String CreatedDate;

    /**
     * Get List of the user's accounts under authorized applications
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationAccounts List of the user's accounts under authorized applications
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getApplicationAccounts() {
        return this.ApplicationAccounts;
    }

    /**
     * Set List of the user's accounts under authorized applications
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApplicationAccounts List of the user's accounts under authorized applications
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationAccounts(String [] ApplicationAccounts) {
        this.ApplicationAccounts = ApplicationAccounts;
    }

    /**
     * Get Application ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationId Application ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApplicationId Application ID, which is globally unique.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get List of IDs of the user's user groups and organization nodes that have access to the application.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InheritedForm List of IDs of the user's user groups and organization nodes that have access to the application.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public InheritedForm getInheritedForm() {
        return this.InheritedForm;
    }

    /**
     * Set List of IDs of the user's user groups and organization nodes that have access to the application.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InheritedForm List of IDs of the user's user groups and organization nodes that have access to the application.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInheritedForm(InheritedForm InheritedForm) {
        this.InheritedForm = InheritedForm;
    }

    /**
     * Get Application name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName Application name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName Application name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Application creation time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedDate Application creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set Application creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedDate Application creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public ApplicationAuthorizationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationAuthorizationInfo(ApplicationAuthorizationInfo source) {
        if (source.ApplicationAccounts != null) {
            this.ApplicationAccounts = new String[source.ApplicationAccounts.length];
            for (int i = 0; i < source.ApplicationAccounts.length; i++) {
                this.ApplicationAccounts[i] = new String(source.ApplicationAccounts[i]);
            }
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.InheritedForm != null) {
            this.InheritedForm = new InheritedForm(source.InheritedForm);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new String(source.CreatedDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ApplicationAccounts.", this.ApplicationAccounts);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamObj(map, prefix + "InheritedForm.", this.InheritedForm);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);

    }
}

