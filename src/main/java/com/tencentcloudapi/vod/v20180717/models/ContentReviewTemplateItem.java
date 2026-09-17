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

public class ContentReviewTemplateItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 
    */
    @SerializedName("PornConfigure")
    @Expose
    private PornConfigureInfo PornConfigure;

    /**
    * 
    */
    @SerializedName("TerrorismConfigure")
    @Expose
    private TerrorismConfigureInfo TerrorismConfigure;

    /**
    * 
    */
    @SerializedName("PoliticalConfigure")
    @Expose
    private PoliticalConfigureInfo PoliticalConfigure;

    /**
    * 
    */
    @SerializedName("ProhibitedConfigure")
    @Expose
    private ProhibitedConfigureInfo ProhibitedConfigure;

    /**
    * 
    */
    @SerializedName("UserDefineConfigure")
    @Expose
    private UserDefineConfigureInfo UserDefineConfigure;

    /**
    * 
    */
    @SerializedName("ReviewWallSwitch")
    @Expose
    private String ReviewWallSwitch;

    /**
    * 
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Comment 
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 
     * @param Comment 
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get  
     * @return PornConfigure 
     */
    public PornConfigureInfo getPornConfigure() {
        return this.PornConfigure;
    }

    /**
     * Set 
     * @param PornConfigure 
     */
    public void setPornConfigure(PornConfigureInfo PornConfigure) {
        this.PornConfigure = PornConfigure;
    }

    /**
     * Get  
     * @return TerrorismConfigure 
     */
    public TerrorismConfigureInfo getTerrorismConfigure() {
        return this.TerrorismConfigure;
    }

    /**
     * Set 
     * @param TerrorismConfigure 
     */
    public void setTerrorismConfigure(TerrorismConfigureInfo TerrorismConfigure) {
        this.TerrorismConfigure = TerrorismConfigure;
    }

    /**
     * Get  
     * @return PoliticalConfigure 
     */
    public PoliticalConfigureInfo getPoliticalConfigure() {
        return this.PoliticalConfigure;
    }

    /**
     * Set 
     * @param PoliticalConfigure 
     */
    public void setPoliticalConfigure(PoliticalConfigureInfo PoliticalConfigure) {
        this.PoliticalConfigure = PoliticalConfigure;
    }

    /**
     * Get  
     * @return ProhibitedConfigure 
     */
    public ProhibitedConfigureInfo getProhibitedConfigure() {
        return this.ProhibitedConfigure;
    }

    /**
     * Set 
     * @param ProhibitedConfigure 
     */
    public void setProhibitedConfigure(ProhibitedConfigureInfo ProhibitedConfigure) {
        this.ProhibitedConfigure = ProhibitedConfigure;
    }

    /**
     * Get  
     * @return UserDefineConfigure 
     */
    public UserDefineConfigureInfo getUserDefineConfigure() {
        return this.UserDefineConfigure;
    }

    /**
     * Set 
     * @param UserDefineConfigure 
     */
    public void setUserDefineConfigure(UserDefineConfigureInfo UserDefineConfigure) {
        this.UserDefineConfigure = UserDefineConfigure;
    }

    /**
     * Get  
     * @return ReviewWallSwitch 
     */
    public String getReviewWallSwitch() {
        return this.ReviewWallSwitch;
    }

    /**
     * Set 
     * @param ReviewWallSwitch 
     */
    public void setReviewWallSwitch(String ReviewWallSwitch) {
        this.ReviewWallSwitch = ReviewWallSwitch;
    }

    /**
     * Get  
     * @return ScreenshotInterval 
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set 
     * @param ScreenshotInterval 
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return UpdateTime 
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 
     * @param UpdateTime 
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

