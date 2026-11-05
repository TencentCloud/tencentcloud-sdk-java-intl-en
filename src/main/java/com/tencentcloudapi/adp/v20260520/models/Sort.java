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

public class Sort extends AbstractModel {

    /**
    * <p>Sort field name, for example, create_time</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Sorting order. 1: ascending, 2: descending</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SORT_ORDER_INVALID</td><td>0</td><td>invalid</td></tr><tr><td>SORT_ORDER_ASC</td><td>1</td><td>ascending</td></tr><tr><td>SORT_ORDER_DESC</td><td>2</td><td>descending</td></tr></tbody></table>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get <p>Sort field name, for example, create_time</p> 
     * @return Name <p>Sort field name, for example, create_time</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Sort field name, for example, create_time</p>
     * @param Name <p>Sort field name, for example, create_time</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Sorting order. 1: ascending, 2: descending</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SORT_ORDER_INVALID</td><td>0</td><td>invalid</td></tr><tr><td>SORT_ORDER_ASC</td><td>1</td><td>ascending</td></tr><tr><td>SORT_ORDER_DESC</td><td>2</td><td>descending</td></tr></tbody></table> 
     * @return Direction <p>Sorting order. 1: ascending, 2: descending</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SORT_ORDER_INVALID</td><td>0</td><td>invalid</td></tr><tr><td>SORT_ORDER_ASC</td><td>1</td><td>ascending</td></tr><tr><td>SORT_ORDER_DESC</td><td>2</td><td>descending</td></tr></tbody></table>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>Sorting order. 1: ascending, 2: descending</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SORT_ORDER_INVALID</td><td>0</td><td>invalid</td></tr><tr><td>SORT_ORDER_ASC</td><td>1</td><td>ascending</td></tr><tr><td>SORT_ORDER_DESC</td><td>2</td><td>descending</td></tr></tbody></table>
     * @param Direction <p>Sorting order. 1: ascending, 2: descending</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>SORT_ORDER_INVALID</td><td>0</td><td>invalid</td></tr><tr><td>SORT_ORDER_ASC</td><td>1</td><td>ascending</td></tr><tr><td>SORT_ORDER_DESC</td><td>2</td><td>descending</td></tr></tbody></table>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public Sort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Sort(Sort source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

