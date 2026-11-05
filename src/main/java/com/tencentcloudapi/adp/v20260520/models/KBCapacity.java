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

public class KBCapacity extends AbstractModel {

    /**
    * <p>Maximum number of characters</p>
    */
    @SerializedName("MaxCharSize")
    @Expose
    private String MaxCharSize;

    /**
    * <p>Number of excess characters</p>
    */
    @SerializedName("OverCharSize")
    @Expose
    private String OverCharSize;

    /**
    * <p>Used number of characters</p>
    */
    @SerializedName("UsedCharSize")
    @Expose
    private String UsedCharSize;

    /**
     * Get <p>Maximum number of characters</p> 
     * @return MaxCharSize <p>Maximum number of characters</p>
     */
    public String getMaxCharSize() {
        return this.MaxCharSize;
    }

    /**
     * Set <p>Maximum number of characters</p>
     * @param MaxCharSize <p>Maximum number of characters</p>
     */
    public void setMaxCharSize(String MaxCharSize) {
        this.MaxCharSize = MaxCharSize;
    }

    /**
     * Get <p>Number of excess characters</p> 
     * @return OverCharSize <p>Number of excess characters</p>
     */
    public String getOverCharSize() {
        return this.OverCharSize;
    }

    /**
     * Set <p>Number of excess characters</p>
     * @param OverCharSize <p>Number of excess characters</p>
     */
    public void setOverCharSize(String OverCharSize) {
        this.OverCharSize = OverCharSize;
    }

    /**
     * Get <p>Used number of characters</p> 
     * @return UsedCharSize <p>Used number of characters</p>
     */
    public String getUsedCharSize() {
        return this.UsedCharSize;
    }

    /**
     * Set <p>Used number of characters</p>
     * @param UsedCharSize <p>Used number of characters</p>
     */
    public void setUsedCharSize(String UsedCharSize) {
        this.UsedCharSize = UsedCharSize;
    }

    public KBCapacity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBCapacity(KBCapacity source) {
        if (source.MaxCharSize != null) {
            this.MaxCharSize = new String(source.MaxCharSize);
        }
        if (source.OverCharSize != null) {
            this.OverCharSize = new String(source.OverCharSize);
        }
        if (source.UsedCharSize != null) {
            this.UsedCharSize = new String(source.UsedCharSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxCharSize", this.MaxCharSize);
        this.setParamSimple(map, prefix + "OverCharSize", this.OverCharSize);
        this.setParamSimple(map, prefix + "UsedCharSize", this.UsedCharSize);

    }
}

