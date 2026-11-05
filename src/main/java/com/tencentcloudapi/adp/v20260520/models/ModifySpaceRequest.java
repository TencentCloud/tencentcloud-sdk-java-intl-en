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

public class ModifySpaceRequest extends AbstractModel {

    /**
    * Workspace name. Maximum length: 30 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Space description. Maximum length: 150 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Space id
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * Fields to update. `Name` and `Description` supported.
    */
    @SerializedName("FieldMask")
    @Expose
    private FieldMask FieldMask;

    /**
     * Get Workspace name. Maximum length: 30 characters. 
     * @return Name Workspace name. Maximum length: 30 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Workspace name. Maximum length: 30 characters.
     * @param Name Workspace name. Maximum length: 30 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Space description. Maximum length: 150 characters. 
     * @return Description Space description. Maximum length: 150 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Space description. Maximum length: 150 characters.
     * @param Description Space description. Maximum length: 150 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Space id 
     * @return SpaceId Space id
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set Space id
     * @param SpaceId Space id
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get Fields to update. `Name` and `Description` supported. 
     * @return FieldMask Fields to update. `Name` and `Description` supported.
     */
    public FieldMask getFieldMask() {
        return this.FieldMask;
    }

    /**
     * Set Fields to update. `Name` and `Description` supported.
     * @param FieldMask Fields to update. `Name` and `Description` supported.
     */
    public void setFieldMask(FieldMask FieldMask) {
        this.FieldMask = FieldMask;
    }

    public ModifySpaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySpaceRequest(ModifySpaceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.FieldMask != null) {
            this.FieldMask = new FieldMask(source.FieldMask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamObj(map, prefix + "FieldMask.", this.FieldMask);

    }
}

