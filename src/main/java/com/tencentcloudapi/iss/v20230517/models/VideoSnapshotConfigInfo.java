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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoSnapshotConfigInfo extends AbstractModel {

    /**
    * <p>Screenshot configuration Id</p>
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * <p>Screenshot template Id</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>Screenshot configuration name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Image storage days</p><p>Unit: days</p>
    */
    @SerializedName("FileExpires")
    @Expose
    private Long FileExpires;

    /**
    * <p>Callback configuration</p>
    */
    @SerializedName("Callback")
    @Expose
    private CallbackURL Callback;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last update time</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Screenshot configuration Id</p> 
     * @return ConfigId <p>Screenshot configuration Id</p>
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set <p>Screenshot configuration Id</p>
     * @param ConfigId <p>Screenshot configuration Id</p>
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get <p>Screenshot template Id</p> 
     * @return TemplateId <p>Screenshot template Id</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>Screenshot template Id</p>
     * @param TemplateId <p>Screenshot template Id</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>Screenshot configuration name</p> 
     * @return Name <p>Screenshot configuration name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Screenshot configuration name</p>
     * @param Name <p>Screenshot configuration name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul> 
     * @return Type <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
     * @param Type <p>Screenshot type</p><p>Enumeration values:</p><ul><li>1: Real-time frame capture</li><li>2: Low frequency frame capture</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Image storage days</p><p>Unit: days</p> 
     * @return FileExpires <p>Image storage days</p><p>Unit: days</p>
     */
    public Long getFileExpires() {
        return this.FileExpires;
    }

    /**
     * Set <p>Image storage days</p><p>Unit: days</p>
     * @param FileExpires <p>Image storage days</p><p>Unit: days</p>
     */
    public void setFileExpires(Long FileExpires) {
        this.FileExpires = FileExpires;
    }

    /**
     * Get <p>Callback configuration</p> 
     * @return Callback <p>Callback configuration</p>
     */
    public CallbackURL getCallback() {
        return this.Callback;
    }

    /**
     * Set <p>Callback configuration</p>
     * @param Callback <p>Callback configuration</p>
     */
    public void setCallback(CallbackURL Callback) {
        this.Callback = Callback;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last update time</p> 
     * @return UpdateTime <p>Last update time</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Last update time</p>
     * @param UpdateTime <p>Last update time</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public VideoSnapshotConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoSnapshotConfigInfo(VideoSnapshotConfigInfo source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.FileExpires != null) {
            this.FileExpires = new Long(source.FileExpires);
        }
        if (source.Callback != null) {
            this.Callback = new CallbackURL(source.Callback);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileExpires", this.FileExpires);
        this.setParamObj(map, prefix + "Callback.", this.Callback);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

