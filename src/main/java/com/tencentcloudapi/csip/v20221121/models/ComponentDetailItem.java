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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentDetailItem extends AbstractModel {

    /**
    * Component name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * cache hit version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Association path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Fix Command
    */
    @SerializedName("FixCommand")
    @Expose
    private String FixCommand;

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

    /**
     * Get cache hit version 
     * @return Version cache hit version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set cache hit version
     * @param Version cache hit version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Association path 
     * @return Path Association path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Association path
     * @param Path Association path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Fix Command 
     * @return FixCommand Fix Command
     */
    public String getFixCommand() {
        return this.FixCommand;
    }

    /**
     * Set Fix Command
     * @param FixCommand Fix Command
     */
    public void setFixCommand(String FixCommand) {
        this.FixCommand = FixCommand;
    }

    public ComponentDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentDetailItem(ComponentDetailItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.FixCommand != null) {
            this.FixCommand = new String(source.FixCommand);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "FixCommand", this.FixCommand);

    }
}

