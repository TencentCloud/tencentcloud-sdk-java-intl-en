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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Site extends AbstractModel {

    /**
    * Site name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Site id
    */
    @SerializedName("SiteId")
    @Expose
    private String SiteId;

    /**
    * Site description 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Site creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Site name 
     * @return Name Site name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Site name
     * @param Name Site name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Site id 
     * @return SiteId Site id
     */
    public String getSiteId() {
        return this.SiteId;
    }

    /**
     * Set Site id
     * @param SiteId Site id
     */
    public void setSiteId(String SiteId) {
        this.SiteId = SiteId;
    }

    /**
     * Get Site description 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return Description Site description 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Site description 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param Description Site description 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Site creation time 
     * @return CreateTime Site creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Site creation time
     * @param CreateTime Site creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public Site() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Site(Site source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SiteId != null) {
            this.SiteId = new String(source.SiteId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

