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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserSyncProvisioningRequest extends AbstractModel {

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * CAM user synchronization information.
    */
    @SerializedName("UserSyncProvisionings")
    @Expose
    private UserSyncProvisioning [] UserSyncProvisionings;

    /**
     * Get Space ID. 
     * @return ZoneId Space ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Space ID.
     * @param ZoneId Space ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get CAM user synchronization information. 
     * @return UserSyncProvisionings CAM user synchronization information.
     */
    public UserSyncProvisioning [] getUserSyncProvisionings() {
        return this.UserSyncProvisionings;
    }

    /**
     * Set CAM user synchronization information.
     * @param UserSyncProvisionings CAM user synchronization information.
     */
    public void setUserSyncProvisionings(UserSyncProvisioning [] UserSyncProvisionings) {
        this.UserSyncProvisionings = UserSyncProvisionings;
    }

    public CreateUserSyncProvisioningRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserSyncProvisioningRequest(CreateUserSyncProvisioningRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.UserSyncProvisionings != null) {
            this.UserSyncProvisionings = new UserSyncProvisioning[source.UserSyncProvisionings.length];
            for (int i = 0; i < source.UserSyncProvisionings.length; i++) {
                this.UserSyncProvisionings[i] = new UserSyncProvisioning(source.UserSyncProvisionings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "UserSyncProvisionings.", this.UserSyncProvisionings);

    }
}

