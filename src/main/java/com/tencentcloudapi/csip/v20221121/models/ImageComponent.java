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

public class ImageComponent extends AbstractModel {

    /**
    * <p>Component name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Component version</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>Component path</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Component type</p><p>Enumeration value:</p><ul><li>SYSTEM_COMPONENT: System component</li><li>APP_COMPONENT: Application component</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Image ID.</p>
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * <p>Number of vulnerabilities</p>
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
    * <p>Image component Id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Component Id</p>
    */
    @SerializedName("ComponentId")
    @Expose
    private Long ComponentId;

    /**
     * Get <p>Component name.</p> 
     * @return Name <p>Component name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Component name.</p>
     * @param Name <p>Component name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Component version</p> 
     * @return Version <p>Component version</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>Component version</p>
     * @param Version <p>Component version</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>Component path</p> 
     * @return Path <p>Component path</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Component path</p>
     * @param Path <p>Component path</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Component type</p><p>Enumeration value:</p><ul><li>SYSTEM_COMPONENT: System component</li><li>APP_COMPONENT: Application component</li></ul> 
     * @return Type <p>Component type</p><p>Enumeration value:</p><ul><li>SYSTEM_COMPONENT: System component</li><li>APP_COMPONENT: Application component</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Component type</p><p>Enumeration value:</p><ul><li>SYSTEM_COMPONENT: System component</li><li>APP_COMPONENT: Application component</li></ul>
     * @param Type <p>Component type</p><p>Enumeration value:</p><ul><li>SYSTEM_COMPONENT: System component</li><li>APP_COMPONENT: Application component</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Image ID.</p> 
     * @return ImageID <p>Image ID.</p>
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set <p>Image ID.</p>
     * @param ImageID <p>Image ID.</p>
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get <p>Number of vulnerabilities</p> 
     * @return VulCount <p>Number of vulnerabilities</p>
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set <p>Number of vulnerabilities</p>
     * @param VulCount <p>Number of vulnerabilities</p>
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get <p>Image component Id</p> 
     * @return Id <p>Image component Id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Image component Id</p>
     * @param Id <p>Image component Id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Component Id</p> 
     * @return ComponentId <p>Component Id</p>
     */
    public Long getComponentId() {
        return this.ComponentId;
    }

    /**
     * Set <p>Component Id</p>
     * @param ComponentId <p>Component Id</p>
     */
    public void setComponentId(Long ComponentId) {
        this.ComponentId = ComponentId;
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
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.VulCount != null) {
            this.VulCount = new Long(source.VulCount);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ComponentId != null) {
            this.ComponentId = new Long(source.ComponentId);
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
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "VulCount", this.VulCount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);

    }
}

