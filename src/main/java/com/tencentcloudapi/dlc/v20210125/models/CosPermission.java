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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosPermission extends AbstractModel {

    /**
    * The COS path.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
    * The permissions. Valid values: `read` and `write`.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("Permissions")
    @Expose
    private String [] Permissions;

    /**
     * Get The COS path.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return CosPath The COS path.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getCosPath() {
        return this.CosPath;
    }

    /**
     * Set The COS path.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param CosPath The COS path.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setCosPath(String CosPath) {
        this.CosPath = CosPath;
    }

    /**
     * Get The permissions. Valid values: `read` and `write`.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return Permissions The permissions. Valid values: `read` and `write`.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set The permissions. Valid values: `read` and `write`.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param Permissions The permissions. Valid values: `read` and `write`.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setPermissions(String [] Permissions) {
        this.Permissions = Permissions;
    }

    public CosPermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosPermission(CosPermission source) {
        if (source.CosPath != null) {
            this.CosPath = new String(source.CosPath);
        }
        if (source.Permissions != null) {
            this.Permissions = new String[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new String(source.Permissions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosPath", this.CosPath);
        this.setParamArraySimple(map, prefix + "Permissions.", this.Permissions);

    }
}

