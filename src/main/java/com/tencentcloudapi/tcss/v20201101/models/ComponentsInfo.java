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
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * Component version information
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Repairable Version
    */
    @SerializedName("FixedVersion")
    @Expose
    private String FixedVersion;

    /**
    * Path.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Component name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Component name 
     * @return Component Component name
     * @deprecated
     */
    @Deprecated
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set Component name
     * @param Component Component name
     * @deprecated
     */
    @Deprecated
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get Component version information 
     * @return Version Component version information
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Component version information
     * @param Version Component version information
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Repairable Version 
     * @return FixedVersion Repairable Version
     */
    public String getFixedVersion() {
        return this.FixedVersion;
    }

    /**
     * Set Repairable Version
     * @param FixedVersion Repairable Version
     */
    public void setFixedVersion(String FixedVersion) {
        this.FixedVersion = FixedVersion;
    }

    /**
     * Get Path. 
     * @return Path Path.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path.
     * @param Path Path.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Type. 
     * @return Type Type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type.
     * @param Type Type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Component name 
     * @return Name Component name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Component name
     * @param Name Component name
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

