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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProjectRequest extends AbstractModel {

    /**
    * Project ID.

    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Color value.
    */
    @SerializedName("ColorCode")
    @Expose
    private String ColorCode;

    /**
    * Icon.
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * Remarks.
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
    * Available upon request.
    */
    @SerializedName("IsApply")
    @Expose
    private Boolean IsApply;

    /**
    * Seed.
    */
    @SerializedName("Seed")
    @Expose
    private String Seed;

    /**
    * Default dashboard.
    */
    @SerializedName("DefaultPanelType")
    @Expose
    private Long DefaultPanelType;

    /**
    * 2
    */
    @SerializedName("PanelScope")
    @Expose
    private String PanelScope;

    /**
    * Project management platform.
    */
    @SerializedName("ManagePlatform")
    @Expose
    private String ManagePlatform;

    /**
     * Get Project ID.
 
     * @return Id Project ID.

     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Project ID.

     * @param Id Project ID.

     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Name. 
     * @return Name Name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name.
     * @param Name Name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Color value. 
     * @return ColorCode Color value.
     */
    public String getColorCode() {
        return this.ColorCode;
    }

    /**
     * Set Color value.
     * @param ColorCode Color value.
     */
    public void setColorCode(String ColorCode) {
        this.ColorCode = ColorCode;
    }

    /**
     * Get Icon. 
     * @return Logo Icon.
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set Icon.
     * @param Logo Icon.
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get Remarks. 
     * @return Mark Remarks.
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set Remarks.
     * @param Mark Remarks.
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * Get Available upon request. 
     * @return IsApply Available upon request.
     */
    public Boolean getIsApply() {
        return this.IsApply;
    }

    /**
     * Set Available upon request.
     * @param IsApply Available upon request.
     */
    public void setIsApply(Boolean IsApply) {
        this.IsApply = IsApply;
    }

    /**
     * Get Seed. 
     * @return Seed Seed.
     */
    public String getSeed() {
        return this.Seed;
    }

    /**
     * Set Seed.
     * @param Seed Seed.
     */
    public void setSeed(String Seed) {
        this.Seed = Seed;
    }

    /**
     * Get Default dashboard. 
     * @return DefaultPanelType Default dashboard.
     */
    public Long getDefaultPanelType() {
        return this.DefaultPanelType;
    }

    /**
     * Set Default dashboard.
     * @param DefaultPanelType Default dashboard.
     */
    public void setDefaultPanelType(Long DefaultPanelType) {
        this.DefaultPanelType = DefaultPanelType;
    }

    /**
     * Get 2 
     * @return PanelScope 2
     */
    public String getPanelScope() {
        return this.PanelScope;
    }

    /**
     * Set 2
     * @param PanelScope 2
     */
    public void setPanelScope(String PanelScope) {
        this.PanelScope = PanelScope;
    }

    /**
     * Get Project management platform. 
     * @return ManagePlatform Project management platform.
     */
    public String getManagePlatform() {
        return this.ManagePlatform;
    }

    /**
     * Set Project management platform.
     * @param ManagePlatform Project management platform.
     */
    public void setManagePlatform(String ManagePlatform) {
        this.ManagePlatform = ManagePlatform;
    }

    public ModifyProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProjectRequest(ModifyProjectRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ColorCode != null) {
            this.ColorCode = new String(source.ColorCode);
        }
        if (source.Logo != null) {
            this.Logo = new String(source.Logo);
        }
        if (source.Mark != null) {
            this.Mark = new String(source.Mark);
        }
        if (source.IsApply != null) {
            this.IsApply = new Boolean(source.IsApply);
        }
        if (source.Seed != null) {
            this.Seed = new String(source.Seed);
        }
        if (source.DefaultPanelType != null) {
            this.DefaultPanelType = new Long(source.DefaultPanelType);
        }
        if (source.PanelScope != null) {
            this.PanelScope = new String(source.PanelScope);
        }
        if (source.ManagePlatform != null) {
            this.ManagePlatform = new String(source.ManagePlatform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ColorCode", this.ColorCode);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "Mark", this.Mark);
        this.setParamSimple(map, prefix + "IsApply", this.IsApply);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "DefaultPanelType", this.DefaultPanelType);
        this.setParamSimple(map, prefix + "PanelScope", this.PanelScope);
        this.setParamSimple(map, prefix + "ManagePlatform", this.ManagePlatform);

    }
}

