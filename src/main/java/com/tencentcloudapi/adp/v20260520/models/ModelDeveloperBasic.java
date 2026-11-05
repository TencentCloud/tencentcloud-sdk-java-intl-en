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

public class ModelDeveloperBasic extends AbstractModel {

    /**
    * <p>Author alias.</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>Author flag</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>Author alias.</p> 
     * @return Alias <p>Author alias.</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>Author alias.</p>
     * @param Alias <p>Author alias.</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>Author flag</p> 
     * @return Name <p>Author flag</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Author flag</p>
     * @param Name <p>Author flag</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ModelDeveloperBasic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelDeveloperBasic(ModelDeveloperBasic source) {
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

