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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Eye extends AbstractModel{

    /**
    * Whether glasses are worn.
The `Type` values of the `AttributeItem` include: 0: no glasses; 1: general glasses; 2: sunglasses.
    */
    @SerializedName("Glass")
    @Expose
    private AttributeItem Glass;

    /**
    * Whether the eyes are open.
The `Type` values of the `AttributeItem` include: 0: open; 1: closed.
    */
    @SerializedName("EyeOpen")
    @Expose
    private AttributeItem EyeOpen;

    /**
    * Whether the person has double eyelids.
The `Type` values of the `AttributeItem` include: 0: no; 1: yes.
    */
    @SerializedName("EyelidType")
    @Expose
    private AttributeItem EyelidType;

    /**
    * Eye size.
The `Type` values of the `AttributeItem` include: 0: small eyes; 1: general eyes; 2: big eyes.
    */
    @SerializedName("EyeSize")
    @Expose
    private AttributeItem EyeSize;

    /**
     * Get Whether glasses are worn.
The `Type` values of the `AttributeItem` include: 0: no glasses; 1: general glasses; 2: sunglasses. 
     * @return Glass Whether glasses are worn.
The `Type` values of the `AttributeItem` include: 0: no glasses; 1: general glasses; 2: sunglasses.
     */
    public AttributeItem getGlass() {
        return this.Glass;
    }

    /**
     * Set Whether glasses are worn.
The `Type` values of the `AttributeItem` include: 0: no glasses; 1: general glasses; 2: sunglasses.
     * @param Glass Whether glasses are worn.
The `Type` values of the `AttributeItem` include: 0: no glasses; 1: general glasses; 2: sunglasses.
     */
    public void setGlass(AttributeItem Glass) {
        this.Glass = Glass;
    }

    /**
     * Get Whether the eyes are open.
The `Type` values of the `AttributeItem` include: 0: open; 1: closed. 
     * @return EyeOpen Whether the eyes are open.
The `Type` values of the `AttributeItem` include: 0: open; 1: closed.
     */
    public AttributeItem getEyeOpen() {
        return this.EyeOpen;
    }

    /**
     * Set Whether the eyes are open.
The `Type` values of the `AttributeItem` include: 0: open; 1: closed.
     * @param EyeOpen Whether the eyes are open.
The `Type` values of the `AttributeItem` include: 0: open; 1: closed.
     */
    public void setEyeOpen(AttributeItem EyeOpen) {
        this.EyeOpen = EyeOpen;
    }

    /**
     * Get Whether the person has double eyelids.
The `Type` values of the `AttributeItem` include: 0: no; 1: yes. 
     * @return EyelidType Whether the person has double eyelids.
The `Type` values of the `AttributeItem` include: 0: no; 1: yes.
     */
    public AttributeItem getEyelidType() {
        return this.EyelidType;
    }

    /**
     * Set Whether the person has double eyelids.
The `Type` values of the `AttributeItem` include: 0: no; 1: yes.
     * @param EyelidType Whether the person has double eyelids.
The `Type` values of the `AttributeItem` include: 0: no; 1: yes.
     */
    public void setEyelidType(AttributeItem EyelidType) {
        this.EyelidType = EyelidType;
    }

    /**
     * Get Eye size.
The `Type` values of the `AttributeItem` include: 0: small eyes; 1: general eyes; 2: big eyes. 
     * @return EyeSize Eye size.
The `Type` values of the `AttributeItem` include: 0: small eyes; 1: general eyes; 2: big eyes.
     */
    public AttributeItem getEyeSize() {
        return this.EyeSize;
    }

    /**
     * Set Eye size.
The `Type` values of the `AttributeItem` include: 0: small eyes; 1: general eyes; 2: big eyes.
     * @param EyeSize Eye size.
The `Type` values of the `AttributeItem` include: 0: small eyes; 1: general eyes; 2: big eyes.
     */
    public void setEyeSize(AttributeItem EyeSize) {
        this.EyeSize = EyeSize;
    }

    public Eye() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Eye(Eye source) {
        if (source.Glass != null) {
            this.Glass = new AttributeItem(source.Glass);
        }
        if (source.EyeOpen != null) {
            this.EyeOpen = new AttributeItem(source.EyeOpen);
        }
        if (source.EyelidType != null) {
            this.EyelidType = new AttributeItem(source.EyelidType);
        }
        if (source.EyeSize != null) {
            this.EyeSize = new AttributeItem(source.EyeSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Glass.", this.Glass);
        this.setParamObj(map, prefix + "EyeOpen.", this.EyeOpen);
        this.setParamObj(map, prefix + "EyelidType.", this.EyelidType);
        this.setParamObj(map, prefix + "EyeSize.", this.EyeSize);

    }
}

