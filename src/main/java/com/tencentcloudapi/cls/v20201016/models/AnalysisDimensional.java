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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalysisDimensional extends AbstractModel{

    /**
    * Analysis name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Analysis type. Valid values: `query`, `field`
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Analysis content
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get Analysis name 
     * @return Name Analysis name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Analysis name
     * @param Name Analysis name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Analysis type. Valid values: `query`, `field` 
     * @return Type Analysis type. Valid values: `query`, `field`
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Analysis type. Valid values: `query`, `field`
     * @param Type Analysis type. Valid values: `query`, `field`
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Analysis content 
     * @return Content Analysis content
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Analysis content
     * @param Content Analysis content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public AnalysisDimensional() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalysisDimensional(AnalysisDimensional source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

