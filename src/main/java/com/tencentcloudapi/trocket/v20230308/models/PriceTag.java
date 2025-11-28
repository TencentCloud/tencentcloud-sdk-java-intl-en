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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PriceTag extends AbstractModel {

    /**
    * Price name. Enumeration values: tps: basic price of TPS; stepTps: TPS step size.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Step size corresponding to the billing item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Step")
    @Expose
    private Long Step;

    /**
     * Get Price name. Enumeration values: tps: basic price of TPS; stepTps: TPS step size. 
     * @return Name Price name. Enumeration values: tps: basic price of TPS; stepTps: TPS step size.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Price name. Enumeration values: tps: basic price of TPS; stepTps: TPS step size.
     * @param Name Price name. Enumeration values: tps: basic price of TPS; stepTps: TPS step size.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Step size corresponding to the billing item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Step Step size corresponding to the billing item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStep() {
        return this.Step;
    }

    /**
     * Set Step size corresponding to the billing item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Step Step size corresponding to the billing item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStep(Long Step) {
        this.Step = Step;
    }

    public PriceTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PriceTag(PriceTag source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Step != null) {
            this.Step = new Long(source.Step);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Step", this.Step);

    }
}

