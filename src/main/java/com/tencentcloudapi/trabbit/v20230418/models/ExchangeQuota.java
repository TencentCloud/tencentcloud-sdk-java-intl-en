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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExchangeQuota extends AbstractModel {

    /**
    * Specifies the maximum number of exchanges that can be created.
    */
    @SerializedName("MaxExchange")
    @Expose
    private Long MaxExchange;

    /**
    * Specifies the number of exchanges that have been created.
    */
    @SerializedName("UsedExchange")
    @Expose
    private Long UsedExchange;

    /**
     * Get Specifies the maximum number of exchanges that can be created. 
     * @return MaxExchange Specifies the maximum number of exchanges that can be created.
     */
    public Long getMaxExchange() {
        return this.MaxExchange;
    }

    /**
     * Set Specifies the maximum number of exchanges that can be created.
     * @param MaxExchange Specifies the maximum number of exchanges that can be created.
     */
    public void setMaxExchange(Long MaxExchange) {
        this.MaxExchange = MaxExchange;
    }

    /**
     * Get Specifies the number of exchanges that have been created. 
     * @return UsedExchange Specifies the number of exchanges that have been created.
     */
    public Long getUsedExchange() {
        return this.UsedExchange;
    }

    /**
     * Set Specifies the number of exchanges that have been created.
     * @param UsedExchange Specifies the number of exchanges that have been created.
     */
    public void setUsedExchange(Long UsedExchange) {
        this.UsedExchange = UsedExchange;
    }

    public ExchangeQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExchangeQuota(ExchangeQuota source) {
        if (source.MaxExchange != null) {
            this.MaxExchange = new Long(source.MaxExchange);
        }
        if (source.UsedExchange != null) {
            this.UsedExchange = new Long(source.UsedExchange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxExchange", this.MaxExchange);
        this.setParamSimple(map, prefix + "UsedExchange", this.UsedExchange);

    }
}

