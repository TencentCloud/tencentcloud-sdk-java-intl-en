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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductEventListEventsGroupInfo extends AbstractModel{

    /**
    * Policy ID.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Policy name.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get Policy ID.
Note: This field may return null, indicating that no valid value was found. 
     * @return GroupId Policy ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Policy ID.
Note: This field may return null, indicating that no valid value was found.
     * @param GroupId Policy ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Policy name.
Note: This field may return null, indicating that no valid value was found. 
     * @return GroupName Policy name.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Policy name.
Note: This field may return null, indicating that no valid value was found.
     * @param GroupName Policy name.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public DescribeProductEventListEventsGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProductEventListEventsGroupInfo(DescribeProductEventListEventsGroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

