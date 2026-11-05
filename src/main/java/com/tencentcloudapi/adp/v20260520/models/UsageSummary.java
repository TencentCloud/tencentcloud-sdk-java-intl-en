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

public class UsageSummary extends AbstractModel {

    /**
    * <p>Exclusive to MODEL domain</p>
    */
    @SerializedName("Model")
    @Expose
    private ModelUsageSummary Model;

    /**
    * <p>PLATFORM domain exclusive</p>
    */
    @SerializedName("Platform")
    @Expose
    private PlatformUsageSummary Platform;

    /**
    * <p>Exclusive to PLUGIN domain</p>
    */
    @SerializedName("Plugin")
    @Expose
    private PluginUsageSummary Plugin;

    /**
    * <p>Source ID; CORP view=space_id (corporate view grouped by space), SPACE view=app_id (uint64 string), APP view=app_id</p>
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * <p>Source name; CORP view=space_name, SPACE view=app_name, APP view=app_name</p>
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * <p>View type, determines the business meaning of SourceId/SourceName</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>VIEW_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified (invalid value, do not pass in requests)</td></tr><tr><td>VIEW_TYPE_CORP</td><td>1</td><td>Corporate view</td></tr><tr><td>VIEW_TYPE_SPACE</td><td>2</td><td>Space view</td></tr><tr><td>VIEW_TYPE_APP</td><td>3</td><td>Application view</td></tr></tbody></table>
    */
    @SerializedName("ViewType")
    @Expose
    private Long ViewType;

    /**
     * Get <p>Exclusive to MODEL domain</p> 
     * @return Model <p>Exclusive to MODEL domain</p>
     */
    public ModelUsageSummary getModel() {
        return this.Model;
    }

    /**
     * Set <p>Exclusive to MODEL domain</p>
     * @param Model <p>Exclusive to MODEL domain</p>
     */
    public void setModel(ModelUsageSummary Model) {
        this.Model = Model;
    }

    /**
     * Get <p>PLATFORM domain exclusive</p> 
     * @return Platform <p>PLATFORM domain exclusive</p>
     */
    public PlatformUsageSummary getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>PLATFORM domain exclusive</p>
     * @param Platform <p>PLATFORM domain exclusive</p>
     */
    public void setPlatform(PlatformUsageSummary Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>Exclusive to PLUGIN domain</p> 
     * @return Plugin <p>Exclusive to PLUGIN domain</p>
     */
    public PluginUsageSummary getPlugin() {
        return this.Plugin;
    }

    /**
     * Set <p>Exclusive to PLUGIN domain</p>
     * @param Plugin <p>Exclusive to PLUGIN domain</p>
     */
    public void setPlugin(PluginUsageSummary Plugin) {
        this.Plugin = Plugin;
    }

    /**
     * Get <p>Source ID; CORP view=space_id (corporate view grouped by space), SPACE view=app_id (uint64 string), APP view=app_id</p> 
     * @return SourceId <p>Source ID; CORP view=space_id (corporate view grouped by space), SPACE view=app_id (uint64 string), APP view=app_id</p>
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set <p>Source ID; CORP view=space_id (corporate view grouped by space), SPACE view=app_id (uint64 string), APP view=app_id</p>
     * @param SourceId <p>Source ID; CORP view=space_id (corporate view grouped by space), SPACE view=app_id (uint64 string), APP view=app_id</p>
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get <p>Source name; CORP view=space_name, SPACE view=app_name, APP view=app_name</p> 
     * @return SourceName <p>Source name; CORP view=space_name, SPACE view=app_name, APP view=app_name</p>
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set <p>Source name; CORP view=space_name, SPACE view=app_name, APP view=app_name</p>
     * @param SourceName <p>Source name; CORP view=space_name, SPACE view=app_name, APP view=app_name</p>
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get <p>View type, determines the business meaning of SourceId/SourceName</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>VIEW_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified (invalid value, do not pass in requests)</td></tr><tr><td>VIEW_TYPE_CORP</td><td>1</td><td>Corporate view</td></tr><tr><td>VIEW_TYPE_SPACE</td><td>2</td><td>Space view</td></tr><tr><td>VIEW_TYPE_APP</td><td>3</td><td>Application view</td></tr></tbody></table> 
     * @return ViewType <p>View type, determines the business meaning of SourceId/SourceName</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>VIEW_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified (invalid value, do not pass in requests)</td></tr><tr><td>VIEW_TYPE_CORP</td><td>1</td><td>Corporate view</td></tr><tr><td>VIEW_TYPE_SPACE</td><td>2</td><td>Space view</td></tr><tr><td>VIEW_TYPE_APP</td><td>3</td><td>Application view</td></tr></tbody></table>
     */
    public Long getViewType() {
        return this.ViewType;
    }

    /**
     * Set <p>View type, determines the business meaning of SourceId/SourceName</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>VIEW_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified (invalid value, do not pass in requests)</td></tr><tr><td>VIEW_TYPE_CORP</td><td>1</td><td>Corporate view</td></tr><tr><td>VIEW_TYPE_SPACE</td><td>2</td><td>Space view</td></tr><tr><td>VIEW_TYPE_APP</td><td>3</td><td>Application view</td></tr></tbody></table>
     * @param ViewType <p>View type, determines the business meaning of SourceId/SourceName</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>VIEW_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified (invalid value, do not pass in requests)</td></tr><tr><td>VIEW_TYPE_CORP</td><td>1</td><td>Corporate view</td></tr><tr><td>VIEW_TYPE_SPACE</td><td>2</td><td>Space view</td></tr><tr><td>VIEW_TYPE_APP</td><td>3</td><td>Application view</td></tr></tbody></table>
     */
    public void setViewType(Long ViewType) {
        this.ViewType = ViewType;
    }

    public UsageSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageSummary(UsageSummary source) {
        if (source.Model != null) {
            this.Model = new ModelUsageSummary(source.Model);
        }
        if (source.Platform != null) {
            this.Platform = new PlatformUsageSummary(source.Platform);
        }
        if (source.Plugin != null) {
            this.Plugin = new PluginUsageSummary(source.Plugin);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.ViewType != null) {
            this.ViewType = new Long(source.ViewType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamObj(map, prefix + "Platform.", this.Platform);
        this.setParamObj(map, prefix + "Plugin.", this.Plugin);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "ViewType", this.ViewType);

    }
}

