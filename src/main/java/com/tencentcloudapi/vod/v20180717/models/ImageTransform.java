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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageTransform extends AbstractModel{

    /**
    * Type. Valid values:
<li> Rotate: image rotation.</li>
<li> Flip: image flipping.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Rotation angle of image with its center point as origin. Value range: 0-360. This parameter is valid if `Type` is `Rotate`.
    */
    @SerializedName("RotateAngle")
    @Expose
    private Float RotateAngle;

    /**
    * Image flipping action. Valid values:
<li>Horizental: horizontal flipping, i.e., horizontally mirrored.</li>
<li>Vertical: vertical flipping, i.e., vertically mirrored.</li>
This is valid if `Type` is `Flip`.
    */
    @SerializedName("Flip")
    @Expose
    private String Flip;

    /**
     * Get Type. Valid values:
<li> Rotate: image rotation.</li>
<li> Flip: image flipping.</li> 
     * @return Type Type. Valid values:
<li> Rotate: image rotation.</li>
<li> Flip: image flipping.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type. Valid values:
<li> Rotate: image rotation.</li>
<li> Flip: image flipping.</li>
     * @param Type Type. Valid values:
<li> Rotate: image rotation.</li>
<li> Flip: image flipping.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Rotation angle of image with its center point as origin. Value range: 0-360. This parameter is valid if `Type` is `Rotate`. 
     * @return RotateAngle Rotation angle of image with its center point as origin. Value range: 0-360. This parameter is valid if `Type` is `Rotate`.
     */
    public Float getRotateAngle() {
        return this.RotateAngle;
    }

    /**
     * Set Rotation angle of image with its center point as origin. Value range: 0-360. This parameter is valid if `Type` is `Rotate`.
     * @param RotateAngle Rotation angle of image with its center point as origin. Value range: 0-360. This parameter is valid if `Type` is `Rotate`.
     */
    public void setRotateAngle(Float RotateAngle) {
        this.RotateAngle = RotateAngle;
    }

    /**
     * Get Image flipping action. Valid values:
<li>Horizental: horizontal flipping, i.e., horizontally mirrored.</li>
<li>Vertical: vertical flipping, i.e., vertically mirrored.</li>
This is valid if `Type` is `Flip`. 
     * @return Flip Image flipping action. Valid values:
<li>Horizental: horizontal flipping, i.e., horizontally mirrored.</li>
<li>Vertical: vertical flipping, i.e., vertically mirrored.</li>
This is valid if `Type` is `Flip`.
     */
    public String getFlip() {
        return this.Flip;
    }

    /**
     * Set Image flipping action. Valid values:
<li>Horizental: horizontal flipping, i.e., horizontally mirrored.</li>
<li>Vertical: vertical flipping, i.e., vertically mirrored.</li>
This is valid if `Type` is `Flip`.
     * @param Flip Image flipping action. Valid values:
<li>Horizental: horizontal flipping, i.e., horizontally mirrored.</li>
<li>Vertical: vertical flipping, i.e., vertically mirrored.</li>
This is valid if `Type` is `Flip`.
     */
    public void setFlip(String Flip) {
        this.Flip = Flip;
    }

    public ImageTransform() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageTransform(ImageTransform source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RotateAngle != null) {
            this.RotateAngle = new Float(source.RotateAngle);
        }
        if (source.Flip != null) {
            this.Flip = new String(source.Flip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RotateAngle", this.RotateAngle);
        this.setParamSimple(map, prefix + "Flip", this.Flip);

    }
}

