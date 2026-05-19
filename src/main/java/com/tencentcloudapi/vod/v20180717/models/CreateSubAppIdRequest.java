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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubAppIdRequest extends AbstractModel {

    /**
    * <p>Application name, length limited to 40 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Application description, length limited to 300 characters. If left blank, the application description is empty by default.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>App type. Valid values: <li>AllInOne: integrated;</li><li>Professional: pro edition.</li>Default value: AllInOne.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Mode of this application. Available values are:</p><ul><li>fileid: fileid mode only</li><li>fileid+path: fileid & path mode<br>Leave empty to select fileid mode by default</li></ul>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>When Mode is fileid only, it is used to set the default storage region and is selectable.<br>When Mode is fileid+path, it is used to specify the storage region and is required.</p><p>For reference: <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1">Supported region list</a></p>
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * <p>tag that needs to be bound to this application</p>
    */
    @SerializedName("Tags")
    @Expose
    private ResourceTag [] Tags;

    /**
     * Get <p>Application name, length limited to 40 characters.</p> 
     * @return Name <p>Application name, length limited to 40 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Application name, length limited to 40 characters.</p>
     * @param Name <p>Application name, length limited to 40 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Application description, length limited to 300 characters. If left blank, the application description is empty by default.</p> 
     * @return Description <p>Application description, length limited to 300 characters. If left blank, the application description is empty by default.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Application description, length limited to 300 characters. If left blank, the application description is empty by default.</p>
     * @param Description <p>Application description, length limited to 300 characters. If left blank, the application description is empty by default.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>App type. Valid values: <li>AllInOne: integrated;</li><li>Professional: pro edition.</li>Default value: AllInOne.</p> 
     * @return Type <p>App type. Valid values: <li>AllInOne: integrated;</li><li>Professional: pro edition.</li>Default value: AllInOne.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>App type. Valid values: <li>AllInOne: integrated;</li><li>Professional: pro edition.</li>Default value: AllInOne.</p>
     * @param Type <p>App type. Valid values: <li>AllInOne: integrated;</li><li>Professional: pro edition.</li>Default value: AllInOne.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Mode of this application. Available values are:</p><ul><li>fileid: fileid mode only</li><li>fileid+path: fileid & path mode<br>Leave empty to select fileid mode by default</li></ul> 
     * @return Mode <p>Mode of this application. Available values are:</p><ul><li>fileid: fileid mode only</li><li>fileid+path: fileid & path mode<br>Leave empty to select fileid mode by default</li></ul>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>Mode of this application. Available values are:</p><ul><li>fileid: fileid mode only</li><li>fileid+path: fileid & path mode<br>Leave empty to select fileid mode by default</li></ul>
     * @param Mode <p>Mode of this application. Available values are:</p><ul><li>fileid: fileid mode only</li><li>fileid+path: fileid & path mode<br>Leave empty to select fileid mode by default</li></ul>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>When Mode is fileid only, it is used to set the default storage region and is selectable.<br>When Mode is fileid+path, it is used to specify the storage region and is required.</p><p>For reference: <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1">Supported region list</a></p> 
     * @return StorageRegion <p>When Mode is fileid only, it is used to set the default storage region and is selectable.<br>When Mode is fileid+path, it is used to specify the storage region and is required.</p><p>For reference: <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1">Supported region list</a></p>
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set <p>When Mode is fileid only, it is used to set the default storage region and is selectable.<br>When Mode is fileid+path, it is used to specify the storage region and is required.</p><p>For reference: <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1">Supported region list</a></p>
     * @param StorageRegion <p>When Mode is fileid only, it is used to set the default storage region and is selectable.<br>When Mode is fileid+path, it is used to specify the storage region and is required.</p><p>For reference: <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1">Supported region list</a></p>
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get <p>tag that needs to be bound to this application</p> 
     * @return Tags <p>tag that needs to be bound to this application</p>
     */
    public ResourceTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>tag that needs to be bound to this application</p>
     * @param Tags <p>tag that needs to be bound to this application</p>
     */
    public void setTags(ResourceTag [] Tags) {
        this.Tags = Tags;
    }

    public CreateSubAppIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubAppIdRequest(CreateSubAppIdRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.Tags != null) {
            this.Tags = new ResourceTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ResourceTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

