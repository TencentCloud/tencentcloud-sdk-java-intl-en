/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubAppIdInfo extends AbstractModel{

    /**
    * Subapplication ID.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Subapplication name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Subapplication overview.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Subapplication creation time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Subapplication status. Valid values:
<li>On: enabled</li>
<li>Off: disabled</li>
<li>Destroying: terminating</li>
<li>Destroyed: terminated</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Subapplication ID. 
     * @return SubAppId Subapplication ID.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set Subapplication ID.
     * @param SubAppId Subapplication ID.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Subapplication name. 
     * @return Name Subapplication name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Subapplication name.
     * @param Name Subapplication name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Subapplication overview. 
     * @return Description Subapplication overview.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Subapplication overview.
     * @param Description Subapplication overview.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Subapplication creation time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Subapplication creation time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Subapplication creation time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Subapplication creation time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Subapplication status. Valid values:
<li>On: enabled</li>
<li>Off: disabled</li>
<li>Destroying: terminating</li>
<li>Destroyed: terminated</li> 
     * @return Status Subapplication status. Valid values:
<li>On: enabled</li>
<li>Off: disabled</li>
<li>Destroying: terminating</li>
<li>Destroyed: terminated</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Subapplication status. Valid values:
<li>On: enabled</li>
<li>Off: disabled</li>
<li>Destroying: terminating</li>
<li>Destroyed: terminated</li>
     * @param Status Subapplication status. Valid values:
<li>On: enabled</li>
<li>Off: disabled</li>
<li>Destroying: terminating</li>
<li>Destroyed: terminated</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public SubAppIdInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubAppIdInfo(SubAppIdInfo source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

