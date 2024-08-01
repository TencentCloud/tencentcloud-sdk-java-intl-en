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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfo extends AbstractModel {

    /**
    * User ID, which is the same as the sub-user UIN
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * User description, which can make it easy to identify different users.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserDescription")
    @Expose
    private String UserDescription;

    /**
    * Collection of permissions solely bound to users
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicySet")
    @Expose
    private Policy [] PolicySet;

    /**
    * Creator of the current user
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Creation time, and the example of the format is at 16:19:32 on Jul 28, 2021.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Collection of associated working groups
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkGroupSet")
    @Expose
    private WorkGroupMessage [] WorkGroupSet;

    /**
    * Whether it is the root account
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsOwner")
    @Expose
    private Boolean IsOwner;

    /**
    * Types of users. ADMIN: administrators; COMMON: general users
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * User alias
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
     * Get User ID, which is the same as the sub-user UIN 
     * @return UserId User ID, which is the same as the sub-user UIN
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID, which is the same as the sub-user UIN
     * @param UserId User ID, which is the same as the sub-user UIN
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get User description, which can make it easy to identify different users.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserDescription User description, which can make it easy to identify different users.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserDescription() {
        return this.UserDescription;
    }

    /**
     * Set User description, which can make it easy to identify different users.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserDescription User description, which can make it easy to identify different users.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserDescription(String UserDescription) {
        this.UserDescription = UserDescription;
    }

    /**
     * Get Collection of permissions solely bound to users
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicySet Collection of permissions solely bound to users
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Policy [] getPolicySet() {
        return this.PolicySet;
    }

    /**
     * Set Collection of permissions solely bound to users
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicySet Collection of permissions solely bound to users
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicySet(Policy [] PolicySet) {
        this.PolicySet = PolicySet;
    }

    /**
     * Get Creator of the current user 
     * @return Creator Creator of the current user
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator of the current user
     * @param Creator Creator of the current user
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Creation time, and the example of the format is at 16:19:32 on Jul 28, 2021. 
     * @return CreateTime Creation time, and the example of the format is at 16:19:32 on Jul 28, 2021.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time, and the example of the format is at 16:19:32 on Jul 28, 2021.
     * @param CreateTime Creation time, and the example of the format is at 16:19:32 on Jul 28, 2021.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Collection of associated working groups
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkGroupSet Collection of associated working groups
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WorkGroupMessage [] getWorkGroupSet() {
        return this.WorkGroupSet;
    }

    /**
     * Set Collection of associated working groups
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkGroupSet Collection of associated working groups
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkGroupSet(WorkGroupMessage [] WorkGroupSet) {
        this.WorkGroupSet = WorkGroupSet;
    }

    /**
     * Get Whether it is the root account
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsOwner Whether it is the root account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsOwner() {
        return this.IsOwner;
    }

    /**
     * Set Whether it is the root account
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsOwner Whether it is the root account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsOwner(Boolean IsOwner) {
        this.IsOwner = IsOwner;
    }

    /**
     * Get Types of users. ADMIN: administrators; COMMON: general users
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserType Types of users. ADMIN: administrators; COMMON: general users
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set Types of users. ADMIN: administrators; COMMON: general users
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserType Types of users. ADMIN: administrators; COMMON: general users
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get User alias
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserAlias User alias
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set User alias
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserAlias User alias
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    public UserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfo(UserInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserDescription != null) {
            this.UserDescription = new String(source.UserDescription);
        }
        if (source.PolicySet != null) {
            this.PolicySet = new Policy[source.PolicySet.length];
            for (int i = 0; i < source.PolicySet.length; i++) {
                this.PolicySet[i] = new Policy(source.PolicySet[i]);
            }
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.WorkGroupSet != null) {
            this.WorkGroupSet = new WorkGroupMessage[source.WorkGroupSet.length];
            for (int i = 0; i < source.WorkGroupSet.length; i++) {
                this.WorkGroupSet[i] = new WorkGroupMessage(source.WorkGroupSet[i]);
            }
        }
        if (source.IsOwner != null) {
            this.IsOwner = new Boolean(source.IsOwner);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.UserAlias != null) {
            this.UserAlias = new String(source.UserAlias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserDescription", this.UserDescription);
        this.setParamArrayObj(map, prefix + "PolicySet.", this.PolicySet);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "WorkGroupSet.", this.WorkGroupSet);
        this.setParamSimple(map, prefix + "IsOwner", this.IsOwner);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "UserAlias", this.UserAlias);

    }
}

