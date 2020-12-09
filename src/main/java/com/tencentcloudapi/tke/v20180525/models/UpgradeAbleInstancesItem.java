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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeAbleInstancesItem extends AbstractModel{

    /**
    * Node ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The current version of the node
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * The latest minor version of the current version
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
     * Get Node ID 
     * @return InstanceId Node ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Node ID
     * @param InstanceId Node ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The current version of the node 
     * @return Version The current version of the node
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set The current version of the node
     * @param Version The current version of the node
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get The latest minor version of the current version
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return LatestVersion The latest minor version of the current version
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set The latest minor version of the current version
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param LatestVersion The latest minor version of the current version
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "LatestVersion", this.LatestVersion);

    }
}

