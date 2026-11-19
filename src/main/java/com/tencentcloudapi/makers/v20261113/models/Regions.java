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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Regions extends AbstractModel {

    /**
    * <p>Chinese mainland</p>
    */
    @SerializedName("Mainland")
    @Expose
    private String [] Mainland;

    /**
    * <p>Overseas region</p>
    */
    @SerializedName("Overseas")
    @Expose
    private String [] Overseas;

    /**
     * Get <p>Chinese mainland</p> 
     * @return Mainland <p>Chinese mainland</p>
     */
    public String [] getMainland() {
        return this.Mainland;
    }

    /**
     * Set <p>Chinese mainland</p>
     * @param Mainland <p>Chinese mainland</p>
     */
    public void setMainland(String [] Mainland) {
        this.Mainland = Mainland;
    }

    /**
     * Get <p>Overseas region</p> 
     * @return Overseas <p>Overseas region</p>
     */
    public String [] getOverseas() {
        return this.Overseas;
    }

    /**
     * Set <p>Overseas region</p>
     * @param Overseas <p>Overseas region</p>
     */
    public void setOverseas(String [] Overseas) {
        this.Overseas = Overseas;
    }

    public Regions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Regions(Regions source) {
        if (source.Mainland != null) {
            this.Mainland = new String[source.Mainland.length];
            for (int i = 0; i < source.Mainland.length; i++) {
                this.Mainland[i] = new String(source.Mainland[i]);
            }
        }
        if (source.Overseas != null) {
            this.Overseas = new String[source.Overseas.length];
            for (int i = 0; i < source.Overseas.length; i++) {
                this.Overseas[i] = new String(source.Overseas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Mainland.", this.Mainland);
        this.setParamArraySimple(map, prefix + "Overseas.", this.Overseas);

    }
}

