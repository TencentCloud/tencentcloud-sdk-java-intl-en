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

public class ImageComponent extends AbstractModel {

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
    private String Version;

    /**
    * Component path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Component type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Number of component vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
    * Image ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

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
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Component version
     * @param Version Component version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Component path 
     * @return Path Component path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Component path
     * @param Path Component path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Component type 
     * @return Type Component type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Component type
     * @param Type Component type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Number of component vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulCount Number of component vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set Number of component vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulCount Number of component vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get Image ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageID Image ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set Image ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageID Image ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    public ImageComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageComponent(ImageComponent source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.VulCount != null) {
            this.VulCount = new Long(source.VulCount);
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VulCount", this.VulCount);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);

    }
}

