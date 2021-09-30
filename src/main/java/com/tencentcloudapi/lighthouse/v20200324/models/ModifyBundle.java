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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBundle extends AbstractModel{

    /**
    * Price difference that you need to pay for the new instance package after change.
    */
    @SerializedName("ModifyPrice")
    @Expose
    private Price ModifyPrice;

    /**
    * Package change status. Valid values:
<li>SOLD_OUT: packages are sold out</li>
<li>AVAILABLE: packages can be changed</li>
<li>UNAVAILABLE: packages cannot be changed currently</li>
    */
    @SerializedName("ModifyBundleState")
    @Expose
    private String ModifyBundleState;

    /**
    * Package information.
    */
    @SerializedName("Bundle")
    @Expose
    private Bundle Bundle;

    /**
     * Get Price difference that you need to pay for the new instance package after change. 
     * @return ModifyPrice Price difference that you need to pay for the new instance package after change.
     */
    public Price getModifyPrice() {
        return this.ModifyPrice;
    }

    /**
     * Set Price difference that you need to pay for the new instance package after change.
     * @param ModifyPrice Price difference that you need to pay for the new instance package after change.
     */
    public void setModifyPrice(Price ModifyPrice) {
        this.ModifyPrice = ModifyPrice;
    }

    /**
     * Get Package change status. Valid values:
<li>SOLD_OUT: packages are sold out</li>
<li>AVAILABLE: packages can be changed</li>
<li>UNAVAILABLE: packages cannot be changed currently</li> 
     * @return ModifyBundleState Package change status. Valid values:
<li>SOLD_OUT: packages are sold out</li>
<li>AVAILABLE: packages can be changed</li>
<li>UNAVAILABLE: packages cannot be changed currently</li>
     */
    public String getModifyBundleState() {
        return this.ModifyBundleState;
    }

    /**
     * Set Package change status. Valid values:
<li>SOLD_OUT: packages are sold out</li>
<li>AVAILABLE: packages can be changed</li>
<li>UNAVAILABLE: packages cannot be changed currently</li>
     * @param ModifyBundleState Package change status. Valid values:
<li>SOLD_OUT: packages are sold out</li>
<li>AVAILABLE: packages can be changed</li>
<li>UNAVAILABLE: packages cannot be changed currently</li>
     */
    public void setModifyBundleState(String ModifyBundleState) {
        this.ModifyBundleState = ModifyBundleState;
    }

    /**
     * Get Package information. 
     * @return Bundle Package information.
     */
    public Bundle getBundle() {
        return this.Bundle;
    }

    /**
     * Set Package information.
     * @param Bundle Package information.
     */
    public void setBundle(Bundle Bundle) {
        this.Bundle = Bundle;
    }

    public ModifyBundle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBundle(ModifyBundle source) {
        if (source.ModifyPrice != null) {
            this.ModifyPrice = new Price(source.ModifyPrice);
        }
        if (source.ModifyBundleState != null) {
            this.ModifyBundleState = new String(source.ModifyBundleState);
        }
        if (source.Bundle != null) {
            this.Bundle = new Bundle(source.Bundle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ModifyPrice.", this.ModifyPrice);
        this.setParamSimple(map, prefix + "ModifyBundleState", this.ModifyBundleState);
        this.setParamObj(map, prefix + "Bundle.", this.Bundle);

    }
}

