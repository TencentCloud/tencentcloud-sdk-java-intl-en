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

public class Eyebrow extends AbstractModel {

    /**
    * Eyebrow thickness.
The `Type` values of the `AttributeItem` include: 0: light; 1: thick.
    */
    @SerializedName("EyebrowDensity")
    @Expose
    private AttributeItem EyebrowDensity;

    /**
    * Eyebrow curve.
The `Type` values of the `AttributeItem` include: 0: flat; 1: curved.
    */
    @SerializedName("EyebrowCurve")
    @Expose
    private AttributeItem EyebrowCurve;

    /**
    * Eyebrow length.
The `Type` values of the `AttributeItem` include: 0: short; 1: long.
    */
    @SerializedName("EyebrowLength")
    @Expose
    private AttributeItem EyebrowLength;

    /**
     * Get Eyebrow thickness.
The `Type` values of the `AttributeItem` include: 0: light; 1: thick. 
     * @return EyebrowDensity Eyebrow thickness.
The `Type` values of the `AttributeItem` include: 0: light; 1: thick.
     */
    public AttributeItem getEyebrowDensity() {
        return this.EyebrowDensity;
    }

    /**
     * Set Eyebrow thickness.
The `Type` values of the `AttributeItem` include: 0: light; 1: thick.
     * @param EyebrowDensity Eyebrow thickness.
The `Type` values of the `AttributeItem` include: 0: light; 1: thick.
     */
    public void setEyebrowDensity(AttributeItem EyebrowDensity) {
        this.EyebrowDensity = EyebrowDensity;
    }

    /**
     * Get Eyebrow curve.
The `Type` values of the `AttributeItem` include: 0: flat; 1: curved. 
     * @return EyebrowCurve Eyebrow curve.
The `Type` values of the `AttributeItem` include: 0: flat; 1: curved.
     */
    public AttributeItem getEyebrowCurve() {
        return this.EyebrowCurve;
    }

    /**
     * Set Eyebrow curve.
The `Type` values of the `AttributeItem` include: 0: flat; 1: curved.
     * @param EyebrowCurve Eyebrow curve.
The `Type` values of the `AttributeItem` include: 0: flat; 1: curved.
     */
    public void setEyebrowCurve(AttributeItem EyebrowCurve) {
        this.EyebrowCurve = EyebrowCurve;
    }

    /**
     * Get Eyebrow length.
The `Type` values of the `AttributeItem` include: 0: short; 1: long. 
     * @return EyebrowLength Eyebrow length.
The `Type` values of the `AttributeItem` include: 0: short; 1: long.
     */
    public AttributeItem getEyebrowLength() {
        return this.EyebrowLength;
    }

    /**
     * Set Eyebrow length.
The `Type` values of the `AttributeItem` include: 0: short; 1: long.
     * @param EyebrowLength Eyebrow length.
The `Type` values of the `AttributeItem` include: 0: short; 1: long.
     */
    public void setEyebrowLength(AttributeItem EyebrowLength) {
        this.EyebrowLength = EyebrowLength;
    }

    public Eyebrow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Eyebrow(Eyebrow source) {
        if (source.EyebrowDensity != null) {
            this.EyebrowDensity = new AttributeItem(source.EyebrowDensity);
        }
        if (source.EyebrowCurve != null) {
            this.EyebrowCurve = new AttributeItem(source.EyebrowCurve);
        }
        if (source.EyebrowLength != null) {
            this.EyebrowLength = new AttributeItem(source.EyebrowLength);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EyebrowDensity.", this.EyebrowDensity);
        this.setParamObj(map, prefix + "EyebrowCurve.", this.EyebrowCurve);
        this.setParamObj(map, prefix + "EyebrowLength.", this.EyebrowLength);

    }
}

