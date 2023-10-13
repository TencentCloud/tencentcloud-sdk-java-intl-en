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

public class ComposeImageOperation extends AbstractModel{

    /**
    * The type. Valid values:
u200c<li>`Rotate`: Image rotation. </li>
<li>`Flip`: Image flipping. </li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * This is valid if `Type` is `Rotate`. The angle of rotation around the image center. Value range: 0–360.
    */
    @SerializedName("RotateAngle")
    @Expose
    private Float RotateAngle;

    /**
    * This is valid if `Type` is `Flip`. How to flip the image. Valid values:xa0
u200c<li>`Horizental`: Flip horizontally. </li>
<li>`Vertical`: Flip vertically. </li>
    */
    @SerializedName("FlipType")
    @Expose
    private String FlipType;

    /**
     * Get The type. Valid values:
u200c<li>`Rotate`: Image rotation. </li>
<li>`Flip`: Image flipping. </li> 
     * @return Type The type. Valid values:
u200c<li>`Rotate`: Image rotation. </li>
<li>`Flip`: Image flipping. </li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The type. Valid values:
u200c<li>`Rotate`: Image rotation. </li>
<li>`Flip`: Image flipping. </li>
     * @param Type The type. Valid values:
u200c<li>`Rotate`: Image rotation. </li>
<li>`Flip`: Image flipping. </li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get This is valid if `Type` is `Rotate`. The angle of rotation around the image center. Value range: 0–360. 
     * @return RotateAngle This is valid if `Type` is `Rotate`. The angle of rotation around the image center. Value range: 0–360.
     */
    public Float getRotateAngle() {
        return this.RotateAngle;
    }

    /**
     * Set This is valid if `Type` is `Rotate`. The angle of rotation around the image center. Value range: 0–360.
     * @param RotateAngle This is valid if `Type` is `Rotate`. The angle of rotation around the image center. Value range: 0–360.
     */
    public void setRotateAngle(Float RotateAngle) {
        this.RotateAngle = RotateAngle;
    }

    /**
     * Get This is valid if `Type` is `Flip`. How to flip the image. Valid values:xa0
u200c<li>`Horizental`: Flip horizontally. </li>
<li>`Vertical`: Flip vertically. </li> 
     * @return FlipType This is valid if `Type` is `Flip`. How to flip the image. Valid values:xa0
u200c<li>`Horizental`: Flip horizontally. </li>
<li>`Vertical`: Flip vertically. </li>
     */
    public String getFlipType() {
        return this.FlipType;
    }

    /**
     * Set This is valid if `Type` is `Flip`. How to flip the image. Valid values:xa0
u200c<li>`Horizental`: Flip horizontally. </li>
<li>`Vertical`: Flip vertically. </li>
     * @param FlipType This is valid if `Type` is `Flip`. How to flip the image. Valid values:xa0
u200c<li>`Horizental`: Flip horizontally. </li>
<li>`Vertical`: Flip vertically. </li>
     */
    public void setFlipType(String FlipType) {
        this.FlipType = FlipType;
    }

    public ComposeImageOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeImageOperation(ComposeImageOperation source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RotateAngle != null) {
            this.RotateAngle = new Float(source.RotateAngle);
        }
        if (source.FlipType != null) {
            this.FlipType = new String(source.FlipType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RotateAngle", this.RotateAngle);
        this.setParamSimple(map, prefix + "FlipType", this.FlipType);

    }
}

