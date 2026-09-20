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

public class ModifyContentReviewTemplateRequest extends AbstractModel {

    /**
    * Unique identifier of the content review template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services on or after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether in the default application or a newly created application.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Content review template name, with a length limit of 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Content review template description, with a length limit of 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Control parameters for unsafe information.
    */
    @SerializedName("TerrorismConfigure")
    @Expose
    private TerrorismConfigureInfoForUpdate TerrorismConfigure;

    /**
    * Control parameters for offensive information.
    */
    @SerializedName("PornConfigure")
    @Expose
    private PornConfigureInfoForUpdate PornConfigure;

    /**
    * Control parameter for inappropriate information.
    */
    @SerializedName("PoliticalConfigure")
    @Expose
    private PoliticalConfigureInfoForUpdate PoliticalConfigure;

    /**
    * Prohibited control parameters. Restricted content includes:
<li>Abusive language;</li>
<li>Drug-related violation.</li>
    */
    @SerializedName("ProhibitedConfigure")
    @Expose
    private ProhibitedConfigureInfoForUpdate ProhibitedConfigure;

    /**
    * User-defined content review control parameters.
    */
    @SerializedName("UserDefineConfigure")
    @Expose
    private UserDefineConfigureInfoForUpdate UserDefineConfigure;

    /**
    * Frame interception interval in seconds. Minimum value: 0.5 seconds.
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * Whether the review result enters the review wall (for manual recognition of the review result).
<li>ON: yes</li>
<li>OFF: no</li>
    */
    @SerializedName("ReviewWallSwitch")
    @Expose
    private String ReviewWallSwitch;

    /**
     * Get Unique identifier of the content review template. 
     * @return Definition Unique identifier of the content review template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of the content review template.
     * @param Definition Unique identifier of the content review template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services on or after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether in the default application or a newly created application.</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services on or after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether in the default application or a newly created application.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services on or after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether in the default application or a newly created application.</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services on or after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications, whether in the default application or a newly created application.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Content review template name, with a length limit of 64 characters. 
     * @return Name Content review template name, with a length limit of 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Content review template name, with a length limit of 64 characters.
     * @param Name Content review template name, with a length limit of 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Content review template description, with a length limit of 256 characters. 
     * @return Comment Content review template description, with a length limit of 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Content review template description, with a length limit of 256 characters.
     * @param Comment Content review template description, with a length limit of 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Control parameters for unsafe information. 
     * @return TerrorismConfigure Control parameters for unsafe information.
     */
    public TerrorismConfigureInfoForUpdate getTerrorismConfigure() {
        return this.TerrorismConfigure;
    }

    /**
     * Set Control parameters for unsafe information.
     * @param TerrorismConfigure Control parameters for unsafe information.
     */
    public void setTerrorismConfigure(TerrorismConfigureInfoForUpdate TerrorismConfigure) {
        this.TerrorismConfigure = TerrorismConfigure;
    }

    /**
     * Get Control parameters for offensive information. 
     * @return PornConfigure Control parameters for offensive information.
     */
    public PornConfigureInfoForUpdate getPornConfigure() {
        return this.PornConfigure;
    }

    /**
     * Set Control parameters for offensive information.
     * @param PornConfigure Control parameters for offensive information.
     */
    public void setPornConfigure(PornConfigureInfoForUpdate PornConfigure) {
        this.PornConfigure = PornConfigure;
    }

    /**
     * Get Control parameter for inappropriate information. 
     * @return PoliticalConfigure Control parameter for inappropriate information.
     */
    public PoliticalConfigureInfoForUpdate getPoliticalConfigure() {
        return this.PoliticalConfigure;
    }

    /**
     * Set Control parameter for inappropriate information.
     * @param PoliticalConfigure Control parameter for inappropriate information.
     */
    public void setPoliticalConfigure(PoliticalConfigureInfoForUpdate PoliticalConfigure) {
        this.PoliticalConfigure = PoliticalConfigure;
    }

    /**
     * Get Prohibited control parameters. Restricted content includes:
<li>Abusive language;</li>
<li>Drug-related violation.</li> 
     * @return ProhibitedConfigure Prohibited control parameters. Restricted content includes:
<li>Abusive language;</li>
<li>Drug-related violation.</li>
     */
    public ProhibitedConfigureInfoForUpdate getProhibitedConfigure() {
        return this.ProhibitedConfigure;
    }

    /**
     * Set Prohibited control parameters. Restricted content includes:
<li>Abusive language;</li>
<li>Drug-related violation.</li>
     * @param ProhibitedConfigure Prohibited control parameters. Restricted content includes:
<li>Abusive language;</li>
<li>Drug-related violation.</li>
     */
    public void setProhibitedConfigure(ProhibitedConfigureInfoForUpdate ProhibitedConfigure) {
        this.ProhibitedConfigure = ProhibitedConfigure;
    }

    /**
     * Get User-defined content review control parameters. 
     * @return UserDefineConfigure User-defined content review control parameters.
     */
    public UserDefineConfigureInfoForUpdate getUserDefineConfigure() {
        return this.UserDefineConfigure;
    }

    /**
     * Set User-defined content review control parameters.
     * @param UserDefineConfigure User-defined content review control parameters.
     */
    public void setUserDefineConfigure(UserDefineConfigureInfoForUpdate UserDefineConfigure) {
        this.UserDefineConfigure = UserDefineConfigure;
    }

    /**
     * Get Frame interception interval in seconds. Minimum value: 0.5 seconds. 
     * @return ScreenshotInterval Frame interception interval in seconds. Minimum value: 0.5 seconds.
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set Frame interception interval in seconds. Minimum value: 0.5 seconds.
     * @param ScreenshotInterval Frame interception interval in seconds. Minimum value: 0.5 seconds.
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get Whether the review result enters the review wall (for manual recognition of the review result).
<li>ON: yes</li>
<li>OFF: no</li> 
     * @return ReviewWallSwitch Whether the review result enters the review wall (for manual recognition of the review result).
<li>ON: yes</li>
<li>OFF: no</li>
     */
    public String getReviewWallSwitch() {
        return this.ReviewWallSwitch;
    }

    /**
     * Set Whether the review result enters the review wall (for manual recognition of the review result).
<li>ON: yes</li>
<li>OFF: no</li>
     * @param ReviewWallSwitch Whether the review result enters the review wall (for manual recognition of the review result).
<li>ON: yes</li>
<li>OFF: no</li>
     */
    public void setReviewWallSwitch(String ReviewWallSwitch) {
        this.ReviewWallSwitch = ReviewWallSwitch;
    }

    public ModifyContentReviewTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyContentReviewTemplateRequest(ModifyContentReviewTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
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
        if (source.TerrorismConfigure != null) {
            this.TerrorismConfigure = new TerrorismConfigureInfoForUpdate(source.TerrorismConfigure);
        }
        if (source.PornConfigure != null) {
            this.PornConfigure = new PornConfigureInfoForUpdate(source.PornConfigure);
        }
        if (source.PoliticalConfigure != null) {
            this.PoliticalConfigure = new PoliticalConfigureInfoForUpdate(source.PoliticalConfigure);
        }
        if (source.ProhibitedConfigure != null) {
            this.ProhibitedConfigure = new ProhibitedConfigureInfoForUpdate(source.ProhibitedConfigure);
        }
        if (source.UserDefineConfigure != null) {
            this.UserDefineConfigure = new UserDefineConfigureInfoForUpdate(source.UserDefineConfigure);
        }
        if (source.ScreenshotInterval != null) {
            this.ScreenshotInterval = new Float(source.ScreenshotInterval);
        }
        if (source.ReviewWallSwitch != null) {
            this.ReviewWallSwitch = new String(source.ReviewWallSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "TerrorismConfigure.", this.TerrorismConfigure);
        this.setParamObj(map, prefix + "PornConfigure.", this.PornConfigure);
        this.setParamObj(map, prefix + "PoliticalConfigure.", this.PoliticalConfigure);
        this.setParamObj(map, prefix + "ProhibitedConfigure.", this.ProhibitedConfigure);
        this.setParamObj(map, prefix + "UserDefineConfigure.", this.UserDefineConfigure);
        this.setParamSimple(map, prefix + "ScreenshotInterval", this.ScreenshotInterval);
        this.setParamSimple(map, prefix + "ReviewWallSwitch", this.ReviewWallSwitch);

    }
}

