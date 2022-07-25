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

public class ServiceDiscoveryItem extends AbstractModel{

    /**
    * Scrape configuration name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Namespace of the scrape configuration
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Scrape configuration type: ServiceMonitor/PodMonitor
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * Namespace selection method
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NamespaceSelector")
    @Expose
    private String NamespaceSelector;

    /**
    * Label selection method
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Selector")
    @Expose
    private String Selector;

    /**
    * `Endpoints` information (PodMonitor does not have this parameter)
    */
    @SerializedName("Endpoints")
    @Expose
    private String Endpoints;

    /**
    * Scrape configuration information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
     * Get Scrape configuration name 
     * @return Name Scrape configuration name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Scrape configuration name
     * @param Name Scrape configuration name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Namespace of the scrape configuration 
     * @return Namespace Namespace of the scrape configuration
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace of the scrape configuration
     * @param Namespace Namespace of the scrape configuration
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Scrape configuration type: ServiceMonitor/PodMonitor 
     * @return Kind Scrape configuration type: ServiceMonitor/PodMonitor
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set Scrape configuration type: ServiceMonitor/PodMonitor
     * @param Kind Scrape configuration type: ServiceMonitor/PodMonitor
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get Namespace selection method
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NamespaceSelector Namespace selection method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespaceSelector() {
        return this.NamespaceSelector;
    }

    /**
     * Set Namespace selection method
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NamespaceSelector Namespace selection method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespaceSelector(String NamespaceSelector) {
        this.NamespaceSelector = NamespaceSelector;
    }

    /**
     * Get Label selection method
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Selector Label selection method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSelector() {
        return this.Selector;
    }

    /**
     * Set Label selection method
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Selector Label selection method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSelector(String Selector) {
        this.Selector = Selector;
    }

    /**
     * Get `Endpoints` information (PodMonitor does not have this parameter) 
     * @return Endpoints `Endpoints` information (PodMonitor does not have this parameter)
     */
    public String getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set `Endpoints` information (PodMonitor does not have this parameter)
     * @param Endpoints `Endpoints` information (PodMonitor does not have this parameter)
     */
    public void setEndpoints(String Endpoints) {
        this.Endpoints = Endpoints;
    }

    /**
     * Get Scrape configuration information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Yaml Scrape configuration information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set Scrape configuration information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Yaml Scrape configuration information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
    }

    public ServiceDiscoveryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceDiscoveryItem(ServiceDiscoveryItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.NamespaceSelector != null) {
            this.NamespaceSelector = new String(source.NamespaceSelector);
        }
        if (source.Selector != null) {
            this.Selector = new String(source.Selector);
        }
        if (source.Endpoints != null) {
            this.Endpoints = new String(source.Endpoints);
        }
        if (source.Yaml != null) {
            this.Yaml = new String(source.Yaml);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "NamespaceSelector", this.NamespaceSelector);
        this.setParamSimple(map, prefix + "Selector", this.Selector);
        this.setParamSimple(map, prefix + "Endpoints", this.Endpoints);
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);

    }
}

