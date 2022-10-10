/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLiveSnapshotTemplateRequest extends AbstractModel{

    /**
    * Template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * The COS application ID.
**Please note that this parameter is required now**.
    */
    @SerializedName("CosAppId")
    @Expose
    private Long CosAppId;

    /**
    * The COS bucket name.
Note: Do not include the `-[appid]` part in the value of `CosBucket`.
**Please note that this parameter is required now**.
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * The COS region.
**Please note that this parameter is required now**.
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * Template name.
Maximum length: 255 bytes.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Description.
Maximum length: 1,024 bytes.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Screencapturing interval in seconds. Default value: 10s.
Value range: 5-300s.
    */
    @SerializedName("SnapshotInterval")
    @Expose
    private Long SnapshotInterval;

    /**
    * Screenshot width. Default value: 0 (original width).
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Screenshot height. Default value: 0 (original height).
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Whether to enable porn detection. Default value: 0.
0: do not enable.
1: enable.
    */
    @SerializedName("PornFlag")
    @Expose
    private Long PornFlag;

    /**
    * COS bucket folder prefix.
    */
    @SerializedName("CosPrefix")
    @Expose
    private String CosPrefix;

    /**
    * COS filename.
    */
    @SerializedName("CosFileName")
    @Expose
    private String CosFileName;

    /**
     * Get Template ID. 
     * @return TemplateId Template ID.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID.
     * @param TemplateId Template ID.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get The COS application ID.
**Please note that this parameter is required now**. 
     * @return CosAppId The COS application ID.
**Please note that this parameter is required now**.
     */
    public Long getCosAppId() {
        return this.CosAppId;
    }

    /**
     * Set The COS application ID.
**Please note that this parameter is required now**.
     * @param CosAppId The COS application ID.
**Please note that this parameter is required now**.
     */
    public void setCosAppId(Long CosAppId) {
        this.CosAppId = CosAppId;
    }

    /**
     * Get The COS bucket name.
Note: Do not include the `-[appid]` part in the value of `CosBucket`.
**Please note that this parameter is required now**. 
     * @return CosBucket The COS bucket name.
Note: Do not include the `-[appid]` part in the value of `CosBucket`.
**Please note that this parameter is required now**.
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set The COS bucket name.
Note: Do not include the `-[appid]` part in the value of `CosBucket`.
**Please note that this parameter is required now**.
     * @param CosBucket The COS bucket name.
Note: Do not include the `-[appid]` part in the value of `CosBucket`.
**Please note that this parameter is required now**.
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get The COS region.
**Please note that this parameter is required now**. 
     * @return CosRegion The COS region.
**Please note that this parameter is required now**.
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set The COS region.
**Please note that this parameter is required now**.
     * @param CosRegion The COS region.
**Please note that this parameter is required now**.
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get Template name.
Maximum length: 255 bytes. 
     * @return TemplateName Template name.
Maximum length: 255 bytes.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name.
Maximum length: 255 bytes.
     * @param TemplateName Template name.
Maximum length: 255 bytes.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Description.
Maximum length: 1,024 bytes. 
     * @return Description Description.
Maximum length: 1,024 bytes.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
Maximum length: 1,024 bytes.
     * @param Description Description.
Maximum length: 1,024 bytes.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Screencapturing interval in seconds. Default value: 10s.
Value range: 5-300s. 
     * @return SnapshotInterval Screencapturing interval in seconds. Default value: 10s.
Value range: 5-300s.
     */
    public Long getSnapshotInterval() {
        return this.SnapshotInterval;
    }

    /**
     * Set Screencapturing interval in seconds. Default value: 10s.
Value range: 5-300s.
     * @param SnapshotInterval Screencapturing interval in seconds. Default value: 10s.
Value range: 5-300s.
     */
    public void setSnapshotInterval(Long SnapshotInterval) {
        this.SnapshotInterval = SnapshotInterval;
    }

    /**
     * Get Screenshot width. Default value: 0 (original width). 
     * @return Width Screenshot width. Default value: 0 (original width).
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Screenshot width. Default value: 0 (original width).
     * @param Width Screenshot width. Default value: 0 (original width).
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Screenshot height. Default value: 0 (original height). 
     * @return Height Screenshot height. Default value: 0 (original height).
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Screenshot height. Default value: 0 (original height).
     * @param Height Screenshot height. Default value: 0 (original height).
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Whether to enable porn detection. Default value: 0.
0: do not enable.
1: enable. 
     * @return PornFlag Whether to enable porn detection. Default value: 0.
0: do not enable.
1: enable.
     */
    public Long getPornFlag() {
        return this.PornFlag;
    }

    /**
     * Set Whether to enable porn detection. Default value: 0.
0: do not enable.
1: enable.
     * @param PornFlag Whether to enable porn detection. Default value: 0.
0: do not enable.
1: enable.
     */
    public void setPornFlag(Long PornFlag) {
        this.PornFlag = PornFlag;
    }

    /**
     * Get COS bucket folder prefix. 
     * @return CosPrefix COS bucket folder prefix.
     */
    public String getCosPrefix() {
        return this.CosPrefix;
    }

    /**
     * Set COS bucket folder prefix.
     * @param CosPrefix COS bucket folder prefix.
     */
    public void setCosPrefix(String CosPrefix) {
        this.CosPrefix = CosPrefix;
    }

    /**
     * Get COS filename. 
     * @return CosFileName COS filename.
     */
    public String getCosFileName() {
        return this.CosFileName;
    }

    /**
     * Set COS filename.
     * @param CosFileName COS filename.
     */
    public void setCosFileName(String CosFileName) {
        this.CosFileName = CosFileName;
    }

    public ModifyLiveSnapshotTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveSnapshotTemplateRequest(ModifyLiveSnapshotTemplateRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.CosAppId != null) {
            this.CosAppId = new Long(source.CosAppId);
        }
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SnapshotInterval != null) {
            this.SnapshotInterval = new Long(source.SnapshotInterval);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.PornFlag != null) {
            this.PornFlag = new Long(source.PornFlag);
        }
        if (source.CosPrefix != null) {
            this.CosPrefix = new String(source.CosPrefix);
        }
        if (source.CosFileName != null) {
            this.CosFileName = new String(source.CosFileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "CosAppId", this.CosAppId);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SnapshotInterval", this.SnapshotInterval);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "PornFlag", this.PornFlag);
        this.setParamSimple(map, prefix + "CosPrefix", this.CosPrefix);
        this.setParamSimple(map, prefix + "CosFileName", this.CosFileName);

    }
}

