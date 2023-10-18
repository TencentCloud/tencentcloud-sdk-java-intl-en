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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrationConfiguration extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Type
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * Content
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance type
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Instance description
    */
    @SerializedName("InstanceDesc")
    @Expose
    private String InstanceDesc;

    /**
    * Dashboard URL
    */
    @SerializedName("GrafanaDashboardURL")
    @Expose
    private String GrafanaDashboardURL;

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Type 
     * @return Kind Type
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set Type
     * @param Kind Type
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get Content 
     * @return Content Content
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Content
     * @param Content Content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance type 
     * @return Category Instance type
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Instance type
     * @param Category Instance type
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Instance description 
     * @return InstanceDesc Instance description
     */
    public String getInstanceDesc() {
        return this.InstanceDesc;
    }

    /**
     * Set Instance description
     * @param InstanceDesc Instance description
     */
    public void setInstanceDesc(String InstanceDesc) {
        this.InstanceDesc = InstanceDesc;
    }

    /**
     * Get Dashboard URL 
     * @return GrafanaDashboardURL Dashboard URL
     */
    public String getGrafanaDashboardURL() {
        return this.GrafanaDashboardURL;
    }

    /**
     * Set Dashboard URL
     * @param GrafanaDashboardURL Dashboard URL
     */
    public void setGrafanaDashboardURL(String GrafanaDashboardURL) {
        this.GrafanaDashboardURL = GrafanaDashboardURL;
    }

    public IntegrationConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationConfiguration(IntegrationConfiguration source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.InstanceDesc != null) {
            this.InstanceDesc = new String(source.InstanceDesc);
        }
        if (source.GrafanaDashboardURL != null) {
            this.GrafanaDashboardURL = new String(source.GrafanaDashboardURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "InstanceDesc", this.InstanceDesc);
        this.setParamSimple(map, prefix + "GrafanaDashboardURL", this.GrafanaDashboardURL);

    }
}

