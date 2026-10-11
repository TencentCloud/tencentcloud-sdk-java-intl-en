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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SparseCheckoutConfig extends AbstractModel {

    /**
    * <p>Whether to enable sparse detect</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>Whether to use cone mode (true recommended for greater efficiency in directory matching)</p>
    */
    @SerializedName("ConeMode")
    @Expose
    private Boolean ConeMode;

    /**
    * <p>Sparse checkout path list (for example, ["src/module-a/", "docs/"])</p>
    */
    @SerializedName("Patterns")
    @Expose
    private String [] Patterns;

    /**
     * Get <p>Whether to enable sparse detect</p> 
     * @return Enabled <p>Whether to enable sparse detect</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether to enable sparse detect</p>
     * @param Enabled <p>Whether to enable sparse detect</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>Whether to use cone mode (true recommended for greater efficiency in directory matching)</p> 
     * @return ConeMode <p>Whether to use cone mode (true recommended for greater efficiency in directory matching)</p>
     */
    public Boolean getConeMode() {
        return this.ConeMode;
    }

    /**
     * Set <p>Whether to use cone mode (true recommended for greater efficiency in directory matching)</p>
     * @param ConeMode <p>Whether to use cone mode (true recommended for greater efficiency in directory matching)</p>
     */
    public void setConeMode(Boolean ConeMode) {
        this.ConeMode = ConeMode;
    }

    /**
     * Get <p>Sparse checkout path list (for example, ["src/module-a/", "docs/"])</p> 
     * @return Patterns <p>Sparse checkout path list (for example, ["src/module-a/", "docs/"])</p>
     */
    public String [] getPatterns() {
        return this.Patterns;
    }

    /**
     * Set <p>Sparse checkout path list (for example, ["src/module-a/", "docs/"])</p>
     * @param Patterns <p>Sparse checkout path list (for example, ["src/module-a/", "docs/"])</p>
     */
    public void setPatterns(String [] Patterns) {
        this.Patterns = Patterns;
    }

    public SparseCheckoutConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparseCheckoutConfig(SparseCheckoutConfig source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.ConeMode != null) {
            this.ConeMode = new Boolean(source.ConeMode);
        }
        if (source.Patterns != null) {
            this.Patterns = new String[source.Patterns.length];
            for (int i = 0; i < source.Patterns.length; i++) {
                this.Patterns[i] = new String(source.Patterns[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "ConeMode", this.ConeMode);
        this.setParamArraySimple(map, prefix + "Patterns.", this.Patterns);

    }
}

