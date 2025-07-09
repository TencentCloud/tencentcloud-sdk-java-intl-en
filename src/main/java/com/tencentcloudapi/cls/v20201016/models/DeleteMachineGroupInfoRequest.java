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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteMachineGroupInfoRequest extends AbstractModel {

    /**
    * Machine group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Machine group type
Supported types: `ip` and `label`
    */
    @SerializedName("MachineGroupType")
    @Expose
    private MachineGroupTypeInfo MachineGroupType;

    /**
     * Get Machine group ID 
     * @return GroupId Machine group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Machine group ID
     * @param GroupId Machine group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Machine group type
Supported types: `ip` and `label` 
     * @return MachineGroupType Machine group type
Supported types: `ip` and `label`
     */
    public MachineGroupTypeInfo getMachineGroupType() {
        return this.MachineGroupType;
    }

    /**
     * Set Machine group type
Supported types: `ip` and `label`
     * @param MachineGroupType Machine group type
Supported types: `ip` and `label`
     */
    public void setMachineGroupType(MachineGroupTypeInfo MachineGroupType) {
        this.MachineGroupType = MachineGroupType;
    }

    public DeleteMachineGroupInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMachineGroupInfoRequest(DeleteMachineGroupInfoRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.MachineGroupType != null) {
            this.MachineGroupType = new MachineGroupTypeInfo(source.MachineGroupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "MachineGroupType.", this.MachineGroupType);

    }
}

