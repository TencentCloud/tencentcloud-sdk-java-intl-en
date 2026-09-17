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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeliverRule extends AbstractModel {

    /**
    * <p>Data delivery range.</p><p>Enumeration values:</p><ul><li>1: History + newly added data</li><li>2: Custom time range</li><li>3: New additions only</li></ul><p>This time, only 3 newly added data is supported. Subsequent support: 2 custom time range and 1 history + newly added data</p>
    */
    @SerializedName("DataScope")
    @Expose
    private Long DataScope;

    /**
     * Get <p>Data delivery range.</p><p>Enumeration values:</p><ul><li>1: History + newly added data</li><li>2: Custom time range</li><li>3: New additions only</li></ul><p>This time, only 3 newly added data is supported. Subsequent support: 2 custom time range and 1 history + newly added data</p> 
     * @return DataScope <p>Data delivery range.</p><p>Enumeration values:</p><ul><li>1: History + newly added data</li><li>2: Custom time range</li><li>3: New additions only</li></ul><p>This time, only 3 newly added data is supported. Subsequent support: 2 custom time range and 1 history + newly added data</p>
     */
    public Long getDataScope() {
        return this.DataScope;
    }

    /**
     * Set <p>Data delivery range.</p><p>Enumeration values:</p><ul><li>1: History + newly added data</li><li>2: Custom time range</li><li>3: New additions only</li></ul><p>This time, only 3 newly added data is supported. Subsequent support: 2 custom time range and 1 history + newly added data</p>
     * @param DataScope <p>Data delivery range.</p><p>Enumeration values:</p><ul><li>1: History + newly added data</li><li>2: Custom time range</li><li>3: New additions only</li></ul><p>This time, only 3 newly added data is supported. Subsequent support: 2 custom time range and 1 history + newly added data</p>
     */
    public void setDataScope(Long DataScope) {
        this.DataScope = DataScope;
    }

    public DeliverRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliverRule(DeliverRule source) {
        if (source.DataScope != null) {
            this.DataScope = new Long(source.DataScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataScope", this.DataScope);

    }
}

