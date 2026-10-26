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

public class ModifyVideoSnapshotConfigRequest extends AbstractModel {

    /**
    * <p>Screenshot configuration Id</p>
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * <p>Screenshot configuration name</p><p>Input parameter limits: Chinese, English, digits, "-", "_", length not exceeding 128 characters</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Screenshot template Id</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>Hot storage days of image files</p><p>Enumeration values:</p><ul><li>7: 7 days</li><li>15: 15 days</li><li>30: 30 days</li><li>60: 60 days</li><li>90: 90 days</li><li>180: 180 days</li><li>270: 270 days</li><li>360: 360 days</li><li>540: 540 days</li><li>720: 720 days</li><li>900: 900 days</li><li>1080: 1080 days</li></ul>
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
     * Get <p>Screenshot configuration name</p><p>Input parameter limits: Chinese, English, digits, "-", "_", length not exceeding 128 characters</p> 
     * @return Name <p>Screenshot configuration name</p><p>Input parameter limits: Chinese, English, digits, "-", "_", length not exceeding 128 characters</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Screenshot configuration name</p><p>Input parameter limits: Chinese, English, digits, "-", "_", length not exceeding 128 characters</p>
     * @param Name <p>Screenshot configuration name</p><p>Input parameter limits: Chinese, English, digits, "-", "_", length not exceeding 128 characters</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>Hot storage days of image files</p><p>Enumeration values:</p><ul><li>7: 7 days</li><li>15: 15 days</li><li>30: 30 days</li><li>60: 60 days</li><li>90: 90 days</li><li>180: 180 days</li><li>270: 270 days</li><li>360: 360 days</li><li>540: 540 days</li><li>720: 720 days</li><li>900: 900 days</li><li>1080: 1080 days</li></ul> 
     * @return FileExpires <p>Hot storage days of image files</p><p>Enumeration values:</p><ul><li>7: 7 days</li><li>15: 15 days</li><li>30: 30 days</li><li>60: 60 days</li><li>90: 90 days</li><li>180: 180 days</li><li>270: 270 days</li><li>360: 360 days</li><li>540: 540 days</li><li>720: 720 days</li><li>900: 900 days</li><li>1080: 1080 days</li></ul>
     */
    public Long getFileExpires() {
        return this.FileExpires;
    }

    /**
     * Set <p>Hot storage days of image files</p><p>Enumeration values:</p><ul><li>7: 7 days</li><li>15: 15 days</li><li>30: 30 days</li><li>60: 60 days</li><li>90: 90 days</li><li>180: 180 days</li><li>270: 270 days</li><li>360: 360 days</li><li>540: 540 days</li><li>720: 720 days</li><li>900: 900 days</li><li>1080: 1080 days</li></ul>
     * @param FileExpires <p>Hot storage days of image files</p><p>Enumeration values:</p><ul><li>7: 7 days</li><li>15: 15 days</li><li>30: 30 days</li><li>60: 60 days</li><li>90: 90 days</li><li>180: 180 days</li><li>270: 270 days</li><li>360: 360 days</li><li>540: 540 days</li><li>720: 720 days</li><li>900: 900 days</li><li>1080: 1080 days</li></ul>
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

    public ModifyVideoSnapshotConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVideoSnapshotConfigRequest(ModifyVideoSnapshotConfigRequest source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.FileExpires != null) {
            this.FileExpires = new Long(source.FileExpires);
        }
        if (source.Callback != null) {
            this.Callback = new CallbackURL(source.Callback);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "FileExpires", this.FileExpires);
        this.setParamObj(map, prefix + "Callback.", this.Callback);

    }
}

