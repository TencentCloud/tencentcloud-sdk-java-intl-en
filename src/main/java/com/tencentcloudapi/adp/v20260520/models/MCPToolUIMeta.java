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

public class MCPToolUIMeta extends AbstractModel {

    /**
    * <p>Associated UI resource URI in UI:// scheme, format: UI://&lt;plug-in flag&gt;/&lt;resource name&gt;-&lt;version&gt;. This field is the entry to the interactive UI of MCP Apps. If not empty, it means the tool supports Apps (shown as "text + interactive UI"). If empty, it is a plain text tool. It is automatically identified and filled based on the tool sync result and does not support manual editing.</p>
    */
    @SerializedName("ResourceUri")
    @Expose
    private String ResourceUri;

    /**
    * <p>Visibility declaration for tool callers. Value range: model (callable by models), app (callable by UI). Multiple selections allowed, for example [&quot;model&quot;,&quot;app&quot;]. Independent of ResourceUri (SEP-1865) and can exist independently. For example, a backend app-only tool is [&quot;app&quot;]. When ResourceUri is non-empty and this field is not specified, it is normalized to [&quot;model&quot;,&quot;app&quot;] by default. Existing non-Apps tools remain empty.</p><p>Enumeration values:</p><ul><li>model: Supports model</li><li>app: Supports app</li></ul>
    */
    @SerializedName("Visibility")
    @Expose
    private String [] Visibility;

    /**
     * Get <p>Associated UI resource URI in UI:// scheme, format: UI://&lt;plug-in flag&gt;/&lt;resource name&gt;-&lt;version&gt;. This field is the entry to the interactive UI of MCP Apps. If not empty, it means the tool supports Apps (shown as "text + interactive UI"). If empty, it is a plain text tool. It is automatically identified and filled based on the tool sync result and does not support manual editing.</p> 
     * @return ResourceUri <p>Associated UI resource URI in UI:// scheme, format: UI://&lt;plug-in flag&gt;/&lt;resource name&gt;-&lt;version&gt;. This field is the entry to the interactive UI of MCP Apps. If not empty, it means the tool supports Apps (shown as "text + interactive UI"). If empty, it is a plain text tool. It is automatically identified and filled based on the tool sync result and does not support manual editing.</p>
     */
    public String getResourceUri() {
        return this.ResourceUri;
    }

    /**
     * Set <p>Associated UI resource URI in UI:// scheme, format: UI://&lt;plug-in flag&gt;/&lt;resource name&gt;-&lt;version&gt;. This field is the entry to the interactive UI of MCP Apps. If not empty, it means the tool supports Apps (shown as "text + interactive UI"). If empty, it is a plain text tool. It is automatically identified and filled based on the tool sync result and does not support manual editing.</p>
     * @param ResourceUri <p>Associated UI resource URI in UI:// scheme, format: UI://&lt;plug-in flag&gt;/&lt;resource name&gt;-&lt;version&gt;. This field is the entry to the interactive UI of MCP Apps. If not empty, it means the tool supports Apps (shown as "text + interactive UI"). If empty, it is a plain text tool. It is automatically identified and filled based on the tool sync result and does not support manual editing.</p>
     */
    public void setResourceUri(String ResourceUri) {
        this.ResourceUri = ResourceUri;
    }

    /**
     * Get <p>Visibility declaration for tool callers. Value range: model (callable by models), app (callable by UI). Multiple selections allowed, for example [&quot;model&quot;,&quot;app&quot;]. Independent of ResourceUri (SEP-1865) and can exist independently. For example, a backend app-only tool is [&quot;app&quot;]. When ResourceUri is non-empty and this field is not specified, it is normalized to [&quot;model&quot;,&quot;app&quot;] by default. Existing non-Apps tools remain empty.</p><p>Enumeration values:</p><ul><li>model: Supports model</li><li>app: Supports app</li></ul> 
     * @return Visibility <p>Visibility declaration for tool callers. Value range: model (callable by models), app (callable by UI). Multiple selections allowed, for example [&quot;model&quot;,&quot;app&quot;]. Independent of ResourceUri (SEP-1865) and can exist independently. For example, a backend app-only tool is [&quot;app&quot;]. When ResourceUri is non-empty and this field is not specified, it is normalized to [&quot;model&quot;,&quot;app&quot;] by default. Existing non-Apps tools remain empty.</p><p>Enumeration values:</p><ul><li>model: Supports model</li><li>app: Supports app</li></ul>
     */
    public String [] getVisibility() {
        return this.Visibility;
    }

    /**
     * Set <p>Visibility declaration for tool callers. Value range: model (callable by models), app (callable by UI). Multiple selections allowed, for example [&quot;model&quot;,&quot;app&quot;]. Independent of ResourceUri (SEP-1865) and can exist independently. For example, a backend app-only tool is [&quot;app&quot;]. When ResourceUri is non-empty and this field is not specified, it is normalized to [&quot;model&quot;,&quot;app&quot;] by default. Existing non-Apps tools remain empty.</p><p>Enumeration values:</p><ul><li>model: Supports model</li><li>app: Supports app</li></ul>
     * @param Visibility <p>Visibility declaration for tool callers. Value range: model (callable by models), app (callable by UI). Multiple selections allowed, for example [&quot;model&quot;,&quot;app&quot;]. Independent of ResourceUri (SEP-1865) and can exist independently. For example, a backend app-only tool is [&quot;app&quot;]. When ResourceUri is non-empty and this field is not specified, it is normalized to [&quot;model&quot;,&quot;app&quot;] by default. Existing non-Apps tools remain empty.</p><p>Enumeration values:</p><ul><li>model: Supports model</li><li>app: Supports app</li></ul>
     */
    public void setVisibility(String [] Visibility) {
        this.Visibility = Visibility;
    }

    public MCPToolUIMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MCPToolUIMeta(MCPToolUIMeta source) {
        if (source.ResourceUri != null) {
            this.ResourceUri = new String(source.ResourceUri);
        }
        if (source.Visibility != null) {
            this.Visibility = new String[source.Visibility.length];
            for (int i = 0; i < source.Visibility.length; i++) {
                this.Visibility[i] = new String(source.Visibility[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceUri", this.ResourceUri);
        this.setParamArraySimple(map, prefix + "Visibility.", this.Visibility);

    }
}

