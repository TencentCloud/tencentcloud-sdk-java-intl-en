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

public class SnapshotTemplateInfo extends AbstractModel{

    /**
    * Template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Template name.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Screencapturing interval. Value range: 5-300s.
    */
    @SerializedName("SnapshotInterval")
    @Expose
    private Long SnapshotInterval;

    /**
    * Screenshot width. Value range: 0-3000. 
0: original width and fit to the original ratio.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Screenshot height. Value range: 0-2000.
0: original height and fit to the original ratio.
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
    * COS application ID.
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
    * Template description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * COS bucket folder prefix.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CosPrefix")
    @Expose
    private String CosPrefix;

    /**
    * COS filename.
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Template name. 
     * @return TemplateName Template name.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name.
     * @param TemplateName Template name.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Screencapturing interval. Value range: 5-300s. 
     * @return SnapshotInterval Screencapturing interval. Value range: 5-300s.
     */
    public Long getSnapshotInterval() {
        return this.SnapshotInterval;
    }

    /**
     * Set Screencapturing interval. Value range: 5-300s.
     * @param SnapshotInterval Screencapturing interval. Value range: 5-300s.
     */
    public void setSnapshotInterval(Long SnapshotInterval) {
        this.SnapshotInterval = SnapshotInterval;
    }

    /**
     * Get Screenshot width. Value range: 0-3000. 
0: original width and fit to the original ratio. 
     * @return Width Screenshot width. Value range: 0-3000. 
0: original width and fit to the original ratio.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Screenshot width. Value range: 0-3000. 
0: original width and fit to the original ratio.
     * @param Width Screenshot width. Value range: 0-3000. 
0: original width and fit to the original ratio.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Screenshot height. Value range: 0-2000.
0: original height and fit to the original ratio. 
     * @return Height Screenshot height. Value range: 0-2000.
0: original height and fit to the original ratio.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Screenshot height. Value range: 0-2000.
0: original height and fit to the original ratio.
     * @param Height Screenshot height. Value range: 0-2000.
0: original height and fit to the original ratio.
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
     * Get Template description. 
     * @return Description Template description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Template description.
     * @param Description Template description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get COS bucket folder prefix.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CosPrefix COS bucket folder prefix.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCosPrefix() {
        return this.CosPrefix;
    }

    /**
     * Set COS bucket folder prefix.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CosPrefix COS bucket folder prefix.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCosPrefix(String CosPrefix) {
        this.CosPrefix = CosPrefix;
    }

    /**
     * Get COS filename.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CosFileName COS filename.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCosFileName() {
        return this.CosFileName;
    }

    /**
     * Set COS filename.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CosFileName COS filename.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCosFileName(String CosFileName) {
        this.CosFileName = CosFileName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "SnapshotInterval", this.SnapshotInterval);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "PornFlag", this.PornFlag);
        this.setParamSimple(map, prefix + "CosAppId", this.CosAppId);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CosPrefix", this.CosPrefix);
        this.setParamSimple(map, prefix + "CosFileName", this.CosFileName);

    }
}

