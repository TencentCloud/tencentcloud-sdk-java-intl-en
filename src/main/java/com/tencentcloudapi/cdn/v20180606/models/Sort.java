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
    * Sorting field, which currently supports:
createTime, domain name creation time.
certExpireTime, certificate expiration time.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * asc/desc, which is desc by default.
    */
    @SerializedName("Sequence")
    @Expose
    private String Sequence;

    /**
     * Get Sorting field, which currently supports:
createTime, domain name creation time.
certExpireTime, certificate expiration time. 
     * @return Key Sorting field, which currently supports:
createTime, domain name creation time.
certExpireTime, certificate expiration time.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Sorting field, which currently supports:
createTime, domain name creation time.
certExpireTime, certificate expiration time.
     * @param Key Sorting field, which currently supports:
createTime, domain name creation time.
certExpireTime, certificate expiration time.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get asc/desc, which is desc by default. 
     * @return Sequence asc/desc, which is desc by default.
     */
    public String getSequence() {
        return this.Sequence;
    }

    /**
     * Set asc/desc, which is desc by default.
     * @param Sequence asc/desc, which is desc by default.
     */
    public void setSequence(String Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);

    }
}

