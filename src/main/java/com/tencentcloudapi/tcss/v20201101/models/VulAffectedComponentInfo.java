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

public class VulAffectedComponentInfo extends AbstractModel {

    /**
    * Component name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Component version
    */
    @SerializedName("Version")
    @Expose
    private String [] Version;

    /**
    * Component Repair Version
    */
    @SerializedName("FixedVersion")
    @Expose
    private String [] FixedVersion;

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
     * Get Component version 
     * @return Version Component version
     */
    public String [] getVersion() {
        return this.Version;
    }

    /**
     * Set Component version
     * @param Version Component version
     */
    public void setVersion(String [] Version) {
        this.Version = Version;
    }

    /**
     * Get Component Repair Version 
     * @return FixedVersion Component Repair Version
     */
    public String [] getFixedVersion() {
        return this.FixedVersion;
    }

    /**
     * Set Component Repair Version
     * @param FixedVersion Component Repair Version
     */
    public void setFixedVersion(String [] FixedVersion) {
        this.FixedVersion = FixedVersion;
    }

    public VulAffectedComponentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulAffectedComponentInfo(VulAffectedComponentInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String[source.Version.length];
            for (int i = 0; i < source.Version.length; i++) {
                this.Version[i] = new String(source.Version[i]);
            }
        }
        if (source.FixedVersion != null) {
            this.FixedVersion = new String[source.FixedVersion.length];
            for (int i = 0; i < source.FixedVersion.length; i++) {
                this.FixedVersion[i] = new String(source.FixedVersion[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Version.", this.Version);
        this.setParamArraySimple(map, prefix + "FixedVersion.", this.FixedVersion);

    }
}

