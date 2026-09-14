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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocToVideoRegenerateInput extends AbstractModel {

    /**
    * <p>Regeneration scope.</p><p>Enumeration values:</p><ul><li>full: Full regeneration at this stage (for example, modifying the overall number of scenarios)</li><li>scenes: Partial regeneration by scenario (for example, modifying the specific content of a scenario)</li></ul>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * <p>Prompt content for regeneration.</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Target page ID array for partial regeneration by page. Required only when Scope=scenes. Not repeatable. Up to 5 pages can be regenerated at a time.</p>
    */
    @SerializedName("SceneIds")
    @Expose
    private String [] SceneIds;

    /**
     * Get <p>Regeneration scope.</p><p>Enumeration values:</p><ul><li>full: Full regeneration at this stage (for example, modifying the overall number of scenarios)</li><li>scenes: Partial regeneration by scenario (for example, modifying the specific content of a scenario)</li></ul> 
     * @return Scope <p>Regeneration scope.</p><p>Enumeration values:</p><ul><li>full: Full regeneration at this stage (for example, modifying the overall number of scenarios)</li><li>scenes: Partial regeneration by scenario (for example, modifying the specific content of a scenario)</li></ul>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set <p>Regeneration scope.</p><p>Enumeration values:</p><ul><li>full: Full regeneration at this stage (for example, modifying the overall number of scenarios)</li><li>scenes: Partial regeneration by scenario (for example, modifying the specific content of a scenario)</li></ul>
     * @param Scope <p>Regeneration scope.</p><p>Enumeration values:</p><ul><li>full: Full regeneration at this stage (for example, modifying the overall number of scenarios)</li><li>scenes: Partial regeneration by scenario (for example, modifying the specific content of a scenario)</li></ul>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Prompt content for regeneration.</p> 
     * @return Prompt <p>Prompt content for regeneration.</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Prompt content for regeneration.</p>
     * @param Prompt <p>Prompt content for regeneration.</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Target page ID array for partial regeneration by page. Required only when Scope=scenes. Not repeatable. Up to 5 pages can be regenerated at a time.</p> 
     * @return SceneIds <p>Target page ID array for partial regeneration by page. Required only when Scope=scenes. Not repeatable. Up to 5 pages can be regenerated at a time.</p>
     */
    public String [] getSceneIds() {
        return this.SceneIds;
    }

    /**
     * Set <p>Target page ID array for partial regeneration by page. Required only when Scope=scenes. Not repeatable. Up to 5 pages can be regenerated at a time.</p>
     * @param SceneIds <p>Target page ID array for partial regeneration by page. Required only when Scope=scenes. Not repeatable. Up to 5 pages can be regenerated at a time.</p>
     */
    public void setSceneIds(String [] SceneIds) {
        this.SceneIds = SceneIds;
    }

    public DocToVideoRegenerateInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocToVideoRegenerateInput(DocToVideoRegenerateInput source) {
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.SceneIds != null) {
            this.SceneIds = new String[source.SceneIds.length];
            for (int i = 0; i < source.SceneIds.length; i++) {
                this.SceneIds[i] = new String(source.SceneIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamArraySimple(map, prefix + "SceneIds.", this.SceneIds);

    }
}

