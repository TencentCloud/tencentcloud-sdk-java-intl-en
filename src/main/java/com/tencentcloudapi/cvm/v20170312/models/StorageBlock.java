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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageBlock extends AbstractModel {

    /**
    * HDD LOCAL storage type specifies the value: LOCAL_PRO.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Specifies the minimum HDD local storage capacity. measurement unit: GiB.
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * Specifies the maximum capacity of HDD local storage. measurement unit: GiB.
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
     * Get HDD LOCAL storage type specifies the value: LOCAL_PRO. 
     * @return Type HDD LOCAL storage type specifies the value: LOCAL_PRO.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set HDD LOCAL storage type specifies the value: LOCAL_PRO.
     * @param Type HDD LOCAL storage type specifies the value: LOCAL_PRO.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Specifies the minimum HDD local storage capacity. measurement unit: GiB. 
     * @return MinSize Specifies the minimum HDD local storage capacity. measurement unit: GiB.
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set Specifies the minimum HDD local storage capacity. measurement unit: GiB.
     * @param MinSize Specifies the minimum HDD local storage capacity. measurement unit: GiB.
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get Specifies the maximum capacity of HDD local storage. measurement unit: GiB. 
     * @return MaxSize Specifies the maximum capacity of HDD local storage. measurement unit: GiB.
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Specifies the maximum capacity of HDD local storage. measurement unit: GiB.
     * @param MaxSize Specifies the maximum capacity of HDD local storage. measurement unit: GiB.
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    public StorageBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageBlock(StorageBlock source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

