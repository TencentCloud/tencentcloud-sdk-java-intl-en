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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BeautyFilterItem extends AbstractModel {

    /**
    * <p>Whether to enable filters.</p><p>Enumeration value:</p><ul><li>ON: On</li><li>OFF: Off</li></ul>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>Filter item.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Filter strength.</p>
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get <p>Whether to enable filters.</p><p>Enumeration value:</p><ul><li>ON: On</li><li>OFF: Off</li></ul> 
     * @return Switch <p>Whether to enable filters.</p><p>Enumeration value:</p><ul><li>ON: On</li><li>OFF: Off</li></ul>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Whether to enable filters.</p><p>Enumeration value:</p><ul><li>ON: On</li><li>OFF: Off</li></ul>
     * @param Switch <p>Whether to enable filters.</p><p>Enumeration value:</p><ul><li>ON: On</li><li>OFF: Off</li></ul>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>Filter item.</p> 
     * @return Type <p>Filter item.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Filter item.</p>
     * @param Type <p>Filter item.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Filter strength.</p> 
     * @return Value <p>Filter strength.</p>
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set <p>Filter strength.</p>
     * @param Value <p>Filter strength.</p>
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public BeautyFilterItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BeautyFilterItem(BeautyFilterItem source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

