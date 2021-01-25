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

public class ModifyContentReviewTemplateRequest extends AbstractModel{

    /**
    * Unique ID of an intelligent content recognition template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Name of an intelligent content recognition template. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of an intelligent content recognition template. Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Control parameter for terrorism information.
    */
    @SerializedName("TerrorismConfigure")
    @Expose
    private TerrorismConfigureInfoForUpdate TerrorismConfigure;

    /**
    * Control parameter for porn information.
    */
    @SerializedName("PornConfigure")
    @Expose
    private PornConfigureInfoForUpdate PornConfigure;

    /**
    * Control parameter for politically sensitive information.
    */
    @SerializedName("PoliticalConfigure")
    @Expose
    private PoliticalConfigureInfoForUpdate PoliticalConfigure;

    /**
    * Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
    */
    @SerializedName("ProhibitedConfigure")
    @Expose
    private ProhibitedConfigureInfoForUpdate ProhibitedConfigure;

    /**
    * Control parameter for custom intelligent content recognition tasks.
    */
    @SerializedName("UserDefineConfigure")
    @Expose
    private UserDefineConfigureInfoForUpdate UserDefineConfigure;

    /**
    * Frame capturing interval in seconds. Minimum value: 0.5 seconds.
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * Whether to allow the recognition result to enter the intelligent recognition platform (for human recognition).
<li>ON: yes</li>
<li>OFF: no</li>
    */
    @SerializedName("ReviewWallSwitch")
    @Expose
    private String ReviewWallSwitch;

    /**
    * [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Unique ID of an intelligent content recognition template. 
     * @return Definition Unique ID of an intelligent content recognition template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of an intelligent content recognition template.
     * @param Definition Unique ID of an intelligent content recognition template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Name of an intelligent content recognition template. Length limit: 64 characters. 
     * @return Name Name of an intelligent content recognition template. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of an intelligent content recognition template. Length limit: 64 characters.
     * @param Name Name of an intelligent content recognition template. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of an intelligent content recognition template. Length limit: 256 characters. 
     * @return Comment Description of an intelligent content recognition template. Length limit: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description of an intelligent content recognition template. Length limit: 256 characters.
     * @param Comment Description of an intelligent content recognition template. Length limit: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Control parameter for terrorism information. 
     * @return TerrorismConfigure Control parameter for terrorism information.
     */
    public TerrorismConfigureInfoForUpdate getTerrorismConfigure() {
        return this.TerrorismConfigure;
    }

    /**
     * Set Control parameter for terrorism information.
     * @param TerrorismConfigure Control parameter for terrorism information.
     */
    public void setTerrorismConfigure(TerrorismConfigureInfoForUpdate TerrorismConfigure) {
        this.TerrorismConfigure = TerrorismConfigure;
    }

    /**
     * Get Control parameter for porn information. 
     * @return PornConfigure Control parameter for porn information.
     */
    public PornConfigureInfoForUpdate getPornConfigure() {
        return this.PornConfigure;
    }

    /**
     * Set Control parameter for porn information.
     * @param PornConfigure Control parameter for porn information.
     */
    public void setPornConfigure(PornConfigureInfoForUpdate PornConfigure) {
        this.PornConfigure = PornConfigure;
    }

    /**
     * Get Control parameter for politically sensitive information. 
     * @return PoliticalConfigure Control parameter for politically sensitive information.
     */
    public PoliticalConfigureInfoForUpdate getPoliticalConfigure() {
        return this.PoliticalConfigure;
    }

    /**
     * Set Control parameter for politically sensitive information.
     * @param PoliticalConfigure Control parameter for politically sensitive information.
     */
    public void setPoliticalConfigure(PoliticalConfigureInfoForUpdate PoliticalConfigure) {
        this.PoliticalConfigure = PoliticalConfigure;
    }

    /**
     * Get Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li> 
     * @return ProhibitedConfigure Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
     */
    public ProhibitedConfigureInfoForUpdate getProhibitedConfigure() {
        return this.ProhibitedConfigure;
    }

    /**
     * Set Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
     * @param ProhibitedConfigure Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
     */
    public void setProhibitedConfigure(ProhibitedConfigureInfoForUpdate ProhibitedConfigure) {
        this.ProhibitedConfigure = ProhibitedConfigure;
    }

    /**
     * Get Control parameter for custom intelligent content recognition tasks. 
     * @return UserDefineConfigure Control parameter for custom intelligent content recognition tasks.
     */
    public UserDefineConfigureInfoForUpdate getUserDefineConfigure() {
        return this.UserDefineConfigure;
    }

    /**
     * Set Control parameter for custom intelligent content recognition tasks.
     * @param UserDefineConfigure Control parameter for custom intelligent content recognition tasks.
     */
    public void setUserDefineConfigure(UserDefineConfigureInfoForUpdate UserDefineConfigure) {
        this.UserDefineConfigure = UserDefineConfigure;
    }

    /**
     * Get Frame capturing interval in seconds. Minimum value: 0.5 seconds. 
     * @return ScreenshotInterval Frame capturing interval in seconds. Minimum value: 0.5 seconds.
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set Frame capturing interval in seconds. Minimum value: 0.5 seconds.
     * @param ScreenshotInterval Frame capturing interval in seconds. Minimum value: 0.5 seconds.
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get Whether to allow the recognition result to enter the intelligent recognition platform (for human recognition).
<li>ON: yes</li>
<li>OFF: no</li> 
     * @return ReviewWallSwitch Whether to allow the recognition result to enter the intelligent recognition platform (for human recognition).
<li>ON: yes</li>
<li>OFF: no</li>
     */
    public String getReviewWallSwitch() {
        return this.ReviewWallSwitch;
    }

    /**
     * Set Whether to allow the recognition result to enter the intelligent recognition platform (for human recognition).
<li>ON: yes</li>
<li>OFF: no</li>
     * @param ReviewWallSwitch Whether to allow the recognition result to enter the intelligent recognition platform (for human recognition).
<li>ON: yes</li>
<li>OFF: no</li>
     */
    public void setReviewWallSwitch(String ReviewWallSwitch) {
        this.ReviewWallSwitch = ReviewWallSwitch;
    }

    /**
     * Get [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "TerrorismConfigure.", this.TerrorismConfigure);
        this.setParamObj(map, prefix + "PornConfigure.", this.PornConfigure);
        this.setParamObj(map, prefix + "PoliticalConfigure.", this.PoliticalConfigure);
        this.setParamObj(map, prefix + "ProhibitedConfigure.", this.ProhibitedConfigure);
        this.setParamObj(map, prefix + "UserDefineConfigure.", this.UserDefineConfigure);
        this.setParamSimple(map, prefix + "ScreenshotInterval", this.ScreenshotInterval);
        this.setParamSimple(map, prefix + "ReviewWallSwitch", this.ReviewWallSwitch);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

