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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonNamespace extends AbstractModel{

    /**
    * Namespace ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Namespace name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Namespace value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Product name
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Configuration information
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * List of supported regions
    */
    @SerializedName("AvailableRegions")
    @Expose
    private String [] AvailableRegions;

    /**
    * Sort ID
    */
    @SerializedName("SortId")
    @Expose
    private Long SortId;

    /**
    * Unique ID in Dashboard
    */
    @SerializedName("DashboardId")
    @Expose
    private String DashboardId;

    /**
     * Get Namespace ID 
     * @return Id Namespace ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Namespace ID
     * @param Id Namespace ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Namespace name 
     * @return Name Namespace name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Namespace name
     * @param Name Namespace name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Namespace value 
     * @return Value Namespace value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Namespace value
     * @param Value Namespace value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Product name 
     * @return ProductName Product name
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name
     * @param ProductName Product name
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Configuration information 
     * @return Config Configuration information
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set Configuration information
     * @param Config Configuration information
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get List of supported regions 
     * @return AvailableRegions List of supported regions
     */
    public String [] getAvailableRegions() {
        return this.AvailableRegions;
    }

    /**
     * Set List of supported regions
     * @param AvailableRegions List of supported regions
     */
    public void setAvailableRegions(String [] AvailableRegions) {
        this.AvailableRegions = AvailableRegions;
    }

    /**
     * Get Sort ID 
     * @return SortId Sort ID
     */
    public Long getSortId() {
        return this.SortId;
    }

    /**
     * Set Sort ID
     * @param SortId Sort ID
     */
    public void setSortId(Long SortId) {
        this.SortId = SortId;
    }

    /**
     * Get Unique ID in Dashboard 
     * @return DashboardId Unique ID in Dashboard
     */
    public String getDashboardId() {
        return this.DashboardId;
    }

    /**
     * Set Unique ID in Dashboard
     * @param DashboardId Unique ID in Dashboard
     */
    public void setDashboardId(String DashboardId) {
        this.DashboardId = DashboardId;
    }

    public CommonNamespace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonNamespace(CommonNamespace source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.AvailableRegions != null) {
            this.AvailableRegions = new String[source.AvailableRegions.length];
            for (int i = 0; i < source.AvailableRegions.length; i++) {
                this.AvailableRegions[i] = new String(source.AvailableRegions[i]);
            }
        }
        if (source.SortId != null) {
            this.SortId = new Long(source.SortId);
        }
        if (source.DashboardId != null) {
            this.DashboardId = new String(source.DashboardId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamArraySimple(map, prefix + "AvailableRegions.", this.AvailableRegions);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamSimple(map, prefix + "DashboardId", this.DashboardId);

    }
}

