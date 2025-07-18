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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserIdSetOfWorkGroupId extends AbstractModel {

    /**
    * Working group IDs
    */
    @SerializedName("WorkGroupId")
    @Expose
    private Long WorkGroupId;

    /**
    * User ID which matches the Uin on the CAM side
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
     * Get Working group IDs 
     * @return WorkGroupId Working group IDs
     */
    public Long getWorkGroupId() {
        return this.WorkGroupId;
    }

    /**
     * Set Working group IDs
     * @param WorkGroupId Working group IDs
     */
    public void setWorkGroupId(Long WorkGroupId) {
        this.WorkGroupId = WorkGroupId;
    }

    /**
     * Get User ID which matches the Uin on the CAM side 
     * @return UserIds User ID which matches the Uin on the CAM side
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set User ID which matches the Uin on the CAM side
     * @param UserIds User ID which matches the Uin on the CAM side
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    public UserIdSetOfWorkGroupId() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserIdSetOfWorkGroupId(UserIdSetOfWorkGroupId source) {
        if (source.WorkGroupId != null) {
            this.WorkGroupId = new Long(source.WorkGroupId);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkGroupId", this.WorkGroupId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);

    }
}

