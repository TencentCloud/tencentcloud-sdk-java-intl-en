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

public class UnderstandImageConfig extends AbstractModel {

    /**
    * <p>Image understanding model</p><p>Enumeration value:</p><ul><li>WAND-understand-1.0-lite: Lightweight understanding model</li><li>WAND-understand-1.0-flash: Quality-speed balanced understanding model</li><li>WAND-understand-1.0-pro: High-quality understanding model</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>Image understanding directive</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
     * Get <p>Image understanding model</p><p>Enumeration value:</p><ul><li>WAND-understand-1.0-lite: Lightweight understanding model</li><li>WAND-understand-1.0-flash: Quality-speed balanced understanding model</li><li>WAND-understand-1.0-pro: High-quality understanding model</li></ul> 
     * @return Model <p>Image understanding model</p><p>Enumeration value:</p><ul><li>WAND-understand-1.0-lite: Lightweight understanding model</li><li>WAND-understand-1.0-flash: Quality-speed balanced understanding model</li><li>WAND-understand-1.0-pro: High-quality understanding model</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>Image understanding model</p><p>Enumeration value:</p><ul><li>WAND-understand-1.0-lite: Lightweight understanding model</li><li>WAND-understand-1.0-flash: Quality-speed balanced understanding model</li><li>WAND-understand-1.0-pro: High-quality understanding model</li></ul>
     * @param Model <p>Image understanding model</p><p>Enumeration value:</p><ul><li>WAND-understand-1.0-lite: Lightweight understanding model</li><li>WAND-understand-1.0-flash: Quality-speed balanced understanding model</li><li>WAND-understand-1.0-pro: High-quality understanding model</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>Image understanding directive</p> 
     * @return Prompt <p>Image understanding directive</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Image understanding directive</p>
     * @param Prompt <p>Image understanding directive</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    public UnderstandImageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnderstandImageConfig(UnderstandImageConfig source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);

    }
}

