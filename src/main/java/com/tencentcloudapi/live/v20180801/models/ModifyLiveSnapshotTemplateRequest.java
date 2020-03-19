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
Value range: 5–600s.
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
    * Whether to enable porn detection. 0: no, 1: yes.
    */
    @SerializedName("PornFlag")
    @Expose
    private Long PornFlag;

    /**
    * COS `AppId`.
    */
    @SerializedName("CosAppId")
    @Expose
    private Long CosAppId;

    /**
    * COS bucket name.
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
Value range: 5–600s. 
     * @return SnapshotInterval Screencapturing interval in seconds. Default value: 10s.
Value range: 5–600s.
     */
    public Long getSnapshotInterval() {
        return this.SnapshotInterval;
    }

    /**
     * Set Screencapturing interval in seconds. Default value: 10s.
Value range: 5–600s.
     * @param SnapshotInterval Screencapturing interval in seconds. Default value: 10s.
Value range: 5–600s.
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
     * Get Whether to enable porn detection. 0: no, 1: yes. 
     * @return PornFlag Whether to enable porn detection. 0: no, 1: yes.
     */
    public Long getPornFlag() {
        return this.PornFlag;
    }

    /**
     * Set Whether to enable porn detection. 0: no, 1: yes.
     * @param PornFlag Whether to enable porn detection. 0: no, 1: yes.
     */
    public void setPornFlag(Long PornFlag) {
        this.PornFlag = PornFlag;
    }

    /**
     * Get COS `AppId`. 
     * @return CosAppId COS `AppId`.
     */
    public Long getCosAppId() {
        return this.CosAppId;
    }

    /**
     * Set COS `AppId`.
     * @param CosAppId COS `AppId`.
     */
    public void setCosAppId(Long CosAppId) {
        this.CosAppId = CosAppId;
    }

    /**
     * Get COS bucket name. 
     * @return CosBucket COS bucket name.
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set COS bucket name.
     * @param CosBucket COS bucket name.
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SnapshotInterval", this.SnapshotInterval);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "PornFlag", this.PornFlag);
        this.setParamSimple(map, prefix + "CosAppId", this.CosAppId);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);

    }
}

