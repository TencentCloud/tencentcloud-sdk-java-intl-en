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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceGroup extends AbstractModel {

    /**
    * Instance group ID.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * Instance group name.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InstanceGroupName")
    @Expose
    private String InstanceGroupName;

    /**
     * Get Instance group ID.
Note: This field may return null, indicating that no valid value was found. 
     * @return InstanceGroupId Instance group ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set Instance group ID.
Note: This field may return null, indicating that no valid value was found.
     * @param InstanceGroupId Instance group ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get Instance group name.
Note: This field may return null, indicating that no valid value was found. 
     * @return InstanceGroupName Instance group name.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getInstanceGroupName() {
        return this.InstanceGroupName;
    }

    /**
     * Set Instance group name.
Note: This field may return null, indicating that no valid value was found.
     * @param InstanceGroupName Instance group name.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setInstanceGroupName(String InstanceGroupName) {
        this.InstanceGroupName = InstanceGroupName;
    }

    public InstanceGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceGroup(InstanceGroup source) {
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new Long(source.InstanceGroupId);
        }
        if (source.InstanceGroupName != null) {
            this.InstanceGroupName = new String(source.InstanceGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "InstanceGroupName", this.InstanceGroupName);

    }
}

