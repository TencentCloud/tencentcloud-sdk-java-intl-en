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

public class ViewScope extends AbstractModel {

    /**
    * <p>View type; enumeration values: VIEW_TYPE_CORP(1) corporate view, VIEW_TYPE_SPACE(2) space view, VIEW_TYPE_APP(3) application view</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>VIEW_TYPE_UNSPECIFIED</td><td>0</td><td>Not specified (invalid value, do not pass in requests)</td></tr><tr><td>VIEW_TYPE_CORP</td><td>1</td><td>Corporate view</td></tr><tr><td>VIEW_TYPE_SPACE</td><td>2</td><td>Space view</td></tr><tr><td>VIEW_TYPE_APP</td><td>3</td><td>Application view</td></tr></table>
    */
    @SerializedName("ViewType")
    @Expose
    private Long ViewType;

    /**
    * <p>View scope ID; leave empty for VIEW_TYPE_CORP; enter space_id for VIEW_TYPE_SPACE; enter app_id for VIEW_TYPE_APP (decimal string of uint64 snowflake ID)</p>
    */
    @SerializedName("ScopeId")
    @Expose
    private String ScopeId;

    /**
     * Get <p>View type; enumeration values: VIEW_TYPE_CORP(1) corporate view, VIEW_TYPE_SPACE(2) space view, VIEW_TYPE_APP(3) application view</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>VIEW_TYPE_UNSPECIFIED</td><td>0</td><td>Not specified (invalid value, do not pass in requests)</td></tr><tr><td>VIEW_TYPE_CORP</td><td>1</td><td>Corporate view</td></tr><tr><td>VIEW_TYPE_SPACE</td><td>2</td><td>Space view</td></tr><tr><td>VIEW_TYPE_APP</td><td>3</td><td>Application view</td></tr></table> 
     * @return ViewType <p>View type; enumeration values: VIEW_TYPE_CORP(1) corporate view, VIEW_TYPE_SPACE(2) space view, VIEW_TYPE_APP(3) application view</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>VIEW_TYPE_UNSPECIFIED</td><td>0</td><td>Not specified (invalid value, do not pass in requests)</td></tr><tr><td>VIEW_TYPE_CORP</td><td>1</td><td>Corporate view</td></tr><tr><td>VIEW_TYPE_SPACE</td><td>2</td><td>Space view</td></tr><tr><td>VIEW_TYPE_APP</td><td>3</td><td>Application view</td></tr></table>
     */
    public Long getViewType() {
        return this.ViewType;
    }

    /**
     * Set <p>View type; enumeration values: VIEW_TYPE_CORP(1) corporate view, VIEW_TYPE_SPACE(2) space view, VIEW_TYPE_APP(3) application view</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>VIEW_TYPE_UNSPECIFIED</td><td>0</td><td>Not specified (invalid value, do not pass in requests)</td></tr><tr><td>VIEW_TYPE_CORP</td><td>1</td><td>Corporate view</td></tr><tr><td>VIEW_TYPE_SPACE</td><td>2</td><td>Space view</td></tr><tr><td>VIEW_TYPE_APP</td><td>3</td><td>Application view</td></tr></table>
     * @param ViewType <p>View type; enumeration values: VIEW_TYPE_CORP(1) corporate view, VIEW_TYPE_SPACE(2) space view, VIEW_TYPE_APP(3) application view</p><table><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>VIEW_TYPE_UNSPECIFIED</td><td>0</td><td>Not specified (invalid value, do not pass in requests)</td></tr><tr><td>VIEW_TYPE_CORP</td><td>1</td><td>Corporate view</td></tr><tr><td>VIEW_TYPE_SPACE</td><td>2</td><td>Space view</td></tr><tr><td>VIEW_TYPE_APP</td><td>3</td><td>Application view</td></tr></table>
     */
    public void setViewType(Long ViewType) {
        this.ViewType = ViewType;
    }

    /**
     * Get <p>View scope ID; leave empty for VIEW_TYPE_CORP; enter space_id for VIEW_TYPE_SPACE; enter app_id for VIEW_TYPE_APP (decimal string of uint64 snowflake ID)</p> 
     * @return ScopeId <p>View scope ID; leave empty for VIEW_TYPE_CORP; enter space_id for VIEW_TYPE_SPACE; enter app_id for VIEW_TYPE_APP (decimal string of uint64 snowflake ID)</p>
     */
    public String getScopeId() {
        return this.ScopeId;
    }

    /**
     * Set <p>View scope ID; leave empty for VIEW_TYPE_CORP; enter space_id for VIEW_TYPE_SPACE; enter app_id for VIEW_TYPE_APP (decimal string of uint64 snowflake ID)</p>
     * @param ScopeId <p>View scope ID; leave empty for VIEW_TYPE_CORP; enter space_id for VIEW_TYPE_SPACE; enter app_id for VIEW_TYPE_APP (decimal string of uint64 snowflake ID)</p>
     */
    public void setScopeId(String ScopeId) {
        this.ScopeId = ScopeId;
    }

    public ViewScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewScope(ViewScope source) {
        if (source.ViewType != null) {
            this.ViewType = new Long(source.ViewType);
        }
        if (source.ScopeId != null) {
            this.ScopeId = new String(source.ScopeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ViewType", this.ViewType);
        this.setParamSimple(map, prefix + "ScopeId", this.ScopeId);

    }
}

