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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContentReviewTemplateItem extends AbstractModel{

    /**
    * Unique ID of content audit template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Content audit template name. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Content audit template description. Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Porn information detection control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PornConfigure")
    @Expose
    private PornConfigureInfo PornConfigure;

    /**
    * Terrorism information detection control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TerrorismConfigure")
    @Expose
    private TerrorismConfigureInfo TerrorismConfigure;

    /**
    * Politically sensitive information detection control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PoliticalConfigure")
    @Expose
    private PoliticalConfigureInfo PoliticalConfigure;

    /**
    * Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
Note: this parameter is not supported yet.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProhibitedConfigure")
    @Expose
    private ProhibitedConfigureInfo ProhibitedConfigure;

    /**
    * Custom content audit control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserDefineConfigure")
    @Expose
    private UserDefineConfigureInfo UserDefineConfigure;

    /**
    * Switch controlling whether to add audit result to review list (for human review).
<li>ON: yes;</li>
<li>OFF: no.</li>
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
    * Creation time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Unique ID of content audit template. 
     * @return Definition Unique ID of content audit template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of content audit template.
     * @param Definition Unique ID of content audit template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Content audit template name. Length limit: 64 characters. 
     * @return Name Content audit template name. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Content audit template name. Length limit: 64 characters.
     * @param Name Content audit template name. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Content audit template description. Length limit: 256 characters. 
     * @return Comment Content audit template description. Length limit: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Content audit template description. Length limit: 256 characters.
     * @param Comment Content audit template description. Length limit: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Porn information detection control parameter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PornConfigure Porn information detection control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PornConfigureInfo getPornConfigure() {
        return this.PornConfigure;
    }

    /**
     * Set Porn information detection control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PornConfigure Porn information detection control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPornConfigure(PornConfigureInfo PornConfigure) {
        this.PornConfigure = PornConfigure;
    }

    /**
     * Get Terrorism information detection control parameter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TerrorismConfigure Terrorism information detection control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TerrorismConfigureInfo getTerrorismConfigure() {
        return this.TerrorismConfigure;
    }

    /**
     * Set Terrorism information detection control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TerrorismConfigure Terrorism information detection control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTerrorismConfigure(TerrorismConfigureInfo TerrorismConfigure) {
        this.TerrorismConfigure = TerrorismConfigure;
    }

    /**
     * Get Politically sensitive information detection control parameter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PoliticalConfigure Politically sensitive information detection control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PoliticalConfigureInfo getPoliticalConfigure() {
        return this.PoliticalConfigure;
    }

    /**
     * Set Politically sensitive information detection control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PoliticalConfigure Politically sensitive information detection control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPoliticalConfigure(PoliticalConfigureInfo PoliticalConfigure) {
        this.PoliticalConfigure = PoliticalConfigure;
    }

    /**
     * Get Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
Note: this parameter is not supported yet.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProhibitedConfigure Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
Note: this parameter is not supported yet.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ProhibitedConfigureInfo getProhibitedConfigure() {
        return this.ProhibitedConfigure;
    }

    /**
     * Set Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
Note: this parameter is not supported yet.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProhibitedConfigure Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
Note: this parameter is not supported yet.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProhibitedConfigure(ProhibitedConfigureInfo ProhibitedConfigure) {
        this.ProhibitedConfigure = ProhibitedConfigure;
    }

    /**
     * Get Custom content audit control parameter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UserDefineConfigure Custom content audit control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public UserDefineConfigureInfo getUserDefineConfigure() {
        return this.UserDefineConfigure;
    }

    /**
     * Set Custom content audit control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UserDefineConfigure Custom content audit control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUserDefineConfigure(UserDefineConfigureInfo UserDefineConfigure) {
        this.UserDefineConfigure = UserDefineConfigure;
    }

    /**
     * Get Switch controlling whether to add audit result to review list (for human review).
<li>ON: yes;</li>
<li>OFF: no.</li> 
     * @return ReviewWallSwitch Switch controlling whether to add audit result to review list (for human review).
<li>ON: yes;</li>
<li>OFF: no.</li>
     */
    public String getReviewWallSwitch() {
        return this.ReviewWallSwitch;
    }

    /**
     * Set Switch controlling whether to add audit result to review list (for human review).
<li>ON: yes;</li>
<li>OFF: no.</li>
     * @param ReviewWallSwitch Switch controlling whether to add audit result to review list (for human review).
<li>ON: yes;</li>
<li>OFF: no.</li>
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
     * Get Creation time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I). 
     * @return CreateTime Creation time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     * @param CreateTime Creation time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I). 
     * @return UpdateTime Last modified time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     * @param UpdateTime Last modified time of template in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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

