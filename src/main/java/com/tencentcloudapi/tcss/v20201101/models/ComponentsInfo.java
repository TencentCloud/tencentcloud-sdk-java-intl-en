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

public class ComponentsInfo extends AbstractModel {

    /**
    * Component name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * Component version information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Fixed version
Note: This field may return·`null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FixedVersion")
    @Expose
    private String FixedVersion;

    /**
    * Path
Note: This field may return·`null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Type
Note: This field may return·`null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Add-on name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Component name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Component Component name
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set Component name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Component Component name
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get Component version information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version Component version information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Component version information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version Component version information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Fixed version
Note: This field may return·`null`, indicating that no valid values can be obtained. 
     * @return FixedVersion Fixed version
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public String getFixedVersion() {
        return this.FixedVersion;
    }

    /**
     * Set Fixed version
Note: This field may return·`null`, indicating that no valid values can be obtained.
     * @param FixedVersion Fixed version
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public void setFixedVersion(String FixedVersion) {
        this.FixedVersion = FixedVersion;
    }

    /**
     * Get Path
Note: This field may return·`null`, indicating that no valid values can be obtained. 
     * @return Path Path
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path
Note: This field may return·`null`, indicating that no valid values can be obtained.
     * @param Path Path
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Type
Note: This field may return·`null`, indicating that no valid values can be obtained. 
     * @return Type Type
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type
Note: This field may return·`null`, indicating that no valid values can be obtained.
     * @param Type Type
Note: This field may return·`null`, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Add-on name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Add-on name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Add-on name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Add-on name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ComponentsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentsInfo(ComponentsInfo source) {
        if (source.Component != null) {
            this.Component = new String(source.Component);
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
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "FixedVersion", this.FixedVersion);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

