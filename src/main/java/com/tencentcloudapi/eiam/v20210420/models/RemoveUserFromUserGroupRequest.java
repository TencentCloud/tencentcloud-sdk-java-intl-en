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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveUserFromUserGroupRequest extends AbstractModel {

    /**
    * List of IDs of the users to be added to the user group.
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * User group ID, which is globally unique.
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
     * Get List of IDs of the users to be added to the user group. 
     * @return UserIds List of IDs of the users to be added to the user group.
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set List of IDs of the users to be added to the user group.
     * @param UserIds List of IDs of the users to be added to the user group.
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get User group ID, which is globally unique. 
     * @return UserGroupId User group ID, which is globally unique.
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set User group ID, which is globally unique.
     * @param UserGroupId User group ID, which is globally unique.
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    public RemoveUserFromUserGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveUserFromUserGroupRequest(RemoveUserFromUserGroupRequest source) {
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);

    }
}

