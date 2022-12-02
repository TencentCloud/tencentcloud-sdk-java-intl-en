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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleItem extends AbstractModel{

    /**
    * Role name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Role name after migration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NewRoleName")
    @Expose
    private String NewRoleName;

    /**
     * Get Role name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleName Role name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleName Role name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get Role name after migration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NewRoleName Role name after migration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNewRoleName() {
        return this.NewRoleName;
    }

    /**
     * Set Role name after migration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NewRoleName Role name after migration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNewRoleName(String NewRoleName) {
        this.NewRoleName = NewRoleName;
    }

    public RoleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleItem(RoleItem source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.NewRoleName != null) {
            this.NewRoleName = new String(source.NewRoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "NewRoleName", this.NewRoleName);

    }
}

