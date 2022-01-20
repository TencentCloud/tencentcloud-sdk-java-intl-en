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

public class CreateLiveSnapshotTemplateRequest extends AbstractModel{

    /**
    * Template name.
Maximum length: 255 bytes.
Only letters, digits, underscores, and hyphens can be contained.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * COS application ID.
    */
    @SerializedName("CosAppId")
    @Expose
    private Long CosAppId;

    /**
    * COS bucket name.
Note: the value of `CosBucket` cannot contain `-[appid]`.
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * COS region.
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * Description.
Maximum length: 1,024 bytes.
Only letters, digits, underscores, and hyphens can be contained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Screencapturing interval (s). Default value: 10
Value range: 2-300
    */
    @SerializedName("SnapshotInterval")
    @Expose
    private Long SnapshotInterval;

    /**
    * Screenshot width. Default value: `0` (original width)
Value range: 0-3000
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Screenshot height. Default value: `0` (original height)
Value range: 0-2000
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Whether to enable porn detection. 0: no, 1: yes. Default value: 0
    */
    @SerializedName("PornFlag")
    @Expose
    private Long PornFlag;

    /**
    * COS Bucket folder prefix.
If no value is entered, the default value
`/{Year}-{Month}-{Day}`
will be used.
    */
    @SerializedName("CosPrefix")
    @Expose
    private String CosPrefix;

    /**
    * COS filename.
If no value is entered, the default value 
`{StreamID}-screenshot-{Hour}-{Minute}-{Second}-{Width}x{Height}{Ext}`
will be used.
    */
    @SerializedName("CosFileName")
    @Expose
    private String CosFileName;

    /**
     * Get Template name.
Maximum length: 255 bytes.
Only letters, digits, underscores, and hyphens can be contained. 
     * @return TemplateName Template name.
Maximum length: 255 bytes.
Only letters, digits, underscores, and hyphens can be contained.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name.
Maximum length: 255 bytes.
Only letters, digits, underscores, and hyphens can be contained.
     * @param TemplateName Template name.
Maximum length: 255 bytes.
Only letters, digits, underscores, and hyphens can be contained.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get COS application ID. 
     * @return CosAppId COS application ID.
     */
    public Long getCosAppId() {
        return this.CosAppId;
    }

    /**
     * Set COS application ID.
     * @param CosAppId COS application ID.
     */
    public void setCosAppId(Long CosAppId) {
        this.CosAppId = CosAppId;
    }

    /**
     * Get COS bucket name.
Note: the value of `CosBucket` cannot contain `-[appid]`. 
     * @return CosBucket COS bucket name.
Note: the value of `CosBucket` cannot contain `-[appid]`.
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set COS bucket name.
Note: the value of `CosBucket` cannot contain `-[appid]`.
     * @param CosBucket COS bucket name.
Note: the value of `CosBucket` cannot contain `-[appid]`.
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get COS region. 
     * @return CosRegion COS region.
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set COS region.
     * @param CosRegion COS region.
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get Description.
Maximum length: 1,024 bytes.
Only letters, digits, underscores, and hyphens can be contained. 
     * @return Description Description.
Maximum length: 1,024 bytes.
Only letters, digits, underscores, and hyphens can be contained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
Maximum length: 1,024 bytes.
Only letters, digits, underscores, and hyphens can be contained.
     * @param Description Description.
Maximum length: 1,024 bytes.
Only letters, digits, underscores, and hyphens can be contained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Screencapturing interval (s). Default value: 10
Value range: 2-300 
     * @return SnapshotInterval Screencapturing interval (s). Default value: 10
Value range: 2-300
     */
    public Long getSnapshotInterval() {
        return this.SnapshotInterval;
    }

    /**
     * Set Screencapturing interval (s). Default value: 10
Value range: 2-300
     * @param SnapshotInterval Screencapturing interval (s). Default value: 10
Value range: 2-300
     */
    public void setSnapshotInterval(Long SnapshotInterval) {
        this.SnapshotInterval = SnapshotInterval;
    }

    /**
     * Get Screenshot width. Default value: `0` (original width)
Value range: 0-3000 
     * @return Width Screenshot width. Default value: `0` (original width)
Value range: 0-3000
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Screenshot width. Default value: `0` (original width)
Value range: 0-3000
     * @param Width Screenshot width. Default value: `0` (original width)
Value range: 0-3000
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Screenshot height. Default value: `0` (original height)
Value range: 0-2000 
     * @return Height Screenshot height. Default value: `0` (original height)
Value range: 0-2000
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Screenshot height. Default value: `0` (original height)
Value range: 0-2000
     * @param Height Screenshot height. Default value: `0` (original height)
Value range: 0-2000
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Whether to enable porn detection. 0: no, 1: yes. Default value: 0 
     * @return PornFlag Whether to enable porn detection. 0: no, 1: yes. Default value: 0
     */
    public Long getPornFlag() {
        return this.PornFlag;
    }

    /**
     * Set Whether to enable porn detection. 0: no, 1: yes. Default value: 0
     * @param PornFlag Whether to enable porn detection. 0: no, 1: yes. Default value: 0
     */
    public void setPornFlag(Long PornFlag) {
        this.PornFlag = PornFlag;
    }

    /**
     * Get COS Bucket folder prefix.
If no value is entered, the default value
`/{Year}-{Month}-{Day}`
will be used. 
     * @return CosPrefix COS Bucket folder prefix.
If no value is entered, the default value
`/{Year}-{Month}-{Day}`
will be used.
     */
    public String getCosPrefix() {
        return this.CosPrefix;
    }

    /**
     * Set COS Bucket folder prefix.
If no value is entered, the default value
`/{Year}-{Month}-{Day}`
will be used.
     * @param CosPrefix COS Bucket folder prefix.
If no value is entered, the default value
`/{Year}-{Month}-{Day}`
will be used.
     */
    public void setCosPrefix(String CosPrefix) {
        this.CosPrefix = CosPrefix;
    }

    /**
     * Get COS filename.
If no value is entered, the default value 
`{StreamID}-screenshot-{Hour}-{Minute}-{Second}-{Width}x{Height}{Ext}`
will be used. 
     * @return CosFileName COS filename.
If no value is entered, the default value 
`{StreamID}-screenshot-{Hour}-{Minute}-{Second}-{Width}x{Height}{Ext}`
will be used.
     */
    public String getCosFileName() {
        return this.CosFileName;
    }

    /**
     * Set COS filename.
If no value is entered, the default value 
`{StreamID}-screenshot-{Hour}-{Minute}-{Second}-{Width}x{Height}{Ext}`
will be used.
     * @param CosFileName COS filename.
If no value is entered, the default value 
`{StreamID}-screenshot-{Hour}-{Minute}-{Second}-{Width}x{Height}{Ext}`
will be used.
     */
    public void setCosFileName(String CosFileName) {
        this.CosFileName = CosFileName;
    }

    public CreateLiveSnapshotTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveSnapshotTemplateRequest(CreateLiveSnapshotTemplateRequest source) {
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
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
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "CosAppId", this.CosAppId);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SnapshotInterval", this.SnapshotInterval);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "PornFlag", this.PornFlag);
        this.setParamSimple(map, prefix + "CosPrefix", this.CosPrefix);
        this.setParamSimple(map, prefix + "CosFileName", this.CosFileName);

    }
}

