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

public class CreateContentReviewTemplateRequest extends AbstractModel {

    /**
    * Whether to allow the recognition result to enter the intelligent recognition platform (for human recognition).
<li>ON: yes</li>
<li>OFF: no</li>
    */
    @SerializedName("ReviewWallSwitch")
    @Expose
    private String ReviewWallSwitch;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

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
    * Control parameter for porn information.
    */
    @SerializedName("PornConfigure")
    @Expose
    private PornConfigureInfo PornConfigure;

    /**
    * Control parameter for terrorism information.
    */
    @SerializedName("TerrorismConfigure")
    @Expose
    private TerrorismConfigureInfo TerrorismConfigure;

    /**
    * Control parameter for politically sensitive information.
    */
    @SerializedName("PoliticalConfigure")
    @Expose
    private PoliticalConfigureInfo PoliticalConfigure;

    /**
    * Control parameter of prohibited information detection. Prohibited information includes:
<li>Abusive;</li>
<li>Drug-related.</li>
    */
    @SerializedName("ProhibitedConfigure")
    @Expose
    private ProhibitedConfigureInfo ProhibitedConfigure;

    /**
    * Control parameter for custom intelligent content recognition.
    */
    @SerializedName("UserDefineConfigure")
    @Expose
    private UserDefineConfigureInfo UserDefineConfigure;

    /**
    * Frame capturing interval in seconds. If this parameter is left empty, 1 second will be used by default. Minimum value: 0.5 seconds.
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

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
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
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
     * Get Control parameter for porn information. 
     * @return PornConfigure Control parameter for porn information.
     */
    public PornConfigureInfo getPornConfigure() {
        return this.PornConfigure;
    }

    /**
     * Set Control parameter for porn information.
     * @param PornConfigure Control parameter for porn information.
     */
    public void setPornConfigure(PornConfigureInfo PornConfigure) {
        this.PornConfigure = PornConfigure;
    }

    /**
     * Get Control parameter for terrorism information. 
     * @return TerrorismConfigure Control parameter for terrorism information.
     */
    public TerrorismConfigureInfo getTerrorismConfigure() {
        return this.TerrorismConfigure;
    }

    /**
     * Set Control parameter for terrorism information.
     * @param TerrorismConfigure Control parameter for terrorism information.
     */
    public void setTerrorismConfigure(TerrorismConfigureInfo TerrorismConfigure) {
        this.TerrorismConfigure = TerrorismConfigure;
    }

    /**
     * Get Control parameter for politically sensitive information. 
     * @return PoliticalConfigure Control parameter for politically sensitive information.
     */
    public PoliticalConfigureInfo getPoliticalConfigure() {
        return this.PoliticalConfigure;
    }

    /**
     * Set Control parameter for politically sensitive information.
     * @param PoliticalConfigure Control parameter for politically sensitive information.
     */
    public void setPoliticalConfigure(PoliticalConfigureInfo PoliticalConfigure) {
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
    public ProhibitedConfigureInfo getProhibitedConfigure() {
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
    public void setProhibitedConfigure(ProhibitedConfigureInfo ProhibitedConfigure) {
        this.ProhibitedConfigure = ProhibitedConfigure;
    }

    /**
     * Get Control parameter for custom intelligent content recognition. 
     * @return UserDefineConfigure Control parameter for custom intelligent content recognition.
     */
    public UserDefineConfigureInfo getUserDefineConfigure() {
        return this.UserDefineConfigure;
    }

    /**
     * Set Control parameter for custom intelligent content recognition.
     * @param UserDefineConfigure Control parameter for custom intelligent content recognition.
     */
    public void setUserDefineConfigure(UserDefineConfigureInfo UserDefineConfigure) {
        this.UserDefineConfigure = UserDefineConfigure;
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

    public CreateContentReviewTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateContentReviewTemplateRequest(CreateContentReviewTemplateRequest source) {
        if (source.ReviewWallSwitch != null) {
            this.ReviewWallSwitch = new String(source.ReviewWallSwitch);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
        if (source.ScreenshotInterval != null) {
            this.ScreenshotInterval = new Float(source.ScreenshotInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReviewWallSwitch", this.ReviewWallSwitch);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "PornConfigure.", this.PornConfigure);
        this.setParamObj(map, prefix + "TerrorismConfigure.", this.TerrorismConfigure);
        this.setParamObj(map, prefix + "PoliticalConfigure.", this.PoliticalConfigure);
        this.setParamObj(map, prefix + "ProhibitedConfigure.", this.ProhibitedConfigure);
        this.setParamObj(map, prefix + "UserDefineConfigure.", this.UserDefineConfigure);
        this.setParamSimple(map, prefix + "ScreenshotInterval", this.ScreenshotInterval);

    }
}

