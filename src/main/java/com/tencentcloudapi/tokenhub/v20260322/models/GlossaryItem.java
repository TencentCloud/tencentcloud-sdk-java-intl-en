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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GlossaryItem extends AbstractModel {

    /**
    * Termbase ID.
    */
    @SerializedName("GlossaryId")
    @Expose
    private String GlossaryId;

    /**
    * Terminology repository name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Repository description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Source language code.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Target language code.
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * Creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Update time.
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get Termbase ID. 
     * @return GlossaryId Termbase ID.
     */
    public String getGlossaryId() {
        return this.GlossaryId;
    }

    /**
     * Set Termbase ID.
     * @param GlossaryId Termbase ID.
     */
    public void setGlossaryId(String GlossaryId) {
        this.GlossaryId = GlossaryId;
    }

    /**
     * Get Terminology repository name. 
     * @return Name Terminology repository name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Terminology repository name.
     * @param Name Terminology repository name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Repository description. 
     * @return Description Repository description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Repository description.
     * @param Description Repository description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Source language code. 
     * @return Source Source language code.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Source language code.
     * @param Source Source language code.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Target language code. 
     * @return Target Target language code.
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Target language code.
     * @param Target Target language code.
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get Creation time. 
     * @return CreatedTime Creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time.
     * @param CreatedTime Creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Update time. 
     * @return UpdatedTime Update time.
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set Update time.
     * @param UpdatedTime Update time.
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public GlossaryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlossaryItem(GlossaryItem source) {
        if (source.GlossaryId != null) {
            this.GlossaryId = new String(source.GlossaryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlossaryId", this.GlossaryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

