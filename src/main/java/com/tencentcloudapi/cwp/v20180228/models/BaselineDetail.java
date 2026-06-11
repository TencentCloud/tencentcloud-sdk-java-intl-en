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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineDetail extends AbstractModel {

    /**
    * Baseline description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Severity level
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * package name
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * Parent id
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * Baseline name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Baseline description 
     * @return Description Baseline description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Baseline description
     * @param Description Baseline description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Severity level 
     * @return Level Severity level
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Severity level
     * @param Level Severity level
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get package name 
     * @return PackageName package name
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set package name
     * @param PackageName package name
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get Parent id 
     * @return ParentId Parent id
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set Parent id
     * @param ParentId Parent id
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get Baseline name 
     * @return Name Baseline name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Baseline name
     * @param Name Baseline name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public BaselineDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineDetail(BaselineDetail source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

