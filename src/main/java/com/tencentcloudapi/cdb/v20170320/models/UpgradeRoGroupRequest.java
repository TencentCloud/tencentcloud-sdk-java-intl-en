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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeRoGroupRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ID of the RO group.
    */
    @SerializedName("UniqRoGroupId")
    @Expose
    private String UniqRoGroupId;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ID of the RO group. 
     * @return UniqRoGroupId ID of the RO group.
     */
    public String getUniqRoGroupId() {
        return this.UniqRoGroupId;
    }

    /**
     * Set ID of the RO group.
     * @param UniqRoGroupId ID of the RO group.
     */
    public void setUniqRoGroupId(String UniqRoGroupId) {
        this.UniqRoGroupId = UniqRoGroupId;
    }

    public UpgradeRoGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeRoGroupRequest(UpgradeRoGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UniqRoGroupId != null) {
            this.UniqRoGroupId = new String(source.UniqRoGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UniqRoGroupId", this.UniqRoGroupId);

    }
}

