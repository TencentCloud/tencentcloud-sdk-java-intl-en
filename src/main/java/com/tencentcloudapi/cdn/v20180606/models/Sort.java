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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Sort extends AbstractModel{

    /**
    * Fields that can be sorted. Currently supports:
`createTime`: domain name creation time.
`certExpireTime`: certificate expiration time.
Default value: createTime.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * `asc` or `desc`. Default: `desc`.
    */
    @SerializedName("Sequence")
    @Expose
    private String Sequence;

    /**
     * Get Fields that can be sorted. Currently supports:
`createTime`: domain name creation time.
`certExpireTime`: certificate expiration time.
Default value: createTime. 
     * @return Key Fields that can be sorted. Currently supports:
`createTime`: domain name creation time.
`certExpireTime`: certificate expiration time.
Default value: createTime.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Fields that can be sorted. Currently supports:
`createTime`: domain name creation time.
`certExpireTime`: certificate expiration time.
Default value: createTime.
     * @param Key Fields that can be sorted. Currently supports:
`createTime`: domain name creation time.
`certExpireTime`: certificate expiration time.
Default value: createTime.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get `asc` or `desc`. Default: `desc`. 
     * @return Sequence `asc` or `desc`. Default: `desc`.
     */
    public String getSequence() {
        return this.Sequence;
    }

    /**
     * Set `asc` or `desc`. Default: `desc`.
     * @param Sequence `asc` or `desc`. Default: `desc`.
     */
    public void setSequence(String Sequence) {
        this.Sequence = Sequence;
    }

    public Sort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Sort(Sort source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Sequence != null) {
            this.Sequence = new String(source.Sequence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);

    }
}

