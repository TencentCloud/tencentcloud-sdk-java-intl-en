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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisPreKeySpaceData extends AbstractModel {

    /**
    * Average element length
    */
    @SerializedName("AveElementSize")
    @Expose
    private Long AveElementSize;

    /**
    * Total memory usage in bytes
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * Key prefix
    */
    @SerializedName("KeyPreIndex")
    @Expose
    private String KeyPreIndex;

    /**
    * The number of elements
    */
    @SerializedName("ItemCount")
    @Expose
    private Long ItemCount;

    /**
    * The number of keys
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * The max element length
    */
    @SerializedName("MaxElementSize")
    @Expose
    private Long MaxElementSize;

    /**
     * Get Average element length 
     * @return AveElementSize Average element length
     */
    public Long getAveElementSize() {
        return this.AveElementSize;
    }

    /**
     * Set Average element length
     * @param AveElementSize Average element length
     */
    public void setAveElementSize(Long AveElementSize) {
        this.AveElementSize = AveElementSize;
    }

    /**
     * Get Total memory usage in bytes 
     * @return Length Total memory usage in bytes
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set Total memory usage in bytes
     * @param Length Total memory usage in bytes
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get Key prefix 
     * @return KeyPreIndex Key prefix
     */
    public String getKeyPreIndex() {
        return this.KeyPreIndex;
    }

    /**
     * Set Key prefix
     * @param KeyPreIndex Key prefix
     */
    public void setKeyPreIndex(String KeyPreIndex) {
        this.KeyPreIndex = KeyPreIndex;
    }

    /**
     * Get The number of elements 
     * @return ItemCount The number of elements
     */
    public Long getItemCount() {
        return this.ItemCount;
    }

    /**
     * Set The number of elements
     * @param ItemCount The number of elements
     */
    public void setItemCount(Long ItemCount) {
        this.ItemCount = ItemCount;
    }

    /**
     * Get The number of keys 
     * @return Count The number of keys
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set The number of keys
     * @param Count The number of keys
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get The max element length 
     * @return MaxElementSize The max element length
     */
    public Long getMaxElementSize() {
        return this.MaxElementSize;
    }

    /**
     * Set The max element length
     * @param MaxElementSize The max element length
     */
    public void setMaxElementSize(Long MaxElementSize) {
        this.MaxElementSize = MaxElementSize;
    }

    public RedisPreKeySpaceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisPreKeySpaceData(RedisPreKeySpaceData source) {
        if (source.AveElementSize != null) {
            this.AveElementSize = new Long(source.AveElementSize);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.KeyPreIndex != null) {
            this.KeyPreIndex = new String(source.KeyPreIndex);
        }
        if (source.ItemCount != null) {
            this.ItemCount = new Long(source.ItemCount);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.MaxElementSize != null) {
            this.MaxElementSize = new Long(source.MaxElementSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AveElementSize", this.AveElementSize);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "KeyPreIndex", this.KeyPreIndex);
        this.setParamSimple(map, prefix + "ItemCount", this.ItemCount);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "MaxElementSize", this.MaxElementSize);

    }
}

