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

public class InheritedForm extends AbstractModel{

    /**
    * List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserGroupIds")
    @Expose
    private String [] UserGroupIds;

    /**
    * List of IDs of the user's organization nodes.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgNodeIds")
    @Expose
    private String [] OrgNodeIds;

    /**
     * Get List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserGroupIds List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getUserGroupIds() {
        return this.UserGroupIds;
    }

    /**
     * Set List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserGroupIds List of IDs of the user's user groups.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserGroupIds(String [] UserGroupIds) {
        this.UserGroupIds = UserGroupIds;
    }

    /**
     * Get List of IDs of the user's organization nodes.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrgNodeIds List of IDs of the user's organization nodes.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getOrgNodeIds() {
        return this.OrgNodeIds;
    }

    /**
     * Set List of IDs of the user's organization nodes.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrgNodeIds List of IDs of the user's organization nodes.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgNodeIds(String [] OrgNodeIds) {
        this.OrgNodeIds = OrgNodeIds;
    }

    public InheritedForm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InheritedForm(InheritedForm source) {
        if (source.UserGroupIds != null) {
            this.UserGroupIds = new String[source.UserGroupIds.length];
            for (int i = 0; i < source.UserGroupIds.length; i++) {
                this.UserGroupIds[i] = new String(source.UserGroupIds[i]);
            }
        }
        if (source.OrgNodeIds != null) {
            this.OrgNodeIds = new String[source.OrgNodeIds.length];
            for (int i = 0; i < source.OrgNodeIds.length; i++) {
                this.OrgNodeIds[i] = new String(source.OrgNodeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "UserGroupIds.", this.UserGroupIds);
        this.setParamArraySimple(map, prefix + "OrgNodeIds.", this.OrgNodeIds);

    }
}

