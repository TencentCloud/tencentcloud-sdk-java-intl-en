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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Software extends AbstractModel {

    /**
    * Software name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Software version.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Software picture URL.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Software installation directory.
    */
    @SerializedName("InstallDir")
    @Expose
    private String InstallDir;

    /**
    * List of software details.
    */
    @SerializedName("DetailSet")
    @Expose
    private SoftwareDetail [] DetailSet;

    /**
     * Get Software name. 
     * @return Name Software name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Software name.
     * @param Name Software name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Software version. 
     * @return Version Software version.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Software version.
     * @param Version Software version.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Software picture URL. 
     * @return ImageUrl Software picture URL.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set Software picture URL.
     * @param ImageUrl Software picture URL.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Software installation directory. 
     * @return InstallDir Software installation directory.
     */
    public String getInstallDir() {
        return this.InstallDir;
    }

    /**
     * Set Software installation directory.
     * @param InstallDir Software installation directory.
     */
    public void setInstallDir(String InstallDir) {
        this.InstallDir = InstallDir;
    }

    /**
     * Get List of software details. 
     * @return DetailSet List of software details.
     */
    public SoftwareDetail [] getDetailSet() {
        return this.DetailSet;
    }

    /**
     * Set List of software details.
     * @param DetailSet List of software details.
     */
    public void setDetailSet(SoftwareDetail [] DetailSet) {
        this.DetailSet = DetailSet;
    }

    public Software() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Software(Software source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.InstallDir != null) {
            this.InstallDir = new String(source.InstallDir);
        }
        if (source.DetailSet != null) {
            this.DetailSet = new SoftwareDetail[source.DetailSet.length];
            for (int i = 0; i < source.DetailSet.length; i++) {
                this.DetailSet[i] = new SoftwareDetail(source.DetailSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "InstallDir", this.InstallDir);
        this.setParamArrayObj(map, prefix + "DetailSet.", this.DetailSet);

    }
}

