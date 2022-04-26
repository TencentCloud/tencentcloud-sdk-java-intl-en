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

public class DescribeUserResourcesAuthorizationRequest extends AbstractModel{

    /**
    * Application ID.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * User ID. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Username. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Whether the query scope includes the application access of the user groups and organizations associated with the user. Valid values: false: no; true: yes. Default value: false.
    */
    @SerializedName("IncludeInheritedAuthorizations")
    @Expose
    private Boolean IncludeInheritedAuthorizations;

    /**
     * Get Application ID. 
     * @return ApplicationId Application ID.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID.
     * @param ApplicationId Application ID.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get User ID. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first. 
     * @return UserId User ID. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
     * @param UserId User ID. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Username. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first. 
     * @return UserName Username. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
     * @param UserName Username. You need to specify at least `UserName` or `UserId`. If both are specified, `UserName` will be used first.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Whether the query scope includes the application access of the user groups and organizations associated with the user. Valid values: false: no; true: yes. Default value: false. 
     * @return IncludeInheritedAuthorizations Whether the query scope includes the application access of the user groups and organizations associated with the user. Valid values: false: no; true: yes. Default value: false.
     */
    public Boolean getIncludeInheritedAuthorizations() {
        return this.IncludeInheritedAuthorizations;
    }

    /**
     * Set Whether the query scope includes the application access of the user groups and organizations associated with the user. Valid values: false: no; true: yes. Default value: false.
     * @param IncludeInheritedAuthorizations Whether the query scope includes the application access of the user groups and organizations associated with the user. Valid values: false: no; true: yes. Default value: false.
     */
    public void setIncludeInheritedAuthorizations(Boolean IncludeInheritedAuthorizations) {
        this.IncludeInheritedAuthorizations = IncludeInheritedAuthorizations;
    }

    public DescribeUserResourcesAuthorizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserResourcesAuthorizationRequest(DescribeUserResourcesAuthorizationRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.IncludeInheritedAuthorizations != null) {
            this.IncludeInheritedAuthorizations = new Boolean(source.IncludeInheritedAuthorizations);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "IncludeInheritedAuthorizations", this.IncludeInheritedAuthorizations);

    }
}

