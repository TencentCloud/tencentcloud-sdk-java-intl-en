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

public class BeautyEffectItem extends AbstractModel {

    /**
    * <p>Whether to enable beauty effects.</p><p>Enumeration value:</p><ul><li>ON: On</li><li>OFF: Off</li></ul>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>Beauty option.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Intensity of beauty effects.</p>
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * <p>Attach the resource path.</p>
    */
    @SerializedName("ResourcePath")
    @Expose
    private String ResourcePath;

    /**
    * <p>Additional information.</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p>Whether to enable beauty effects.</p><p>Enumeration value:</p><ul><li>ON: On</li><li>OFF: Off</li></ul> 
     * @return Switch <p>Whether to enable beauty effects.</p><p>Enumeration value:</p><ul><li>ON: On</li><li>OFF: Off</li></ul>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Whether to enable beauty effects.</p><p>Enumeration value:</p><ul><li>ON: On</li><li>OFF: Off</li></ul>
     * @param Switch <p>Whether to enable beauty effects.</p><p>Enumeration value:</p><ul><li>ON: On</li><li>OFF: Off</li></ul>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>Beauty option.</p> 
     * @return Type <p>Beauty option.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Beauty option.</p>
     * @param Type <p>Beauty option.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Intensity of beauty effects.</p> 
     * @return Value <p>Intensity of beauty effects.</p>
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set <p>Intensity of beauty effects.</p>
     * @param Value <p>Intensity of beauty effects.</p>
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get <p>Attach the resource path.</p> 
     * @return ResourcePath <p>Attach the resource path.</p>
     */
    public String getResourcePath() {
        return this.ResourcePath;
    }

    /**
     * Set <p>Attach the resource path.</p>
     * @param ResourcePath <p>Attach the resource path.</p>
     */
    public void setResourcePath(String ResourcePath) {
        this.ResourcePath = ResourcePath;
    }

    /**
     * Get <p>Additional information.</p> 
     * @return ExtInfo <p>Additional information.</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>Additional information.</p>
     * @param ExtInfo <p>Additional information.</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public BeautyEffectItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BeautyEffectItem(BeautyEffectItem source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.ResourcePath != null) {
            this.ResourcePath = new String(source.ResourcePath);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ResourcePath", this.ResourcePath);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

