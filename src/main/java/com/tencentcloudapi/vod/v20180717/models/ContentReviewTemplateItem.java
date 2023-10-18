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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContentReviewTemplateItem extends AbstractModel {

    /**
    * Unique ID of an intelligent recognition template
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Name of an intelligent recognition template. Max 64 characters
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of an intelligent recognition template. Max 256 characters
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Parameters for recognition of pornographic content
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("PornConfigure")
    @Expose
    private PornConfigureInfo PornConfigure;

    /**
    * Parameters for recognition of terrorism content
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("TerrorismConfigure")
    @Expose
    private TerrorismConfigureInfo TerrorismConfigure;

    /**
    * Parameters for recognition of politically sensitive content
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("PoliticalConfigure")
    @Expose
    private PoliticalConfigureInfo PoliticalConfigure;

    /**
    * Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProhibitedConfigure")
    @Expose
    private ProhibitedConfigureInfo ProhibitedConfigure;

    /**
    * Custom recognition parameters
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("UserDefineConfigure")
    @Expose
    private UserDefineConfigureInfo UserDefineConfigure;

    /**
    * Whether to subject the recognition result to human review
<li>ON</li>
<li>OFF</li>
    */
    @SerializedName("ReviewWallSwitch")
    @Expose
    private String ReviewWallSwitch;

    /**
    * Frame capturing interval in seconds. If this parameter is left empty, 1 second will be used by default. Minimum value: 0.5 seconds.
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Unique ID of an intelligent recognition template 
     * @return Definition Unique ID of an intelligent recognition template
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of an intelligent recognition template
     * @param Definition Unique ID of an intelligent recognition template
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Name of an intelligent recognition template. Max 64 characters 
     * @return Name Name of an intelligent recognition template. Max 64 characters
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of an intelligent recognition template. Max 64 characters
     * @param Name Name of an intelligent recognition template. Max 64 characters
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of an intelligent recognition template. Max 256 characters 
     * @return Comment Description of an intelligent recognition template. Max 256 characters
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description of an intelligent recognition template. Max 256 characters
     * @param Comment Description of an intelligent recognition template. Max 256 characters
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Parameters for recognition of pornographic content
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return PornConfigure Parameters for recognition of pornographic content
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public PornConfigureInfo getPornConfigure() {
        return this.PornConfigure;
    }

    /**
     * Set Parameters for recognition of pornographic content
Note: This field may return `null`, indicating that no valid value can be found.
     * @param PornConfigure Parameters for recognition of pornographic content
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setPornConfigure(PornConfigureInfo PornConfigure) {
        this.PornConfigure = PornConfigure;
    }

    /**
     * Get Parameters for recognition of terrorism content
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return TerrorismConfigure Parameters for recognition of terrorism content
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public TerrorismConfigureInfo getTerrorismConfigure() {
        return this.TerrorismConfigure;
    }

    /**
     * Set Parameters for recognition of terrorism content
Note: This field may return `null`, indicating that no valid value can be found.
     * @param TerrorismConfigure Parameters for recognition of terrorism content
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setTerrorismConfigure(TerrorismConfigureInfo TerrorismConfigure) {
        this.TerrorismConfigure = TerrorismConfigure;
    }

    /**
     * Get Parameters for recognition of politically sensitive content
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return PoliticalConfigure Parameters for recognition of politically sensitive content
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public PoliticalConfigureInfo getPoliticalConfigure() {
        return this.PoliticalConfigure;
    }

    /**
     * Set Parameters for recognition of politically sensitive content
Note: This field may return `null`, indicating that no valid value can be found.
     * @param PoliticalConfigure Parameters for recognition of politically sensitive content
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setPoliticalConfigure(PoliticalConfigureInfo PoliticalConfigure) {
        this.PoliticalConfigure = PoliticalConfigure;
    }

    /**
     * Get Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProhibitedConfigure Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ProhibitedConfigureInfo getProhibitedConfigure() {
        return this.ProhibitedConfigure;
    }

    /**
     * Set Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProhibitedConfigure Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProhibitedConfigure(ProhibitedConfigureInfo ProhibitedConfigure) {
        this.ProhibitedConfigure = ProhibitedConfigure;
    }

    /**
     * Get Custom recognition parameters
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return UserDefineConfigure Custom recognition parameters
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public UserDefineConfigureInfo getUserDefineConfigure() {
        return this.UserDefineConfigure;
    }

    /**
     * Set Custom recognition parameters
Note: This field may return `null`, indicating that no valid value can be found.
     * @param UserDefineConfigure Custom recognition parameters
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setUserDefineConfigure(UserDefineConfigureInfo UserDefineConfigure) {
        this.UserDefineConfigure = UserDefineConfigure;
    }

    /**
     * Get Whether to subject the recognition result to human review
<li>ON</li>
<li>OFF</li> 
     * @return ReviewWallSwitch Whether to subject the recognition result to human review
<li>ON</li>
<li>OFF</li>
     */
    public String getReviewWallSwitch() {
        return this.ReviewWallSwitch;
    }

    /**
     * Set Whether to subject the recognition result to human review
<li>ON</li>
<li>OFF</li>
     * @param ReviewWallSwitch Whether to subject the recognition result to human review
<li>ON</li>
<li>OFF</li>
     */
    public void setReviewWallSwitch(String ReviewWallSwitch) {
        this.ReviewWallSwitch = ReviewWallSwitch;
    }

    /**
     * Get Frame capturing interval in seconds. If this parameter is left empty, 1 second will be used by default. Minimum value: 0.5 seconds. 
     * @return ScreenshotInterval Frame capturing interval in seconds. If this parameter is left empty, 1 second will be used by default. Minimum value: 0.5 seconds.
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set Frame capturing interval in seconds. If this parameter is left empty, 1 second will be used by default. Minimum value: 0.5 seconds.
     * @param ScreenshotInterval Frame capturing interval in seconds. If this parameter is left empty, 1 second will be used by default. Minimum value: 0.5 seconds.
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ContentReviewTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentReviewTemplateItem(ContentReviewTemplateItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.PornConfigure != null) {
            this.PornConfigure = new PornConfigureInfo(source.PornConfigure);
        }
        if (source.TerrorismConfigure != null) {
            this.TerrorismConfigure = new TerrorismConfigureInfo(source.TerrorismConfigure);
        }
        if (source.PoliticalConfigure != null) {
            this.PoliticalConfigure = new PoliticalConfigureInfo(source.PoliticalConfigure);
        }
        if (source.ProhibitedConfigure != null) {
            this.ProhibitedConfigure = new ProhibitedConfigureInfo(source.ProhibitedConfigure);
        }
        if (source.UserDefineConfigure != null) {
            this.UserDefineConfigure = new UserDefineConfigureInfo(source.UserDefineConfigure);
        }
        if (source.ReviewWallSwitch != null) {
            this.ReviewWallSwitch = new String(source.ReviewWallSwitch);
        }
        if (source.ScreenshotInterval != null) {
            this.ScreenshotInterval = new Float(source.ScreenshotInterval);
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
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "PornConfigure.", this.PornConfigure);
        this.setParamObj(map, prefix + "TerrorismConfigure.", this.TerrorismConfigure);
        this.setParamObj(map, prefix + "PoliticalConfigure.", this.PoliticalConfigure);
        this.setParamObj(map, prefix + "ProhibitedConfigure.", this.ProhibitedConfigure);
        this.setParamObj(map, prefix + "UserDefineConfigure.", this.UserDefineConfigure);
        this.setParamSimple(map, prefix + "ReviewWallSwitch", this.ReviewWallSwitch);
        this.setParamSimple(map, prefix + "ScreenshotInterval", this.ScreenshotInterval);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

