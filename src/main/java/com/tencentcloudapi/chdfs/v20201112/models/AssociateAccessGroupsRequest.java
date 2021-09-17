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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociateAccessGroupsRequest extends AbstractModel{

    /**
    * Mount point ID
    */
    @SerializedName("MountPointId")
    @Expose
    private String MountPointId;

    /**
    * List of permission group IDs
    */
    @SerializedName("AccessGroupIds")
    @Expose
    private String [] AccessGroupIds;

    /**
     * Get Mount point ID 
     * @return MountPointId Mount point ID
     */
    public String getMountPointId() {
        return this.MountPointId;
    }

    /**
     * Set Mount point ID
     * @param MountPointId Mount point ID
     */
    public void setMountPointId(String MountPointId) {
        this.MountPointId = MountPointId;
    }

    /**
     * Get List of permission group IDs 
     * @return AccessGroupIds List of permission group IDs
     */
    public String [] getAccessGroupIds() {
        return this.AccessGroupIds;
    }

    /**
     * Set List of permission group IDs
     * @param AccessGroupIds List of permission group IDs
     */
    public void setAccessGroupIds(String [] AccessGroupIds) {
        this.AccessGroupIds = AccessGroupIds;
    }

    public AssociateAccessGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateAccessGroupsRequest(AssociateAccessGroupsRequest source) {
        if (source.MountPointId != null) {
            this.MountPointId = new String(source.MountPointId);
        }
        if (source.AccessGroupIds != null) {
            this.AccessGroupIds = new String[source.AccessGroupIds.length];
            for (int i = 0; i < source.AccessGroupIds.length; i++) {
                this.AccessGroupIds[i] = new String(source.AccessGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MountPointId", this.MountPointId);
        this.setParamArraySimple(map, prefix + "AccessGroupIds.", this.AccessGroupIds);

    }
}

