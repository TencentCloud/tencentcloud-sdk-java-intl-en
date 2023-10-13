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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeStyles extends AbstractModel{

    /**
    * The style ID, which identifies an element style.
Note: The style ID can be up to 32 characters long and can contain letters, digits, and special characters -_
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * The type. Valid values:
<li>`Subtitle`: The subtitle style. </li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The subtitle style details. This parameter is valid if `Type` is `Subtitle`.
    */
    @SerializedName("Subtitle")
    @Expose
    private ComposeSubtitleStyle Subtitle;

    /**
     * Get The style ID, which identifies an element style.
Note: The style ID can be up to 32 characters long and can contain letters, digits, and special characters -_ 
     * @return Id The style ID, which identifies an element style.
Note: The style ID can be up to 32 characters long and can contain letters, digits, and special characters -_
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set The style ID, which identifies an element style.
Note: The style ID can be up to 32 characters long and can contain letters, digits, and special characters -_
     * @param Id The style ID, which identifies an element style.
Note: The style ID can be up to 32 characters long and can contain letters, digits, and special characters -_
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get The type. Valid values:
<li>`Subtitle`: The subtitle style. </li> 
     * @return Type The type. Valid values:
<li>`Subtitle`: The subtitle style. </li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The type. Valid values:
<li>`Subtitle`: The subtitle style. </li>
     * @param Type The type. Valid values:
<li>`Subtitle`: The subtitle style. </li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The subtitle style details. This parameter is valid if `Type` is `Subtitle`. 
     * @return Subtitle The subtitle style details. This parameter is valid if `Type` is `Subtitle`.
     */
    public ComposeSubtitleStyle getSubtitle() {
        return this.Subtitle;
    }

    /**
     * Set The subtitle style details. This parameter is valid if `Type` is `Subtitle`.
     * @param Subtitle The subtitle style details. This parameter is valid if `Type` is `Subtitle`.
     */
    public void setSubtitle(ComposeSubtitleStyle Subtitle) {
        this.Subtitle = Subtitle;
    }

    public ComposeStyles() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeStyles(ComposeStyles source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Subtitle != null) {
            this.Subtitle = new ComposeSubtitleStyle(source.Subtitle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Subtitle.", this.Subtitle);

    }
}

