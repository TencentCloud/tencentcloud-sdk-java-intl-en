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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmIdentifyLevelGroupItem extends AbstractModel {

    /**
    * <p>Level group id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Level group name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Level group description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Level group type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Level information</p>
    */
    @SerializedName("LevelItems")
    @Expose
    private DspmIdentifyLevelItem [] LevelItems;

    /**
    * <p>Update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Associated identification template information</p>
    */
    @SerializedName("ComplianceRelations")
    @Expose
    private DspmIdentifyRefComplianceInfo [] ComplianceRelations;

    /**
     * Get <p>Level group id</p> 
     * @return Id <p>Level group id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Level group id</p>
     * @param Id <p>Level group id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Level group name</p> 
     * @return Name <p>Level group name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Level group name</p>
     * @param Name <p>Level group name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Level group description</p> 
     * @return Description <p>Level group description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Level group description</p>
     * @param Description <p>Level group description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Level group type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul> 
     * @return Type <p>Level group type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Level group type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     * @param Type <p>Level group type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Level information</p> 
     * @return LevelItems <p>Level information</p>
     */
    public DspmIdentifyLevelItem [] getLevelItems() {
        return this.LevelItems;
    }

    /**
     * Set <p>Level information</p>
     * @param LevelItems <p>Level information</p>
     */
    public void setLevelItems(DspmIdentifyLevelItem [] LevelItems) {
        this.LevelItems = LevelItems;
    }

    /**
     * Get <p>Update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return UpdateTime <p>Update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param UpdateTime <p>Update time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Associated identification template information</p> 
     * @return ComplianceRelations <p>Associated identification template information</p>
     */
    public DspmIdentifyRefComplianceInfo [] getComplianceRelations() {
        return this.ComplianceRelations;
    }

    /**
     * Set <p>Associated identification template information</p>
     * @param ComplianceRelations <p>Associated identification template information</p>
     */
    public void setComplianceRelations(DspmIdentifyRefComplianceInfo [] ComplianceRelations) {
        this.ComplianceRelations = ComplianceRelations;
    }

    public DspmIdentifyLevelGroupItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyLevelGroupItem(DspmIdentifyLevelGroupItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.LevelItems != null) {
            this.LevelItems = new DspmIdentifyLevelItem[source.LevelItems.length];
            for (int i = 0; i < source.LevelItems.length; i++) {
                this.LevelItems[i] = new DspmIdentifyLevelItem(source.LevelItems[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ComplianceRelations != null) {
            this.ComplianceRelations = new DspmIdentifyRefComplianceInfo[source.ComplianceRelations.length];
            for (int i = 0; i < source.ComplianceRelations.length; i++) {
                this.ComplianceRelations[i] = new DspmIdentifyRefComplianceInfo(source.ComplianceRelations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "LevelItems.", this.LevelItems);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "ComplianceRelations.", this.ComplianceRelations);

    }
}

