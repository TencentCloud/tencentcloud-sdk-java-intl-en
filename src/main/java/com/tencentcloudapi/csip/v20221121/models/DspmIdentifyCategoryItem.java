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

public class DspmIdentifyCategoryItem extends AbstractModel {

    /**
    * <p>Category ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Category name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Update time.</p>
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
     * Get <p>Category ID</p> 
     * @return Id <p>Category ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Category ID</p>
     * @param Id <p>Category ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Category name</p> 
     * @return Name <p>Category name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Category name</p>
     * @param Name <p>Category name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul> 
     * @return Type <p>Type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     * @param Type <p>Type</p><p>Enumeration values:</p><ul><li>0: Built-in</li><li>1: Custom</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
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

    public DspmIdentifyCategoryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyCategoryItem(DspmIdentifyCategoryItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "ComplianceRelations.", this.ComplianceRelations);

    }
}

