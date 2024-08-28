/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class WebHookHostLabel extends AbstractModel {

    /**
    * Host Range [1: Project |2: Tencent Cloud Tag | 3: Host Security Tag | 4: Optional] Empty array means all.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Host Project or Tag Content
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Host Range [1: Project |2: Tencent Cloud Tag | 3: Host Security Tag | 4: Optional] Empty array means all. 
     * @return Type Host Range [1: Project |2: Tencent Cloud Tag | 3: Host Security Tag | 4: Optional] Empty array means all.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Host Range [1: Project |2: Tencent Cloud Tag | 3: Host Security Tag | 4: Optional] Empty array means all.
     * @param Type Host Range [1: Project |2: Tencent Cloud Tag | 3: Host Security Tag | 4: Optional] Empty array means all.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Host Project or Tag Content 
     * @return Values Host Project or Tag Content
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Host Project or Tag Content
     * @param Values Host Project or Tag Content
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public WebHookHostLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebHookHostLabel(WebHookHostLabel source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

