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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonFailItem extends AbstractModel {

    /**
    * <p>uin or groupId</p>
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * <p>Error information.</p>
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
     * Get <p>uin or groupId</p> 
     * @return Item <p>uin or groupId</p>
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * Set <p>uin or groupId</p>
     * @param Item <p>uin or groupId</p>
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * Get <p>Error information.</p> 
     * @return FailReason <p>Error information.</p>
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set <p>Error information.</p>
     * @param FailReason <p>Error information.</p>
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    public CommonFailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonFailItem(CommonFailItem source) {
        if (source.Item != null) {
            this.Item = new String(source.Item);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Item", this.Item);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);

    }
}

