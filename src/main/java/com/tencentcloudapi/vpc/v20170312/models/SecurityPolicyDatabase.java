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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityPolicyDatabase extends AbstractModel {

    /**
    * Local IP range
    */
    @SerializedName("LocalCidrBlock")
    @Expose
    private String LocalCidrBlock;

    /**
    * Opposite IP range
    */
    @SerializedName("RemoteCidrBlock")
    @Expose
    private String [] RemoteCidrBlock;

    /**
     * Get Local IP range 
     * @return LocalCidrBlock Local IP range
     */
    public String getLocalCidrBlock() {
        return this.LocalCidrBlock;
    }

    /**
     * Set Local IP range
     * @param LocalCidrBlock Local IP range
     */
    public void setLocalCidrBlock(String LocalCidrBlock) {
        this.LocalCidrBlock = LocalCidrBlock;
    }

    /**
     * Get Opposite IP range 
     * @return RemoteCidrBlock Opposite IP range
     */
    public String [] getRemoteCidrBlock() {
        return this.RemoteCidrBlock;
    }

    /**
     * Set Opposite IP range
     * @param RemoteCidrBlock Opposite IP range
     */
    public void setRemoteCidrBlock(String [] RemoteCidrBlock) {
        this.RemoteCidrBlock = RemoteCidrBlock;
    }

    public SecurityPolicyDatabase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityPolicyDatabase(SecurityPolicyDatabase source) {
        if (source.LocalCidrBlock != null) {
            this.LocalCidrBlock = new String(source.LocalCidrBlock);
        }
        if (source.RemoteCidrBlock != null) {
            this.RemoteCidrBlock = new String[source.RemoteCidrBlock.length];
            for (int i = 0; i < source.RemoteCidrBlock.length; i++) {
                this.RemoteCidrBlock[i] = new String(source.RemoteCidrBlock[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalCidrBlock", this.LocalCidrBlock);
        this.setParamArraySimple(map, prefix + "RemoteCidrBlock.", this.RemoteCidrBlock);

    }
}

