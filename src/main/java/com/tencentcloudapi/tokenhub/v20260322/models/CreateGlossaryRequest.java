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

public class CreateGlossaryRequest extends AbstractModel {

    /**
    * Terminology library name. Maximum 50 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Source language code. Maximum 16 characters, such as zh (Chinese), en (English).
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Target language code. Maximum 16 characters, such as zh (Chinese), en (English).
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * Termbase description. Maximum 255 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Terminology library name. Maximum 50 characters. 
     * @return Name Terminology library name. Maximum 50 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Terminology library name. Maximum 50 characters.
     * @param Name Terminology library name. Maximum 50 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Source language code. Maximum 16 characters, such as zh (Chinese), en (English). 
     * @return Source Source language code. Maximum 16 characters, such as zh (Chinese), en (English).
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Source language code. Maximum 16 characters, such as zh (Chinese), en (English).
     * @param Source Source language code. Maximum 16 characters, such as zh (Chinese), en (English).
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Target language code. Maximum 16 characters, such as zh (Chinese), en (English). 
     * @return Target Target language code. Maximum 16 characters, such as zh (Chinese), en (English).
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Target language code. Maximum 16 characters, such as zh (Chinese), en (English).
     * @param Target Target language code. Maximum 16 characters, such as zh (Chinese), en (English).
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get Termbase description. Maximum 255 characters. 
     * @return Description Termbase description. Maximum 255 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Termbase description. Maximum 255 characters.
     * @param Description Termbase description. Maximum 255 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateGlossaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGlossaryRequest(CreateGlossaryRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

