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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Model extends AbstractModel {

    /**
    * <p>Model badge list</p>
    */
    @SerializedName("BadgeList")
    @Expose
    private ModelBadge [] BadgeList;

    /**
    * <p>Model author information</p>
    */
    @SerializedName("DeveloperInfo")
    @Expose
    private ModelDeveloperBasic DeveloperInfo;

    /**
    * <p>Model restrictive information</p>
    */
    @SerializedName("LimitInfo")
    @Expose
    private ModelLimit LimitInfo;

    /**
    * <p>Model basic information</p>
    */
    @SerializedName("ModelBasic")
    @Expose
    private ModelBasic ModelBasic;

    /**
    * <p>Model hyperparameter configuration</p>
    */
    @SerializedName("ParameterList")
    @Expose
    private ModelParameter [] ParameterList;

    /**
    * <p>Model attribute configuration</p>
    */
    @SerializedName("PropertyList")
    @Expose
    private ModelProperty [] PropertyList;

    /**
    * <p>Model provider info</p>
    */
    @SerializedName("ProviderInfo")
    @Expose
    private ModelProviderBasic ProviderInfo;

    /**
    * <p>Model status information</p>
    */
    @SerializedName("StatusInfo")
    @Expose
    private ModelStatus StatusInfo;

    /**
    * <p>Model tag list</p>
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
     * Get <p>Model badge list</p> 
     * @return BadgeList <p>Model badge list</p>
     */
    public ModelBadge [] getBadgeList() {
        return this.BadgeList;
    }

    /**
     * Set <p>Model badge list</p>
     * @param BadgeList <p>Model badge list</p>
     */
    public void setBadgeList(ModelBadge [] BadgeList) {
        this.BadgeList = BadgeList;
    }

    /**
     * Get <p>Model author information</p> 
     * @return DeveloperInfo <p>Model author information</p>
     */
    public ModelDeveloperBasic getDeveloperInfo() {
        return this.DeveloperInfo;
    }

    /**
     * Set <p>Model author information</p>
     * @param DeveloperInfo <p>Model author information</p>
     */
    public void setDeveloperInfo(ModelDeveloperBasic DeveloperInfo) {
        this.DeveloperInfo = DeveloperInfo;
    }

    /**
     * Get <p>Model restrictive information</p> 
     * @return LimitInfo <p>Model restrictive information</p>
     */
    public ModelLimit getLimitInfo() {
        return this.LimitInfo;
    }

    /**
     * Set <p>Model restrictive information</p>
     * @param LimitInfo <p>Model restrictive information</p>
     */
    public void setLimitInfo(ModelLimit LimitInfo) {
        this.LimitInfo = LimitInfo;
    }

    /**
     * Get <p>Model basic information</p> 
     * @return ModelBasic <p>Model basic information</p>
     */
    public ModelBasic getModelBasic() {
        return this.ModelBasic;
    }

    /**
     * Set <p>Model basic information</p>
     * @param ModelBasic <p>Model basic information</p>
     */
    public void setModelBasic(ModelBasic ModelBasic) {
        this.ModelBasic = ModelBasic;
    }

    /**
     * Get <p>Model hyperparameter configuration</p> 
     * @return ParameterList <p>Model hyperparameter configuration</p>
     */
    public ModelParameter [] getParameterList() {
        return this.ParameterList;
    }

    /**
     * Set <p>Model hyperparameter configuration</p>
     * @param ParameterList <p>Model hyperparameter configuration</p>
     */
    public void setParameterList(ModelParameter [] ParameterList) {
        this.ParameterList = ParameterList;
    }

    /**
     * Get <p>Model attribute configuration</p> 
     * @return PropertyList <p>Model attribute configuration</p>
     */
    public ModelProperty [] getPropertyList() {
        return this.PropertyList;
    }

    /**
     * Set <p>Model attribute configuration</p>
     * @param PropertyList <p>Model attribute configuration</p>
     */
    public void setPropertyList(ModelProperty [] PropertyList) {
        this.PropertyList = PropertyList;
    }

    /**
     * Get <p>Model provider info</p> 
     * @return ProviderInfo <p>Model provider info</p>
     */
    public ModelProviderBasic getProviderInfo() {
        return this.ProviderInfo;
    }

    /**
     * Set <p>Model provider info</p>
     * @param ProviderInfo <p>Model provider info</p>
     */
    public void setProviderInfo(ModelProviderBasic ProviderInfo) {
        this.ProviderInfo = ProviderInfo;
    }

    /**
     * Get <p>Model status information</p> 
     * @return StatusInfo <p>Model status information</p>
     */
    public ModelStatus getStatusInfo() {
        return this.StatusInfo;
    }

    /**
     * Set <p>Model status information</p>
     * @param StatusInfo <p>Model status information</p>
     */
    public void setStatusInfo(ModelStatus StatusInfo) {
        this.StatusInfo = StatusInfo;
    }

    /**
     * Get <p>Model tag list</p> 
     * @return TagList <p>Model tag list</p>
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>Model tag list</p>
     * @param TagList <p>Model tag list</p>
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    public Model() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Model(Model source) {
        if (source.BadgeList != null) {
            this.BadgeList = new ModelBadge[source.BadgeList.length];
            for (int i = 0; i < source.BadgeList.length; i++) {
                this.BadgeList[i] = new ModelBadge(source.BadgeList[i]);
            }
        }
        if (source.DeveloperInfo != null) {
            this.DeveloperInfo = new ModelDeveloperBasic(source.DeveloperInfo);
        }
        if (source.LimitInfo != null) {
            this.LimitInfo = new ModelLimit(source.LimitInfo);
        }
        if (source.ModelBasic != null) {
            this.ModelBasic = new ModelBasic(source.ModelBasic);
        }
        if (source.ParameterList != null) {
            this.ParameterList = new ModelParameter[source.ParameterList.length];
            for (int i = 0; i < source.ParameterList.length; i++) {
                this.ParameterList[i] = new ModelParameter(source.ParameterList[i]);
            }
        }
        if (source.PropertyList != null) {
            this.PropertyList = new ModelProperty[source.PropertyList.length];
            for (int i = 0; i < source.PropertyList.length; i++) {
                this.PropertyList[i] = new ModelProperty(source.PropertyList[i]);
            }
        }
        if (source.ProviderInfo != null) {
            this.ProviderInfo = new ModelProviderBasic(source.ProviderInfo);
        }
        if (source.StatusInfo != null) {
            this.StatusInfo = new ModelStatus(source.StatusInfo);
        }
        if (source.TagList != null) {
            this.TagList = new String[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new String(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BadgeList.", this.BadgeList);
        this.setParamObj(map, prefix + "DeveloperInfo.", this.DeveloperInfo);
        this.setParamObj(map, prefix + "LimitInfo.", this.LimitInfo);
        this.setParamObj(map, prefix + "ModelBasic.", this.ModelBasic);
        this.setParamArrayObj(map, prefix + "ParameterList.", this.ParameterList);
        this.setParamArrayObj(map, prefix + "PropertyList.", this.PropertyList);
        this.setParamObj(map, prefix + "ProviderInfo.", this.ProviderInfo);
        this.setParamObj(map, prefix + "StatusInfo.", this.StatusInfo);
        this.setParamArraySimple(map, prefix + "TagList.", this.TagList);

    }
}

