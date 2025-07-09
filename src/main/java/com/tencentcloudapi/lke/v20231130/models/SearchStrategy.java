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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchStrategy extends AbstractModel {

    /**
    * Retrieval strategy type, 0: hybrid retrieval; 1: semantic retrieval.
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * Excel retrieval enhancement switch.
    */
    @SerializedName("TableEnhancement")
    @Expose
    private Boolean TableEnhancement;

    /**
     * Get Retrieval strategy type, 0: hybrid retrieval; 1: semantic retrieval. 
     * @return StrategyType Retrieval strategy type, 0: hybrid retrieval; 1: semantic retrieval.
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set Retrieval strategy type, 0: hybrid retrieval; 1: semantic retrieval.
     * @param StrategyType Retrieval strategy type, 0: hybrid retrieval; 1: semantic retrieval.
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get Excel retrieval enhancement switch. 
     * @return TableEnhancement Excel retrieval enhancement switch.
     */
    public Boolean getTableEnhancement() {
        return this.TableEnhancement;
    }

    /**
     * Set Excel retrieval enhancement switch.
     * @param TableEnhancement Excel retrieval enhancement switch.
     */
    public void setTableEnhancement(Boolean TableEnhancement) {
        this.TableEnhancement = TableEnhancement;
    }

    public SearchStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchStrategy(SearchStrategy source) {
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.TableEnhancement != null) {
            this.TableEnhancement = new Boolean(source.TableEnhancement);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "TableEnhancement", this.TableEnhancement);

    }
}

