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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExpirationPolicy extends AbstractModel {

    /**
    * <p>Validity time</p>
    */
    @SerializedName("EffectivePeriod")
    @Expose
    private EffectivePeriod EffectivePeriod;

    /**
    * <p>Behavior after the validity period expires: 1=NOT_RETRIEVABLE cannot be retrieved, 2=RETRIEVABLE can still be retrieved; meaningless for permanent validity<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>EXPIRE_BEHAVIOR_UNKNOWN</td><td>0</td><td>Unspecified (server uses the default process)</td></tr><tr><td>EXPIRE_BEHAVIOR_NOT_RETRIEVABLE</td><td>1</td><td>Cannot be retrieved (removed upon expiration)</td></tr><tr><td>EXPIRE_BEHAVIOR_RETRIEVABLE</td><td>2</td><td>Can still be retrieved (not removed upon expiration, only the validity period is tagged)</td></tr></tbody></table></p>
    */
    @SerializedName("ExpireBehavior")
    @Expose
    private Long ExpireBehavior;

    /**
     * Get <p>Validity time</p> 
     * @return EffectivePeriod <p>Validity time</p>
     */
    public EffectivePeriod getEffectivePeriod() {
        return this.EffectivePeriod;
    }

    /**
     * Set <p>Validity time</p>
     * @param EffectivePeriod <p>Validity time</p>
     */
    public void setEffectivePeriod(EffectivePeriod EffectivePeriod) {
        this.EffectivePeriod = EffectivePeriod;
    }

    /**
     * Get <p>Behavior after the validity period expires: 1=NOT_RETRIEVABLE cannot be retrieved, 2=RETRIEVABLE can still be retrieved; meaningless for permanent validity<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>EXPIRE_BEHAVIOR_UNKNOWN</td><td>0</td><td>Unspecified (server uses the default process)</td></tr><tr><td>EXPIRE_BEHAVIOR_NOT_RETRIEVABLE</td><td>1</td><td>Cannot be retrieved (removed upon expiration)</td></tr><tr><td>EXPIRE_BEHAVIOR_RETRIEVABLE</td><td>2</td><td>Can still be retrieved (not removed upon expiration, only the validity period is tagged)</td></tr></tbody></table></p> 
     * @return ExpireBehavior <p>Behavior after the validity period expires: 1=NOT_RETRIEVABLE cannot be retrieved, 2=RETRIEVABLE can still be retrieved; meaningless for permanent validity<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>EXPIRE_BEHAVIOR_UNKNOWN</td><td>0</td><td>Unspecified (server uses the default process)</td></tr><tr><td>EXPIRE_BEHAVIOR_NOT_RETRIEVABLE</td><td>1</td><td>Cannot be retrieved (removed upon expiration)</td></tr><tr><td>EXPIRE_BEHAVIOR_RETRIEVABLE</td><td>2</td><td>Can still be retrieved (not removed upon expiration, only the validity period is tagged)</td></tr></tbody></table></p>
     */
    public Long getExpireBehavior() {
        return this.ExpireBehavior;
    }

    /**
     * Set <p>Behavior after the validity period expires: 1=NOT_RETRIEVABLE cannot be retrieved, 2=RETRIEVABLE can still be retrieved; meaningless for permanent validity<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>EXPIRE_BEHAVIOR_UNKNOWN</td><td>0</td><td>Unspecified (server uses the default process)</td></tr><tr><td>EXPIRE_BEHAVIOR_NOT_RETRIEVABLE</td><td>1</td><td>Cannot be retrieved (removed upon expiration)</td></tr><tr><td>EXPIRE_BEHAVIOR_RETRIEVABLE</td><td>2</td><td>Can still be retrieved (not removed upon expiration, only the validity period is tagged)</td></tr></tbody></table></p>
     * @param ExpireBehavior <p>Behavior after the validity period expires: 1=NOT_RETRIEVABLE cannot be retrieved, 2=RETRIEVABLE can still be retrieved; meaningless for permanent validity<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>EXPIRE_BEHAVIOR_UNKNOWN</td><td>0</td><td>Unspecified (server uses the default process)</td></tr><tr><td>EXPIRE_BEHAVIOR_NOT_RETRIEVABLE</td><td>1</td><td>Cannot be retrieved (removed upon expiration)</td></tr><tr><td>EXPIRE_BEHAVIOR_RETRIEVABLE</td><td>2</td><td>Can still be retrieved (not removed upon expiration, only the validity period is tagged)</td></tr></tbody></table></p>
     */
    public void setExpireBehavior(Long ExpireBehavior) {
        this.ExpireBehavior = ExpireBehavior;
    }

    public ExpirationPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpirationPolicy(ExpirationPolicy source) {
        if (source.EffectivePeriod != null) {
            this.EffectivePeriod = new EffectivePeriod(source.EffectivePeriod);
        }
        if (source.ExpireBehavior != null) {
            this.ExpireBehavior = new Long(source.ExpireBehavior);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EffectivePeriod.", this.EffectivePeriod);
        this.setParamSimple(map, prefix + "ExpireBehavior", this.ExpireBehavior);

    }
}

