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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttackSourceEdge extends AbstractModel {

    /**
    * Starting node
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Target node
    */
    @SerializedName("To")
    @Expose
    private String To;

    /**
     * Get Starting node 
     * @return From Starting node
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Starting node
     * @param From Starting node
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Target node 
     * @return To Target node
     */
    public String getTo() {
        return this.To;
    }

    /**
     * Set Target node
     * @param To Target node
     */
    public void setTo(String To) {
        this.To = To;
    }

    public AttackSourceEdge() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttackSourceEdge(AttackSourceEdge source) {
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.To != null) {
            this.To = new String(source.To);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);

    }
}

