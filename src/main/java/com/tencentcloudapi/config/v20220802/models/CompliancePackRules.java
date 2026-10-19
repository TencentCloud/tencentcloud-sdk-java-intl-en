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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompliancePackRules extends AbstractModel {

    /**
    * <p>Rule ID.</p>
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * <p>Rule number information.</p>
    */
    @SerializedName("Control")
    @Expose
    private Control [] Control;

    /**
    * <p>Resource type.</p>
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
     * Get <p>Rule ID.</p> 
     * @return Identifier <p>Rule ID.</p>
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set <p>Rule ID.</p>
     * @param Identifier <p>Rule ID.</p>
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get <p>Rule number information.</p> 
     * @return Control <p>Rule number information.</p>
     */
    public Control [] getControl() {
        return this.Control;
    }

    /**
     * Set <p>Rule number information.</p>
     * @param Control <p>Rule number information.</p>
     */
    public void setControl(Control [] Control) {
        this.Control = Control;
    }

    /**
     * Get <p>Resource type.</p> 
     * @return ResourceTypes <p>Resource type.</p>
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set <p>Resource type.</p>
     * @param ResourceTypes <p>Resource type.</p>
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    public CompliancePackRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompliancePackRules(CompliancePackRules source) {
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.Control != null) {
            this.Control = new Control[source.Control.length];
            for (int i = 0; i < source.Control.length; i++) {
                this.Control[i] = new Control(source.Control[i]);
            }
        }
        if (source.ResourceTypes != null) {
            this.ResourceTypes = new String[source.ResourceTypes.length];
            for (int i = 0; i < source.ResourceTypes.length; i++) {
                this.ResourceTypes[i] = new String(source.ResourceTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamArrayObj(map, prefix + "Control.", this.Control);
        this.setParamArraySimple(map, prefix + "ResourceTypes.", this.ResourceTypes);

    }
}

