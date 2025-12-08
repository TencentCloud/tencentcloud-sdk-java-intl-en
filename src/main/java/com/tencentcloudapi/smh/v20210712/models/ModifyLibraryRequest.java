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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLibraryRequest extends AbstractModel {

    /**
    * Media library ID.
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * Media library name. up to 50 characters. leave empty to keep the current value.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Specifies the remark, up to 250 characters. leave it empty to keep the original value.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Media library configuration item. some parameters cannot be changed after creation and only modify passed parameters. if this parameter is not passed, no configuration item will be modified.
    */
    @SerializedName("LibraryExtension")
    @Expose
    private LibraryExtension LibraryExtension;

    /**
     * Get Media library ID. 
     * @return LibraryId Media library ID.
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set Media library ID.
     * @param LibraryId Media library ID.
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * Get Media library name. up to 50 characters. leave empty to keep the current value. 
     * @return Name Media library name. up to 50 characters. leave empty to keep the current value.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Media library name. up to 50 characters. leave empty to keep the current value.
     * @param Name Media library name. up to 50 characters. leave empty to keep the current value.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Specifies the remark, up to 250 characters. leave it empty to keep the original value. 
     * @return Remark Specifies the remark, up to 250 characters. leave it empty to keep the original value.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Specifies the remark, up to 250 characters. leave it empty to keep the original value.
     * @param Remark Specifies the remark, up to 250 characters. leave it empty to keep the original value.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Media library configuration item. some parameters cannot be changed after creation and only modify passed parameters. if this parameter is not passed, no configuration item will be modified. 
     * @return LibraryExtension Media library configuration item. some parameters cannot be changed after creation and only modify passed parameters. if this parameter is not passed, no configuration item will be modified.
     */
    public LibraryExtension getLibraryExtension() {
        return this.LibraryExtension;
    }

    /**
     * Set Media library configuration item. some parameters cannot be changed after creation and only modify passed parameters. if this parameter is not passed, no configuration item will be modified.
     * @param LibraryExtension Media library configuration item. some parameters cannot be changed after creation and only modify passed parameters. if this parameter is not passed, no configuration item will be modified.
     */
    public void setLibraryExtension(LibraryExtension LibraryExtension) {
        this.LibraryExtension = LibraryExtension;
    }

    public ModifyLibraryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLibraryRequest(ModifyLibraryRequest source) {
        if (source.LibraryId != null) {
            this.LibraryId = new String(source.LibraryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.LibraryExtension != null) {
            this.LibraryExtension = new LibraryExtension(source.LibraryExtension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamObj(map, prefix + "LibraryExtension.", this.LibraryExtension);

    }
}

