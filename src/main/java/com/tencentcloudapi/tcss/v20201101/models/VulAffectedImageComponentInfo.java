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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulAffectedImageComponentInfo extends AbstractModel {

    /**
    * Component name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Component version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Fixed component version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FixedVersion")
    @Expose
    private String FixedVersion;

    /**
    * Component path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get Component name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Component name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Component name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Component name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Component version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version Component version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Component version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version Component version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Fixed component version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FixedVersion Fixed component version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFixedVersion() {
        return this.FixedVersion;
    }

    /**
     * Set Fixed component version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FixedVersion Fixed component version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFixedVersion(String FixedVersion) {
        this.FixedVersion = FixedVersion;
    }

    /**
     * Get Component path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Path Component path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Component path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Path Component path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public VulAffectedImageComponentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulAffectedImageComponentInfo(VulAffectedImageComponentInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.FixedVersion != null) {
            this.FixedVersion = new String(source.FixedVersion);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "FixedVersion", this.FixedVersion);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

