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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Hair extends AbstractModel {

    /**
    * Hair length information.
The `Type` values of the `AttributeItem` include: 0: bald, 1: short hair, 2: medium hair, 3: long hair, 4: braid.
    */
    @SerializedName("Length")
    @Expose
    private AttributeItem Length;

    /**
    * Bang information.
The `Type` values of the `AttributeItem` include: 0: no bang; 1: bang detected.
    */
    @SerializedName("Bang")
    @Expose
    private AttributeItem Bang;

    /**
    * Hair color information.
The `Type` values of the `AttributeItem` include: 0: black; 1: golden; 2: brown; 3: gray.
    */
    @SerializedName("Color")
    @Expose
    private AttributeItem Color;

    /**
     * Get Hair length information.
The `Type` values of the `AttributeItem` include: 0: bald, 1: short hair, 2: medium hair, 3: long hair, 4: braid. 
     * @return Length Hair length information.
The `Type` values of the `AttributeItem` include: 0: bald, 1: short hair, 2: medium hair, 3: long hair, 4: braid.
     */
    public AttributeItem getLength() {
        return this.Length;
    }

    /**
     * Set Hair length information.
The `Type` values of the `AttributeItem` include: 0: bald, 1: short hair, 2: medium hair, 3: long hair, 4: braid.
     * @param Length Hair length information.
The `Type` values of the `AttributeItem` include: 0: bald, 1: short hair, 2: medium hair, 3: long hair, 4: braid.
     */
    public void setLength(AttributeItem Length) {
        this.Length = Length;
    }

    /**
     * Get Bang information.
The `Type` values of the `AttributeItem` include: 0: no bang; 1: bang detected. 
     * @return Bang Bang information.
The `Type` values of the `AttributeItem` include: 0: no bang; 1: bang detected.
     */
    public AttributeItem getBang() {
        return this.Bang;
    }

    /**
     * Set Bang information.
The `Type` values of the `AttributeItem` include: 0: no bang; 1: bang detected.
     * @param Bang Bang information.
The `Type` values of the `AttributeItem` include: 0: no bang; 1: bang detected.
     */
    public void setBang(AttributeItem Bang) {
        this.Bang = Bang;
    }

    /**
     * Get Hair color information.
The `Type` values of the `AttributeItem` include: 0: black; 1: golden; 2: brown; 3: gray. 
     * @return Color Hair color information.
The `Type` values of the `AttributeItem` include: 0: black; 1: golden; 2: brown; 3: gray.
     */
    public AttributeItem getColor() {
        return this.Color;
    }

    /**
     * Set Hair color information.
The `Type` values of the `AttributeItem` include: 0: black; 1: golden; 2: brown; 3: gray.
     * @param Color Hair color information.
The `Type` values of the `AttributeItem` include: 0: black; 1: golden; 2: brown; 3: gray.
     */
    public void setColor(AttributeItem Color) {
        this.Color = Color;
    }

    public Hair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Hair(Hair source) {
        if (source.Length != null) {
            this.Length = new AttributeItem(source.Length);
        }
        if (source.Bang != null) {
            this.Bang = new AttributeItem(source.Bang);
        }
        if (source.Color != null) {
            this.Color = new AttributeItem(source.Color);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Length.", this.Length);
        this.setParamObj(map, prefix + "Bang.", this.Bang);
        this.setParamObj(map, prefix + "Color.", this.Color);

    }
}

