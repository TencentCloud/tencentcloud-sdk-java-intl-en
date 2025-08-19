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

public class CreateProjectRequest extends AbstractModel {

    /**
    * Project name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Background color of the logo.
    */
    @SerializedName("ColorCode")
    @Expose
    private String ColorCode;

    /**
    * Project logo.
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
    * Whether to allow user requests.
    */
    @SerializedName("IsApply")
    @Expose
    private Boolean IsApply;

    /**
    * Default dashboard.
    */
    @SerializedName("DefaultPanelType")
    @Expose
    private Long DefaultPanelType;

    /**
    * Management platform.
    */
    @SerializedName("ManagePlatform")
    @Expose
    private String ManagePlatform;

    /**
     * Get Project name. 
     * @return Name Project name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Project name.
     * @param Name Project name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Background color of the logo. 
     * @return ColorCode Background color of the logo.
     */
    public String getColorCode() {
        return this.ColorCode;
    }

    /**
     * Set Background color of the logo.
     * @param ColorCode Background color of the logo.
     */
    public void setColorCode(String ColorCode) {
        this.ColorCode = ColorCode;
    }

    /**
     * Get Project logo. 
     * @return Logo Project logo.
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set Project logo.
     * @param Logo Project logo.
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
     * Get Whether to allow user requests. 
     * @return IsApply Whether to allow user requests.
     */
    public Boolean getIsApply() {
        return this.IsApply;
    }

    /**
     * Set Whether to allow user requests.
     * @param IsApply Whether to allow user requests.
     */
    public void setIsApply(Boolean IsApply) {
        this.IsApply = IsApply;
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
     * Get Management platform. 
     * @return ManagePlatform Management platform.
     */
    public String getManagePlatform() {
        return this.ManagePlatform;
    }

    /**
     * Set Management platform.
     * @param ManagePlatform Management platform.
     */
    public void setManagePlatform(String ManagePlatform) {
        this.ManagePlatform = ManagePlatform;
    }

    public CreateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProjectRequest(CreateProjectRequest source) {
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
        if (source.DefaultPanelType != null) {
            this.DefaultPanelType = new Long(source.DefaultPanelType);
        }
        if (source.ManagePlatform != null) {
            this.ManagePlatform = new String(source.ManagePlatform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ColorCode", this.ColorCode);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "Mark", this.Mark);
        this.setParamSimple(map, prefix + "IsApply", this.IsApply);
        this.setParamSimple(map, prefix + "DefaultPanelType", this.DefaultPanelType);
        this.setParamSimple(map, prefix + "ManagePlatform", this.ManagePlatform);

    }
}

